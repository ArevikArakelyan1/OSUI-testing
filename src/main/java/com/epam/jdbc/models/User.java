package com.epam.jdbc.models;

public class User {
 private int id;
 private String name;
 private String surname;
 private String professionName;
 private String courseCount;
 private String userImgPath;
 private String roleType;
 private String company;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getSurname() {
  return surname;
 }

 public void setSurname(String surname) {
  this.surname = surname;
 }

 public String getProfessionName() {
  return professionName;
 }

 public void setProfessionName(String professionName) {
  this.professionName = professionName;
 }

 public String getCourseCount() {
  return courseCount;
 }

 public void setCourseCount(String courseCount) {
  this.courseCount = courseCount;
 }

 public String getUserImgPath() {
  return userImgPath;
 }

 public void setUserImgPath(String userImgPath) {
  this.userImgPath = userImgPath;
 }

 public String getRoleType() {
  return roleType;
 }

 public void setRoleType(String roleType) {
  this.roleType = roleType;
 }

 public String getCompany() {
  return company;
 }

 public void setCompany(String company) {
  this.company = company;
 }
}
