//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_max$1672 : scala.Function2[Long, Long, Long] = ((var_a$1930 : Long, var_b$1931 : Long) => {
val var_$1932 : Long = (if ((var_a$1930 > var_b$1931)) var_a$1930 else var_b$1931)
var_$1932
})
val var_min$1721 : scala.Function2[Long, Long, Long] = ((var_a$1937 : Long, var_b$1938 : Long) => {
val var_$1939 : Long = (if ((var_a$1937 < var_b$1938)) var_a$1937 else var_b$1938)
var_$1939
})
val var_$1771 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1947 : (Boolean, Boolean)) => {
val var_$1948 : Boolean = var_$1947._1
var_$1948
})
val var_fourValuedConjunction$1922 : scala.Function2[(Boolean, Boolean), (Boolean, Boolean), (Boolean, Boolean)] = ((var_a$1960 : (Boolean, Boolean), var_b$1961 : (Boolean, Boolean)) => {
lazy val var_$1994 : Boolean = var_b$1961._2
lazy val var_$1970 : Boolean = !(var_$1994)
lazy val var_$1992 : Boolean = var_a$1960._2
lazy val var_$1979 : Boolean = !(var_$1992)
lazy val var_$1969 : Boolean = var_a$1960._1
lazy val var_$1991 : Boolean = var_b$1961._1
lazy val var_$1995 : Boolean = !(var_$1991)
lazy val var_$1993 : Boolean = !(var_$1969)
val var_$1962 : (Boolean, Boolean) = (if (((var_$1979 && var_$1969) || (var_$1970 && var_$1991))) (true, false) else (if (((var_$1979 && var_$1993) || (var_$1970 && var_$1995))) (false, false) else (if (((var_$1992 && var_$1993) || (var_$1994 && var_$1995))) (false, true) else (true, true))))
var_$1962
})
val var_$1776 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1949 : (Boolean, Boolean)) => {
val var_$1950 : Boolean = var_$1949._2
var_$1950
})
val var_head$1667 : scala.Function1[List[Any], Any] = ((var_list$1928 : List[Any]) => {
val var_$1929 : Any = var_list$1928(0L.asInstanceOf[Int])
var_$1929
})
lazy val var_$1684 : List[Long] = List[Long]()
val var_$1883 : (Boolean, Boolean) = (false, true)
val var_$1886 : (Boolean, Boolean) = (true, false)
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_event_lastError : Throwable = null
val var_event_error : Throwable = null
val var_event_unknown : Boolean = false
var set_var_event : scala.Function2[Long, Long, Unit] = null
var var_event_lastInit : Boolean = false
var var_event_init : Boolean = false
var var_event_ts : Long = 0L
var var_event_changed : Boolean = false

