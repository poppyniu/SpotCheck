Feature: Spot check automation for DN33

  @DN33
  Scenario Outline: Spot check automation for DN33
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type>
#    And Choose <country> as login country on <platform>
#    And Input <name> and <password> and click login button
    And Open app and click into dn33 clean page on <platform>
#    And Test clean module and check result on <platform>
#    And Test charge module and check result on <platform>
    And Test error module for dn33 and check result on <platform>
    And Test senior mode module for dn33 and check result on <platform>
    And Test clean power module for dn33 and check result on <platform>
    And Test water amount module for dn33 and check result on <platform>
    And Test continue sweep module for dn33 and check result on <platform>
    And Test no disturb module for dn33 and check result on <platform>
    And Test clean schedule module for dn33 and check result on <platform>
    And Test reset map module for dn33 and check result on <platform>
    And Test clean log module for dn33 and check result on <platform>
    And Test consumables module for dn33 and check result on <platform>
    And Test deebot voice module for dn33 and check result on <platform>
    And Test rename module for dn33 and check result on <platform>
#    And Test use help module for dn33 and check result on <platform>
    And Test deebot info module for dn33 and check result on <platform>
    And Test look for deebot module for dn33 on <platform>
    And Tear down for mobile driver
#    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |
      | android  | 中国      | 19900001100 | 123456 | dn33 |
#      | ios  | 中国      | 19900001100 | 123456 | dn33 |
