package com.rishitha.myjobapp.review;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllreviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping ("/reviews")
    public ResponseEntity<String> addReviews(@PathVariable Long companyId,
                                             @RequestBody Review review){

        boolean isReviewedSaved = reviewService.addReview(companyId,review);
        if(isReviewedSaved)
            return new ResponseEntity<>("Review Added Successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("Review Not Saved",HttpStatus.NOT_FOUND);

    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReview(@PathVariable Long companyId,@PathVariable Long reviewId){
        return new ResponseEntity<>(reviewService.getReview(companyId,reviewId),HttpStatus.OK);
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId,
                                               @PathVariable Long reviewId,
                                               @RequestBody Review review){

        boolean isreviewUpdated = reviewService.updateReview(companyId,reviewId,review);
        if(isreviewUpdated)
            return new ResponseEntity<>("Review Updated successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("Review not Updated",HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("reviews/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long companyId,
                                               @PathVariable Long reviewId
                                               ){
        boolean isreviewDeleted = reviewService.deleteReview(companyId,reviewId);
        if(isreviewDeleted)
            return new ResponseEntity<>("Review Deleted successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("Review not Deleted",HttpStatus.NOT_FOUND);
    }


}