out_value = null
out_final = null
set_var_event = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_event_changed))) {
var_event_lastInit = var_event_init
var_event_init = true
var_event_ts = ts
var_event_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
val var_$1703_value : Long = 0L
val var_$1703_error : Throwable = null
val var_$1703_changed : Boolean = false
val var_$1703_unknown : Boolean = false
var var_$2012_changed : Boolean = true
var var_$2012_value : Long = 0L
var var_$2012_init : Boolean = true
var var_$2012_error : Throwable = null
var var_$2012_unknown : Boolean = false
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
var var_$1845_changed : Boolean = true
var var_$1845_value : Long = 1L
var var_$1845_init : Boolean = true
var var_$1845_error : Throwable = null
var var_$1845_unknown : Boolean = false
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
var var_$1849_changed : Boolean = false
var var_$1849_error : Throwable = null
var var_$1849_unknown : Boolean = false
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
var var_$1813_changed : Boolean = true
var var_$1813_value : List[Long] = var_$1684
var var_$1813_init : Boolean = true
var var_$1813_error : Throwable = null
var var_$1813_unknown : Boolean = false
var var_$1722_changed : Boolean = true
var var_$1722_value : Long = 25L
var var_$1722_init : Boolean = true
var var_$1722_error : Throwable = null
var var_$1722_unknown : Boolean = false
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
var var_$1701_changed : Boolean = false
var var_$1701_lastValue : List[Long] = List[Long]()
var var_$1701_lastInit : Boolean = false
var var_$1701_lastError : Throwable = null
var var_$1701_init : Boolean = false
var var_$1701_ts : Long = 0L
var var_$1701_unknown : Boolean = false
var var_$1701_value : List[Long] = List[Long]()
var var_$1701_error : Throwable = null
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
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Boolean = false
var var_$1629_init : Boolean = false
val var_$1920_value : (Boolean, Boolean) = (false, false)
val var_$1920_error : Throwable = null
val var_$1920_changed : Boolean = false
val var_$1920_unknown : Boolean = false
var var_$1752_changed : Boolean = true
var var_$1752_value : (Boolean, Boolean) = var_$1883
var var_$1752_init : Boolean = true
var var_$1752_error : Throwable = null
var var_$1752_unknown : Boolean = false
var var_$1884_changed : Boolean = true
var var_$1884_value : (Boolean, Boolean) = var_$1886
var var_$1884_init : Boolean = true
var var_$1884_error : Throwable = null
var var_$1884_unknown : Boolean = false
var var_res$1628_changed : Boolean = false
var var_res$1628_unknown : Boolean = false
var var_res$1628_error : Throwable = null
var var_res$1628_value : (Boolean, Boolean) = (false, false)
var var_res$1628_init : Boolean = false
var var_res$1628_ts : Long = 0L
var var_$1766_changed : Boolean = false
var var_$1766_init : Boolean = false
var var_$1766_unknown : Boolean = false
var var_$1766_error : Throwable = null
var var_$1766_value : Boolean = false
var var_$1770_changed : Boolean = false
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1770_value : Boolean = false
var var_$1770_init : Boolean = false
val var_$1916_value : Boolean = false
val var_$1916_error : Throwable = null
val var_$1916_changed : Boolean = false
val var_$1916_unknown : Boolean = false
var var_$1872_changed : Boolean = true
var var_$1872_value : Boolean = true
var var_$1872_init : Boolean = true
var var_$1872_error : Throwable = null
var var_$1872_unknown : Boolean = false
var var_$1769_changed : Boolean = false
var var_$1769_unknown : Boolean = false
var var_$1769_error : Throwable = null
var var_$1769_value : Boolean = false
var var_$1769_init : Boolean = false
var var_$1775_changed : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : Boolean = false
var var_$1775_init : Boolean = false
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
var var_defaultTime$2035_changed : Boolean = true
var var_defaultTime$2035_value : Long = -1L
var var_defaultTime$2035_init : Boolean = true
var var_defaultTime$2035_error : Throwable = null
var var_defaultTime$2035_unknown : Boolean = false
var var_latestSpanEventTimes$1807_changed : Boolean = false
var var_latestSpanEventTimes$1807_unknown : Boolean = false
var var_latestSpanEventTimes$1807_error : Throwable = null
var var_latestSpanEventTimes$1807_value : Boolean = false
var var_latestSpanEventTimes$1807_init : Boolean = false
var var_latestSpanEventTimes$1812_changed : Boolean = false
var var_latestSpanEventTimes$1812_unknown : Boolean = false
var var_latestSpanEventTimes$1812_error : Throwable = null
var var_latestSpanEventTimes$1812_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1812_init : Boolean = false
var var_$1832_changed : Boolean = false
var var_$1832_init : Boolean = false
var var_$1832_unknown : Boolean = false
var var_$1832_error : Throwable = null
var var_$1832_value : List[Long] = List[Long]()
var var_$1822_changed : Boolean = false
var var_$1822_unknown : Boolean = false
var var_$1822_error : Throwable = null
var var_$1822_value : Long = 0L
var var_$1822_init : Boolean = false
var var_$1821_changed : Boolean = false
var var_$1821_unknown : Boolean = false
var var_$1821_error : Throwable = null
var var_$1821_value : Boolean = false
var var_$1821_init : Boolean = false
var var_$1828_changed : Boolean = false
var var_$1828_init : Boolean = false
var var_$1828_unknown : Boolean = false
var var_$1828_error : Throwable = null
var var_$1828_value : List[Long] = List[Long]()
var var_$1827_changed : Boolean = false
var var_$1827_unknown : Boolean = false
var var_$1827_error : Throwable = null
var var_$1827_value : List[Long] = List[Long]()
var var_$1827_init : Boolean = false
var var_$1820_changed : Boolean = false
var var_$1820_unknown : Boolean = false
var var_$1820_error : Throwable = null
var var_$1820_value : List[Long] = List[Long]()
var var_$1820_init : Boolean = false
var var_$1819_changed : Boolean = false
var var_$1819_unknown : Boolean = false
var var_$1819_error : Throwable = null
var var_$1819_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1818_changed : Boolean = true
var var_latestSpanEventTimes$1818_value : List[Long] = var_$1684
var var_latestSpanEventTimes$1818_init : Boolean = true
var var_latestSpanEventTimes$1818_error : Throwable = null
var var_latestSpanEventTimes$1818_unknown : Boolean = false
var var_$1824_changed : Boolean = false
var var_$1824_lastValue : List[Long] = List[Long]()
var var_$1824_lastInit : Boolean = false
var var_$1824_lastError : Throwable = null
var var_$1824_unknown : Boolean = false
var var_$1824_error : Throwable = null
var var_$1824_value : List[Long] = List[Long]()
var var_$1824_init : Boolean = false
var var_$1824_ts : Long = 0L
var var_$1805_changed : Boolean = false
var var_$1805_unknown : Boolean = false
var var_$1805_error : Throwable = null
var var_$1805_value : Long = 0L
var var_$1805_init : Boolean = false
var var_$1804_changed : Boolean = false
var var_$1804_unknown : Boolean = false
var var_$1804_error : Throwable = null
var var_$1804_value : Boolean = false
var var_$1804_init : Boolean = false
var var_$1843_changed : Boolean = false
var var_$1843_unknown : Boolean = false
var var_$1843_error : Throwable = null
var var_$1843_value : Long = 0L
var var_$1843_init : Boolean = false
var var_$1842_changed : Boolean = false
var var_$1842_unknown : Boolean = false
var var_$1842_error : Throwable = null
var var_$1842_value : Long = 0L
var var_$1842_init : Boolean = false
var var_safeDelay$1853_changed : Boolean = false
val var_safeDelay$1853_error : Throwable = null
var var_safeDelay$1853_unknown : Boolean = false
var var_$1851_changed : Boolean = false
var var_$1851_error : Throwable = null
var var_$1851_unknown : Boolean = false
var var_mergeUnit2$1848_changed : Boolean = false
var var_mergeUnit2$1848_ts : Long = 0L
var var_mergeUnit2$1848_unknown : Boolean = false
var var_mergeUnit2$1848_error : Throwable = null
var var_$1847_changed : Boolean = false
var var_$1847_value : Long = 0L
var var_$1847_init : Boolean = false
var var_$1847_unknown : Boolean = false
var var_$1847_error : Throwable = null
var var_$1841_changed : Boolean = false
var var_$1841_unknown : Boolean = false
var var_$1841_error : Throwable = null
var var_$1841_value : Boolean = false
var var_$1841_init : Boolean = false
var var_$1861_changed : Boolean = true
var var_$1861_value : Long = 9223372036854775807L
var var_$1861_init : Boolean = true
var var_$1861_error : Throwable = null
var var_$1861_unknown : Boolean = false
var var_$1875_changed : Boolean = false
var var_$1875_unknown : Boolean = false
var var_$1875_error : Throwable = null
var var_$1875_value : Long = 0L
var var_$1875_init : Boolean = false
var var_$1874_changed : Boolean = false
var var_$1874_unknown : Boolean = false
var var_$1874_error : Throwable = null
var var_$1874_value : Boolean = false
var var_$1874_init : Boolean = false
var var_$1854_changed : Boolean = false
var var_$1854_unknown : Boolean = false
var var_$1854_error : Throwable = null
var var_$1854_value : Boolean = false
var var_$1854_init : Boolean = false
var var_$1840_changed : Boolean = false
var var_$1840_unknown : Boolean = false
var var_$1840_error : Throwable = null
var var_$1840_value : Boolean = false
var var_$1840_init : Boolean = false
var var_$1839_changed : Boolean = false
var var_$1839_unknown : Boolean = false
var var_$1839_error : Throwable = null
var var_$1839_value : (Boolean, Boolean) = (false, false)
var var_$1839_init : Boolean = false
var var_$1870_changed : Boolean = false
var var_$1870_unknown : Boolean = false
var var_$1870_error : Throwable = null
var var_$1870_value : (Boolean, Boolean) = (false, false)
var var_$1870_init : Boolean = false
var var_$1803_changed : Boolean = false
var var_$1803_unknown : Boolean = false
var var_$1803_error : Throwable = null
var var_$1803_value : (Boolean, Boolean) = (false, false)
var var_$1803_init : Boolean = false
var var_$1803_ts : Long = 0L
var var_$1895_changed : Boolean = false
var var_$1895_init : Boolean = false
var var_$1895_unknown : Boolean = false
var var_$1895_error : Throwable = null
var var_$1895_value : Boolean = false
var var_$1802_changed : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1802_value : Boolean = false
var var_$1802_init : Boolean = false
var var_$1898_changed : Boolean = false
var var_$1898_unknown : Boolean = false
var var_$1898_error : Throwable = null
var var_$1898_value : Boolean = false
var var_$1898_init : Boolean = false
var var_$1889_changed : Boolean = false
var var_$1889_unknown : Boolean = false
var var_$1889_error : Throwable = null
var var_$1889_value : Boolean = false
var var_$1889_init : Boolean = false
var var_$1903_changed : Boolean = false
var var_$1903_unknown : Boolean = false
var var_$1903_error : Throwable = null
var var_$1903_value : Boolean = false
var var_$1903_init : Boolean = false
var var_$1897_changed : Boolean = false
var var_$1897_unknown : Boolean = false
var var_$1897_error : Throwable = null
var var_$1897_value : Boolean = false
var var_$1897_init : Boolean = false
var var_isFinalFalse$1894_changed : Boolean = false
var var_isFinalFalse$1894_unknown : Boolean = false
var var_isFinalFalse$1894_error : Throwable = null
var var_isFinalFalse$1894_value : Boolean = false
var var_$1893_changed : Boolean = true
var var_$1893_lastValue : Boolean = false
var var_$1893_lastInit : Boolean = false
var var_$1893_lastError : Throwable = null
var var_$1893_value : Boolean = false
var var_$1893_init : Boolean = true
var var_$1893_ts : Long = 0L
var var_$1893_error : Throwable = null
var var_$1893_unknown : Boolean = false
var var_$1909_changed : Boolean = false
var var_$1909_init : Boolean = false
var var_$1909_unknown : Boolean = false
var var_$1909_error : Throwable = null
var var_$1909_value : Long = 0L
var var_delayPeriod$2031_changed : Boolean = true
var var_delayPeriod$2031_value : Long = -1L
var var_delayPeriod$2031_init : Boolean = true
var var_delayPeriod$2031_error : Throwable = null
var var_delayPeriod$2031_unknown : Boolean = false
var var_$2069_changed : Boolean = false
var var_$2069_unknown : Boolean = false
var var_$2069_error : Throwable = null
var var_$2068_changed : Boolean = false
var var_$2068_value : Boolean = false
var var_$2068_error : Throwable = null
var var_$2068_unknown : Boolean = false
var var_$2070_changed : Boolean = false
var var_$2070_value : Boolean = false
var var_$2070_error : Throwable = null
var var_$2070_unknown : Boolean = false
var var_isFirst$2040_init : Boolean = false
var var_isFirst$2040_unknown : Boolean = false
var var_isFirst$2040_value : Boolean = false
var var_isFirst$2040_error : Throwable = null
var var_firstEvent$2039_changed : Boolean = false
var var_firstEvent$2039_error : Throwable = null
var var_firstEvent$2039_ts : Long = 0L
var var_firstEvent$2039_unknown : Boolean = false
var var_$2038_changed : Boolean = false
var var_$2038_value : Long = 0L
var var_$2038_unknown : Boolean = false
var var_$2038_error : Throwable = null
var var_defaultTime$2037_changed : Boolean = true
var var_defaultTime$2037_value : Long = -1L
var var_defaultTime$2037_init : Boolean = true
var var_defaultTime$2037_error : Throwable = null
var var_defaultTime$2037_unknown : Boolean = false
var var_$2034_changed : Boolean = false
var var_$2034_unknown : Boolean = false
var var_$2034_error : Throwable = null
var var_$2034_value : Boolean = false
var var_$2034_init : Boolean = false
var var_$2042_changed : Boolean = false
var var_$2042_unknown : Boolean = false
var var_$2042_error : Throwable = null
var var_$2042_value : Long = 0L
var var_$2042_init : Boolean = false
var var_$2041_changed : Boolean = false
var var_$2041_unknown : Boolean = false
var var_$2041_error : Throwable = null
var var_$2041_value : Long = 0L
var var_$2041_init : Boolean = false
var var_$2055_changed : Boolean = false
var var_$2055_unknown : Boolean = false
var var_$2055_error : Throwable = null
var var_$2055_value : List[Long] = List[Long]()
var var_$2055_init : Boolean = false
var var_$2054_changed : Boolean = false
var var_$2054_unknown : Boolean = false
var var_$2054_error : Throwable = null
var var_$2054_value : Long = 0L
var var_$2054_init : Boolean = false
var var_$2053_changed : Boolean = false
var var_$2053_unknown : Boolean = false
var var_$2053_error : Throwable = null
var var_$2053_value : Long = 0L
var var_$2053_init : Boolean = false
var var_$2052_changed : Boolean = false
var var_$2052_unknown : Boolean = false
var var_$2052_error : Throwable = null
var var_$2052_value : Long = 0L
var var_$2052_init : Boolean = false
var var_$2051_changed : Boolean = false
var var_$2051_unknown : Boolean = false
var var_$2051_error : Throwable = null
var var_$2051_value : Long = 0L
var var_$2051_init : Boolean = false
var var_delayPeriod$2033_changed : Boolean = false
var var_delayPeriod$2033_unknown : Boolean = false
var var_delayPeriod$2033_error : Throwable = null
var var_delayPeriod$2033_value : Long = 0L
var var_delayPeriod$2033_init : Boolean = false
var var_$2028_changed : Boolean = false
var var_$2028_unknown : Boolean = false
var var_$2028_error : Throwable = null
var var_$2028_value : Long = 0L
var var_$2028_init : Boolean = false
var var_$2028_ts : Long = 0L
var var_$2027_changed : Boolean = false
var var_$2027_unknown : Boolean = false
var var_$2027_error : Throwable = null
var var_$2027_value : Boolean = false
var var_$2027_init : Boolean = false
var var_$2067_changed : Boolean = false
var var_$2067_value : Long = 0L
var var_$2067_init : Boolean = false
var var_$2067_unknown : Boolean = false
var var_$2067_error : Throwable = null
var var_$2064_changed : Boolean = false
var var_$2064_unknown : Boolean = false
var var_$2064_error : Throwable = null
var var_$2064_value : Long = 0L
var var_$2064_init : Boolean = false
var var_$1951_changed : Boolean = false
var var_$1951_unknown : Boolean = false
var var_$1951_error : Throwable = null
var var_$1951_value : Long = 0L
var var_$1779_changed : Boolean = false
var var_$1779_value : Long = 0L
var var_$1779_init : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1888_changed : Boolean = false
var var_$1888_unknown : Boolean = false
var var_$1888_error : Throwable = null
var var_$1888_value : Boolean = false
var var_$1888_init : Boolean = false
var var_$1801_changed : Boolean = false
var var_$1801_unknown : Boolean = false
var var_$1801_error : Throwable = null
var var_$1801_value : Boolean = false
var var_$1801_init : Boolean = false
var var_prev$1892_changed : Boolean = false
var var_prev$1892_init : Boolean = false
var var_prev$1892_unknown : Boolean = false
var var_prev$1892_error : Throwable = null
var var_prev$1892_value : Boolean = false
var var_$1891_changed : Boolean = false
var var_$1891_unknown : Boolean = false
var var_$1891_error : Throwable = null
var var_$1891_value : Boolean = false
var var_$1891_init : Boolean = false
var var_$1800_changed : Boolean = false
var var_$1800_unknown : Boolean = false
var var_$1800_error : Throwable = null
var var_$1800_value : Boolean = false
var var_$1800_init : Boolean = false
var var_$1914_changed : Boolean = false
var var_$1914_value : Long = 0L
var var_$1914_init : Boolean = false
var var_$1914_unknown : Boolean = false
var var_$1914_error : Throwable = null
var var_finalFalseSince$1799_changed : Boolean = false
var var_finalFalseSince$1799_unknown : Boolean = false
var var_finalFalseSince$1799_error : Throwable = null
var var_finalFalseSince$1799_value : Long = 0L
var var_$1764_changed : Boolean = true
var var_$1764_lastValue : Boolean = false
var var_$1764_lastInit : Boolean = false
var var_$1764_lastError : Throwable = null
var var_$1764_value : Boolean = false
var var_$1764_init : Boolean = true
var var_$1764_ts : Long = 0L
var var_$1764_error : Throwable = null
var var_$1764_unknown : Boolean = false
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
var var_$2014_changed : Boolean = false
var var_$2014_unknown : Boolean = false
var var_$2014_error : Throwable = null
var var_$2014_value : Long = 0L
var var_$2014_init : Boolean = false
var var_$2006_changed : Boolean = false
var var_$2006_unknown : Boolean = false
var var_$2006_error : Throwable = null
var var_$2006_value : Long = 0L
var var_$2006_init : Boolean = false
var var_$2005_changed : Boolean = false
var var_$2005_unknown : Boolean = false
var var_$2005_error : Throwable = null
var var_$2005_value : Long = 0L
var var_$2005_init : Boolean = false
var var_$2004_changed : Boolean = false
var var_$2004_unknown : Boolean = false
var var_$2004_error : Throwable = null
var var_$2004_value : Long = 0L
var var_$2004_init : Boolean = false
var var_$2003_changed : Boolean = false
var var_$2003_unknown : Boolean = false
var var_$2003_error : Throwable = null
var var_$2003_value : Long = 0L
var var_$2003_init : Boolean = false
var var_$2003_ts : Long = 0L
var var_$1677_lastValue : List[Long] = List[Long]()
var var_$1677_lastInit : Boolean = false
var var_$1677_lastError : Throwable = null
var var_$1677_unknown : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_value : List[Long] = List[Long]()
var var_$1677_init : Boolean = false
var var_$1677_ts : Long = 0L
var var_$2026_changed : Boolean = false
var var_$2026_value : Long = 0L
var var_$2026_init : Boolean = false
var var_$2026_unknown : Boolean = false
var var_$2026_error : Throwable = null
var var_$2023_changed : Boolean = false
var var_$2023_unknown : Boolean = false
var var_$2023_error : Throwable = null
var var_$2023_value : Long = 0L
var var_$2023_init : Boolean = false
var var_$1798_changed : Boolean = true
var var_$1798_lastValue : Long = 0L
var var_$1798_lastInit : Boolean = false
var var_$1798_lastError : Throwable = null
var var_$1798_value : Long = 9223372036854775807L
var var_$1798_init : Boolean = true
var var_$1798_ts : Long = 0L
var var_$1798_error : Throwable = null
var var_$1798_unknown : Boolean = false
var var_$2002_changed : Boolean = false
var var_$2002_unknown : Boolean = false
var var_$2002_error : Throwable = null
var var_$2002_value : Boolean = false
var var_$2002_init : Boolean = false
var var_stillFulfillableReset$1618_changed : Boolean = false
var var_stillFulfillableReset$1618_lastValue : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1618_lastInit : Boolean = false
var var_stillFulfillableReset$1618_lastError : Throwable = null
var var_stillFulfillableReset$1618_unknown : Boolean = false
var var_stillFulfillableReset$1618_error : Throwable = null
var var_stillFulfillableReset$1618_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1618_init : Boolean = false
var var_stillFulfillableReset$1618_ts : Long = 0L
var var_$1797_changed : Boolean = false
var var_$1797_unknown : Boolean = false
var var_$1797_error : Throwable = null
var var_$1797_value : Long = 0L
var var_$1797_init : Boolean = false
var var_$1796_changed : Boolean = false
var var_$1796_unknown : Boolean = false
var var_$1796_error : Throwable = null
var var_$1796_value : Boolean = false
var var_$1796_init : Boolean = false
var var_isFinalFalseReset$1795_changed : Boolean = false
var var_isFinalFalseReset$1795_unknown : Boolean = false
var var_isFinalFalseReset$1795_error : Throwable = null
var var_isFinalFalseReset$1795_value : Boolean = false
var var_$1896_changed : Boolean = false
var var_$1896_lastValue : Boolean = false
var var_$1896_lastInit : Boolean = false
var var_$1896_lastError : Throwable = null
var var_$1896_init : Boolean = false
var var_$1896_ts : Long = 0L
var var_$1896_unknown : Boolean = false
var var_$1896_value : Boolean = false
var var_$1896_error : Throwable = null
var var_stillFulfillableReset$1793_changed : Boolean = false
var var_stillFulfillableReset$1793_unknown : Boolean = false
var var_stillFulfillableReset$1793_error : Throwable = null
var var_stillFulfillableReset$1793_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1793_init : Boolean = false
var var_sporadicConstraint$1617_changed : Boolean = false
var var_sporadicConstraint$1617_unknown : Boolean = false
var var_sporadicConstraint$1617_error : Throwable = null
var var_sporadicConstraint$1617_value : (Boolean, Boolean) = (false, false)
var var_sporadicConstraint$1617_init : Boolean = false
var var_value$1616_changed : Boolean = false
var var_value$1616_unknown : Boolean = false
var var_value$1616_error : Throwable = null
var var_value$1616_value : Boolean = false
var var_value$1616_init : Boolean = false
var var_final$1924_changed : Boolean = false
var var_final$1924_unknown : Boolean = false
var var_final$1924_error : Throwable = null
var var_final$1924_value : Boolean = false
var var_final$1924_init : Boolean = false
var var_$1942_changed : Boolean = false
var var_$1942_unknown : Boolean = false
var var_$1942_error : Throwable = null
var var_$1942_value : Long = 0L
var var_safeDelay$1745_nextTs : Long = -1L
var var_safeDelay$1853_nextTs : Long = -1L

def chunk1() = {
if ((!(currTs == 0L))) {
var_$2012_changed = false
}
if ((var_$1703_changed)) {
var_$2012_value = var_$1703_value
var_$2012_init = true
var_$2012_error = var_$1703_error
var_$2012_changed = true
var_$2012_unknown = var_$1703_unknown
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
var_$1845_changed = false
}
if ((var_$1703_changed)) {
var_$1845_value = var_$1703_value
var_$1845_init = true
var_$1845_error = var_$1703_error
var_$1845_changed = true
var_$1845_unknown = var_$1703_unknown
}
var_lowerBoundXNow$1653_changed = false
if ((var_$1643_init && var_$1845_init)) {
if ((var_$1643_changed) || (var_$1845_changed)) {
var_lowerBoundXNow$1653_unknown = (var_$1643_unknown && var_$1845_unknown)
if ((var_lowerBoundXNow$1653_unknown)) {
var_lowerBoundXNow$1653_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1653_error = null
try {
var_lowerBoundXNow$1653_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) < (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
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
var_lowerBoundXNow$1659_changed = false
if ((var_$1669_init && var_$2012_init)) {
if ((var_$1669_changed) || (var_$2012_changed)) {
var_lowerBoundXNow$1659_unknown = (var_$1669_unknown && var_$2012_unknown)
if ((var_lowerBoundXNow$1659_unknown)) {
var_lowerBoundXNow$1659_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1659_error = null
try {
var_lowerBoundXNow$1659_value = ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) - (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
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
var_$1849_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$1849_error = UnknownEventError(var_event_error)
} else {
var_$1849_error = null
}
var_$1849_changed = var_event_changed
var_$1849_unknown = var_event_unknown
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
if ((var_$1849_changed) || (var_$1743_changed)) {
var_mergeUnit2$1740_ts = currTs
var_mergeUnit2$1740_changed = true
var_mergeUnit2$1740_unknown = (var_$1849_unknown && var_$1743_unknown)
if ((var_$1849_changed)) {
var_mergeUnit2$1740_error = var_$1849_error
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
var_$1718_changed = false
if ((var_event_changed)) {
if ((var_$1701_ts == currTs && var_$1701_lastInit) || (!(var_$1701_ts == currTs) && var_$1701_init)) {
var_$1718_changed = true
var_$1718_init = true
var_$1718_unknown = var_event_unknown
if ((var_$1718_unknown)) {
var_$1718_error = var_event_error
} else {
if ((var_$1701_ts == currTs)) {
var_$1718_value = var_$1701_lastValue
var_$1718_error = var_$1701_lastError
} else {
var_$1718_value = var_$1701_value
var_$1718_error = var_$1701_error
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
if ((var_$1710_init && var_$1845_init)) {
if ((var_$1710_changed) || (var_$1845_changed)) {
var_upperBoundXNow$1709_unknown = (var_$1710_unknown && var_$1845_unknown)
if ((var_upperBoundXNow$1709_unknown)) {
var_upperBoundXNow$1709_error = UnknownEventError(null)
} else {
var_upperBoundXNow$1709_error = null
try {
var_upperBoundXNow$1709_value = ((if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}) < (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
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
var_$1747_changed = false
if ((var_$1728_init && var_$2012_init)) {
if ((var_$1728_changed) || (var_$2012_changed)) {
var_$1747_unknown = (var_$1728_unknown && var_$2012_unknown)
if ((var_$1747_unknown)) {
var_$1747_error = UnknownEventError(null)
} else {
var_$1747_error = null
try {
var_$1747_value = ((if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}) + (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
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
var_$1813_changed = false
}
if ((var_$1639_changed)) {
var_$1813_value = var_$1639_value
var_$1813_init = true
var_$1813_error = var_$1639_error
var_$1813_changed = true
var_$1813_unknown = var_$1639_unknown
}
if ((!(currTs == 0L))) {
var_$1722_changed = false
}
if ((var_$1703_changed)) {
var_$1722_value = var_$1703_value
var_$1722_init = true
var_$1722_error = var_$1703_error
var_$1722_changed = true
var_$1722_unknown = var_$1703_unknown
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
if ((var_$1635_init && var_$1813_init && var_$1697_init)) {
if ((var_$1635_changed) || (var_$1813_changed) || (var_$1697_changed)) {
var_UpperBoundX$1690_unknown = (var_$1635_unknown && var_$1813_unknown && var_$1697_unknown)
if ((var_UpperBoundX$1690_unknown)) {
var_UpperBoundX$1690_error = UnknownEventError(null)
} else {
var_UpperBoundX$1690_error = null
try {
var_UpperBoundX$1690_value = (if ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error})) (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) else (if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error}))
} catch {
case var_err : Throwable => {
var_UpperBoundX$1690_error = var_err
}
}
}
var_UpperBoundX$1690_changed = true
}
}
var_$1701_changed = false
if ((var_UpperBoundX$1690_changed) || (var_$1813_changed)) {
var_$1701_lastValue = var_$1701_value
var_$1701_lastInit = var_$1701_init
var_$1701_lastError = var_$1701_error
var_$1701_init = true
var_$1701_ts = currTs
var_$1701_changed = true
var_$1701_unknown = (var_UpperBoundX$1690_unknown && var_$1813_unknown)
if ((var_UpperBoundX$1690_changed)) {
var_$1701_value = var_UpperBoundX$1690_value
var_$1701_error = var_UpperBoundX$1690_error
} else {
if ((var_$1813_changed)) {
var_$1701_value = var_$1813_value
var_$1701_error = var_$1813_error
}
}
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
if ((var_$1635_init && var_$1813_init && var_$1641_init)) {
if ((var_$1635_changed) || (var_$1813_changed) || (var_$1641_changed)) {
var_LowerBoundX$1634_unknown = (var_$1635_unknown && var_$1813_unknown && var_$1641_unknown)
if ((var_LowerBoundX$1634_unknown)) {
var_LowerBoundX$1634_error = UnknownEventError(null)
} else {
var_LowerBoundX$1634_error = null
try {
var_LowerBoundX$1634_value = (if ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error})) (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) else (if((var_$1641_error == null)) {var_$1641_value} else {throw var_$1641_error}))
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
if ((var_LowerBoundX$1634_changed) || (var_$1813_changed)) {
var_$1656_lastValue = var_$1656_value
var_$1656_lastInit = var_$1656_init
var_$1656_lastError = var_$1656_error
var_$1656_init = true
var_$1656_ts = currTs
var_$1656_changed = true
var_$1656_unknown = (var_LowerBoundX$1634_unknown && var_$1813_unknown)
if ((var_LowerBoundX$1634_changed)) {
var_$1656_value = var_LowerBoundX$1634_value
var_$1656_error = var_LowerBoundX$1634_error
} else {
if ((var_$1813_changed)) {
var_$1656_value = var_$1813_value
var_$1656_error = var_$1813_error
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
if ((var_$1632_init && var_$2012_init)) {
if ((var_$1632_changed) || (var_$2012_changed)) {
var_$1631_unknown = (var_$1632_unknown && var_$2012_unknown)
if ((var_$1631_unknown)) {
var_$1631_error = UnknownEventError(null)
} else {
var_$1631_error = null
try {
var_$1631_value = ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}) == (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
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
var_$1688_changed = false
if ((var_$1701_init)) {
if ((var_$1701_changed)) {
var_$1688_unknown = (var_$1701_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}).size
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
if ((var_$1688_init && var_$2012_init)) {
if ((var_$1688_changed) || (var_$2012_changed)) {
var_$1687_unknown = (var_$1688_unknown && var_$2012_unknown)
if ((var_$1687_unknown)) {
var_$1687_error = UnknownEventError(null)
} else {
var_$1687_error = null
try {
var_$1687_value = ((if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}) == (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
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
if ((var_$1920_changed)) {
var_$1752_value = var_$1920_value
var_$1752_init = true
var_$1752_error = var_$1920_error
var_$1752_changed = true
var_$1752_unknown = var_$1920_unknown
}
if ((!(currTs == 0L))) {
var_$1884_changed = false
}
if ((var_$1920_changed)) {
var_$1884_value = var_$1920_value
var_$1884_init = true
var_$1884_error = var_$1920_error
var_$1884_changed = true
var_$1884_unknown = var_$1920_unknown
}
var_res$1628_changed = false
if ((var_$1629_init && var_$1752_init && var_$1884_init)) {
if ((var_$1629_changed) || (var_$1752_changed) || (var_$1884_changed)) {
var_res$1628_unknown = (var_$1629_unknown && var_$1752_unknown && var_$1884_unknown)
if ((var_res$1628_unknown)) {
var_res$1628_error = UnknownEventError(null)
} else {
var_res$1628_error = null
try {
var_res$1628_value = (if ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error})) (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}) else (if((var_$1884_error == null)) {var_$1884_value} else {throw var_$1884_error}))
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
var_$1872_changed = false
}
if ((var_$1916_changed)) {
var_$1872_value = var_$1916_value
var_$1872_init = true
var_$1872_error = var_$1916_error
var_$1872_changed = true
var_$1872_unknown = var_$1916_unknown
}
var_$1769_changed = false
if ((var_$1770_init && var_$1872_init)) {
if ((var_$1770_changed) || (var_$1872_changed)) {
var_$1769_unknown = (var_$1770_unknown && var_$1872_unknown)
if ((var_$1769_unknown)) {
var_$1769_error = UnknownEventError(null)
} else {
var_$1769_error = null
try {
var_$1769_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) == (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
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
if ((!(currTs == 0L))) {
var_$1786_changed = false
}
if ((var_$1916_changed)) {
var_$1786_value = var_$1916_value
var_$1786_init = true
var_$1786_error = var_$1916_error
var_$1786_changed = true
var_$1786_unknown = var_$1916_unknown
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
if ((var_$1701_init)) {
if ((var_$1701_changed)) {
var_$1726_lastValue = var_$1726_value
var_$1726_lastInit = var_$1726_init
var_$1726_lastError = var_$1726_error
var_$1726_unknown = (var_$1701_unknown)
if ((var_$1726_unknown)) {
var_$1726_error = UnknownEventError(null)
} else {
var_$1726_error = null
try {
var_$1726_value = (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}).tail
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
if ((!(currTs == 0L))) {
var_defaultTime$2035_changed = false
}
if ((var_$1669_changed)) {
var_defaultTime$2035_value = var_$1669_value
var_defaultTime$2035_init = true
var_defaultTime$2035_error = var_$1669_error
var_defaultTime$2035_changed = true
var_defaultTime$2035_unknown = var_$1669_unknown
}
var_latestSpanEventTimes$1807_changed = false
if ((var_defaultTime$2035_init && var_$2012_init)) {
if ((var_defaultTime$2035_changed) || (var_$2012_changed)) {
var_latestSpanEventTimes$1807_unknown = (var_defaultTime$2035_unknown && var_$2012_unknown)
if ((var_latestSpanEventTimes$1807_unknown)) {
var_latestSpanEventTimes$1807_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1807_error = null
try {
var_latestSpanEventTimes$1807_value = ((if((var_defaultTime$2035_error == null)) {var_defaultTime$2035_value} else {throw var_defaultTime$2035_error}) == (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1807_error = var_err
}
}
}
var_latestSpanEventTimes$1807_init = true
var_latestSpanEventTimes$1807_changed = true
}
}
var_latestSpanEventTimes$1812_changed = false
if ((var_$1813_init && var_defaultTime$2035_init)) {
if ((var_$1813_changed) || (var_defaultTime$2035_changed)) {
var_latestSpanEventTimes$1812_unknown = (var_$1813_unknown && var_defaultTime$2035_unknown)
if ((var_latestSpanEventTimes$1812_unknown)) {
var_latestSpanEventTimes$1812_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1812_error = null
try {
var_latestSpanEventTimes$1812_value = ((if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) :+ (if((var_defaultTime$2035_error == null)) {var_defaultTime$2035_value} else {throw var_defaultTime$2035_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1812_error = var_err
}
}
}
var_latestSpanEventTimes$1812_init = true
var_latestSpanEventTimes$1812_changed = true
}
}
var_$1832_changed = false
if ((var_event_changed)) {
if ((var_$1824_ts == currTs && var_$1824_lastInit) || (!(var_$1824_ts == currTs) && var_$1824_init)) {
var_$1832_changed = true
var_$1832_init = true
var_$1832_unknown = var_event_unknown
if ((var_$1832_unknown)) {
var_$1832_error = var_event_error
} else {
if ((var_$1824_ts == currTs)) {
var_$1832_value = var_$1824_lastValue
var_$1832_error = var_$1824_lastError
} else {
var_$1832_value = var_$1824_value
var_$1832_error = var_$1824_error
}
}
}
}
var_$1822_changed = false
if ((var_$1832_init)) {
if ((var_$1832_changed)) {
var_$1822_unknown = (var_$1832_unknown)
if ((var_$1822_unknown)) {
var_$1822_error = UnknownEventError(null)
} else {
var_$1822_error = null
try {
var_$1822_value = (if((var_$1832_error == null)) {var_$1832_value} else {throw var_$1832_error}).size
} catch {
case var_err : Throwable => {
var_$1822_error = var_err
}
}
}
var_$1822_init = true
var_$1822_changed = true
}
}
var_$1821_changed = false
if ((var_$1822_init && var_$1845_init)) {
if ((var_$1822_changed) || (var_$1845_changed)) {
var_$1821_unknown = (var_$1822_unknown && var_$1845_unknown)
if ((var_$1821_unknown)) {
var_$1821_error = UnknownEventError(null)
} else {
var_$1821_error = null
try {
var_$1821_value = ((if((var_$1822_error == null)) {var_$1822_value} else {throw var_$1822_error}) > (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$1821_error = var_err
}
}
}
var_$1821_init = true
var_$1821_changed = true
}
}
var_$1828_changed = false
if ((var_defaultTime$2035_changed)) {
if ((var_$1824_ts == currTs && var_$1824_lastInit) || (!(var_$1824_ts == currTs) && var_$1824_init)) {
var_$1828_changed = true
var_$1828_init = true
var_$1828_unknown = var_defaultTime$2035_unknown
if ((var_$1828_unknown)) {
var_$1828_error = var_defaultTime$2035_error
} else {
if ((var_$1824_ts == currTs)) {
var_$1828_value = var_$1824_lastValue
var_$1828_error = var_$1824_lastError
} else {
var_$1828_value = var_$1824_value
var_$1828_error = var_$1824_error
}
}
}
}
var_$1827_changed = false
if ((var_$1828_init)) {
if ((var_$1828_changed)) {
var_$1827_unknown = (var_$1828_unknown)
if ((var_$1827_unknown)) {
var_$1827_error = UnknownEventError(null)
} else {
var_$1827_error = null
try {
var_$1827_value = (if((var_$1828_error == null)) {var_$1828_value} else {throw var_$1828_error}).tail
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
var_$1820_changed = false
if ((var_$1821_init && var_$1827_init && var_$1832_init)) {
if ((var_$1821_changed) || (var_$1827_changed) || (var_$1832_changed)) {
var_$1820_unknown = (var_$1821_unknown && var_$1827_unknown && var_$1832_unknown)
if ((var_$1820_unknown)) {
var_$1820_error = UnknownEventError(null)
} else {
var_$1820_error = null
try {
var_$1820_value = (if ((if((var_$1821_error == null)) {var_$1821_value} else {throw var_$1821_error})) (if((var_$1827_error == null)) {var_$1827_value} else {throw var_$1827_error}) else (if((var_$1832_error == null)) {var_$1832_value} else {throw var_$1832_error}))
} catch {
case var_err : Throwable => {
var_$1820_error = var_err
}
}
}
var_$1820_init = true
var_$1820_changed = true
}
}
var_$1819_changed = false
if ((var_$1820_init && var_defaultTime$2035_init)) {
if ((var_$1820_changed) || (var_defaultTime$2035_changed)) {
var_$1819_unknown = (var_$1820_unknown && var_defaultTime$2035_unknown)
if ((var_$1819_unknown)) {
var_$1819_error = UnknownEventError(null)
} else {
var_$1819_error = null
try {
var_$1819_value = ((if((var_$1820_error == null)) {var_$1820_value} else {throw var_$1820_error}) :+ (if((var_defaultTime$2035_error == null)) {var_defaultTime$2035_value} else {throw var_defaultTime$2035_error}))
} catch {
case var_err : Throwable => {
var_$1819_error = var_err
}
}
}
var_$1819_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$1818_changed = false
}
if ((var_$1819_changed)) {
var_latestSpanEventTimes$1818_value = var_$1819_value
var_latestSpanEventTimes$1818_init = true
var_latestSpanEventTimes$1818_error = var_$1819_error
var_latestSpanEventTimes$1818_changed = true
var_latestSpanEventTimes$1818_unknown = var_$1819_unknown
}
var_$1824_changed = false
if ((var_latestSpanEventTimes$1807_init && var_latestSpanEventTimes$1812_init && var_latestSpanEventTimes$1818_init)) {
if ((var_latestSpanEventTimes$1807_changed) || (var_latestSpanEventTimes$1812_changed) || (var_latestSpanEventTimes$1818_changed)) {
var_$1824_lastValue = var_$1824_value
var_$1824_lastInit = var_$1824_init
var_$1824_lastError = var_$1824_error
var_$1824_unknown = (var_latestSpanEventTimes$1807_unknown && var_latestSpanEventTimes$1812_unknown && var_latestSpanEventTimes$1818_unknown)
if ((var_$1824_unknown)) {
var_$1824_error = UnknownEventError(null)
} else {
var_$1824_error = null
try {
var_$1824_value = (if ((if((var_latestSpanEventTimes$1807_error == null)) {var_latestSpanEventTimes$1807_value} else {throw var_latestSpanEventTimes$1807_error})) (if((var_latestSpanEventTimes$1812_error == null)) {var_latestSpanEventTimes$1812_value} else {throw var_latestSpanEventTimes$1812_error}) else (if((var_latestSpanEventTimes$1818_error == null)) {var_latestSpanEventTimes$1818_value} else {throw var_latestSpanEventTimes$1818_error}))
} catch {
case var_err : Throwable => {
var_$1824_error = var_err
}
}
}
var_$1824_init = true
var_$1824_ts = currTs
var_$1824_changed = true
}
}
var_$1805_changed = false
if ((var_$1824_init)) {
if ((var_$1824_changed)) {
var_$1805_unknown = (var_$1824_unknown)
if ((var_$1805_unknown)) {
var_$1805_error = UnknownEventError(null)
} else {
var_$1805_error = null
try {
var_$1805_value = (if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error}).size
} catch {
case var_err : Throwable => {
var_$1805_error = var_err
}
}
}
var_$1805_init = true
var_$1805_changed = true
}
}
var_$1804_changed = false
if ((var_$1805_init && var_$1845_init)) {
if ((var_$1805_changed) || (var_$1845_changed)) {
var_$1804_unknown = (var_$1805_unknown && var_$1845_unknown)
if ((var_$1804_unknown)) {
var_$1804_error = UnknownEventError(null)
} else {
var_$1804_error = null
try {
var_$1804_value = ((if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error}) > (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$1804_error = var_err
}
}
}
var_$1804_init = true
var_$1804_changed = true
}
}
var_$1843_changed = false
if ((var_$1824_init)) {
if ((var_$1824_changed)) {
var_$1843_unknown = (var_$1824_unknown)
if ((var_$1843_unknown)) {
var_$1843_error = UnknownEventError(null)
} else {
var_$1843_error = null
try {
var_$1843_value = (var_head$1667.apply(((if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1843_error = var_err
}
}
}
var_$1843_init = true
var_$1843_changed = true
}
}
var_$1842_changed = false
if ((var_$1843_init && var_$1845_init)) {
if ((var_$1843_changed) || (var_$1845_changed)) {
var_$1842_unknown = (var_$1843_unknown && var_$1845_unknown)
if ((var_$1842_unknown)) {
var_$1842_error = UnknownEventError(null)
} else {
var_$1842_error = null
try {
var_$1842_value = ((if((var_$1843_error == null)) {var_$1843_value} else {throw var_$1843_error}) + (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$1842_error = var_err
}
}
}
var_$1842_init = true
var_$1842_changed = true
}
}
var_safeDelay$1853_changed = false
if ((var_safeDelay$1853_nextTs == currTs)) {
var_safeDelay$1853_changed = true
var_safeDelay$1853_unknown = false
}
var_$1851_changed = false
if ((var_safeDelay$1853_changed)) {
if ((var_safeDelay$1853_unknown)) {
var_$1851_error = UnknownEventError(var_safeDelay$1853_error)
} else {
var_$1851_error = null
}
var_$1851_changed = var_safeDelay$1853_changed
var_$1851_unknown = var_safeDelay$1853_unknown
}
var_mergeUnit2$1848_changed = false
if ((var_$1849_changed) || (var_$1851_changed)) {
var_mergeUnit2$1848_ts = currTs
var_mergeUnit2$1848_changed = true
var_mergeUnit2$1848_unknown = (var_$1849_unknown && var_$1851_unknown)
if ((var_$1849_changed)) {
var_mergeUnit2$1848_error = var_$1849_error
} else {
if ((var_$1851_changed)) {
var_mergeUnit2$1848_error = var_$1851_error
}
}
}
var_$1847_changed = false
if ((var_mergeUnit2$1848_changed)) {
var_$1847_value = var_mergeUnit2$1848_ts
var_$1847_init = true
var_$1847_unknown = var_mergeUnit2$1848_unknown
if ((var_$1847_unknown)) {
var_$1847_error = var_mergeUnit2$1848_error
} else {
var_$1847_error = null
}
var_$1847_changed = true
}
var_$1841_changed = false
if ((var_$1842_init && var_$1847_init)) {
if ((var_$1842_changed) || (var_$1847_changed)) {
var_$1841_unknown = (var_$1842_unknown && var_$1847_unknown)
if ((var_$1841_unknown)) {
var_$1841_error = UnknownEventError(null)
} else {
var_$1841_error = null
try {
var_$1841_value = ((if((var_$1842_error == null)) {var_$1842_value} else {throw var_$1842_error}) <= (if((var_$1847_error == null)) {var_$1847_value} else {throw var_$1847_error}))
} catch {
case var_err : Throwable => {
var_$1841_error = var_err
}
}
}
var_$1841_init = true
var_$1841_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1861_changed = false
}
if ((var_$1703_changed)) {
var_$1861_value = var_$1703_value
var_$1861_init = true
var_$1861_error = var_$1703_error
var_$1861_changed = true
var_$1861_unknown = var_$1703_unknown
}
var_$1875_changed = false
if ((var_$1843_init && var_$1861_init)) {
if ((var_$1843_changed) || (var_$1861_changed)) {
var_$1875_unknown = (var_$1843_unknown && var_$1861_unknown)
if ((var_$1875_unknown)) {
var_$1875_error = UnknownEventError(null)
} else {
var_$1875_error = null
try {
var_$1875_value = ((if((var_$1843_error == null)) {var_$1843_value} else {throw var_$1843_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
} catch {
case var_err : Throwable => {
var_$1875_error = var_err
}
}
}
var_$1875_init = true
var_$1875_changed = true
}
}
var_$1874_changed = false
if ((var_$1875_init && var_$1847_init)) {
if ((var_$1875_changed) || (var_$1847_changed)) {
var_$1874_unknown = (var_$1875_unknown && var_$1847_unknown)
if ((var_$1874_unknown)) {
var_$1874_error = UnknownEventError(null)
} else {
var_$1874_error = null
try {
var_$1874_value = ((if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}) >= (if((var_$1847_error == null)) {var_$1847_value} else {throw var_$1847_error}))
} catch {
case var_err : Throwable => {
var_$1874_error = var_err
}
}
}
var_$1874_init = true
var_$1874_changed = true
}
}
var_$1854_changed = false
if ((var_$1872_init && var_$1874_init)) {
if ((var_$1872_changed) || (var_$1874_changed)) {
var_$1854_unknown = (var_$1872_unknown && var_$1874_unknown)
if ((var_$1854_unknown)) {
var_$1854_error = UnknownEventError(null)
} else {
var_$1854_error = null
try {
var_$1854_value = ((if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}) || (if((var_$1874_error == null)) {var_$1874_value} else {throw var_$1874_error}))
} catch {
case var_err : Throwable => {
var_$1854_error = var_err
}
}
}
var_$1854_init = true
var_$1854_changed = true
}
}
var_$1840_changed = false
if ((var_$1841_init && var_$1854_init)) {
if ((var_$1841_changed) || (var_$1854_changed)) {
var_$1840_unknown = (var_$1841_unknown && var_$1854_unknown)
if ((var_$1840_unknown)) {
var_$1840_error = UnknownEventError(null)
} else {
var_$1840_error = null
try {
var_$1840_value = ((if((var_$1841_error == null)) {var_$1841_value} else {throw var_$1841_error}) && (if((var_$1854_error == null)) {var_$1854_value} else {throw var_$1854_error}))
} catch {
case var_err : Throwable => {
var_$1840_error = var_err
}
}
}
var_$1840_init = true
var_$1840_changed = true
}
}
var_$1839_changed = false
if ((var_$1840_init && var_$1752_init && var_$1884_init)) {
if ((var_$1840_changed) || (var_$1752_changed) || (var_$1884_changed)) {
var_$1839_unknown = (var_$1840_unknown && var_$1752_unknown && var_$1884_unknown)
if ((var_$1839_unknown)) {
var_$1839_error = UnknownEventError(null)
} else {
var_$1839_error = null
try {
var_$1839_value = (if ((if((var_$1840_error == null)) {var_$1840_value} else {throw var_$1840_error})) (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}) else (if((var_$1884_error == null)) {var_$1884_value} else {throw var_$1884_error}))
} catch {
case var_err : Throwable => {
var_$1839_error = var_err
}
}
}
var_$1839_init = true
var_$1839_changed = true
}
}
var_$1870_changed = false
if ((var_$1854_init && var_$1752_init && var_$1884_init)) {
if ((var_$1854_changed) || (var_$1752_changed) || (var_$1884_changed)) {
var_$1870_unknown = (var_$1854_unknown && var_$1752_unknown && var_$1884_unknown)
if ((var_$1870_unknown)) {
var_$1870_error = UnknownEventError(null)
} else {
var_$1870_error = null
try {
var_$1870_value = (if ((if((var_$1854_error == null)) {var_$1854_value} else {throw var_$1854_error})) (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}) else (if((var_$1884_error == null)) {var_$1884_value} else {throw var_$1884_error}))
} catch {
case var_err : Throwable => {
var_$1870_error = var_err
}
}
}
var_$1870_init = true
var_$1870_changed = true
}
}
var_$1803_changed = false
if ((var_$1804_init && var_$1839_init && var_$1870_init)) {
if ((var_$1804_changed) || (var_$1839_changed) || (var_$1870_changed)) {
var_$1803_unknown = (var_$1804_unknown && var_$1839_unknown && var_$1870_unknown)
if ((var_$1803_unknown)) {
var_$1803_error = UnknownEventError(null)
} else {
var_$1803_error = null
try {
var_$1803_value = (if ((if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error})) (if((var_$1839_error == null)) {var_$1839_value} else {throw var_$1839_error}) else (if((var_$1870_error == null)) {var_$1870_value} else {throw var_$1870_error}))
} catch {
case var_err : Throwable => {
var_$1803_error = var_err
}
}
}
var_$1803_init = true
var_$1803_ts = currTs
var_$1803_changed = true
}
}
var_$1895_changed = false
if ((var_$1803_changed)) {
if ((var_$1896_ts == currTs && var_$1896_lastInit) || (!(var_$1896_ts == currTs) && var_$1896_init)) {
var_$1895_changed = true
var_$1895_init = true
var_$1895_unknown = var_$1803_unknown
if ((var_$1895_unknown)) {
var_$1895_error = var_$1803_error
} else {
if ((var_$1896_ts == currTs)) {
var_$1895_value = var_$1896_lastValue
var_$1895_error = var_$1896_lastError
} else {
var_$1895_value = var_$1896_value
var_$1895_error = var_$1896_error
}
}
}
}
var_$1802_changed = false
if ((var_$1803_init)) {
if ((var_$1803_changed)) {
var_$1802_unknown = (var_$1803_unknown)
if ((var_$1802_unknown)) {
var_$1802_error = UnknownEventError(null)
} else {
var_$1802_error = null
try {
var_$1802_value = var_$1771.apply((if((var_$1803_error == null)) {var_$1803_value} else {throw var_$1803_error}))
} catch {
case var_err : Throwable => {
var_$1802_error = var_err
}
}
}
var_$1802_init = true
var_$1802_changed = true
}
}
var_$1898_changed = false
if ((var_$1802_init && var_$1872_init)) {
if ((var_$1802_changed) || (var_$1872_changed)) {
var_$1898_unknown = (var_$1802_unknown && var_$1872_unknown)
if ((var_$1898_unknown)) {
var_$1898_error = UnknownEventError(null)
} else {
var_$1898_error = null
try {
var_$1898_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) == (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
} catch {
case var_err : Throwable => {
var_$1898_error = var_err
}
}
}
var_$1898_init = true
var_$1898_changed = true
}
}
var_$1889_changed = false
if ((var_$1803_init)) {
if ((var_$1803_changed)) {
var_$1889_unknown = (var_$1803_unknown)
if ((var_$1889_unknown)) {
var_$1889_error = UnknownEventError(null)
} else {
var_$1889_error = null
try {
var_$1889_value = var_$1776.apply((if((var_$1803_error == null)) {var_$1803_value} else {throw var_$1803_error}))
} catch {
case var_err : Throwable => {
var_$1889_error = var_err
}
}
}
var_$1889_init = true
var_$1889_changed = true
}
}
var_$1903_changed = false
if ((var_$1889_init && var_$1786_init)) {
if ((var_$1889_changed) || (var_$1786_changed)) {
var_$1903_unknown = (var_$1889_unknown && var_$1786_unknown)
if ((var_$1903_unknown)) {
var_$1903_error = UnknownEventError(null)
} else {
var_$1903_error = null
try {
var_$1903_value = ((if((var_$1889_error == null)) {var_$1889_value} else {throw var_$1889_error}) == (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1903_error = var_err
}
}
}
var_$1903_init = true
var_$1903_changed = true
}
}
var_$1897_changed = false
if ((var_$1898_init && var_$1903_init)) {
if ((var_$1898_changed) || (var_$1903_changed)) {
var_$1897_unknown = (var_$1898_unknown && var_$1903_unknown)
if ((var_$1897_unknown)) {
var_$1897_error = UnknownEventError(null)
} else {
var_$1897_error = null
try {
var_$1897_value = ((if((var_$1898_error == null)) {var_$1898_value} else {throw var_$1898_error}) && (if((var_$1903_error == null)) {var_$1903_value} else {throw var_$1903_error}))
} catch {
case var_err : Throwable => {
var_$1897_error = var_err
}
}
}
var_$1897_init = true
var_$1897_changed = true
}
}
var_isFinalFalse$1894_changed = false
if ((var_$1895_init && var_$1897_init)) {
if ((var_$1895_changed) || (var_$1897_changed)) {
var_isFinalFalse$1894_unknown = (var_$1895_unknown && var_$1897_unknown)
if ((var_isFinalFalse$1894_unknown)) {
var_isFinalFalse$1894_error = UnknownEventError(null)
} else {
var_isFinalFalse$1894_error = null
try {
var_isFinalFalse$1894_value = ((if((var_$1895_error == null)) {var_$1895_value} else {throw var_$1895_error}) || (if((var_$1897_error == null)) {var_$1897_value} else {throw var_$1897_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1894_error = var_err
}
}
}
var_isFinalFalse$1894_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1893_changed = false
}
if ((var_isFinalFalse$1894_changed)) {
var_$1893_lastValue = var_$1893_value
var_$1893_lastInit = var_$1893_init
var_$1893_lastError = var_$1893_error
var_$1893_value = var_isFinalFalse$1894_value
var_$1893_init = true
var_$1893_ts = currTs
var_$1893_error = var_isFinalFalse$1894_error
var_$1893_changed = true
var_$1893_unknown = var_isFinalFalse$1894_unknown
}
var_$1909_changed = false
if ((var_$1893_changed)) {
if ((var_$1798_ts == currTs && var_$1798_lastInit) || (!(var_$1798_ts == currTs) && var_$1798_init)) {
var_$1909_changed = true
var_$1909_init = true
var_$1909_unknown = var_$1893_unknown
if ((var_$1909_unknown)) {
var_$1909_error = var_$1893_error
} else {
if ((var_$1798_ts == currTs)) {
var_$1909_value = var_$1798_lastValue
var_$1909_error = var_$1798_lastError
} else {
var_$1909_value = var_$1798_value
var_$1909_error = var_$1798_error
}
}
}
}
if ((!(currTs == 0L))) {
var_delayPeriod$2031_changed = false
}
if ((var_$1703_changed)) {
var_delayPeriod$2031_value = var_$1703_value
var_delayPeriod$2031_init = true
var_delayPeriod$2031_error = var_$1703_error
var_delayPeriod$2031_changed = true
var_delayPeriod$2031_unknown = var_$1703_unknown
}
var_$2069_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$2069_changed = true
var_$2069_unknown = var_event_unknown
if ((var_$2069_unknown)) {
var_$2069_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$2069_error = var_event_lastError
} else {
var_$2069_error = var_event_error
}
}
}
}
var_$2068_changed = false
if ((var_$2069_changed)) {
var_$2068_value = false
if ((var_$2069_unknown)) {
var_$2068_error = UnknownEventError(var_$2069_error)
} else {
var_$2068_error = null
}
var_$2068_changed = var_$2069_changed
var_$2068_unknown = var_$2069_unknown
}
var_$2070_changed = false
if ((var_event_changed)) {
var_$2070_value = true
if ((var_event_unknown)) {
var_$2070_error = UnknownEventError(var_event_error)
} else {
var_$2070_error = null
}
var_$2070_changed = var_event_changed
var_$2070_unknown = var_event_unknown
}
if ((var_$2068_changed) || (var_$2070_changed) || (var_$1786_changed)) {
var_isFirst$2040_init = true
var_isFirst$2040_unknown = (var_$2068_unknown && var_$2070_unknown && var_$1786_unknown)
if ((var_$2068_changed)) {
var_isFirst$2040_value = var_$2068_value
var_isFirst$2040_error = var_$2068_error
} else {
if ((var_$2070_changed)) {
var_isFirst$2040_value = var_$2070_value
var_isFirst$2040_error = var_$2070_error
} else {
if ((var_$1786_changed)) {
var_isFirst$2040_value = var_$1786_value
var_isFirst$2040_error = var_$1786_error
}
}
}
}
var_firstEvent$2039_changed = false
if ((var_isFirst$2040_init && var_event_changed)) {
if ((var_isFirst$2040_value) || (!(var_isFirst$2040_error == null)) || (var_isFirst$2040_unknown)) {
if ((!(var_isFirst$2040_error == null))) {
var_firstEvent$2039_error = var_isFirst$2040_error
} else {
var_firstEvent$2039_error = var_event_error
}
var_firstEvent$2039_changed = true
var_firstEvent$2039_ts = var_event_ts
var_firstEvent$2039_unknown = (var_event_unknown || !(var_isFirst$2040_error == null))
}
}
var_$2038_changed = false
if ((var_firstEvent$2039_changed)) {
var_$2038_value = var_firstEvent$2039_ts
var_$2038_unknown = var_firstEvent$2039_unknown
if ((var_$2038_unknown)) {
var_$2038_error = var_firstEvent$2039_error
} else {
var_$2038_error = null
}
var_$2038_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$2037_changed = false
}
if ((var_$2038_changed)) {
var_defaultTime$2037_value = var_$2038_value
var_defaultTime$2037_init = true
var_defaultTime$2037_error = var_$2038_error
var_defaultTime$2037_changed = true
var_defaultTime$2037_unknown = var_$2038_unknown
}
var_$2034_changed = false
if ((var_defaultTime$2035_init && var_defaultTime$2037_init)) {
if ((var_defaultTime$2035_changed) || (var_defaultTime$2037_changed)) {
var_$2034_unknown = (var_defaultTime$2035_unknown && var_defaultTime$2037_unknown)
if ((var_$2034_unknown)) {
var_$2034_error = UnknownEventError(null)
} else {
var_$2034_error = null
try {
var_$2034_value = ((if((var_defaultTime$2035_error == null)) {var_defaultTime$2035_value} else {throw var_defaultTime$2035_error}) == (if((var_defaultTime$2037_error == null)) {var_defaultTime$2037_value} else {throw var_defaultTime$2037_error}))
} catch {
case var_err : Throwable => {
var_$2034_error = var_err
}
}
}
var_$2034_init = true
var_$2034_changed = true
}
}
var_$2042_changed = false
if ((var_$1875_init && var_$1669_init)) {
if ((var_$1875_changed) || (var_$1669_changed)) {
var_$2042_unknown = (var_$1875_unknown && var_$1669_unknown)
if ((var_$2042_unknown)) {
var_$2042_error = UnknownEventError(null)
} else {
var_$2042_error = null
try {
var_$2042_value = ((if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}) - (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_$2042_error = var_err
}
}
}
var_$2042_init = true
var_$2042_changed = true
}
}
var_$2041_changed = false
if ((var_$2042_init && var_$1845_init)) {
if ((var_$2042_changed) || (var_$1845_changed)) {
var_$2041_unknown = (var_$2042_unknown && var_$1845_unknown)
if ((var_$2041_unknown)) {
var_$2041_error = UnknownEventError(null)
} else {
var_$2041_error = null
try {
var_$2041_value = ((if((var_$2042_error == null)) {var_$2042_value} else {throw var_$2042_error}) + (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$2041_error = var_err
}
}
}
var_$2041_init = true
var_$2041_changed = true
}
}
var_$2055_changed = false
if ((var_$1824_init)) {
if ((var_$1824_changed)) {
var_$2055_unknown = (var_$1824_unknown)
if ((var_$2055_unknown)) {
var_$2055_error = UnknownEventError(null)
} else {
var_$2055_error = null
try {
var_$2055_value = (if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error}).tail
} catch {
case var_err : Throwable => {
var_$2055_error = var_err
}
}
}
var_$2055_init = true
var_$2055_changed = true
}
}
var_$2054_changed = false
if ((var_$2055_init)) {
if ((var_$2055_changed)) {
var_$2054_unknown = (var_$2055_unknown)
if ((var_$2054_unknown)) {
var_$2054_error = UnknownEventError(null)
} else {
var_$2054_error = null
try {
var_$2054_value = (var_head$1667.apply(((if((var_$2055_error == null)) {var_$2055_value} else {throw var_$2055_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2054_error = var_err
}
}
}
var_$2054_init = true
var_$2054_changed = true
}
}
var_$2053_changed = false
if ((var_$2054_init && var_$1861_init)) {
if ((var_$2054_changed) || (var_$1861_changed)) {
var_$2053_unknown = (var_$2054_unknown && var_$1861_unknown)
if ((var_$2053_unknown)) {
var_$2053_error = UnknownEventError(null)
} else {
var_$2053_error = null
try {
var_$2053_value = ((if((var_$2054_error == null)) {var_$2054_value} else {throw var_$2054_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
} catch {
case var_err : Throwable => {
var_$2053_error = var_err
}
}
}
var_$2053_init = true
var_$2053_changed = true
}
}
var_$2052_changed = false
if ((var_$2053_init && var_$1669_init)) {
if ((var_$2053_changed) || (var_$1669_changed)) {
var_$2052_unknown = (var_$2053_unknown && var_$1669_unknown)
if ((var_$2052_unknown)) {
var_$2052_error = UnknownEventError(null)
} else {
var_$2052_error = null
try {
var_$2052_value = ((if((var_$2053_error == null)) {var_$2053_value} else {throw var_$2053_error}) - (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_$2052_error = var_err
}
}
}
var_$2052_init = true
var_$2052_changed = true
}
}
var_$2051_changed = false
if ((var_$2052_init && var_$1845_init)) {
if ((var_$2052_changed) || (var_$1845_changed)) {
var_$2051_unknown = (var_$2052_unknown && var_$1845_unknown)
if ((var_$2051_unknown)) {
var_$2051_error = UnknownEventError(null)
} else {
var_$2051_error = null
try {
var_$2051_value = ((if((var_$2052_error == null)) {var_$2052_value} else {throw var_$2052_error}) + (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$2051_error = var_err
}
}
}
var_$2051_init = true
var_$2051_changed = true
}
}
var_delayPeriod$2033_changed = false
if ((var_$2034_init && var_$2041_init && var_$2051_init)) {
if ((var_$2034_changed) || (var_$2041_changed) || (var_$2051_changed)) {
var_delayPeriod$2033_unknown = (var_$2034_unknown && var_$2041_unknown && var_$2051_unknown)
if ((var_delayPeriod$2033_unknown)) {
var_delayPeriod$2033_error = UnknownEventError(null)
} else {
var_delayPeriod$2033_error = null
try {
var_delayPeriod$2033_value = (if ((if((var_$2034_error == null)) {var_$2034_value} else {throw var_$2034_error})) (if((var_$2041_error == null)) {var_$2041_value} else {throw var_$2041_error}) else (if((var_$2051_error == null)) {var_$2051_value} else {throw var_$2051_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$2033_error = var_err
}
}
}
var_delayPeriod$2033_init = true
var_delayPeriod$2033_changed = true
}
}
var_$2028_changed = false
if ((var_$1872_init && var_delayPeriod$2031_init && var_delayPeriod$2033_init)) {
if ((var_$1872_changed) || (var_delayPeriod$2031_changed) || (var_delayPeriod$2033_changed)) {
var_$2028_unknown = (var_$1872_unknown && var_delayPeriod$2031_unknown && var_delayPeriod$2033_unknown)
if ((var_$2028_unknown)) {
var_$2028_error = UnknownEventError(null)
} else {
var_$2028_error = null
try {
var_$2028_value = (if ((if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error})) (if((var_delayPeriod$2031_error == null)) {var_delayPeriod$2031_value} else {throw var_delayPeriod$2031_error}) else (if((var_delayPeriod$2033_error == null)) {var_delayPeriod$2033_value} else {throw var_delayPeriod$2033_error}))
} catch {
case var_err : Throwable => {
var_$2028_error = var_err
}
}
}
var_$2028_init = true
var_$2028_ts = currTs
var_$2028_changed = true
}
}
var_$2027_changed = false
if ((var_$2028_init && var_$2012_init)) {
if ((var_$2028_changed) || (var_$2012_changed)) {
var_$2027_unknown = (var_$2028_unknown && var_$2012_unknown)
if ((var_$2027_unknown)) {
var_$2027_error = UnknownEventError(null)
} else {
var_$2027_error = null
try {
var_$2027_value = ((if((var_$2028_error == null)) {var_$2028_value} else {throw var_$2028_error}) > (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
} catch {
case var_err : Throwable => {
var_$2027_error = var_err
}
}
}
var_$2027_init = true
var_$2027_changed = true
}
}
var_$2067_changed = false
if ((var_$2028_changed)) {
var_$2067_value = var_$2028_ts
var_$2067_init = true
var_$2067_unknown = var_$2028_unknown
if ((var_$2067_unknown)) {
var_$2067_error = var_$2028_error
} else {
var_$2067_error = null
}
var_$2067_changed = true
}
var_$2064_changed = false
if ((var_$1861_init && var_$2067_init)) {
if ((var_$1861_changed) || (var_$2067_changed)) {
var_$2064_unknown = (var_$1861_unknown && var_$2067_unknown)
if ((var_$2064_unknown)) {
var_$2064_error = UnknownEventError(null)
} else {
var_$2064_error = null
try {
var_$2064_value = ((if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}) - (if((var_$2067_error == null)) {var_$2067_value} else {throw var_$2067_error}))
} catch {
case var_err : Throwable => {
var_$2064_error = var_err
}
}
}
var_$2064_init = true
var_$2064_changed = true
}
}
var_$1951_changed = false
if ((var_$2027_init && var_$2028_init && var_$2064_init)) {
if ((var_$2027_changed) || (var_$2028_changed) || (var_$2064_changed)) {
var_$1951_unknown = (var_$2027_unknown && var_$2028_unknown && var_$2064_unknown)
if ((var_$1951_unknown)) {
var_$1951_error = UnknownEventError(null)
} else {
var_$1951_error = null
try {
var_$1951_value = (if ((if((var_$2027_error == null)) {var_$2027_value} else {throw var_$2027_error})) (if((var_$2028_error == null)) {var_$2028_value} else {throw var_$2028_error}) else (if((var_$2064_error == null)) {var_$2064_value} else {throw var_$2064_error}))
} catch {
case var_err : Throwable => {
var_$1951_error = var_err
}
}
}
var_$1951_changed = true
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
var_$1888_changed = false
if ((var_$1889_init)) {
if ((var_$1889_changed)) {
var_$1888_unknown = (var_$1889_unknown)
if ((var_$1888_unknown)) {
var_$1888_error = UnknownEventError(null)
} else {
var_$1888_error = null
try {
var_$1888_value = !((if((var_$1889_error == null)) {var_$1889_value} else {throw var_$1889_error}))
} catch {
case var_err : Throwable => {
var_$1888_error = var_err
}
}
}
var_$1888_init = true
var_$1888_changed = true
}
}
var_$1801_changed = false
if ((var_$1802_init && var_$1888_init)) {
if ((var_$1802_changed) || (var_$1888_changed)) {
var_$1801_unknown = (var_$1802_unknown && var_$1888_unknown)
if ((var_$1801_unknown)) {
var_$1801_error = UnknownEventError(null)
} else {
var_$1801_error = null
try {
var_$1801_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) && (if((var_$1888_error == null)) {var_$1888_value} else {throw var_$1888_error}))
} catch {
case var_err : Throwable => {
var_$1801_error = var_err
}
}
}
var_$1801_init = true
var_$1801_changed = true
}
}
var_prev$1892_changed = false
if ((var_$1893_changed)) {
if ((var_$1893_ts == currTs && var_$1893_lastInit) || (!(var_$1893_ts == currTs) && var_$1893_init)) {
var_prev$1892_changed = true
var_prev$1892_init = true
var_prev$1892_unknown = var_$1893_unknown
if ((var_prev$1892_unknown)) {
var_prev$1892_error = var_$1893_error
} else {
if ((var_$1893_ts == currTs)) {
var_prev$1892_value = var_$1893_lastValue
var_prev$1892_error = var_$1893_lastError
} else {
var_prev$1892_value = var_$1893_value
var_prev$1892_error = var_$1893_error
}
}
}
}
var_$1891_changed = false
if ((var_prev$1892_init)) {
if ((var_prev$1892_changed)) {
var_$1891_unknown = (var_prev$1892_unknown)
if ((var_$1891_unknown)) {
var_$1891_error = UnknownEventError(null)
} else {
var_$1891_error = null
try {
var_$1891_value = !((if((var_prev$1892_error == null)) {var_prev$1892_value} else {throw var_prev$1892_error}))
} catch {
case var_err : Throwable => {
var_$1891_error = var_err
}
}
}
var_$1891_init = true
var_$1891_changed = true
}
}
var_$1800_changed = false
if ((var_$1801_init && var_$1891_init)) {
if ((var_$1801_changed) || (var_$1891_changed)) {
var_$1800_unknown = (var_$1801_unknown && var_$1891_unknown)
if ((var_$1800_unknown)) {
var_$1800_error = UnknownEventError(null)
} else {
var_$1800_error = null
try {
var_$1800_value = ((if((var_$1801_error == null)) {var_$1801_value} else {throw var_$1801_error}) && (if((var_$1891_error == null)) {var_$1891_value} else {throw var_$1891_error}))
} catch {
case var_err : Throwable => {
var_$1800_error = var_err
}
}
}
var_$1800_init = true
var_$1800_changed = true
}
}
var_$1914_changed = false
if ((var_$1803_changed)) {
var_$1914_value = var_$1803_ts
var_$1914_init = true
var_$1914_unknown = var_$1803_unknown
if ((var_$1914_unknown)) {
var_$1914_error = var_$1803_error
} else {
var_$1914_error = null
}
var_$1914_changed = true
}
var_finalFalseSince$1799_changed = false
if ((var_$1800_init && var_$1914_init && var_$1909_init)) {
if ((var_$1800_changed) || (var_$1914_changed) || (var_$1909_changed)) {
var_finalFalseSince$1799_unknown = (var_$1800_unknown && var_$1914_unknown && var_$1909_unknown)
if ((var_finalFalseSince$1799_unknown)) {
var_finalFalseSince$1799_error = UnknownEventError(null)
} else {
var_finalFalseSince$1799_error = null
try {
var_finalFalseSince$1799_value = (if ((if((var_$1800_error == null)) {var_$1800_value} else {throw var_$1800_error})) (if((var_$1914_error == null)) {var_$1914_value} else {throw var_$1914_error}) else (if((var_$1909_error == null)) {var_$1909_value} else {throw var_$1909_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1799_error = var_err
}
}
}
var_finalFalseSince$1799_changed = true
}
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
var_$1622_changed = false
if ((var_$1781_init && var_$1861_init)) {
if ((var_$1781_changed) || (var_$1861_changed)) {
var_$1622_unknown = (var_$1781_unknown && var_$1861_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
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
}
def chunk2() = {
var_$2014_changed = false
if ((var_$1701_init)) {
if ((var_$1701_changed)) {
var_$2014_unknown = (var_$1701_unknown)
if ((var_$2014_unknown)) {
var_$2014_error = UnknownEventError(null)
} else {
var_$2014_error = null
try {
var_$2014_value = (var_head$1667.apply(((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2014_error = var_err
}
}
}
var_$2014_init = true
var_$2014_changed = true
}
}
var_$2006_changed = false
if ((var_$1687_init && var_$2012_init && var_$2014_init)) {
if ((var_$1687_changed) || (var_$2012_changed) || (var_$2014_changed)) {
var_$2006_unknown = (var_$1687_unknown && var_$2012_unknown && var_$2014_unknown)
if ((var_$2006_unknown)) {
var_$2006_error = UnknownEventError(null)
} else {
var_$2006_error = null
try {
var_$2006_value = (if ((if((var_$1687_error == null)) {var_$1687_value} else {throw var_$1687_error})) (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}) else (if((var_$2014_error == null)) {var_$2014_value} else {throw var_$2014_error}))
} catch {
case var_err : Throwable => {
var_$2006_error = var_err
}
}
}
var_$2006_init = true
var_$2006_changed = true
}
}
var_$2005_changed = false
if ((var_$2006_init && var_$2012_init)) {
if ((var_$2006_changed) || (var_$2012_changed)) {
var_$2005_unknown = (var_$2006_unknown && var_$2012_unknown)
if ((var_$2005_unknown)) {
var_$2005_error = UnknownEventError(null)
} else {
var_$2005_error = null
try {
var_$2005_value = ((if((var_$2006_error == null)) {var_$2006_value} else {throw var_$2006_error}) + (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
} catch {
case var_err : Throwable => {
var_$2005_error = var_err
}
}
}
var_$2005_init = true
var_$2005_changed = true
}
}
var_$2004_changed = false
if ((var_$2005_init && var_$1669_init)) {
if ((var_$2005_changed) || (var_$1669_changed)) {
var_$2004_unknown = (var_$2005_unknown && var_$1669_unknown)
if ((var_$2004_unknown)) {
var_$2004_error = UnknownEventError(null)
} else {
var_$2004_error = null
try {
var_$2004_value = ((if((var_$2005_error == null)) {var_$2005_value} else {throw var_$2005_error}) - (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_$2004_error = var_err
}
}
}
var_$2004_init = true
var_$2004_changed = true
}
}
var_$2003_changed = false
if ((var_$2004_init && var_$1845_init)) {
if ((var_$2004_changed) || (var_$1845_changed)) {
var_$2003_unknown = (var_$2004_unknown && var_$1845_unknown)
if ((var_$2003_unknown)) {
var_$2003_error = UnknownEventError(null)
} else {
var_$2003_error = null
try {
var_$2003_value = ((if((var_$2004_error == null)) {var_$2004_value} else {throw var_$2004_error}) + (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
} catch {
case var_err : Throwable => {
var_$2003_error = var_err
}
}
}
var_$2003_init = true
var_$2003_ts = currTs
var_$2003_changed = true
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
var_$2026_changed = false
if ((var_$2003_changed)) {
var_$2026_value = var_$2003_ts
var_$2026_init = true
var_$2026_unknown = var_$2003_unknown
if ((var_$2026_unknown)) {
var_$2026_error = var_$2003_error
} else {
var_$2026_error = null
}
var_$2026_changed = true
}
var_$2023_changed = false
if ((var_$1861_init && var_$2026_init)) {
if ((var_$1861_changed) || (var_$2026_changed)) {
var_$2023_unknown = (var_$1861_unknown && var_$2026_unknown)
if ((var_$2023_unknown)) {
var_$2023_error = UnknownEventError(null)
} else {
var_$2023_error = null
try {
var_$2023_value = ((if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}) - (if((var_$2026_error == null)) {var_$2026_value} else {throw var_$2026_error}))
} catch {
case var_err : Throwable => {
var_$2023_error = var_err
}
}
}
var_$2023_init = true
var_$2023_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1798_changed = false
}
if ((var_finalFalseSince$1799_changed)) {
var_$1798_lastValue = var_$1798_value
var_$1798_lastInit = var_$1798_init
var_$1798_lastError = var_$1798_error
var_$1798_value = var_finalFalseSince$1799_value
var_$1798_init = true
var_$1798_ts = currTs
var_$1798_error = var_finalFalseSince$1799_error
var_$1798_changed = true
var_$1798_unknown = var_finalFalseSince$1799_unknown
}
var_$2002_changed = false
if ((var_$2003_init && var_$2012_init)) {
if ((var_$2003_changed) || (var_$2012_changed)) {
var_$2002_unknown = (var_$2003_unknown && var_$2012_unknown)
if ((var_$2002_unknown)) {
var_$2002_error = UnknownEventError(null)
} else {
var_$2002_error = null
try {
var_$2002_value = ((if((var_$2003_error == null)) {var_$2003_value} else {throw var_$2003_error}) > (if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error}))
} catch {
case var_err : Throwable => {
var_$2002_error = var_err
}
}
}
var_$2002_init = true
var_$2002_changed = true
}
}
var_stillFulfillableReset$1618_changed = false
if ((var_$1767_init && var_$1884_init && var_res$1628_init)) {
if ((var_$1767_changed) || (var_$1884_changed) || (var_res$1628_changed)) {
var_stillFulfillableReset$1618_lastValue = var_stillFulfillableReset$1618_value
var_stillFulfillableReset$1618_lastInit = var_stillFulfillableReset$1618_init
var_stillFulfillableReset$1618_lastError = var_stillFulfillableReset$1618_error
var_stillFulfillableReset$1618_unknown = (var_$1767_unknown && var_$1884_unknown && var_res$1628_unknown)
if ((var_stillFulfillableReset$1618_unknown)) {
var_stillFulfillableReset$1618_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1618_error = null
try {
var_stillFulfillableReset$1618_value = (if ((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error})) (if((var_$1884_error == null)) {var_$1884_value} else {throw var_$1884_error}) else (if((var_res$1628_error == null)) {var_res$1628_value} else {throw var_res$1628_error}))
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
var_$1797_changed = false
if ((var_$1798_init && var_$1861_init)) {
if ((var_$1798_changed) || (var_$1861_changed)) {
var_$1797_unknown = (var_$1798_unknown && var_$1861_unknown)
if ((var_$1797_unknown)) {
var_$1797_error = UnknownEventError(null)
} else {
var_$1797_error = null
try {
var_$1797_value = ((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
} catch {
case var_err : Throwable => {
var_$1797_error = var_err
}
}
}
var_$1797_init = true
var_$1797_changed = true
}
}
var_$1796_changed = false
if ((var_$1797_init && var_$1914_init)) {
if ((var_$1797_changed) || (var_$1914_changed)) {
var_$1796_unknown = (var_$1797_unknown && var_$1914_unknown)
if ((var_$1796_unknown)) {
var_$1796_error = UnknownEventError(null)
} else {
var_$1796_error = null
try {
var_$1796_value = ((if((var_$1797_error == null)) {var_$1797_value} else {throw var_$1797_error}) < (if((var_$1914_error == null)) {var_$1914_value} else {throw var_$1914_error}))
} catch {
case var_err : Throwable => {
var_$1796_error = var_err
}
}
}
var_$1796_init = true
var_$1796_changed = true
}
}
var_isFinalFalseReset$1795_changed = false
if ((var_$1796_init && var_$1786_init && var_$1893_init)) {
if ((var_$1796_changed) || (var_$1786_changed) || (var_$1893_changed)) {
var_isFinalFalseReset$1795_unknown = (var_$1796_unknown && var_$1786_unknown && var_$1893_unknown)
if ((var_isFinalFalseReset$1795_unknown)) {
var_isFinalFalseReset$1795_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1795_error = null
try {
var_isFinalFalseReset$1795_value = (if ((if((var_$1796_error == null)) {var_$1796_value} else {throw var_$1796_error})) (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}) else (if((var_$1893_error == null)) {var_$1893_value} else {throw var_$1893_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1795_error = var_err
}
}
}
var_isFinalFalseReset$1795_changed = true
}
}
var_$1896_changed = false
if ((var_isFinalFalseReset$1795_changed) || (var_$1893_changed)) {
var_$1896_lastValue = var_$1896_value
var_$1896_lastInit = var_$1896_init
var_$1896_lastError = var_$1896_error
var_$1896_init = true
var_$1896_ts = currTs
var_$1896_changed = true
var_$1896_unknown = (var_isFinalFalseReset$1795_unknown && var_$1893_unknown)
if ((var_isFinalFalseReset$1795_changed)) {
var_$1896_value = var_isFinalFalseReset$1795_value
var_$1896_error = var_isFinalFalseReset$1795_error
} else {
if ((var_$1893_changed)) {
var_$1896_value = var_$1893_value
var_$1896_error = var_$1893_error
}
}
}
var_stillFulfillableReset$1793_changed = false
if ((var_$1896_init && var_$1884_init && var_$1803_init)) {
if ((var_$1896_changed) || (var_$1884_changed) || (var_$1803_changed)) {
var_stillFulfillableReset$1793_unknown = (var_$1896_unknown && var_$1884_unknown && var_$1803_unknown)
if ((var_stillFulfillableReset$1793_unknown)) {
var_stillFulfillableReset$1793_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1793_error = null
try {
var_stillFulfillableReset$1793_value = (if ((if((var_$1896_error == null)) {var_$1896_value} else {throw var_$1896_error})) (if((var_$1884_error == null)) {var_$1884_value} else {throw var_$1884_error}) else (if((var_$1803_error == null)) {var_$1803_value} else {throw var_$1803_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1793_error = var_err
}
}
}
var_stillFulfillableReset$1793_init = true
var_stillFulfillableReset$1793_changed = true
}
}
var_sporadicConstraint$1617_changed = false
if ((var_stillFulfillableReset$1618_init && var_stillFulfillableReset$1793_init)) {
if ((var_stillFulfillableReset$1618_changed) || (var_stillFulfillableReset$1793_changed)) {
var_sporadicConstraint$1617_unknown = (var_stillFulfillableReset$1618_unknown && var_stillFulfillableReset$1793_unknown)
if ((var_sporadicConstraint$1617_unknown)) {
var_sporadicConstraint$1617_error = UnknownEventError(null)
} else {
var_sporadicConstraint$1617_error = null
try {
var_sporadicConstraint$1617_value = var_fourValuedConjunction$1922.apply((if((var_stillFulfillableReset$1618_error == null)) {var_stillFulfillableReset$1618_value} else {throw var_stillFulfillableReset$1618_error}), (if((var_stillFulfillableReset$1793_error == null)) {var_stillFulfillableReset$1793_value} else {throw var_stillFulfillableReset$1793_error}))
} catch {
case var_err : Throwable => {
var_sporadicConstraint$1617_error = var_err
}
}
}
var_sporadicConstraint$1617_init = true
var_sporadicConstraint$1617_changed = true
}
}
var_value$1616_changed = false
if ((var_sporadicConstraint$1617_init)) {
if ((var_sporadicConstraint$1617_changed)) {
var_value$1616_unknown = (var_sporadicConstraint$1617_unknown)
if ((var_value$1616_unknown)) {
var_value$1616_error = UnknownEventError(null)
} else {
var_value$1616_error = null
try {
var_value$1616_value = var_$1776.apply((if((var_sporadicConstraint$1617_error == null)) {var_sporadicConstraint$1617_value} else {throw var_sporadicConstraint$1617_error}))
} catch {
case var_err : Throwable => {
var_value$1616_error = var_err
}
}
}
var_value$1616_init = true
var_value$1616_changed = true
}
}
var_final$1924_changed = false
if ((var_sporadicConstraint$1617_init)) {
if ((var_sporadicConstraint$1617_changed)) {
var_final$1924_unknown = (var_sporadicConstraint$1617_unknown)
if ((var_final$1924_unknown)) {
var_final$1924_error = UnknownEventError(null)
} else {
var_final$1924_error = null
try {
var_final$1924_value = var_$1771.apply((if((var_sporadicConstraint$1617_error == null)) {var_sporadicConstraint$1617_value} else {throw var_sporadicConstraint$1617_error}))
} catch {
case var_err : Throwable => {
var_final$1924_error = var_err
}
}
}
var_final$1924_init = true
var_final$1924_changed = true
}
}
var_$1942_changed = false
if ((var_$2002_init && var_$2003_init && var_$2023_init)) {
if ((var_$2002_changed) || (var_$2003_changed) || (var_$2023_changed)) {
var_$1942_unknown = (var_$2002_unknown && var_$2003_unknown && var_$2023_unknown)
if ((var_$1942_unknown)) {
var_$1942_error = UnknownEventError(null)
} else {
var_$1942_error = null
try {
var_$1942_value = (if ((if((var_$2002_error == null)) {var_$2002_value} else {throw var_$2002_error})) (if((var_$2003_error == null)) {var_$2003_value} else {throw var_$2003_error}) else (if((var_$2023_error == null)) {var_$2023_value} else {throw var_$2023_error}))
} catch {
case var_err : Throwable => {
var_$1942_error = var_err
}
}
}
var_$1942_changed = true
}
}
}


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
if (((var_safeDelay$1853_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1853_nextTs))) {
currTs = var_safeDelay$1853_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

chunk1()
chunk2()


if ((var_event_unknown) || (!(var_$1942_error == null)) || (var_$1942_changed && (0L >= var_$1942_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1942_changed)) {
if ((var_safeDelay$1745_changed) || (var_event_changed)) {
var_safeDelay$1745_nextTs = (currTs + var_$1942_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1745_nextTs = -1L
}
}
}
if ((var_event_unknown) || (!(var_$1951_error == null)) || (var_$1951_changed && (0L >= var_$1951_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1951_changed)) {
if ((var_safeDelay$1853_changed) || (var_event_changed)) {
var_safeDelay$1853_nextTs = (currTs + var_$1951_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1853_nextTs = -1L
}
}
}
if ((var_value$1616_changed && var_value$1616_init)) {
out_value.apply(var_value$1616_value, currTs, "value", var_value$1616_error)
}
if ((var_final$1924_changed && var_final$1924_init)) {
out_final.apply(var_final$1924_value, currTs, "final", var_final$1924_error)
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
