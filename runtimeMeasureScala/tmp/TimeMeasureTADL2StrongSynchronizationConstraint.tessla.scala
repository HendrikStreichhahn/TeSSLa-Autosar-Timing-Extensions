//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_$1794 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1903 : (Boolean, Boolean)) => {
val var_$1904 : Boolean = var_$1903._2
var_$1904
})
val var_head$1774 : scala.Function1[List[Any], Any] = ((var_list$1896 : List[Any]) => {
val var_$1897 : Any = var_list$1896(0L.asInstanceOf[Int])
var_$1897
})
var var_removeOldClusters$1741 : scala.Function2[List[(Map[Long, Boolean], Long)], Long, List[(Map[Long, Boolean], Long)]] = null
var var_insertEvent$1882 : scala.Function3[List[(Map[Long, Boolean], Long)], Long, Long, List[(Map[Long, Boolean], Long)]] = null
val var_$1743 : scala.Function2[ErrorOption[Boolean], ErrorOption[List[(Map[Long, Boolean], Long)]], ErrorOption[List[(Map[Long, Boolean], Long)]]] = ((var_trig$1869 : ErrorOption[Boolean], var_str$1870 : ErrorOption[List[(Map[Long, Boolean], Long)]]) => {
val var_$1871 : ErrorOption[List[(Map[Long, Boolean], Long)]] = (if (var_trig$1869.isEmpty) EONone() else var_str$1870)
var_$1871
})
var var_insertEventsList$1758 : scala.Function3[List[(Map[Long, Boolean], Long)], List[Long], Long, List[(Map[Long, Boolean], Long)]] = null
val var_$1913 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1977 : (Boolean, Boolean)) => {
val var_$1978 : Boolean = var_$1977._1
var_$1978
})
var var_mapAllTrueRec$1948 : scala.Function2[Map[Long, Boolean], List[Long], Boolean] = null
val var_mapAllTrue$1892 : scala.Function1[Map[Long, Boolean], Boolean] = ((var_aMap$1946 : Map[Long, Boolean]) => {
var var_$1947 : Boolean = false
var_$1947 = var_mapAllTrueRec$1948.apply(var_aMap$1946, var_aMap$1946.keys.toList)
var_$1947
})
var var_removeFulfilledClusters$1759 : scala.Function1[List[(Map[Long, Boolean], Long)], List[(Map[Long, Boolean], Long)]] = null
val var_$1775 : scala.Function1[(Map[Long, Boolean], Long), Long] = ((var_$1898 : (Map[Long, Boolean], Long)) => {
val var_$1899 : Long = var_$1898._2
var_$1899
})
val var_$1717 : List[Long] = (1L +: List[Long]())
val var_$1720 : List[Long] = List[Long]()
val var_$1762 : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
val var_$1787 : (Boolean, Boolean) = (false, false)
val var_$1825 : (Boolean, Boolean) = (true, false)
val var_$1767 : (Boolean, Boolean) = (false, true)
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_event0_error : Throwable = null
val var_event0_unknown : Boolean = false
var set_var_event0 : scala.Function2[Long, Long, Unit] = null
var var_event0_ts : Long = 0L
var var_event0_changed : Boolean = false
val var_event1_error : Throwable = null
val var_event1_unknown : Boolean = false
var set_var_event1 : scala.Function2[Long, Long, Unit] = null
var var_event1_ts : Long = 0L
var var_event1_changed : Boolean = false
val var_event2_error : Throwable = null
val var_event2_unknown : Boolean = false
var set_var_event2 : scala.Function2[Long, Long, Unit] = null
var var_event2_ts : Long = 0L
var var_event2_changed : Boolean = false

