Feature: Spot check automation for DR930

  @SpotCheck
  Scenario Outline: Spot check automation for DR930
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type>
    And Choose <country> as login country on <platform>
    And Input <name> and <password> and click login button
    And Open app and click into deebot clean page on <platform>
    And Test clean module and check result on <platform>
    And Test error module and check result on <platform>
    And Test clean power module and check result on <platform>
    And Test water amount module and check result on <platform>
    And Test continue sweep module and check result on <platform>
    And Test no disturb module and check result on <platform>
    And Test clean schedule module and check result on <platform>
    And Test reset map module and check result on <platform>
    And Test clean log module and check result on <platform>
    And Test consumables module and check result on <platform>
    And Test deebot voice module and check result on <platform>
    And Test rename module and check result on <platform>
    And Test use help module and check result on <platform>
    And Test deebot info module and check result on <platform>
    And Test look for deebot module on <platform>
    And Tear down for mobile driver
    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |
      | android  | 中国      | 13402516615 | 111111 | dr930 |
      | ios  | 中国      | 13402516615 | 111111 | dr930 |
