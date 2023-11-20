Feature: label fetch API

Scenario Outline: label fetch API "<labelType>"
  Given select the label type "<labelType>"
  When user calls getlabel_avn with POST http request
  Then the API call is successful with status code 200
  And "status" in response is "success"
  And save the label URL in "<labelPdf>"
  Then validate the label PDF and multi-labels

Examples:
  | labelType | labelPdf |
  | 1         |          |
  | 2         |          |
  | 3         |          |
  | 4         |          |
  | 5         |          |
  | 6         |          |
  | 7         |          |
  | 8         |          |
  | 9         |          |
  | 10        |          |
