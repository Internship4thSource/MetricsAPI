package com.metrics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class proactive {
	private Boolean looked_for_help;
	private Boolean provided_help;
	private Boolean worked_ahead;
	private Boolean shared_resources;
}