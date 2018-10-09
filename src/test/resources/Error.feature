Feature: test all the error interface on dw700

  @error
  Scenario Outline: test all the error interface on dw700
    Given Set up testing environment on <platform>
    And Open app and click into dw700 page on <platform>
#    And Choose <country> as login country on <platform>
#    And Input <name> and <password> and click login button in <country>
    And Request deebot send <error1> udp message to mobile
    And Check <error1> appears on <platform> mobile
    And Request deebot send <error2> udp message to mobile
    And Check <error2> appears on <platform> mobile
    And Request deebot send <error3> udp message to mobile
    And Check <error3> appears on <platform> mobile
    And Request deebot send <error4> udp message to mobile
    And Check <error4> appears on <platform> mobile
    And Request deebot send <error5> udp message to mobile
    And Check <error5> appears on <platform> mobile
    And Request deebot send <error6> udp message to mobile
    And Check <error6> appears on <platform> mobile
    And Request deebot send <error7> udp message to mobile
    And Check <error7> appears on <platform> mobile
    And Request deebot send <error8> udp message to mobile
    And Check <error8> appears on <platform> mobile
    And Request deebot send <error9> udp message to mobile
    And Check <error9> appears on <platform> mobile
    And Request deebot send <error10> udp message to mobile
    And Check <error10> appears on <platform> mobile
    And Request deebot send <error11> udp message to mobile
    And Check <error11> appears on <platform> mobile
    And Request deebot send <error12> udp message to mobile
    And Check <error12> appears on <platform> mobile
    And Tear down for mobile driver
    Examples:
      | platform | country | name        | password | error1 | error2 | error3 | error4 | error5 | error6 | error7 | error8 | error9 | error10 | error11 | error12 |
      | android  | 中国      | 18616915369 | 665258   | 100    | 101    | 102    | 103    | 104    | 105    | 106    | 107    | 108    | 109     | 110     | 111     |
