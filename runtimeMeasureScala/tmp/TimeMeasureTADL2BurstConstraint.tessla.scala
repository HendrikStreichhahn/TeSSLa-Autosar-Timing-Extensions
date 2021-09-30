//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1670 : scala.Function1[List[Any], Any] = ((var_list$1881 : List[Any]) => {
val var_$1882 : Any = var_list$1881(0L.asInstanceOf[Int])
var_$1882
})
val var_$1845 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1895 : (Boolean, Boolean)) => {
val var_$1896 : Boolean = var_$1895._2
var_$1896
})
val var_$1726 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1888 : (Boolean, Boolean)) => {
val var_$1889 : Boolean = var_$1888._1
var_$1889
})
val var_fourValuedConjunction$1877 : scala.Function2[(Boolean, Boolean), (Boolean, Boolean), (Boolean, Boolean)] = ((var_a$1901 : (Boolean, Boolean), var_b$1902 : (Boolean, Boolean)) => {
lazy val var_$1935 : Boolean = var_b$1902._2
lazy val var_$1911 : Boolean = !(var_$1935)
lazy val var_$1918 : Boolean = var_a$1901._2
lazy val var_$1909 : Boolean = !(var_$1918)
lazy val var_$1910 : Boolean = var_a$1901._1
lazy val var_$1932 : Boolean = var_b$1902._1
lazy val var_$1934 : Boolean = !(var_$1910)
lazy val var_$1936 : Boolean = !(var_$1932)
val var_$1903 : (Boolean, Boolean) = (if (((var_$1909 && var_$1910) || (var_$1911 && var_$1932))) (true, false) else (if (((var_$1909 && var_$1934) || (var_$1911 && var_$1936))) (false, false) else (if (((var_$1918 && var_$1934) || (var_$1935 && var_$1936))) (false, true) else (true, true))))
var_$1903
})
lazy val var_$1770 : List[Long] = List[Long]()
val var_$1838 : (Boolean, Boolean) = (false, true)
val var_$1824 : (Boolean, Boolean) = (true, false)
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
var var_$1786_changed : Boolean = false
var var_$1786_value : Long = 0L
var var_$1786_init : Boolean = false
var var_$1786_unknown : Boolean = false
var var_$1786_error : Throwable = null
var var_defaultTime$1771_changed : Boolean = true
var var_defaultTime$1771_value : Long = -1L
var var_defaultTime$1771_init : Boolean = true
var var_defaultTime$1771_error : Throwable = null
var var_defaultTime$1771_unknown : Boolean = false
val var_$1834_value : Long = 0L
val var_$1834_error : Throwable = null
val var_$1834_changed : Boolean = false
val var_$1834_unknown : Boolean = false
var var_$1765_changed : Boolean = true
var var_$1765_value : Long = 0L
var var_$1765_init : Boolean = true
var var_$1765_error : Throwable = null
var var_$1765_unknown : Boolean = false
var var_latestSpanEventTimes$1632_changed : Boolean = false
var var_latestSpanEventTimes$1632_unknown : Boolean = false
var var_latestSpanEventTimes$1632_error : Throwable = null
var var_latestSpanEventTimes$1632_value : Boolean = false
var var_latestSpanEventTimes$1632_init : Boolean = false
val var_$1639_value : List[Long] = List[Long]()
val var_$1639_error : Throwable = null
val var_$1639_changed : Boolean = false
val var_$1639_unknown : Boolean = false
var var_$1768_changed : Boolean = true
var var_$1768_value : List[Long] = var_$1770
var var_$1768_init : Boolean = true
var var_$1768_error : Throwable = null
var var_$1768_unknown : Boolean = false
var var_latestSpanEventTimes$1637_changed : Boolean = false
var var_latestSpanEventTimes$1637_unknown : Boolean = false
var var_latestSpanEventTimes$1637_error : Throwable = null
var var_latestSpanEventTimes$1637_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1637_init : Boolean = false
var var_$1778_changed : Boolean = false
var var_$1778_init : Boolean = false
var var_$1778_unknown : Boolean = false
var var_$1778_error : Throwable = null
var var_$1778_value : List[Long] = List[Long]()
var var_$1777_changed : Boolean = false
var var_$1777_unknown : Boolean = false
var var_$1777_error : Throwable = null
var var_$1777_value : Long = 0L
var var_$1777_init : Boolean = false
var var_$1965_changed : Boolean = true
var var_$1965_value : Long = 1L
var var_$1965_init : Boolean = true
var var_$1965_error : Throwable = null
var var_$1965_unknown : Boolean = false
var var_$1776_changed : Boolean = false
var var_$1776_unknown : Boolean = false
var var_$1776_error : Throwable = null
var var_$1776_value : Boolean = false
var var_$1776_init : Boolean = false
var var_$1783_changed : Boolean = false
var var_$1783_init : Boolean = false
var var_$1783_unknown : Boolean = false
var var_$1783_error : Throwable = null
var var_$1783_value : List[Long] = List[Long]()
var var_$1782_changed : Boolean = false
var var_$1782_unknown : Boolean = false
var var_$1782_error : Throwable = null
var var_$1782_value : List[Long] = List[Long]()
var var_$1782_init : Boolean = false
var var_$1775_changed : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : List[Long] = List[Long]()
var var_$1775_init : Boolean = false
var var_$1774_changed : Boolean = false
var var_$1774_unknown : Boolean = false
var var_$1774_error : Throwable = null
var var_$1774_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1773_changed : Boolean = true
var var_latestSpanEventTimes$1773_value : List[Long] = var_$1770
var var_latestSpanEventTimes$1773_init : Boolean = true
var var_latestSpanEventTimes$1773_error : Throwable = null
var var_latestSpanEventTimes$1773_unknown : Boolean = false
var var_$1761_changed : Boolean = false
var var_$1761_lastValue : List[Long] = List[Long]()
var var_$1761_lastInit : Boolean = false
var var_$1761_lastError : Throwable = null
var var_$1761_unknown : Boolean = false
var var_$1761_error : Throwable = null
var var_$1761_value : List[Long] = List[Long]()
var var_$1761_init : Boolean = false
var var_$1761_ts : Long = 0L
var var_$1760_changed : Boolean = false
var var_$1760_unknown : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_value : Long = 0L
var var_$1760_init : Boolean = false
var var_$1759_changed : Boolean = false
var var_$1759_unknown : Boolean = false
var var_$1759_error : Throwable = null
var var_$1759_value : Boolean = false
var var_$1759_init : Boolean = false
var var_$2001_changed : Boolean = false
var var_$2001_unknown : Boolean = false
var var_$2001_error : Throwable = null
var var_$2001_value : Long = 0L
var var_$2001_init : Boolean = false
var var_$1797_changed : Boolean = false
var var_$1797_unknown : Boolean = false
var var_$1797_error : Throwable = null
var var_$1797_value : Long = 0L
var var_$1797_init : Boolean = false
var var_$1804_changed : Boolean = false
var var_$1804_error : Throwable = null
var var_$1804_unknown : Boolean = false
var var_safeDelay$1808_changed : Boolean = false
val var_safeDelay$1808_error : Throwable = null
var var_safeDelay$1808_unknown : Boolean = false
var var_$1806_changed : Boolean = false
var var_$1806_error : Throwable = null
var var_$1806_unknown : Boolean = false
var var_mergeUnit2$1803_changed : Boolean = false
var var_mergeUnit2$1803_ts : Long = 0L
var var_mergeUnit2$1803_unknown : Boolean = false
var var_mergeUnit2$1803_error : Throwable = null
var var_$1802_changed : Boolean = false
var var_$1802_value : Long = 0L
var var_$1802_init : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1796_changed : Boolean = false
var var_$1796_unknown : Boolean = false
var var_$1796_error : Throwable = null
var var_$1796_value : Boolean = false
var var_$1796_init : Boolean = false
val var_$1728_value : Boolean = false
val var_$1728_error : Throwable = null
val var_$1728_changed : Boolean = false
val var_$1728_unknown : Boolean = false
var var_$1681_changed : Boolean = true
var var_$1681_value : Boolean = true
var var_$1681_init : Boolean = true
var var_$1681_error : Throwable = null
var var_$1681_unknown : Boolean = false
var var_$1704_changed : Boolean = true
var var_$1704_value : Long = 9223372036854775807L
var var_$1704_init : Boolean = true
var var_$1704_error : Throwable = null
var var_$1704_unknown : Boolean = false
var var_$1813_changed : Boolean = false
var var_$1813_unknown : Boolean = false
var var_$1813_error : Throwable = null
var var_$1813_value : Long = 0L
var var_$1813_init : Boolean = false
var var_$1812_changed : Boolean = false
var var_$1812_unknown : Boolean = false
var var_$1812_error : Throwable = null
var var_$1812_value : Boolean = false
var var_$1812_init : Boolean = false
var var_$1809_changed : Boolean = false
var var_$1809_unknown : Boolean = false
var var_$1809_error : Throwable = null
var var_$1809_value : Boolean = false
var var_$1809_init : Boolean = false
var var_$1795_changed : Boolean = false
var var_$1795_unknown : Boolean = false
var var_$1795_error : Throwable = null
var var_$1795_value : Boolean = false
var var_$1795_init : Boolean = false
val var_$1875_value : (Boolean, Boolean) = (false, false)
val var_$1875_error : Throwable = null
val var_$1875_changed : Boolean = false
val var_$1875_unknown : Boolean = false
var var_$1707_changed : Boolean = true
var var_$1707_value : (Boolean, Boolean) = var_$1838
var var_$1707_init : Boolean = true
var var_$1707_error : Throwable = null
var var_$1707_unknown : Boolean = false
var var_$1745_changed : Boolean = true
var var_$1745_value : (Boolean, Boolean) = var_$1824
var var_$1745_init : Boolean = true
var var_$1745_error : Throwable = null
var var_$1745_unknown : Boolean = false
var var_$1794_changed : Boolean = false
var var_$1794_unknown : Boolean = false
var var_$1794_error : Throwable = null
var var_$1794_value : (Boolean, Boolean) = (false, false)
var var_$1794_init : Boolean = false
var var_$1825_changed : Boolean = false
var var_$1825_unknown : Boolean = false
var var_$1825_error : Throwable = null
var var_$1825_value : (Boolean, Boolean) = (false, false)
var var_$1825_init : Boolean = false
var var_$1758_changed : Boolean = false
var var_$1758_unknown : Boolean = false
var var_$1758_error : Throwable = null
var var_$1758_value : (Boolean, Boolean) = (false, false)
var var_$1758_init : Boolean = false
var var_$1758_ts : Long = 0L
var var_$1854_changed : Boolean = false
var var_$1854_unknown : Boolean = false
var var_$1854_error : Throwable = null
var var_$1854_value : Boolean = false
var var_$1854_init : Boolean = false
var var_$1859_changed : Boolean = false
var var_$1859_unknown : Boolean = false
var var_$1859_error : Throwable = null
var var_$1859_value : Boolean = false
var var_$1859_init : Boolean = false
var var_$1843_changed : Boolean = false
var var_$1843_unknown : Boolean = false
var var_$1843_error : Throwable = null
var var_$1843_value : Boolean = false
var var_$1843_init : Boolean = false
var var_$1756_changed : Boolean = false
var var_$1756_unknown : Boolean = false
var var_$1756_error : Throwable = null
var var_$1756_value : Boolean = false
var var_$1756_init : Boolean = false
var var_$1850_changed : Boolean = false
var var_$1850_init : Boolean = false
var var_$1850_unknown : Boolean = false
var var_$1850_error : Throwable = null
var var_$1850_value : Boolean = false
var var_$1853_changed : Boolean = false
var var_$1853_unknown : Boolean = false
var var_$1853_error : Throwable = null
var var_$1853_value : Boolean = false
var var_$1853_init : Boolean = false
var var_$1861_changed : Boolean = true
var var_$1861_value : Boolean = false
var var_$1861_init : Boolean = true
var var_$1861_error : Throwable = null
var var_$1861_unknown : Boolean = false
var var_$1858_changed : Boolean = false
var var_$1858_unknown : Boolean = false
var var_$1858_error : Throwable = null
var var_$1858_value : Boolean = false
var var_$1858_init : Boolean = false
var var_$1852_changed : Boolean = false
var var_$1852_unknown : Boolean = false
var var_$1852_error : Throwable = null
var var_$1852_value : Boolean = false
var var_$1852_init : Boolean = false
var var_isFinalFalse$1849_changed : Boolean = false
var var_isFinalFalse$1849_unknown : Boolean = false
var var_isFinalFalse$1849_error : Throwable = null
var var_isFinalFalse$1849_value : Boolean = false
var var_$1872_changed : Boolean = true
var var_$1872_lastValue : Boolean = false
var var_$1872_lastInit : Boolean = false
var var_$1872_lastError : Throwable = null
var var_$1872_value : Boolean = false
var var_$1872_init : Boolean = true
var var_$1872_ts : Long = 0L
var var_$1872_error : Throwable = null
var var_$1872_unknown : Boolean = false
var var_prev$1847_changed : Boolean = false
var var_prev$1847_init : Boolean = false
var var_prev$1847_unknown : Boolean = false
var var_prev$1847_error : Throwable = null
var var_prev$1847_value : Boolean = false
var var_$1846_changed : Boolean = false
var var_$1846_unknown : Boolean = false
var var_$1846_error : Throwable = null
var var_$1846_value : Boolean = false
var var_$1846_init : Boolean = false
var var_$1755_changed : Boolean = false
var var_$1755_unknown : Boolean = false
var var_$1755_error : Throwable = null
var var_$1755_value : Boolean = false
var var_$1755_init : Boolean = false
var var_$1863_changed : Boolean = false
var var_$1863_value : Long = 0L
var var_$1863_init : Boolean = false
var var_$1863_unknown : Boolean = false
var var_$1863_error : Throwable = null
var var_$1864_changed : Boolean = false
var var_$1864_init : Boolean = false
var var_$1864_unknown : Boolean = false
var var_$1864_error : Throwable = null
var var_$1864_value : Long = 0L
var var_finalFalseSince$1754_changed : Boolean = false
var var_finalFalseSince$1754_unknown : Boolean = false
var var_finalFalseSince$1754_error : Throwable = null
var var_finalFalseSince$1754_value : Long = 0L
var var_$1753_changed : Boolean = true
var var_$1753_lastValue : Long = 0L
var var_$1753_lastInit : Boolean = false
var var_$1753_lastError : Throwable = null
var var_$1753_value : Long = 9223372036854775807L
var var_$1753_init : Boolean = true
var var_$1753_ts : Long = 0L
var var_$1753_error : Throwable = null
var var_$1753_unknown : Boolean = false
var var_$1752_changed : Boolean = false
var var_$1752_unknown : Boolean = false
var var_$1752_error : Throwable = null
var var_$1752_value : Long = 0L
var var_$1752_init : Boolean = false
var var_$2012_changed : Boolean = false
var var_$2012_unknown : Boolean = false
var var_$2012_error : Throwable = null
var var_$2012_value : List[Long] = List[Long]()
var var_$2012_init : Boolean = false
var var_$2011_changed : Boolean = false
var var_$2011_unknown : Boolean = false
var var_$2011_error : Throwable = null
var var_$2011_value : Long = 0L
var var_$2011_init : Boolean = false
var var_$2010_changed : Boolean = false
var var_$2010_unknown : Boolean = false
var var_$2010_error : Throwable = null
var var_$2010_value : Long = 0L
var var_$2010_init : Boolean = false
var var_$2009_changed : Boolean = false
var var_$2009_unknown : Boolean = false
var var_$2009_error : Throwable = null
var var_$2009_value : Long = 0L
var var_$2009_init : Boolean = false
var var_$1648_changed : Boolean = false
var var_$1648_init : Boolean = false
var var_$1648_unknown : Boolean = false
var var_$1648_error : Throwable = null
var var_$1648_value : List[Long] = List[Long]()
var var_$1647_changed : Boolean = false
var var_$1647_unknown : Boolean = false
var var_$1647_error : Throwable = null
var var_$1647_value : Long = 0L
var var_$1647_init : Boolean = false
var var_$1650_changed : Boolean = true
var var_$1650_value : Long = 50L
var var_$1650_init : Boolean = true
var var_$1650_error : Throwable = null
var var_$1650_unknown : Boolean = false
var var_$1646_changed : Boolean = false
var var_$1646_unknown : Boolean = false
var var_$1646_error : Throwable = null
var var_$1646_value : Boolean = false
var var_$1646_init : Boolean = false
var var_$1653_changed : Boolean = false
var var_$1653_init : Boolean = false
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : List[Long] = List[Long]()
var var_$1652_changed : Boolean = false
var var_$1652_unknown : Boolean = false
var var_$1652_error : Throwable = null
var var_$1652_value : List[Long] = List[Long]()
var var_$1652_init : Boolean = false
var var_$1645_changed : Boolean = false
var var_$1645_unknown : Boolean = false
var var_$1645_error : Throwable = null
var var_$1645_value : List[Long] = List[Long]()
var var_$1645_init : Boolean = false
var var_$1644_changed : Boolean = false
var var_$1644_unknown : Boolean = false
var var_$1644_error : Throwable = null
var var_$1644_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1643_changed : Boolean = true
var var_latestSpanEventTimes$1643_value : List[Long] = var_$1770
var var_latestSpanEventTimes$1643_init : Boolean = true
var var_latestSpanEventTimes$1643_error : Throwable = null
var var_latestSpanEventTimes$1643_unknown : Boolean = false
var var_$1703_changed : Boolean = false
var var_$1703_lastValue : List[Long] = List[Long]()
var var_$1703_lastInit : Boolean = false
var var_$1703_lastError : Throwable = null
var var_$1703_unknown : Boolean = false
var var_$1703_error : Throwable = null
var var_$1703_value : List[Long] = List[Long]()
var var_$1703_init : Boolean = false
var var_$1703_ts : Long = 0L
var var_$1630_changed : Boolean = false
var var_$1630_unknown : Boolean = false
var var_$1630_error : Throwable = null
var var_$1630_value : Long = 0L
var var_$1630_init : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Boolean = false
var var_$1629_init : Boolean = false
var var_$1960_changed : Boolean = false
var var_$1960_unknown : Boolean = false
var var_$1960_error : Throwable = null
var var_$1960_value : Long = 0L
var var_$1960_init : Boolean = false
var var_$1671_changed : Boolean = true
var var_$1671_value : Long = 2000L
var var_$1671_init : Boolean = true
var var_$1671_error : Throwable = null
var var_$1671_unknown : Boolean = false
var var_$1667_changed : Boolean = false
var var_$1667_unknown : Boolean = false
var var_$1667_error : Throwable = null
var var_$1667_value : Long = 0L
var var_$1667_init : Boolean = false
var var_safeDelay$1679_changed : Boolean = false
val var_safeDelay$1679_error : Throwable = null
var var_safeDelay$1679_unknown : Boolean = false
var var_$1677_changed : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_unknown : Boolean = false
var var_mergeUnit2$1674_changed : Boolean = false
var var_mergeUnit2$1674_ts : Long = 0L
var var_mergeUnit2$1674_unknown : Boolean = false
var var_mergeUnit2$1674_error : Throwable = null
var var_$1689_changed : Boolean = false
var var_$1689_value : Long = 0L
var var_$1689_init : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1666_changed : Boolean = false
var var_$1666_unknown : Boolean = false
var var_$1666_error : Throwable = null
var var_$1666_value : Boolean = false
var var_$1666_init : Boolean = false
var var_$1701_changed : Boolean = false
var var_$1701_unknown : Boolean = false
var var_$1701_error : Throwable = null
var var_$1701_value : Long = 0L
var var_$1701_init : Boolean = false
var var_$1700_changed : Boolean = false
var var_$1700_unknown : Boolean = false
var var_$1700_error : Throwable = null
var var_$1700_value : Boolean = false
var var_$1700_init : Boolean = false
var var_$1680_changed : Boolean = false
var var_$1680_unknown : Boolean = false
var var_$1680_error : Throwable = null
var var_$1680_value : Boolean = false
var var_$1680_init : Boolean = false
var var_$1665_changed : Boolean = false
var var_$1665_unknown : Boolean = false
var var_$1665_error : Throwable = null
var var_$1665_value : Boolean = false
var var_$1665_init : Boolean = false
var var_$1664_changed : Boolean = false
var var_$1664_unknown : Boolean = false
var var_$1664_error : Throwable = null
var var_$1664_value : (Boolean, Boolean) = (false, false)
var var_$1664_init : Boolean = false
var var_$1696_changed : Boolean = false
var var_$1696_unknown : Boolean = false
var var_$1696_error : Throwable = null
var var_$1696_value : (Boolean, Boolean) = (false, false)
var var_$1696_init : Boolean = false
var var_$1628_changed : Boolean = false
var var_$1628_unknown : Boolean = false
var var_$1628_error : Throwable = null
var var_$1628_value : (Boolean, Boolean) = (false, false)
var var_$1628_init : Boolean = false
var var_$1628_ts : Long = 0L
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : Boolean = false
var var_$1627_init : Boolean = false
var var_$1730_changed : Boolean = false
var var_$1730_unknown : Boolean = false
var var_$1730_error : Throwable = null
var var_$1730_value : Boolean = false
var var_$1730_init : Boolean = false
var var_$1714_changed : Boolean = false
var var_$1714_unknown : Boolean = false
var var_$1714_error : Throwable = null
var var_$1714_value : Boolean = false
var var_$1714_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_$1721_changed : Boolean = false
var var_$1721_init : Boolean = false
var var_$1721_unknown : Boolean = false
var var_$1721_error : Throwable = null
var var_$1721_value : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_value : Boolean = false
var var_$1724_init : Boolean = false
var var_$1729_changed : Boolean = false
var var_$1729_unknown : Boolean = false
var var_$1729_error : Throwable = null
var var_$1729_value : Boolean = false
var var_$1729_init : Boolean = false
var var_$1723_changed : Boolean = false
var var_$1723_unknown : Boolean = false
var var_$1723_error : Throwable = null
var var_$1723_value : Boolean = false
var var_$1723_init : Boolean = false
var var_isFinalFalse$1720_changed : Boolean = false
var var_isFinalFalse$1720_unknown : Boolean = false
var var_isFinalFalse$1720_error : Throwable = null
var var_isFinalFalse$1720_value : Boolean = false
var var_isFinalFalseReset$1744_changed : Boolean = true
var var_isFinalFalseReset$1744_lastValue : Boolean = false
var var_isFinalFalseReset$1744_lastInit : Boolean = false
var var_isFinalFalseReset$1744_lastError : Throwable = null
var var_isFinalFalseReset$1744_value : Boolean = false
var var_isFinalFalseReset$1744_init : Boolean = true
var var_isFinalFalseReset$1744_ts : Long = 0L
var var_isFinalFalseReset$1744_error : Throwable = null
var var_isFinalFalseReset$1744_unknown : Boolean = false
var var_prev$1718_changed : Boolean = false
var var_prev$1718_init : Boolean = false
var var_prev$1718_unknown : Boolean = false
var var_prev$1718_error : Throwable = null
var var_prev$1718_value : Boolean = false
var var_$1717_changed : Boolean = false
var var_$1717_unknown : Boolean = false
var var_$1717_error : Throwable = null
var var_$1717_value : Boolean = false
var var_$1717_init : Boolean = false
var var_$1625_changed : Boolean = false
var var_$1625_unknown : Boolean = false
var var_$1625_error : Throwable = null
var var_$1625_value : Boolean = false
var var_$1625_init : Boolean = false
var var_$1734_changed : Boolean = false
var var_$1734_value : Long = 0L
var var_$1734_init : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1735_changed : Boolean = false
var var_$1735_init : Boolean = false
var var_$1735_unknown : Boolean = false
var var_$1735_error : Throwable = null
var var_$1735_value : Long = 0L
var var_finalFalseSince$1624_changed : Boolean = false
var var_finalFalseSince$1624_unknown : Boolean = false
var var_finalFalseSince$1624_error : Throwable = null
var var_finalFalseSince$1624_value : Long = 0L
var var_$1736_changed : Boolean = true
var var_$1736_lastValue : Long = 0L
var var_$1736_lastInit : Boolean = false
var var_$1736_lastError : Throwable = null
var var_$1736_value : Long = 9223372036854775807L
var var_$1736_init : Boolean = true
var var_$1736_ts : Long = 0L
var var_$1736_error : Throwable = null
var var_$1736_unknown : Boolean = false
var var_$1971_changed : Boolean = false
var var_$1971_unknown : Boolean = false
var var_$1971_error : Throwable = null
var var_$1971_value : List[Long] = List[Long]()
var var_$1971_init : Boolean = false
var var_$1970_changed : Boolean = false
var var_$1970_unknown : Boolean = false
var var_$1970_error : Throwable = null
var var_$1970_value : Long = 0L
var var_$1970_init : Boolean = false
var var_$1751_changed : Boolean = false
var var_$1751_unknown : Boolean = false
var var_$1751_error : Throwable = null
var var_$1751_value : Boolean = false
var var_$1751_init : Boolean = false
var var_isFinalFalseReset$1750_changed : Boolean = false
var var_isFinalFalseReset$1750_unknown : Boolean = false
var var_isFinalFalseReset$1750_error : Throwable = null
var var_isFinalFalseReset$1750_value : Boolean = false
var var_$1749_changed : Boolean = false
var var_$1749_lastValue : Boolean = false
var var_$1749_lastInit : Boolean = false
var var_$1749_lastError : Throwable = null
var var_$1749_init : Boolean = false
var var_$1749_ts : Long = 0L
var var_$1749_unknown : Boolean = false
var var_$1749_value : Boolean = false
var var_$1749_error : Throwable = null
var var_stillFulfillableReset$1748_changed : Boolean = false
var var_stillFulfillableReset$1748_unknown : Boolean = false
var var_stillFulfillableReset$1748_error : Throwable = null
var var_stillFulfillableReset$1748_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1748_init : Boolean = false
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
var var_$1722_changed : Boolean = false
var var_$1722_lastValue : Boolean = false
var var_$1722_lastInit : Boolean = false
var var_$1722_lastError : Throwable = null
var var_$1722_init : Boolean = false
var var_$1722_ts : Long = 0L
var var_$1722_unknown : Boolean = false
var var_$1722_value : Boolean = false
var var_$1722_error : Throwable = null
var var_stillFulfillableReset$1618_changed : Boolean = false
var var_stillFulfillableReset$1618_unknown : Boolean = false
var var_stillFulfillableReset$1618_error : Throwable = null
var var_stillFulfillableReset$1618_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1618_init : Boolean = false
var var_burstConstraintReset$1617_changed : Boolean = false
var var_burstConstraintReset$1617_unknown : Boolean = false
var var_burstConstraintReset$1617_error : Throwable = null
var var_burstConstraintReset$1617_value : (Boolean, Boolean) = (false, false)
var var_burstConstraintReset$1617_init : Boolean = false
var var_final$1616_changed : Boolean = false
var var_final$1616_unknown : Boolean = false
var var_final$1616_error : Throwable = null
var var_final$1616_value : Boolean = false
var var_final$1616_init : Boolean = false
var var_delayPeriod$1988_changed : Boolean = true
var var_delayPeriod$1988_value : Long = -1L
var var_delayPeriod$1988_init : Boolean = true
var var_delayPeriod$1988_error : Throwable = null
var var_delayPeriod$1988_unknown : Boolean = false
var var_$2031_changed : Boolean = false
var var_$2031_unknown : Boolean = false
var var_$2031_error : Throwable = null
var var_$2030_changed : Boolean = false
var var_$2030_value : Boolean = false
var var_$2030_error : Throwable = null
var var_$2030_unknown : Boolean = false
var var_$2032_changed : Boolean = false
var var_$2032_value : Boolean = false
var var_$2032_error : Throwable = null
var var_$2032_unknown : Boolean = false
var var_isFirst$1956_init : Boolean = false
var var_isFirst$1956_unknown : Boolean = false
var var_isFirst$1956_value : Boolean = false
var var_isFirst$1956_error : Throwable = null
var var_firstEvent$1996_changed : Boolean = false
var var_firstEvent$1996_error : Throwable = null
var var_firstEvent$1996_ts : Long = 0L
var var_firstEvent$1996_unknown : Boolean = false
var var_$1995_changed : Boolean = false
var var_$1995_value : Long = 0L
var var_$1995_unknown : Boolean = false
var var_$1995_error : Throwable = null
var var_defaultTime$1994_changed : Boolean = true
var var_defaultTime$1994_value : Long = -1L
var var_defaultTime$1994_init : Boolean = true
var var_defaultTime$1994_error : Throwable = null
var var_defaultTime$1994_unknown : Boolean = false
var var_$1991_changed : Boolean = false
var var_$1991_unknown : Boolean = false
var var_$1991_error : Throwable = null
var var_$1991_value : Boolean = false
var var_$1991_init : Boolean = false
var var_$1999_changed : Boolean = false
var var_$1999_unknown : Boolean = false
var var_$1999_error : Throwable = null
var var_$1999_value : Long = 0L
var var_$1999_init : Boolean = false
var var_$1998_changed : Boolean = false
var var_$1998_unknown : Boolean = false
var var_$1998_error : Throwable = null
var var_$1998_value : Long = 0L
var var_$1998_init : Boolean = false
var var_$2008_changed : Boolean = false
var var_$2008_unknown : Boolean = false
var var_$2008_error : Throwable = null
var var_$2008_value : Long = 0L
var var_$2008_init : Boolean = false
var var_delayPeriod$1990_changed : Boolean = false
var var_delayPeriod$1990_unknown : Boolean = false
var var_delayPeriod$1990_error : Throwable = null
var var_delayPeriod$1990_value : Long = 0L
var var_delayPeriod$1990_init : Boolean = false
var var_$1985_changed : Boolean = false
var var_$1985_unknown : Boolean = false
var var_$1985_error : Throwable = null
var var_$1985_value : Long = 0L
var var_$1985_init : Boolean = false
var var_$1985_ts : Long = 0L
var var_$1984_changed : Boolean = false
var var_$1984_unknown : Boolean = false
var var_$1984_error : Throwable = null
var var_$1984_value : Boolean = false
var var_$1984_init : Boolean = false
var var_$2024_changed : Boolean = false
var var_$2024_value : Long = 0L
var var_$2024_init : Boolean = false
var var_$2024_unknown : Boolean = false
var var_$2024_error : Throwable = null
var var_$2021_changed : Boolean = false
var var_$2021_unknown : Boolean = false
var var_$2021_error : Throwable = null
var var_$2021_value : Long = 0L
var var_$2021_init : Boolean = false
var var_$1892_changed : Boolean = false
var var_$1892_unknown : Boolean = false
var var_$1892_error : Throwable = null
var var_$1892_value : Long = 0L
var var_$1969_changed : Boolean = false
var var_$1969_unknown : Boolean = false
var var_$1969_error : Throwable = null
var var_$1969_value : Long = 0L
var var_$1969_init : Boolean = false
var var_$1968_changed : Boolean = false
var var_$1968_unknown : Boolean = false
var var_$1968_error : Throwable = null
var var_$1968_value : Long = 0L
var var_$1968_init : Boolean = false
var var_$1967_changed : Boolean = false
var var_$1967_unknown : Boolean = false
var var_$1967_error : Throwable = null
var var_$1967_value : Long = 0L
var var_$1967_init : Boolean = false
var var_$1958_changed : Boolean = false
var var_$1958_unknown : Boolean = false
var var_$1958_error : Throwable = null
var var_$1958_value : Long = 0L
var var_$1958_init : Boolean = false
var var_$1957_changed : Boolean = false
var var_$1957_unknown : Boolean = false
var var_$1957_error : Throwable = null
var var_$1957_value : Long = 0L
var var_$1957_init : Boolean = false
var var_delayPeriod$1949_changed : Boolean = false
var var_delayPeriod$1949_unknown : Boolean = false
var var_delayPeriod$1949_error : Throwable = null
var var_delayPeriod$1949_value : Long = 0L
var var_delayPeriod$1949_init : Boolean = false
var var_$1944_changed : Boolean = false
var var_$1944_unknown : Boolean = false
var var_$1944_error : Throwable = null
var var_$1944_value : Long = 0L
var var_$1944_init : Boolean = false
var var_$1944_ts : Long = 0L
var var_$1983_changed : Boolean = false
var var_$1983_value : Long = 0L
var var_$1983_init : Boolean = false
var var_$1983_unknown : Boolean = false
var var_$1983_error : Throwable = null
var var_value$1879_changed : Boolean = false
var var_value$1879_unknown : Boolean = false
var var_value$1879_error : Throwable = null
var var_value$1879_value : Boolean = false
var var_value$1879_init : Boolean = false
var var_$1943_changed : Boolean = false
var var_$1943_unknown : Boolean = false
var var_$1943_error : Throwable = null
var var_$1943_value : Boolean = false
var var_$1943_init : Boolean = false
var var_$1980_changed : Boolean = false
var var_$1980_unknown : Boolean = false
var var_$1980_error : Throwable = null
var var_$1980_value : Long = 0L
var var_$1980_init : Boolean = false
var var_$1883_changed : Boolean = false
var var_$1883_unknown : Boolean = false
var var_$1883_error : Throwable = null
var var_$1883_value : Long = 0L
var var_safeDelay$1808_nextTs : Long = -1L
var var_safeDelay$1679_nextTs : Long = -1L

