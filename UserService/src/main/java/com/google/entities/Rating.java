package com.google.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
	
	private Integer ratingId;
	private Integer userId;
	private Integer hoteId;
	private int rating;
	private String feedback;
}
