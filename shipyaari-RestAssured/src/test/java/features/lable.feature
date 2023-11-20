Feature: label 

Scenario Outline: label fetch API "<labelType>"
  Given select the label type "<labelType>"
  When user call with HTTPS post request 
  Then the API call getting sucessful response 200 ok 
  And save the label URL in in pdf 
  Then validate the pdf data with given data 

  Examples:
  | labelType | labelPdf |
  | 9         |          |