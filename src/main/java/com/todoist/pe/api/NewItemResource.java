package com.todoist.pe.api;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
public class NewItemResource {

    @NotBlank
    private String description;

}
