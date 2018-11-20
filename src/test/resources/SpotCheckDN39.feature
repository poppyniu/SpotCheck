Feature: Spot check automation for DN39

  @DN39 @android
  Scenario Outline: Spot check automation for DN39
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type> on <udid> on <port>
    And Choose <country> as login country on <platform>
    And Input <name> and <password> and click login button
    And Open app and click into dn39 clean page on <platform>
    And Test clean module for dn39 and check result on <platform>
    And Test charge module for dn39 and check result on <platform>
    And Test error module for dn39 and check result on <platform>
    And Test senior mode module for dn39 and check result on <platform>
    And Test clean power module for dn39 and check result on <platform>
    And Test water amount module for dn39 and check result on <platform>
    And Test continue sweep module for dn39 and check result on <platform>
    And Test no disturb module for dn39 and check result on <platform>
    And Test clean schedule module for dn39 and check result on <platform>
    And Test reset map module for dn39 and check result on <platform>
    And Test clean log module for dn39 and check result on <platform>
    And Test consumables module for dn39 and check result on <platform>
    And Test deebot voice module for dn39 and check result on <platform>
    And Test rename module for dn39 and check result on <platform>
    And Test use help module for dn39 and check result on <platform>
    And Test deebot info module for dn39 and check result on <platform>
    And Test look for deebot module for dn39 on <platform>
    And Tear down for mobile driver
    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |udid|port|
      | android  | 中国      | 19900001100 | 123456 | dn39 |84B7N15A20002666|4725|
#      | ios  | 中国      | 19900001100 | 123456 | dn39 |1291e24e38090c86966e07b5bd6299c74b80be31\4725|
