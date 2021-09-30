//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_max$1673 : scala.Function2[Long, Long, Long] = ((var_a$1931 : Long, var_b$1932 : Long) => {
val var_$1933 : Long = (if ((var_a$1931 > var_b$1932)) var_a$1931 else var_b$1932)
var_$1933
})
val var_fourValuedConjunction$1923 : scala.Function2[(Boolean, Boolean), (Boolean, Boolean), (Boolean, Boolean)] = ((var_a$1961 : (Boolean, Boolean), var_b$1962 : (Boolean, Boolean)) => {
lazy val var_$1978 : Boolean = var_a$1961._2
lazy val var_$1969 : Boolean = !(var_$1978)
lazy val var_$1970 : Boolean = var_a$1961._1
lazy val var_$1994 : Boolean = !(var_$1970)
lazy val var_$1979 : Boolean = var_b$1962._2
lazy val var_$1971 : Boolean = !(var_$1979)
lazy val var_$1992 : Boolean = var_b$1962._1
lazy val var_$1983 : Boolean = !(var_$1992)
val var_$1963 : (Boolean, Boolean) = (if (((var_$1969 && var_$1970) || (var_$1971 && var_$1992))) (true, false) else (if (((var_$1969 && var_$1994) || (var_$1971 && var_$1983))) (false, false) else (if (((var_$1978 && var_$1994) || (var_$1979 && var_$1983))) (false, true) else (true, true))))
var_$1963
})
val var_head$1668 : scala.Function1[List[Any], Any] = ((var_list$1929 : List[Any]) => {
val var_$1930 : Any = var_list$1929(0L.asInstanceOf[Int])
var_$1930
})
val var_$1924 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1999 : (Boolean, Boolean)) => {
val var_$2000 : Boolean = var_$1999._1
var_$2000
})
val var_min$1722 : scala.Function2[Long, Long, Long] = ((var_a$1938 : Long, var_b$1939 : Long) => {
val var_$1940 : Long = (if ((var_a$1938 < var_b$1939)) var_a$1938 else var_b$1939)
var_$1940
})
val var_$1926 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$2001 : (Boolean, Boolean)) => {
val var_$2002 : Boolean = var_$2001._2
var_$2002
})
lazy val var_$1734 : List[Long] = List[Long]()
val var_$1884 : (Boolean, Boolean) = (false, true)
val var_$1870 : (Boolean, Boolean) = (true, false)
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_event_lastError : Throwable = null
val var_event_error : Throwable = null
val var_event_unknown : Boolean = false
var set_var_event : scala.Function2[Long, Long, Unit] = null
var var_event_lastInit : Boolean = false
var var_event_init : Boolean = false
var var_event_ts : Long = 0L
var var_event_changed : Boolean = false

