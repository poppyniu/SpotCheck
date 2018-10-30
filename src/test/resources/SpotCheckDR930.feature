Feature: Spot check automation for DR930

  @SpotCheck
  Scenario Outline: Spot check automation for DR930
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform>
    And Choose <country> as login country on <platform>
    And Input <Email> and <Password> and click login button
    And Open app and click into deebot clean page on <platform>
    And Start to do clean job and check result on <platform>
    And Tear down for mobile driver
    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |
      | android  | 中国      | 13402516615 | 12345678 | dr930 |