var_removeOldClusters$1741 = ((var_activeClusters$1854 : List[(Map[Long, Boolean], Long)], var_latestAllowedTime$1855 : Long) => {
lazy val var_$1863 : List[(Map[Long, Boolean], Long)] = var_removeOldClusters$1741.apply(var_activeClusters$1854.tail, var_latestAllowedTime$1855)
lazy val var_$1866 : (Map[Long, Boolean], Long) = (var_head$1774.apply((var_activeClusters$1854).asInstanceOf[List[Any]])).asInstanceOf[(Map[Long, Boolean], Long)]
val var_$1856 : List[(Map[Long, Boolean], Long)] = (if ((var_activeClusters$1854.size == 0L)) var_activeClusters$1854 else (if ((var_$1866._2 < var_latestAllowedTime$1855)) var_$1863 else (var_$1866 +: var_$1863)))
var_$1856
})
var_insertEvent$1882 = ((var_activeClusters$1915 : List[(Map[Long, Boolean], Long)], var_eventIndex$1916 : Long, var_timeNow$1917 : Long) => {
lazy val var_$1944 : (Map[Long, Boolean], Long) = (var_head$1774.apply((var_activeClusters$1915).asInstanceOf[List[Any]])).asInstanceOf[(Map[Long, Boolean], Long)]
lazy val var_$1934 : Long = var_$1944._2
lazy val var_$1931 : Map[Long, Boolean] = var_$1944._1
lazy val var_$1945 : List[(Map[Long, Boolean], Long)] = var_activeClusters$1915.tail
var var_$1918 : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var_$1918 = (if ((var_activeClusters$1915.size == 0L)) (var_activeClusters$1915 :+ (((((Map[Long, Boolean]() + ((3L) -> (false))) + ((2L) -> (false))) + ((1L) -> (false))) + ((var_eventIndex$1916) -> (true))), var_timeNow$1917)) else (if ((var_$1931(var_eventIndex$1916) || ((var_$1934 + 5L) < var_timeNow$1917))) (var_$1944 +: var_insertEvent$1882.apply(var_$1945, var_eventIndex$1916, var_timeNow$1917)) else (((var_$1931 + ((var_eventIndex$1916) -> (true))), var_$1934) +: var_$1945)))
var_$1918
})
var_insertEventsList$1758 = ((var_activeClusters$1874 : List[(Map[Long, Boolean], Long)], var_eventIndices$1875 : List[Long], var_timeNow$1876 : Long) => {
var var_$1877 : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var_$1877 = (if ((var_eventIndices$1875.size == 0L)) var_activeClusters$1874 else var_insertEventsList$1758.apply(var_insertEvent$1882.apply(var_activeClusters$1874, (var_head$1774.apply((var_eventIndices$1875).asInstanceOf[List[Any]])).asInstanceOf[Long], var_timeNow$1876), var_eventIndices$1875.tail, var_timeNow$1876))
var_$1877
})
var_mapAllTrueRec$1948 = ((var_aMap$1980 : Map[Long, Boolean], var_keys$1981 : List[Long]) => {
var var_$1982 : Boolean = false
var_$1982 = (if (((var_aMap$1980.size == 0L) || (var_keys$1981.size == 0L))) true else (var_aMap$1980((var_head$1774.apply((var_keys$1981).asInstanceOf[List[Any]])).asInstanceOf[Long]) && var_mapAllTrueRec$1948.apply(var_aMap$1980, var_keys$1981.tail)))
var_$1982
})
var_removeFulfilledClusters$1759 = ((var_activeClusters$1885 : List[(Map[Long, Boolean], Long)]) => {
var var_$1886 : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var_$1886 = (if (((var_activeClusters$1885.size != 0L) && var_mapAllTrue$1892.apply((var_head$1774.apply((var_activeClusters$1885).asInstanceOf[List[Any]])).asInstanceOf[(Map[Long, Boolean], Long)]._1))) var_removeFulfilledClusters$1759.apply(var_activeClusters$1885.tail) else var_activeClusters$1885)
var_$1886
})
out_final = null
out_value = null
set_var_event0 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_event0_changed))) {
var_event0_ts = ts
var_event0_changed = true
}
})
set_var_event1 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_event1_changed))) {
var_event1_ts = ts
var_event1_changed = true
}
})
set_var_event2 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_event2_changed))) {
var_event2_ts = ts
var_event2_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1697_changed : Boolean = false
var var_$1697_value : Long = 0L
var var_$1697_unknown : Boolean = false
var var_$1697_error : Throwable = null
var var_defaultTime$1694_changed : Boolean = true
var var_defaultTime$1694_value : Long = -1L
var var_defaultTime$1694_init : Boolean = true
var var_defaultTime$1694_error : Throwable = null
var var_defaultTime$1694_unknown : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_value : Long = 0L
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1700_changed : Boolean = false
var var_$1700_value : Long = 0L
var var_$1700_unknown : Boolean = false
var var_$1700_error : Throwable = null
var var_$1698_changed : Boolean = false
var var_$1698_unknown : Boolean = false
var var_$1698_value : Long = 0L
var var_$1698_error : Throwable = null
var var_timeNow$1696_changed : Boolean = false
var var_timeNow$1696_init : Boolean = false
var var_timeNow$1696_unknown : Boolean = false
var var_timeNow$1696_value : Long = 0L
var var_timeNow$1696_error : Throwable = null
var var_$1693_changed : Boolean = false
var var_$1693_unknown : Boolean = false
var var_$1693_error : Throwable = null
var var_$1693_value : Boolean = false
var var_$1693_init : Boolean = false
val var_$1838_value : Long = 0L
val var_$1838_error : Throwable = null
val var_$1838_changed : Boolean = false
val var_$1838_unknown : Boolean = false
var var_$1702_changed : Boolean = true
var var_$1702_value : Long = 3L
var var_$1702_init : Boolean = true
var var_$1702_error : Throwable = null
var var_$1702_unknown : Boolean = false
var var_defaultTime$1706_changed : Boolean = true
var var_defaultTime$1706_value : Long = -1L
var var_defaultTime$1706_init : Boolean = true
var var_defaultTime$1706_error : Throwable = null
var var_defaultTime$1706_unknown : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : Boolean = false
var var_$1705_init : Boolean = false
var var_$1709_changed : Boolean = true
var var_$1709_value : Long = 2L
var var_$1709_init : Boolean = true
var var_$1709_error : Throwable = null
var var_$1709_unknown : Boolean = false
var var_defaultTime$1713_changed : Boolean = true
var var_defaultTime$1713_value : Long = -1L
var var_defaultTime$1713_init : Boolean = true
var var_defaultTime$1713_error : Throwable = null
var var_defaultTime$1713_unknown : Boolean = false
var var_$1712_changed : Boolean = false
var var_$1712_unknown : Boolean = false
var var_$1712_error : Throwable = null
var var_$1712_value : Boolean = false
var var_$1712_init : Boolean = false
val var_$1719_value : List[Long] = List[Long]()
val var_$1719_error : Throwable = null
val var_$1719_changed : Boolean = false
val var_$1719_unknown : Boolean = false
var var_$1715_changed : Boolean = true
var var_$1715_value : List[Long] = var_$1717
var var_$1715_init : Boolean = true
var var_$1715_error : Throwable = null
var var_$1715_unknown : Boolean = false
var var_$1718_changed : Boolean = true
var var_$1718_value : List[Long] = var_$1720
var var_$1718_init : Boolean = true
var var_$1718_error : Throwable = null
var var_$1718_unknown : Boolean = false
var var_eventList0$1711_changed : Boolean = false
var var_eventList0$1711_unknown : Boolean = false
var var_eventList0$1711_error : Throwable = null
var var_eventList0$1711_value : List[Long] = List[Long]()
var var_eventList0$1711_init : Boolean = false
var var_$1708_changed : Boolean = false
var var_$1708_unknown : Boolean = false
var var_$1708_error : Throwable = null
var var_$1708_value : List[Long] = List[Long]()
var var_$1708_init : Boolean = false
var var_eventList1$1704_changed : Boolean = false
var var_eventList1$1704_unknown : Boolean = false
var var_eventList1$1704_error : Throwable = null
var var_eventList1$1704_value : List[Long] = List[Long]()
var var_eventList1$1704_init : Boolean = false
var var_$1701_changed : Boolean = false
var var_$1701_unknown : Boolean = false
var var_$1701_error : Throwable = null
var var_$1701_value : List[Long] = List[Long]()
var var_$1701_init : Boolean = false
var var_eventList2$1692_changed : Boolean = false
var var_eventList2$1692_unknown : Boolean = false
var var_eventList2$1692_error : Throwable = null
var var_eventList2$1692_value : List[Long] = List[Long]()
var var_eventList2$1692_init : Boolean = false
var var_eventList2$1692_ts : Long = 0L
var var_$1853_changed : Boolean = false
var var_$1853_lastValue : Boolean = false
var var_$1853_lastInit : Boolean = false
var var_$1853_lastError : Throwable = null
var var_$1853_ts : Long = 0L
var var_$1853_init : Boolean = false
var var_$1853_unknown : Boolean = false
var var_$1853_error : Throwable = null
var var_$1853_value : Boolean = false
var var_$1852_changed : Boolean = false
var var_$1852_init : Boolean = false
var var_$1852_unknown : Boolean = false
var var_$1852_error : Throwable = null
var var_$1852_value : Boolean = false
var var_$1851_changed : Boolean = false
var var_$1851_unknown : Boolean = false
var var_$1851_error : Throwable = null
var var_$1851_value : Boolean = false
var var_$1851_init : Boolean = false
var var_failingTimeStamps$1689_unknown : Boolean = false
var var_failingTimeStamps$1689_error : Throwable = null
var var_failingTimeStamps$1689_value : Boolean = false
var var_failingTimeStamps$1689_init : Boolean = false
var var_failingTimeStamps$1688_changed : Boolean = false
var var_failingTimeStamps$1688_init : Boolean = false
var var_failingTimeStamps$1688_error : Throwable = null
var var_failingTimeStamps$1688_unknown : Boolean = false
var var_$1832_changed : Boolean = false
var var_$1832_error : Throwable = null
var var_$1832_init : Boolean = false
var var_$1832_unknown : Boolean = false
var var_$1724_changed : Boolean = false
val var_$1724_value : Boolean = true
var var_$1724_ts : Long = 0L
val var_$1724_error : Throwable = null
var var_$1724_unknown : Boolean = false
var var_$1737_changed : Boolean = false
var var_$1737_value : Long = 0L
var var_$1737_init : Boolean = false
var var_$1737_unknown : Boolean = false
var var_$1737_error : Throwable = null
var var_defaultTime$1683_changed : Boolean = true
var var_defaultTime$1683_value : Long = -1L
var var_defaultTime$1683_init : Boolean = true
var var_defaultTime$1683_error : Throwable = null
var var_defaultTime$1683_unknown : Boolean = false
var var_$1834_changed : Boolean = false
var var_$1834_lastValue : Long = 0L
var var_$1834_lastInit : Boolean = false
var var_$1834_lastError : Throwable = null
var var_$1834_value : Long = 0L
var var_$1834_init : Boolean = false
var var_$1834_ts : Long = 0L
var var_$1834_unknown : Boolean = false
var var_$1834_error : Throwable = null
var var_defaultTime$1690_changed : Boolean = true
var var_defaultTime$1690_value : Long = -1L
var var_defaultTime$1690_init : Boolean = true
var var_defaultTime$1690_error : Throwable = null
var var_defaultTime$1690_unknown : Boolean = false
var var_$1682_changed : Boolean = false
var var_$1682_unknown : Boolean = false
var var_$1682_error : Throwable = null
var var_$1682_value : Boolean = false
var var_$1682_init : Boolean = false
var var_$1969_changed : Boolean = true
var var_$1969_value : Long = -1L
var var_$1969_init : Boolean = true
var var_$1969_error : Throwable = null
var var_$1969_unknown : Boolean = false
var var_$1721_changed : Boolean = false
var var_$1721_unknown : Boolean = false
var var_$1721_error : Throwable = null
var var_$1721_value : Boolean = false
var var_$1721_init : Boolean = false
var var_$1681_changed : Boolean = false
var var_$1681_unknown : Boolean = false
var var_$1681_error : Throwable = null
var var_$1681_value : Boolean = false
var var_$1681_init : Boolean = false
var var_$1733_changed : Boolean = false
var var_$1733_init : Boolean = false
var var_$1733_unknown : Boolean = false
var var_$1733_error : Throwable = null
var var_$1733_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1776_changed : Boolean = true
var var_$1776_value : Long = 5L
var var_$1776_init : Boolean = true
var var_$1776_error : Throwable = null
var var_$1776_unknown : Boolean = false
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Long = 0L
var var_$1736_init : Boolean = false
var var_$1732_changed : Boolean = false
var var_$1732_lastValue : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1732_lastInit : Boolean = false
var var_$1732_lastError : Throwable = null
var var_$1732_unknown : Boolean = false
var var_$1732_error : Throwable = null
var var_$1732_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1732_init : Boolean = false
var var_$1732_ts : Long = 0L
var var_mergedStream$1742_changed : Boolean = false
var var_mergedStream$1742_unknown : Boolean = false
var var_mergedStream$1742_error : Throwable = null
var var_mergedStream$1742_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1731_changed : Boolean = false
var var_$1731_unknown : Boolean = false
var var_$1731_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1731_error : Throwable = null
var var_on$1729_changed : Boolean = false
var var_on$1729_error : Throwable = null
var var_on$1729_unknown : Boolean = false
var var_on$1729_fval : ErrorOption[List[(Map[Long, Boolean], Long)]] = null
var var_on$1729_newValue : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_on$1729_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1747_changed : Boolean = false
var var_$1747_error : Throwable = null
var var_$1747_unknown : Boolean = false
var var_mergeUnit2$1746_changed : Boolean = false
var var_mergeUnit2$1746_unknown : Boolean = false
var var_mergeUnit2$1746_error : Throwable = null
var var_$1744_changed : Boolean = false
var var_$1744_unknown : Boolean = false
var var_$1744_error : Throwable = null
var var_$1744_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_activeClustersResetted$1728_changed : Boolean = false
var var_activeClustersResetted$1728_unknown : Boolean = false
var var_activeClustersResetted$1728_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_activeClustersResetted$1728_error : Throwable = null
val var_$1761_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
val var_$1761_error : Throwable = null
val var_$1761_changed : Boolean = false
val var_$1761_unknown : Boolean = false
var var_activeClustersResetted$1752_changed : Boolean = true
var var_activeClustersResetted$1752_value : List[(Map[Long, Boolean], Long)] = var_$1762
var var_activeClustersResetted$1752_error : Throwable = null
var var_activeClustersResetted$1752_unknown : Boolean = false
var var_$1727_changed : Boolean = false
var var_$1727_init : Boolean = false
var var_$1727_unknown : Boolean = false
var var_$1727_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1727_error : Throwable = null
var var_$1755_changed : Boolean = false
var var_$1755_unknown : Boolean = false
var var_$1755_error : Throwable = null
var var_$1755_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1755_init : Boolean = false
var var_$1680_changed : Boolean = false
var var_$1680_unknown : Boolean = false
var var_$1680_error : Throwable = null
var var_$1680_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1680_init : Boolean = false
var var_activeClustersState$1679_changed : Boolean = false
var var_activeClustersState$1679_unknown : Boolean = false
var var_activeClustersState$1679_error : Throwable = null
var var_activeClustersState$1679_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1745_changed : Boolean = false
var var_$1745_lastValue : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1745_lastInit : Boolean = false
var var_$1745_lastError : Throwable = null
var var_$1745_init : Boolean = false
var var_$1745_ts : Long = 0L
var var_$1745_unknown : Boolean = false
var var_$1745_value : List[(Map[Long, Boolean], Long)] = List[(Map[Long, Boolean], Long)]()
var var_$1745_error : Throwable = null
var var_$1772_changed : Boolean = false
var var_$1772_unknown : Boolean = false
var var_$1772_error : Throwable = null
var var_$1772_value : (Map[Long, Boolean], Long) = (Map[Long, Boolean](), 0L)
var var_$1772_init : Boolean = false
var var_$1771_changed : Boolean = false
var var_$1771_unknown : Boolean = false
var var_$1771_error : Throwable = null
var var_$1771_value : Long = 0L
var var_$1771_init : Boolean = false
var var_$1770_changed : Boolean = false
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1770_value : Long = 0L
var var_$1770_init : Boolean = false
var var_safeDelay$1784_changed : Boolean = false
val var_safeDelay$1784_error : Throwable = null
var var_safeDelay$1784_unknown : Boolean = false
var var_$1782_changed : Boolean = false
var var_$1782_error : Throwable = null
var var_$1782_unknown : Boolean = false
var var_mergeUnit2$1779_changed : Boolean = false
var var_mergeUnit2$1779_ts : Long = 0L
var var_mergeUnit2$1779_unknown : Boolean = false
var var_mergeUnit2$1779_error : Throwable = null
var var_$1778_changed : Boolean = false
var var_$1778_value : Long = 0L
var var_$1778_init : Boolean = false
var var_$1778_unknown : Boolean = false
var var_$1778_error : Throwable = null
var var_$1769_changed : Boolean = false
var var_$1769_unknown : Boolean = false
var var_$1769_error : Throwable = null
var var_$1769_value : Boolean = false
var var_$1769_init : Boolean = false
val var_$1824_value : (Boolean, Boolean) = (false, false)
val var_$1824_error : Throwable = null
val var_$1824_changed : Boolean = false
val var_$1824_unknown : Boolean = false
var var_$1785_changed : Boolean = true
var var_$1785_value : (Boolean, Boolean) = var_$1787
var var_$1785_init : Boolean = true
var var_$1785_error : Throwable = null
var var_$1785_unknown : Boolean = false
var var_$1788_changed : Boolean = true
var var_$1788_value : (Boolean, Boolean) = var_$1825
var var_$1788_init : Boolean = true
var var_$1788_error : Throwable = null
var var_$1788_unknown : Boolean = false
var var_$1768_changed : Boolean = false
var var_$1768_unknown : Boolean = false
var var_$1768_error : Throwable = null
var var_$1768_value : (Boolean, Boolean) = (false, false)
var var_$1768_init : Boolean = false
var var_$1765_changed : Boolean = true
var var_$1765_value : (Boolean, Boolean) = var_$1767
var var_$1765_init : Boolean = true
var var_$1765_error : Throwable = null
var var_$1765_unknown : Boolean = false
var var_$1677_changed : Boolean = false
var var_$1677_unknown : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_value : Long = 0L
var var_$1677_init : Boolean = false
var var_$1763_changed : Boolean = true
var var_$1763_value : Long = 0L
var var_$1763_init : Boolean = true
var var_$1763_error : Throwable = null
var var_$1763_unknown : Boolean = false
var var_$1676_changed : Boolean = false
var var_$1676_unknown : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_value : Boolean = false
var var_$1676_init : Boolean = false
var var_result$1675_changed : Boolean = false
var var_result$1675_unknown : Boolean = false
var var_result$1675_error : Throwable = null
var var_result$1675_value : (Boolean, Boolean) = (false, false)
var var_result$1675_init : Boolean = false
var var_result$1675_ts : Long = 0L
var var_$1674_changed : Boolean = false
var var_$1674_unknown : Boolean = false
var var_$1674_error : Throwable = null
var var_$1674_value : Boolean = false
var var_$1674_init : Boolean = false
var var_$1808_changed : Boolean = false
var var_$1808_unknown : Boolean = false
var var_$1808_error : Throwable = null
var var_$1808_value : Boolean = false
var var_$1808_init : Boolean = false
var var_$1792_changed : Boolean = false
var var_$1792_unknown : Boolean = false
var var_$1792_error : Throwable = null
var var_$1792_value : Boolean = false
var var_$1792_init : Boolean = false
var var_$1673_changed : Boolean = false
var var_$1673_unknown : Boolean = false
var var_$1673_error : Throwable = null
var var_$1673_value : Boolean = false
var var_$1673_init : Boolean = false
var var_$1799_changed : Boolean = false
var var_$1799_init : Boolean = false
var var_$1799_unknown : Boolean = false
var var_$1799_error : Throwable = null
var var_$1799_value : Boolean = false
val var_$1806_value : Boolean = false
val var_$1806_error : Throwable = null
val var_$1806_changed : Boolean = false
val var_$1806_unknown : Boolean = false
var var_$1805_changed : Boolean = true
var var_$1805_value : Boolean = true
var var_$1805_init : Boolean = true
var var_$1805_error : Throwable = null
var var_$1805_unknown : Boolean = false
var var_$1802_changed : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1802_value : Boolean = false
var var_$1802_init : Boolean = false
var var_$1810_changed : Boolean = true
var var_$1810_value : Boolean = false
var var_$1810_init : Boolean = true
var var_$1810_error : Throwable = null
var var_$1810_unknown : Boolean = false
var var_$1807_changed : Boolean = false
var var_$1807_unknown : Boolean = false
var var_$1807_error : Throwable = null
var var_$1807_value : Boolean = false
var var_$1807_init : Boolean = false
var var_$1801_changed : Boolean = false
var var_$1801_unknown : Boolean = false
var var_$1801_error : Throwable = null
var var_$1801_value : Boolean = false
var var_$1801_init : Boolean = false
var var_isFinalFalse$1798_changed : Boolean = false
var var_isFinalFalse$1798_unknown : Boolean = false
var var_isFinalFalse$1798_error : Throwable = null
var var_isFinalFalse$1798_value : Boolean = false
var var_isFinalFalseReset$1822_changed : Boolean = true
var var_isFinalFalseReset$1822_lastValue : Boolean = false
var var_isFinalFalseReset$1822_lastInit : Boolean = false
var var_isFinalFalseReset$1822_lastError : Throwable = null
var var_isFinalFalseReset$1822_value : Boolean = false
var var_isFinalFalseReset$1822_init : Boolean = true
var var_isFinalFalseReset$1822_ts : Long = 0L
var var_isFinalFalseReset$1822_error : Throwable = null
var var_isFinalFalseReset$1822_unknown : Boolean = false
var var_prev$1796_changed : Boolean = false
var var_prev$1796_init : Boolean = false
var var_prev$1796_unknown : Boolean = false
var var_prev$1796_error : Throwable = null
var var_prev$1796_value : Boolean = false
var var_$1795_changed : Boolean = false
var var_$1795_unknown : Boolean = false
var var_$1795_error : Throwable = null
var var_$1795_value : Boolean = false
var var_$1795_init : Boolean = false
var var_$1672_changed : Boolean = false
var var_$1672_unknown : Boolean = false
var var_$1672_error : Throwable = null
var var_$1672_value : Boolean = false
var var_$1672_init : Boolean = false
var var_$1818_changed : Boolean = false
var var_$1818_value : Long = 0L
var var_$1818_init : Boolean = false
var var_$1818_unknown : Boolean = false
var var_$1818_error : Throwable = null
var var_$1813_changed : Boolean = false
var var_$1813_init : Boolean = false
var var_$1813_unknown : Boolean = false
var var_$1813_error : Throwable = null
var var_$1813_value : Long = 0L
var var_finalFalseSince$1671_changed : Boolean = false
var var_finalFalseSince$1671_unknown : Boolean = false
var var_finalFalseSince$1671_error : Throwable = null
var var_finalFalseSince$1671_value : Long = 0L
var var_$1670_changed : Boolean = true
var var_$1670_lastValue : Long = 0L
var var_$1670_lastInit : Boolean = false
var var_$1670_lastError : Throwable = null
var var_$1670_value : Long = 9223372036854775807L
var var_$1670_init : Boolean = true
var var_$1670_ts : Long = 0L
var var_$1670_error : Throwable = null
var var_$1670_unknown : Boolean = false
var var_$1974_changed : Boolean = true
var var_$1974_value : Long = 9223372036854775807L
var var_$1974_init : Boolean = true
var var_$1974_error : Throwable = null
var var_$1974_unknown : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_$1952_changed : Boolean = false
var var_$1952_unknown : Boolean = false
var var_$1952_error : Throwable = null
var var_$1952_value : Boolean = false
var var_$1952_init : Boolean = false
var var_$1958_changed : Boolean = false
var var_$1958_unknown : Boolean = false
var var_$1958_error : Throwable = null
var var_$1958_value : Long = 0L
var var_$1958_init : Boolean = false
var var_$1967_changed : Boolean = true
var var_$1967_value : Long = 1L
var var_$1967_init : Boolean = true
var var_$1967_error : Throwable = null
var var_$1967_unknown : Boolean = false
var var_$1957_changed : Boolean = false
var var_$1957_unknown : Boolean = false
var var_$1957_error : Throwable = null
var var_$1957_value : Long = 0L
var var_$1957_init : Boolean = false
var var_$1951_changed : Boolean = false
var var_$1951_unknown : Boolean = false
var var_$1951_error : Throwable = null
var var_$1951_value : Long = 0L
var var_$1951_init : Boolean = false
var var_$1951_ts : Long = 0L
var var_$1976_changed : Boolean = false
var var_$1976_value : Long = 0L
var var_$1976_init : Boolean = false
var var_$1976_unknown : Boolean = false
var var_$1976_error : Throwable = null
var var_$1973_changed : Boolean = false
var var_$1973_unknown : Boolean = false
var var_$1973_error : Throwable = null
var var_$1973_value : Long = 0L
var var_$1973_init : Boolean = false
var var_$1668_changed : Boolean = false
var var_$1668_unknown : Boolean = false
var var_$1668_error : Throwable = null
var var_$1668_value : Boolean = false
var var_$1668_init : Boolean = false
var var_isFinalFalseReset$1667_changed : Boolean = false
var var_isFinalFalseReset$1667_unknown : Boolean = false
var var_isFinalFalseReset$1667_error : Throwable = null
var var_isFinalFalseReset$1667_value : Boolean = false
var var_$1666_changed : Boolean = false
var var_$1666_lastValue : Boolean = false
var var_$1666_lastInit : Boolean = false
var var_$1666_lastError : Throwable = null
var var_$1666_init : Boolean = false
var var_$1666_ts : Long = 0L
var var_$1666_unknown : Boolean = false
var var_$1666_value : Boolean = false
var var_$1666_error : Throwable = null
var var_stillFulfillableReset$1665_changed : Boolean = false
var var_stillFulfillableReset$1665_unknown : Boolean = false
var var_stillFulfillableReset$1665_error : Throwable = null
var var_stillFulfillableReset$1665_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1665_init : Boolean = false
var var_$1850_changed : Boolean = false
var var_$1850_lastValue : Boolean = false
var var_$1850_lastInit : Boolean = false
var var_$1850_lastError : Throwable = null
var var_$1850_unknown : Boolean = false
var var_$1850_error : Throwable = null
var var_$1850_value : Boolean = false
var var_$1850_init : Boolean = false
var var_$1850_ts : Long = 0L
var var_$1840_changed : Boolean = false
var var_$1840_value : Long = 0L
var var_$1840_init : Boolean = false
var var_$1840_error : Throwable = null
var var_$1840_unknown : Boolean = false
var var_prev$1844_changed : Boolean = false
var var_prev$1844_init : Boolean = false
var var_prev$1844_unknown : Boolean = false
var var_prev$1844_error : Throwable = null
var var_prev$1844_value : Long = 0L
var var_$1833_changed : Boolean = false
var var_$1833_unknown : Boolean = false
var var_$1833_error : Throwable = null
var var_$1833_value : Long = 0L
var var_$1833_init : Boolean = false
var var_$1839_changed : Boolean = false
var var_$1839_unknown : Boolean = false
var var_$1839_error : Throwable = null
var var_$1839_value : Long = 0L
var var_$1839_init : Boolean = false
var var_$1829_changed : Boolean = false
var var_$1829_unknown : Boolean = false
var var_$1829_error : Throwable = null
var var_$1829_value : Boolean = false
var var_$1829_init : Boolean = false
var var_resets$1686_changed : Boolean = false
var var_resets$1686_unknown : Boolean = false
var var_resets$1686_error : Throwable = null
var var_resets$1686_value : Long = 0L
var var_$1950_changed : Boolean = false
var var_$1950_unknown : Boolean = false
var var_$1950_error : Throwable = null
var var_$1950_value : Boolean = false
var var_$1950_init : Boolean = false
var var_$1900_changed : Boolean = false
var var_$1900_unknown : Boolean = false
var var_$1900_error : Throwable = null
var var_$1900_value : Long = 0L
var var_value$1827_changed : Boolean = false
var var_value$1827_unknown : Boolean = false
var var_value$1827_error : Throwable = null
var var_value$1827_value : Boolean = false
var var_value$1827_init : Boolean = false
var var_$1724_nextTs : Long = -1L
var var_safeDelay$1784_nextTs : Long = -1L



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

if (((var_$1724_nextTs > lastProcessedTs) && (currTs > var_$1724_nextTs))) {
currTs = var_$1724_nextTs
}
if (((var_safeDelay$1784_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1784_nextTs))) {
currTs = var_safeDelay$1784_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1697_changed = false
if ((var_event2_changed)) {
var_$1697_value = var_event2_ts
var_$1697_unknown = var_event2_unknown
if ((var_$1697_unknown)) {
var_$1697_error = var_event2_error
} else {
var_$1697_error = null
}
var_$1697_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1694_changed = false
}
if ((var_$1697_changed)) {
var_defaultTime$1694_value = var_$1697_value
var_defaultTime$1694_init = true
var_defaultTime$1694_error = var_$1697_error
var_defaultTime$1694_changed = true
var_defaultTime$1694_unknown = var_$1697_unknown
}
var_$1707_changed = false
if ((var_event1_changed)) {
var_$1707_value = var_event1_ts
var_$1707_unknown = var_event1_unknown
if ((var_$1707_unknown)) {
var_$1707_error = var_event1_error
} else {
var_$1707_error = null
}
var_$1707_changed = true
}
var_$1700_changed = false
if ((var_event0_changed)) {
var_$1700_value = var_event0_ts
var_$1700_unknown = var_event0_unknown
if ((var_$1700_unknown)) {
var_$1700_error = var_event0_error
} else {
var_$1700_error = null
}
var_$1700_changed = true
}
var_$1698_changed = false
if ((var_$1707_changed) || (var_$1700_changed)) {
var_$1698_changed = true
var_$1698_unknown = (var_$1707_unknown && var_$1700_unknown)
if ((var_$1707_changed)) {
var_$1698_value = var_$1707_value
var_$1698_error = var_$1707_error
} else {
if ((var_$1700_changed)) {
var_$1698_value = var_$1700_value
var_$1698_error = var_$1700_error
}
}
}
var_timeNow$1696_changed = false
if ((var_$1697_changed) || (var_$1698_changed)) {
var_timeNow$1696_init = true
var_timeNow$1696_changed = true
var_timeNow$1696_unknown = (var_$1697_unknown && var_$1698_unknown)
if ((var_$1697_changed)) {
var_timeNow$1696_value = var_$1697_value
var_timeNow$1696_error = var_$1697_error
} else {
if ((var_$1698_changed)) {
var_timeNow$1696_value = var_$1698_value
var_timeNow$1696_error = var_$1698_error
}
}
}
var_$1693_changed = false
if ((var_defaultTime$1694_init && var_timeNow$1696_init)) {
if ((var_defaultTime$1694_changed) || (var_timeNow$1696_changed)) {
var_$1693_unknown = (var_defaultTime$1694_unknown && var_timeNow$1696_unknown)
if ((var_$1693_unknown)) {
var_$1693_error = UnknownEventError(null)
} else {
var_$1693_error = null
try {
var_$1693_value = ((if((var_defaultTime$1694_error == null)) {var_defaultTime$1694_value} else {throw var_defaultTime$1694_error}) >= (if((var_timeNow$1696_error == null)) {var_timeNow$1696_value} else {throw var_timeNow$1696_error}))
} catch {
case var_err : Throwable => {
var_$1693_error = var_err
}
}
}
var_$1693_init = true
var_$1693_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1702_changed = false
}
if ((var_$1838_changed)) {
var_$1702_value = var_$1838_value
var_$1702_init = true
var_$1702_error = var_$1838_error
var_$1702_changed = true
var_$1702_unknown = var_$1838_unknown
}
if ((!(currTs == 0L))) {
var_defaultTime$1706_changed = false
}
if ((var_$1707_changed)) {
var_defaultTime$1706_value = var_$1707_value
var_defaultTime$1706_init = true
var_defaultTime$1706_error = var_$1707_error
var_defaultTime$1706_changed = true
var_defaultTime$1706_unknown = var_$1707_unknown
}
var_$1705_changed = false
if ((var_defaultTime$1706_init && var_timeNow$1696_init)) {
if ((var_defaultTime$1706_changed) || (var_timeNow$1696_changed)) {
var_$1705_unknown = (var_defaultTime$1706_unknown && var_timeNow$1696_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = ((if((var_defaultTime$1706_error == null)) {var_defaultTime$1706_value} else {throw var_defaultTime$1706_error}) >= (if((var_timeNow$1696_error == null)) {var_timeNow$1696_value} else {throw var_timeNow$1696_error}))
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
if ((!(currTs == 0L))) {
var_$1709_changed = false
}
if ((var_$1838_changed)) {
var_$1709_value = var_$1838_value
var_$1709_init = true
var_$1709_error = var_$1838_error
var_$1709_changed = true
var_$1709_unknown = var_$1838_unknown
}
if ((!(currTs == 0L))) {
var_defaultTime$1713_changed = false
}
if ((var_$1700_changed)) {
var_defaultTime$1713_value = var_$1700_value
var_defaultTime$1713_init = true
var_defaultTime$1713_error = var_$1700_error
var_defaultTime$1713_changed = true
var_defaultTime$1713_unknown = var_$1700_unknown
}
var_$1712_changed = false
if ((var_defaultTime$1713_init && var_timeNow$1696_init)) {
if ((var_defaultTime$1713_changed) || (var_timeNow$1696_changed)) {
var_$1712_unknown = (var_defaultTime$1713_unknown && var_timeNow$1696_unknown)
if ((var_$1712_unknown)) {
var_$1712_error = UnknownEventError(null)
} else {
var_$1712_error = null
try {
var_$1712_value = ((if((var_defaultTime$1713_error == null)) {var_defaultTime$1713_value} else {throw var_defaultTime$1713_error}) >= (if((var_timeNow$1696_error == null)) {var_timeNow$1696_value} else {throw var_timeNow$1696_error}))
} catch {
case var_err : Throwable => {
var_$1712_error = var_err
}
}
}
var_$1712_init = true
var_$1712_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1715_changed = false
}
if ((var_$1719_changed)) {
var_$1715_value = var_$1719_value
var_$1715_init = true
var_$1715_error = var_$1719_error
var_$1715_changed = true
var_$1715_unknown = var_$1719_unknown
}
if ((!(currTs == 0L))) {
var_$1718_changed = false
}
if ((var_$1719_changed)) {
var_$1718_value = var_$1719_value
var_$1718_init = true
var_$1718_error = var_$1719_error
var_$1718_changed = true
var_$1718_unknown = var_$1719_unknown
}
var_eventList0$1711_changed = false
if ((var_$1712_init && var_$1715_init && var_$1718_init)) {
if ((var_$1712_changed) || (var_$1715_changed) || (var_$1718_changed)) {
var_eventList0$1711_unknown = (var_$1712_unknown && var_$1715_unknown && var_$1718_unknown)
if ((var_eventList0$1711_unknown)) {
var_eventList0$1711_error = UnknownEventError(null)
} else {
var_eventList0$1711_error = null
try {
var_eventList0$1711_value = (if ((if((var_$1712_error == null)) {var_$1712_value} else {throw var_$1712_error})) (if((var_$1715_error == null)) {var_$1715_value} else {throw var_$1715_error}) else (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}))
} catch {
case var_err : Throwable => {
var_eventList0$1711_error = var_err
}
}
}
var_eventList0$1711_init = true
var_eventList0$1711_changed = true
}
}
var_$1708_changed = false
if ((var_$1709_init && var_eventList0$1711_init)) {
if ((var_$1709_changed) || (var_eventList0$1711_changed)) {
var_$1708_unknown = (var_$1709_unknown && var_eventList0$1711_unknown)
if ((var_$1708_unknown)) {
var_$1708_error = UnknownEventError(null)
} else {
var_$1708_error = null
try {
var_$1708_value = ((if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}) +: (if((var_eventList0$1711_error == null)) {var_eventList0$1711_value} else {throw var_eventList0$1711_error}))
} catch {
case var_err : Throwable => {
var_$1708_error = var_err
}
}
}
var_$1708_init = true
var_$1708_changed = true
}
}
var_eventList1$1704_changed = false
if ((var_$1705_init && var_$1708_init && var_eventList0$1711_init)) {
if ((var_$1705_changed) || (var_$1708_changed) || (var_eventList0$1711_changed)) {
var_eventList1$1704_unknown = (var_$1705_unknown && var_$1708_unknown && var_eventList0$1711_unknown)
if ((var_eventList1$1704_unknown)) {
var_eventList1$1704_error = UnknownEventError(null)
} else {
var_eventList1$1704_error = null
try {
var_eventList1$1704_value = (if ((if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error})) (if((var_$1708_error == null)) {var_$1708_value} else {throw var_$1708_error}) else (if((var_eventList0$1711_error == null)) {var_eventList0$1711_value} else {throw var_eventList0$1711_error}))
} catch {
case var_err : Throwable => {
var_eventList1$1704_error = var_err
}
}
}
var_eventList1$1704_init = true
var_eventList1$1704_changed = true
}
}
var_$1701_changed = false
if ((var_$1702_init && var_eventList1$1704_init)) {
if ((var_$1702_changed) || (var_eventList1$1704_changed)) {
var_$1701_unknown = (var_$1702_unknown && var_eventList1$1704_unknown)
if ((var_$1701_unknown)) {
var_$1701_error = UnknownEventError(null)
} else {
var_$1701_error = null
try {
var_$1701_value = ((if((var_$1702_error == null)) {var_$1702_value} else {throw var_$1702_error}) +: (if((var_eventList1$1704_error == null)) {var_eventList1$1704_value} else {throw var_eventList1$1704_error}))
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
var_eventList2$1692_changed = false
if ((var_$1693_init && var_$1701_init && var_eventList1$1704_init)) {
if ((var_$1693_changed) || (var_$1701_changed) || (var_eventList1$1704_changed)) {
var_eventList2$1692_unknown = (var_$1693_unknown && var_$1701_unknown && var_eventList1$1704_unknown)
if ((var_eventList2$1692_unknown)) {
var_eventList2$1692_error = UnknownEventError(null)
} else {
var_eventList2$1692_error = null
try {
var_eventList2$1692_value = (if ((if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error})) (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) else (if((var_eventList1$1704_error == null)) {var_eventList1$1704_value} else {throw var_eventList1$1704_error}))
} catch {
case var_err : Throwable => {
var_eventList2$1692_error = var_err
}
}
}
var_eventList2$1692_init = true
var_eventList2$1692_ts = currTs
var_eventList2$1692_changed = true
}
}
var_$1853_changed = false
if ((var_eventList2$1692_changed)) {
if ((var_$1850_ts == currTs && var_$1850_lastInit) || (!(var_$1850_ts == currTs) && var_$1850_init)) {
var_$1853_lastValue = var_$1853_value
var_$1853_lastInit = var_$1853_init
var_$1853_lastError = var_$1853_error
var_$1853_ts = currTs
var_$1853_changed = true
var_$1853_init = true
var_$1853_unknown = var_eventList2$1692_unknown
if ((var_$1853_unknown)) {
var_$1853_error = var_eventList2$1692_error
} else {
if ((var_$1850_ts == currTs)) {
var_$1853_value = var_$1850_lastValue
var_$1853_error = var_$1850_lastError
} else {
var_$1853_value = var_$1850_value
var_$1853_error = var_$1850_error
}
}
}
}
var_$1852_changed = false
if ((var_eventList2$1692_changed)) {
if ((var_$1853_ts == currTs && var_$1853_lastInit) || (!(var_$1853_ts == currTs) && var_$1853_init)) {
var_$1852_changed = true
var_$1852_init = true
var_$1852_unknown = var_eventList2$1692_unknown
if ((var_$1852_unknown)) {
var_$1852_error = var_eventList2$1692_error
} else {
if ((var_$1853_ts == currTs)) {
var_$1852_value = var_$1853_lastValue
var_$1852_error = var_$1853_lastError
} else {
var_$1852_value = var_$1853_value
var_$1852_error = var_$1853_error
}
}
}
}
var_$1851_changed = false
if ((var_$1852_init)) {
if ((var_$1852_changed)) {
var_$1851_unknown = (var_$1852_unknown)
if ((var_$1851_unknown)) {
var_$1851_error = UnknownEventError(null)
} else {
var_$1851_error = null
try {
var_$1851_value = !((if((var_$1852_error == null)) {var_$1852_value} else {throw var_$1852_error}))
} catch {
case var_err : Throwable => {
var_$1851_error = var_err
}
}
}
var_$1851_init = true
var_$1851_changed = true
}
}
if ((var_$1853_init && var_$1851_init)) {
if ((var_$1853_changed) || (var_$1851_changed)) {
var_failingTimeStamps$1689_unknown = (var_$1853_unknown && var_$1851_unknown)
if ((var_failingTimeStamps$1689_unknown)) {
var_failingTimeStamps$1689_error = UnknownEventError(null)
} else {
var_failingTimeStamps$1689_error = null
try {
var_failingTimeStamps$1689_value = ((if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}) && (if((var_$1851_error == null)) {var_$1851_value} else {throw var_$1851_error}))
} catch {
case var_err : Throwable => {
var_failingTimeStamps$1689_error = var_err
}
}
}
var_failingTimeStamps$1689_init = true
}
}
var_failingTimeStamps$1688_changed = false
if ((var_eventList2$1692_changed)) {
var_failingTimeStamps$1688_init = var_eventList2$1692_init
if ((var_eventList2$1692_unknown)) {
var_failingTimeStamps$1688_error = UnknownEventError(var_eventList2$1692_error)
} else {
var_failingTimeStamps$1688_error = null
}
var_failingTimeStamps$1688_changed = var_eventList2$1692_changed
var_failingTimeStamps$1688_unknown = var_eventList2$1692_unknown
}
var_$1832_changed = false
if ((var_failingTimeStamps$1689_init && var_failingTimeStamps$1688_changed)) {
if ((var_failingTimeStamps$1689_value) || (!(var_failingTimeStamps$1689_error == null)) || (var_failingTimeStamps$1689_unknown)) {
if ((!(var_failingTimeStamps$1689_error == null))) {
var_$1832_error = var_failingTimeStamps$1689_error
} else {
var_$1832_error = var_failingTimeStamps$1688_error
}
var_$1832_changed = true
var_$1832_init = var_failingTimeStamps$1688_init
var_$1832_unknown = (var_failingTimeStamps$1688_unknown || !(var_failingTimeStamps$1689_error == null))
}
}
var_$1724_changed = false
if ((var_$1724_nextTs == currTs)) {
var_$1724_ts = currTs
var_$1724_changed = true
var_$1724_unknown = false
}
var_$1737_changed = false
if ((var_$1724_changed)) {
var_$1737_value = var_$1724_ts
var_$1737_init = true
var_$1737_unknown = var_$1724_unknown
if ((var_$1737_unknown)) {
var_$1737_error = var_$1724_error
} else {
var_$1737_error = null
}
var_$1737_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1683_changed = false
}
if ((var_$1737_changed)) {
var_defaultTime$1683_value = var_$1737_value
var_defaultTime$1683_init = true
var_defaultTime$1683_error = var_$1737_error
var_defaultTime$1683_changed = true
var_defaultTime$1683_unknown = var_$1737_unknown
}
var_$1834_changed = false
if ((var_eventList2$1692_changed)) {
var_$1834_lastValue = var_$1834_value
var_$1834_lastInit = var_$1834_init
var_$1834_lastError = var_$1834_error
var_$1834_value = var_eventList2$1692_ts
var_$1834_init = true
var_$1834_ts = currTs
var_$1834_unknown = var_eventList2$1692_unknown
if ((var_$1834_unknown)) {
var_$1834_error = var_eventList2$1692_error
} else {
var_$1834_error = null
}
var_$1834_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1690_changed = false
}
if ((var_$1834_changed)) {
var_defaultTime$1690_value = var_$1834_value
var_defaultTime$1690_init = true
var_defaultTime$1690_error = var_$1834_error
var_defaultTime$1690_changed = true
var_defaultTime$1690_unknown = var_$1834_unknown
}
var_$1682_changed = false
if ((var_defaultTime$1683_init && var_defaultTime$1690_init)) {
if ((var_defaultTime$1683_changed) || (var_defaultTime$1690_changed)) {
var_$1682_unknown = (var_defaultTime$1683_unknown && var_defaultTime$1690_unknown)
if ((var_$1682_unknown)) {
var_$1682_error = UnknownEventError(null)
} else {
var_$1682_error = null
try {
var_$1682_value = ((if((var_defaultTime$1683_error == null)) {var_defaultTime$1683_value} else {throw var_defaultTime$1683_error}) > (if((var_defaultTime$1690_error == null)) {var_defaultTime$1690_value} else {throw var_defaultTime$1690_error}))
} catch {
case var_err : Throwable => {
var_$1682_error = var_err
}
}
}
var_$1682_init = true
var_$1682_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1969_changed = false
}
if ((var_$1838_changed)) {
var_$1969_value = var_$1838_value
var_$1969_init = true
var_$1969_error = var_$1838_error
var_$1969_changed = true
var_$1969_unknown = var_$1838_unknown
}
var_$1721_changed = false
if ((var_defaultTime$1683_init && var_$1969_init)) {
if ((var_defaultTime$1683_changed) || (var_$1969_changed)) {
var_$1721_unknown = (var_defaultTime$1683_unknown && var_$1969_unknown)
if ((var_$1721_unknown)) {
var_$1721_error = UnknownEventError(null)
} else {
var_$1721_error = null
try {
var_$1721_value = ((if((var_defaultTime$1683_error == null)) {var_defaultTime$1683_value} else {throw var_defaultTime$1683_error}) != (if((var_$1969_error == null)) {var_$1969_value} else {throw var_$1969_error}))
} catch {
case var_err : Throwable => {
var_$1721_error = var_err
}
}
}
var_$1721_init = true
var_$1721_changed = true
}
}
var_$1681_changed = false
if ((var_$1682_init && var_$1721_init)) {
if ((var_$1682_changed) || (var_$1721_changed)) {
var_$1681_unknown = (var_$1682_unknown && var_$1721_unknown)
if ((var_$1681_unknown)) {
var_$1681_error = UnknownEventError(null)
} else {
var_$1681_error = null
try {
var_$1681_value = ((if((var_$1682_error == null)) {var_$1682_value} else {throw var_$1682_error}) && (if((var_$1721_error == null)) {var_$1721_value} else {throw var_$1721_error}))
} catch {
case var_err : Throwable => {
var_$1681_error = var_err
}
}
}
var_$1681_init = true
var_$1681_changed = true
}
}
var_$1733_changed = false
if ((var_$1724_changed)) {
if ((var_$1745_ts == currTs && var_$1745_lastInit) || (!(var_$1745_ts == currTs) && var_$1745_init)) {
var_$1733_changed = true
var_$1733_init = true
var_$1733_unknown = var_$1724_unknown
if ((var_$1733_unknown)) {
var_$1733_error = var_$1724_error
} else {
if ((var_$1745_ts == currTs)) {
var_$1733_value = var_$1745_lastValue
var_$1733_error = var_$1745_lastError
} else {
var_$1733_value = var_$1745_value
var_$1733_error = var_$1745_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1776_changed = false
}
if ((var_$1838_changed)) {
var_$1776_value = var_$1838_value
var_$1776_init = true
var_$1776_error = var_$1838_error
var_$1776_changed = true
var_$1776_unknown = var_$1838_unknown
}
var_$1736_changed = false
if ((var_$1737_init && var_$1776_init)) {
if ((var_$1737_changed) || (var_$1776_changed)) {
var_$1736_unknown = (var_$1737_unknown && var_$1776_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = ((if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}) - (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
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
var_$1732_changed = false
if ((var_$1733_init && var_$1736_init)) {
if ((var_$1733_changed) || (var_$1736_changed)) {
var_$1732_lastValue = var_$1732_value
var_$1732_lastInit = var_$1732_init
var_$1732_lastError = var_$1732_error
var_$1732_unknown = (var_$1733_unknown && var_$1736_unknown)
if ((var_$1732_unknown)) {
var_$1732_error = UnknownEventError(null)
} else {
var_$1732_error = null
try {
var_$1732_value = var_removeOldClusters$1741.apply((if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error}), (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}))
} catch {
case var_err : Throwable => {
var_$1732_error = var_err
}
}
}
var_$1732_init = true
var_$1732_ts = currTs
var_$1732_changed = true
}
}
var_mergedStream$1742_changed = false
if ((var_$1724_changed)) {
if ((var_$1732_ts == currTs && var_$1732_lastInit) || (!(var_$1732_ts == currTs) && var_$1732_init)) {
var_mergedStream$1742_changed = true
var_mergedStream$1742_unknown = var_$1724_unknown
if ((var_mergedStream$1742_unknown)) {
var_mergedStream$1742_error = var_$1724_error
} else {
if ((var_$1732_ts == currTs)) {
var_mergedStream$1742_value = var_$1732_lastValue
var_mergedStream$1742_error = var_$1732_lastError
} else {
var_mergedStream$1742_value = var_$1732_value
var_mergedStream$1742_error = var_$1732_error
}
}
}
}
var_$1731_changed = false
if ((var_$1732_changed) || (var_mergedStream$1742_changed)) {
var_$1731_changed = true
var_$1731_unknown = (var_$1732_unknown && var_mergedStream$1742_unknown)
if ((var_$1732_changed)) {
var_$1731_value = var_$1732_value
var_$1731_error = var_$1732_error
} else {
if ((var_mergedStream$1742_changed)) {
var_$1731_value = var_mergedStream$1742_value
var_$1731_error = var_mergedStream$1742_error
}
}
}
var_on$1729_changed = false
if ((var_$1724_changed) || (var_$1731_changed)) {
var_on$1729_error = null
try {
var_on$1729_unknown = true
var_on$1729_fval = var_$1743.apply((if((var_$1724_changed)) {EOSome((if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}))} else {EONone()}), (if((var_$1731_changed)) {EOSome((if((var_$1731_error == null)) {var_$1731_value} else {throw var_$1731_error}))} else {EONone()}))
var_on$1729_unknown = false
if ((var_on$1729_fval.isDefined)) {
var_on$1729_changed = true
var_on$1729_newValue = var_on$1729_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1729_changed = true
var_on$1729_error = var_err
}
}
if ((var_on$1729_unknown) || (var_$1724_unknown && var_$1731_unknown)) {
var_on$1729_changed = true
var_on$1729_unknown = true
var_on$1729_error = UnknownEventError(var_on$1729_error)
}
if ((var_on$1729_changed)) {
var_on$1729_value = var_on$1729_newValue
}
}
var_$1747_changed = false
if ((var_$1724_changed)) {
if ((var_$1724_unknown)) {
var_$1747_error = UnknownEventError(var_$1724_error)
} else {
var_$1747_error = null
}
var_$1747_changed = var_$1724_changed
var_$1747_unknown = var_$1724_unknown
}
var_mergeUnit2$1746_changed = false
if ((var_$1747_changed) || (var_failingTimeStamps$1688_changed)) {
var_mergeUnit2$1746_changed = true
var_mergeUnit2$1746_unknown = (var_$1747_unknown && var_failingTimeStamps$1688_unknown)
if ((var_$1747_changed)) {
var_mergeUnit2$1746_error = var_$1747_error
} else {
if ((var_failingTimeStamps$1688_changed)) {
var_mergeUnit2$1746_error = var_failingTimeStamps$1688_error
}
}
}
var_$1744_changed = false
if ((var_mergeUnit2$1746_changed)) {
if ((var_$1745_ts == currTs && var_$1745_lastInit) || (!(var_$1745_ts == currTs) && var_$1745_init)) {
var_$1744_changed = true
var_$1744_unknown = var_mergeUnit2$1746_unknown
if ((var_$1744_unknown)) {
var_$1744_error = var_mergeUnit2$1746_error
} else {
if ((var_$1745_ts == currTs)) {
var_$1744_value = var_$1745_lastValue
var_$1744_error = var_$1745_lastError
} else {
var_$1744_value = var_$1745_value
var_$1744_error = var_$1745_error
}
}
}
}
var_activeClustersResetted$1728_changed = false
if ((var_on$1729_changed) || (var_$1744_changed)) {
var_activeClustersResetted$1728_changed = true
var_activeClustersResetted$1728_unknown = (var_on$1729_unknown && var_$1744_unknown)
if ((var_on$1729_changed)) {
var_activeClustersResetted$1728_value = var_on$1729_value
var_activeClustersResetted$1728_error = var_on$1729_error
} else {
if ((var_$1744_changed)) {
var_activeClustersResetted$1728_value = var_$1744_value
var_activeClustersResetted$1728_error = var_$1744_error
}
}
}
if ((!(currTs == 0L))) {
var_activeClustersResetted$1752_changed = false
}
if ((var_$1761_changed)) {
var_activeClustersResetted$1752_value = var_$1761_value
var_activeClustersResetted$1752_error = var_$1761_error
var_activeClustersResetted$1752_changed = true
var_activeClustersResetted$1752_unknown = var_$1761_unknown
}
var_$1727_changed = false
if ((var_activeClustersResetted$1728_changed) || (var_activeClustersResetted$1752_changed)) {
var_$1727_init = true
var_$1727_changed = true
var_$1727_unknown = (var_activeClustersResetted$1728_unknown && var_activeClustersResetted$1752_unknown)
if ((var_activeClustersResetted$1728_changed)) {
var_$1727_value = var_activeClustersResetted$1728_value
var_$1727_error = var_activeClustersResetted$1728_error
} else {
if ((var_activeClustersResetted$1752_changed)) {
var_$1727_value = var_activeClustersResetted$1752_value
var_$1727_error = var_activeClustersResetted$1752_error
}
}
}
var_$1755_changed = false
if ((var_$1727_init && var_eventList2$1692_init && var_$1834_init)) {
if ((var_$1727_changed) || (var_eventList2$1692_changed) || (var_$1834_changed)) {
var_$1755_unknown = (var_$1727_unknown && var_eventList2$1692_unknown && var_$1834_unknown)
if ((var_$1755_unknown)) {
var_$1755_error = UnknownEventError(null)
} else {
var_$1755_error = null
try {
var_$1755_value = var_insertEventsList$1758.apply((if((var_$1727_error == null)) {var_$1727_value} else {throw var_$1727_error}), (if((var_eventList2$1692_error == null)) {var_eventList2$1692_value} else {throw var_eventList2$1692_error}), (if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}))
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
var_$1680_changed = false
if ((var_$1681_init && var_$1727_init && var_$1755_init)) {
if ((var_$1681_changed) || (var_$1727_changed) || (var_$1755_changed)) {
var_$1680_unknown = (var_$1681_unknown && var_$1727_unknown && var_$1755_unknown)
if ((var_$1680_unknown)) {
var_$1680_error = UnknownEventError(null)
} else {
var_$1680_error = null
try {
var_$1680_value = (if ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error})) (if((var_$1727_error == null)) {var_$1727_value} else {throw var_$1727_error}) else (if((var_$1755_error == null)) {var_$1755_value} else {throw var_$1755_error}))
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
var_activeClustersState$1679_changed = false
if ((var_$1680_init)) {
if ((var_$1680_changed)) {
var_activeClustersState$1679_unknown = (var_$1680_unknown)
if ((var_activeClustersState$1679_unknown)) {
var_activeClustersState$1679_error = UnknownEventError(null)
} else {
var_activeClustersState$1679_error = null
try {
var_activeClustersState$1679_value = var_removeFulfilledClusters$1759.apply((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
} catch {
case var_err : Throwable => {
var_activeClustersState$1679_error = var_err
}
}
}
var_activeClustersState$1679_changed = true
}
}
var_$1745_changed = false
if ((var_activeClustersState$1679_changed) || (var_activeClustersResetted$1752_changed)) {
var_$1745_lastValue = var_$1745_value
var_$1745_lastInit = var_$1745_init
var_$1745_lastError = var_$1745_error
var_$1745_init = true
var_$1745_ts = currTs
var_$1745_changed = true
var_$1745_unknown = (var_activeClustersState$1679_unknown && var_activeClustersResetted$1752_unknown)
if ((var_activeClustersState$1679_changed)) {
var_$1745_value = var_activeClustersState$1679_value
var_$1745_error = var_activeClustersState$1679_error
} else {
if ((var_activeClustersResetted$1752_changed)) {
var_$1745_value = var_activeClustersResetted$1752_value
var_$1745_error = var_activeClustersResetted$1752_error
}
}
}
var_$1772_changed = false
if ((var_$1745_init)) {
if ((var_$1745_changed)) {
var_$1772_unknown = (var_$1745_unknown)
if ((var_$1772_unknown)) {
var_$1772_error = UnknownEventError(null)
} else {
var_$1772_error = null
try {
var_$1772_value = (var_head$1774.apply(((if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error})).asInstanceOf[List[Any]])).asInstanceOf[(Map[Long, Boolean], Long)]
} catch {
case var_err : Throwable => {
var_$1772_error = var_err
}
}
}
var_$1772_init = true
var_$1772_changed = true
}
}
var_$1771_changed = false
if ((var_$1772_init)) {
if ((var_$1772_changed)) {
var_$1771_unknown = (var_$1772_unknown)
if ((var_$1771_unknown)) {
var_$1771_error = UnknownEventError(null)
} else {
var_$1771_error = null
try {
var_$1771_value = var_$1775.apply((if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error}))
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
if ((var_$1771_init && var_$1776_init)) {
if ((var_$1771_changed) || (var_$1776_changed)) {
var_$1770_unknown = (var_$1771_unknown && var_$1776_unknown)
if ((var_$1770_unknown)) {
var_$1770_error = UnknownEventError(null)
} else {
var_$1770_error = null
try {
var_$1770_value = ((if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}) + (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
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
var_safeDelay$1784_changed = false
if ((var_safeDelay$1784_nextTs == currTs)) {
var_safeDelay$1784_changed = true
var_safeDelay$1784_unknown = false
}
var_$1782_changed = false
if ((var_safeDelay$1784_changed)) {
if ((var_safeDelay$1784_unknown)) {
var_$1782_error = UnknownEventError(var_safeDelay$1784_error)
} else {
var_$1782_error = null
}
var_$1782_changed = var_safeDelay$1784_changed
var_$1782_unknown = var_safeDelay$1784_unknown
}
var_mergeUnit2$1779_changed = false
if ((var_failingTimeStamps$1688_changed) || (var_$1782_changed)) {
var_mergeUnit2$1779_ts = currTs
var_mergeUnit2$1779_changed = true
var_mergeUnit2$1779_unknown = (var_failingTimeStamps$1688_unknown && var_$1782_unknown)
if ((var_failingTimeStamps$1688_changed)) {
var_mergeUnit2$1779_error = var_failingTimeStamps$1688_error
} else {
if ((var_$1782_changed)) {
var_mergeUnit2$1779_error = var_$1782_error
}
}
}
var_$1778_changed = false
if ((var_mergeUnit2$1779_changed)) {
var_$1778_value = var_mergeUnit2$1779_ts
var_$1778_init = true
var_$1778_unknown = var_mergeUnit2$1779_unknown
if ((var_$1778_unknown)) {
var_$1778_error = var_mergeUnit2$1779_error
} else {
var_$1778_error = null
}
var_$1778_changed = true
}
var_$1769_changed = false
if ((var_$1770_init && var_$1778_init)) {
if ((var_$1770_changed) || (var_$1778_changed)) {
var_$1769_unknown = (var_$1770_unknown && var_$1778_unknown)
if ((var_$1769_unknown)) {
var_$1769_error = UnknownEventError(null)
} else {
var_$1769_error = null
try {
var_$1769_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) > (if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}))
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
if ((!(currTs == 0L))) {
var_$1785_changed = false
}
if ((var_$1824_changed)) {
var_$1785_value = var_$1824_value
var_$1785_init = true
var_$1785_error = var_$1824_error
var_$1785_changed = true
var_$1785_unknown = var_$1824_unknown
}
if ((!(currTs == 0L))) {
var_$1788_changed = false
}
if ((var_$1824_changed)) {
var_$1788_value = var_$1824_value
var_$1788_init = true
var_$1788_error = var_$1824_error
var_$1788_changed = true
var_$1788_unknown = var_$1824_unknown
}
var_$1768_changed = false
if ((var_$1769_init && var_$1785_init && var_$1788_init)) {
if ((var_$1769_changed) || (var_$1785_changed) || (var_$1788_changed)) {
var_$1768_unknown = (var_$1769_unknown && var_$1785_unknown && var_$1788_unknown)
if ((var_$1768_unknown)) {
var_$1768_error = UnknownEventError(null)
} else {
var_$1768_error = null
try {
var_$1768_value = (if ((if((var_$1769_error == null)) {var_$1769_value} else {throw var_$1769_error})) (if((var_$1785_error == null)) {var_$1785_value} else {throw var_$1785_error}) else (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}))
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
if ((!(currTs == 0L))) {
var_$1765_changed = false
}
if ((var_$1824_changed)) {
var_$1765_value = var_$1824_value
var_$1765_init = true
var_$1765_error = var_$1824_error
var_$1765_changed = true
var_$1765_unknown = var_$1824_unknown
}
var_$1677_changed = false
if ((var_$1745_init)) {
if ((var_$1745_changed)) {
var_$1677_unknown = (var_$1745_unknown)
if ((var_$1677_unknown)) {
var_$1677_error = UnknownEventError(null)
} else {
var_$1677_error = null
try {
var_$1677_value = (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}).size
} catch {
case var_err : Throwable => {
var_$1677_error = var_err
}
}
}
var_$1677_init = true
var_$1677_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1763_changed = false
}
if ((var_$1838_changed)) {
var_$1763_value = var_$1838_value
var_$1763_init = true
var_$1763_error = var_$1838_error
var_$1763_changed = true
var_$1763_unknown = var_$1838_unknown
}
var_$1676_changed = false
if ((var_$1677_init && var_$1763_init)) {
if ((var_$1677_changed) || (var_$1763_changed)) {
var_$1676_unknown = (var_$1677_unknown && var_$1763_unknown)
if ((var_$1676_unknown)) {
var_$1676_error = UnknownEventError(null)
} else {
var_$1676_error = null
try {
var_$1676_value = ((if((var_$1677_error == null)) {var_$1677_value} else {throw var_$1677_error}) == (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
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
var_result$1675_changed = false
if ((var_$1676_init && var_$1765_init && var_$1768_init)) {
if ((var_$1676_changed) || (var_$1765_changed) || (var_$1768_changed)) {
var_result$1675_unknown = (var_$1676_unknown && var_$1765_unknown && var_$1768_unknown)
if ((var_result$1675_unknown)) {
var_result$1675_error = UnknownEventError(null)
} else {
var_result$1675_error = null
try {
var_result$1675_value = (if ((if((var_$1676_error == null)) {var_$1676_value} else {throw var_$1676_error})) (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}) else (if((var_$1768_error == null)) {var_$1768_value} else {throw var_$1768_error}))
} catch {
case var_err : Throwable => {
var_result$1675_error = var_err
}
}
}
var_result$1675_init = true
var_result$1675_ts = currTs
var_result$1675_changed = true
}
}
var_$1674_changed = false
if ((var_result$1675_init)) {
if ((var_result$1675_changed)) {
var_$1674_unknown = (var_result$1675_unknown)
if ((var_$1674_unknown)) {
var_$1674_error = UnknownEventError(null)
} else {
var_$1674_error = null
try {
var_$1674_value = var_$1913.apply((if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
} catch {
case var_err : Throwable => {
var_$1674_error = var_err
}
}
}
var_$1674_init = true
var_$1674_changed = true
}
}
var_$1808_changed = false
if ((var_result$1675_init)) {
if ((var_result$1675_changed)) {
var_$1808_unknown = (var_result$1675_unknown)
if ((var_$1808_unknown)) {
var_$1808_error = UnknownEventError(null)
} else {
var_$1808_error = null
try {
var_$1808_value = var_$1794.apply((if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
} catch {
case var_err : Throwable => {
var_$1808_error = var_err
}
}
}
var_$1808_init = true
var_$1808_changed = true
}
}
var_$1792_changed = false
if ((var_$1808_init)) {
if ((var_$1808_changed)) {
var_$1792_unknown = (var_$1808_unknown)
if ((var_$1792_unknown)) {
var_$1792_error = UnknownEventError(null)
} else {
var_$1792_error = null
try {
var_$1792_value = !((if((var_$1808_error == null)) {var_$1808_value} else {throw var_$1808_error}))
} catch {
case var_err : Throwable => {
var_$1792_error = var_err
}
}
}
var_$1792_init = true
var_$1792_changed = true
}
}
var_$1673_changed = false
if ((var_$1674_init && var_$1792_init)) {
if ((var_$1674_changed) || (var_$1792_changed)) {
var_$1673_unknown = (var_$1674_unknown && var_$1792_unknown)
if ((var_$1673_unknown)) {
var_$1673_error = UnknownEventError(null)
} else {
var_$1673_error = null
try {
var_$1673_value = ((if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}) && (if((var_$1792_error == null)) {var_$1792_value} else {throw var_$1792_error}))
} catch {
case var_err : Throwable => {
var_$1673_error = var_err
}
}
}
var_$1673_init = true
var_$1673_changed = true
}
}
var_$1799_changed = false
if ((var_result$1675_changed)) {
if ((var_$1666_ts == currTs && var_$1666_lastInit) || (!(var_$1666_ts == currTs) && var_$1666_init)) {
var_$1799_changed = true
var_$1799_init = true
var_$1799_unknown = var_result$1675_unknown
if ((var_$1799_unknown)) {
var_$1799_error = var_result$1675_error
} else {
if ((var_$1666_ts == currTs)) {
var_$1799_value = var_$1666_lastValue
var_$1799_error = var_$1666_lastError
} else {
var_$1799_value = var_$1666_value
var_$1799_error = var_$1666_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1805_changed = false
}
if ((var_$1806_changed)) {
var_$1805_value = var_$1806_value
var_$1805_init = true
var_$1805_error = var_$1806_error
var_$1805_changed = true
var_$1805_unknown = var_$1806_unknown
}
var_$1802_changed = false
if ((var_$1674_init && var_$1805_init)) {
if ((var_$1674_changed) || (var_$1805_changed)) {
var_$1802_unknown = (var_$1674_unknown && var_$1805_unknown)
if ((var_$1802_unknown)) {
var_$1802_error = UnknownEventError(null)
} else {
var_$1802_error = null
try {
var_$1802_value = ((if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}) == (if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error}))
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
if ((!(currTs == 0L))) {
var_$1810_changed = false
}
if ((var_$1806_changed)) {
var_$1810_value = var_$1806_value
var_$1810_init = true
var_$1810_error = var_$1806_error
var_$1810_changed = true
var_$1810_unknown = var_$1806_unknown
}
var_$1807_changed = false
if ((var_$1808_init && var_$1810_init)) {
if ((var_$1808_changed) || (var_$1810_changed)) {
var_$1807_unknown = (var_$1808_unknown && var_$1810_unknown)
if ((var_$1807_unknown)) {
var_$1807_error = UnknownEventError(null)
} else {
var_$1807_error = null
try {
var_$1807_value = ((if((var_$1808_error == null)) {var_$1808_value} else {throw var_$1808_error}) == (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
} catch {
case var_err : Throwable => {
var_$1807_error = var_err
}
}
}
var_$1807_init = true
var_$1807_changed = true
}
}
var_$1801_changed = false
if ((var_$1802_init && var_$1807_init)) {
if ((var_$1802_changed) || (var_$1807_changed)) {
var_$1801_unknown = (var_$1802_unknown && var_$1807_unknown)
if ((var_$1801_unknown)) {
var_$1801_error = UnknownEventError(null)
} else {
var_$1801_error = null
try {
var_$1801_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) && (if((var_$1807_error == null)) {var_$1807_value} else {throw var_$1807_error}))
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
var_isFinalFalse$1798_changed = false
if ((var_$1799_init && var_$1801_init)) {
if ((var_$1799_changed) || (var_$1801_changed)) {
var_isFinalFalse$1798_unknown = (var_$1799_unknown && var_$1801_unknown)
if ((var_isFinalFalse$1798_unknown)) {
var_isFinalFalse$1798_error = UnknownEventError(null)
} else {
var_isFinalFalse$1798_error = null
try {
var_isFinalFalse$1798_value = ((if((var_$1799_error == null)) {var_$1799_value} else {throw var_$1799_error}) || (if((var_$1801_error == null)) {var_$1801_value} else {throw var_$1801_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1798_error = var_err
}
}
}
var_isFinalFalse$1798_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$1822_changed = false
}
if ((var_isFinalFalse$1798_changed)) {
var_isFinalFalseReset$1822_lastValue = var_isFinalFalseReset$1822_value
var_isFinalFalseReset$1822_lastInit = var_isFinalFalseReset$1822_init
var_isFinalFalseReset$1822_lastError = var_isFinalFalseReset$1822_error
var_isFinalFalseReset$1822_value = var_isFinalFalse$1798_value
var_isFinalFalseReset$1822_init = true
var_isFinalFalseReset$1822_ts = currTs
var_isFinalFalseReset$1822_error = var_isFinalFalse$1798_error
var_isFinalFalseReset$1822_changed = true
var_isFinalFalseReset$1822_unknown = var_isFinalFalse$1798_unknown
}
var_prev$1796_changed = false
if ((var_isFinalFalseReset$1822_changed)) {
if ((var_isFinalFalseReset$1822_ts == currTs && var_isFinalFalseReset$1822_lastInit) || (!(var_isFinalFalseReset$1822_ts == currTs) && var_isFinalFalseReset$1822_init)) {
var_prev$1796_changed = true
var_prev$1796_init = true
var_prev$1796_unknown = var_isFinalFalseReset$1822_unknown
if ((var_prev$1796_unknown)) {
var_prev$1796_error = var_isFinalFalseReset$1822_error
} else {
if ((var_isFinalFalseReset$1822_ts == currTs)) {
var_prev$1796_value = var_isFinalFalseReset$1822_lastValue
var_prev$1796_error = var_isFinalFalseReset$1822_lastError
} else {
var_prev$1796_value = var_isFinalFalseReset$1822_value
var_prev$1796_error = var_isFinalFalseReset$1822_error
}
}
}
}
var_$1795_changed = false
if ((var_prev$1796_init)) {
if ((var_prev$1796_changed)) {
var_$1795_unknown = (var_prev$1796_unknown)
if ((var_$1795_unknown)) {
var_$1795_error = UnknownEventError(null)
} else {
var_$1795_error = null
try {
var_$1795_value = !((if((var_prev$1796_error == null)) {var_prev$1796_value} else {throw var_prev$1796_error}))
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
var_$1672_changed = false
if ((var_$1673_init && var_$1795_init)) {
if ((var_$1673_changed) || (var_$1795_changed)) {
var_$1672_unknown = (var_$1673_unknown && var_$1795_unknown)
if ((var_$1672_unknown)) {
var_$1672_error = UnknownEventError(null)
} else {
var_$1672_error = null
try {
var_$1672_value = ((if((var_$1673_error == null)) {var_$1673_value} else {throw var_$1673_error}) && (if((var_$1795_error == null)) {var_$1795_value} else {throw var_$1795_error}))
} catch {
case var_err : Throwable => {
var_$1672_error = var_err
}
}
}
var_$1672_init = true
var_$1672_changed = true
}
}
var_$1818_changed = false
if ((var_result$1675_changed)) {
var_$1818_value = var_result$1675_ts
var_$1818_init = true
var_$1818_unknown = var_result$1675_unknown
if ((var_$1818_unknown)) {
var_$1818_error = var_result$1675_error
} else {
var_$1818_error = null
}
var_$1818_changed = true
}
var_$1813_changed = false
if ((var_isFinalFalseReset$1822_changed)) {
if ((var_$1670_ts == currTs && var_$1670_lastInit) || (!(var_$1670_ts == currTs) && var_$1670_init)) {
var_$1813_changed = true
var_$1813_init = true
var_$1813_unknown = var_isFinalFalseReset$1822_unknown
if ((var_$1813_unknown)) {
var_$1813_error = var_isFinalFalseReset$1822_error
} else {
if ((var_$1670_ts == currTs)) {
var_$1813_value = var_$1670_lastValue
var_$1813_error = var_$1670_lastError
} else {
var_$1813_value = var_$1670_value
var_$1813_error = var_$1670_error
}
}
}
}
var_finalFalseSince$1671_changed = false
if ((var_$1672_init && var_$1818_init && var_$1813_init)) {
if ((var_$1672_changed) || (var_$1818_changed) || (var_$1813_changed)) {
var_finalFalseSince$1671_unknown = (var_$1672_unknown && var_$1818_unknown && var_$1813_unknown)
if ((var_finalFalseSince$1671_unknown)) {
var_finalFalseSince$1671_error = UnknownEventError(null)
} else {
var_finalFalseSince$1671_error = null
try {
var_finalFalseSince$1671_value = (if ((if((var_$1672_error == null)) {var_$1672_value} else {throw var_$1672_error})) (if((var_$1818_error == null)) {var_$1818_value} else {throw var_$1818_error}) else (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1671_error = var_err
}
}
}
var_finalFalseSince$1671_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1670_changed = false
}
if ((var_finalFalseSince$1671_changed)) {
var_$1670_lastValue = var_$1670_value
var_$1670_lastInit = var_$1670_init
var_$1670_lastError = var_$1670_error
var_$1670_value = var_finalFalseSince$1671_value
var_$1670_init = true
var_$1670_ts = currTs
var_$1670_error = var_finalFalseSince$1671_error
var_$1670_changed = true
var_$1670_unknown = var_finalFalseSince$1671_unknown
}
if ((!(currTs == 0L))) {
var_$1974_changed = false
}
if ((var_$1838_changed)) {
var_$1974_value = var_$1838_value
var_$1974_init = true
var_$1974_error = var_$1838_error
var_$1974_changed = true
var_$1974_unknown = var_$1838_unknown
}
var_$1669_changed = false
if ((var_$1670_init && var_$1974_init)) {
if ((var_$1670_changed) || (var_$1974_changed)) {
var_$1669_unknown = (var_$1670_unknown && var_$1974_unknown)
if ((var_$1669_unknown)) {
var_$1669_error = UnknownEventError(null)
} else {
var_$1669_error = null
try {
var_$1669_value = ((if((var_$1670_error == null)) {var_$1670_value} else {throw var_$1670_error}) + (if((var_$1974_error == null)) {var_$1974_value} else {throw var_$1974_error}))
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
var_$1952_changed = false
if ((var_$1677_init && var_$1763_init)) {
if ((var_$1677_changed) || (var_$1763_changed)) {
var_$1952_unknown = (var_$1677_unknown && var_$1763_unknown)
if ((var_$1952_unknown)) {
var_$1952_error = UnknownEventError(null)
} else {
var_$1952_error = null
try {
var_$1952_value = ((if((var_$1677_error == null)) {var_$1677_value} else {throw var_$1677_error}) != (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
} catch {
case var_err : Throwable => {
var_$1952_error = var_err
}
}
}
var_$1952_init = true
var_$1952_changed = true
}
}
var_$1958_changed = false
if ((var_$1770_init && var_$1834_init)) {
if ((var_$1770_changed) || (var_$1834_changed)) {
var_$1958_unknown = (var_$1770_unknown && var_$1834_unknown)
if ((var_$1958_unknown)) {
var_$1958_error = UnknownEventError(null)
} else {
var_$1958_error = null
try {
var_$1958_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) - (if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}))
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
if ((!(currTs == 0L))) {
var_$1967_changed = false
}
if ((var_$1838_changed)) {
var_$1967_value = var_$1838_value
var_$1967_init = true
var_$1967_error = var_$1838_error
var_$1967_changed = true
var_$1967_unknown = var_$1838_unknown
}
var_$1957_changed = false
if ((var_$1958_init && var_$1967_init)) {
if ((var_$1958_changed) || (var_$1967_changed)) {
var_$1957_unknown = (var_$1958_unknown && var_$1967_unknown)
if ((var_$1957_unknown)) {
var_$1957_error = UnknownEventError(null)
} else {
var_$1957_error = null
try {
var_$1957_value = ((if((var_$1958_error == null)) {var_$1958_value} else {throw var_$1958_error}) + (if((var_$1967_error == null)) {var_$1967_value} else {throw var_$1967_error}))
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
var_$1951_changed = false
if ((var_$1952_init && var_$1957_init && var_$1969_init)) {
if ((var_$1952_changed) || (var_$1957_changed) || (var_$1969_changed)) {
var_$1951_unknown = (var_$1952_unknown && var_$1957_unknown && var_$1969_unknown)
if ((var_$1951_unknown)) {
var_$1951_error = UnknownEventError(null)
} else {
var_$1951_error = null
try {
var_$1951_value = (if ((if((var_$1952_error == null)) {var_$1952_value} else {throw var_$1952_error})) (if((var_$1957_error == null)) {var_$1957_value} else {throw var_$1957_error}) else (if((var_$1969_error == null)) {var_$1969_value} else {throw var_$1969_error}))
} catch {
case var_err : Throwable => {
var_$1951_error = var_err
}
}
}
var_$1951_init = true
var_$1951_ts = currTs
var_$1951_changed = true
}
}
var_$1976_changed = false
if ((var_$1951_changed)) {
var_$1976_value = var_$1951_ts
var_$1976_init = true
var_$1976_unknown = var_$1951_unknown
if ((var_$1976_unknown)) {
var_$1976_error = var_$1951_error
} else {
var_$1976_error = null
}
var_$1976_changed = true
}
var_$1973_changed = false
if ((var_$1974_init && var_$1976_init)) {
if ((var_$1974_changed) || (var_$1976_changed)) {
var_$1973_unknown = (var_$1974_unknown && var_$1976_unknown)
if ((var_$1973_unknown)) {
var_$1973_error = UnknownEventError(null)
} else {
var_$1973_error = null
try {
var_$1973_value = ((if((var_$1974_error == null)) {var_$1974_value} else {throw var_$1974_error}) - (if((var_$1976_error == null)) {var_$1976_value} else {throw var_$1976_error}))
} catch {
case var_err : Throwable => {
var_$1973_error = var_err
}
}
}
var_$1973_init = true
var_$1973_changed = true
}
}
var_$1668_changed = false
if ((var_$1669_init && var_$1818_init)) {
if ((var_$1669_changed) || (var_$1818_changed)) {
var_$1668_unknown = (var_$1669_unknown && var_$1818_unknown)
if ((var_$1668_unknown)) {
var_$1668_error = UnknownEventError(null)
} else {
var_$1668_error = null
try {
var_$1668_value = ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) < (if((var_$1818_error == null)) {var_$1818_value} else {throw var_$1818_error}))
} catch {
case var_err : Throwable => {
var_$1668_error = var_err
}
}
}
var_$1668_init = true
var_$1668_changed = true
}
}
var_isFinalFalseReset$1667_changed = false
if ((var_$1668_init && var_$1810_init && var_isFinalFalseReset$1822_init)) {
if ((var_$1668_changed) || (var_$1810_changed) || (var_isFinalFalseReset$1822_changed)) {
var_isFinalFalseReset$1667_unknown = (var_$1668_unknown && var_$1810_unknown && var_isFinalFalseReset$1822_unknown)
if ((var_isFinalFalseReset$1667_unknown)) {
var_isFinalFalseReset$1667_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1667_error = null
try {
var_isFinalFalseReset$1667_value = (if ((if((var_$1668_error == null)) {var_$1668_value} else {throw var_$1668_error})) (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}) else (if((var_isFinalFalseReset$1822_error == null)) {var_isFinalFalseReset$1822_value} else {throw var_isFinalFalseReset$1822_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1667_error = var_err
}
}
}
var_isFinalFalseReset$1667_changed = true
}
}
var_$1666_changed = false
if ((var_isFinalFalseReset$1667_changed) || (var_isFinalFalseReset$1822_changed)) {
var_$1666_lastValue = var_$1666_value
var_$1666_lastInit = var_$1666_init
var_$1666_lastError = var_$1666_error
var_$1666_init = true
var_$1666_ts = currTs
var_$1666_changed = true
var_$1666_unknown = (var_isFinalFalseReset$1667_unknown && var_isFinalFalseReset$1822_unknown)
if ((var_isFinalFalseReset$1667_changed)) {
var_$1666_value = var_isFinalFalseReset$1667_value
var_$1666_error = var_isFinalFalseReset$1667_error
} else {
if ((var_isFinalFalseReset$1822_changed)) {
var_$1666_value = var_isFinalFalseReset$1822_value
var_$1666_error = var_isFinalFalseReset$1822_error
}
}
}
var_stillFulfillableReset$1665_changed = false
if ((var_$1666_init && var_$1788_init && var_result$1675_init)) {
if ((var_$1666_changed) || (var_$1788_changed) || (var_result$1675_changed)) {
var_stillFulfillableReset$1665_unknown = (var_$1666_unknown && var_$1788_unknown && var_result$1675_unknown)
if ((var_stillFulfillableReset$1665_unknown)) {
var_stillFulfillableReset$1665_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1665_error = null
try {
var_stillFulfillableReset$1665_value = (if ((if((var_$1666_error == null)) {var_$1666_value} else {throw var_$1666_error})) (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}) else (if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1665_error = var_err
}
}
}
var_stillFulfillableReset$1665_init = true
var_stillFulfillableReset$1665_changed = true
}
}
var_$1850_changed = false
if ((var_stillFulfillableReset$1665_init)) {
if ((var_stillFulfillableReset$1665_changed)) {
var_$1850_lastValue = var_$1850_value
var_$1850_lastInit = var_$1850_init
var_$1850_lastError = var_$1850_error
var_$1850_unknown = (var_stillFulfillableReset$1665_unknown)
if ((var_$1850_unknown)) {
var_$1850_error = UnknownEventError(null)
} else {
var_$1850_error = null
try {
var_$1850_value = var_$1913.apply((if((var_stillFulfillableReset$1665_error == null)) {var_stillFulfillableReset$1665_value} else {throw var_stillFulfillableReset$1665_error}))
} catch {
case var_err : Throwable => {
var_$1850_error = var_err
}
}
}
var_$1850_init = true
var_$1850_ts = currTs
var_$1850_changed = true
}
}
var_$1840_changed = false
if ((var_$1832_changed)) {
var_$1840_value = 9223372036854775807L
var_$1840_init = var_$1832_init
if ((var_$1832_unknown)) {
var_$1840_error = UnknownEventError(var_$1832_error)
} else {
var_$1840_error = null
}
var_$1840_changed = var_$1832_changed
var_$1840_unknown = var_$1832_unknown
}
var_prev$1844_changed = false
if ((var_$1834_changed)) {
if ((var_$1834_ts == currTs && var_$1834_lastInit) || (!(var_$1834_ts == currTs) && var_$1834_init)) {
var_prev$1844_changed = true
var_prev$1844_init = true
var_prev$1844_unknown = var_$1834_unknown
if ((var_prev$1844_unknown)) {
var_prev$1844_error = var_$1834_error
} else {
if ((var_$1834_ts == currTs)) {
var_prev$1844_value = var_$1834_lastValue
var_prev$1844_error = var_$1834_lastError
} else {
var_prev$1844_value = var_$1834_value
var_prev$1844_error = var_$1834_error
}
}
}
}
var_$1833_changed = false
if ((var_$1834_init && var_prev$1844_init)) {
if ((var_$1834_changed) || (var_prev$1844_changed)) {
var_$1833_unknown = (var_$1834_unknown && var_prev$1844_unknown)
if ((var_$1833_unknown)) {
var_$1833_error = UnknownEventError(null)
} else {
var_$1833_error = null
try {
var_$1833_value = ((if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}) - (if((var_prev$1844_error == null)) {var_prev$1844_value} else {throw var_prev$1844_error}))
} catch {
case var_err : Throwable => {
var_$1833_error = var_err
}
}
}
var_$1833_init = true
var_$1833_changed = true
}
}
var_$1839_changed = false
if ((var_$1840_init && var_$1833_init)) {
if ((var_$1840_changed) || (var_$1833_changed)) {
var_$1839_unknown = (var_$1840_unknown && var_$1833_unknown)
if ((var_$1839_unknown)) {
var_$1839_error = UnknownEventError(null)
} else {
var_$1839_error = null
try {
var_$1839_value = ((if((var_$1840_error == null)) {var_$1840_value} else {throw var_$1840_error}) - (if((var_$1833_error == null)) {var_$1833_value} else {throw var_$1833_error}))
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
var_$1829_changed = false
if ((var_$1839_init && var_$1763_init)) {
if ((var_$1839_changed) || (var_$1763_changed)) {
var_$1829_unknown = (var_$1839_unknown && var_$1763_unknown)
if ((var_$1829_unknown)) {
var_$1829_error = UnknownEventError(null)
} else {
var_$1829_error = null
try {
var_$1829_value = ((if((var_$1839_error == null)) {var_$1839_value} else {throw var_$1839_error}) > (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
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
var_resets$1686_changed = false
if ((var_$1829_init && var_$1839_init && var_$1967_init)) {
if ((var_$1829_changed) || (var_$1839_changed) || (var_$1967_changed)) {
var_resets$1686_unknown = (var_$1829_unknown && var_$1839_unknown && var_$1967_unknown)
if ((var_resets$1686_unknown)) {
var_resets$1686_error = UnknownEventError(null)
} else {
var_resets$1686_error = null
try {
var_resets$1686_value = (if ((if((var_$1829_error == null)) {var_$1829_value} else {throw var_$1829_error})) (if((var_$1839_error == null)) {var_$1839_value} else {throw var_$1839_error}) else (if((var_$1967_error == null)) {var_$1967_value} else {throw var_$1967_error}))
} catch {
case var_err : Throwable => {
var_resets$1686_error = var_err
}
}
}
var_resets$1686_changed = true
}
}
var_$1950_changed = false
if ((var_$1951_init && var_$1763_init)) {
if ((var_$1951_changed) || (var_$1763_changed)) {
var_$1950_unknown = (var_$1951_unknown && var_$1763_unknown)
if ((var_$1950_unknown)) {
var_$1950_error = UnknownEventError(null)
} else {
var_$1950_error = null
try {
var_$1950_value = ((if((var_$1951_error == null)) {var_$1951_value} else {throw var_$1951_error}) > (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
} catch {
case var_err : Throwable => {
var_$1950_error = var_err
}
}
}
var_$1950_init = true
var_$1950_changed = true
}
}
var_$1900_changed = false
if ((var_$1950_init && var_$1951_init && var_$1973_init)) {
if ((var_$1950_changed) || (var_$1951_changed) || (var_$1973_changed)) {
var_$1900_unknown = (var_$1950_unknown && var_$1951_unknown && var_$1973_unknown)
if ((var_$1900_unknown)) {
var_$1900_error = UnknownEventError(null)
} else {
var_$1900_error = null
try {
var_$1900_value = (if ((if((var_$1950_error == null)) {var_$1950_value} else {throw var_$1950_error})) (if((var_$1951_error == null)) {var_$1951_value} else {throw var_$1951_error}) else (if((var_$1973_error == null)) {var_$1973_value} else {throw var_$1973_error}))
} catch {
case var_err : Throwable => {
var_$1900_error = var_err
}
}
}
var_$1900_changed = true
}
}
var_value$1827_changed = false
if ((var_stillFulfillableReset$1665_init)) {
if ((var_stillFulfillableReset$1665_changed)) {
var_value$1827_unknown = (var_stillFulfillableReset$1665_unknown)
if ((var_value$1827_unknown)) {
var_value$1827_error = UnknownEventError(null)
} else {
var_value$1827_error = null
try {
var_value$1827_value = var_$1794.apply((if((var_stillFulfillableReset$1665_error == null)) {var_stillFulfillableReset$1665_value} else {throw var_stillFulfillableReset$1665_error}))
} catch {
case var_err : Throwable => {
var_value$1827_error = var_err
}
}
}
var_value$1827_init = true
var_value$1827_changed = true
}
}

if ((var_$1832_unknown) || (!(var_resets$1686_error == null)) || (var_resets$1686_changed && (0L >= var_resets$1686_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_resets$1686_changed)) {
if ((var_$1724_changed) || (var_$1832_changed)) {
var_$1724_nextTs = (currTs + var_resets$1686_value)
}
} else {
if ((var_$1832_changed)) {
var_$1724_nextTs = -1L
}
}
}
if ((var_eventList2$1692_unknown) || (!(var_$1900_error == null)) || (var_$1900_changed && (0L >= var_$1900_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1900_changed)) {
if ((var_safeDelay$1784_changed) || (var_eventList2$1692_changed)) {
var_safeDelay$1784_nextTs = (currTs + var_$1900_value)
}
} else {
if ((var_eventList2$1692_changed)) {
var_safeDelay$1784_nextTs = -1L
}
}
}
if ((var_$1850_changed && var_$1850_init)) {
out_final.apply(var_$1850_value, currTs, "final", var_$1850_error)
}
if ((var_value$1827_changed && var_value$1827_init)) {
out_value.apply(var_value$1827_value, currTs, "value", var_value$1827_error)
}
var_event0_changed = false
var_event1_changed = false
var_event2_changed = false

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
