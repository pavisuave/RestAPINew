@tag
Feature:Verify the Get POst in the API
  
  @tag1
  Scenario Outline: Get all posts from the API
    Given Get call to "<url>"
      Then Response is "<statusCode>"

    Examples: 
      | url   | statusCode |
      | /getHeroes | 200    | 
