Feature: Spot check automation for DN55

  @SpotCheckDN55
  Scenario Outline: Spot check automation for DN55
    Given Start simulator for deebot <type>
    And Set up testing environment on <platform> for deebot <type>
#    And Choose <country> as login country on <platform>
#    And Input <Email> and <Password> and click login button
    And Open app and click into DN55 clean page on <platform>
    And Open app and click into do clean job on <platform>
    And Open app and click into do more job on <platform>
    And Open app and click into error page translate job on <platform>
#    And Tear down for mobile driver
#    Then Tear down for simulator
    Examples:
      | platform | country | name        | password | type  |
      | android  | 中国      | 825794516@qq.com | zxw15259562596 | dn55 |
#      | ios  | 中国      | 825794516@qq.com | zxw15259562596 | dn55 |
