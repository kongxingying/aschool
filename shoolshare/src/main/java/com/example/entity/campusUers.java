package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class campusUers implements Serializable {
   private int password;

   private String shoolId;

   private int integral;

   private int sex;
   private int passageNum;
}