out_final = null
out_value = null
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
var var_$1810_changed : Boolean = false
var var_$1810_value : Long = 0L
var var_$1810_init : Boolean = false
var var_$1810_unknown : Boolean = false
var var_$1810_error : Throwable = null
var var_defaultTime$2036_changed : Boolean = true
var var_defaultTime$2036_value : Long = -1L
var var_defaultTime$2036_init : Boolean = true
var var_defaultTime$2036_error : Throwable = null
var var_defaultTime$2036_unknown : Boolean = false
val var_$1736_value : Long = 0L
val var_$1736_error : Throwable = null
val var_$1736_changed : Boolean = false
val var_$1736_unknown : Boolean = false
var var_$2022_changed : Boolean = true
var var_$2022_value : Long = 0L
var var_$2022_init : Boolean = true
var var_$2022_error : Throwable = null
var var_$2022_unknown : Boolean = false
var var_latestSpanEventTimes$1808_changed : Boolean = false
var var_latestSpanEventTimes$1808_unknown : Boolean = false
var var_latestSpanEventTimes$1808_error : Throwable = null
var var_latestSpanEventTimes$1808_value : Boolean = false
var var_latestSpanEventTimes$1808_init : Boolean = false
val var_$1684_value : List[Long] = List[Long]()
val var_$1684_error : Throwable = null
val var_$1684_changed : Boolean = false
val var_$1684_unknown : Boolean = false
var var_LowerBoundX$1683_changed : Boolean = true
var var_LowerBoundX$1683_value : List[Long] = var_$1734
var var_LowerBoundX$1683_init : Boolean = true
var var_LowerBoundX$1683_error : Throwable = null
var var_LowerBoundX$1683_unknown : Boolean = false
var var_latestSpanEventTimes$1813_changed : Boolean = false
var var_latestSpanEventTimes$1813_unknown : Boolean = false
var var_latestSpanEventTimes$1813_error : Throwable = null
var var_latestSpanEventTimes$1813_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1813_init : Boolean = false
var var_$1824_changed : Boolean = false
var var_$1824_init : Boolean = false
var var_$1824_unknown : Boolean = false
var var_$1824_error : Throwable = null
var var_$1824_value : List[Long] = List[Long]()
var var_$1823_changed : Boolean = false
var var_$1823_unknown : Boolean = false
var var_$1823_error : Throwable = null
var var_$1823_value : Long = 0L
var var_$1823_init : Boolean = false
var var_$1703_changed : Boolean = true
var var_$1703_value : Long = 1L
var var_$1703_init : Boolean = true
var var_$1703_error : Throwable = null
var var_$1703_unknown : Boolean = false
var var_$1822_changed : Boolean = false
var var_$1822_unknown : Boolean = false
var var_$1822_error : Throwable = null
var var_$1822_value : Boolean = false
var var_$1822_init : Boolean = false
var var_$1829_changed : Boolean = false
var var_$1829_init : Boolean = false
var var_$1829_unknown : Boolean = false
var var_$1829_error : Throwable = null
var var_$1829_value : List[Long] = List[Long]()
var var_$1828_changed : Boolean = false
var var_$1828_unknown : Boolean = false
var var_$1828_error : Throwable = null
var var_$1828_value : List[Long] = List[Long]()
var var_$1828_init : Boolean = false
var var_$1821_changed : Boolean = false
var var_$1821_unknown : Boolean = false
var var_$1821_error : Throwable = null
var var_$1821_value : List[Long] = List[Long]()
var var_$1821_init : Boolean = false
var var_$1820_changed : Boolean = false
var var_$1820_unknown : Boolean = false
var var_$1820_error : Throwable = null
var var_$1820_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1819_changed : Boolean = true
var var_latestSpanEventTimes$1819_value : List[Long] = var_$1734
var var_latestSpanEventTimes$1819_init : Boolean = true
var var_latestSpanEventTimes$1819_error : Throwable = null
var var_latestSpanEventTimes$1819_unknown : Boolean = false
var var_$1834_changed : Boolean = false
var var_$1834_lastValue : List[Long] = List[Long]()
var var_$1834_lastInit : Boolean = false
var var_$1834_lastError : Throwable = null
var var_$1834_unknown : Boolean = false
var var_$1834_error : Throwable = null
var var_$1834_value : List[Long] = List[Long]()
var var_$1834_init : Boolean = false
var var_$1834_ts : Long = 0L
var var_$1806_changed : Boolean = false
var var_$1806_unknown : Boolean = false
var var_$1806_error : Throwable = null
var var_$1806_value : Long = 0L
var var_$1806_init : Boolean = false
var var_$1805_changed : Boolean = false
var var_$1805_unknown : Boolean = false
var var_$1805_error : Throwable = null
var var_$1805_value : Boolean = false
var var_$1805_init : Boolean = false
var var_$1860_changed : Boolean = false
var var_$1860_unknown : Boolean = false
var var_$1860_error : Throwable = null
var var_$1860_value : Long = 0L
var var_$1860_init : Boolean = false
var var_$1843_changed : Boolean = false
var var_$1843_unknown : Boolean = false
var var_$1843_error : Throwable = null
var var_$1843_value : Long = 0L
var var_$1843_init : Boolean = false
var var_$1850_changed : Boolean = false
var var_$1850_error : Throwable = null
var var_$1850_unknown : Boolean = false
var var_safeDelay$1854_changed : Boolean = false
val var_safeDelay$1854_error : Throwable = null
var var_safeDelay$1854_unknown : Boolean = false
var var_$1852_changed : Boolean = false
var var_$1852_error : Throwable = null
var var_$1852_unknown : Boolean = false
var var_mergeUnit2$1849_changed : Boolean = false
var var_mergeUnit2$1849_ts : Long = 0L
var var_mergeUnit2$1849_unknown : Boolean = false
var var_mergeUnit2$1849_error : Throwable = null
var var_$1848_changed : Boolean = false
var var_$1848_value : Long = 0L
var var_$1848_init : Boolean = false
var var_$1848_unknown : Boolean = false
var var_$1848_error : Throwable = null
var var_$1842_changed : Boolean = false
var var_$1842_unknown : Boolean = false
var var_$1842_error : Throwable = null
var var_$1842_value : Boolean = false
var var_$1842_init : Boolean = false
val var_$2073_value : Boolean = false
val var_$2073_error : Throwable = null
val var_$2073_changed : Boolean = false
val var_$2073_unknown : Boolean = false
var var_$1873_changed : Boolean = true
var var_$1873_value : Boolean = true
var var_$1873_init : Boolean = true
var var_$1873_error : Throwable = null
var var_$1873_unknown : Boolean = false
var var_$2066_changed : Boolean = true
var var_$2066_value : Long = 9223372036854775807L
var var_$2066_init : Boolean = true
var var_$2066_error : Throwable = null
var var_$2066_unknown : Boolean = false
var var_$1859_changed : Boolean = false
var var_$1859_unknown : Boolean = false
var var_$1859_error : Throwable = null
var var_$1859_value : Long = 0L
var var_$1859_init : Boolean = false
var var_$1875_changed : Boolean = false
var var_$1875_unknown : Boolean = false
var var_$1875_error : Throwable = null
var var_$1875_value : Boolean = false
var var_$1875_init : Boolean = false
var var_$1872_changed : Boolean = false
var var_$1872_unknown : Boolean = false
var var_$1872_error : Throwable = null
var var_$1872_value : Boolean = false
var var_$1872_init : Boolean = false
var var_$1841_changed : Boolean = false
var var_$1841_unknown : Boolean = false
var var_$1841_error : Throwable = null
var var_$1841_value : Boolean = false
var var_$1841_init : Boolean = false
val var_$1886_value : (Boolean, Boolean) = (false, false)
val var_$1886_error : Throwable = null
val var_$1886_changed : Boolean = false
val var_$1886_unknown : Boolean = false
var var_$1882_changed : Boolean = true
var var_$1882_value : (Boolean, Boolean) = var_$1884
var var_$1882_init : Boolean = true
var var_$1882_error : Throwable = null
var var_$1882_unknown : Boolean = false
var var_$1920_changed : Boolean = true
var var_$1920_value : (Boolean, Boolean) = var_$1870
var var_$1920_init : Boolean = true
var var_$1920_error : Throwable = null
var var_$1920_unknown : Boolean = false
var var_$1840_changed : Boolean = false
var var_$1840_unknown : Boolean = false
var var_$1840_error : Throwable = null
var var_$1840_value : (Boolean, Boolean) = (false, false)
var var_$1840_init : Boolean = false
var var_$1871_changed : Boolean = false
var var_$1871_unknown : Boolean = false
var var_$1871_error : Throwable = null
var var_$1871_value : (Boolean, Boolean) = (false, false)
var var_$1871_init : Boolean = false
var var_$1804_changed : Boolean = false
var var_$1804_unknown : Boolean = false
var var_$1804_error : Throwable = null
var var_$1804_value : (Boolean, Boolean) = (false, false)
var var_$1804_init : Boolean = false
var var_$1804_ts : Long = 0L
var var_$1900_changed : Boolean = false
var var_$1900_unknown : Boolean = false
var var_$1900_error : Throwable = null
var var_$1900_value : Boolean = false
var var_$1900_init : Boolean = false
var var_$1905_changed : Boolean = false
var var_$1905_unknown : Boolean = false
var var_$1905_error : Throwable = null
var var_$1905_value : Boolean = false
var var_$1905_init : Boolean = false
var var_$1889_changed : Boolean = false
var var_$1889_unknown : Boolean = false
var var_$1889_error : Throwable = null
var var_$1889_value : Boolean = false
var var_$1889_init : Boolean = false
var var_$1802_changed : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1802_value : Boolean = false
var var_$1802_init : Boolean = false
var var_$1896_changed : Boolean = false
var var_$1896_init : Boolean = false
var var_$1896_unknown : Boolean = false
var var_$1896_error : Throwable = null
var var_$1896_value : Boolean = false
var var_$1899_changed : Boolean = false
var var_$1899_unknown : Boolean = false
var var_$1899_error : Throwable = null
var var_$1899_value : Boolean = false
var var_$1899_init : Boolean = false
var var_$1916_changed : Boolean = true
var var_$1916_value : Boolean = false
var var_$1916_init : Boolean = true
var var_$1916_error : Throwable = null
var var_$1916_unknown : Boolean = false
var var_$1904_changed : Boolean = false
var var_$1904_unknown : Boolean = false
var var_$1904_error : Throwable = null
var var_$1904_value : Boolean = false
var var_$1904_init : Boolean = false
var var_$1898_changed : Boolean = false
var var_$1898_unknown : Boolean = false
var var_$1898_error : Throwable = null
var var_$1898_value : Boolean = false
var var_$1898_init : Boolean = false
var var_isFinalFalse$1895_changed : Boolean = false
var var_isFinalFalse$1895_unknown : Boolean = false
var var_isFinalFalse$1895_error : Throwable = null
var var_isFinalFalse$1895_value : Boolean = false
var var_$1894_changed : Boolean = true
var var_$1894_lastValue : Boolean = false
var var_$1894_lastInit : Boolean = false
var var_$1894_lastError : Throwable = null
var var_$1894_value : Boolean = false
var var_$1894_init : Boolean = true
var var_$1894_ts : Long = 0L
var var_$1894_error : Throwable = null
var var_$1894_unknown : Boolean = false
var var_prev$1893_changed : Boolean = false
var var_prev$1893_init : Boolean = false
var var_prev$1893_unknown : Boolean = false
var var_prev$1893_error : Throwable = null
var var_prev$1893_value : Boolean = false
var var_$1892_changed : Boolean = false
var var_$1892_unknown : Boolean = false
var var_$1892_error : Throwable = null
var var_$1892_value : Boolean = false
var var_$1892_init : Boolean = false
var var_$1801_changed : Boolean = false
var var_$1801_unknown : Boolean = false
var var_$1801_error : Throwable = null
var var_$1801_value : Boolean = false
var var_$1801_init : Boolean = false
var var_$1637_changed : Boolean = false
var var_$1637_init : Boolean = false
var var_$1637_unknown : Boolean = false
var var_$1637_error : Throwable = null
var var_$1637_value : (Boolean, Boolean) = (false, false)
var var_$1692_changed : Boolean = false
var var_$1692_unknown : Boolean = false
var var_$1692_error : Throwable = null
var var_$1692_value : Boolean = false
var var_$1692_init : Boolean = false
var var_$1701_changed : Boolean = false
var var_$1701_init : Boolean = false
var var_$1701_unknown : Boolean = false
var var_$1701_error : Throwable = null
var var_$1701_value : List[Long] = List[Long]()
var var_$1700_changed : Boolean = false
var var_$1700_unknown : Boolean = false
var var_$1700_error : Throwable = null
var var_$1700_value : Long = 0L
var var_$1700_init : Boolean = false
var var_$1699_changed : Boolean = false
var var_$1699_unknown : Boolean = false
var var_$1699_error : Throwable = null
var var_$1699_value : Boolean = false
var var_$1699_init : Boolean = false
var var_$1718_changed : Boolean = false
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_$1718_value : Long = 0L
var var_$1718_init : Boolean = false
var var_upperBoundXNow$1717_changed : Boolean = false
var var_upperBoundXNow$1717_unknown : Boolean = false
var var_upperBoundXNow$1717_error : Throwable = null
var var_upperBoundXNow$1717_value : Long = 0L
var var_upperBoundXNow$1717_init : Boolean = false
var var_$1729_changed : Boolean = false
var var_$1729_unknown : Boolean = false
var var_$1729_error : Throwable = null
var var_$1729_value : Long = 0L
var var_$1729_init : Boolean = false
var var_$1730_changed : Boolean = true
var var_$1730_value : Long = 600L
var var_$1730_init : Boolean = true
var var_$1730_error : Throwable = null
var var_$1730_unknown : Boolean = false
var var_$1728_changed : Boolean = false
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_$1728_value : Long = 0L
var var_$1728_init : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : List[Long] = List[Long]()
var var_$1705_init : Boolean = false
var var_$1726_changed : Boolean = false
var var_$1726_init : Boolean = false
var var_$1726_unknown : Boolean = false
var var_$1726_error : Throwable = null
var var_$1726_value : List[Long] = List[Long]()
var var_$1725_changed : Boolean = false
var var_$1725_unknown : Boolean = false
var var_$1725_error : Throwable = null
var var_$1725_value : List[Long] = List[Long]()
var var_$1725_init : Boolean = false
var var_$1698_changed : Boolean = false
var var_$1698_unknown : Boolean = false
var var_$1698_error : Throwable = null
var var_$1698_value : List[Long] = List[Long]()
var var_$1698_init : Boolean = false
var var_UpperBoundX$1691_changed : Boolean = false
var var_UpperBoundX$1691_unknown : Boolean = false
var var_UpperBoundX$1691_error : Throwable = null
var var_UpperBoundX$1691_value : List[Long] = List[Long]()
var var_$1707_changed : Boolean = false
var var_$1707_lastValue : List[Long] = List[Long]()
var var_$1707_lastInit : Boolean = false
var var_$1707_lastError : Throwable = null
var var_$1707_init : Boolean = false
var var_$1707_ts : Long = 0L
var var_$1707_unknown : Boolean = false
var var_$1707_value : List[Long] = List[Long]()
var var_$1707_error : Throwable = null
var var_$2015_changed : Boolean = false
var var_$2015_unknown : Boolean = false
var var_$2015_error : Throwable = null
var var_$2015_value : Long = 0L
var var_$2015_init : Boolean = false
var var_$1656_changed : Boolean = false
var var_$1656_init : Boolean = false
var var_$1656_unknown : Boolean = false
var var_$1656_error : Throwable = null
var var_$1656_value : List[Long] = List[Long]()
var var_$1655_changed : Boolean = false
var var_$1655_unknown : Boolean = false
var var_$1655_error : Throwable = null
var var_$1655_value : Long = 0L
var var_$1655_init : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : Boolean = false
var var_$1643_init : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_$1665_changed : Boolean = false
var var_$1665_unknown : Boolean = false
var var_$1665_error : Throwable = null
var var_$1665_value : Long = 0L
var var_$1665_init : Boolean = false
var var_lowerBoundXNow$1664_changed : Boolean = false
var var_lowerBoundXNow$1664_unknown : Boolean = false
var var_lowerBoundXNow$1664_error : Throwable = null
var var_lowerBoundXNow$1664_value : Long = 0L
var var_lowerBoundXNow$1664_init : Boolean = false
var var_$1653_changed : Boolean = false
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : Long = 0L
var var_$1653_init : Boolean = false
var var_$1681_changed : Boolean = true
var var_$1681_value : Long = 500L
var var_$1681_init : Boolean = true
var var_$1681_error : Throwable = null
var var_$1681_unknown : Boolean = false
var var_$1679_changed : Boolean = false
var var_$1679_unknown : Boolean = false
var var_$1679_error : Throwable = null
var var_$1679_value : Long = 0L
var var_$1679_init : Boolean = false
var var_$1649_changed : Boolean = false
var var_$1649_unknown : Boolean = false
var var_$1649_error : Throwable = null
var var_$1649_value : List[Long] = List[Long]()
var var_$1649_init : Boolean = false
var var_$1677_changed : Boolean = false
var var_$1677_init : Boolean = false
var var_$1677_unknown : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_value : List[Long] = List[Long]()
var var_$1676_changed : Boolean = false
var var_$1676_unknown : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_value : List[Long] = List[Long]()
var var_$1676_init : Boolean = false
var var_$1642_changed : Boolean = false
var var_$1642_unknown : Boolean = false
var var_$1642_error : Throwable = null
var var_$1642_value : List[Long] = List[Long]()
var var_$1642_init : Boolean = false
var var_LowerBoundX$1635_changed : Boolean = false
var var_LowerBoundX$1635_unknown : Boolean = false
var var_LowerBoundX$1635_error : Throwable = null
var var_LowerBoundX$1635_value : List[Long] = List[Long]()
var var_$1935_changed : Boolean = false
var var_$1935_lastValue : List[Long] = List[Long]()
var var_$1935_lastInit : Boolean = false
var var_$1935_lastError : Throwable = null
var var_$1935_init : Boolean = false
var var_$1935_ts : Long = 0L
var var_$1935_unknown : Boolean = false
var var_$1935_value : List[Long] = List[Long]()
var var_$1935_error : Throwable = null
var var_$1633_changed : Boolean = false
var var_$1633_unknown : Boolean = false
var var_$1633_error : Throwable = null
var var_$1633_value : Long = 0L
var var_$1633_init : Boolean = false
var var_$1632_changed : Boolean = false
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : Boolean = false
var var_$1632_init : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1689_value : Long = 0L
var var_$1689_init : Boolean = false
var var_$1688_changed : Boolean = false
var var_$1688_unknown : Boolean = false
var var_$1688_error : Throwable = null
var var_$1688_value : Boolean = false
var var_$1688_init : Boolean = false
var var_$1631_changed : Boolean = false
var var_$1631_unknown : Boolean = false
var var_$1631_error : Throwable = null
var var_$1631_value : Boolean = false
var var_$1631_init : Boolean = false
var var_safeDelay$1746_changed : Boolean = false
val var_safeDelay$1746_error : Throwable = null
var var_safeDelay$1746_unknown : Boolean = false
var var_$1744_changed : Boolean = false
var var_$1744_error : Throwable = null
var var_$1744_unknown : Boolean = false
var var_mergeUnit2$1741_changed : Boolean = false
var var_mergeUnit2$1741_ts : Long = 0L
var var_mergeUnit2$1741_unknown : Boolean = false
var var_mergeUnit2$1741_error : Throwable = null
var var_$1752_changed : Boolean = false
var var_$1752_value : Long = 0L
var var_$1752_init : Boolean = false
var var_$1752_unknown : Boolean = false
var var_$1752_error : Throwable = null
var var_$1738_changed : Boolean = false
var var_$1738_unknown : Boolean = false
var var_$1738_error : Throwable = null
var var_$1738_value : Boolean = false
var var_$1738_init : Boolean = false
var var_$1748_changed : Boolean = false
var var_$1748_unknown : Boolean = false
var var_$1748_error : Throwable = null
var var_$1748_value : Long = 0L
var var_$1748_init : Boolean = false
var var_$1747_changed : Boolean = false
var var_$1747_unknown : Boolean = false
var var_$1747_error : Throwable = null
var var_$1747_value : Boolean = false
var var_$1747_init : Boolean = false
var var_$1737_changed : Boolean = false
var var_$1737_unknown : Boolean = false
var var_$1737_error : Throwable = null
var var_$1737_value : Boolean = false
var var_$1737_init : Boolean = false
var var_$1630_changed : Boolean = false
var var_$1630_unknown : Boolean = false
var var_$1630_error : Throwable = null
var var_$1630_value : Boolean = false
var var_$1630_init : Boolean = false
var var_res$1629_changed : Boolean = false
var var_res$1629_unknown : Boolean = false
var var_res$1629_error : Throwable = null
var var_res$1629_value : (Boolean, Boolean) = (false, false)
var var_res$1629_init : Boolean = false
var var_res$1629_ts : Long = 0L
var var_$1767_changed : Boolean = false
var var_$1767_init : Boolean = false
var var_$1767_unknown : Boolean = false
var var_$1767_error : Throwable = null
var var_$1767_value : Boolean = false
var var_$1771_changed : Boolean = false
var var_$1771_unknown : Boolean = false
var var_$1771_error : Throwable = null
var var_$1771_value : Boolean = false
var var_$1771_init : Boolean = false
var var_$1770_changed : Boolean = false
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1770_value : Boolean = false
var var_$1770_init : Boolean = false
var var_$1776_changed : Boolean = false
var var_$1776_unknown : Boolean = false
var var_$1776_error : Throwable = null
var var_$1776_value : Boolean = false
var var_$1776_init : Boolean = false
var var_$1775_changed : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : Boolean = false
var var_$1775_init : Boolean = false
var var_$1769_changed : Boolean = false
var var_$1769_unknown : Boolean = false
var var_$1769_error : Throwable = null
var var_$1769_value : Boolean = false
var var_$1769_init : Boolean = false
var var_isFinalFalse$1766_changed : Boolean = false
var var_isFinalFalse$1766_unknown : Boolean = false
var var_isFinalFalse$1766_error : Throwable = null
var var_isFinalFalse$1766_value : Boolean = false
var var_$1765_changed : Boolean = true
var var_$1765_lastValue : Boolean = false
var var_$1765_lastInit : Boolean = false
var var_$1765_lastError : Throwable = null
var var_$1765_value : Boolean = false
var var_$1765_init : Boolean = true
var var_$1765_ts : Long = 0L
var var_$1765_error : Throwable = null
var var_$1765_unknown : Boolean = false
var var_delayPeriod$2032_changed : Boolean = true
var var_delayPeriod$2032_value : Long = -1L
var var_delayPeriod$2032_init : Boolean = true
var var_delayPeriod$2032_error : Throwable = null
var var_delayPeriod$2032_unknown : Boolean = false
var var_$2070_changed : Boolean = false
var var_$2070_unknown : Boolean = false
var var_$2070_error : Throwable = null
var var_$2069_changed : Boolean = false
var var_$2069_value : Boolean = false
var var_$2069_error : Throwable = null
var var_$2069_unknown : Boolean = false
var var_$2071_changed : Boolean = false
var var_$2071_value : Boolean = false
var var_$2071_error : Throwable = null
var var_$2071_unknown : Boolean = false
var var_isFirst$2041_init : Boolean = false
var var_isFirst$2041_unknown : Boolean = false
var var_isFirst$2041_value : Boolean = false
var var_isFirst$2041_error : Throwable = null
var var_firstEvent$2040_changed : Boolean = false
var var_firstEvent$2040_error : Throwable = null
var var_firstEvent$2040_ts : Long = 0L
var var_firstEvent$2040_unknown : Boolean = false
var var_$2039_changed : Boolean = false
var var_$2039_value : Long = 0L
var var_$2039_unknown : Boolean = false
var var_$2039_error : Throwable = null
var var_defaultTime$2038_changed : Boolean = true
var var_defaultTime$2038_value : Long = -1L
var var_defaultTime$2038_init : Boolean = true
var var_defaultTime$2038_error : Throwable = null
var var_defaultTime$2038_unknown : Boolean = false
var var_$2035_changed : Boolean = false
var var_$2035_unknown : Boolean = false
var var_$2035_error : Throwable = null
var var_$2035_value : Boolean = false
var var_$2035_init : Boolean = false
var var_$2043_changed : Boolean = false
var var_$2043_unknown : Boolean = false
var var_$2043_error : Throwable = null
var var_$2043_value : Long = 0L
var var_$2043_init : Boolean = false
var var_$2042_changed : Boolean = false
var var_$2042_unknown : Boolean = false
var var_$2042_error : Throwable = null
var var_$2042_value : Long = 0L
var var_$2042_init : Boolean = false
var var_$2056_changed : Boolean = false
var var_$2056_unknown : Boolean = false
var var_$2056_error : Throwable = null
var var_$2056_value : List[Long] = List[Long]()
var var_$2056_init : Boolean = false
var var_$2055_changed : Boolean = false
var var_$2055_unknown : Boolean = false
var var_$2055_error : Throwable = null
var var_$2055_value : Long = 0L
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
var var_delayPeriod$2034_changed : Boolean = false
var var_delayPeriod$2034_unknown : Boolean = false
var var_delayPeriod$2034_error : Throwable = null
var var_delayPeriod$2034_value : Long = 0L
var var_delayPeriod$2034_init : Boolean = false
var var_$2029_changed : Boolean = false
var var_$2029_unknown : Boolean = false
var var_$2029_error : Throwable = null
var var_$2029_value : Long = 0L
var var_$2029_init : Boolean = false
var var_$2029_ts : Long = 0L
var var_$1909_changed : Boolean = false
var var_$1909_value : Long = 0L
var var_$1909_init : Boolean = false
var var_$1909_unknown : Boolean = false
var var_$1909_error : Throwable = null
var var_$1760_changed : Boolean = false
var var_$1760_unknown : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_value : Boolean = false
var var_$1760_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : Boolean = false
var var_$1627_init : Boolean = false
var var_prev$1764_changed : Boolean = false
var var_prev$1764_init : Boolean = false
var var_prev$1764_unknown : Boolean = false
var var_prev$1764_error : Throwable = null
var var_prev$1764_value : Boolean = false
var var_$1763_changed : Boolean = false
var var_$1763_unknown : Boolean = false
var var_$1763_error : Throwable = null
var var_$1763_value : Boolean = false
var var_$1763_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_$1786_changed : Boolean = false
var var_$1786_value : Long = 0L
var var_$1786_init : Boolean = false
var var_$1786_unknown : Boolean = false
var var_$1786_error : Throwable = null
var var_$1781_changed : Boolean = false
var var_$1781_init : Boolean = false
var var_$1781_unknown : Boolean = false
var var_$1781_error : Throwable = null
var var_$1781_value : Long = 0L
var var_finalFalseSince$1625_changed : Boolean = false
var var_finalFalseSince$1625_unknown : Boolean = false
var var_finalFalseSince$1625_error : Throwable = null
var var_finalFalseSince$1625_value : Long = 0L
var var_$1782_changed : Boolean = true
var var_$1782_lastValue : Long = 0L
var var_$1782_lastInit : Boolean = false
var var_$1782_lastError : Throwable = null
var var_$1782_value : Long = 9223372036854775807L
var var_$1782_init : Boolean = true
var var_$1782_ts : Long = 0L
var var_$1782_error : Throwable = null
var var_$1782_unknown : Boolean = false
var var_$1623_changed : Boolean = false
var var_$1623_unknown : Boolean = false
var var_$1623_error : Throwable = null
var var_$1623_value : Long = 0L
var var_$1623_init : Boolean = false
var var_$1622_changed : Boolean = false
var var_$1622_unknown : Boolean = false
var var_$1622_error : Throwable = null
var var_$1622_value : Boolean = false
var var_$1622_init : Boolean = false
var var_isFinalFalseReset$1621_changed : Boolean = false
var var_isFinalFalseReset$1621_unknown : Boolean = false
var var_isFinalFalseReset$1621_error : Throwable = null
var var_isFinalFalseReset$1621_value : Boolean = false
var var_$1620_changed : Boolean = false
var var_$1620_lastValue : Boolean = false
var var_$1620_lastInit : Boolean = false
var var_$1620_lastError : Throwable = null
var var_$1620_init : Boolean = false
var var_$1620_ts : Long = 0L
var var_$1620_unknown : Boolean = false
var var_$1620_value : Boolean = false
var var_$1620_error : Throwable = null
var var_$1910_changed : Boolean = false
var var_$1910_init : Boolean = false
var var_$1910_unknown : Boolean = false
var var_$1910_error : Throwable = null
var var_$1910_value : Long = 0L
var var_finalFalseSince$1800_changed : Boolean = false
var var_finalFalseSince$1800_unknown : Boolean = false
var var_finalFalseSince$1800_error : Throwable = null
var var_finalFalseSince$1800_value : Long = 0L
var var_$1799_changed : Boolean = true
var var_$1799_lastValue : Long = 0L
var var_$1799_lastInit : Boolean = false
var var_$1799_lastError : Throwable = null
var var_$1799_value : Long = 9223372036854775807L
var var_$1799_init : Boolean = true
var var_$1799_ts : Long = 0L
var var_$1799_error : Throwable = null
var var_$1799_unknown : Boolean = false
var var_$1798_changed : Boolean = false
var var_$1798_unknown : Boolean = false
var var_$1798_error : Throwable = null
var var_$1798_value : Long = 0L
var var_$1798_init : Boolean = false
var var_$1797_changed : Boolean = false
var var_$1797_unknown : Boolean = false
var var_$1797_error : Throwable = null
var var_$1797_value : Boolean = false
var var_$1797_init : Boolean = false
var var_isFinalFalseReset$1796_changed : Boolean = false
var var_isFinalFalseReset$1796_unknown : Boolean = false
var var_isFinalFalseReset$1796_error : Throwable = null
var var_isFinalFalseReset$1796_value : Boolean = false
var var_$1795_changed : Boolean = false
var var_$1795_lastValue : Boolean = false
var var_$1795_lastInit : Boolean = false
var var_$1795_lastError : Throwable = null
var var_$1795_init : Boolean = false
var var_$1795_ts : Long = 0L
var var_$1795_unknown : Boolean = false
var var_$1795_value : Boolean = false
var var_$1795_error : Throwable = null
var var_$2007_changed : Boolean = false
var var_$2007_unknown : Boolean = false
var var_$2007_error : Throwable = null
var var_$2007_value : Long = 0L
var var_$2007_init : Boolean = false
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
var var_$2004_ts : Long = 0L
var var_$2003_changed : Boolean = false
var var_$2003_unknown : Boolean = false
var var_$2003_error : Throwable = null
var var_$2003_value : Boolean = false
var var_$2003_init : Boolean = false
var var_$1727_lastValue : List[Long] = List[Long]()
var var_$1727_lastInit : Boolean = false
var var_$1727_lastError : Throwable = null
var var_$1727_unknown : Boolean = false
var var_$1727_error : Throwable = null
var var_$1727_value : List[Long] = List[Long]()
var var_$1727_init : Boolean = false
var var_$1727_ts : Long = 0L
var var_$2027_changed : Boolean = false
var var_$2027_value : Long = 0L
var var_$2027_init : Boolean = false
var var_$2027_unknown : Boolean = false
var var_$2027_error : Throwable = null
var var_$2024_changed : Boolean = false
var var_$2024_unknown : Boolean = false
var var_$2024_error : Throwable = null
var var_$2024_value : Long = 0L
var var_$2024_init : Boolean = false
var var_$2068_changed : Boolean = false
var var_$2068_value : Long = 0L
var var_$2068_init : Boolean = false
var var_$2068_unknown : Boolean = false
var var_$2068_error : Throwable = null
var var_$2065_changed : Boolean = false
var var_$2065_unknown : Boolean = false
var var_$2065_error : Throwable = null
var var_$2065_value : Long = 0L
var var_$2065_init : Boolean = false
var var_$1943_changed : Boolean = false
var var_$1943_unknown : Boolean = false
var var_$1943_error : Throwable = null
var var_$1943_value : Long = 0L
var var_$2028_changed : Boolean = false
var var_$2028_unknown : Boolean = false
var var_$2028_error : Throwable = null
var var_$2028_value : Boolean = false
var var_$2028_init : Boolean = false
var var_$1952_changed : Boolean = false
var var_$1952_unknown : Boolean = false
var var_$1952_error : Throwable = null
var var_$1952_value : Long = 0L
var var_stillFulfillableReset$1619_changed : Boolean = false
var var_stillFulfillableReset$1619_lastValue : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1619_lastInit : Boolean = false
var var_stillFulfillableReset$1619_lastError : Throwable = null
var var_stillFulfillableReset$1619_unknown : Boolean = false
var var_stillFulfillableReset$1619_error : Throwable = null
var var_stillFulfillableReset$1619_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1619_init : Boolean = false
var var_stillFulfillableReset$1619_ts : Long = 0L
var var_stillFulfillableReset$1794_changed : Boolean = false
var var_stillFulfillableReset$1794_unknown : Boolean = false
var var_stillFulfillableReset$1794_error : Throwable = null
var var_stillFulfillableReset$1794_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1794_init : Boolean = false
var var_sporadicConstraint$1618_changed : Boolean = false
var var_sporadicConstraint$1618_unknown : Boolean = false
var var_sporadicConstraint$1618_error : Throwable = null
var var_sporadicConstraint$1618_value : (Boolean, Boolean) = (false, false)
var var_sporadicConstraint$1618_init : Boolean = false
var var_final$1617_changed : Boolean = false
var var_final$1617_unknown : Boolean = false
var var_final$1617_error : Throwable = null
var var_final$1617_value : Boolean = false
var var_final$1617_init : Boolean = false
var var_$1678_lastValue : List[Long] = List[Long]()
var var_$1678_lastInit : Boolean = false
var var_$1678_lastError : Throwable = null
var var_$1678_unknown : Boolean = false
var var_$1678_error : Throwable = null
var var_$1678_value : List[Long] = List[Long]()
var var_$1678_init : Boolean = false
var var_$1678_ts : Long = 0L
var var_value$1925_changed : Boolean = false
var var_value$1925_unknown : Boolean = false
var var_value$1925_error : Throwable = null
var var_value$1925_value : Boolean = false
var var_value$1925_init : Boolean = false
var var_safeDelay$1854_nextTs : Long = -1L
var var_safeDelay$1746_nextTs : Long = -1L

