//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1667 : scala.Function1[List[Any], Any] = ((var_list$1798 : List[Any]) => {
val var_$1799 : Any = var_list$1798(0L.asInstanceOf[Int])
var_$1799
})
val var_max$1672 : scala.Function2[Long, Long, Long] = ((var_a$1800 : Long, var_b$1801 : Long) => {
val var_$1802 : Long = (if ((var_a$1800 > var_b$1801)) var_a$1800 else var_b$1801)
var_$1802
})
val var_min$1721 : scala.Function2[Long, Long, Long] = ((var_a$1807 : Long, var_b$1808 : Long) => {
val var_$1809 : Long = (if ((var_a$1807 < var_b$1808)) var_a$1807 else var_b$1808)
var_$1809
})
val var_$1771 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1817 : (Boolean, Boolean)) => {
val var_$1818 : Boolean = var_$1817._1
var_$1818
})
val var_$1776 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1819 : (Boolean, Boolean)) => {
val var_$1820 : Boolean = var_$1819._2
var_$1820
})
val var_$1684 : List[Long] = List[Long]()
val var_$1754 : (Boolean, Boolean) = (false, true)
val var_$1792 : (Boolean, Boolean) = (true, false)
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_event_error : Throwable = null
val var_event_unknown : Boolean = false
var set_var_event : scala.Function2[Long, Long, Unit] = null
var var_event_ts : Long = 0L
var var_event_changed : Boolean = false