def chunk1() = {
var_$1786_changed = false
if ((var_event_changed)) {
var_$1786_value = var_event_ts
var_$1786_init = true
var_$1786_unknown = var_event_unknown
if ((var_$1786_unknown)) {
var_$1786_error = var_event_error
} else {
var_$1786_error = null
}
var_$1786_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1771_changed = false
}
if ((var_$1786_changed)) {
var_defaultTime$1771_value = var_$1786_value
var_defaultTime$1771_init = true
var_defaultTime$1771_error = var_$1786_error
var_defaultTime$1771_changed = true
var_defaultTime$1771_unknown = var_$1786_unknown
}
if ((!(currTs == 0L))) {
var_$1765_changed = false
}
if ((var_$1834_changed)) {
var_$1765_value = var_$1834_value
var_$1765_init = true
var_$1765_error = var_$1834_error
var_$1765_changed = true
var_$1765_unknown = var_$1834_unknown
}
var_latestSpanEventTimes$1632_changed = false
if ((var_defaultTime$1771_init && var_$1765_init)) {
if ((var_defaultTime$1771_changed) || (var_$1765_changed)) {
var_latestSpanEventTimes$1632_unknown = (var_defaultTime$1771_unknown && var_$1765_unknown)
if ((var_latestSpanEventTimes$1632_unknown)) {
var_latestSpanEventTimes$1632_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1632_error = null
try {
var_latestSpanEventTimes$1632_value = ((if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}) == (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1632_error = var_err
}
}
}
var_latestSpanEventTimes$1632_init = true
var_latestSpanEventTimes$1632_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1768_changed = false
}
if ((var_$1639_changed)) {
var_$1768_value = var_$1639_value
var_$1768_init = true
var_$1768_error = var_$1639_error
var_$1768_changed = true
var_$1768_unknown = var_$1639_unknown
}
var_latestSpanEventTimes$1637_changed = false
if ((var_$1768_init && var_defaultTime$1771_init)) {
if ((var_$1768_changed) || (var_defaultTime$1771_changed)) {
var_latestSpanEventTimes$1637_unknown = (var_$1768_unknown && var_defaultTime$1771_unknown)
if ((var_latestSpanEventTimes$1637_unknown)) {
var_latestSpanEventTimes$1637_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1637_error = null
try {
var_latestSpanEventTimes$1637_value = ((if((var_$1768_error == null)) {var_$1768_value} else {throw var_$1768_error}) :+ (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1637_error = var_err
}
}
}
var_latestSpanEventTimes$1637_init = true
var_latestSpanEventTimes$1637_changed = true
}
}
var_$1778_changed = false
if ((var_event_changed)) {
if ((var_$1761_ts == currTs && var_$1761_lastInit) || (!(var_$1761_ts == currTs) && var_$1761_init)) {
var_$1778_changed = true
var_$1778_init = true
var_$1778_unknown = var_event_unknown
if ((var_$1778_unknown)) {
var_$1778_error = var_event_error
} else {
if ((var_$1761_ts == currTs)) {
var_$1778_value = var_$1761_lastValue
var_$1778_error = var_$1761_lastError
} else {
var_$1778_value = var_$1761_value
var_$1778_error = var_$1761_error
}
}
}
}
var_$1777_changed = false
if ((var_$1778_init)) {
if ((var_$1778_changed)) {
var_$1777_unknown = (var_$1778_unknown)
if ((var_$1777_unknown)) {
var_$1777_error = UnknownEventError(null)
} else {
var_$1777_error = null
try {
var_$1777_value = (if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}).size
} catch {
case var_err : Throwable => {
var_$1777_error = var_err
}
}
}
var_$1777_init = true
var_$1777_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1965_changed = false
}
if ((var_$1834_changed)) {
var_$1965_value = var_$1834_value
var_$1965_init = true
var_$1965_error = var_$1834_error
var_$1965_changed = true
var_$1965_unknown = var_$1834_unknown
}
var_$1776_changed = false
if ((var_$1777_init && var_$1965_init)) {
if ((var_$1777_changed) || (var_$1965_changed)) {
var_$1776_unknown = (var_$1777_unknown && var_$1965_unknown)
if ((var_$1776_unknown)) {
var_$1776_error = UnknownEventError(null)
} else {
var_$1776_error = null
try {
var_$1776_value = ((if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}) > (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
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
var_$1783_changed = false
if ((var_defaultTime$1771_changed)) {
if ((var_$1761_ts == currTs && var_$1761_lastInit) || (!(var_$1761_ts == currTs) && var_$1761_init)) {
var_$1783_changed = true
var_$1783_init = true
var_$1783_unknown = var_defaultTime$1771_unknown
if ((var_$1783_unknown)) {
var_$1783_error = var_defaultTime$1771_error
} else {
if ((var_$1761_ts == currTs)) {
var_$1783_value = var_$1761_lastValue
var_$1783_error = var_$1761_lastError
} else {
var_$1783_value = var_$1761_value
var_$1783_error = var_$1761_error
}
}
}
}
var_$1782_changed = false
if ((var_$1783_init)) {
if ((var_$1783_changed)) {
var_$1782_unknown = (var_$1783_unknown)
if ((var_$1782_unknown)) {
var_$1782_error = UnknownEventError(null)
} else {
var_$1782_error = null
try {
var_$1782_value = (if((var_$1783_error == null)) {var_$1783_value} else {throw var_$1783_error}).tail
} catch {
case var_err : Throwable => {
var_$1782_error = var_err
}
}
}
var_$1782_init = true
var_$1782_changed = true
}
}
var_$1775_changed = false
if ((var_$1776_init && var_$1782_init && var_$1778_init)) {
if ((var_$1776_changed) || (var_$1782_changed) || (var_$1778_changed)) {
var_$1775_unknown = (var_$1776_unknown && var_$1782_unknown && var_$1778_unknown)
if ((var_$1775_unknown)) {
var_$1775_error = UnknownEventError(null)
} else {
var_$1775_error = null
try {
var_$1775_value = (if ((if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error})) (if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}) else (if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}))
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
var_$1774_changed = false
if ((var_$1775_init && var_defaultTime$1771_init)) {
if ((var_$1775_changed) || (var_defaultTime$1771_changed)) {
var_$1774_unknown = (var_$1775_unknown && var_defaultTime$1771_unknown)
if ((var_$1774_unknown)) {
var_$1774_error = UnknownEventError(null)
} else {
var_$1774_error = null
try {
var_$1774_value = ((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}) :+ (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
} catch {
case var_err : Throwable => {
var_$1774_error = var_err
}
}
}
var_$1774_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$1773_changed = false
}
if ((var_$1774_changed)) {
var_latestSpanEventTimes$1773_value = var_$1774_value
var_latestSpanEventTimes$1773_init = true
var_latestSpanEventTimes$1773_error = var_$1774_error
var_latestSpanEventTimes$1773_changed = true
var_latestSpanEventTimes$1773_unknown = var_$1774_unknown
}
var_$1761_changed = false
if ((var_latestSpanEventTimes$1632_init && var_latestSpanEventTimes$1637_init && var_latestSpanEventTimes$1773_init)) {
if ((var_latestSpanEventTimes$1632_changed) || (var_latestSpanEventTimes$1637_changed) || (var_latestSpanEventTimes$1773_changed)) {
var_$1761_lastValue = var_$1761_value
var_$1761_lastInit = var_$1761_init
var_$1761_lastError = var_$1761_error
var_$1761_unknown = (var_latestSpanEventTimes$1632_unknown && var_latestSpanEventTimes$1637_unknown && var_latestSpanEventTimes$1773_unknown)
if ((var_$1761_unknown)) {
var_$1761_error = UnknownEventError(null)
} else {
var_$1761_error = null
try {
var_$1761_value = (if ((if((var_latestSpanEventTimes$1632_error == null)) {var_latestSpanEventTimes$1632_value} else {throw var_latestSpanEventTimes$1632_error})) (if((var_latestSpanEventTimes$1637_error == null)) {var_latestSpanEventTimes$1637_value} else {throw var_latestSpanEventTimes$1637_error}) else (if((var_latestSpanEventTimes$1773_error == null)) {var_latestSpanEventTimes$1773_value} else {throw var_latestSpanEventTimes$1773_error}))
} catch {
case var_err : Throwable => {
var_$1761_error = var_err
}
}
}
var_$1761_init = true
var_$1761_ts = currTs
var_$1761_changed = true
}
}
var_$1760_changed = false
if ((var_$1761_init)) {
if ((var_$1761_changed)) {
var_$1760_unknown = (var_$1761_unknown)
if ((var_$1760_unknown)) {
var_$1760_error = UnknownEventError(null)
} else {
var_$1760_error = null
try {
var_$1760_value = (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}).size
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
var_$1759_changed = false
if ((var_$1760_init && var_$1965_init)) {
if ((var_$1760_changed) || (var_$1965_changed)) {
var_$1759_unknown = (var_$1760_unknown && var_$1965_unknown)
if ((var_$1759_unknown)) {
var_$1759_error = UnknownEventError(null)
} else {
var_$1759_error = null
try {
var_$1759_value = ((if((var_$1760_error == null)) {var_$1760_value} else {throw var_$1760_error}) > (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
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
var_$2001_changed = false
if ((var_$1761_init)) {
if ((var_$1761_changed)) {
var_$2001_unknown = (var_$1761_unknown)
if ((var_$2001_unknown)) {
var_$2001_error = UnknownEventError(null)
} else {
var_$2001_error = null
try {
var_$2001_value = (var_head$1670.apply(((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2001_error = var_err
}
}
}
var_$2001_init = true
var_$2001_changed = true
}
}
var_$1797_changed = false
if ((var_$2001_init && var_$1965_init)) {
if ((var_$2001_changed) || (var_$1965_changed)) {
var_$1797_unknown = (var_$2001_unknown && var_$1965_unknown)
if ((var_$1797_unknown)) {
var_$1797_error = UnknownEventError(null)
} else {
var_$1797_error = null
try {
var_$1797_value = ((if((var_$2001_error == null)) {var_$2001_value} else {throw var_$2001_error}) + (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
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
var_$1804_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$1804_error = UnknownEventError(var_event_error)
} else {
var_$1804_error = null
}
var_$1804_changed = var_event_changed
var_$1804_unknown = var_event_unknown
}
var_safeDelay$1808_changed = false
if ((var_safeDelay$1808_nextTs == currTs)) {
var_safeDelay$1808_changed = true
var_safeDelay$1808_unknown = false
}
var_$1806_changed = false
if ((var_safeDelay$1808_changed)) {
if ((var_safeDelay$1808_unknown)) {
var_$1806_error = UnknownEventError(var_safeDelay$1808_error)
} else {
var_$1806_error = null
}
var_$1806_changed = var_safeDelay$1808_changed
var_$1806_unknown = var_safeDelay$1808_unknown
}
var_mergeUnit2$1803_changed = false
if ((var_$1804_changed) || (var_$1806_changed)) {
var_mergeUnit2$1803_ts = currTs
var_mergeUnit2$1803_changed = true
var_mergeUnit2$1803_unknown = (var_$1804_unknown && var_$1806_unknown)
if ((var_$1804_changed)) {
var_mergeUnit2$1803_error = var_$1804_error
} else {
if ((var_$1806_changed)) {
var_mergeUnit2$1803_error = var_$1806_error
}
}
}
var_$1802_changed = false
if ((var_mergeUnit2$1803_changed)) {
var_$1802_value = var_mergeUnit2$1803_ts
var_$1802_init = true
var_$1802_unknown = var_mergeUnit2$1803_unknown
if ((var_$1802_unknown)) {
var_$1802_error = var_mergeUnit2$1803_error
} else {
var_$1802_error = null
}
var_$1802_changed = true
}
var_$1796_changed = false
if ((var_$1797_init && var_$1802_init)) {
if ((var_$1797_changed) || (var_$1802_changed)) {
var_$1796_unknown = (var_$1797_unknown && var_$1802_unknown)
if ((var_$1796_unknown)) {
var_$1796_error = UnknownEventError(null)
} else {
var_$1796_error = null
try {
var_$1796_value = ((if((var_$1797_error == null)) {var_$1797_value} else {throw var_$1797_error}) <= (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
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
if ((!(currTs == 0L))) {
var_$1681_changed = false
}
if ((var_$1728_changed)) {
var_$1681_value = var_$1728_value
var_$1681_init = true
var_$1681_error = var_$1728_error
var_$1681_changed = true
var_$1681_unknown = var_$1728_unknown
}
if ((!(currTs == 0L))) {
var_$1704_changed = false
}
if ((var_$1834_changed)) {
var_$1704_value = var_$1834_value
var_$1704_init = true
var_$1704_error = var_$1834_error
var_$1704_changed = true
var_$1704_unknown = var_$1834_unknown
}
var_$1813_changed = false
if ((var_$2001_init && var_$1704_init)) {
if ((var_$2001_changed) || (var_$1704_changed)) {
var_$1813_unknown = (var_$2001_unknown && var_$1704_unknown)
if ((var_$1813_unknown)) {
var_$1813_error = UnknownEventError(null)
} else {
var_$1813_error = null
try {
var_$1813_value = ((if((var_$2001_error == null)) {var_$2001_value} else {throw var_$2001_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1813_error = var_err
}
}
}
var_$1813_init = true
var_$1813_changed = true
}
}
var_$1812_changed = false
if ((var_$1813_init && var_$1802_init)) {
if ((var_$1813_changed) || (var_$1802_changed)) {
var_$1812_unknown = (var_$1813_unknown && var_$1802_unknown)
if ((var_$1812_unknown)) {
var_$1812_error = UnknownEventError(null)
} else {
var_$1812_error = null
try {
var_$1812_value = ((if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) >= (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
} catch {
case var_err : Throwable => {
var_$1812_error = var_err
}
}
}
var_$1812_init = true
var_$1812_changed = true
}
}
var_$1809_changed = false
if ((var_$1681_init && var_$1812_init)) {
if ((var_$1681_changed) || (var_$1812_changed)) {
var_$1809_unknown = (var_$1681_unknown && var_$1812_unknown)
if ((var_$1809_unknown)) {
var_$1809_error = UnknownEventError(null)
} else {
var_$1809_error = null
try {
var_$1809_value = ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}) || (if((var_$1812_error == null)) {var_$1812_value} else {throw var_$1812_error}))
} catch {
case var_err : Throwable => {
var_$1809_error = var_err
}
}
}
var_$1809_init = true
var_$1809_changed = true
}
}
var_$1795_changed = false
if ((var_$1796_init && var_$1809_init)) {
if ((var_$1796_changed) || (var_$1809_changed)) {
var_$1795_unknown = (var_$1796_unknown && var_$1809_unknown)
if ((var_$1795_unknown)) {
var_$1795_error = UnknownEventError(null)
} else {
var_$1795_error = null
try {
var_$1795_value = ((if((var_$1796_error == null)) {var_$1796_value} else {throw var_$1796_error}) && (if((var_$1809_error == null)) {var_$1809_value} else {throw var_$1809_error}))
} catch {
case var_err : Throwable => {
var_$1795_error = var_err
}
}
}
var_$1795_init = true
var_$1795_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1707_changed = false
}
if ((var_$1875_changed)) {
var_$1707_value = var_$1875_value
var_$1707_init = true
var_$1707_error = var_$1875_error
var_$1707_changed = true
var_$1707_unknown = var_$1875_unknown
}
if ((!(currTs == 0L))) {
var_$1745_changed = false
}
if ((var_$1875_changed)) {
var_$1745_value = var_$1875_value
var_$1745_init = true
var_$1745_error = var_$1875_error
var_$1745_changed = true
var_$1745_unknown = var_$1875_unknown
}
var_$1794_changed = false
if ((var_$1795_init && var_$1707_init && var_$1745_init)) {
if ((var_$1795_changed) || (var_$1707_changed) || (var_$1745_changed)) {
var_$1794_unknown = (var_$1795_unknown && var_$1707_unknown && var_$1745_unknown)
if ((var_$1794_unknown)) {
var_$1794_error = UnknownEventError(null)
} else {
var_$1794_error = null
try {
var_$1794_value = (if ((if((var_$1795_error == null)) {var_$1795_value} else {throw var_$1795_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))
} catch {
case var_err : Throwable => {
var_$1794_error = var_err
}
}
}
var_$1794_init = true
var_$1794_changed = true
}
}
var_$1825_changed = false
if ((var_$1809_init && var_$1707_init && var_$1745_init)) {
if ((var_$1809_changed) || (var_$1707_changed) || (var_$1745_changed)) {
var_$1825_unknown = (var_$1809_unknown && var_$1707_unknown && var_$1745_unknown)
if ((var_$1825_unknown)) {
var_$1825_error = UnknownEventError(null)
} else {
var_$1825_error = null
try {
var_$1825_value = (if ((if((var_$1809_error == null)) {var_$1809_value} else {throw var_$1809_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))
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
var_$1758_changed = false
if ((var_$1759_init && var_$1794_init && var_$1825_init)) {
if ((var_$1759_changed) || (var_$1794_changed) || (var_$1825_changed)) {
var_$1758_unknown = (var_$1759_unknown && var_$1794_unknown && var_$1825_unknown)
if ((var_$1758_unknown)) {
var_$1758_error = UnknownEventError(null)
} else {
var_$1758_error = null
try {
var_$1758_value = (if ((if((var_$1759_error == null)) {var_$1759_value} else {throw var_$1759_error})) (if((var_$1794_error == null)) {var_$1794_value} else {throw var_$1794_error}) else (if((var_$1825_error == null)) {var_$1825_value} else {throw var_$1825_error}))
} catch {
case var_err : Throwable => {
var_$1758_error = var_err
}
}
}
var_$1758_init = true
var_$1758_ts = currTs
var_$1758_changed = true
}
}
var_$1854_changed = false
if ((var_$1758_init)) {
if ((var_$1758_changed)) {
var_$1854_unknown = (var_$1758_unknown)
if ((var_$1854_unknown)) {
var_$1854_error = UnknownEventError(null)
} else {
var_$1854_error = null
try {
var_$1854_value = var_$1726.apply((if((var_$1758_error == null)) {var_$1758_value} else {throw var_$1758_error}))
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
var_$1859_changed = false
if ((var_$1758_init)) {
if ((var_$1758_changed)) {
var_$1859_unknown = (var_$1758_unknown)
if ((var_$1859_unknown)) {
var_$1859_error = UnknownEventError(null)
} else {
var_$1859_error = null
try {
var_$1859_value = var_$1845.apply((if((var_$1758_error == null)) {var_$1758_value} else {throw var_$1758_error}))
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
var_$1843_changed = false
if ((var_$1859_init)) {
if ((var_$1859_changed)) {
var_$1843_unknown = (var_$1859_unknown)
if ((var_$1843_unknown)) {
var_$1843_error = UnknownEventError(null)
} else {
var_$1843_error = null
try {
var_$1843_value = !((if((var_$1859_error == null)) {var_$1859_value} else {throw var_$1859_error}))
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
var_$1756_changed = false
if ((var_$1854_init && var_$1843_init)) {
if ((var_$1854_changed) || (var_$1843_changed)) {
var_$1756_unknown = (var_$1854_unknown && var_$1843_unknown)
if ((var_$1756_unknown)) {
var_$1756_error = UnknownEventError(null)
} else {
var_$1756_error = null
try {
var_$1756_value = ((if((var_$1854_error == null)) {var_$1854_value} else {throw var_$1854_error}) && (if((var_$1843_error == null)) {var_$1843_value} else {throw var_$1843_error}))
} catch {
case var_err : Throwable => {
var_$1756_error = var_err
}
}
}
var_$1756_init = true
var_$1756_changed = true
}
}
var_$1850_changed = false
if ((var_$1758_changed)) {
if ((var_$1749_ts == currTs && var_$1749_lastInit) || (!(var_$1749_ts == currTs) && var_$1749_init)) {
var_$1850_changed = true
var_$1850_init = true
var_$1850_unknown = var_$1758_unknown
if ((var_$1850_unknown)) {
var_$1850_error = var_$1758_error
} else {
if ((var_$1749_ts == currTs)) {
var_$1850_value = var_$1749_lastValue
var_$1850_error = var_$1749_lastError
} else {
var_$1850_value = var_$1749_value
var_$1850_error = var_$1749_error
}
}
}
}
var_$1853_changed = false
if ((var_$1854_init && var_$1681_init)) {
if ((var_$1854_changed) || (var_$1681_changed)) {
var_$1853_unknown = (var_$1854_unknown && var_$1681_unknown)
if ((var_$1853_unknown)) {
var_$1853_error = UnknownEventError(null)
} else {
var_$1853_error = null
try {
var_$1853_value = ((if((var_$1854_error == null)) {var_$1854_value} else {throw var_$1854_error}) == (if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}))
} catch {
case var_err : Throwable => {
var_$1853_error = var_err
}
}
}
var_$1853_init = true
var_$1853_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1861_changed = false
}
if ((var_$1728_changed)) {
var_$1861_value = var_$1728_value
var_$1861_init = true
var_$1861_error = var_$1728_error
var_$1861_changed = true
var_$1861_unknown = var_$1728_unknown
}
var_$1858_changed = false
if ((var_$1859_init && var_$1861_init)) {
if ((var_$1859_changed) || (var_$1861_changed)) {
var_$1858_unknown = (var_$1859_unknown && var_$1861_unknown)
if ((var_$1858_unknown)) {
var_$1858_error = UnknownEventError(null)
} else {
var_$1858_error = null
try {
var_$1858_value = ((if((var_$1859_error == null)) {var_$1859_value} else {throw var_$1859_error}) == (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
} catch {
case var_err : Throwable => {
var_$1858_error = var_err
}
}
}
var_$1858_init = true
var_$1858_changed = true
}
}
var_$1852_changed = false
if ((var_$1853_init && var_$1858_init)) {
if ((var_$1853_changed) || (var_$1858_changed)) {
var_$1852_unknown = (var_$1853_unknown && var_$1858_unknown)
if ((var_$1852_unknown)) {
var_$1852_error = UnknownEventError(null)
} else {
var_$1852_error = null
try {
var_$1852_value = ((if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}) && (if((var_$1858_error == null)) {var_$1858_value} else {throw var_$1858_error}))
} catch {
case var_err : Throwable => {
var_$1852_error = var_err
}
}
}
var_$1852_init = true
var_$1852_changed = true
}
}
var_isFinalFalse$1849_changed = false
if ((var_$1850_init && var_$1852_init)) {
if ((var_$1850_changed) || (var_$1852_changed)) {
var_isFinalFalse$1849_unknown = (var_$1850_unknown && var_$1852_unknown)
if ((var_isFinalFalse$1849_unknown)) {
var_isFinalFalse$1849_error = UnknownEventError(null)
} else {
var_isFinalFalse$1849_error = null
try {
var_isFinalFalse$1849_value = ((if((var_$1850_error == null)) {var_$1850_value} else {throw var_$1850_error}) || (if((var_$1852_error == null)) {var_$1852_value} else {throw var_$1852_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1849_error = var_err
}
}
}
var_isFinalFalse$1849_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1872_changed = false
}
if ((var_isFinalFalse$1849_changed)) {
var_$1872_lastValue = var_$1872_value
var_$1872_lastInit = var_$1872_init
var_$1872_lastError = var_$1872_error
var_$1872_value = var_isFinalFalse$1849_value
var_$1872_init = true
var_$1872_ts = currTs
var_$1872_error = var_isFinalFalse$1849_error
var_$1872_changed = true
var_$1872_unknown = var_isFinalFalse$1849_unknown
}
var_prev$1847_changed = false
if ((var_$1872_changed)) {
if ((var_$1872_ts == currTs && var_$1872_lastInit) || (!(var_$1872_ts == currTs) && var_$1872_init)) {
var_prev$1847_changed = true
var_prev$1847_init = true
var_prev$1847_unknown = var_$1872_unknown
if ((var_prev$1847_unknown)) {
var_prev$1847_error = var_$1872_error
} else {
if ((var_$1872_ts == currTs)) {
var_prev$1847_value = var_$1872_lastValue
var_prev$1847_error = var_$1872_lastError
} else {
var_prev$1847_value = var_$1872_value
var_prev$1847_error = var_$1872_error
}
}
}
}
var_$1846_changed = false
if ((var_prev$1847_init)) {
if ((var_prev$1847_changed)) {
var_$1846_unknown = (var_prev$1847_unknown)
if ((var_$1846_unknown)) {
var_$1846_error = UnknownEventError(null)
} else {
var_$1846_error = null
try {
var_$1846_value = !((if((var_prev$1847_error == null)) {var_prev$1847_value} else {throw var_prev$1847_error}))
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
var_$1755_changed = false
if ((var_$1756_init && var_$1846_init)) {
if ((var_$1756_changed) || (var_$1846_changed)) {
var_$1755_unknown = (var_$1756_unknown && var_$1846_unknown)
if ((var_$1755_unknown)) {
var_$1755_error = UnknownEventError(null)
} else {
var_$1755_error = null
try {
var_$1755_value = ((if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error}) && (if((var_$1846_error == null)) {var_$1846_value} else {throw var_$1846_error}))
} catch {
case var_err : Throwable => {
var_$1755_error = var_err
}
}
}
var_$1755_init = true
var_$1755_changed = true
}
}
var_$1863_changed = false
if ((var_$1758_changed)) {
var_$1863_value = var_$1758_ts
var_$1863_init = true
var_$1863_unknown = var_$1758_unknown
if ((var_$1863_unknown)) {
var_$1863_error = var_$1758_error
} else {
var_$1863_error = null
}
var_$1863_changed = true
}
var_$1864_changed = false
if ((var_$1872_changed)) {
if ((var_$1753_ts == currTs && var_$1753_lastInit) || (!(var_$1753_ts == currTs) && var_$1753_init)) {
var_$1864_changed = true
var_$1864_init = true
var_$1864_unknown = var_$1872_unknown
if ((var_$1864_unknown)) {
var_$1864_error = var_$1872_error
} else {
if ((var_$1753_ts == currTs)) {
var_$1864_value = var_$1753_lastValue
var_$1864_error = var_$1753_lastError
} else {
var_$1864_value = var_$1753_value
var_$1864_error = var_$1753_error
}
}
}
}
var_finalFalseSince$1754_changed = false
if ((var_$1755_init && var_$1863_init && var_$1864_init)) {
if ((var_$1755_changed) || (var_$1863_changed) || (var_$1864_changed)) {
var_finalFalseSince$1754_unknown = (var_$1755_unknown && var_$1863_unknown && var_$1864_unknown)
if ((var_finalFalseSince$1754_unknown)) {
var_finalFalseSince$1754_error = UnknownEventError(null)
} else {
var_finalFalseSince$1754_error = null
try {
var_finalFalseSince$1754_value = (if ((if((var_$1755_error == null)) {var_$1755_value} else {throw var_$1755_error})) (if((var_$1863_error == null)) {var_$1863_value} else {throw var_$1863_error}) else (if((var_$1864_error == null)) {var_$1864_value} else {throw var_$1864_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1754_error = var_err
}
}
}
var_finalFalseSince$1754_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1753_changed = false
}
if ((var_finalFalseSince$1754_changed)) {
var_$1753_lastValue = var_$1753_value
var_$1753_lastInit = var_$1753_init
var_$1753_lastError = var_$1753_error
var_$1753_value = var_finalFalseSince$1754_value
var_$1753_init = true
var_$1753_ts = currTs
var_$1753_error = var_finalFalseSince$1754_error
var_$1753_changed = true
var_$1753_unknown = var_finalFalseSince$1754_unknown
}
var_$1752_changed = false
if ((var_$1753_init && var_$1704_init)) {
if ((var_$1753_changed) || (var_$1704_changed)) {
var_$1752_unknown = (var_$1753_unknown && var_$1704_unknown)
if ((var_$1752_unknown)) {
var_$1752_error = UnknownEventError(null)
} else {
var_$1752_error = null
try {
var_$1752_value = ((if((var_$1753_error == null)) {var_$1753_value} else {throw var_$1753_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1752_error = var_err
}
}
}
var_$1752_init = true
var_$1752_changed = true
}
}
var_$2012_changed = false
if ((var_$1761_init)) {
if ((var_$1761_changed)) {
var_$2012_unknown = (var_$1761_unknown)
if ((var_$2012_unknown)) {
var_$2012_error = UnknownEventError(null)
} else {
var_$2012_error = null
try {
var_$2012_value = (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}).tail
} catch {
case var_err : Throwable => {
var_$2012_error = var_err
}
}
}
var_$2012_init = true
var_$2012_changed = true
}
}
var_$2011_changed = false
if ((var_$2012_init)) {
if ((var_$2012_changed)) {
var_$2011_unknown = (var_$2012_unknown)
if ((var_$2011_unknown)) {
var_$2011_error = UnknownEventError(null)
} else {
var_$2011_error = null
try {
var_$2011_value = (var_head$1670.apply(((if((var_$2012_error == null)) {var_$2012_value} else {throw var_$2012_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2011_error = var_err
}
}
}
var_$2011_init = true
var_$2011_changed = true
}
}
var_$2010_changed = false
if ((var_$2011_init && var_$1704_init)) {
if ((var_$2011_changed) || (var_$1704_changed)) {
var_$2010_unknown = (var_$2011_unknown && var_$1704_unknown)
if ((var_$2010_unknown)) {
var_$2010_error = UnknownEventError(null)
} else {
var_$2010_error = null
try {
var_$2010_value = ((if((var_$2011_error == null)) {var_$2011_value} else {throw var_$2011_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$2010_error = var_err
}
}
}
var_$2010_init = true
var_$2010_changed = true
}
}
var_$2009_changed = false
if ((var_$2010_init && var_$1786_init)) {
if ((var_$2010_changed) || (var_$1786_changed)) {
var_$2009_unknown = (var_$2010_unknown && var_$1786_unknown)
if ((var_$2009_unknown)) {
var_$2009_error = UnknownEventError(null)
} else {
var_$2009_error = null
try {
var_$2009_value = ((if((var_$2010_error == null)) {var_$2010_value} else {throw var_$2010_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$2009_error = var_err
}
}
}
var_$2009_init = true
var_$2009_changed = true
}
}
var_$1648_changed = false
if ((var_event_changed)) {
if ((var_$1703_ts == currTs && var_$1703_lastInit) || (!(var_$1703_ts == currTs) && var_$1703_init)) {
var_$1648_changed = true
var_$1648_init = true
var_$1648_unknown = var_event_unknown
if ((var_$1648_unknown)) {
var_$1648_error = var_event_error
} else {
if ((var_$1703_ts == currTs)) {
var_$1648_value = var_$1703_lastValue
var_$1648_error = var_$1703_lastError
} else {
var_$1648_value = var_$1703_value
var_$1648_error = var_$1703_error
}
}
}
}
var_$1647_changed = false
if ((var_$1648_init)) {
if ((var_$1648_changed)) {
var_$1647_unknown = (var_$1648_unknown)
if ((var_$1647_unknown)) {
var_$1647_error = UnknownEventError(null)
} else {
var_$1647_error = null
try {
var_$1647_value = (if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}).size
} catch {
case var_err : Throwable => {
var_$1647_error = var_err
}
}
}
var_$1647_init = true
var_$1647_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1650_changed = false
}
if ((var_$1834_changed)) {
var_$1650_value = var_$1834_value
var_$1650_init = true
var_$1650_error = var_$1834_error
var_$1650_changed = true
var_$1650_unknown = var_$1834_unknown
}
var_$1646_changed = false
if ((var_$1647_init && var_$1650_init)) {
if ((var_$1647_changed) || (var_$1650_changed)) {
var_$1646_unknown = (var_$1647_unknown && var_$1650_unknown)
if ((var_$1646_unknown)) {
var_$1646_error = UnknownEventError(null)
} else {
var_$1646_error = null
try {
var_$1646_value = ((if((var_$1647_error == null)) {var_$1647_value} else {throw var_$1647_error}) > (if((var_$1650_error == null)) {var_$1650_value} else {throw var_$1650_error}))
} catch {
case var_err : Throwable => {
var_$1646_error = var_err
}
}
}
var_$1646_init = true
var_$1646_changed = true
}
}
var_$1653_changed = false
if ((var_defaultTime$1771_changed)) {
if ((var_$1703_ts == currTs && var_$1703_lastInit) || (!(var_$1703_ts == currTs) && var_$1703_init)) {
var_$1653_changed = true
var_$1653_init = true
var_$1653_unknown = var_defaultTime$1771_unknown
if ((var_$1653_unknown)) {
var_$1653_error = var_defaultTime$1771_error
} else {
if ((var_$1703_ts == currTs)) {
var_$1653_value = var_$1703_lastValue
var_$1653_error = var_$1703_lastError
} else {
var_$1653_value = var_$1703_value
var_$1653_error = var_$1703_error
}
}
}
}
var_$1652_changed = false
if ((var_$1653_init)) {
if ((var_$1653_changed)) {
var_$1652_unknown = (var_$1653_unknown)
if ((var_$1652_unknown)) {
var_$1652_error = UnknownEventError(null)
} else {
var_$1652_error = null
try {
var_$1652_value = (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}).tail
} catch {
case var_err : Throwable => {
var_$1652_error = var_err
}
}
}
var_$1652_init = true
var_$1652_changed = true
}
}
var_$1645_changed = false
if ((var_$1646_init && var_$1652_init && var_$1648_init)) {
if ((var_$1646_changed) || (var_$1652_changed) || (var_$1648_changed)) {
var_$1645_unknown = (var_$1646_unknown && var_$1652_unknown && var_$1648_unknown)
if ((var_$1645_unknown)) {
var_$1645_error = UnknownEventError(null)
} else {
var_$1645_error = null
try {
var_$1645_value = (if ((if((var_$1646_error == null)) {var_$1646_value} else {throw var_$1646_error})) (if((var_$1652_error == null)) {var_$1652_value} else {throw var_$1652_error}) else (if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}))
} catch {
case var_err : Throwable => {
var_$1645_error = var_err
}
}
}
var_$1645_init = true
var_$1645_changed = true
}
}
var_$1644_changed = false
if ((var_$1645_init && var_defaultTime$1771_init)) {
if ((var_$1645_changed) || (var_defaultTime$1771_changed)) {
var_$1644_unknown = (var_$1645_unknown && var_defaultTime$1771_unknown)
if ((var_$1644_unknown)) {
var_$1644_error = UnknownEventError(null)
} else {
var_$1644_error = null
try {
var_$1644_value = ((if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error}) :+ (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
} catch {
case var_err : Throwable => {
var_$1644_error = var_err
}
}
}
var_$1644_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$1643_changed = false
}
if ((var_$1644_changed)) {
var_latestSpanEventTimes$1643_value = var_$1644_value
var_latestSpanEventTimes$1643_init = true
var_latestSpanEventTimes$1643_error = var_$1644_error
var_latestSpanEventTimes$1643_changed = true
var_latestSpanEventTimes$1643_unknown = var_$1644_unknown
}
var_$1703_changed = false
if ((var_latestSpanEventTimes$1632_init && var_latestSpanEventTimes$1637_init && var_latestSpanEventTimes$1643_init)) {
if ((var_latestSpanEventTimes$1632_changed) || (var_latestSpanEventTimes$1637_changed) || (var_latestSpanEventTimes$1643_changed)) {
var_$1703_lastValue = var_$1703_value
var_$1703_lastInit = var_$1703_init
var_$1703_lastError = var_$1703_error
var_$1703_unknown = (var_latestSpanEventTimes$1632_unknown && var_latestSpanEventTimes$1637_unknown && var_latestSpanEventTimes$1643_unknown)
if ((var_$1703_unknown)) {
var_$1703_error = UnknownEventError(null)
} else {
var_$1703_error = null
try {
var_$1703_value = (if ((if((var_latestSpanEventTimes$1632_error == null)) {var_latestSpanEventTimes$1632_value} else {throw var_latestSpanEventTimes$1632_error})) (if((var_latestSpanEventTimes$1637_error == null)) {var_latestSpanEventTimes$1637_value} else {throw var_latestSpanEventTimes$1637_error}) else (if((var_latestSpanEventTimes$1643_error == null)) {var_latestSpanEventTimes$1643_value} else {throw var_latestSpanEventTimes$1643_error}))
} catch {
case var_err : Throwable => {
var_$1703_error = var_err
}
}
}
var_$1703_init = true
var_$1703_ts = currTs
var_$1703_changed = true
}
}
var_$1630_changed = false
if ((var_$1703_init)) {
if ((var_$1703_changed)) {
var_$1630_unknown = (var_$1703_unknown)
if ((var_$1630_unknown)) {
var_$1630_error = UnknownEventError(null)
} else {
var_$1630_error = null
try {
var_$1630_value = (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}).size
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
if ((var_$1630_init && var_$1650_init)) {
if ((var_$1630_changed) || (var_$1650_changed)) {
var_$1629_unknown = (var_$1630_unknown && var_$1650_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = ((if((var_$1630_error == null)) {var_$1630_value} else {throw var_$1630_error}) > (if((var_$1650_error == null)) {var_$1650_value} else {throw var_$1650_error}))
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
var_$1960_changed = false
if ((var_$1703_init)) {
if ((var_$1703_changed)) {
var_$1960_unknown = (var_$1703_unknown)
if ((var_$1960_unknown)) {
var_$1960_error = UnknownEventError(null)
} else {
var_$1960_error = null
try {
var_$1960_value = (var_head$1670.apply(((if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1960_error = var_err
}
}
}
var_$1960_init = true
var_$1960_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1671_changed = false
}
if ((var_$1834_changed)) {
var_$1671_value = var_$1834_value
var_$1671_init = true
var_$1671_error = var_$1834_error
var_$1671_changed = true
var_$1671_unknown = var_$1834_unknown
}
var_$1667_changed = false
if ((var_$1960_init && var_$1671_init)) {
if ((var_$1960_changed) || (var_$1671_changed)) {
var_$1667_unknown = (var_$1960_unknown && var_$1671_unknown)
if ((var_$1667_unknown)) {
var_$1667_error = UnknownEventError(null)
} else {
var_$1667_error = null
try {
var_$1667_value = ((if((var_$1960_error == null)) {var_$1960_value} else {throw var_$1960_error}) + (if((var_$1671_error == null)) {var_$1671_value} else {throw var_$1671_error}))
} catch {
case var_err : Throwable => {
var_$1667_error = var_err
}
}
}
var_$1667_init = true
var_$1667_changed = true
}
}
var_safeDelay$1679_changed = false
if ((var_safeDelay$1679_nextTs == currTs)) {
var_safeDelay$1679_changed = true
var_safeDelay$1679_unknown = false
}
var_$1677_changed = false
if ((var_safeDelay$1679_changed)) {
if ((var_safeDelay$1679_unknown)) {
var_$1677_error = UnknownEventError(var_safeDelay$1679_error)
} else {
var_$1677_error = null
}
var_$1677_changed = var_safeDelay$1679_changed
var_$1677_unknown = var_safeDelay$1679_unknown
}
var_mergeUnit2$1674_changed = false
if ((var_$1804_changed) || (var_$1677_changed)) {
var_mergeUnit2$1674_ts = currTs
var_mergeUnit2$1674_changed = true
var_mergeUnit2$1674_unknown = (var_$1804_unknown && var_$1677_unknown)
if ((var_$1804_changed)) {
var_mergeUnit2$1674_error = var_$1804_error
} else {
if ((var_$1677_changed)) {
var_mergeUnit2$1674_error = var_$1677_error
}
}
}
var_$1689_changed = false
if ((var_mergeUnit2$1674_changed)) {
var_$1689_value = var_mergeUnit2$1674_ts
var_$1689_init = true
var_$1689_unknown = var_mergeUnit2$1674_unknown
if ((var_$1689_unknown)) {
var_$1689_error = var_mergeUnit2$1674_error
} else {
var_$1689_error = null
}
var_$1689_changed = true
}
var_$1666_changed = false
if ((var_$1667_init && var_$1689_init)) {
if ((var_$1667_changed) || (var_$1689_changed)) {
var_$1666_unknown = (var_$1667_unknown && var_$1689_unknown)
if ((var_$1666_unknown)) {
var_$1666_error = UnknownEventError(null)
} else {
var_$1666_error = null
try {
var_$1666_value = ((if((var_$1667_error == null)) {var_$1667_value} else {throw var_$1667_error}) <= (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
} catch {
case var_err : Throwable => {
var_$1666_error = var_err
}
}
}
var_$1666_init = true
var_$1666_changed = true
}
}
var_$1701_changed = false
if ((var_$1960_init && var_$1704_init)) {
if ((var_$1960_changed) || (var_$1704_changed)) {
var_$1701_unknown = (var_$1960_unknown && var_$1704_unknown)
if ((var_$1701_unknown)) {
var_$1701_error = UnknownEventError(null)
} else {
var_$1701_error = null
try {
var_$1701_value = ((if((var_$1960_error == null)) {var_$1960_value} else {throw var_$1960_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1701_error = var_err
}
}
}
var_$1701_init = true
var_$1701_changed = true
}
}
var_$1700_changed = false
if ((var_$1701_init && var_$1689_init)) {
if ((var_$1701_changed) || (var_$1689_changed)) {
var_$1700_unknown = (var_$1701_unknown && var_$1689_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) >= (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
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
var_$1680_changed = false
if ((var_$1681_init && var_$1700_init)) {
if ((var_$1681_changed) || (var_$1700_changed)) {
var_$1680_unknown = (var_$1681_unknown && var_$1700_unknown)
if ((var_$1680_unknown)) {
var_$1680_error = UnknownEventError(null)
} else {
var_$1680_error = null
try {
var_$1680_value = ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}) || (if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}))
} catch {
case var_err : Throwable => {
var_$1680_error = var_err
}
}
}
var_$1680_init = true
var_$1680_changed = true
}
}
var_$1665_changed = false
if ((var_$1666_init && var_$1680_init)) {
if ((var_$1666_changed) || (var_$1680_changed)) {
var_$1665_unknown = (var_$1666_unknown && var_$1680_unknown)
if ((var_$1665_unknown)) {
var_$1665_error = UnknownEventError(null)
} else {
var_$1665_error = null
try {
var_$1665_value = ((if((var_$1666_error == null)) {var_$1666_value} else {throw var_$1666_error}) && (if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
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
var_$1664_changed = false
if ((var_$1665_init && var_$1707_init && var_$1745_init)) {
if ((var_$1665_changed) || (var_$1707_changed) || (var_$1745_changed)) {
var_$1664_unknown = (var_$1665_unknown && var_$1707_unknown && var_$1745_unknown)
if ((var_$1664_unknown)) {
var_$1664_error = UnknownEventError(null)
} else {
var_$1664_error = null
try {
var_$1664_value = (if ((if((var_$1665_error == null)) {var_$1665_value} else {throw var_$1665_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))
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
var_$1696_changed = false
if ((var_$1680_init && var_$1707_init && var_$1745_init)) {
if ((var_$1680_changed) || (var_$1707_changed) || (var_$1745_changed)) {
var_$1696_unknown = (var_$1680_unknown && var_$1707_unknown && var_$1745_unknown)
if ((var_$1696_unknown)) {
var_$1696_error = UnknownEventError(null)
} else {
var_$1696_error = null
try {
var_$1696_value = (if ((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))
} catch {
case var_err : Throwable => {
var_$1696_error = var_err
}
}
}
var_$1696_init = true
var_$1696_changed = true
}
}
var_$1628_changed = false
if ((var_$1629_init && var_$1664_init && var_$1696_init)) {
if ((var_$1629_changed) || (var_$1664_changed) || (var_$1696_changed)) {
var_$1628_unknown = (var_$1629_unknown && var_$1664_unknown && var_$1696_unknown)
if ((var_$1628_unknown)) {
var_$1628_error = UnknownEventError(null)
} else {
var_$1628_error = null
try {
var_$1628_value = (if ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error})) (if((var_$1664_error == null)) {var_$1664_value} else {throw var_$1664_error}) else (if((var_$1696_error == null)) {var_$1696_value} else {throw var_$1696_error}))
} catch {
case var_err : Throwable => {
var_$1628_error = var_err
}
}
}
var_$1628_init = true
var_$1628_ts = currTs
var_$1628_changed = true
}
}
var_$1627_changed = false
if ((var_$1628_init)) {
if ((var_$1628_changed)) {
var_$1627_unknown = (var_$1628_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = var_$1726.apply((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}))
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
var_$1730_changed = false
if ((var_$1628_init)) {
if ((var_$1628_changed)) {
var_$1730_unknown = (var_$1628_unknown)
if ((var_$1730_unknown)) {
var_$1730_error = UnknownEventError(null)
} else {
var_$1730_error = null
try {
var_$1730_value = var_$1845.apply((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}))
} catch {
case var_err : Throwable => {
var_$1730_error = var_err
}
}
}
var_$1730_init = true
var_$1730_changed = true
}
}
var_$1714_changed = false
if ((var_$1730_init)) {
if ((var_$1730_changed)) {
var_$1714_unknown = (var_$1730_unknown)
if ((var_$1714_unknown)) {
var_$1714_error = UnknownEventError(null)
} else {
var_$1714_error = null
try {
var_$1714_value = !((if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}))
} catch {
case var_err : Throwable => {
var_$1714_error = var_err
}
}
}
var_$1714_init = true
var_$1714_changed = true
}
}
var_$1626_changed = false
if ((var_$1627_init && var_$1714_init)) {
if ((var_$1627_changed) || (var_$1714_changed)) {
var_$1626_unknown = (var_$1627_unknown && var_$1714_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) && (if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error}))
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
var_$1721_changed = false
if ((var_$1628_changed)) {
if ((var_$1722_ts == currTs && var_$1722_lastInit) || (!(var_$1722_ts == currTs) && var_$1722_init)) {
var_$1721_changed = true
var_$1721_init = true
var_$1721_unknown = var_$1628_unknown
if ((var_$1721_unknown)) {
var_$1721_error = var_$1628_error
} else {
if ((var_$1722_ts == currTs)) {
var_$1721_value = var_$1722_lastValue
var_$1721_error = var_$1722_lastError
} else {
var_$1721_value = var_$1722_value
var_$1721_error = var_$1722_error
}
}
}
}
var_$1724_changed = false
if ((var_$1627_init && var_$1681_init)) {
if ((var_$1627_changed) || (var_$1681_changed)) {
var_$1724_unknown = (var_$1627_unknown && var_$1681_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) == (if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}))
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
var_$1729_changed = false
if ((var_$1730_init && var_$1861_init)) {
if ((var_$1730_changed) || (var_$1861_changed)) {
var_$1729_unknown = (var_$1730_unknown && var_$1861_unknown)
if ((var_$1729_unknown)) {
var_$1729_error = UnknownEventError(null)
} else {
var_$1729_error = null
try {
var_$1729_value = ((if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}) == (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
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
var_$1723_changed = false
if ((var_$1724_init && var_$1729_init)) {
if ((var_$1724_changed) || (var_$1729_changed)) {
var_$1723_unknown = (var_$1724_unknown && var_$1729_unknown)
if ((var_$1723_unknown)) {
var_$1723_error = UnknownEventError(null)
} else {
var_$1723_error = null
try {
var_$1723_value = ((if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}) && (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_$1723_error = var_err
}
}
}
var_$1723_init = true
var_$1723_changed = true
}
}
var_isFinalFalse$1720_changed = false
if ((var_$1721_init && var_$1723_init)) {
if ((var_$1721_changed) || (var_$1723_changed)) {
var_isFinalFalse$1720_unknown = (var_$1721_unknown && var_$1723_unknown)
if ((var_isFinalFalse$1720_unknown)) {
var_isFinalFalse$1720_error = UnknownEventError(null)
} else {
var_isFinalFalse$1720_error = null
try {
var_isFinalFalse$1720_value = ((if((var_$1721_error == null)) {var_$1721_value} else {throw var_$1721_error}) || (if((var_$1723_error == null)) {var_$1723_value} else {throw var_$1723_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1720_error = var_err
}
}
}
var_isFinalFalse$1720_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$1744_changed = false
}
if ((var_isFinalFalse$1720_changed)) {
var_isFinalFalseReset$1744_lastValue = var_isFinalFalseReset$1744_value
var_isFinalFalseReset$1744_lastInit = var_isFinalFalseReset$1744_init
var_isFinalFalseReset$1744_lastError = var_isFinalFalseReset$1744_error
var_isFinalFalseReset$1744_value = var_isFinalFalse$1720_value
var_isFinalFalseReset$1744_init = true
var_isFinalFalseReset$1744_ts = currTs
var_isFinalFalseReset$1744_error = var_isFinalFalse$1720_error
var_isFinalFalseReset$1744_changed = true
var_isFinalFalseReset$1744_unknown = var_isFinalFalse$1720_unknown
}
var_prev$1718_changed = false
if ((var_isFinalFalseReset$1744_changed)) {
if ((var_isFinalFalseReset$1744_ts == currTs && var_isFinalFalseReset$1744_lastInit) || (!(var_isFinalFalseReset$1744_ts == currTs) && var_isFinalFalseReset$1744_init)) {
var_prev$1718_changed = true
var_prev$1718_init = true
var_prev$1718_unknown = var_isFinalFalseReset$1744_unknown
if ((var_prev$1718_unknown)) {
var_prev$1718_error = var_isFinalFalseReset$1744_error
} else {
if ((var_isFinalFalseReset$1744_ts == currTs)) {
var_prev$1718_value = var_isFinalFalseReset$1744_lastValue
var_prev$1718_error = var_isFinalFalseReset$1744_lastError
} else {
var_prev$1718_value = var_isFinalFalseReset$1744_value
var_prev$1718_error = var_isFinalFalseReset$1744_error
}
}
}
}
var_$1717_changed = false
if ((var_prev$1718_init)) {
if ((var_prev$1718_changed)) {
var_$1717_unknown = (var_prev$1718_unknown)
if ((var_$1717_unknown)) {
var_$1717_error = UnknownEventError(null)
} else {
var_$1717_error = null
try {
var_$1717_value = !((if((var_prev$1718_error == null)) {var_prev$1718_value} else {throw var_prev$1718_error}))
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
var_$1625_changed = false
if ((var_$1626_init && var_$1717_init)) {
if ((var_$1626_changed) || (var_$1717_changed)) {
var_$1625_unknown = (var_$1626_unknown && var_$1717_unknown)
if ((var_$1625_unknown)) {
var_$1625_error = UnknownEventError(null)
} else {
var_$1625_error = null
try {
var_$1625_value = ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error}) && (if((var_$1717_error == null)) {var_$1717_value} else {throw var_$1717_error}))
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
var_$1734_changed = false
if ((var_$1628_changed)) {
var_$1734_value = var_$1628_ts
var_$1734_init = true
var_$1734_unknown = var_$1628_unknown
if ((var_$1734_unknown)) {
var_$1734_error = var_$1628_error
} else {
var_$1734_error = null
}
var_$1734_changed = true
}
var_$1735_changed = false
if ((var_isFinalFalseReset$1744_changed)) {
if ((var_$1736_ts == currTs && var_$1736_lastInit) || (!(var_$1736_ts == currTs) && var_$1736_init)) {
var_$1735_changed = true
var_$1735_init = true
var_$1735_unknown = var_isFinalFalseReset$1744_unknown
if ((var_$1735_unknown)) {
var_$1735_error = var_isFinalFalseReset$1744_error
} else {
if ((var_$1736_ts == currTs)) {
var_$1735_value = var_$1736_lastValue
var_$1735_error = var_$1736_lastError
} else {
var_$1735_value = var_$1736_value
var_$1735_error = var_$1736_error
}
}
}
}
var_finalFalseSince$1624_changed = false
if ((var_$1625_init && var_$1734_init && var_$1735_init)) {
if ((var_$1625_changed) || (var_$1734_changed) || (var_$1735_changed)) {
var_finalFalseSince$1624_unknown = (var_$1625_unknown && var_$1734_unknown && var_$1735_unknown)
if ((var_finalFalseSince$1624_unknown)) {
var_finalFalseSince$1624_error = UnknownEventError(null)
} else {
var_finalFalseSince$1624_error = null
try {
var_finalFalseSince$1624_value = (if ((if((var_$1625_error == null)) {var_$1625_value} else {throw var_$1625_error})) (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}) else (if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}))
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
var_$1736_changed = false
}
if ((var_finalFalseSince$1624_changed)) {
var_$1736_lastValue = var_$1736_value
var_$1736_lastInit = var_$1736_init
var_$1736_lastError = var_$1736_error
var_$1736_value = var_finalFalseSince$1624_value
var_$1736_init = true
var_$1736_ts = currTs
var_$1736_error = var_finalFalseSince$1624_error
var_$1736_changed = true
var_$1736_unknown = var_finalFalseSince$1624_unknown
}
var_$1971_changed = false
if ((var_$1703_init)) {
if ((var_$1703_changed)) {
var_$1971_unknown = (var_$1703_unknown)
if ((var_$1971_unknown)) {
var_$1971_error = UnknownEventError(null)
} else {
var_$1971_error = null
try {
var_$1971_value = (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}).tail
} catch {
case var_err : Throwable => {
var_$1971_error = var_err
}
}
}
var_$1971_init = true
var_$1971_changed = true
}
}
var_$1970_changed = false
if ((var_$1971_init)) {
if ((var_$1971_changed)) {
var_$1970_unknown = (var_$1971_unknown)
if ((var_$1970_unknown)) {
var_$1970_error = UnknownEventError(null)
} else {
var_$1970_error = null
try {
var_$1970_value = (var_head$1670.apply(((if((var_$1971_error == null)) {var_$1971_value} else {throw var_$1971_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1970_error = var_err
}
}
}
var_$1970_init = true
var_$1970_changed = true
}
}
var_$1751_changed = false
if ((var_$1752_init && var_$1863_init)) {
if ((var_$1752_changed) || (var_$1863_changed)) {
var_$1751_unknown = (var_$1752_unknown && var_$1863_unknown)
if ((var_$1751_unknown)) {
var_$1751_error = UnknownEventError(null)
} else {
var_$1751_error = null
try {
var_$1751_value = ((if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}) < (if((var_$1863_error == null)) {var_$1863_value} else {throw var_$1863_error}))
} catch {
case var_err : Throwable => {
var_$1751_error = var_err
}
}
}
var_$1751_init = true
var_$1751_changed = true
}
}
var_isFinalFalseReset$1750_changed = false
if ((var_$1751_init && var_$1861_init && var_$1872_init)) {
if ((var_$1751_changed) || (var_$1861_changed) || (var_$1872_changed)) {
var_isFinalFalseReset$1750_unknown = (var_$1751_unknown && var_$1861_unknown && var_$1872_unknown)
if ((var_isFinalFalseReset$1750_unknown)) {
var_isFinalFalseReset$1750_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1750_error = null
try {
var_isFinalFalseReset$1750_value = (if ((if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error})) (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}) else (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1750_error = var_err
}
}
}
var_isFinalFalseReset$1750_changed = true
}
}
var_$1749_changed = false
if ((var_isFinalFalseReset$1750_changed) || (var_$1872_changed)) {
var_$1749_lastValue = var_$1749_value
var_$1749_lastInit = var_$1749_init
var_$1749_lastError = var_$1749_error
var_$1749_init = true
var_$1749_ts = currTs
var_$1749_changed = true
var_$1749_unknown = (var_isFinalFalseReset$1750_unknown && var_$1872_unknown)
if ((var_isFinalFalseReset$1750_changed)) {
var_$1749_value = var_isFinalFalseReset$1750_value
var_$1749_error = var_isFinalFalseReset$1750_error
} else {
if ((var_$1872_changed)) {
var_$1749_value = var_$1872_value
var_$1749_error = var_$1872_error
}
}
}
var_stillFulfillableReset$1748_changed = false
if ((var_$1749_init && var_$1745_init && var_$1758_init)) {
if ((var_$1749_changed) || (var_$1745_changed) || (var_$1758_changed)) {
var_stillFulfillableReset$1748_unknown = (var_$1749_unknown && var_$1745_unknown && var_$1758_unknown)
if ((var_stillFulfillableReset$1748_unknown)) {
var_stillFulfillableReset$1748_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1748_error = null
try {
var_stillFulfillableReset$1748_value = (if ((if((var_$1749_error == null)) {var_$1749_value} else {throw var_$1749_error})) (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}) else (if((var_$1758_error == null)) {var_$1758_value} else {throw var_$1758_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1748_error = var_err
}
}
}
var_stillFulfillableReset$1748_init = true
var_stillFulfillableReset$1748_changed = true
}
}
var_$1622_changed = false
if ((var_$1736_init && var_$1704_init)) {
if ((var_$1736_changed) || (var_$1704_changed)) {
var_$1622_unknown = (var_$1736_unknown && var_$1704_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
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
if ((var_$1622_init && var_$1734_init)) {
if ((var_$1622_changed) || (var_$1734_changed)) {
var_$1621_unknown = (var_$1622_unknown && var_$1734_unknown)
if ((var_$1621_unknown)) {
var_$1621_error = UnknownEventError(null)
} else {
var_$1621_error = null
try {
var_$1621_value = ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error}) < (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
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
if ((var_$1621_init && var_$1861_init && var_isFinalFalseReset$1744_init)) {
if ((var_$1621_changed) || (var_$1861_changed) || (var_isFinalFalseReset$1744_changed)) {
var_isFinalFalseReset$1620_unknown = (var_$1621_unknown && var_$1861_unknown && var_isFinalFalseReset$1744_unknown)
if ((var_isFinalFalseReset$1620_unknown)) {
var_isFinalFalseReset$1620_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1620_error = null
try {
var_isFinalFalseReset$1620_value = (if ((if((var_$1621_error == null)) {var_$1621_value} else {throw var_$1621_error})) (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}) else (if((var_isFinalFalseReset$1744_error == null)) {var_isFinalFalseReset$1744_value} else {throw var_isFinalFalseReset$1744_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1620_error = var_err
}
}
}
var_isFinalFalseReset$1620_changed = true
}
}
var_$1722_changed = false
if ((var_isFinalFalseReset$1620_changed) || (var_isFinalFalseReset$1744_changed)) {
var_$1722_lastValue = var_$1722_value
var_$1722_lastInit = var_$1722_init
var_$1722_lastError = var_$1722_error
var_$1722_init = true
var_$1722_ts = currTs
var_$1722_changed = true
var_$1722_unknown = (var_isFinalFalseReset$1620_unknown && var_isFinalFalseReset$1744_unknown)
if ((var_isFinalFalseReset$1620_changed)) {
var_$1722_value = var_isFinalFalseReset$1620_value
var_$1722_error = var_isFinalFalseReset$1620_error
} else {
if ((var_isFinalFalseReset$1744_changed)) {
var_$1722_value = var_isFinalFalseReset$1744_value
var_$1722_error = var_isFinalFalseReset$1744_error
}
}
}
var_stillFulfillableReset$1618_changed = false
if ((var_$1722_init && var_$1745_init && var_$1628_init)) {
if ((var_$1722_changed) || (var_$1745_changed) || (var_$1628_changed)) {
var_stillFulfillableReset$1618_unknown = (var_$1722_unknown && var_$1745_unknown && var_$1628_unknown)
if ((var_stillFulfillableReset$1618_unknown)) {
var_stillFulfillableReset$1618_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1618_error = null
try {
var_stillFulfillableReset$1618_value = (if ((if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error})) (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}) else (if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1618_error = var_err
}
}
}
var_stillFulfillableReset$1618_init = true
var_stillFulfillableReset$1618_changed = true
}
}
var_burstConstraintReset$1617_changed = false
if ((var_stillFulfillableReset$1618_init && var_stillFulfillableReset$1748_init)) {
if ((var_stillFulfillableReset$1618_changed) || (var_stillFulfillableReset$1748_changed)) {
var_burstConstraintReset$1617_unknown = (var_stillFulfillableReset$1618_unknown && var_stillFulfillableReset$1748_unknown)
if ((var_burstConstraintReset$1617_unknown)) {
var_burstConstraintReset$1617_error = UnknownEventError(null)
} else {
var_burstConstraintReset$1617_error = null
try {
var_burstConstraintReset$1617_value = var_fourValuedConjunction$1877.apply((if((var_stillFulfillableReset$1618_error == null)) {var_stillFulfillableReset$1618_value} else {throw var_stillFulfillableReset$1618_error}), (if((var_stillFulfillableReset$1748_error == null)) {var_stillFulfillableReset$1748_value} else {throw var_stillFulfillableReset$1748_error}))
} catch {
case var_err : Throwable => {
var_burstConstraintReset$1617_error = var_err
}
}
}
var_burstConstraintReset$1617_init = true
var_burstConstraintReset$1617_changed = true
}
}
var_final$1616_changed = false
if ((var_burstConstraintReset$1617_init)) {
if ((var_burstConstraintReset$1617_changed)) {
var_final$1616_unknown = (var_burstConstraintReset$1617_unknown)
if ((var_final$1616_unknown)) {
var_final$1616_error = UnknownEventError(null)
} else {
var_final$1616_error = null
try {
var_final$1616_value = var_$1726.apply((if((var_burstConstraintReset$1617_error == null)) {var_burstConstraintReset$1617_value} else {throw var_burstConstraintReset$1617_error}))
} catch {
case var_err : Throwable => {
var_final$1616_error = var_err
}
}
}
var_final$1616_init = true
var_final$1616_changed = true
}
}
if ((!(currTs == 0L))) {
var_delayPeriod$1988_changed = false
}
if ((var_$1834_changed)) {
var_delayPeriod$1988_value = var_$1834_value
var_delayPeriod$1988_init = true
var_delayPeriod$1988_error = var_$1834_error
var_delayPeriod$1988_changed = true
var_delayPeriod$1988_unknown = var_$1834_unknown
}
var_$2031_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$2031_changed = true
var_$2031_unknown = var_event_unknown
if ((var_$2031_unknown)) {
var_$2031_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$2031_error = var_event_lastError
} else {
var_$2031_error = var_event_error
}
}
}
}
var_$2030_changed = false
if ((var_$2031_changed)) {
var_$2030_value = false
if ((var_$2031_unknown)) {
var_$2030_error = UnknownEventError(var_$2031_error)
} else {
var_$2030_error = null
}
var_$2030_changed = var_$2031_changed
var_$2030_unknown = var_$2031_unknown
}
var_$2032_changed = false
if ((var_event_changed)) {
var_$2032_value = true
if ((var_event_unknown)) {
var_$2032_error = UnknownEventError(var_event_error)
} else {
var_$2032_error = null
}
var_$2032_changed = var_event_changed
var_$2032_unknown = var_event_unknown
}
if ((var_$2030_changed) || (var_$2032_changed) || (var_$1861_changed)) {
var_isFirst$1956_init = true
var_isFirst$1956_unknown = (var_$2030_unknown && var_$2032_unknown && var_$1861_unknown)
if ((var_$2030_changed)) {
var_isFirst$1956_value = var_$2030_value
var_isFirst$1956_error = var_$2030_error
} else {
if ((var_$2032_changed)) {
var_isFirst$1956_value = var_$2032_value
var_isFirst$1956_error = var_$2032_error
} else {
if ((var_$1861_changed)) {
var_isFirst$1956_value = var_$1861_value
var_isFirst$1956_error = var_$1861_error
}
}
}
}
var_firstEvent$1996_changed = false
if ((var_isFirst$1956_init && var_event_changed)) {
if ((var_isFirst$1956_value) || (!(var_isFirst$1956_error == null)) || (var_isFirst$1956_unknown)) {
if ((!(var_isFirst$1956_error == null))) {
var_firstEvent$1996_error = var_isFirst$1956_error
} else {
var_firstEvent$1996_error = var_event_error
}
var_firstEvent$1996_changed = true
var_firstEvent$1996_ts = var_event_ts
var_firstEvent$1996_unknown = (var_event_unknown || !(var_isFirst$1956_error == null))
}
}
var_$1995_changed = false
if ((var_firstEvent$1996_changed)) {
var_$1995_value = var_firstEvent$1996_ts
var_$1995_unknown = var_firstEvent$1996_unknown
if ((var_$1995_unknown)) {
var_$1995_error = var_firstEvent$1996_error
} else {
var_$1995_error = null
}
var_$1995_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1994_changed = false
}
if ((var_$1995_changed)) {
var_defaultTime$1994_value = var_$1995_value
var_defaultTime$1994_init = true
var_defaultTime$1994_error = var_$1995_error
var_defaultTime$1994_changed = true
var_defaultTime$1994_unknown = var_$1995_unknown
}
var_$1991_changed = false
if ((var_defaultTime$1771_init && var_defaultTime$1994_init)) {
if ((var_defaultTime$1771_changed) || (var_defaultTime$1994_changed)) {
var_$1991_unknown = (var_defaultTime$1771_unknown && var_defaultTime$1994_unknown)
if ((var_$1991_unknown)) {
var_$1991_error = UnknownEventError(null)
} else {
var_$1991_error = null
try {
var_$1991_value = ((if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}) == (if((var_defaultTime$1994_error == null)) {var_defaultTime$1994_value} else {throw var_defaultTime$1994_error}))
} catch {
case var_err : Throwable => {
var_$1991_error = var_err
}
}
}
var_$1991_init = true
var_$1991_changed = true
}
}
var_$1999_changed = false
if ((var_$1813_init && var_$1786_init)) {
if ((var_$1813_changed) || (var_$1786_changed)) {
var_$1999_unknown = (var_$1813_unknown && var_$1786_unknown)
if ((var_$1999_unknown)) {
var_$1999_error = UnknownEventError(null)
} else {
var_$1999_error = null
try {
var_$1999_value = ((if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1999_error = var_err
}
}
}
var_$1999_init = true
var_$1999_changed = true
}
}
var_$1998_changed = false
if ((var_$1999_init && var_$1965_init)) {
if ((var_$1999_changed) || (var_$1965_changed)) {
var_$1998_unknown = (var_$1999_unknown && var_$1965_unknown)
if ((var_$1998_unknown)) {
var_$1998_error = UnknownEventError(null)
} else {
var_$1998_error = null
try {
var_$1998_value = ((if((var_$1999_error == null)) {var_$1999_value} else {throw var_$1999_error}) + (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
} catch {
case var_err : Throwable => {
var_$1998_error = var_err
}
}
}
var_$1998_init = true
var_$1998_changed = true
}
}
var_$2008_changed = false
if ((var_$2009_init && var_$1965_init)) {
if ((var_$2009_changed) || (var_$1965_changed)) {
var_$2008_unknown = (var_$2009_unknown && var_$1965_unknown)
if ((var_$2008_unknown)) {
var_$2008_error = UnknownEventError(null)
} else {
var_$2008_error = null
try {
var_$2008_value = ((if((var_$2009_error == null)) {var_$2009_value} else {throw var_$2009_error}) + (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
} catch {
case var_err : Throwable => {
var_$2008_error = var_err
}
}
}
var_$2008_init = true
var_$2008_changed = true
}
}
var_delayPeriod$1990_changed = false
if ((var_$1991_init && var_$1998_init && var_$2008_init)) {
if ((var_$1991_changed) || (var_$1998_changed) || (var_$2008_changed)) {
var_delayPeriod$1990_unknown = (var_$1991_unknown && var_$1998_unknown && var_$2008_unknown)
if ((var_delayPeriod$1990_unknown)) {
var_delayPeriod$1990_error = UnknownEventError(null)
} else {
var_delayPeriod$1990_error = null
try {
var_delayPeriod$1990_value = (if ((if((var_$1991_error == null)) {var_$1991_value} else {throw var_$1991_error})) (if((var_$1998_error == null)) {var_$1998_value} else {throw var_$1998_error}) else (if((var_$2008_error == null)) {var_$2008_value} else {throw var_$2008_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$1990_error = var_err
}
}
}
var_delayPeriod$1990_init = true
var_delayPeriod$1990_changed = true
}
}
var_$1985_changed = false
if ((var_$1681_init && var_delayPeriod$1988_init && var_delayPeriod$1990_init)) {
if ((var_$1681_changed) || (var_delayPeriod$1988_changed) || (var_delayPeriod$1990_changed)) {
var_$1985_unknown = (var_$1681_unknown && var_delayPeriod$1988_unknown && var_delayPeriod$1990_unknown)
if ((var_$1985_unknown)) {
var_$1985_error = UnknownEventError(null)
} else {
var_$1985_error = null
try {
var_$1985_value = (if ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error})) (if((var_delayPeriod$1988_error == null)) {var_delayPeriod$1988_value} else {throw var_delayPeriod$1988_error}) else (if((var_delayPeriod$1990_error == null)) {var_delayPeriod$1990_value} else {throw var_delayPeriod$1990_error}))
} catch {
case var_err : Throwable => {
var_$1985_error = var_err
}
}
}
var_$1985_init = true
var_$1985_ts = currTs
var_$1985_changed = true
}
}
var_$1984_changed = false
if ((var_$1985_init && var_$1765_init)) {
if ((var_$1985_changed) || (var_$1765_changed)) {
var_$1984_unknown = (var_$1985_unknown && var_$1765_unknown)
if ((var_$1984_unknown)) {
var_$1984_error = UnknownEventError(null)
} else {
var_$1984_error = null
try {
var_$1984_value = ((if((var_$1985_error == null)) {var_$1985_value} else {throw var_$1985_error}) > (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
} catch {
case var_err : Throwable => {
var_$1984_error = var_err
}
}
}
var_$1984_init = true
var_$1984_changed = true
}
}
var_$2024_changed = false
if ((var_$1985_changed)) {
var_$2024_value = var_$1985_ts
var_$2024_init = true
var_$2024_unknown = var_$1985_unknown
if ((var_$2024_unknown)) {
var_$2024_error = var_$1985_error
} else {
var_$2024_error = null
}
var_$2024_changed = true
}
var_$2021_changed = false
if ((var_$1704_init && var_$2024_init)) {
if ((var_$1704_changed) || (var_$2024_changed)) {
var_$2021_unknown = (var_$1704_unknown && var_$2024_unknown)
if ((var_$2021_unknown)) {
var_$2021_error = UnknownEventError(null)
} else {
var_$2021_error = null
try {
var_$2021_value = ((if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}) - (if((var_$2024_error == null)) {var_$2024_value} else {throw var_$2024_error}))
} catch {
case var_err : Throwable => {
var_$2021_error = var_err
}
}
}
var_$2021_init = true
var_$2021_changed = true
}
}
var_$1892_changed = false
if ((var_$1984_init && var_$1985_init && var_$2021_init)) {
if ((var_$1984_changed) || (var_$1985_changed) || (var_$2021_changed)) {
var_$1892_unknown = (var_$1984_unknown && var_$1985_unknown && var_$2021_unknown)
if ((var_$1892_unknown)) {
var_$1892_error = UnknownEventError(null)
} else {
var_$1892_error = null
try {
var_$1892_value = (if ((if((var_$1984_error == null)) {var_$1984_value} else {throw var_$1984_error})) (if((var_$1985_error == null)) {var_$1985_value} else {throw var_$1985_error}) else (if((var_$2021_error == null)) {var_$2021_value} else {throw var_$2021_error}))
} catch {
case var_err : Throwable => {
var_$1892_error = var_err
}
}
}
var_$1892_changed = true
}
}
var_$1969_changed = false
if ((var_$1970_init && var_$1704_init)) {
if ((var_$1970_changed) || (var_$1704_changed)) {
var_$1969_unknown = (var_$1970_unknown && var_$1704_unknown)
if ((var_$1969_unknown)) {
var_$1969_error = UnknownEventError(null)
} else {
var_$1969_error = null
try {
var_$1969_value = ((if((var_$1970_error == null)) {var_$1970_value} else {throw var_$1970_error}) + (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1969_error = var_err
}
}
}
var_$1969_init = true
var_$1969_changed = true
}
}
var_$1968_changed = false
if ((var_$1969_init && var_$1786_init)) {
if ((var_$1969_changed) || (var_$1786_changed)) {
var_$1968_unknown = (var_$1969_unknown && var_$1786_unknown)
if ((var_$1968_unknown)) {
var_$1968_error = UnknownEventError(null)
} else {
var_$1968_error = null
try {
var_$1968_value = ((if((var_$1969_error == null)) {var_$1969_value} else {throw var_$1969_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1968_error = var_err
}
}
}
var_$1968_init = true
var_$1968_changed = true
}
}
var_$1967_changed = false
if ((var_$1968_init && var_$1965_init)) {
if ((var_$1968_changed) || (var_$1965_changed)) {
var_$1967_unknown = (var_$1968_unknown && var_$1965_unknown)
if ((var_$1967_unknown)) {
var_$1967_error = UnknownEventError(null)
} else {
var_$1967_error = null
try {
var_$1967_value = ((if((var_$1968_error == null)) {var_$1968_value} else {throw var_$1968_error}) + (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
} catch {
case var_err : Throwable => {
var_$1967_error = var_err
}
}
}
var_$1967_init = true
var_$1967_changed = true
}
}
var_$1958_changed = false
if ((var_$1701_init && var_$1786_init)) {
if ((var_$1701_changed) || (var_$1786_changed)) {
var_$1958_unknown = (var_$1701_unknown && var_$1786_unknown)
if ((var_$1958_unknown)) {
var_$1958_error = UnknownEventError(null)
} else {
var_$1958_error = null
try {
var_$1958_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1958_error = var_err
}
}
}
var_$1958_init = true
var_$1958_changed = true
}
}
var_$1957_changed = false
if ((var_$1958_init && var_$1965_init)) {
if ((var_$1958_changed) || (var_$1965_changed)) {
var_$1957_unknown = (var_$1958_unknown && var_$1965_unknown)
if ((var_$1957_unknown)) {
var_$1957_error = UnknownEventError(null)
} else {
var_$1957_error = null
try {
var_$1957_value = ((if((var_$1958_error == null)) {var_$1958_value} else {throw var_$1958_error}) + (if((var_$1965_error == null)) {var_$1965_value} else {throw var_$1965_error}))
} catch {
case var_err : Throwable => {
var_$1957_error = var_err
}
}
}
var_$1957_init = true
var_$1957_changed = true
}
}
var_delayPeriod$1949_changed = false
if ((var_$1991_init && var_$1957_init && var_$1967_init)) {
if ((var_$1991_changed) || (var_$1957_changed) || (var_$1967_changed)) {
var_delayPeriod$1949_unknown = (var_$1991_unknown && var_$1957_unknown && var_$1967_unknown)
if ((var_delayPeriod$1949_unknown)) {
var_delayPeriod$1949_error = UnknownEventError(null)
} else {
var_delayPeriod$1949_error = null
try {
var_delayPeriod$1949_value = (if ((if((var_$1991_error == null)) {var_$1991_value} else {throw var_$1991_error})) (if((var_$1957_error == null)) {var_$1957_value} else {throw var_$1957_error}) else (if((var_$1967_error == null)) {var_$1967_value} else {throw var_$1967_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$1949_error = var_err
}
}
}
var_delayPeriod$1949_init = true
var_delayPeriod$1949_changed = true
}
}
var_$1944_changed = false
if ((var_$1681_init && var_delayPeriod$1988_init && var_delayPeriod$1949_init)) {
if ((var_$1681_changed) || (var_delayPeriod$1988_changed) || (var_delayPeriod$1949_changed)) {
var_$1944_unknown = (var_$1681_unknown && var_delayPeriod$1988_unknown && var_delayPeriod$1949_unknown)
if ((var_$1944_unknown)) {
var_$1944_error = UnknownEventError(null)
} else {
var_$1944_error = null
try {
var_$1944_value = (if ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error})) (if((var_delayPeriod$1988_error == null)) {var_delayPeriod$1988_value} else {throw var_delayPeriod$1988_error}) else (if((var_delayPeriod$1949_error == null)) {var_delayPeriod$1949_value} else {throw var_delayPeriod$1949_error}))
} catch {
case var_err : Throwable => {
var_$1944_error = var_err
}
}
}
var_$1944_init = true
var_$1944_ts = currTs
var_$1944_changed = true
}
}
var_$1983_changed = false
}
def chunk2() = {
if ((var_$1944_changed)) {
var_$1983_value = var_$1944_ts
var_$1983_init = true
var_$1983_unknown = var_$1944_unknown
if ((var_$1983_unknown)) {
var_$1983_error = var_$1944_error
} else {
var_$1983_error = null
}
var_$1983_changed = true
}
var_value$1879_changed = false
if ((var_burstConstraintReset$1617_init)) {
if ((var_burstConstraintReset$1617_changed)) {
var_value$1879_unknown = (var_burstConstraintReset$1617_unknown)
if ((var_value$1879_unknown)) {
var_value$1879_error = UnknownEventError(null)
} else {
var_value$1879_error = null
try {
var_value$1879_value = var_$1845.apply((if((var_burstConstraintReset$1617_error == null)) {var_burstConstraintReset$1617_value} else {throw var_burstConstraintReset$1617_error}))
} catch {
case var_err : Throwable => {
var_value$1879_error = var_err
}
}
}
var_value$1879_init = true
var_value$1879_changed = true
}
}
var_$1943_changed = false
if ((var_$1944_init && var_$1765_init)) {
if ((var_$1944_changed) || (var_$1765_changed)) {
var_$1943_unknown = (var_$1944_unknown && var_$1765_unknown)
if ((var_$1943_unknown)) {
var_$1943_error = UnknownEventError(null)
} else {
var_$1943_error = null
try {
var_$1943_value = ((if((var_$1944_error == null)) {var_$1944_value} else {throw var_$1944_error}) > (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
} catch {
case var_err : Throwable => {
var_$1943_error = var_err
}
}
}
var_$1943_init = true
var_$1943_changed = true
}
}
var_$1980_changed = false
if ((var_$1704_init && var_$1983_init)) {
if ((var_$1704_changed) || (var_$1983_changed)) {
var_$1980_unknown = (var_$1704_unknown && var_$1983_unknown)
if ((var_$1980_unknown)) {
var_$1980_error = UnknownEventError(null)
} else {
var_$1980_error = null
try {
var_$1980_value = ((if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}) - (if((var_$1983_error == null)) {var_$1983_value} else {throw var_$1983_error}))
} catch {
case var_err : Throwable => {
var_$1980_error = var_err
}
}
}
var_$1980_init = true
var_$1980_changed = true
}
}
var_$1883_changed = false
if ((var_$1943_init && var_$1944_init && var_$1980_init)) {
if ((var_$1943_changed) || (var_$1944_changed) || (var_$1980_changed)) {
var_$1883_unknown = (var_$1943_unknown && var_$1944_unknown && var_$1980_unknown)
if ((var_$1883_unknown)) {
var_$1883_error = UnknownEventError(null)
} else {
var_$1883_error = null
try {
var_$1883_value = (if ((if((var_$1943_error == null)) {var_$1943_value} else {throw var_$1943_error})) (if((var_$1944_error == null)) {var_$1944_value} else {throw var_$1944_error}) else (if((var_$1980_error == null)) {var_$1980_value} else {throw var_$1980_error}))
} catch {
case var_err : Throwable => {
var_$1883_error = var_err
}
}
}
var_$1883_changed = true
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

if (((var_safeDelay$1808_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1808_nextTs))) {
currTs = var_safeDelay$1808_nextTs
}
if (((var_safeDelay$1679_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1679_nextTs))) {
currTs = var_safeDelay$1679_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

chunk1()
chunk2()


if ((var_event_unknown) || (!(var_$1892_error == null)) || (var_$1892_changed && (0L >= var_$1892_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1892_changed)) {
if ((var_safeDelay$1808_changed) || (var_event_changed)) {
var_safeDelay$1808_nextTs = (currTs + var_$1892_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1808_nextTs = -1L
}
}
}
if ((var_event_unknown) || (!(var_$1883_error == null)) || (var_$1883_changed && (0L >= var_$1883_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1883_changed)) {
if ((var_safeDelay$1679_changed) || (var_event_changed)) {
var_safeDelay$1679_nextTs = (currTs + var_$1883_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1679_nextTs = -1L
}
}
}
if ((var_final$1616_changed && var_final$1616_init)) {
out_final.apply(var_final$1616_value, currTs, "final", var_final$1616_error)
}
if ((var_value$1879_changed && var_value$1879_init)) {
out_value.apply(var_value$1879_value, currTs, "value", var_value$1879_error)
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