def chunk1() = {
var_$1810_changed = false
if ((var_event_changed)) {
var_$1810_value = var_event_ts
var_$1810_init = true
var_$1810_unknown = var_event_unknown
if ((var_$1810_unknown)) {
var_$1810_error = var_event_error
} else {
var_$1810_error = null
}
var_$1810_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$2036_changed = false
}
if ((var_$1810_changed)) {
var_defaultTime$2036_value = var_$1810_value
var_defaultTime$2036_init = true
var_defaultTime$2036_error = var_$1810_error
var_defaultTime$2036_changed = true
var_defaultTime$2036_unknown = var_$1810_unknown
}
if ((!(currTs == 0L))) {
var_$2022_changed = false
}
if ((var_$1736_changed)) {
var_$2022_value = var_$1736_value
var_$2022_init = true
var_$2022_error = var_$1736_error
var_$2022_changed = true
var_$2022_unknown = var_$1736_unknown
}
var_latestSpanEventTimes$1808_changed = false
if ((var_defaultTime$2036_init && var_$2022_init)) {
if ((var_defaultTime$2036_changed) || (var_$2022_changed)) {
var_latestSpanEventTimes$1808_unknown = (var_defaultTime$2036_unknown && var_$2022_unknown)
if ((var_latestSpanEventTimes$1808_unknown)) {
var_latestSpanEventTimes$1808_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1808_error = null
try {
var_latestSpanEventTimes$1808_value = ((if((var_defaultTime$2036_error == null)) {var_defaultTime$2036_value} else {throw var_defaultTime$2036_error}) == (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1808_error = var_err
}
}
}
var_latestSpanEventTimes$1808_init = true
var_latestSpanEventTimes$1808_changed = true
}
}
if ((!(currTs == 0L))) {
var_LowerBoundX$1683_changed = false
}
if ((var_$1684_changed)) {
var_LowerBoundX$1683_value = var_$1684_value
var_LowerBoundX$1683_init = true
var_LowerBoundX$1683_error = var_$1684_error
var_LowerBoundX$1683_changed = true
var_LowerBoundX$1683_unknown = var_$1684_unknown
}
var_latestSpanEventTimes$1813_changed = false
if ((var_LowerBoundX$1683_init && var_defaultTime$2036_init)) {
if ((var_LowerBoundX$1683_changed) || (var_defaultTime$2036_changed)) {
var_latestSpanEventTimes$1813_unknown = (var_LowerBoundX$1683_unknown && var_defaultTime$2036_unknown)
if ((var_latestSpanEventTimes$1813_unknown)) {
var_latestSpanEventTimes$1813_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1813_error = null
try {
var_latestSpanEventTimes$1813_value = ((if((var_LowerBoundX$1683_error == null)) {var_LowerBoundX$1683_value} else {throw var_LowerBoundX$1683_error}) :+ (if((var_defaultTime$2036_error == null)) {var_defaultTime$2036_value} else {throw var_defaultTime$2036_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1813_error = var_err
}
}
}
var_latestSpanEventTimes$1813_init = true
var_latestSpanEventTimes$1813_changed = true
}
}
var_$1824_changed = false
if ((var_event_changed)) {
if ((var_$1834_ts == currTs && var_$1834_lastInit) || (!(var_$1834_ts == currTs) && var_$1834_init)) {
var_$1824_changed = true
var_$1824_init = true
var_$1824_unknown = var_event_unknown
if ((var_$1824_unknown)) {
var_$1824_error = var_event_error
} else {
if ((var_$1834_ts == currTs)) {
var_$1824_value = var_$1834_lastValue
var_$1824_error = var_$1834_lastError
} else {
var_$1824_value = var_$1834_value
var_$1824_error = var_$1834_error
}
}
}
}
var_$1823_changed = false
if ((var_$1824_init)) {
if ((var_$1824_changed)) {
var_$1823_unknown = (var_$1824_unknown)
if ((var_$1823_unknown)) {
var_$1823_error = UnknownEventError(null)
} else {
var_$1823_error = null
try {
var_$1823_value = (if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error}).size
} catch {
case var_err : Throwable => {
var_$1823_error = var_err
}
}
}
var_$1823_init = true
var_$1823_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1703_changed = false
}
if ((var_$1736_changed)) {
var_$1703_value = var_$1736_value
var_$1703_init = true
var_$1703_error = var_$1736_error
var_$1703_changed = true
var_$1703_unknown = var_$1736_unknown
}
var_$1822_changed = false
if ((var_$1823_init && var_$1703_init)) {
if ((var_$1823_changed) || (var_$1703_changed)) {
var_$1822_unknown = (var_$1823_unknown && var_$1703_unknown)
if ((var_$1822_unknown)) {
var_$1822_error = UnknownEventError(null)
} else {
var_$1822_error = null
try {
var_$1822_value = ((if((var_$1823_error == null)) {var_$1823_value} else {throw var_$1823_error}) > (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1829_changed = false
if ((var_defaultTime$2036_changed)) {
if ((var_$1834_ts == currTs && var_$1834_lastInit) || (!(var_$1834_ts == currTs) && var_$1834_init)) {
var_$1829_changed = true
var_$1829_init = true
var_$1829_unknown = var_defaultTime$2036_unknown
if ((var_$1829_unknown)) {
var_$1829_error = var_defaultTime$2036_error
} else {
if ((var_$1834_ts == currTs)) {
var_$1829_value = var_$1834_lastValue
var_$1829_error = var_$1834_lastError
} else {
var_$1829_value = var_$1834_value
var_$1829_error = var_$1834_error
}
}
}
}
var_$1828_changed = false
if ((var_$1829_init)) {
if ((var_$1829_changed)) {
var_$1828_unknown = (var_$1829_unknown)
if ((var_$1828_unknown)) {
var_$1828_error = UnknownEventError(null)
} else {
var_$1828_error = null
try {
var_$1828_value = (if((var_$1829_error == null)) {var_$1829_value} else {throw var_$1829_error}).tail
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
var_$1821_changed = false
if ((var_$1822_init && var_$1828_init && var_$1824_init)) {
if ((var_$1822_changed) || (var_$1828_changed) || (var_$1824_changed)) {
var_$1821_unknown = (var_$1822_unknown && var_$1828_unknown && var_$1824_unknown)
if ((var_$1821_unknown)) {
var_$1821_error = UnknownEventError(null)
} else {
var_$1821_error = null
try {
var_$1821_value = (if ((if((var_$1822_error == null)) {var_$1822_value} else {throw var_$1822_error})) (if((var_$1828_error == null)) {var_$1828_value} else {throw var_$1828_error}) else (if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error}))
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
var_$1820_changed = false
if ((var_$1821_init && var_defaultTime$2036_init)) {
if ((var_$1821_changed) || (var_defaultTime$2036_changed)) {
var_$1820_unknown = (var_$1821_unknown && var_defaultTime$2036_unknown)
if ((var_$1820_unknown)) {
var_$1820_error = UnknownEventError(null)
} else {
var_$1820_error = null
try {
var_$1820_value = ((if((var_$1821_error == null)) {var_$1821_value} else {throw var_$1821_error}) :+ (if((var_defaultTime$2036_error == null)) {var_defaultTime$2036_value} else {throw var_defaultTime$2036_error}))
} catch {
case var_err : Throwable => {
var_$1820_error = var_err
}
}
}
var_$1820_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$1819_changed = false
}
if ((var_$1820_changed)) {
var_latestSpanEventTimes$1819_value = var_$1820_value
var_latestSpanEventTimes$1819_init = true
var_latestSpanEventTimes$1819_error = var_$1820_error
var_latestSpanEventTimes$1819_changed = true
var_latestSpanEventTimes$1819_unknown = var_$1820_unknown
}
var_$1834_changed = false
if ((var_latestSpanEventTimes$1808_init && var_latestSpanEventTimes$1813_init && var_latestSpanEventTimes$1819_init)) {
if ((var_latestSpanEventTimes$1808_changed) || (var_latestSpanEventTimes$1813_changed) || (var_latestSpanEventTimes$1819_changed)) {
var_$1834_lastValue = var_$1834_value
var_$1834_lastInit = var_$1834_init
var_$1834_lastError = var_$1834_error
var_$1834_unknown = (var_latestSpanEventTimes$1808_unknown && var_latestSpanEventTimes$1813_unknown && var_latestSpanEventTimes$1819_unknown)
if ((var_$1834_unknown)) {
var_$1834_error = UnknownEventError(null)
} else {
var_$1834_error = null
try {
var_$1834_value = (if ((if((var_latestSpanEventTimes$1808_error == null)) {var_latestSpanEventTimes$1808_value} else {throw var_latestSpanEventTimes$1808_error})) (if((var_latestSpanEventTimes$1813_error == null)) {var_latestSpanEventTimes$1813_value} else {throw var_latestSpanEventTimes$1813_error}) else (if((var_latestSpanEventTimes$1819_error == null)) {var_latestSpanEventTimes$1819_value} else {throw var_latestSpanEventTimes$1819_error}))
} catch {
case var_err : Throwable => {
var_$1834_error = var_err
}
}
}
var_$1834_init = true
var_$1834_ts = currTs
var_$1834_changed = true
}
}
var_$1806_changed = false
if ((var_$1834_init)) {
if ((var_$1834_changed)) {
var_$1806_unknown = (var_$1834_unknown)
if ((var_$1806_unknown)) {
var_$1806_error = UnknownEventError(null)
} else {
var_$1806_error = null
try {
var_$1806_value = (if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}).size
} catch {
case var_err : Throwable => {
var_$1806_error = var_err
}
}
}
var_$1806_init = true
var_$1806_changed = true
}
}
var_$1805_changed = false
if ((var_$1806_init && var_$1703_init)) {
if ((var_$1806_changed) || (var_$1703_changed)) {
var_$1805_unknown = (var_$1806_unknown && var_$1703_unknown)
if ((var_$1805_unknown)) {
var_$1805_error = UnknownEventError(null)
} else {
var_$1805_error = null
try {
var_$1805_value = ((if((var_$1806_error == null)) {var_$1806_value} else {throw var_$1806_error}) > (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1860_changed = false
if ((var_$1834_init)) {
if ((var_$1834_changed)) {
var_$1860_unknown = (var_$1834_unknown)
if ((var_$1860_unknown)) {
var_$1860_error = UnknownEventError(null)
} else {
var_$1860_error = null
try {
var_$1860_value = (var_head$1668.apply(((if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1860_error = var_err
}
}
}
var_$1860_init = true
var_$1860_changed = true
}
}
var_$1843_changed = false
if ((var_$1860_init && var_$1703_init)) {
if ((var_$1860_changed) || (var_$1703_changed)) {
var_$1843_unknown = (var_$1860_unknown && var_$1703_unknown)
if ((var_$1843_unknown)) {
var_$1843_error = UnknownEventError(null)
} else {
var_$1843_error = null
try {
var_$1843_value = ((if((var_$1860_error == null)) {var_$1860_value} else {throw var_$1860_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1850_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$1850_error = UnknownEventError(var_event_error)
} else {
var_$1850_error = null
}
var_$1850_changed = var_event_changed
var_$1850_unknown = var_event_unknown
}
var_safeDelay$1854_changed = false
if ((var_safeDelay$1854_nextTs == currTs)) {
var_safeDelay$1854_changed = true
var_safeDelay$1854_unknown = false
}
var_$1852_changed = false
if ((var_safeDelay$1854_changed)) {
if ((var_safeDelay$1854_unknown)) {
var_$1852_error = UnknownEventError(var_safeDelay$1854_error)
} else {
var_$1852_error = null
}
var_$1852_changed = var_safeDelay$1854_changed
var_$1852_unknown = var_safeDelay$1854_unknown
}
var_mergeUnit2$1849_changed = false
if ((var_$1850_changed) || (var_$1852_changed)) {
var_mergeUnit2$1849_ts = currTs
var_mergeUnit2$1849_changed = true
var_mergeUnit2$1849_unknown = (var_$1850_unknown && var_$1852_unknown)
if ((var_$1850_changed)) {
var_mergeUnit2$1849_error = var_$1850_error
} else {
if ((var_$1852_changed)) {
var_mergeUnit2$1849_error = var_$1852_error
}
}
}
var_$1848_changed = false
if ((var_mergeUnit2$1849_changed)) {
var_$1848_value = var_mergeUnit2$1849_ts
var_$1848_init = true
var_$1848_unknown = var_mergeUnit2$1849_unknown
if ((var_$1848_unknown)) {
var_$1848_error = var_mergeUnit2$1849_error
} else {
var_$1848_error = null
}
var_$1848_changed = true
}
var_$1842_changed = false
if ((var_$1843_init && var_$1848_init)) {
if ((var_$1843_changed) || (var_$1848_changed)) {
var_$1842_unknown = (var_$1843_unknown && var_$1848_unknown)
if ((var_$1842_unknown)) {
var_$1842_error = UnknownEventError(null)
} else {
var_$1842_error = null
try {
var_$1842_value = ((if((var_$1843_error == null)) {var_$1843_value} else {throw var_$1843_error}) <= (if((var_$1848_error == null)) {var_$1848_value} else {throw var_$1848_error}))
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
if ((!(currTs == 0L))) {
var_$1873_changed = false
}
if ((var_$2073_changed)) {
var_$1873_value = var_$2073_value
var_$1873_init = true
var_$1873_error = var_$2073_error
var_$1873_changed = true
var_$1873_unknown = var_$2073_unknown
}
if ((!(currTs == 0L))) {
var_$2066_changed = false
}
if ((var_$1736_changed)) {
var_$2066_value = var_$1736_value
var_$2066_init = true
var_$2066_error = var_$1736_error
var_$2066_changed = true
var_$2066_unknown = var_$1736_unknown
}
var_$1859_changed = false
if ((var_$1860_init && var_$2066_init)) {
if ((var_$1860_changed) || (var_$2066_changed)) {
var_$1859_unknown = (var_$1860_unknown && var_$2066_unknown)
if ((var_$1859_unknown)) {
var_$1859_error = UnknownEventError(null)
} else {
var_$1859_error = null
try {
var_$1859_value = ((if((var_$1860_error == null)) {var_$1860_value} else {throw var_$1860_error}) + (if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}))
} catch {
case var_err : Throwable => {
var_$1859_error = var_err
}
}
}
var_$1859_init = true
var_$1859_changed = true
}
}
var_$1875_changed = false
if ((var_$1859_init && var_$1848_init)) {
if ((var_$1859_changed) || (var_$1848_changed)) {
var_$1875_unknown = (var_$1859_unknown && var_$1848_unknown)
if ((var_$1875_unknown)) {
var_$1875_error = UnknownEventError(null)
} else {
var_$1875_error = null
try {
var_$1875_value = ((if((var_$1859_error == null)) {var_$1859_value} else {throw var_$1859_error}) >= (if((var_$1848_error == null)) {var_$1848_value} else {throw var_$1848_error}))
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
var_$1872_changed = false
if ((var_$1873_init && var_$1875_init)) {
if ((var_$1873_changed) || (var_$1875_changed)) {
var_$1872_unknown = (var_$1873_unknown && var_$1875_unknown)
if ((var_$1872_unknown)) {
var_$1872_error = UnknownEventError(null)
} else {
var_$1872_error = null
try {
var_$1872_value = ((if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}) || (if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}))
} catch {
case var_err : Throwable => {
var_$1872_error = var_err
}
}
}
var_$1872_init = true
var_$1872_changed = true
}
}
var_$1841_changed = false
if ((var_$1842_init && var_$1872_init)) {
if ((var_$1842_changed) || (var_$1872_changed)) {
var_$1841_unknown = (var_$1842_unknown && var_$1872_unknown)
if ((var_$1841_unknown)) {
var_$1841_error = UnknownEventError(null)
} else {
var_$1841_error = null
try {
var_$1841_value = ((if((var_$1842_error == null)) {var_$1842_value} else {throw var_$1842_error}) && (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
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
var_$1882_changed = false
}
if ((var_$1886_changed)) {
var_$1882_value = var_$1886_value
var_$1882_init = true
var_$1882_error = var_$1886_error
var_$1882_changed = true
var_$1882_unknown = var_$1886_unknown
}
if ((!(currTs == 0L))) {
var_$1920_changed = false
}
if ((var_$1886_changed)) {
var_$1920_value = var_$1886_value
var_$1920_init = true
var_$1920_error = var_$1886_error
var_$1920_changed = true
var_$1920_unknown = var_$1886_unknown
}
var_$1840_changed = false
if ((var_$1841_init && var_$1882_init && var_$1920_init)) {
if ((var_$1841_changed) || (var_$1882_changed) || (var_$1920_changed)) {
var_$1840_unknown = (var_$1841_unknown && var_$1882_unknown && var_$1920_unknown)
if ((var_$1840_unknown)) {
var_$1840_error = UnknownEventError(null)
} else {
var_$1840_error = null
try {
var_$1840_value = (if ((if((var_$1841_error == null)) {var_$1841_value} else {throw var_$1841_error})) (if((var_$1882_error == null)) {var_$1882_value} else {throw var_$1882_error}) else (if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}))
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
var_$1871_changed = false
if ((var_$1872_init && var_$1882_init && var_$1920_init)) {
if ((var_$1872_changed) || (var_$1882_changed) || (var_$1920_changed)) {
var_$1871_unknown = (var_$1872_unknown && var_$1882_unknown && var_$1920_unknown)
if ((var_$1871_unknown)) {
var_$1871_error = UnknownEventError(null)
} else {
var_$1871_error = null
try {
var_$1871_value = (if ((if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error})) (if((var_$1882_error == null)) {var_$1882_value} else {throw var_$1882_error}) else (if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}))
} catch {
case var_err : Throwable => {
var_$1871_error = var_err
}
}
}
var_$1871_init = true
var_$1871_changed = true
}
}
var_$1804_changed = false
if ((var_$1805_init && var_$1840_init && var_$1871_init)) {
if ((var_$1805_changed) || (var_$1840_changed) || (var_$1871_changed)) {
var_$1804_unknown = (var_$1805_unknown && var_$1840_unknown && var_$1871_unknown)
if ((var_$1804_unknown)) {
var_$1804_error = UnknownEventError(null)
} else {
var_$1804_error = null
try {
var_$1804_value = (if ((if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error})) (if((var_$1840_error == null)) {var_$1840_value} else {throw var_$1840_error}) else (if((var_$1871_error == null)) {var_$1871_value} else {throw var_$1871_error}))
} catch {
case var_err : Throwable => {
var_$1804_error = var_err
}
}
}
var_$1804_init = true
var_$1804_ts = currTs
var_$1804_changed = true
}
}
var_$1900_changed = false
if ((var_$1804_init)) {
if ((var_$1804_changed)) {
var_$1900_unknown = (var_$1804_unknown)
if ((var_$1900_unknown)) {
var_$1900_error = UnknownEventError(null)
} else {
var_$1900_error = null
try {
var_$1900_value = var_$1924.apply((if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error}))
} catch {
case var_err : Throwable => {
var_$1900_error = var_err
}
}
}
var_$1900_init = true
var_$1900_changed = true
}
}
var_$1905_changed = false
if ((var_$1804_init)) {
if ((var_$1804_changed)) {
var_$1905_unknown = (var_$1804_unknown)
if ((var_$1905_unknown)) {
var_$1905_error = UnknownEventError(null)
} else {
var_$1905_error = null
try {
var_$1905_value = var_$1926.apply((if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error}))
} catch {
case var_err : Throwable => {
var_$1905_error = var_err
}
}
}
var_$1905_init = true
var_$1905_changed = true
}
}
var_$1889_changed = false
if ((var_$1905_init)) {
if ((var_$1905_changed)) {
var_$1889_unknown = (var_$1905_unknown)
if ((var_$1889_unknown)) {
var_$1889_error = UnknownEventError(null)
} else {
var_$1889_error = null
try {
var_$1889_value = !((if((var_$1905_error == null)) {var_$1905_value} else {throw var_$1905_error}))
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
var_$1802_changed = false
if ((var_$1900_init && var_$1889_init)) {
if ((var_$1900_changed) || (var_$1889_changed)) {
var_$1802_unknown = (var_$1900_unknown && var_$1889_unknown)
if ((var_$1802_unknown)) {
var_$1802_error = UnknownEventError(null)
} else {
var_$1802_error = null
try {
var_$1802_value = ((if((var_$1900_error == null)) {var_$1900_value} else {throw var_$1900_error}) && (if((var_$1889_error == null)) {var_$1889_value} else {throw var_$1889_error}))
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
var_$1896_changed = false
if ((var_$1804_changed)) {
if ((var_$1795_ts == currTs && var_$1795_lastInit) || (!(var_$1795_ts == currTs) && var_$1795_init)) {
var_$1896_changed = true
var_$1896_init = true
var_$1896_unknown = var_$1804_unknown
if ((var_$1896_unknown)) {
var_$1896_error = var_$1804_error
} else {
if ((var_$1795_ts == currTs)) {
var_$1896_value = var_$1795_lastValue
var_$1896_error = var_$1795_lastError
} else {
var_$1896_value = var_$1795_value
var_$1896_error = var_$1795_error
}
}
}
}
var_$1899_changed = false
if ((var_$1900_init && var_$1873_init)) {
if ((var_$1900_changed) || (var_$1873_changed)) {
var_$1899_unknown = (var_$1900_unknown && var_$1873_unknown)
if ((var_$1899_unknown)) {
var_$1899_error = UnknownEventError(null)
} else {
var_$1899_error = null
try {
var_$1899_value = ((if((var_$1900_error == null)) {var_$1900_value} else {throw var_$1900_error}) == (if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}))
} catch {
case var_err : Throwable => {
var_$1899_error = var_err
}
}
}
var_$1899_init = true
var_$1899_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1916_changed = false
}
if ((var_$2073_changed)) {
var_$1916_value = var_$2073_value
var_$1916_init = true
var_$1916_error = var_$2073_error
var_$1916_changed = true
var_$1916_unknown = var_$2073_unknown
}
var_$1904_changed = false
if ((var_$1905_init && var_$1916_init)) {
if ((var_$1905_changed) || (var_$1916_changed)) {
var_$1904_unknown = (var_$1905_unknown && var_$1916_unknown)
if ((var_$1904_unknown)) {
var_$1904_error = UnknownEventError(null)
} else {
var_$1904_error = null
try {
var_$1904_value = ((if((var_$1905_error == null)) {var_$1905_value} else {throw var_$1905_error}) == (if((var_$1916_error == null)) {var_$1916_value} else {throw var_$1916_error}))
} catch {
case var_err : Throwable => {
var_$1904_error = var_err
}
}
}
var_$1904_init = true
var_$1904_changed = true
}
}
var_$1898_changed = false
if ((var_$1899_init && var_$1904_init)) {
if ((var_$1899_changed) || (var_$1904_changed)) {
var_$1898_unknown = (var_$1899_unknown && var_$1904_unknown)
if ((var_$1898_unknown)) {
var_$1898_error = UnknownEventError(null)
} else {
var_$1898_error = null
try {
var_$1898_value = ((if((var_$1899_error == null)) {var_$1899_value} else {throw var_$1899_error}) && (if((var_$1904_error == null)) {var_$1904_value} else {throw var_$1904_error}))
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
var_isFinalFalse$1895_changed = false
if ((var_$1896_init && var_$1898_init)) {
if ((var_$1896_changed) || (var_$1898_changed)) {
var_isFinalFalse$1895_unknown = (var_$1896_unknown && var_$1898_unknown)
if ((var_isFinalFalse$1895_unknown)) {
var_isFinalFalse$1895_error = UnknownEventError(null)
} else {
var_isFinalFalse$1895_error = null
try {
var_isFinalFalse$1895_value = ((if((var_$1896_error == null)) {var_$1896_value} else {throw var_$1896_error}) || (if((var_$1898_error == null)) {var_$1898_value} else {throw var_$1898_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1895_error = var_err
}
}
}
var_isFinalFalse$1895_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1894_changed = false
}
if ((var_isFinalFalse$1895_changed)) {
var_$1894_lastValue = var_$1894_value
var_$1894_lastInit = var_$1894_init
var_$1894_lastError = var_$1894_error
var_$1894_value = var_isFinalFalse$1895_value
var_$1894_init = true
var_$1894_ts = currTs
var_$1894_error = var_isFinalFalse$1895_error
var_$1894_changed = true
var_$1894_unknown = var_isFinalFalse$1895_unknown
}
var_prev$1893_changed = false
if ((var_$1894_changed)) {
if ((var_$1894_ts == currTs && var_$1894_lastInit) || (!(var_$1894_ts == currTs) && var_$1894_init)) {
var_prev$1893_changed = true
var_prev$1893_init = true
var_prev$1893_unknown = var_$1894_unknown
if ((var_prev$1893_unknown)) {
var_prev$1893_error = var_$1894_error
} else {
if ((var_$1894_ts == currTs)) {
var_prev$1893_value = var_$1894_lastValue
var_prev$1893_error = var_$1894_lastError
} else {
var_prev$1893_value = var_$1894_value
var_prev$1893_error = var_$1894_error
}
}
}
}
var_$1892_changed = false
if ((var_prev$1893_init)) {
if ((var_prev$1893_changed)) {
var_$1892_unknown = (var_prev$1893_unknown)
if ((var_$1892_unknown)) {
var_$1892_error = UnknownEventError(null)
} else {
var_$1892_error = null
try {
var_$1892_value = !((if((var_prev$1893_error == null)) {var_prev$1893_value} else {throw var_prev$1893_error}))
} catch {
case var_err : Throwable => {
var_$1892_error = var_err
}
}
}
var_$1892_init = true
var_$1892_changed = true
}
}
var_$1801_changed = false
if ((var_$1802_init && var_$1892_init)) {
if ((var_$1802_changed) || (var_$1892_changed)) {
var_$1801_unknown = (var_$1802_unknown && var_$1892_unknown)
if ((var_$1801_unknown)) {
var_$1801_error = UnknownEventError(null)
} else {
var_$1801_error = null
try {
var_$1801_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) && (if((var_$1892_error == null)) {var_$1892_value} else {throw var_$1892_error}))
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
var_$1637_changed = false
if ((var_event_changed)) {
if ((var_stillFulfillableReset$1619_ts == currTs && var_stillFulfillableReset$1619_lastInit) || (!(var_stillFulfillableReset$1619_ts == currTs) && var_stillFulfillableReset$1619_init)) {
var_$1637_changed = true
var_$1637_init = true
var_$1637_unknown = var_event_unknown
if ((var_$1637_unknown)) {
var_$1637_error = var_event_error
} else {
if ((var_stillFulfillableReset$1619_ts == currTs)) {
var_$1637_value = var_stillFulfillableReset$1619_lastValue
var_$1637_error = var_stillFulfillableReset$1619_lastError
} else {
var_$1637_value = var_stillFulfillableReset$1619_value
var_$1637_error = var_stillFulfillableReset$1619_error
}
}
}
}
var_$1692_changed = false
if ((var_$1637_init)) {
if ((var_$1637_changed)) {
var_$1692_unknown = (var_$1637_unknown)
if ((var_$1692_unknown)) {
var_$1692_error = UnknownEventError(null)
} else {
var_$1692_error = null
try {
var_$1692_value = var_$1924.apply((if((var_$1637_error == null)) {var_$1637_value} else {throw var_$1637_error}))
} catch {
case var_err : Throwable => {
var_$1692_error = var_err
}
}
}
var_$1692_init = true
var_$1692_changed = true
}
}
var_$1701_changed = false
if ((var_event_changed)) {
if ((var_$1707_ts == currTs && var_$1707_lastInit) || (!(var_$1707_ts == currTs) && var_$1707_init)) {
var_$1701_changed = true
var_$1701_init = true
var_$1701_unknown = var_event_unknown
if ((var_$1701_unknown)) {
var_$1701_error = var_event_error
} else {
if ((var_$1707_ts == currTs)) {
var_$1701_value = var_$1707_lastValue
var_$1701_error = var_$1707_lastError
} else {
var_$1701_value = var_$1707_value
var_$1701_error = var_$1707_error
}
}
}
}
var_$1700_changed = false
if ((var_$1701_init)) {
if ((var_$1701_changed)) {
var_$1700_unknown = (var_$1701_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}).size
} catch {
case var_err : Throwable => {
var_$1700_error = var_err
}
}
}
var_$1700_init = true
var_$1700_changed = true
}
}
var_$1699_changed = false
if ((var_$1700_init && var_$1703_init)) {
if ((var_$1700_changed) || (var_$1703_changed)) {
var_$1699_unknown = (var_$1700_unknown && var_$1703_unknown)
if ((var_$1699_unknown)) {
var_$1699_error = UnknownEventError(null)
} else {
var_$1699_error = null
try {
var_$1699_value = ((if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}) < (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
} catch {
case var_err : Throwable => {
var_$1699_error = var_err
}
}
}
var_$1699_init = true
var_$1699_changed = true
}
}
var_$1718_changed = false
if ((var_$1701_init)) {
if ((var_$1701_changed)) {
var_$1718_unknown = (var_$1701_unknown)
if ((var_$1718_unknown)) {
var_$1718_error = UnknownEventError(null)
} else {
var_$1718_error = null
try {
var_$1718_value = (var_head$1668.apply(((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1718_error = var_err
}
}
}
var_$1718_init = true
var_$1718_changed = true
}
}
var_upperBoundXNow$1717_changed = false
if ((var_$1718_init && var_$1810_init)) {
if ((var_$1718_changed) || (var_$1810_changed)) {
var_upperBoundXNow$1717_unknown = (var_$1718_unknown && var_$1810_unknown)
if ((var_upperBoundXNow$1717_unknown)) {
var_upperBoundXNow$1717_error = UnknownEventError(null)
} else {
var_upperBoundXNow$1717_error = null
try {
var_upperBoundXNow$1717_value = var_min$1722.apply((if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}), (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
} catch {
case var_err : Throwable => {
var_upperBoundXNow$1717_error = var_err
}
}
}
var_upperBoundXNow$1717_init = true
var_upperBoundXNow$1717_changed = true
}
}
var_$1729_changed = false
if ((var_$1699_init && var_$1810_init && var_upperBoundXNow$1717_init)) {
if ((var_$1699_changed) || (var_$1810_changed) || (var_upperBoundXNow$1717_changed)) {
var_$1729_unknown = (var_$1699_unknown && var_$1810_unknown && var_upperBoundXNow$1717_unknown)
if ((var_$1729_unknown)) {
var_$1729_error = UnknownEventError(null)
} else {
var_$1729_error = null
try {
var_$1729_value = (if ((if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error})) (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}) else (if((var_upperBoundXNow$1717_error == null)) {var_upperBoundXNow$1717_value} else {throw var_upperBoundXNow$1717_error}))
} catch {
case var_err : Throwable => {
var_$1729_error = var_err
}
}
}
var_$1729_init = true
var_$1729_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1730_changed = false
}
if ((var_$1736_changed)) {
var_$1730_value = var_$1736_value
var_$1730_init = true
var_$1730_error = var_$1736_error
var_$1730_changed = true
var_$1730_unknown = var_$1736_unknown
}
var_$1728_changed = false
if ((var_$1729_init && var_$1730_init)) {
if ((var_$1729_changed) || (var_$1730_changed)) {
var_$1728_unknown = (var_$1729_unknown && var_$1730_unknown)
if ((var_$1728_unknown)) {
var_$1728_error = UnknownEventError(null)
} else {
var_$1728_error = null
try {
var_$1728_value = ((if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}) + (if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}))
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
var_$1705_changed = false
if ((var_$1701_init && var_$1728_init)) {
if ((var_$1701_changed) || (var_$1728_changed)) {
var_$1705_unknown = (var_$1701_unknown && var_$1728_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) :+ (if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}))
} catch {
case var_err : Throwable => {
var_$1705_error = var_err
}
}
}
var_$1705_init = true
var_$1705_changed = true
}
}
var_$1726_changed = false
if ((var_event_changed)) {
if ((var_$1727_ts == currTs && var_$1727_lastInit) || (!(var_$1727_ts == currTs) && var_$1727_init)) {
var_$1726_changed = true
var_$1726_init = true
var_$1726_unknown = var_event_unknown
if ((var_$1726_unknown)) {
var_$1726_error = var_event_error
} else {
if ((var_$1727_ts == currTs)) {
var_$1726_value = var_$1727_lastValue
var_$1726_error = var_$1727_lastError
} else {
var_$1726_value = var_$1727_value
var_$1726_error = var_$1727_error
}
}
}
}
var_$1725_changed = false
if ((var_$1726_init && var_$1728_init)) {
if ((var_$1726_changed) || (var_$1728_changed)) {
var_$1725_unknown = (var_$1726_unknown && var_$1728_unknown)
if ((var_$1725_unknown)) {
var_$1725_error = UnknownEventError(null)
} else {
var_$1725_error = null
try {
var_$1725_value = ((if((var_$1726_error == null)) {var_$1726_value} else {throw var_$1726_error}) :+ (if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}))
} catch {
case var_err : Throwable => {
var_$1725_error = var_err
}
}
}
var_$1725_init = true
var_$1725_changed = true
}
}
var_$1698_changed = false
if ((var_$1699_init && var_$1705_init && var_$1725_init)) {
if ((var_$1699_changed) || (var_$1705_changed) || (var_$1725_changed)) {
var_$1698_unknown = (var_$1699_unknown && var_$1705_unknown && var_$1725_unknown)
if ((var_$1698_unknown)) {
var_$1698_error = UnknownEventError(null)
} else {
var_$1698_error = null
try {
var_$1698_value = (if ((if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error})) (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}) else (if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}))
} catch {
case var_err : Throwable => {
var_$1698_error = var_err
}
}
}
var_$1698_init = true
var_$1698_changed = true
}
}
var_UpperBoundX$1691_changed = false
if ((var_$1692_init && var_LowerBoundX$1683_init && var_$1698_init)) {
if ((var_$1692_changed) || (var_LowerBoundX$1683_changed) || (var_$1698_changed)) {
var_UpperBoundX$1691_unknown = (var_$1692_unknown && var_LowerBoundX$1683_unknown && var_$1698_unknown)
if ((var_UpperBoundX$1691_unknown)) {
var_UpperBoundX$1691_error = UnknownEventError(null)
} else {
var_UpperBoundX$1691_error = null
try {
var_UpperBoundX$1691_value = (if ((if((var_$1692_error == null)) {var_$1692_value} else {throw var_$1692_error})) (if((var_LowerBoundX$1683_error == null)) {var_LowerBoundX$1683_value} else {throw var_LowerBoundX$1683_error}) else (if((var_$1698_error == null)) {var_$1698_value} else {throw var_$1698_error}))
} catch {
case var_err : Throwable => {
var_UpperBoundX$1691_error = var_err
}
}
}
var_UpperBoundX$1691_changed = true
}
}
var_$1707_changed = false
if ((var_UpperBoundX$1691_changed) || (var_LowerBoundX$1683_changed)) {
var_$1707_lastValue = var_$1707_value
var_$1707_lastInit = var_$1707_init
var_$1707_lastError = var_$1707_error
var_$1707_init = true
var_$1707_ts = currTs
var_$1707_changed = true
var_$1707_unknown = (var_UpperBoundX$1691_unknown && var_LowerBoundX$1683_unknown)
if ((var_UpperBoundX$1691_changed)) {
var_$1707_value = var_UpperBoundX$1691_value
var_$1707_error = var_UpperBoundX$1691_error
} else {
if ((var_LowerBoundX$1683_changed)) {
var_$1707_value = var_LowerBoundX$1683_value
var_$1707_error = var_LowerBoundX$1683_error
}
}
}
var_$2015_changed = false
if ((var_$1707_init)) {
if ((var_$1707_changed)) {
var_$2015_unknown = (var_$1707_unknown)
if ((var_$2015_unknown)) {
var_$2015_error = UnknownEventError(null)
} else {
var_$2015_error = null
try {
var_$2015_value = (var_head$1668.apply(((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2015_error = var_err
}
}
}
var_$2015_init = true
var_$2015_changed = true
}
}
var_$1656_changed = false
if ((var_event_changed)) {
if ((var_$1935_ts == currTs && var_$1935_lastInit) || (!(var_$1935_ts == currTs) && var_$1935_init)) {
var_$1656_changed = true
var_$1656_init = true
var_$1656_unknown = var_event_unknown
if ((var_$1656_unknown)) {
var_$1656_error = var_event_error
} else {
if ((var_$1935_ts == currTs)) {
var_$1656_value = var_$1935_lastValue
var_$1656_error = var_$1935_lastError
} else {
var_$1656_value = var_$1935_value
var_$1656_error = var_$1935_error
}
}
}
}
var_$1655_changed = false
if ((var_$1656_init)) {
if ((var_$1656_changed)) {
var_$1655_unknown = (var_$1656_unknown)
if ((var_$1655_unknown)) {
var_$1655_error = UnknownEventError(null)
} else {
var_$1655_error = null
try {
var_$1655_value = (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}).size
} catch {
case var_err : Throwable => {
var_$1655_error = var_err
}
}
}
var_$1655_init = true
var_$1655_changed = true
}
}
var_$1643_changed = false
if ((var_$1655_init && var_$1703_init)) {
if ((var_$1655_changed) || (var_$1703_changed)) {
var_$1643_unknown = (var_$1655_unknown && var_$1703_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = ((if((var_$1655_error == null)) {var_$1655_value} else {throw var_$1655_error}) < (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1669_changed = false
if ((var_$1810_init && var_$1703_init)) {
if ((var_$1810_changed) || (var_$1703_changed)) {
var_$1669_unknown = (var_$1810_unknown && var_$1703_unknown)
if ((var_$1669_unknown)) {
var_$1669_error = UnknownEventError(null)
} else {
var_$1669_error = null
try {
var_$1669_value = ((if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}) - (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
} catch {
case var_err : Throwable => {
var_$1669_error = var_err
}
}
}
var_$1669_init = true
var_$1669_changed = true
}
}
var_$1665_changed = false
if ((var_$1656_init)) {
if ((var_$1656_changed)) {
var_$1665_unknown = (var_$1656_unknown)
if ((var_$1665_unknown)) {
var_$1665_error = UnknownEventError(null)
} else {
var_$1665_error = null
try {
var_$1665_value = (var_head$1668.apply(((if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1665_error = var_err
}
}
}
var_$1665_init = true
var_$1665_changed = true
}
}
var_lowerBoundXNow$1664_changed = false
if ((var_$1665_init && var_$1669_init)) {
if ((var_$1665_changed) || (var_$1669_changed)) {
var_lowerBoundXNow$1664_unknown = (var_$1665_unknown && var_$1669_unknown)
if ((var_lowerBoundXNow$1664_unknown)) {
var_lowerBoundXNow$1664_error = UnknownEventError(null)
} else {
var_lowerBoundXNow$1664_error = null
try {
var_lowerBoundXNow$1664_value = var_max$1673.apply((if((var_$1665_error == null)) {var_$1665_value} else {throw var_$1665_error}), (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_lowerBoundXNow$1664_error = var_err
}
}
}
var_lowerBoundXNow$1664_init = true
var_lowerBoundXNow$1664_changed = true
}
}
var_$1653_changed = false
if ((var_$1643_init && var_$1669_init && var_lowerBoundXNow$1664_init)) {
if ((var_$1643_changed) || (var_$1669_changed) || (var_lowerBoundXNow$1664_changed)) {
var_$1653_unknown = (var_$1643_unknown && var_$1669_unknown && var_lowerBoundXNow$1664_unknown)
if ((var_$1653_unknown)) {
var_$1653_error = UnknownEventError(null)
} else {
var_$1653_error = null
try {
var_$1653_value = (if ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error})) (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) else (if((var_lowerBoundXNow$1664_error == null)) {var_lowerBoundXNow$1664_value} else {throw var_lowerBoundXNow$1664_error}))
} catch {
case var_err : Throwable => {
var_$1653_error = var_err
}
}
}
var_$1653_init = true
var_$1653_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1681_changed = false
}
if ((var_$1736_changed)) {
var_$1681_value = var_$1736_value
var_$1681_init = true
var_$1681_error = var_$1736_error
var_$1681_changed = true
var_$1681_unknown = var_$1736_unknown
}
var_$1679_changed = false
if ((var_$1653_init && var_$1681_init)) {
if ((var_$1653_changed) || (var_$1681_changed)) {
var_$1679_unknown = (var_$1653_unknown && var_$1681_unknown)
if ((var_$1679_unknown)) {
var_$1679_error = UnknownEventError(null)
} else {
var_$1679_error = null
try {
var_$1679_value = ((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}) + (if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}))
} catch {
case var_err : Throwable => {
var_$1679_error = var_err
}
}
}
var_$1679_init = true
var_$1679_changed = true
}
}
var_$1649_changed = false
if ((var_$1656_init && var_$1679_init)) {
if ((var_$1656_changed) || (var_$1679_changed)) {
var_$1649_unknown = (var_$1656_unknown && var_$1679_unknown)
if ((var_$1649_unknown)) {
var_$1649_error = UnknownEventError(null)
} else {
var_$1649_error = null
try {
var_$1649_value = ((if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}) :+ (if((var_$1679_error == null)) {var_$1679_value} else {throw var_$1679_error}))
} catch {
case var_err : Throwable => {
var_$1649_error = var_err
}
}
}
var_$1649_init = true
var_$1649_changed = true
}
}
var_$1677_changed = false
if ((var_event_changed)) {
if ((var_$1678_ts == currTs && var_$1678_lastInit) || (!(var_$1678_ts == currTs) && var_$1678_init)) {
var_$1677_changed = true
var_$1677_init = true
var_$1677_unknown = var_event_unknown
if ((var_$1677_unknown)) {
var_$1677_error = var_event_error
} else {
if ((var_$1678_ts == currTs)) {
var_$1677_value = var_$1678_lastValue
var_$1677_error = var_$1678_lastError
} else {
var_$1677_value = var_$1678_value
var_$1677_error = var_$1678_error
}
}
}
}
var_$1676_changed = false
if ((var_$1677_init && var_$1679_init)) {
if ((var_$1677_changed) || (var_$1679_changed)) {
var_$1676_unknown = (var_$1677_unknown && var_$1679_unknown)
if ((var_$1676_unknown)) {
var_$1676_error = UnknownEventError(null)
} else {
var_$1676_error = null
try {
var_$1676_value = ((if((var_$1677_error == null)) {var_$1677_value} else {throw var_$1677_error}) :+ (if((var_$1679_error == null)) {var_$1679_value} else {throw var_$1679_error}))
} catch {
case var_err : Throwable => {
var_$1676_error = var_err
}
}
}
var_$1676_init = true
var_$1676_changed = true
}
}
var_$1642_changed = false
if ((var_$1643_init && var_$1649_init && var_$1676_init)) {
if ((var_$1643_changed) || (var_$1649_changed) || (var_$1676_changed)) {
var_$1642_unknown = (var_$1643_unknown && var_$1649_unknown && var_$1676_unknown)
if ((var_$1642_unknown)) {
var_$1642_error = UnknownEventError(null)
} else {
var_$1642_error = null
try {
var_$1642_value = (if ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error})) (if((var_$1649_error == null)) {var_$1649_value} else {throw var_$1649_error}) else (if((var_$1676_error == null)) {var_$1676_value} else {throw var_$1676_error}))
} catch {
case var_err : Throwable => {
var_$1642_error = var_err
}
}
}
var_$1642_init = true
var_$1642_changed = true
}
}
var_LowerBoundX$1635_changed = false
if ((var_$1692_init && var_LowerBoundX$1683_init && var_$1642_init)) {
if ((var_$1692_changed) || (var_LowerBoundX$1683_changed) || (var_$1642_changed)) {
var_LowerBoundX$1635_unknown = (var_$1692_unknown && var_LowerBoundX$1683_unknown && var_$1642_unknown)
if ((var_LowerBoundX$1635_unknown)) {
var_LowerBoundX$1635_error = UnknownEventError(null)
} else {
var_LowerBoundX$1635_error = null
try {
var_LowerBoundX$1635_value = (if ((if((var_$1692_error == null)) {var_$1692_value} else {throw var_$1692_error})) (if((var_LowerBoundX$1683_error == null)) {var_LowerBoundX$1683_value} else {throw var_LowerBoundX$1683_error}) else (if((var_$1642_error == null)) {var_$1642_value} else {throw var_$1642_error}))
} catch {
case var_err : Throwable => {
var_LowerBoundX$1635_error = var_err
}
}
}
var_LowerBoundX$1635_changed = true
}
}
var_$1935_changed = false
if ((var_LowerBoundX$1635_changed) || (var_LowerBoundX$1683_changed)) {
var_$1935_lastValue = var_$1935_value
var_$1935_lastInit = var_$1935_init
var_$1935_lastError = var_$1935_error
var_$1935_init = true
var_$1935_ts = currTs
var_$1935_changed = true
var_$1935_unknown = (var_LowerBoundX$1635_unknown && var_LowerBoundX$1683_unknown)
if ((var_LowerBoundX$1635_changed)) {
var_$1935_value = var_LowerBoundX$1635_value
var_$1935_error = var_LowerBoundX$1635_error
} else {
if ((var_LowerBoundX$1683_changed)) {
var_$1935_value = var_LowerBoundX$1683_value
var_$1935_error = var_LowerBoundX$1683_error
}
}
}
var_$1633_changed = false
if ((var_$1935_init)) {
if ((var_$1935_changed)) {
var_$1633_unknown = (var_$1935_unknown)
if ((var_$1633_unknown)) {
var_$1633_error = UnknownEventError(null)
} else {
var_$1633_error = null
try {
var_$1633_value = (if((var_$1935_error == null)) {var_$1935_value} else {throw var_$1935_error}).size
} catch {
case var_err : Throwable => {
var_$1633_error = var_err
}
}
}
var_$1633_init = true
var_$1633_changed = true
}
}
var_$1632_changed = false
if ((var_$1633_init && var_$2022_init)) {
if ((var_$1633_changed) || (var_$2022_changed)) {
var_$1632_unknown = (var_$1633_unknown && var_$2022_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = ((if((var_$1633_error == null)) {var_$1633_value} else {throw var_$1633_error}) == (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}))
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
var_$1689_changed = false
if ((var_$1707_init)) {
if ((var_$1707_changed)) {
var_$1689_unknown = (var_$1707_unknown)
if ((var_$1689_unknown)) {
var_$1689_error = UnknownEventError(null)
} else {
var_$1689_error = null
try {
var_$1689_value = (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}).size
} catch {
case var_err : Throwable => {
var_$1689_error = var_err
}
}
}
var_$1689_init = true
var_$1689_changed = true
}
}
var_$1688_changed = false
if ((var_$1689_init && var_$2022_init)) {
if ((var_$1689_changed) || (var_$2022_changed)) {
var_$1688_unknown = (var_$1689_unknown && var_$2022_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = ((if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}) == (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}))
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
var_$1631_changed = false
if ((var_$1632_init && var_$1688_init)) {
if ((var_$1632_changed) || (var_$1688_changed)) {
var_$1631_unknown = (var_$1632_unknown && var_$1688_unknown)
if ((var_$1631_unknown)) {
var_$1631_error = UnknownEventError(null)
} else {
var_$1631_error = null
try {
var_$1631_value = ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}) && (if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}))
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
var_safeDelay$1746_changed = false
if ((var_safeDelay$1746_nextTs == currTs)) {
var_safeDelay$1746_changed = true
var_safeDelay$1746_unknown = false
}
var_$1744_changed = false
if ((var_safeDelay$1746_changed)) {
if ((var_safeDelay$1746_unknown)) {
var_$1744_error = UnknownEventError(var_safeDelay$1746_error)
} else {
var_$1744_error = null
}
var_$1744_changed = var_safeDelay$1746_changed
var_$1744_unknown = var_safeDelay$1746_unknown
}
var_mergeUnit2$1741_changed = false
if ((var_$1850_changed) || (var_$1744_changed)) {
var_mergeUnit2$1741_ts = currTs
var_mergeUnit2$1741_changed = true
var_mergeUnit2$1741_unknown = (var_$1850_unknown && var_$1744_unknown)
if ((var_$1850_changed)) {
var_mergeUnit2$1741_error = var_$1850_error
} else {
if ((var_$1744_changed)) {
var_mergeUnit2$1741_error = var_$1744_error
}
}
}
var_$1752_changed = false
if ((var_mergeUnit2$1741_changed)) {
var_$1752_value = var_mergeUnit2$1741_ts
var_$1752_init = true
var_$1752_unknown = var_mergeUnit2$1741_unknown
if ((var_$1752_unknown)) {
var_$1752_error = var_mergeUnit2$1741_error
} else {
var_$1752_error = null
}
var_$1752_changed = true
}
var_$1738_changed = false
if ((var_$1653_init && var_$1752_init)) {
if ((var_$1653_changed) || (var_$1752_changed)) {
var_$1738_unknown = (var_$1653_unknown && var_$1752_unknown)
if ((var_$1738_unknown)) {
var_$1738_error = UnknownEventError(null)
} else {
var_$1738_error = null
try {
var_$1738_value = ((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}) <= (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}))
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
var_$1748_changed = false
if ((var_$1729_init && var_$1703_init)) {
if ((var_$1729_changed) || (var_$1703_changed)) {
var_$1748_unknown = (var_$1729_unknown && var_$1703_unknown)
if ((var_$1748_unknown)) {
var_$1748_error = UnknownEventError(null)
} else {
var_$1748_error = null
try {
var_$1748_value = ((if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
} catch {
case var_err : Throwable => {
var_$1748_error = var_err
}
}
}
var_$1748_init = true
var_$1748_changed = true
}
}
var_$1747_changed = false
if ((var_$1748_init && var_$1752_init)) {
if ((var_$1748_changed) || (var_$1752_changed)) {
var_$1747_unknown = (var_$1748_unknown && var_$1752_unknown)
if ((var_$1747_unknown)) {
var_$1747_error = UnknownEventError(null)
} else {
var_$1747_error = null
try {
var_$1747_value = ((if((var_$1748_error == null)) {var_$1748_value} else {throw var_$1748_error}) >= (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}))
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
var_$1737_changed = false
if ((var_$1738_init && var_$1747_init)) {
if ((var_$1738_changed) || (var_$1747_changed)) {
var_$1737_unknown = (var_$1738_unknown && var_$1747_unknown)
if ((var_$1737_unknown)) {
var_$1737_error = UnknownEventError(null)
} else {
var_$1737_error = null
try {
var_$1737_value = ((if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}) && (if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error}))
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
var_$1630_changed = false
if ((var_$1631_init && var_$1737_init)) {
if ((var_$1631_changed) || (var_$1737_changed)) {
var_$1630_unknown = (var_$1631_unknown && var_$1737_unknown)
if ((var_$1630_unknown)) {
var_$1630_error = UnknownEventError(null)
} else {
var_$1630_error = null
try {
var_$1630_value = ((if((var_$1631_error == null)) {var_$1631_value} else {throw var_$1631_error}) || (if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}))
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
var_res$1629_changed = false
if ((var_$1630_init && var_$1882_init && var_$1920_init)) {
if ((var_$1630_changed) || (var_$1882_changed) || (var_$1920_changed)) {
var_res$1629_unknown = (var_$1630_unknown && var_$1882_unknown && var_$1920_unknown)
if ((var_res$1629_unknown)) {
var_res$1629_error = UnknownEventError(null)
} else {
var_res$1629_error = null
try {
var_res$1629_value = (if ((if((var_$1630_error == null)) {var_$1630_value} else {throw var_$1630_error})) (if((var_$1882_error == null)) {var_$1882_value} else {throw var_$1882_error}) else (if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}))
} catch {
case var_err : Throwable => {
var_res$1629_error = var_err
}
}
}
var_res$1629_init = true
var_res$1629_ts = currTs
var_res$1629_changed = true
}
}
var_$1767_changed = false
if ((var_res$1629_changed)) {
if ((var_$1620_ts == currTs && var_$1620_lastInit) || (!(var_$1620_ts == currTs) && var_$1620_init)) {
var_$1767_changed = true
var_$1767_init = true
var_$1767_unknown = var_res$1629_unknown
if ((var_$1767_unknown)) {
var_$1767_error = var_res$1629_error
} else {
if ((var_$1620_ts == currTs)) {
var_$1767_value = var_$1620_lastValue
var_$1767_error = var_$1620_lastError
} else {
var_$1767_value = var_$1620_value
var_$1767_error = var_$1620_error
}
}
}
}
var_$1771_changed = false
if ((var_res$1629_init)) {
if ((var_res$1629_changed)) {
var_$1771_unknown = (var_res$1629_unknown)
if ((var_$1771_unknown)) {
var_$1771_error = UnknownEventError(null)
} else {
var_$1771_error = null
try {
var_$1771_value = var_$1924.apply((if((var_res$1629_error == null)) {var_res$1629_value} else {throw var_res$1629_error}))
} catch {
case var_err : Throwable => {
var_$1771_error = var_err
}
}
}
var_$1771_init = true
var_$1771_changed = true
}
}
var_$1770_changed = false
if ((var_$1771_init && var_$1873_init)) {
if ((var_$1771_changed) || (var_$1873_changed)) {
var_$1770_unknown = (var_$1771_unknown && var_$1873_unknown)
if ((var_$1770_unknown)) {
var_$1770_error = UnknownEventError(null)
} else {
var_$1770_error = null
try {
var_$1770_value = ((if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}) == (if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}))
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
var_$1776_changed = false
if ((var_res$1629_init)) {
if ((var_res$1629_changed)) {
var_$1776_unknown = (var_res$1629_unknown)
if ((var_$1776_unknown)) {
var_$1776_error = UnknownEventError(null)
} else {
var_$1776_error = null
try {
var_$1776_value = var_$1926.apply((if((var_res$1629_error == null)) {var_res$1629_value} else {throw var_res$1629_error}))
} catch {
case var_err : Throwable => {
var_$1776_error = var_err
}
}
}
var_$1776_init = true
var_$1776_changed = true
}
}
var_$1775_changed = false
if ((var_$1776_init && var_$1916_init)) {
if ((var_$1776_changed) || (var_$1916_changed)) {
var_$1775_unknown = (var_$1776_unknown && var_$1916_unknown)
if ((var_$1775_unknown)) {
var_$1775_error = UnknownEventError(null)
} else {
var_$1775_error = null
try {
var_$1775_value = ((if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}) == (if((var_$1916_error == null)) {var_$1916_value} else {throw var_$1916_error}))
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
var_$1769_changed = false
if ((var_$1770_init && var_$1775_init)) {
if ((var_$1770_changed) || (var_$1775_changed)) {
var_$1769_unknown = (var_$1770_unknown && var_$1775_unknown)
if ((var_$1769_unknown)) {
var_$1769_error = UnknownEventError(null)
} else {
var_$1769_error = null
try {
var_$1769_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) && (if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}))
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
var_isFinalFalse$1766_changed = false
if ((var_$1767_init && var_$1769_init)) {
if ((var_$1767_changed) || (var_$1769_changed)) {
var_isFinalFalse$1766_unknown = (var_$1767_unknown && var_$1769_unknown)
if ((var_isFinalFalse$1766_unknown)) {
var_isFinalFalse$1766_error = UnknownEventError(null)
} else {
var_isFinalFalse$1766_error = null
try {
var_isFinalFalse$1766_value = ((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error}) || (if((var_$1769_error == null)) {var_$1769_value} else {throw var_$1769_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1766_error = var_err
}
}
}
var_isFinalFalse$1766_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1765_changed = false
}
if ((var_isFinalFalse$1766_changed)) {
var_$1765_lastValue = var_$1765_value
var_$1765_lastInit = var_$1765_init
var_$1765_lastError = var_$1765_error
var_$1765_value = var_isFinalFalse$1766_value
var_$1765_init = true
var_$1765_ts = currTs
var_$1765_error = var_isFinalFalse$1766_error
var_$1765_changed = true
var_$1765_unknown = var_isFinalFalse$1766_unknown
}
if ((!(currTs == 0L))) {
var_delayPeriod$2032_changed = false
}
if ((var_$1736_changed)) {
var_delayPeriod$2032_value = var_$1736_value
var_delayPeriod$2032_init = true
var_delayPeriod$2032_error = var_$1736_error
var_delayPeriod$2032_changed = true
var_delayPeriod$2032_unknown = var_$1736_unknown
}
var_$2070_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$2070_changed = true
var_$2070_unknown = var_event_unknown
if ((var_$2070_unknown)) {
var_$2070_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$2070_error = var_event_lastError
} else {
var_$2070_error = var_event_error
}
}
}
}
var_$2069_changed = false
if ((var_$2070_changed)) {
var_$2069_value = false
if ((var_$2070_unknown)) {
var_$2069_error = UnknownEventError(var_$2070_error)
} else {
var_$2069_error = null
}
var_$2069_changed = var_$2070_changed
var_$2069_unknown = var_$2070_unknown
}
var_$2071_changed = false
if ((var_event_changed)) {
var_$2071_value = true
if ((var_event_unknown)) {
var_$2071_error = UnknownEventError(var_event_error)
} else {
var_$2071_error = null
}
var_$2071_changed = var_event_changed
var_$2071_unknown = var_event_unknown
}
if ((var_$2069_changed) || (var_$2071_changed) || (var_$1916_changed)) {
var_isFirst$2041_init = true
var_isFirst$2041_unknown = (var_$2069_unknown && var_$2071_unknown && var_$1916_unknown)
if ((var_$2069_changed)) {
var_isFirst$2041_value = var_$2069_value
var_isFirst$2041_error = var_$2069_error
} else {
if ((var_$2071_changed)) {
var_isFirst$2041_value = var_$2071_value
var_isFirst$2041_error = var_$2071_error
} else {
if ((var_$1916_changed)) {
var_isFirst$2041_value = var_$1916_value
var_isFirst$2041_error = var_$1916_error
}
}
}
}
var_firstEvent$2040_changed = false
if ((var_isFirst$2041_init && var_event_changed)) {
if ((var_isFirst$2041_value) || (!(var_isFirst$2041_error == null)) || (var_isFirst$2041_unknown)) {
if ((!(var_isFirst$2041_error == null))) {
var_firstEvent$2040_error = var_isFirst$2041_error
} else {
var_firstEvent$2040_error = var_event_error
}
var_firstEvent$2040_changed = true
var_firstEvent$2040_ts = var_event_ts
var_firstEvent$2040_unknown = (var_event_unknown || !(var_isFirst$2041_error == null))
}
}
var_$2039_changed = false
if ((var_firstEvent$2040_changed)) {
var_$2039_value = var_firstEvent$2040_ts
var_$2039_unknown = var_firstEvent$2040_unknown
if ((var_$2039_unknown)) {
var_$2039_error = var_firstEvent$2040_error
} else {
var_$2039_error = null
}
var_$2039_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$2038_changed = false
}
if ((var_$2039_changed)) {
var_defaultTime$2038_value = var_$2039_value
var_defaultTime$2038_init = true
var_defaultTime$2038_error = var_$2039_error
var_defaultTime$2038_changed = true
var_defaultTime$2038_unknown = var_$2039_unknown
}
var_$2035_changed = false
if ((var_defaultTime$2036_init && var_defaultTime$2038_init)) {
if ((var_defaultTime$2036_changed) || (var_defaultTime$2038_changed)) {
var_$2035_unknown = (var_defaultTime$2036_unknown && var_defaultTime$2038_unknown)
if ((var_$2035_unknown)) {
var_$2035_error = UnknownEventError(null)
} else {
var_$2035_error = null
try {
var_$2035_value = ((if((var_defaultTime$2036_error == null)) {var_defaultTime$2036_value} else {throw var_defaultTime$2036_error}) == (if((var_defaultTime$2038_error == null)) {var_defaultTime$2038_value} else {throw var_defaultTime$2038_error}))
} catch {
case var_err : Throwable => {
var_$2035_error = var_err
}
}
}
var_$2035_init = true
var_$2035_changed = true
}
}
var_$2043_changed = false
if ((var_$1859_init && var_$1810_init)) {
if ((var_$1859_changed) || (var_$1810_changed)) {
var_$2043_unknown = (var_$1859_unknown && var_$1810_unknown)
if ((var_$2043_unknown)) {
var_$2043_error = UnknownEventError(null)
} else {
var_$2043_error = null
try {
var_$2043_value = ((if((var_$1859_error == null)) {var_$1859_value} else {throw var_$1859_error}) - (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
} catch {
case var_err : Throwable => {
var_$2043_error = var_err
}
}
}
var_$2043_init = true
var_$2043_changed = true
}
}
var_$2042_changed = false
if ((var_$2043_init && var_$1703_init)) {
if ((var_$2043_changed) || (var_$1703_changed)) {
var_$2042_unknown = (var_$2043_unknown && var_$1703_unknown)
if ((var_$2042_unknown)) {
var_$2042_error = UnknownEventError(null)
} else {
var_$2042_error = null
try {
var_$2042_value = ((if((var_$2043_error == null)) {var_$2043_value} else {throw var_$2043_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$2056_changed = false
if ((var_$1834_init)) {
if ((var_$1834_changed)) {
var_$2056_unknown = (var_$1834_unknown)
if ((var_$2056_unknown)) {
var_$2056_error = UnknownEventError(null)
} else {
var_$2056_error = null
try {
var_$2056_value = (if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}).tail
} catch {
case var_err : Throwable => {
var_$2056_error = var_err
}
}
}
var_$2056_init = true
var_$2056_changed = true
}
}
var_$2055_changed = false
if ((var_$2056_init)) {
if ((var_$2056_changed)) {
var_$2055_unknown = (var_$2056_unknown)
if ((var_$2055_unknown)) {
var_$2055_error = UnknownEventError(null)
} else {
var_$2055_error = null
try {
var_$2055_value = (var_head$1668.apply(((if((var_$2056_error == null)) {var_$2056_value} else {throw var_$2056_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
if ((var_$2055_init && var_$2066_init)) {
if ((var_$2055_changed) || (var_$2066_changed)) {
var_$2054_unknown = (var_$2055_unknown && var_$2066_unknown)
if ((var_$2054_unknown)) {
var_$2054_error = UnknownEventError(null)
} else {
var_$2054_error = null
try {
var_$2054_value = ((if((var_$2055_error == null)) {var_$2055_value} else {throw var_$2055_error}) + (if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}))
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
if ((var_$2054_init && var_$1810_init)) {
if ((var_$2054_changed) || (var_$1810_changed)) {
var_$2053_unknown = (var_$2054_unknown && var_$1810_unknown)
if ((var_$2053_unknown)) {
var_$2053_error = UnknownEventError(null)
} else {
var_$2053_error = null
try {
var_$2053_value = ((if((var_$2054_error == null)) {var_$2054_value} else {throw var_$2054_error}) - (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
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
if ((var_$2053_init && var_$1703_init)) {
if ((var_$2053_changed) || (var_$1703_changed)) {
var_$2052_unknown = (var_$2053_unknown && var_$1703_unknown)
if ((var_$2052_unknown)) {
var_$2052_error = UnknownEventError(null)
} else {
var_$2052_error = null
try {
var_$2052_value = ((if((var_$2053_error == null)) {var_$2053_value} else {throw var_$2053_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_delayPeriod$2034_changed = false
if ((var_$2035_init && var_$2042_init && var_$2052_init)) {
if ((var_$2035_changed) || (var_$2042_changed) || (var_$2052_changed)) {
var_delayPeriod$2034_unknown = (var_$2035_unknown && var_$2042_unknown && var_$2052_unknown)
if ((var_delayPeriod$2034_unknown)) {
var_delayPeriod$2034_error = UnknownEventError(null)
} else {
var_delayPeriod$2034_error = null
try {
var_delayPeriod$2034_value = (if ((if((var_$2035_error == null)) {var_$2035_value} else {throw var_$2035_error})) (if((var_$2042_error == null)) {var_$2042_value} else {throw var_$2042_error}) else (if((var_$2052_error == null)) {var_$2052_value} else {throw var_$2052_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$2034_error = var_err
}
}
}
var_delayPeriod$2034_init = true
var_delayPeriod$2034_changed = true
}
}
var_$2029_changed = false
if ((var_$1873_init && var_delayPeriod$2032_init && var_delayPeriod$2034_init)) {
if ((var_$1873_changed) || (var_delayPeriod$2032_changed) || (var_delayPeriod$2034_changed)) {
var_$2029_unknown = (var_$1873_unknown && var_delayPeriod$2032_unknown && var_delayPeriod$2034_unknown)
if ((var_$2029_unknown)) {
var_$2029_error = UnknownEventError(null)
} else {
var_$2029_error = null
try {
var_$2029_value = (if ((if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error})) (if((var_delayPeriod$2032_error == null)) {var_delayPeriod$2032_value} else {throw var_delayPeriod$2032_error}) else (if((var_delayPeriod$2034_error == null)) {var_delayPeriod$2034_value} else {throw var_delayPeriod$2034_error}))
} catch {
case var_err : Throwable => {
var_$2029_error = var_err
}
}
}
var_$2029_init = true
var_$2029_ts = currTs
var_$2029_changed = true
}
}
var_$1909_changed = false
if ((var_$1804_changed)) {
var_$1909_value = var_$1804_ts
var_$1909_init = true
var_$1909_unknown = var_$1804_unknown
if ((var_$1909_unknown)) {
var_$1909_error = var_$1804_error
} else {
var_$1909_error = null
}
var_$1909_changed = true
}
var_$1760_changed = false
if ((var_$1776_init)) {
if ((var_$1776_changed)) {
var_$1760_unknown = (var_$1776_unknown)
if ((var_$1760_unknown)) {
var_$1760_error = UnknownEventError(null)
} else {
var_$1760_error = null
try {
var_$1760_value = !((if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
} catch {
case var_err : Throwable => {
var_$1760_error = var_err
}
}
}
var_$1760_init = true
var_$1760_changed = true
}
}
var_$1627_changed = false
if ((var_$1771_init && var_$1760_init)) {
if ((var_$1771_changed) || (var_$1760_changed)) {
var_$1627_unknown = (var_$1771_unknown && var_$1760_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = ((if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}) && (if((var_$1760_error == null)) {var_$1760_value} else {throw var_$1760_error}))
} catch {
case var_err : Throwable => {
var_$1627_error = var_err
}
}
}
var_$1627_init = true
var_$1627_changed = true
}
}
var_prev$1764_changed = false
if ((var_$1765_changed)) {
if ((var_$1765_ts == currTs && var_$1765_lastInit) || (!(var_$1765_ts == currTs) && var_$1765_init)) {
var_prev$1764_changed = true
var_prev$1764_init = true
var_prev$1764_unknown = var_$1765_unknown
if ((var_prev$1764_unknown)) {
var_prev$1764_error = var_$1765_error
} else {
if ((var_$1765_ts == currTs)) {
var_prev$1764_value = var_$1765_lastValue
var_prev$1764_error = var_$1765_lastError
} else {
var_prev$1764_value = var_$1765_value
var_prev$1764_error = var_$1765_error
}
}
}
}
var_$1763_changed = false
if ((var_prev$1764_init)) {
if ((var_prev$1764_changed)) {
var_$1763_unknown = (var_prev$1764_unknown)
if ((var_$1763_unknown)) {
var_$1763_error = UnknownEventError(null)
} else {
var_$1763_error = null
try {
var_$1763_value = !((if((var_prev$1764_error == null)) {var_prev$1764_value} else {throw var_prev$1764_error}))
} catch {
case var_err : Throwable => {
var_$1763_error = var_err
}
}
}
var_$1763_init = true
var_$1763_changed = true
}
}
var_$1626_changed = false
if ((var_$1627_init && var_$1763_init)) {
if ((var_$1627_changed) || (var_$1763_changed)) {
var_$1626_unknown = (var_$1627_unknown && var_$1763_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) && (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
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
var_$1786_changed = false
if ((var_res$1629_changed)) {
var_$1786_value = var_res$1629_ts
var_$1786_init = true
var_$1786_unknown = var_res$1629_unknown
if ((var_$1786_unknown)) {
var_$1786_error = var_res$1629_error
} else {
var_$1786_error = null
}
var_$1786_changed = true
}
var_$1781_changed = false
if ((var_$1765_changed)) {
if ((var_$1782_ts == currTs && var_$1782_lastInit) || (!(var_$1782_ts == currTs) && var_$1782_init)) {
var_$1781_changed = true
var_$1781_init = true
var_$1781_unknown = var_$1765_unknown
if ((var_$1781_unknown)) {
var_$1781_error = var_$1765_error
} else {
if ((var_$1782_ts == currTs)) {
var_$1781_value = var_$1782_lastValue
var_$1781_error = var_$1782_lastError
} else {
var_$1781_value = var_$1782_value
var_$1781_error = var_$1782_error
}
}
}
}
var_finalFalseSince$1625_changed = false
if ((var_$1626_init && var_$1786_init && var_$1781_init)) {
if ((var_$1626_changed) || (var_$1786_changed) || (var_$1781_changed)) {
var_finalFalseSince$1625_unknown = (var_$1626_unknown && var_$1786_unknown && var_$1781_unknown)
if ((var_finalFalseSince$1625_unknown)) {
var_finalFalseSince$1625_error = UnknownEventError(null)
} else {
var_finalFalseSince$1625_error = null
try {
var_finalFalseSince$1625_value = (if ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error})) (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}) else (if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1625_error = var_err
}
}
}
var_finalFalseSince$1625_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1782_changed = false
}
if ((var_finalFalseSince$1625_changed)) {
var_$1782_lastValue = var_$1782_value
var_$1782_lastInit = var_$1782_init
var_$1782_lastError = var_$1782_error
var_$1782_value = var_finalFalseSince$1625_value
var_$1782_init = true
var_$1782_ts = currTs
var_$1782_error = var_finalFalseSince$1625_error
var_$1782_changed = true
var_$1782_unknown = var_finalFalseSince$1625_unknown
}
var_$1623_changed = false
if ((var_$1782_init && var_$2066_init)) {
if ((var_$1782_changed) || (var_$2066_changed)) {
var_$1623_unknown = (var_$1782_unknown && var_$2066_unknown)
if ((var_$1623_unknown)) {
var_$1623_error = UnknownEventError(null)
} else {
var_$1623_error = null
try {
var_$1623_value = ((if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}) + (if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}))
} catch {
case var_err : Throwable => {
var_$1623_error = var_err
}
}
}
var_$1623_init = true
var_$1623_changed = true
}
}
var_$1622_changed = false
if ((var_$1623_init && var_$1786_init)) {
if ((var_$1623_changed) || (var_$1786_changed)) {
var_$1622_unknown = (var_$1623_unknown && var_$1786_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1623_error == null)) {var_$1623_value} else {throw var_$1623_error}) < (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
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
var_isFinalFalseReset$1621_changed = false
if ((var_$1622_init && var_$1916_init && var_$1765_init)) {
if ((var_$1622_changed) || (var_$1916_changed) || (var_$1765_changed)) {
var_isFinalFalseReset$1621_unknown = (var_$1622_unknown && var_$1916_unknown && var_$1765_unknown)
if ((var_isFinalFalseReset$1621_unknown)) {
var_isFinalFalseReset$1621_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1621_error = null
try {
var_isFinalFalseReset$1621_value = (if ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error})) (if((var_$1916_error == null)) {var_$1916_value} else {throw var_$1916_error}) else (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1621_error = var_err
}
}
}
var_isFinalFalseReset$1621_changed = true
}
}
var_$1620_changed = false
if ((var_isFinalFalseReset$1621_changed) || (var_$1765_changed)) {
var_$1620_lastValue = var_$1620_value
var_$1620_lastInit = var_$1620_init
var_$1620_lastError = var_$1620_error
var_$1620_init = true
var_$1620_ts = currTs
var_$1620_changed = true
var_$1620_unknown = (var_isFinalFalseReset$1621_unknown && var_$1765_unknown)
if ((var_isFinalFalseReset$1621_changed)) {
var_$1620_value = var_isFinalFalseReset$1621_value
var_$1620_error = var_isFinalFalseReset$1621_error
} else {
if ((var_$1765_changed)) {
var_$1620_value = var_$1765_value
var_$1620_error = var_$1765_error
}
}
}
var_$1910_changed = false
if ((var_$1894_changed)) {
if ((var_$1799_ts == currTs && var_$1799_lastInit) || (!(var_$1799_ts == currTs) && var_$1799_init)) {
var_$1910_changed = true
var_$1910_init = true
var_$1910_unknown = var_$1894_unknown
if ((var_$1910_unknown)) {
var_$1910_error = var_$1894_error
} else {
if ((var_$1799_ts == currTs)) {
var_$1910_value = var_$1799_lastValue
var_$1910_error = var_$1799_lastError
} else {
var_$1910_value = var_$1799_value
var_$1910_error = var_$1799_error
}
}
}
}
var_finalFalseSince$1800_changed = false
if ((var_$1801_init && var_$1909_init && var_$1910_init)) {
if ((var_$1801_changed) || (var_$1909_changed) || (var_$1910_changed)) {
var_finalFalseSince$1800_unknown = (var_$1801_unknown && var_$1909_unknown && var_$1910_unknown)
if ((var_finalFalseSince$1800_unknown)) {
var_finalFalseSince$1800_error = UnknownEventError(null)
} else {
var_finalFalseSince$1800_error = null
try {
var_finalFalseSince$1800_value = (if ((if((var_$1801_error == null)) {var_$1801_value} else {throw var_$1801_error})) (if((var_$1909_error == null)) {var_$1909_value} else {throw var_$1909_error}) else (if((var_$1910_error == null)) {var_$1910_value} else {throw var_$1910_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1800_error = var_err
}
}
}
var_finalFalseSince$1800_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1799_changed = false
}
if ((var_finalFalseSince$1800_changed)) {
var_$1799_lastValue = var_$1799_value
var_$1799_lastInit = var_$1799_init
var_$1799_lastError = var_$1799_error
var_$1799_value = var_finalFalseSince$1800_value
var_$1799_init = true
var_$1799_ts = currTs
var_$1799_error = var_finalFalseSince$1800_error
var_$1799_changed = true
var_$1799_unknown = var_finalFalseSince$1800_unknown
}
var_$1798_changed = false
if ((var_$1799_init && var_$2066_init)) {
if ((var_$1799_changed) || (var_$2066_changed)) {
var_$1798_unknown = (var_$1799_unknown && var_$2066_unknown)
if ((var_$1798_unknown)) {
var_$1798_error = UnknownEventError(null)
} else {
var_$1798_error = null
try {
var_$1798_value = ((if((var_$1799_error == null)) {var_$1799_value} else {throw var_$1799_error}) + (if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}))
} catch {
case var_err : Throwable => {
var_$1798_error = var_err
}
}
}
var_$1798_init = true
var_$1798_changed = true
}
}
var_$1797_changed = false
}
def chunk2() = {
if ((var_$1798_init && var_$1909_init)) {
if ((var_$1798_changed) || (var_$1909_changed)) {
var_$1797_unknown = (var_$1798_unknown && var_$1909_unknown)
if ((var_$1797_unknown)) {
var_$1797_error = UnknownEventError(null)
} else {
var_$1797_error = null
try {
var_$1797_value = ((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}) < (if((var_$1909_error == null)) {var_$1909_value} else {throw var_$1909_error}))
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
var_isFinalFalseReset$1796_changed = false
if ((var_$1797_init && var_$1916_init && var_$1894_init)) {
if ((var_$1797_changed) || (var_$1916_changed) || (var_$1894_changed)) {
var_isFinalFalseReset$1796_unknown = (var_$1797_unknown && var_$1916_unknown && var_$1894_unknown)
if ((var_isFinalFalseReset$1796_unknown)) {
var_isFinalFalseReset$1796_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1796_error = null
try {
var_isFinalFalseReset$1796_value = (if ((if((var_$1797_error == null)) {var_$1797_value} else {throw var_$1797_error})) (if((var_$1916_error == null)) {var_$1916_value} else {throw var_$1916_error}) else (if((var_$1894_error == null)) {var_$1894_value} else {throw var_$1894_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1796_error = var_err
}
}
}
var_isFinalFalseReset$1796_changed = true
}
}
var_$1795_changed = false
if ((var_isFinalFalseReset$1796_changed) || (var_$1894_changed)) {
var_$1795_lastValue = var_$1795_value
var_$1795_lastInit = var_$1795_init
var_$1795_lastError = var_$1795_error
var_$1795_init = true
var_$1795_ts = currTs
var_$1795_changed = true
var_$1795_unknown = (var_isFinalFalseReset$1796_unknown && var_$1894_unknown)
if ((var_isFinalFalseReset$1796_changed)) {
var_$1795_value = var_isFinalFalseReset$1796_value
var_$1795_error = var_isFinalFalseReset$1796_error
} else {
if ((var_$1894_changed)) {
var_$1795_value = var_$1894_value
var_$1795_error = var_$1894_error
}
}
}
var_$2007_changed = false
if ((var_$1688_init && var_$2022_init && var_$2015_init)) {
if ((var_$1688_changed) || (var_$2022_changed) || (var_$2015_changed)) {
var_$2007_unknown = (var_$1688_unknown && var_$2022_unknown && var_$2015_unknown)
if ((var_$2007_unknown)) {
var_$2007_error = UnknownEventError(null)
} else {
var_$2007_error = null
try {
var_$2007_value = (if ((if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error})) (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}) else (if((var_$2015_error == null)) {var_$2015_value} else {throw var_$2015_error}))
} catch {
case var_err : Throwable => {
var_$2007_error = var_err
}
}
}
var_$2007_init = true
var_$2007_changed = true
}
}
var_$2006_changed = false
if ((var_$2007_init && var_$1703_init)) {
if ((var_$2007_changed) || (var_$1703_changed)) {
var_$2006_unknown = (var_$2007_unknown && var_$1703_unknown)
if ((var_$2006_unknown)) {
var_$2006_error = UnknownEventError(null)
} else {
var_$2006_error = null
try {
var_$2006_value = ((if((var_$2007_error == null)) {var_$2007_value} else {throw var_$2007_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
if ((var_$2006_init && var_$1810_init)) {
if ((var_$2006_changed) || (var_$1810_changed)) {
var_$2005_unknown = (var_$2006_unknown && var_$1810_unknown)
if ((var_$2005_unknown)) {
var_$2005_error = UnknownEventError(null)
} else {
var_$2005_error = null
try {
var_$2005_value = ((if((var_$2006_error == null)) {var_$2006_value} else {throw var_$2006_error}) - (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
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
if ((var_$2005_init && var_$1703_init)) {
if ((var_$2005_changed) || (var_$1703_changed)) {
var_$2004_unknown = (var_$2005_unknown && var_$1703_unknown)
if ((var_$2004_unknown)) {
var_$2004_error = UnknownEventError(null)
} else {
var_$2004_error = null
try {
var_$2004_value = ((if((var_$2005_error == null)) {var_$2005_value} else {throw var_$2005_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
} catch {
case var_err : Throwable => {
var_$2004_error = var_err
}
}
}
var_$2004_init = true
var_$2004_ts = currTs
var_$2004_changed = true
}
}
var_$2003_changed = false
if ((var_$2004_init && var_$2022_init)) {
if ((var_$2004_changed) || (var_$2022_changed)) {
var_$2003_unknown = (var_$2004_unknown && var_$2022_unknown)
if ((var_$2003_unknown)) {
var_$2003_error = UnknownEventError(null)
} else {
var_$2003_error = null
try {
var_$2003_value = ((if((var_$2004_error == null)) {var_$2004_value} else {throw var_$2004_error}) > (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}))
} catch {
case var_err : Throwable => {
var_$2003_error = var_err
}
}
}
var_$2003_init = true
var_$2003_changed = true
}
}
if ((var_$1707_init)) {
if ((var_$1707_changed)) {
var_$1727_lastValue = var_$1727_value
var_$1727_lastInit = var_$1727_init
var_$1727_lastError = var_$1727_error
var_$1727_unknown = (var_$1707_unknown)
if ((var_$1727_unknown)) {
var_$1727_error = UnknownEventError(null)
} else {
var_$1727_error = null
try {
var_$1727_value = (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}).tail
} catch {
case var_err : Throwable => {
var_$1727_error = var_err
}
}
}
var_$1727_init = true
var_$1727_ts = currTs
}
}
var_$2027_changed = false
if ((var_$2004_changed)) {
var_$2027_value = var_$2004_ts
var_$2027_init = true
var_$2027_unknown = var_$2004_unknown
if ((var_$2027_unknown)) {
var_$2027_error = var_$2004_error
} else {
var_$2027_error = null
}
var_$2027_changed = true
}
var_$2024_changed = false
if ((var_$2066_init && var_$2027_init)) {
if ((var_$2066_changed) || (var_$2027_changed)) {
var_$2024_unknown = (var_$2066_unknown && var_$2027_unknown)
if ((var_$2024_unknown)) {
var_$2024_error = UnknownEventError(null)
} else {
var_$2024_error = null
try {
var_$2024_value = ((if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}) - (if((var_$2027_error == null)) {var_$2027_value} else {throw var_$2027_error}))
} catch {
case var_err : Throwable => {
var_$2024_error = var_err
}
}
}
var_$2024_init = true
var_$2024_changed = true
}
}
var_$2068_changed = false
if ((var_$2029_changed)) {
var_$2068_value = var_$2029_ts
var_$2068_init = true
var_$2068_unknown = var_$2029_unknown
if ((var_$2068_unknown)) {
var_$2068_error = var_$2029_error
} else {
var_$2068_error = null
}
var_$2068_changed = true
}
var_$2065_changed = false
if ((var_$2066_init && var_$2068_init)) {
if ((var_$2066_changed) || (var_$2068_changed)) {
var_$2065_unknown = (var_$2066_unknown && var_$2068_unknown)
if ((var_$2065_unknown)) {
var_$2065_error = UnknownEventError(null)
} else {
var_$2065_error = null
try {
var_$2065_value = ((if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}) - (if((var_$2068_error == null)) {var_$2068_value} else {throw var_$2068_error}))
} catch {
case var_err : Throwable => {
var_$2065_error = var_err
}
}
}
var_$2065_init = true
var_$2065_changed = true
}
}
var_$1943_changed = false
if ((var_$2003_init && var_$2004_init && var_$2024_init)) {
if ((var_$2003_changed) || (var_$2004_changed) || (var_$2024_changed)) {
var_$1943_unknown = (var_$2003_unknown && var_$2004_unknown && var_$2024_unknown)
if ((var_$1943_unknown)) {
var_$1943_error = UnknownEventError(null)
} else {
var_$1943_error = null
try {
var_$1943_value = (if ((if((var_$2003_error == null)) {var_$2003_value} else {throw var_$2003_error})) (if((var_$2004_error == null)) {var_$2004_value} else {throw var_$2004_error}) else (if((var_$2024_error == null)) {var_$2024_value} else {throw var_$2024_error}))
} catch {
case var_err : Throwable => {
var_$1943_error = var_err
}
}
}
var_$1943_changed = true
}
}
var_$2028_changed = false
if ((var_$2029_init && var_$2022_init)) {
if ((var_$2029_changed) || (var_$2022_changed)) {
var_$2028_unknown = (var_$2029_unknown && var_$2022_unknown)
if ((var_$2028_unknown)) {
var_$2028_error = UnknownEventError(null)
} else {
var_$2028_error = null
try {
var_$2028_value = ((if((var_$2029_error == null)) {var_$2029_value} else {throw var_$2029_error}) > (if((var_$2022_error == null)) {var_$2022_value} else {throw var_$2022_error}))
} catch {
case var_err : Throwable => {
var_$2028_error = var_err
}
}
}
var_$2028_init = true
var_$2028_changed = true
}
}
var_$1952_changed = false
if ((var_$2028_init && var_$2029_init && var_$2065_init)) {
if ((var_$2028_changed) || (var_$2029_changed) || (var_$2065_changed)) {
var_$1952_unknown = (var_$2028_unknown && var_$2029_unknown && var_$2065_unknown)
if ((var_$1952_unknown)) {
var_$1952_error = UnknownEventError(null)
} else {
var_$1952_error = null
try {
var_$1952_value = (if ((if((var_$2028_error == null)) {var_$2028_value} else {throw var_$2028_error})) (if((var_$2029_error == null)) {var_$2029_value} else {throw var_$2029_error}) else (if((var_$2065_error == null)) {var_$2065_value} else {throw var_$2065_error}))
} catch {
case var_err : Throwable => {
var_$1952_error = var_err
}
}
}
var_$1952_changed = true
}
}
var_stillFulfillableReset$1619_changed = false
if ((var_$1620_init && var_$1920_init && var_res$1629_init)) {
if ((var_$1620_changed) || (var_$1920_changed) || (var_res$1629_changed)) {
var_stillFulfillableReset$1619_lastValue = var_stillFulfillableReset$1619_value
var_stillFulfillableReset$1619_lastInit = var_stillFulfillableReset$1619_init
var_stillFulfillableReset$1619_lastError = var_stillFulfillableReset$1619_error
var_stillFulfillableReset$1619_unknown = (var_$1620_unknown && var_$1920_unknown && var_res$1629_unknown)
if ((var_stillFulfillableReset$1619_unknown)) {
var_stillFulfillableReset$1619_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1619_error = null
try {
var_stillFulfillableReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}) else (if((var_res$1629_error == null)) {var_res$1629_value} else {throw var_res$1629_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1619_error = var_err
}
}
}
var_stillFulfillableReset$1619_init = true
var_stillFulfillableReset$1619_ts = currTs
var_stillFulfillableReset$1619_changed = true
}
}
var_stillFulfillableReset$1794_changed = false
if ((var_$1795_init && var_$1920_init && var_$1804_init)) {
if ((var_$1795_changed) || (var_$1920_changed) || (var_$1804_changed)) {
var_stillFulfillableReset$1794_unknown = (var_$1795_unknown && var_$1920_unknown && var_$1804_unknown)
if ((var_stillFulfillableReset$1794_unknown)) {
var_stillFulfillableReset$1794_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1794_error = null
try {
var_stillFulfillableReset$1794_value = (if ((if((var_$1795_error == null)) {var_$1795_value} else {throw var_$1795_error})) (if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}) else (if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1794_error = var_err
}
}
}
var_stillFulfillableReset$1794_init = true
var_stillFulfillableReset$1794_changed = true
}
}
var_sporadicConstraint$1618_changed = false
if ((var_stillFulfillableReset$1619_init && var_stillFulfillableReset$1794_init)) {
if ((var_stillFulfillableReset$1619_changed) || (var_stillFulfillableReset$1794_changed)) {
var_sporadicConstraint$1618_unknown = (var_stillFulfillableReset$1619_unknown && var_stillFulfillableReset$1794_unknown)
if ((var_sporadicConstraint$1618_unknown)) {
var_sporadicConstraint$1618_error = UnknownEventError(null)
} else {
var_sporadicConstraint$1618_error = null
try {
var_sporadicConstraint$1618_value = var_fourValuedConjunction$1923.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}), (if((var_stillFulfillableReset$1794_error == null)) {var_stillFulfillableReset$1794_value} else {throw var_stillFulfillableReset$1794_error}))
} catch {
case var_err : Throwable => {
var_sporadicConstraint$1618_error = var_err
}
}
}
var_sporadicConstraint$1618_init = true
var_sporadicConstraint$1618_changed = true
}
}
var_final$1617_changed = false
if ((var_sporadicConstraint$1618_init)) {
if ((var_sporadicConstraint$1618_changed)) {
var_final$1617_unknown = (var_sporadicConstraint$1618_unknown)
if ((var_final$1617_unknown)) {
var_final$1617_error = UnknownEventError(null)
} else {
var_final$1617_error = null
try {
var_final$1617_value = var_$1924.apply((if((var_sporadicConstraint$1618_error == null)) {var_sporadicConstraint$1618_value} else {throw var_sporadicConstraint$1618_error}))
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
if ((var_$1935_init)) {
if ((var_$1935_changed)) {
var_$1678_lastValue = var_$1678_value
var_$1678_lastInit = var_$1678_init
var_$1678_lastError = var_$1678_error
var_$1678_unknown = (var_$1935_unknown)
if ((var_$1678_unknown)) {
var_$1678_error = UnknownEventError(null)
} else {
var_$1678_error = null
try {
var_$1678_value = (if((var_$1935_error == null)) {var_$1935_value} else {throw var_$1935_error}).tail
} catch {
case var_err : Throwable => {
var_$1678_error = var_err
}
}
}
var_$1678_init = true
var_$1678_ts = currTs
}
}
var_value$1925_changed = false
if ((var_sporadicConstraint$1618_init)) {
if ((var_sporadicConstraint$1618_changed)) {
var_value$1925_unknown = (var_sporadicConstraint$1618_unknown)
if ((var_value$1925_unknown)) {
var_value$1925_error = UnknownEventError(null)
} else {
var_value$1925_error = null
try {
var_value$1925_value = var_$1926.apply((if((var_sporadicConstraint$1618_error == null)) {var_sporadicConstraint$1618_value} else {throw var_sporadicConstraint$1618_error}))
} catch {
case var_err : Throwable => {
var_value$1925_error = var_err
}
}
}
var_value$1925_init = true
var_value$1925_changed = true
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

if (((var_safeDelay$1854_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1854_nextTs))) {
currTs = var_safeDelay$1854_nextTs
}
if (((var_safeDelay$1746_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1746_nextTs))) {
currTs = var_safeDelay$1746_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

chunk1()
chunk2()


if ((var_event_unknown) || (!(var_$1952_error == null)) || (var_$1952_changed && (0L >= var_$1952_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1952_changed)) {
if ((var_safeDelay$1854_changed) || (var_event_changed)) {
var_safeDelay$1854_nextTs = (currTs + var_$1952_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1854_nextTs = -1L
}
}
}
if ((var_event_unknown) || (!(var_$1943_error == null)) || (var_$1943_changed && (0L >= var_$1943_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1943_changed)) {
if ((var_safeDelay$1746_changed) || (var_event_changed)) {
var_safeDelay$1746_nextTs = (currTs + var_$1943_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1746_nextTs = -1L
}
}
}
if ((var_final$1617_changed && var_final$1617_init)) {
out_final.apply(var_final$1617_value, currTs, "final", var_final$1617_error)
}
if ((var_value$1925_changed && var_value$1925_init)) {
out_value.apply(var_value$1925_value, currTs, "value", var_value$1925_error)
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
