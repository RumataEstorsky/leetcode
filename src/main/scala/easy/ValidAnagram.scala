package easy

/**
 * Created by rumata on 8/3/15.
 */
object ValidAnagram {

  def isAnagram(s: String, t: String) = (s diff t).isEmpty

}
