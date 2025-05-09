package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IBM2 {

//    Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.
//    A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00", and "192.168@1.1" are invalid IPv4 addresses.
//    A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:
//            1 <= xi.length <= 4
//    xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
//    Leading zeros are allowed in xi.
//    For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.
//
//    Example 1:
//    Input: queryIP = "172.16.254.1"
//    Output: "IPv4"
//    Explanation: This is a valid IPv4 address, return "IPv4".
//    Example 2:
//    Input: queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
//    Output: "IPv6"
//    Explanation: This is a valid IPv6 address, return "IPv6".
//    Example 3:,N
//    Input: queryIP = "256.256.256.256"
//    Output: "Neither"
//    Explanation: This is neither a IPv4 address nor a IPv6 address.


    // Method to validate the IP address
    public String validIPAddress(String val) {

        // Check for IPv4
        if (val.contains(".")) {
            List<String> valInput = Arrays.stream(val.split("\\.")).collect(Collectors.toList());
            // IPv4 should have exactly 4 parts
            if (valInput.size() == 4) {
                for (String part : valInput) {
                    // Check if part is a valid integer between 0 and 255 and doesn't have leading zeros
                    if (!isValidIPv4Part(part)) {
                        return "Neither";
                    }
                }
                return "IPv4";
            }
        }

        // Check for IPv6
        if (val.contains(":")) {
            List<String> valInputv6 = Arrays.stream(val.split(":")).collect(Collectors.toList());
            // IPv6 should have exactly 8 parts
            if (valInputv6.size() == 8) {
                for (String part : valInputv6) {
                    // Check if each part is a valid hexadecimal string of length 1 to 4
                    if (!isValidIPv6Part(part)) {
                        return "Neither";
                    }
                }
                return "IPv6";
            }
        }

        return "Neither";
    }

    // Helper function to validate IPv4 part
    private boolean isValidIPv4Part(String part) {
        if (part.length() == 0 || part.length() > 3) {
            return false;
        }
        try {
            int value = Integer.parseInt(part);
            // Check if the value is between 0 and 255 and doesn't have leading zeros unless it's "0"
            return value >= 0 && value <= 255 && (part.equals("0") || !part.startsWith("0"));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper function to validate IPv6 part
    private boolean isValidIPv6Part(String part) {
        if (part.length() < 1 || part.length() > 4) {
            return false;
        }
        // Check if the part contains only valid hexadecimal characters
        for (char c : part.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IBM2 ibm2 = new IBM2();

        // Test cases
        System.out.println(ibm2.validIPAddress("172.16.254.1"));  // Output: "IPv4"
        System.out.println(ibm2.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));  // Output: "IPv6"
        System.out.println(ibm2.validIPAddress("256.256.256.256"));  // Output: "Neither"
        System.out.println(ibm2.validIPAddress("192.168.01.1"));  // Output: "Neither"
        System.out.println(ibm2.validIPAddress("2001:db8:85a3::8A2E:037j:7334"));  // Output: "Neither"
    }
}
