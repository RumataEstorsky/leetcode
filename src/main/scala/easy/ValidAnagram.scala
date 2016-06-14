package easy

// https://leetcode.com/problems/valid-anagram/
//


/**
 * Created by rumata on 8/3/15.
 */
class ValidAnagram {

  def isAnagram(s: String, t: String) = (s diff t).isEmpty

  def test = {
    assert(isAnagram( "anagram",  "nagaram") == true)
    assert(isAnagram( "rat",  "car") == false)
  }

}