out_final = null
out_value = null
set_var_event = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_event_changed))) {
var_event_ts = ts
var_event_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1692_changed : Boolean = false
var var_$1692_init : Boolean = false
var var_$1692_unknown : Boolean = false
var var_$1692_error : Throwable = null
var var_$1692_value : (Boolean, Boolean) = (false, false)
var var_$1635_changed : Boolean = false
var var_$1635_unknown : Boolean = false
var var_$1635_error : Throwable = null
var var_$1635_value : Boolean = false
var var_$1635_init : Boolean = false
val var_$1639_value : List[Long] = List[Long]()
val var_$1639_error : Throwable = null
val var_$1639_changed : Boolean = false
val var_$1639_unknown : Boolean = false
var var_LowerBoundX$1682_changed : Boolean = true
var var_LowerBoundX$1682_value : List[Long] = var_$1684
var var_LowerBoundX$1682_init : Boolean = true
var var_LowerBoundX$1682_error : Throwable = null
var var_LowerBoundX$1682_unknown : Boolean = false
var var_$1655_changed : Boolean = false
var var_$1655_init : Boolean = false
var var_$1655_unknown : Boolean = false
var var_$1655_error : Throwable = null
var var_$1655_value : List[Long] = List[Long]()
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : Long = 0L
var var_$1643_init : Boolean = false
val var_$1834_value : Long = 0L
val var_$1834_error : Throwable = null
val var_$1834_changed : Boolean = false
val var_$1834_unknown : Boolean = false
var var_$1713_changed : Boolean = true
var var_$1713_value : Long = 1L
var var_$1713_init : Boolean = true
var var_$1713_error : Throwable = null
var var_$1713_unknown : Boolean = false
var var_lowerBoundXNow$1653_changed : Boolean = false
var var_lowerBoundXNow$1653_unknown : Boolean = false
var var_lowerBoundXNow$1653_error : Throwable = null
var var_lowerBoundXNow$1653_value : Boolean = false
var var_lowerBoundXNow$1653_init : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1734_changed : Boolean = true
var var_$1734_value : Long = 0L
var var_$1734_init : Boolean = true
var var_$1734_error : Throwable = null
var var_$1734_unknown : Boolean = false
var var_lowerBoundXNow$1659_changed : Boolean = false
var var_lowerBoundXNow$1659_unknown : Boolean = false
var var_lowerBoundXNow$1659_error : Throwable = null
var var_lowerBoundXNow$1659_value : Long = 0L
var var_lowerBoundXNow$1659_init : Boolean = false
var var_$1664_changed : Boolean = false
var var_$1664_unknown : Boolean = false
var var_$1664_error : Throwable = null
var var_$1664_value : Long = 0L
var var_$1664_init : Boolean = false
var var_lowerBoundXNow$1663_changed : Boolean = false
var var_lowerBoundXNow$1663_unknown : Boolean = false
var var_lowerBoundXNow$1663_error : Throwable = null
var var_lowerBoundXNow$1663_value : Long = 0L
var var_lowerBoundXNow$1663_init : Boolean = false
var var_$1738_changed : Boolean = false
var var_$1738_unknown : Boolean = false
var var_$1738_error : Throwable = null
var var_$1738_value : Long = 0L
var var_$1738_init : Boolean = false
var var_$1722_changed : Boolean = true
var var_$1722_value : Long = 10L
var var_$1722_init : Boolean = true
var var_$1722_error : Throwable = null
var var_$1722_unknown : Boolean = false
var var_$1678_changed : Boolean = false
var var_$1678_unknown : Boolean = false
var var_$1678_error : Throwable = null
var var_$1678_value : Long = 0L
var var_$1678_init : Boolean = false
var var_$1648_changed : Boolean = false
var var_$1648_unknown : Boolean = false
var var_$1648_error : Throwable = null
var var_$1648_value : List[Long] = List[Long]()
var var_$1648_init : Boolean = false
var var_$1676_changed : Boolean = false
var var_$1676_init : Boolean = false
var var_$1676_unknown : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_value : List[Long] = List[Long]()
var var_$1675_changed : Boolean = false
var var_$1675_unknown : Boolean = false
var var_$1675_error : Throwable = null
var var_$1675_value : List[Long] = List[Long]()
var var_$1675_init : Boolean = false
var var_$1641_changed : Boolean = false
var var_$1641_unknown : Boolean = false
var var_$1641_error : Throwable = null
var var_$1641_value : List[Long] = List[Long]()
var var_$1641_init : Boolean = false
var var_LowerBoundX$1634_changed : Boolean = false
var var_LowerBoundX$1634_unknown : Boolean = false
var var_LowerBoundX$1634_error : Throwable = null
var var_LowerBoundX$1634_value : List[Long] = List[Long]()
var var_$1656_changed : Boolean = false
var var_$1656_lastValue : List[Long] = List[Long]()
var var_$1656_lastInit : Boolean = false
var var_$1656_lastError : Throwable = null
var var_$1656_init : Boolean = false
var var_$1656_ts : Long = 0L
var var_$1656_unknown : Boolean = false
var var_$1656_value : List[Long] = List[Long]()
var var_$1656_error : Throwable = null
var var_$1632_changed : Boolean = false
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : Long = 0L
var var_$1632_init : Boolean = false
var var_$1631_changed : Boolean = false
var var_$1631_unknown : Boolean = false
var var_$1631_error : Throwable = null
var var_$1631_value : Boolean = false
var var_$1631_init : Boolean = false
var var_$1718_changed : Boolean = false
var var_$1718_init : Boolean = false
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_$1718_value : List[Long] = List[Long]()
var var_$1710_changed : Boolean = false
var var_$1710_unknown : Boolean = false
var var_$1710_error : Throwable = null
var var_$1710_value : Long = 0L
var var_$1710_init : Boolean = false
var var_upperBoundXNow$1709_changed : Boolean = false
var var_upperBoundXNow$1709_unknown : Boolean = false
var var_upperBoundXNow$1709_error : Throwable = null
var var_upperBoundXNow$1709_value : Boolean = false
var var_upperBoundXNow$1709_init : Boolean = false
var var_$1717_changed : Boolean = false
var var_$1717_unknown : Boolean = false
var var_$1717_error : Throwable = null
var var_$1717_value : Long = 0L
var var_$1717_init : Boolean = false
var var_upperBoundXNow$1716_changed : Boolean = false
var var_upperBoundXNow$1716_unknown : Boolean = false
var var_upperBoundXNow$1716_error : Throwable = null
var var_upperBoundXNow$1716_value : Long = 0L
var var_upperBoundXNow$1716_init : Boolean = false
var var_$1728_changed : Boolean = false
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_$1728_value : Long = 0L
var var_$1728_init : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1707_value : Long = 0L
var var_$1707_init : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : List[Long] = List[Long]()
var var_$1704_init : Boolean = false
var var_$1725_changed : Boolean = false
var var_$1725_init : Boolean = false
var var_$1725_unknown : Boolean = false
var var_$1725_error : Throwable = null
var var_$1725_value : List[Long] = List[Long]()
var var_$1724_changed : Boolean = false
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_value : List[Long] = List[Long]()
var var_$1724_init : Boolean = false
var var_$1697_changed : Boolean = false
var var_$1697_unknown : Boolean = false
var var_$1697_error : Throwable = null
var var_$1697_value : List[Long] = List[Long]()
var var_$1697_init : Boolean = false
var var_UpperBoundX$1690_changed : Boolean = false
var var_UpperBoundX$1690_unknown : Boolean = false
var var_UpperBoundX$1690_error : Throwable = null
var var_UpperBoundX$1690_value : List[Long] = List[Long]()
var var_$1838_changed : Boolean = false
var var_$1838_lastValue : List[Long] = List[Long]()
var var_$1838_lastInit : Boolean = false
var var_$1838_lastError : Throwable = null
var var_$1838_init : Boolean = false
var var_$1838_ts : Long = 0L
var var_$1838_unknown : Boolean = false
var var_$1838_value : List[Long] = List[Long]()
var var_$1838_error : Throwable = null
var var_$1688_changed : Boolean = false
var var_$1688_unknown : Boolean = false
var var_$1688_error : Throwable = null
var var_$1688_value : Long = 0L
var var_$1688_init : Boolean = false
var var_$1687_changed : Boolean = false
var var_$1687_unknown : Boolean = false
var var_$1687_error : Throwable = null
var var_$1687_value : Boolean = false
var var_$1687_init : Boolean = false
var var_$1630_changed : Boolean = false
var var_$1630_unknown : Boolean = false
var var_$1630_error : Throwable = null
var var_$1630_value : Boolean = false
var var_$1630_init : Boolean = false
var var_$1741_changed : Boolean = false
var var_$1741_error : Throwable = null
var var_$1741_unknown : Boolean = false
var var_safeDelay$1745_changed : Boolean = false
val var_safeDelay$1745_error : Throwable = null
var var_safeDelay$1745_unknown : Boolean = false
var var_$1743_changed : Boolean = false
var var_$1743_error : Throwable = null
var var_$1743_unknown : Boolean = false
var var_mergeUnit2$1740_changed : Boolean = false
var var_mergeUnit2$1740_ts : Long = 0L
var var_mergeUnit2$1740_unknown : Boolean = false
var var_mergeUnit2$1740_error : Throwable = null
var var_$1751_changed : Boolean = false
var var_$1751_value : Long = 0L
var var_$1751_init : Boolean = false
var var_$1751_unknown : Boolean = false
var var_$1751_error : Throwable = null
var var_$1737_changed : Boolean = false
var var_$1737_unknown : Boolean = false
var var_$1737_error : Throwable = null
var var_$1737_value : Boolean = false
var var_$1737_init : Boolean = false
var var_$1747_changed : Boolean = false
var var_$1747_unknown : Boolean = false
var var_$1747_error : Throwable = null
var var_$1747_value : Long = 0L
var var_$1747_init : Boolean = false
var var_$1746_changed : Boolean = false
var var_$1746_unknown : Boolean = false
var var_$1746_error : Throwable = null
var var_$1746_value : Boolean = false
var var_$1746_init : Boolean = false
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Boolean = false
var var_$1736_init : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Boolean = false
var var_$1629_init : Boolean = false
val var_$1756_value : (Boolean, Boolean) = (false, false)
val var_$1756_error : Throwable = null
val var_$1756_changed : Boolean = false
val var_$1756_unknown : Boolean = false
var var_$1752_changed : Boolean = true
var var_$1752_value : (Boolean, Boolean) = var_$1754
var var_$1752_init : Boolean = true
var var_$1752_error : Throwable = null
var var_$1752_unknown : Boolean = false
var var_$1790_changed : Boolean = true
var var_$1790_value : (Boolean, Boolean) = var_$1792
var var_$1790_init : Boolean = true
var var_$1790_error : Throwable = null
var var_$1790_unknown : Boolean = false
var var_res$1628_changed : Boolean = false
var var_res$1628_unknown : Boolean = false
var var_res$1628_error : Throwable = null
var var_res$1628_value : (Boolean, Boolean) = (false, false)
var var_res$1628_init : Boolean = false
var var_res$1628_ts : Long = 0L
var var_$1775_changed : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : Boolean = false
var var_$1775_init : Boolean = false
var var_$1837_changed : Boolean = false
var var_$1837_unknown : Boolean = false
var var_$1837_error : Throwable = null
var var_$1837_value : Long = 0L
var var_$1837_init : Boolean = false
var var_$1829_changed : Boolean = false
var var_$1829_unknown : Boolean = false
var var_$1829_error : Throwable = null
var var_$1829_value : Long = 0L
var var_$1829_init : Boolean = false
var var_$1770_changed : Boolean = false
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1770_value : Boolean = false
var var_$1770_init : Boolean = false
val var_$1778_value : Boolean = false
val var_$1778_error : Throwable = null
val var_$1778_changed : Boolean = false
val var_$1778_unknown : Boolean = false
var var_$1772_changed : Boolean = true
var var_$1772_value : Boolean = true
var var_$1772_init : Boolean = true
var var_$1772_error : Throwable = null
var var_$1772_unknown : Boolean = false
var var_$1769_changed : Boolean = false
var var_$1769_unknown : Boolean = false
var var_$1769_error : Throwable = null
var var_$1769_value : Boolean = false
var var_$1769_init : Boolean = false
var var_$1766_changed : Boolean = false
var var_$1766_init : Boolean = false
var var_$1766_unknown : Boolean = false
var var_$1766_error : Throwable = null
var var_$1766_value : Boolean = false
var var_$1786_changed : Boolean = true
var var_$1786_value : Boolean = false
var var_$1786_init : Boolean = true
var var_$1786_error : Throwable = null
var var_$1786_unknown : Boolean = false
var var_$1774_changed : Boolean = false
var var_$1774_unknown : Boolean = false
var var_$1774_error : Throwable = null
var var_$1774_value : Boolean = false
var var_$1774_init : Boolean = false
var var_$1768_changed : Boolean = false
var var_$1768_unknown : Boolean = false
var var_$1768_error : Throwable = null
var var_$1768_value : Boolean = false
var var_$1768_init : Boolean = false
var var_isFinalFalse$1765_changed : Boolean = false
var var_isFinalFalse$1765_unknown : Boolean = false
var var_isFinalFalse$1765_error : Throwable = null
var var_isFinalFalse$1765_value : Boolean = false
var var_$1726_lastValue : List[Long] = List[Long]()
var var_$1726_lastInit : Boolean = false
var var_$1726_lastError : Throwable = null
var var_$1726_unknown : Boolean = false
var var_$1726_error : Throwable = null
var var_$1726_value : List[Long] = List[Long]()
var var_$1726_init : Boolean = false
var var_$1726_ts : Long = 0L
var var_$1779_changed : Boolean = false
var var_$1779_value : Long = 0L
var var_$1779_init : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1764_changed : Boolean = true
var var_$1764_lastValue : Boolean = false
var var_$1764_lastInit : Boolean = false
var var_$1764_lastError : Throwable = null
var var_$1764_value : Boolean = false
var var_$1764_init : Boolean = true
var var_$1764_ts : Long = 0L
var var_$1764_error : Throwable = null
var var_$1764_unknown : Boolean = false
var var_$1828_changed : Boolean = false
var var_$1828_unknown : Boolean = false
var var_$1828_error : Throwable = null
var var_$1828_value : Long = 0L
var var_$1828_init : Boolean = false
var var_$1827_changed : Boolean = false
var var_$1827_unknown : Boolean = false
var var_$1827_error : Throwable = null
var var_$1827_value : Long = 0L
var var_$1827_init : Boolean = false
var var_$1826_changed : Boolean = false
var var_$1826_unknown : Boolean = false
var var_$1826_error : Throwable = null
var var_$1826_value : Long = 0L
var var_$1826_init : Boolean = false
var var_$1826_ts : Long = 0L
var var_$1825_changed : Boolean = false
var var_$1825_unknown : Boolean = false
var var_$1825_error : Throwable = null
var var_$1825_value : Boolean = false
var var_$1825_init : Boolean = false
var var_$1759_changed : Boolean = false
var var_$1759_unknown : Boolean = false
var var_$1759_error : Throwable = null
var var_$1759_value : Boolean = false
var var_$1759_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_prev$1763_changed : Boolean = false
var var_prev$1763_init : Boolean = false
var var_prev$1763_unknown : Boolean = false
var var_prev$1763_error : Throwable = null
var var_prev$1763_value : Boolean = false
var var_$1762_changed : Boolean = false
var var_$1762_unknown : Boolean = false
var var_$1762_error : Throwable = null
var var_$1762_value : Boolean = false
var var_$1762_init : Boolean = false
var var_$1625_changed : Boolean = false
var var_$1625_unknown : Boolean = false
var var_$1625_error : Throwable = null
var var_$1625_value : Boolean = false
var var_$1625_init : Boolean = false
var var_$1780_changed : Boolean = false
var var_$1780_init : Boolean = false
var var_$1780_unknown : Boolean = false
var var_$1780_error : Throwable = null
var var_$1780_value : Long = 0L
var var_finalFalseSince$1624_changed : Boolean = false
var var_finalFalseSince$1624_unknown : Boolean = false
var var_finalFalseSince$1624_error : Throwable = null
var var_finalFalseSince$1624_value : Long = 0L
var var_$1781_changed : Boolean = true
var var_$1781_lastValue : Long = 0L
var var_$1781_lastInit : Boolean = false
var var_$1781_lastError : Throwable = null
var var_$1781_value : Long = 9223372036854775807L
var var_$1781_init : Boolean = true
var var_$1781_ts : Long = 0L
var var_$1781_error : Throwable = null
var var_$1781_unknown : Boolean = false
var var_$1847_changed : Boolean = true
var var_$1847_value : Long = 9223372036854775807L
var var_$1847_init : Boolean = true
var var_$1847_error : Throwable = null
var var_$1847_unknown : Boolean = false
var var_$1622_changed : Boolean = false
var var_$1622_unknown : Boolean = false
var var_$1622_error : Throwable = null
var var_$1622_value : Long = 0L
var var_$1622_init : Boolean = false
var var_$1621_changed : Boolean = false
var var_$1621_unknown : Boolean = false
var var_$1621_error : Throwable = null
var var_$1621_value : Boolean = false
var var_$1621_init : Boolean = false
var var_isFinalFalseReset$1620_changed : Boolean = false
var var_isFinalFalseReset$1620_unknown : Boolean = false
var var_isFinalFalseReset$1620_error : Throwable = null
var var_isFinalFalseReset$1620_value : Boolean = false
var var_$1767_changed : Boolean = false
var var_$1767_lastValue : Boolean = false
var var_$1767_lastInit : Boolean = false
var var_$1767_lastError : Throwable = null
var var_$1767_init : Boolean = false
var var_$1767_ts : Long = 0L
var var_$1767_unknown : Boolean = false
var var_$1767_value : Boolean = false
var var_$1767_error : Throwable = null
var var_$1677_lastValue : List[Long] = List[Long]()
var var_$1677_lastInit : Boolean = false
var var_$1677_lastError : Throwable = null
var var_$1677_unknown : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_value : List[Long] = List[Long]()
var var_$1677_init : Boolean = false
var var_$1677_ts : Long = 0L
var var_$1849_changed : Boolean = false
var var_$1849_value : Long = 0L
var var_$1849_init : Boolean = false
var var_$1849_unknown : Boolean = false
var var_$1849_error : Throwable = null
var var_$1846_changed : Boolean = false
var var_$1846_unknown : Boolean = false
var var_$1846_error : Throwable = null
var var_$1846_value : Long = 0L
var var_$1846_init : Boolean = false
var var_$1812_changed : Boolean = false
var var_$1812_unknown : Boolean = false
var var_$1812_error : Throwable = null
var var_$1812_value : Long = 0L
var var_stillFulfillableReset$1618_changed : Boolean = false
var var_stillFulfillableReset$1618_lastValue : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1618_lastInit : Boolean = false
var var_stillFulfillableReset$1618_lastError : Throwable = null
var var_stillFulfillableReset$1618_unknown : Boolean = false
var var_stillFulfillableReset$1618_error : Throwable = null
var var_stillFulfillableReset$1618_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1618_init : Boolean = false
var var_stillFulfillableReset$1618_ts : Long = 0L
var var_value$1794_changed : Boolean = false
var var_value$1794_unknown : Boolean = false
var var_value$1794_error : Throwable = null
var var_value$1794_value : Boolean = false
var var_value$1794_init : Boolean = false
var var_final$1617_changed : Boolean = false
var var_final$1617_unknown : Boolean = false
var var_final$1617_error : Throwable = null
var var_final$1617_value : Boolean = false
var var_final$1617_init : Boolean = false
var var_safeDelay$1745_nextTs : Long = -1L



  case class UnknownEventError(base: Throwable) extends java.lang.Exception {
    override def getMessage: String =
      "Uncertainty concerning the existence of an event" +
        (if (base != null)
           s" due to the follwing base error:\n ${base}"
         else
           ".")
  }

  object EOSome {
    def apply[A](value: => A): ErrorOption[A] = {
      try {
        ErrorOption[A](Some(value), None)
      } catch {
        case t: Throwable => ErrorOption[A](None, Some(t))
      }
    }
  }

  object EONone {
    def apply[A](): ErrorOption[A] = ErrorOption[A](None, None)
  }

  case class ErrorOption[A](value: Option[A], error: Option[Throwable]) {
    def get: A = if (value.isDefined) value.get else throw error.get

    def isDefined: Boolean = value.isDefined || error.isDefined

    def isEmpty: Boolean = value.isEmpty && error.isEmpty
  }

  def flush(): Unit = step(-1)

  private def step(newInputTs: Long): Unit = {

    if (newInputTs > currTs || newInputTs == -1) {

      var doProcessing = true
      while (doProcessing) {

if (((var_safeDelay$1745_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1745_nextTs))) {
currTs = var_safeDelay$1745_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1692_changed = false
if ((var_event_changed)) {
if ((var_stillFulfillableReset$1618_ts == currTs && var_stillFulfillableReset$1618_lastInit) || (!(var_stillFulfillableReset$1618_ts == currTs) && var_stillFulfillableReset$1618_init)) {
var_$1692_changed = true
var_$1692_init = true
var_$1692_unknown = var_event_unknown
if ((var_$1692_unknown)) {
var_$1692_error = var_event_error
} else {
if ((var_stillFulfillableReset$1618_ts == currTs)) {
var_$1692_value = var_stillFulfillableReset$1618_lastValue
var_$1692_error = var_stillFulfillableReset$1618_lastError
} else {
var_$1692_value = var_stillFulfillableReset$1618_value
var_$1692_error = var_stillFulfillableReset$1618_error
}
}
}
}
var_$1635_changed = false
if ((var_$1692_init)) {
if ((var_$1692_changed)) {
var_$1635_unknown = (var_$1692_unknown)
if ((var_$1635_unknown)) {
var_$1635_error = UnknownEventError(null)
} else {
var_$1635_error = null
try {
var_$1635_value = var_$1771.apply((if((var_$1692_error == null)) {var_$1692_value} else {throw var_$1692_error}))
} catch {
case var_err : Throwable => {
var_$1635_error = var_err
}
}
}
var_$1635_init = true
var_$1635_changed = true
}
}
if ((!(currTs == 0L))) {
var_LowerBoundX$1682_changed = false
}
if ((var_$1639_changed)) {
var_LowerBoundX$1682_value = var_$1639_value
var_LowerBoundX$1682_init = true
var_LowerBoundX$1682_error = var_$1639_error
var_LowerBoundX$1682_changed = true
var_LowerBoundX$1682_unknown = var_$1639_unknown
}
var_$1655_changed = false
if ((var_event_changed)) {
if ((var_$1656_ts == currTs && var_$1656_lastInit) || (!(var_$1656_ts == currTs) && var_$1656_init)) {
var_$1655_changed = true
var_$1655_init = true
var_$1655_unknown = var_event_unknown
if ((var_$1655_unknown)) {
var_$1655_error = var_event_error
} else {
if ((var_$1656_ts == currTs)) {
var_$1655_value = var_$1656_lastValue
var_$1655_error = var_$1656_lastError
} else {
var_$1655_value = var_$1656_value
var_$1655_error = var_$1656_error
}
}
}
}
var_$1643_changed = false
if ((var_$1655_init)) {
if ((var_$1655_changed)) {
var_$1643_unknown = (var_$1655_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = (if((var_$1655_error == null)) {var_$1655_value} else {throw var_$1655_error}).size
} catch {
case var_err : Throwable => {
var_$1643_error = var_err
}
}
}
var_$1643_init = true
var_$1643_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1713_changed = false
}
if ((var_$1834_changed)) {
var_$1713_value = var_$1834_value
var_$1713_init = true
var_$1713_error = var_$1834_error
var_$1713_changed = true
var_$1713_unknown = var_$1834_unknown
}
var_lowerBoundXNow$1653_changed = false
if ((var_$1643_init && var_$1713_init)) {
if ((var_$1643_changed) || (var_$1713_changed)) {
var_lowerBoundXNow$1653_unknown = (var_$1643_unknown && var_$1713_unknown)
if ((var_lowerBoundXNow$1653_unknown)) {
var_lowerBoundXNow$1653_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1653_error = null
try {
var_lowerBoundXNow$1653_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) < (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
} catch {
case var_err : Throwable => {
var_lowerBoundXNow$1653_error = var_err
}
}
}
var_lowerBoundXNow$1653_init = true
var_lowerBoundXNow$1653_changed = true
}
}
var_$1669_changed = false
if ((var_event_changed)) {
var_$1669_value = var_event_ts
var_$1669_init = true
var_$1669_unknown = var_event_unknown
if ((var_$1669_unknown)) {
var_$1669_error = var_event_error
} else {
var_$1669_error = null
}
var_$1669_changed = true
}
if ((!(currTs == 0L))) {
var_$1734_changed = false
}
if ((var_$1834_changed)) {
var_$1734_value = var_$1834_value
var_$1734_init = true
var_$1734_error = var_$1834_error
var_$1734_changed = true
var_$1734_unknown = var_$1834_unknown
}
var_lowerBoundXNow$1659_changed = false
if ((var_$1669_init && var_$1734_init)) {
if ((var_$1669_changed) || (var_$1734_changed)) {
var_lowerBoundXNow$1659_unknown = (var_$1669_unknown && var_$1734_unknown)
if ((var_lowerBoundXNow$1659_unknown)) {
var_lowerBoundXNow$1659_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1659_error = null
try {
var_lowerBoundXNow$1659_value = ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) - (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_lowerBoundXNow$1659_error = var_err
}
}
}
var_lowerBoundXNow$1659_init = true
var_lowerBoundXNow$1659_changed = true
}
}
var_$1664_changed = false
if ((var_$1655_init)) {
if ((var_$1655_changed)) {
var_$1664_unknown = (var_$1655_unknown)
if ((var_$1664_unknown)) {
var_$1664_error = UnknownEventError(null)
} else {
var_$1664_error = null
try {
var_$1664_value = (var_head$1667.apply(((if((var_$1655_error == null)) {var_$1655_value} else {throw var_$1655_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1664_error = var_err
}
}
}
var_$1664_init = true
var_$1664_changed = true
}
}
var_lowerBoundXNow$1663_changed = false
if ((var_$1664_init && var_lowerBoundXNow$1659_init)) {
if ((var_$1664_changed) || (var_lowerBoundXNow$1659_changed)) {
var_lowerBoundXNow$1663_unknown = (var_$1664_unknown && var_lowerBoundXNow$1659_unknown)
if ((var_lowerBoundXNow$1663_unknown)) {
var_lowerBoundXNow$1663_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1663_error = null
try {
var_lowerBoundXNow$1663_value = var_max$1672.apply((if((var_$1664_error == null)) {var_$1664_value} else {throw var_$1664_error}), (if((var_lowerBoundXNow$1659_error == null)) {var_lowerBoundXNow$1659_value} else {throw var_lowerBoundXNow$1659_error}))
} catch {
case var_err : Throwable => {
var_lowerBoundXNow$1663_error = var_err
}
}
}
var_lowerBoundXNow$1663_init = true
var_lowerBoundXNow$1663_changed = true
}
}
var_$1738_changed = false
if ((var_lowerBoundXNow$1653_init && var_lowerBoundXNow$1659_init && var_lowerBoundXNow$1663_init)) {
if ((var_lowerBoundXNow$1653_changed) || (var_lowerBoundXNow$1659_changed) || (var_lowerBoundXNow$1663_changed)) {
var_$1738_unknown = (var_lowerBoundXNow$1653_unknown && var_lowerBoundXNow$1659_unknown && var_lowerBoundXNow$1663_unknown)
if ((var_$1738_unknown)) {
var_$1738_error = UnknownEventError(null)
} else {
var_$1738_error = null
try {
var_$1738_value = (if ((if((var_lowerBoundXNow$1653_error == null)) {var_lowerBoundXNow$1653_value} else {throw var_lowerBoundXNow$1653_error})) (if((var_lowerBoundXNow$1659_error == null)) {var_lowerBoundXNow$1659_value} else {throw var_lowerBoundXNow$1659_error}) else (if((var_lowerBoundXNow$1663_error == null)) {var_lowerBoundXNow$1663_value} else {throw var_lowerBoundXNow$1663_error}))
} catch {
case var_err : Throwable => {
var_$1738_error = var_err
}
}
}
var_$1738_init = true
var_$1738_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1722_changed = false
}
if ((var_$1834_changed)) {
var_$1722_value = var_$1834_value
var_$1722_init = true
var_$1722_error = var_$1834_error
var_$1722_changed = true
var_$1722_unknown = var_$1834_unknown
}
var_$1678_changed = false
if ((var_$1738_init && var_$1722_init)) {
if ((var_$1738_changed) || (var_$1722_changed)) {
var_$1678_unknown = (var_$1738_unknown && var_$1722_unknown)
if ((var_$1678_unknown)) {
var_$1678_error = UnknownEventError(null)
} else {
var_$1678_error = null
try {
var_$1678_value = ((if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}) + (if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error}))
} catch {
case var_err : Throwable => {
var_$1678_error = var_err
}
}
}
var_$1678_init = true
var_$1678_changed = true
}
}
var_$1648_changed = false
if ((var_$1655_init && var_$1678_init)) {
if ((var_$1655_changed) || (var_$1678_changed)) {
var_$1648_unknown = (var_$1655_unknown && var_$1678_unknown)
if ((var_$1648_unknown)) {
var_$1648_error = UnknownEventError(null)
} else {
var_$1648_error = null
try {
var_$1648_value = ((if((var_$1655_error == null)) {var_$1655_value} else {throw var_$1655_error}) :+ (if((var_$1678_error == null)) {var_$1678_value} else {throw var_$1678_error}))
} catch {
case var_err : Throwable => {
var_$1648_error = var_err
}
}
}
var_$1648_init = true
var_$1648_changed = true
}
}
var_$1676_changed = false
if ((var_event_changed)) {
if ((var_$1677_ts == currTs && var_$1677_lastInit) || (!(var_$1677_ts == currTs) && var_$1677_init)) {
var_$1676_changed = true
var_$1676_init = true
var_$1676_unknown = var_event_unknown
if ((var_$1676_unknown)) {
var_$1676_error = var_event_error
} else {
if ((var_$1677_ts == currTs)) {
var_$1676_value = var_$1677_lastValue
var_$1676_error = var_$1677_lastError
} else {
var_$1676_value = var_$1677_value
var_$1676_error = var_$1677_error
}
}
}
}
var_$1675_changed = false
if ((var_$1676_init && var_$1678_init)) {
if ((var_$1676_changed) || (var_$1678_changed)) {
var_$1675_unknown = (var_$1676_unknown && var_$1678_unknown)
if ((var_$1675_unknown)) {
var_$1675_error = UnknownEventError(null)
} else {
var_$1675_error = null
try {
var_$1675_value = ((if((var_$1676_error == null)) {var_$1676_value} else {throw var_$1676_error}) :+ (if((var_$1678_error == null)) {var_$1678_value} else {throw var_$1678_error}))
} catch {
case var_err : Throwable => {
var_$1675_error = var_err
}
}
}
var_$1675_init = true
var_$1675_changed = true
}
}
var_$1641_changed = false
if ((var_lowerBoundXNow$1653_init && var_$1648_init && var_$1675_init)) {
if ((var_lowerBoundXNow$1653_changed) || (var_$1648_changed) || (var_$1675_changed)) {
var_$1641_unknown = (var_lowerBoundXNow$1653_unknown && var_$1648_unknown && var_$1675_unknown)
if ((var_$1641_unknown)) {
var_$1641_error = UnknownEventError(null)
} else {
var_$1641_error = null
try {
var_$1641_value = (if ((if((var_lowerBoundXNow$1653_error == null)) {var_lowerBoundXNow$1653_value} else {throw var_lowerBoundXNow$1653_error})) (if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}) else (if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error}))
} catch {
case var_err : Throwable => {
var_$1641_error = var_err
}
}
}
var_$1641_init = true
var_$1641_changed = true
}
}
var_LowerBoundX$1634_changed = false
if ((var_$1635_init && var_LowerBoundX$1682_init && var_$1641_init)) {
if ((var_$1635_changed) || (var_LowerBoundX$1682_changed) || (var_$1641_changed)) {
var_LowerBoundX$1634_unknown = (var_$1635_unknown && var_LowerBoundX$1682_unknown && var_$1641_unknown)
if ((var_LowerBoundX$1634_unknown)) {
var_LowerBoundX$1634_error = UnknownEventError(null)
} else {
var_LowerBoundX$1634_error = null
try {
var_LowerBoundX$1634_value = (if ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error})) (if((var_LowerBoundX$1682_error == null)) {var_LowerBoundX$1682_value} else {throw var_LowerBoundX$1682_error}) else (if((var_$1641_error == null)) {var_$1641_value} else {throw var_$1641_error}))
} catch {
case var_err : Throwable => {
var_LowerBoundX$1634_error = var_err
}
}
}
var_LowerBoundX$1634_changed = true
}
}
var_$1656_changed = false
if ((var_LowerBoundX$1634_changed) || (var_LowerBoundX$1682_changed)) {
var_$1656_lastValue = var_$1656_value
var_$1656_lastInit = var_$1656_init
var_$1656_lastError = var_$1656_error
var_$1656_init = true
var_$1656_ts = currTs
var_$1656_changed = true
var_$1656_unknown = (var_LowerBoundX$1634_unknown && var_LowerBoundX$1682_unknown)
if ((var_LowerBoundX$1634_changed)) {
var_$1656_value = var_LowerBoundX$1634_value
var_$1656_error = var_LowerBoundX$1634_error
} else {
if ((var_LowerBoundX$1682_changed)) {
var_$1656_value = var_LowerBoundX$1682_value
var_$1656_error = var_LowerBoundX$1682_error
}
}
}
var_$1632_changed = false
if ((var_$1656_init)) {
if ((var_$1656_changed)) {
var_$1632_unknown = (var_$1656_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}).size
} catch {
case var_err : Throwable => {
var_$1632_error = var_err
}
}
}
var_$1632_init = true
var_$1632_changed = true
}
}
var_$1631_changed = false
if ((var_$1632_init && var_$1734_init)) {
if ((var_$1632_changed) || (var_$1734_changed)) {
var_$1631_unknown = (var_$1632_unknown && var_$1734_unknown)
if ((var_$1631_unknown)) {
var_$1631_error = UnknownEventError(null)
} else {
var_$1631_error = null
try {
var_$1631_value = ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}) == (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1631_error = var_err
}
}
}
var_$1631_init = true
var_$1631_changed = true
}
}
var_$1718_changed = false
if ((var_event_changed)) {
if ((var_$1838_ts == currTs && var_$1838_lastInit) || (!(var_$1838_ts == currTs) && var_$1838_init)) {
var_$1718_changed = true
var_$1718_init = true
var_$1718_unknown = var_event_unknown
if ((var_$1718_unknown)) {
var_$1718_error = var_event_error
} else {
if ((var_$1838_ts == currTs)) {
var_$1718_value = var_$1838_lastValue
var_$1718_error = var_$1838_lastError
} else {
var_$1718_value = var_$1838_value
var_$1718_error = var_$1838_error
}
}
}
}
var_$1710_changed = false
if ((var_$1718_init)) {
if ((var_$1718_changed)) {
var_$1710_unknown = (var_$1718_unknown)
if ((var_$1710_unknown)) {
var_$1710_error = UnknownEventError(null)
} else {
var_$1710_error = null
try {
var_$1710_value = (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}).size
} catch {
case var_err : Throwable => {
var_$1710_error = var_err
}
}
}
var_$1710_init = true
var_$1710_changed = true
}
}
var_upperBoundXNow$1709_changed = false
if ((var_$1710_init && var_$1713_init)) {
if ((var_$1710_changed) || (var_$1713_changed)) {
var_upperBoundXNow$1709_unknown = (var_$1710_unknown && var_$1713_unknown)
if ((var_upperBoundXNow$1709_unknown)) {
var_upperBoundXNow$1709_error = UnknownEventError(null)
} else {
var_upperBoundXNow$1709_error = null
try {
var_upperBoundXNow$1709_value = ((if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}) < (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
} catch {
case var_err : Throwable => {
var_upperBoundXNow$1709_error = var_err
}
}
}
var_upperBoundXNow$1709_init = true
var_upperBoundXNow$1709_changed = true
}
}
var_$1717_changed = false
if ((var_$1718_init)) {
if ((var_$1718_changed)) {
var_$1717_unknown = (var_$1718_unknown)
if ((var_$1717_unknown)) {
var_$1717_error = UnknownEventError(null)
} else {
var_$1717_error = null
try {
var_$1717_value = (var_head$1667.apply(((if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1717_error = var_err
}
}
}
var_$1717_init = true
var_$1717_changed = true
}
}
var_upperBoundXNow$1716_changed = false
if ((var_$1717_init && var_$1669_init)) {
if ((var_$1717_changed) || (var_$1669_changed)) {
var_upperBoundXNow$1716_unknown = (var_$1717_unknown && var_$1669_unknown)
if ((var_upperBoundXNow$1716_unknown)) {
var_upperBoundXNow$1716_error = UnknownEventError(null)
} else {
var_upperBoundXNow$1716_error = null
try {
var_upperBoundXNow$1716_value = var_min$1721.apply((if((var_$1717_error == null)) {var_$1717_value} else {throw var_$1717_error}), (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_upperBoundXNow$1716_error = var_err
}
}
}
var_upperBoundXNow$1716_init = true
var_upperBoundXNow$1716_changed = true
}
}
var_$1728_changed = false
if ((var_upperBoundXNow$1709_init && var_$1669_init && var_upperBoundXNow$1716_init)) {
if ((var_upperBoundXNow$1709_changed) || (var_$1669_changed) || (var_upperBoundXNow$1716_changed)) {
var_$1728_unknown = (var_upperBoundXNow$1709_unknown && var_$1669_unknown && var_upperBoundXNow$1716_unknown)
if ((var_$1728_unknown)) {
var_$1728_error = UnknownEventError(null)
} else {
var_$1728_error = null
try {
var_$1728_value = (if ((if((var_upperBoundXNow$1709_error == null)) {var_upperBoundXNow$1709_value} else {throw var_upperBoundXNow$1709_error})) (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) else (if((var_upperBoundXNow$1716_error == null)) {var_upperBoundXNow$1716_value} else {throw var_upperBoundXNow$1716_error}))
} catch {
case var_err : Throwable => {
var_$1728_error = var_err
}
}
}
var_$1728_init = true
var_$1728_changed = true
}
}
var_$1707_changed = false
if ((var_$1728_init && var_$1722_init)) {
if ((var_$1728_changed) || (var_$1722_changed)) {
var_$1707_unknown = (var_$1728_unknown && var_$1722_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = ((if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}) + (if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error}))
} catch {
case var_err : Throwable => {
var_$1707_error = var_err
}
}
}
var_$1707_init = true
var_$1707_changed = true
}
}
var_$1704_changed = false
if ((var_$1718_init && var_$1707_init)) {
if ((var_$1718_changed) || (var_$1707_changed)) {
var_$1704_unknown = (var_$1718_unknown && var_$1707_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = ((if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}) :+ (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
} catch {
case var_err : Throwable => {
var_$1704_error = var_err
}
}
}
var_$1704_init = true
var_$1704_changed = true
}
}
var_$1725_changed = false
if ((var_event_changed)) {
if ((var_$1726_ts == currTs && var_$1726_lastInit) || (!(var_$1726_ts == currTs) && var_$1726_init)) {
var_$1725_changed = true
var_$1725_init = true
var_$1725_unknown = var_event_unknown
if ((var_$1725_unknown)) {
var_$1725_error = var_event_error
} else {
if ((var_$1726_ts == currTs)) {
var_$1725_value = var_$1726_lastValue
var_$1725_error = var_$1726_lastError
} else {
var_$1725_value = var_$1726_value
var_$1725_error = var_$1726_error
}
}
}
}
var_$1724_changed = false
if ((var_$1725_init && var_$1707_init)) {
if ((var_$1725_changed) || (var_$1707_changed)) {
var_$1724_unknown = (var_$1725_unknown && var_$1707_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = ((if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}) :+ (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
} catch {
case var_err : Throwable => {
var_$1724_error = var_err
}
}
}
var_$1724_init = true
var_$1724_changed = true
}
}
var_$1697_changed = false
if ((var_upperBoundXNow$1709_init && var_$1704_init && var_$1724_init)) {
if ((var_upperBoundXNow$1709_changed) || (var_$1704_changed) || (var_$1724_changed)) {
var_$1697_unknown = (var_upperBoundXNow$1709_unknown && var_$1704_unknown && var_$1724_unknown)
if ((var_$1697_unknown)) {
var_$1697_error = UnknownEventError(null)
} else {
var_$1697_error = null
try {
var_$1697_value = (if ((if((var_upperBoundXNow$1709_error == null)) {var_upperBoundXNow$1709_value} else {throw var_upperBoundXNow$1709_error})) (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}) else (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}))
} catch {
case var_err : Throwable => {
var_$1697_error = var_err
}
}
}
var_$1697_init = true
var_$1697_changed = true
}
}
var_UpperBoundX$1690_changed = false
if ((var_$1635_init && var_LowerBoundX$1682_init && var_$1697_init)) {
if ((var_$1635_changed) || (var_LowerBoundX$1682_changed) || (var_$1697_changed)) {
var_UpperBoundX$1690_unknown = (var_$1635_unknown && var_LowerBoundX$1682_unknown && var_$1697_unknown)
if ((var_UpperBoundX$1690_unknown)) {
var_UpperBoundX$1690_error = UnknownEventError(null)
} else {
var_UpperBoundX$1690_error = null
try {
var_UpperBoundX$1690_value = (if ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error})) (if((var_LowerBoundX$1682_error == null)) {var_LowerBoundX$1682_value} else {throw var_LowerBoundX$1682_error}) else (if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error}))
} catch {
case var_err : Throwable => {
var_UpperBoundX$1690_error = var_err
}
}
}
var_UpperBoundX$1690_changed = true
}
}
var_$1838_changed = false
if ((var_UpperBoundX$1690_changed) || (var_LowerBoundX$1682_changed)) {
var_$1838_lastValue = var_$1838_value
var_$1838_lastInit = var_$1838_init
var_$1838_lastError = var_$1838_error
var_$1838_init = true
var_$1838_ts = currTs
var_$1838_changed = true
var_$1838_unknown = (var_UpperBoundX$1690_unknown && var_LowerBoundX$1682_unknown)
if ((var_UpperBoundX$1690_changed)) {
var_$1838_value = var_UpperBoundX$1690_value
var_$1838_error = var_UpperBoundX$1690_error
} else {
if ((var_LowerBoundX$1682_changed)) {
var_$1838_value = var_LowerBoundX$1682_value
var_$1838_error = var_LowerBoundX$1682_error
}
}
}
var_$1688_changed = false
if ((var_$1838_init)) {
if ((var_$1838_changed)) {
var_$1688_unknown = (var_$1838_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = (if((var_$1838_error == null)) {var_$1838_value} else {throw var_$1838_error}).size
} catch {
case var_err : Throwable => {
var_$1688_error = var_err
}
}
}
var_$1688_init = true
var_$1688_changed = true
}
}
var_$1687_changed = false
if ((var_$1688_init && var_$1734_init)) {
if ((var_$1688_changed) || (var_$1734_changed)) {
var_$1687_unknown = (var_$1688_unknown && var_$1734_unknown)
if ((var_$1687_unknown)) {
var_$1687_error = UnknownEventError(null)
} else {
var_$1687_error = null
try {
var_$1687_value = ((if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}) == (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1687_error = var_err
}
}
}
var_$1687_init = true
var_$1687_changed = true
}
}
var_$1630_changed = false
if ((var_$1631_init && var_$1687_init)) {
if ((var_$1631_changed) || (var_$1687_changed)) {
var_$1630_unknown = (var_$1631_unknown && var_$1687_unknown)
if ((var_$1630_unknown)) {
var_$1630_error = UnknownEventError(null)
} else {
var_$1630_error = null
try {
var_$1630_value = ((if((var_$1631_error == null)) {var_$1631_value} else {throw var_$1631_error}) && (if((var_$1687_error == null)) {var_$1687_value} else {throw var_$1687_error}))
} catch {
case var_err : Throwable => {
var_$1630_error = var_err
}
}
}
var_$1630_init = true
var_$1630_changed = true
}
}
var_$1741_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$1741_error = UnknownEventError(var_event_error)
} else {
var_$1741_error = null
}
var_$1741_changed = var_event_changed
var_$1741_unknown = var_event_unknown
}
var_safeDelay$1745_changed = false
if ((var_safeDelay$1745_nextTs == currTs)) {
var_safeDelay$1745_changed = true
var_safeDelay$1745_unknown = false
}
var_$1743_changed = false
if ((var_safeDelay$1745_changed)) {
if ((var_safeDelay$1745_unknown)) {
var_$1743_error = UnknownEventError(var_safeDelay$1745_error)
} else {
var_$1743_error = null
}
var_$1743_changed = var_safeDelay$1745_changed
var_$1743_unknown = var_safeDelay$1745_unknown
}
var_mergeUnit2$1740_changed = false
if ((var_$1741_changed) || (var_$1743_changed)) {
var_mergeUnit2$1740_ts = currTs
var_mergeUnit2$1740_changed = true
var_mergeUnit2$1740_unknown = (var_$1741_unknown && var_$1743_unknown)
if ((var_$1741_changed)) {
var_mergeUnit2$1740_error = var_$1741_error
} else {
if ((var_$1743_changed)) {
var_mergeUnit2$1740_error = var_$1743_error
}
}
}
var_$1751_changed = false
if ((var_mergeUnit2$1740_changed)) {
var_$1751_value = var_mergeUnit2$1740_ts
var_$1751_init = true
var_$1751_unknown = var_mergeUnit2$1740_unknown
if ((var_$1751_unknown)) {
var_$1751_error = var_mergeUnit2$1740_error
} else {
var_$1751_error = null
}
var_$1751_changed = true
}
var_$1737_changed = false
if ((var_$1738_init && var_$1751_init)) {
if ((var_$1738_changed) || (var_$1751_changed)) {
var_$1737_unknown = (var_$1738_unknown && var_$1751_unknown)
if ((var_$1737_unknown)) {
var_$1737_error = UnknownEventError(null)
} else {
var_$1737_error = null
try {
var_$1737_value = ((if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}) <= (if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error}))
} catch {
case var_err : Throwable => {
var_$1737_error = var_err
}
}
}
var_$1737_init = true
var_$1737_changed = true
}
}
var_$1747_changed = false
if ((var_$1728_init && var_$1734_init)) {
if ((var_$1728_changed) || (var_$1734_changed)) {
var_$1747_unknown = (var_$1728_unknown && var_$1734_unknown)
if ((var_$1747_unknown)) {
var_$1747_error = UnknownEventError(null)
} else {
var_$1747_error = null
try {
var_$1747_value = ((if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}) + (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1747_error = var_err
}
}
}
var_$1747_init = true
var_$1747_changed = true
}
}
var_$1746_changed = false
if ((var_$1747_init && var_$1751_init)) {
if ((var_$1747_changed) || (var_$1751_changed)) {
var_$1746_unknown = (var_$1747_unknown && var_$1751_unknown)
if ((var_$1746_unknown)) {
var_$1746_error = UnknownEventError(null)
} else {
var_$1746_error = null
try {
var_$1746_value = ((if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error}) >= (if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error}))
} catch {
case var_err : Throwable => {
var_$1746_error = var_err
}
}
}
var_$1746_init = true
var_$1746_changed = true
}
}
var_$1736_changed = false
if ((var_$1737_init && var_$1746_init)) {
if ((var_$1737_changed) || (var_$1746_changed)) {
var_$1736_unknown = (var_$1737_unknown && var_$1746_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = ((if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}) && (if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}))
} catch {
case var_err : Throwable => {
var_$1736_error = var_err
}
}
}
var_$1736_init = true
var_$1736_changed = true
}
}
var_$1629_changed = false
if ((var_$1630_init && var_$1736_init)) {
if ((var_$1630_changed) || (var_$1736_changed)) {
var_$1629_unknown = (var_$1630_unknown && var_$1736_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = ((if((var_$1630_error == null)) {var_$1630_value} else {throw var_$1630_error}) || (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}))
} catch {
case var_err : Throwable => {
var_$1629_error = var_err
}
}
}
var_$1629_init = true
var_$1629_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1752_changed = false
}
if ((var_$1756_changed)) {
var_$1752_value = var_$1756_value
var_$1752_init = true
var_$1752_error = var_$1756_error
var_$1752_changed = true
var_$1752_unknown = var_$1756_unknown
}
if ((!(currTs == 0L))) {
var_$1790_changed = false
}
if ((var_$1756_changed)) {
var_$1790_value = var_$1756_value
var_$1790_init = true
var_$1790_error = var_$1756_error
var_$1790_changed = true
var_$1790_unknown = var_$1756_unknown
}
var_res$1628_changed = false
if ((var_$1629_init && var_$1752_init && var_$1790_init)) {
if ((var_$1629_changed) || (var_$1752_changed) || (var_$1790_changed)) {
var_res$1628_unknown = (var_$1629_unknown && var_$1752_unknown && var_$1790_unknown)
if ((var_res$1628_unknown)) {
var_res$1628_error = UnknownEventError(null)
} else {
var_res$1628_error = null
try {
var_res$1628_value = (if ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error})) (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}) else (if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error}))
} catch {
case var_err : Throwable => {
var_res$1628_error = var_err
}
}
}
var_res$1628_init = true
var_res$1628_ts = currTs
var_res$1628_changed = true
}
}
var_$1775_changed = false
if ((var_res$1628_init)) {
if ((var_res$1628_changed)) {
var_$1775_unknown = (var_res$1628_unknown)
if ((var_$1775_unknown)) {
var_$1775_error = UnknownEventError(null)
} else {
var_$1775_error = null
try {
var_$1775_value = var_$1776.apply((if((var_res$1628_error == null)) {var_res$1628_value} else {throw var_res$1628_error}))
} catch {
case var_err : Throwable => {
var_$1775_error = var_err
}
}
}
var_$1775_init = true
var_$1775_changed = true
}
}
var_$1837_changed = false
if ((var_$1838_init)) {
if ((var_$1838_changed)) {
var_$1837_unknown = (var_$1838_unknown)
if ((var_$1837_unknown)) {
var_$1837_error = UnknownEventError(null)
} else {
var_$1837_error = null
try {
var_$1837_value = (var_head$1667.apply(((if((var_$1838_error == null)) {var_$1838_value} else {throw var_$1838_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1837_error = var_err
}
}
}
var_$1837_init = true
var_$1837_changed = true
}
}
var_$1829_changed = false
if ((var_$1687_init && var_$1734_init && var_$1837_init)) {
if ((var_$1687_changed) || (var_$1734_changed) || (var_$1837_changed)) {
var_$1829_unknown = (var_$1687_unknown && var_$1734_unknown && var_$1837_unknown)
if ((var_$1829_unknown)) {
var_$1829_error = UnknownEventError(null)
} else {
var_$1829_error = null
try {
var_$1829_value = (if ((if((var_$1687_error == null)) {var_$1687_value} else {throw var_$1687_error})) (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}) else (if((var_$1837_error == null)) {var_$1837_value} else {throw var_$1837_error}))
} catch {
case var_err : Throwable => {
var_$1829_error = var_err
}
}
}
var_$1829_init = true
var_$1829_changed = true
}
}
var_$1770_changed = false
if ((var_res$1628_init)) {
if ((var_res$1628_changed)) {
var_$1770_unknown = (var_res$1628_unknown)
if ((var_$1770_unknown)) {
var_$1770_error = UnknownEventError(null)
} else {
var_$1770_error = null
try {
var_$1770_value = var_$1771.apply((if((var_res$1628_error == null)) {var_res$1628_value} else {throw var_res$1628_error}))
} catch {
case var_err : Throwable => {
var_$1770_error = var_err
}
}
}
var_$1770_init = true
var_$1770_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1772_changed = false
}
if ((var_$1778_changed)) {
var_$1772_value = var_$1778_value
var_$1772_init = true
var_$1772_error = var_$1778_error
var_$1772_changed = true
var_$1772_unknown = var_$1778_unknown
}
var_$1769_changed = false
if ((var_$1770_init && var_$1772_init)) {
if ((var_$1770_changed) || (var_$1772_changed)) {
var_$1769_unknown = (var_$1770_unknown && var_$1772_unknown)
if ((var_$1769_unknown)) {
var_$1769_error = UnknownEventError(null)
} else {
var_$1769_error = null
try {
var_$1769_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) == (if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error}))
} catch {
case var_err : Throwable => {
var_$1769_error = var_err
}
}
}
var_$1769_init = true
var_$1769_changed = true
}
}
var_$1766_changed = false
if ((var_res$1628_changed)) {
if ((var_$1767_ts == currTs && var_$1767_lastInit) || (!(var_$1767_ts == currTs) && var_$1767_init)) {
var_$1766_changed = true
var_$1766_init = true
var_$1766_unknown = var_res$1628_unknown
if ((var_$1766_unknown)) {
var_$1766_error = var_res$1628_error
} else {
if ((var_$1767_ts == currTs)) {
var_$1766_value = var_$1767_lastValue
var_$1766_error = var_$1767_lastError
} else {
var_$1766_value = var_$1767_value
var_$1766_error = var_$1767_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1786_changed = false
}
if ((var_$1778_changed)) {
var_$1786_value = var_$1778_value
var_$1786_init = true
var_$1786_error = var_$1778_error
var_$1786_changed = true
var_$1786_unknown = var_$1778_unknown
}
var_$1774_changed = false
if ((var_$1775_init && var_$1786_init)) {
if ((var_$1775_changed) || (var_$1786_changed)) {
var_$1774_unknown = (var_$1775_unknown && var_$1786_unknown)
if ((var_$1774_unknown)) {
var_$1774_error = UnknownEventError(null)
} else {
var_$1774_error = null
try {
var_$1774_value = ((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}) == (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1774_error = var_err
}
}
}
var_$1774_init = true
var_$1774_changed = true
}
}
var_$1768_changed = false
if ((var_$1769_init && var_$1774_init)) {
if ((var_$1769_changed) || (var_$1774_changed)) {
var_$1768_unknown = (var_$1769_unknown && var_$1774_unknown)
if ((var_$1768_unknown)) {
var_$1768_error = UnknownEventError(null)
} else {
var_$1768_error = null
try {
var_$1768_value = ((if((var_$1769_error == null)) {var_$1769_value} else {throw var_$1769_error}) && (if((var_$1774_error == null)) {var_$1774_value} else {throw var_$1774_error}))
} catch {
case var_err : Throwable => {
var_$1768_error = var_err
}
}
}
var_$1768_init = true
var_$1768_changed = true
}
}
var_isFinalFalse$1765_changed = false
if ((var_$1766_init && var_$1768_init)) {
if ((var_$1766_changed) || (var_$1768_changed)) {
var_isFinalFalse$1765_unknown = (var_$1766_unknown && var_$1768_unknown)
if ((var_isFinalFalse$1765_unknown)) {
var_isFinalFalse$1765_error = UnknownEventError(null)
} else {
var_isFinalFalse$1765_error = null
try {
var_isFinalFalse$1765_value = ((if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}) || (if((var_$1768_error == null)) {var_$1768_value} else {throw var_$1768_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1765_error = var_err
}
}
}
var_isFinalFalse$1765_changed = true
}
}
if ((var_$1838_init)) {
if ((var_$1838_changed)) {
var_$1726_lastValue = var_$1726_value
var_$1726_lastInit = var_$1726_init
var_$1726_lastError = var_$1726_error
var_$1726_unknown = (var_$1838_unknown)
if ((var_$1726_unknown)) {
var_$1726_error = UnknownEventError(null)
} else {
var_$1726_error = null
try {
var_$1726_value = (if((var_$1838_error == null)) {var_$1838_value} else {throw var_$1838_error}).tail
} catch {
case var_err : Throwable => {
var_$1726_error = var_err
}
}
}
var_$1726_init = true
var_$1726_ts = currTs
}
}
var_$1779_changed = false
if ((var_res$1628_changed)) {
var_$1779_value = var_res$1628_ts
var_$1779_init = true
var_$1779_unknown = var_res$1628_unknown
if ((var_$1779_unknown)) {
var_$1779_error = var_res$1628_error
} else {
var_$1779_error = null
}
var_$1779_changed = true
}
if ((!(currTs == 0L))) {
var_$1764_changed = false
}
if ((var_isFinalFalse$1765_changed)) {
var_$1764_lastValue = var_$1764_value
var_$1764_lastInit = var_$1764_init
var_$1764_lastError = var_$1764_error
var_$1764_value = var_isFinalFalse$1765_value
var_$1764_init = true
var_$1764_ts = currTs
var_$1764_error = var_isFinalFalse$1765_error
var_$1764_changed = true
var_$1764_unknown = var_isFinalFalse$1765_unknown
}
var_$1828_changed = false
if ((var_$1829_init && var_$1734_init)) {
if ((var_$1829_changed) || (var_$1734_changed)) {
var_$1828_unknown = (var_$1829_unknown && var_$1734_unknown)
if ((var_$1828_unknown)) {
var_$1828_error = UnknownEventError(null)
} else {
var_$1828_error = null
try {
var_$1828_value = ((if((var_$1829_error == null)) {var_$1829_value} else {throw var_$1829_error}) + (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1828_error = var_err
}
}
}
var_$1828_init = true
var_$1828_changed = true
}
}
var_$1827_changed = false
if ((var_$1828_init && var_$1669_init)) {
if ((var_$1828_changed) || (var_$1669_changed)) {
var_$1827_unknown = (var_$1828_unknown && var_$1669_unknown)
if ((var_$1827_unknown)) {
var_$1827_error = UnknownEventError(null)
} else {
var_$1827_error = null
try {
var_$1827_value = ((if((var_$1828_error == null)) {var_$1828_value} else {throw var_$1828_error}) - (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_$1827_error = var_err
}
}
}
var_$1827_init = true
var_$1827_changed = true
}
}
var_$1826_changed = false
if ((var_$1827_init && var_$1713_init)) {
if ((var_$1827_changed) || (var_$1713_changed)) {
var_$1826_unknown = (var_$1827_unknown && var_$1713_unknown)
if ((var_$1826_unknown)) {
var_$1826_error = UnknownEventError(null)
} else {
var_$1826_error = null
try {
var_$1826_value = ((if((var_$1827_error == null)) {var_$1827_value} else {throw var_$1827_error}) + (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
} catch {
case var_err : Throwable => {
var_$1826_error = var_err
}
}
}
var_$1826_init = true
var_$1826_ts = currTs
var_$1826_changed = true
}
}
var_$1825_changed = false
if ((var_$1826_init && var_$1734_init)) {
if ((var_$1826_changed) || (var_$1734_changed)) {
var_$1825_unknown = (var_$1826_unknown && var_$1734_unknown)
if ((var_$1825_unknown)) {
var_$1825_error = UnknownEventError(null)
} else {
var_$1825_error = null
try {
var_$1825_value = ((if((var_$1826_error == null)) {var_$1826_value} else {throw var_$1826_error}) > (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1825_error = var_err
}
}
}
var_$1825_init = true
var_$1825_changed = true
}
}
var_$1759_changed = false
if ((var_$1775_init)) {
if ((var_$1775_changed)) {
var_$1759_unknown = (var_$1775_unknown)
if ((var_$1759_unknown)) {
var_$1759_error = UnknownEventError(null)
} else {
var_$1759_error = null
try {
var_$1759_value = !((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}))
} catch {
case var_err : Throwable => {
var_$1759_error = var_err
}
}
}
var_$1759_init = true
var_$1759_changed = true
}
}
var_$1626_changed = false
if ((var_$1770_init && var_$1759_init)) {
if ((var_$1770_changed) || (var_$1759_changed)) {
var_$1626_unknown = (var_$1770_unknown && var_$1759_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) && (if((var_$1759_error == null)) {var_$1759_value} else {throw var_$1759_error}))
} catch {
case var_err : Throwable => {
var_$1626_error = var_err
}
}
}
var_$1626_init = true
var_$1626_changed = true
}
}
var_prev$1763_changed = false
if ((var_$1764_changed)) {
if ((var_$1764_ts == currTs && var_$1764_lastInit) || (!(var_$1764_ts == currTs) && var_$1764_init)) {
var_prev$1763_changed = true
var_prev$1763_init = true
var_prev$1763_unknown = var_$1764_unknown
if ((var_prev$1763_unknown)) {
var_prev$1763_error = var_$1764_error
} else {
if ((var_$1764_ts == currTs)) {
var_prev$1763_value = var_$1764_lastValue
var_prev$1763_error = var_$1764_lastError
} else {
var_prev$1763_value = var_$1764_value
var_prev$1763_error = var_$1764_error
}
}
}
}
var_$1762_changed = false
if ((var_prev$1763_init)) {
if ((var_prev$1763_changed)) {
var_$1762_unknown = (var_prev$1763_unknown)
if ((var_$1762_unknown)) {
var_$1762_error = UnknownEventError(null)
} else {
var_$1762_error = null
try {
var_$1762_value = !((if((var_prev$1763_error == null)) {var_prev$1763_value} else {throw var_prev$1763_error}))
} catch {
case var_err : Throwable => {
var_$1762_error = var_err
}
}
}
var_$1762_init = true
var_$1762_changed = true
}
}
var_$1625_changed = false
if ((var_$1626_init && var_$1762_init)) {
if ((var_$1626_changed) || (var_$1762_changed)) {
var_$1625_unknown = (var_$1626_unknown && var_$1762_unknown)
if ((var_$1625_unknown)) {
var_$1625_error = UnknownEventError(null)
} else {
var_$1625_error = null
try {
var_$1625_value = ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error}) && (if((var_$1762_error == null)) {var_$1762_value} else {throw var_$1762_error}))
} catch {
case var_err : Throwable => {
var_$1625_error = var_err
}
}
}
var_$1625_init = true
var_$1625_changed = true
}
}
var_$1780_changed = false
if ((var_$1764_changed)) {
if ((var_$1781_ts == currTs && var_$1781_lastInit) || (!(var_$1781_ts == currTs) && var_$1781_init)) {
var_$1780_changed = true
var_$1780_init = true
var_$1780_unknown = var_$1764_unknown
if ((var_$1780_unknown)) {
var_$1780_error = var_$1764_error
} else {
if ((var_$1781_ts == currTs)) {
var_$1780_value = var_$1781_lastValue
var_$1780_error = var_$1781_lastError
} else {
var_$1780_value = var_$1781_value
var_$1780_error = var_$1781_error
}
}
}
}
var_finalFalseSince$1624_changed = false
if ((var_$1625_init && var_$1779_init && var_$1780_init)) {
if ((var_$1625_changed) || (var_$1779_changed) || (var_$1780_changed)) {
var_finalFalseSince$1624_unknown = (var_$1625_unknown && var_$1779_unknown && var_$1780_unknown)
if ((var_finalFalseSince$1624_unknown)) {
var_finalFalseSince$1624_error = UnknownEventError(null)
} else {
var_finalFalseSince$1624_error = null
try {
var_finalFalseSince$1624_value = (if ((if((var_$1625_error == null)) {var_$1625_value} else {throw var_$1625_error})) (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}) else (if((var_$1780_error == null)) {var_$1780_value} else {throw var_$1780_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1624_error = var_err
}
}
}
var_finalFalseSince$1624_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1781_changed = false
}
if ((var_finalFalseSince$1624_changed)) {
var_$1781_lastValue = var_$1781_value
var_$1781_lastInit = var_$1781_init
var_$1781_lastError = var_$1781_error
var_$1781_value = var_finalFalseSince$1624_value
var_$1781_init = true
var_$1781_ts = currTs
var_$1781_error = var_finalFalseSince$1624_error
var_$1781_changed = true
var_$1781_unknown = var_finalFalseSince$1624_unknown
}
if ((!(currTs == 0L))) {
var_$1847_changed = false
}
if ((var_$1834_changed)) {
var_$1847_value = var_$1834_value
var_$1847_init = true
var_$1847_error = var_$1834_error
var_$1847_changed = true
var_$1847_unknown = var_$1834_unknown
}
var_$1622_changed = false
if ((var_$1781_init && var_$1847_init)) {
if ((var_$1781_changed) || (var_$1847_changed)) {
var_$1622_unknown = (var_$1781_unknown && var_$1847_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}) + (if((var_$1847_error == null)) {var_$1847_value} else {throw var_$1847_error}))
} catch {
case var_err : Throwable => {
var_$1622_error = var_err
}
}
}
var_$1622_init = true
var_$1622_changed = true
}
}
var_$1621_changed = false
if ((var_$1622_init && var_$1779_init)) {
if ((var_$1622_changed) || (var_$1779_changed)) {
var_$1621_unknown = (var_$1622_unknown && var_$1779_unknown)
if ((var_$1621_unknown)) {
var_$1621_error = UnknownEventError(null)
} else {
var_$1621_error = null
try {
var_$1621_value = ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error}) < (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
} catch {
case var_err : Throwable => {
var_$1621_error = var_err
}
}
}
var_$1621_init = true
var_$1621_changed = true
}
}
var_isFinalFalseReset$1620_changed = false
if ((var_$1621_init && var_$1786_init && var_$1764_init)) {
if ((var_$1621_changed) || (var_$1786_changed) || (var_$1764_changed)) {
var_isFinalFalseReset$1620_unknown = (var_$1621_unknown && var_$1786_unknown && var_$1764_unknown)
if ((var_isFinalFalseReset$1620_unknown)) {
var_isFinalFalseReset$1620_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1620_error = null
try {
var_isFinalFalseReset$1620_value = (if ((if((var_$1621_error == null)) {var_$1621_value} else {throw var_$1621_error})) (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}) else (if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1620_error = var_err
}
}
}
var_isFinalFalseReset$1620_changed = true
}
}
var_$1767_changed = false
if ((var_isFinalFalseReset$1620_changed) || (var_$1764_changed)) {
var_$1767_lastValue = var_$1767_value
var_$1767_lastInit = var_$1767_init
var_$1767_lastError = var_$1767_error
var_$1767_init = true
var_$1767_ts = currTs
var_$1767_changed = true
var_$1767_unknown = (var_isFinalFalseReset$1620_unknown && var_$1764_unknown)
if ((var_isFinalFalseReset$1620_changed)) {
var_$1767_value = var_isFinalFalseReset$1620_value
var_$1767_error = var_isFinalFalseReset$1620_error
} else {
if ((var_$1764_changed)) {
var_$1767_value = var_$1764_value
var_$1767_error = var_$1764_error
}
}
}
if ((var_$1656_init)) {
if ((var_$1656_changed)) {
var_$1677_lastValue = var_$1677_value
var_$1677_lastInit = var_$1677_init
var_$1677_lastError = var_$1677_error
var_$1677_unknown = (var_$1656_unknown)
if ((var_$1677_unknown)) {
var_$1677_error = UnknownEventError(null)
} else {
var_$1677_error = null
try {
var_$1677_value = (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}).tail
} catch {
case var_err : Throwable => {
var_$1677_error = var_err
}
}
}
var_$1677_init = true
var_$1677_ts = currTs
}
}
var_$1849_changed = false
if ((var_$1826_changed)) {
var_$1849_value = var_$1826_ts
var_$1849_init = true
var_$1849_unknown = var_$1826_unknown
if ((var_$1849_unknown)) {
var_$1849_error = var_$1826_error
} else {
var_$1849_error = null
}
var_$1849_changed = true
}
var_$1846_changed = false
if ((var_$1847_init && var_$1849_init)) {
if ((var_$1847_changed) || (var_$1849_changed)) {
var_$1846_unknown = (var_$1847_unknown && var_$1849_unknown)
if ((var_$1846_unknown)) {
var_$1846_error = UnknownEventError(null)
} else {
var_$1846_error = null
try {
var_$1846_value = ((if((var_$1847_error == null)) {var_$1847_value} else {throw var_$1847_error}) - (if((var_$1849_error == null)) {var_$1849_value} else {throw var_$1849_error}))
} catch {
case var_err : Throwable => {
var_$1846_error = var_err
}
}
}
var_$1846_init = true
var_$1846_changed = true
}
}
var_$1812_changed = false
if ((var_$1825_init && var_$1826_init && var_$1846_init)) {
if ((var_$1825_changed) || (var_$1826_changed) || (var_$1846_changed)) {
var_$1812_unknown = (var_$1825_unknown && var_$1826_unknown && var_$1846_unknown)
if ((var_$1812_unknown)) {
var_$1812_error = UnknownEventError(null)
} else {
var_$1812_error = null
try {
var_$1812_value = (if ((if((var_$1825_error == null)) {var_$1825_value} else {throw var_$1825_error})) (if((var_$1826_error == null)) {var_$1826_value} else {throw var_$1826_error}) else (if((var_$1846_error == null)) {var_$1846_value} else {throw var_$1846_error}))
} catch {
case var_err : Throwable => {
var_$1812_error = var_err
}
}
}
var_$1812_changed = true
}
}
var_stillFulfillableReset$1618_changed = false
if ((var_$1767_init && var_$1790_init && var_res$1628_init)) {
if ((var_$1767_changed) || (var_$1790_changed) || (var_res$1628_changed)) {
var_stillFulfillableReset$1618_lastValue = var_stillFulfillableReset$1618_value
var_stillFulfillableReset$1618_lastInit = var_stillFulfillableReset$1618_init
var_stillFulfillableReset$1618_lastError = var_stillFulfillableReset$1618_error
var_stillFulfillableReset$1618_unknown = (var_$1767_unknown && var_$1790_unknown && var_res$1628_unknown)
if ((var_stillFulfillableReset$1618_unknown)) {
var_stillFulfillableReset$1618_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1618_error = null
try {
var_stillFulfillableReset$1618_value = (if ((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error})) (if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error}) else (if((var_res$1628_error == null)) {var_res$1628_value} else {throw var_res$1628_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1618_error = var_err
}
}
}
var_stillFulfillableReset$1618_init = true
var_stillFulfillableReset$1618_ts = currTs
var_stillFulfillableReset$1618_changed = true
}
}
var_value$1794_changed = false
if ((var_stillFulfillableReset$1618_init)) {
if ((var_stillFulfillableReset$1618_changed)) {
var_value$1794_unknown = (var_stillFulfillableReset$1618_unknown)
if ((var_value$1794_unknown)) {
var_value$1794_error = UnknownEventError(null)
} else {
var_value$1794_error = null
try {
var_value$1794_value = var_$1776.apply((if((var_stillFulfillableReset$1618_error == null)) {var_stillFulfillableReset$1618_value} else {throw var_stillFulfillableReset$1618_error}))
} catch {
case var_err : Throwable => {
var_value$1794_error = var_err
}
}
}
var_value$1794_init = true
var_value$1794_changed = true
}
}
var_final$1617_changed = false
if ((var_stillFulfillableReset$1618_init)) {
if ((var_stillFulfillableReset$1618_changed)) {
var_final$1617_unknown = (var_stillFulfillableReset$1618_unknown)
if ((var_final$1617_unknown)) {
var_final$1617_error = UnknownEventError(null)
} else {
var_final$1617_error = null
try {
var_final$1617_value = var_$1771.apply((if((var_stillFulfillableReset$1618_error == null)) {var_stillFulfillableReset$1618_value} else {throw var_stillFulfillableReset$1618_error}))
} catch {
case var_err : Throwable => {
var_final$1617_error = var_err
}
}
}
var_final$1617_init = true
var_final$1617_changed = true
}
}

if ((var_event_unknown) || (!(var_$1812_error == null)) || (var_$1812_changed && (0L >= var_$1812_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1812_changed)) {
if ((var_safeDelay$1745_changed) || (var_event_changed)) {
var_safeDelay$1745_nextTs = (currTs + var_$1812_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1745_nextTs = -1L
}
}
}
if ((var_final$1617_changed && var_final$1617_init)) {
out_final.apply(var_final$1617_value, currTs, "final", var_final$1617_error)
}
if ((var_value$1794_changed && var_value$1794_init)) {
out_value.apply(var_value$1794_value, currTs, "value", var_value$1794_error)
}
var_event_changed = false

          lastProcessedTs = currTs
          currTs = newInputTs
        }
      }
    } else if (newInputTs < currTs) {
      System.err.println(s"$currTs: FATAL: decreasing timestamp received")
      System.exit(128)
    }
  }
}
