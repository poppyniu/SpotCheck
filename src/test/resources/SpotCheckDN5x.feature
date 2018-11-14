Feature: Spot check automation for DN5x

  @DN5x
  Scenario Outline: Spot check automation for DN5x
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type>
#    And Choose <country> as login country on <platform>
#    And Input <name> and <password> and click login button
    And Open app and click into dn5x clean page on <platform>
#    And Test clean module and check result on <platform>
#    And Test charge module and check result on <platform>
#    And Test error module for dn5x and check result on <platform>
    And Test senior mode module for dn5x and check result on <platform>
    And Test clean power module for dn5x and check result on <platform>
    And Test water amount module for dn5x and check result on <platform>
    And Test carpet Pressurization module for dn5x and check result on <platform>
    And Test continue sweep module for dn5x and check result on <platform>
    And Test no disturb module for dn5x and check result on <platform>
    And Test clean schedule module for dn5x and check result on <platform>
    And Test reset map module for dn5x and check result on <platform>
    And Test clean log module for dn5x and check result on <platform>
    And Test consumables module for dn5x and check result on <platform>
    And Test deebot voice module for dn5x and check result on <platform>
    And Test rename module for dn5x and check result on <platform>
    And Test use help module for dn5x and check result on <platform>
    And Test deebot info module for dn5x and check result on <platform>
    And Test look for deebot module for dn5x on <platform>
    And Tear down for mobile driver
#    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |
      | android  | 中国      | 19900001102 | 123456 | dn5x |
#      | ios  | 中国      | 19900001102 | 123456 | dn5x |
