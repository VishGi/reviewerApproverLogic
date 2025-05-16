package com.postgressql.postgressDemo.dto;

public class ApproverReviewerDTO {
    private String approver;
    private String reviewer;

    public ApproverReviewerDTO(String approver, String reviewer) {
        this.approver = approver;
        this.reviewer = reviewer;
    }

    public String getReviewer() {
        return reviewer;
    }

    public String getApprover() {
        return approver;
    }


}
