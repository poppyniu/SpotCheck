Feature: Spot check automation for dw700

  @SpotCheckDW700
  Scenario Outline: Spot check automation for dw700
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type>
    And Open app and click into dw700 page on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name> and <password> and click login button in <country>
    And Deebot start to do clean job and check result on <platform>
#    And Deebot start to do error and check result on <platform>
    And Deebot start to add modify delete clean schedule and check result on <platform>
    And Deebot start to get work log and check result on <platform>
    And Deebot start to reset consumables and check result on <platform>
    And Tear down for mobile driver
    Examples:
      | platform | country | name        | password       | type  |
      | android  | 中国      | 15259562596 | zxw15259562596 | dw700|
#      | ios  | 中国      | 15259562596 | zxw15259562596 | dw700|
