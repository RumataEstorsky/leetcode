package easy

import org.scalatest.FunSuite
import ValidAnagram.isAnagram
/**
  * https://leetcode.com/problems/valid-anagram/
  *
  * Given two strings s and t, write a function to determine if t is an anagram of s.
  **
  *For example,
  *s = "anagram", t = "nagaram", return true.
  *s = "rat", t = "car", return false.
  **
  *Note:
  *You may assume the string contains only lowercase alphabets.
  **
  *Follow up:
*What if the inputs contain unicode characters? How would you adapt your solution to such case?
  *
 *
  */
class ValidAnagramSuite  extends FunSuite {

  test("Anagram from 'anagram' must be 'nagaram'") {
    assert(isAnagram( "anagram",  "nagaram") == true)
  }

  test("Anagram from 'rat' must be 'car'") {
    assert(isAnagram("rat", "car") == false)
  }
}
