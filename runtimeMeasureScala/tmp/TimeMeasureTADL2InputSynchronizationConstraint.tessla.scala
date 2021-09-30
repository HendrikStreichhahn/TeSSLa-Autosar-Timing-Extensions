//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1853 : scala.Function1[List[Any], Any] = ((var_list$1881 : List[Any]) => {
val var_$1882 : Any = var_list$1881(0L.asInstanceOf[Int])
var_$1882
})
val var_min$1894 : scala.Function2[Long, Long, Long] = ((var_a$1917 : Long, var_b$1918 : Long) => {
val var_$1919 : Long = (if ((var_a$1917 < var_b$1918)) var_a$1917 else var_b$1918)
var_$1919
})
var var_timeOldestEvent$1877 : scala.Function3[Map[Long, Map[Long, Long]], Long, List[Long], Long] = null
val var_max$1911 : scala.Function2[Long, Long, Long] = ((var_a$1921 : Long, var_b$1922 : Long) => {
val var_$1923 : Long = (if ((var_a$1921 > var_b$1922)) var_a$1921 else var_b$1922)
var_$1923
})
var var_timeYoungestEvent$1879 : scala.Function3[Map[Long, Map[Long, Long]], Long, List[Long], Long] = null
var var_clusterFulfilledRec$1829 : scala.Function4[Map[Long, Map[Long, Long]], List[Long], Long, Long, Boolean] = null
val var_clusterFulfilled$1771 : scala.Function3[Map[Long, Map[Long, Long]], Long, Long, Boolean] = ((var_latestEventTimes$1825 : Map[Long, Map[Long, Long]], var_color$1826 : Long, var_tolerance$1827 : Long) => {
var var_$1828 : Boolean = false
var_$1828 = var_clusterFulfilledRec$1829.apply(var_latestEventTimes$1825, var_latestEventTimes$1825.keys.toList, var_color$1826, var_tolerance$1827)
var_$1828
})
var var_addEventsToEmptylatestEventTimesRec$1823 : scala.Function4[Map[Long, Map[Long, Long]], Long, Map[Long, Long], List[Long], Map[Long, Map[Long, Long]]] = null
val var_addEventsToEmptylatestEventTimes$1765 : scala.Function3[Map[Long, Map[Long, Long]], Long, Map[Long, Long], Map[Long, Map[Long, Long]]] = ((var_latestEventTimes$1819 : Map[Long, Map[Long, Long]], var_timeNow$1820 : Long, var_eventStreamIndices$1821 : Map[Long, Long]) => {
var var_$1822 : Map[Long, Map[Long, Long]] = Map[Long, Map[Long, Long]]()
var_$1822 = var_addEventsToEmptylatestEventTimesRec$1823.apply(var_latestEventTimes$1819, var_timeNow$1820, var_eventStreamIndices$1821, var_eventStreamIndices$1821.keys.toList)
var_$1822
})
val var_$1799 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1837 : (Boolean, Boolean)) => {
val var_$1838 : Boolean = var_$1837._2
var_$1838
})
val var_$1818 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1841 : (Boolean, Boolean)) => {
val var_$1842 : Boolean = var_$1841._1
var_$1842
})
val var_$1777 : (Boolean, Boolean) = (true, false)
val var_$1744 : Map[Long, Long] = Map[Long, Long]()
val var_$1763 : Map[Long, Map[Long, Long]] = (((Map[Long, Map[Long, Long]]() + ((3L) -> (Map[Long, Long]()))) + ((2L) -> (Map[Long, Long]()))) + ((1L) -> (Map[Long, Long]())))
val var_$1774 : (Boolean, Boolean) = (false, true)
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_stimulus1_error : Throwable = null
val var_stimulus1_unknown : Boolean = false
var set_var_stimulus1 : scala.Function2[Long, Long, Unit] = null
var var_stimulus1_value : Long = 0L
var var_stimulus1_ts : Long = 0L
var var_stimulus1_changed : Boolean = false
val var_stimulus3_error : Throwable = null
val var_stimulus3_unknown : Boolean = false
var set_var_stimulus3 : scala.Function2[Long, Long, Unit] = null
var var_stimulus3_value : Long = 0L
var var_stimulus3_ts : Long = 0L
var var_stimulus3_changed : Boolean = false
var set_var_endOfStreams : scala.Function2[Long, Long, Unit] = null
var var_endOfStreams_changed : Boolean = false
val var_response_error : Throwable = null
val var_response_unknown : Boolean = false
var set_var_response : scala.Function2[Long, Long, Unit] = null
var var_response_value : Long = 0L
var var_response_ts : Long = 0L
var var_response_changed : Boolean = false
val var_stimulus2_error : Throwable = null
val var_stimulus2_unknown : Boolean = false
var set_var_stimulus2 : scala.Function2[Long, Long, Unit] = null
var var_stimulus2_value : Long = 0L
var var_stimulus2_ts : Long = 0L
var var_stimulus2_changed : Boolean = false

var_timeOldestEvent$1877 = ((var_latestEvents$1883 : Map[Long, Map[Long, Long]], var_color$1884 : Long, var_remainingKeys$1885 : List[Long]) => {
lazy val var_$1891 : Map[Long, Long] = var_latestEvents$1883((var_head$1853.apply((var_remainingKeys$1885).asInstanceOf[List[Any]])).asInstanceOf[Long])
var var_$1886 : Long = 0L
var_$1886 = (if ((var_remainingKeys$1885.size == 0L)) 9223372036854775807L else (if (var_$1891.contains(var_color$1884)) var_min$1894.apply(var_$1891(var_color$1884), var_timeOldestEvent$1877.apply(var_latestEvents$1883, var_color$1884, var_remainingKeys$1885.tail)) else -9223372036854775807L))
var_$1886
})
var_timeYoungestEvent$1879 = ((var_latestEvents$1900 : Map[Long, Map[Long, Long]], var_color$1901 : Long, var_remainingKeys$1902 : List[Long]) => {
lazy val var_$1908 : Map[Long, Long] = var_latestEvents$1900((var_head$1853.apply((var_remainingKeys$1902).asInstanceOf[List[Any]])).asInstanceOf[Long])
var var_$1903 : Long = 0L
var_$1903 = (if ((var_remainingKeys$1902.size == 0L)) -9223372036854775807L else (if (var_$1908.contains(var_color$1901)) var_max$1911.apply(var_$1908(var_color$1901), var_timeYoungestEvent$1879.apply(var_latestEvents$1900, var_color$1901, var_remainingKeys$1902.tail)) else 9223372036854775807L))
var_$1903
})
var_clusterFulfilledRec$1829 = ((var_latestEventTimes$1865 : Map[Long, Map[Long, Long]], var_remainingKeys$1866 : List[Long], var_color$1867 : Long, var_tolerance$1868 : Long) => {
var var_$1869 : Boolean = false
var_$1869 = (if ((var_remainingKeys$1866.size == 0L)) true else (((var_timeOldestEvent$1877.apply(var_latestEventTimes$1865, var_color$1867, var_remainingKeys$1866) + var_tolerance$1868) >= var_timeYoungestEvent$1879.apply(var_latestEventTimes$1865, var_color$1867, var_remainingKeys$1866)) && var_clusterFulfilledRec$1829.apply(var_latestEventTimes$1865, var_remainingKeys$1866.tail, var_color$1867, var_tolerance$1868)))
var_$1869
})
var_addEventsToEmptylatestEventTimesRec$1823 = ((var_latestEventTimes$1843 : Map[Long, Map[Long, Long]], var_timeNow$1844 : Long, var_eventStreamIndices$1845 : Map[Long, Long], var_remainingKeys$1846 : List[Long]) => {
lazy val var_$1856 : List[Long] = var_remainingKeys$1846.tail
lazy val var_$1858 : Long = (var_head$1853.apply((var_remainingKeys$1846).asInstanceOf[List[Any]])).asInstanceOf[Long]
var var_$1847 : Map[Long, Map[Long, Long]] = Map[Long, Map[Long, Long]]()
var_$1847 = (if ((var_remainingKeys$1846.size == 0L)) var_latestEventTimes$1843 else (if ((var_$1858 == 0L)) var_addEventsToEmptylatestEventTimesRec$1823.apply(var_latestEventTimes$1843, var_timeNow$1844, var_eventStreamIndices$1845, var_$1856) else var_addEventsToEmptylatestEventTimesRec$1823.apply((var_latestEventTimes$1843 + ((var_$1858) -> ((var_latestEventTimes$1843(var_$1858) + ((var_eventStreamIndices$1845(var_$1858)) -> (var_timeNow$1844)))))), var_timeNow$1844, var_eventStreamIndices$1845, var_$1856)))
var_$1847
})
out_value = null
out_final = null
set_var_stimulus1 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stimulus1_changed))) {
var_stimulus1_value = value
var_stimulus1_ts = ts
var_stimulus1_changed = true
}
})
set_var_stimulus3 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stimulus3_changed))) {
var_stimulus3_value = value
var_stimulus3_ts = ts
var_stimulus3_changed = true
}
})
set_var_endOfStreams = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_endOfStreams_changed))) {
var_endOfStreams_changed = true
}
})
set_var_response = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_response_changed))) {
var_response_value = value
var_response_ts = ts
var_response_changed = true
}
})
set_var_stimulus2 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stimulus2_changed))) {
var_stimulus2_value = value
var_stimulus2_ts = ts
var_stimulus2_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
val var_$1776_value : (Boolean, Boolean) = (false, false)
val var_$1776_error : Throwable = null
val var_$1776_changed : Boolean = false
val var_$1776_unknown : Boolean = false
var var_$1775_changed : Boolean = true
var var_$1775_value : (Boolean, Boolean) = var_$1777
var var_$1775_init : Boolean = true
var var_$1775_error : Throwable = null
var var_$1775_unknown : Boolean = false
var var_$1714_changed : Boolean = false
var var_$1714_value : Long = 0L
var var_$1714_unknown : Boolean = false
var var_$1714_error : Throwable = null
var var_defaultTime$1711_changed : Boolean = true
var var_defaultTime$1711_value : Long = -1L
var var_defaultTime$1711_init : Boolean = true
var var_defaultTime$1711_error : Throwable = null
var var_defaultTime$1711_unknown : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_value : Long = 0L
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1718_changed : Boolean = false
var var_$1718_value : Long = 0L
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_$1719_changed : Boolean = false
var var_$1719_value : Long = 0L
var var_$1719_unknown : Boolean = false
var var_$1719_error : Throwable = null
var var_$1717_changed : Boolean = false
var var_$1717_unknown : Boolean = false
var var_$1717_value : Long = 0L
var var_$1717_error : Throwable = null
var var_$1715_changed : Boolean = false
var var_$1715_unknown : Boolean = false
var var_$1715_value : Long = 0L
var var_$1715_error : Throwable = null
var var_timeNow$1713_changed : Boolean = false
var var_timeNow$1713_init : Boolean = false
var var_timeNow$1713_unknown : Boolean = false
var var_timeNow$1713_value : Long = 0L
var var_timeNow$1713_error : Throwable = null
var var_$1710_changed : Boolean = false
var var_$1710_unknown : Boolean = false
var var_$1710_error : Throwable = null
var var_$1710_value : Boolean = false
var var_$1710_init : Boolean = false
var var_defaultTime$1723_changed : Boolean = true
var var_defaultTime$1723_value : Long = -1L
var var_defaultTime$1723_init : Boolean = true
var var_defaultTime$1723_error : Throwable = null
var var_defaultTime$1723_unknown : Boolean = false
var var_$1722_changed : Boolean = false
var var_$1722_unknown : Boolean = false
var var_$1722_error : Throwable = null
var var_$1722_value : Boolean = false
var var_$1722_init : Boolean = false
var var_defaultTime$1728_changed : Boolean = true
var var_defaultTime$1728_value : Long = -1L
var var_defaultTime$1728_init : Boolean = true
var var_defaultTime$1728_error : Throwable = null
var var_defaultTime$1728_unknown : Boolean = false
var var_$1727_changed : Boolean = false
var var_$1727_unknown : Boolean = false
var var_$1727_error : Throwable = null
var var_$1727_value : Boolean = false
var var_$1727_init : Boolean = false
var var_defaultTime$1733_changed : Boolean = true
var var_defaultTime$1733_value : Long = -1L
var var_defaultTime$1733_init : Boolean = true
var var_defaultTime$1733_error : Throwable = null
var var_defaultTime$1733_unknown : Boolean = false
var var_$1732_changed : Boolean = false
var var_$1732_unknown : Boolean = false
var var_$1732_error : Throwable = null
var var_$1732_value : Boolean = false
var var_$1732_init : Boolean = false
val var_$1737_value : Map[Long, Long] = Map[Long, Long]()
val var_$1737_error : Throwable = null
val var_$1737_changed : Boolean = false
val var_$1737_unknown : Boolean = false
var var_$1736_changed : Boolean = true
var var_$1736_value : Map[Long, Long] = var_$1744
var var_$1736_init : Boolean = true
var var_$1736_error : Throwable = null
var var_$1736_unknown : Boolean = false
val var_$1770_value : Long = 0L
val var_$1770_error : Throwable = null
val var_$1770_changed : Boolean = false
val var_$1770_unknown : Boolean = false
var var_$1767_changed : Boolean = true
var var_$1767_value : Long = 0L
var var_$1767_init : Boolean = true
var var_$1767_error : Throwable = null
var var_$1767_unknown : Boolean = false
var var_$1741_changed : Boolean = true
var var_$1741_value : Long = -1L
var var_$1741_init : Boolean = true
var var_$1741_error : Throwable = null
var var_$1741_unknown : Boolean = false
var var_$1735_changed : Boolean = false
var var_$1735_unknown : Boolean = false
var var_$1735_error : Throwable = null
var var_$1735_value : Map[Long, Long] = Map[Long, Long]()
var var_$1735_init : Boolean = false
var var_eventResponse$1731_changed : Boolean = false
var var_eventResponse$1731_unknown : Boolean = false
var var_eventResponse$1731_error : Throwable = null
var var_eventResponse$1731_value : Map[Long, Long] = Map[Long, Long]()
var var_eventResponse$1731_init : Boolean = false
var var_$1745_changed : Boolean = true
var var_$1745_value : Long = 1L
var var_$1745_init : Boolean = true
var var_$1745_error : Throwable = null
var var_$1745_unknown : Boolean = false
var var_$1747_changed : Boolean = true
var var_$1747_value : Long = -1L
var var_$1747_init : Boolean = true
var var_$1747_error : Throwable = null
var var_$1747_unknown : Boolean = false
var var_$1730_changed : Boolean = false
var var_$1730_unknown : Boolean = false
var var_$1730_error : Throwable = null
var var_$1730_value : Map[Long, Long] = Map[Long, Long]()
var var_$1730_init : Boolean = false
var var_eventStimulus1$1726_changed : Boolean = false
var var_eventStimulus1$1726_unknown : Boolean = false
var var_eventStimulus1$1726_error : Throwable = null
var var_eventStimulus1$1726_value : Map[Long, Long] = Map[Long, Long]()
var var_eventStimulus1$1726_init : Boolean = false
var var_$1748_changed : Boolean = true
var var_$1748_value : Long = 2L
var var_$1748_init : Boolean = true
var var_$1748_error : Throwable = null
var var_$1748_unknown : Boolean = false
var var_$1750_changed : Boolean = true
var var_$1750_value : Long = -1L
var var_$1750_init : Boolean = true
var var_$1750_error : Throwable = null
var var_$1750_unknown : Boolean = false
var var_$1725_changed : Boolean = false
var var_$1725_unknown : Boolean = false
var var_$1725_error : Throwable = null
var var_$1725_value : Map[Long, Long] = Map[Long, Long]()
var var_$1725_init : Boolean = false
var var_eventStimulus2$1721_changed : Boolean = false
var var_eventStimulus2$1721_unknown : Boolean = false
var var_eventStimulus2$1721_error : Throwable = null
var var_eventStimulus2$1721_value : Map[Long, Long] = Map[Long, Long]()
var var_eventStimulus2$1721_init : Boolean = false
var var_$1751_changed : Boolean = true
var var_$1751_value : Long = 3L
var var_$1751_init : Boolean = true
var var_$1751_error : Throwable = null
var var_$1751_unknown : Boolean = false
var var_$1753_changed : Boolean = true
var var_$1753_value : Long = -1L
var var_$1753_init : Boolean = true
var var_$1753_error : Throwable = null
var var_$1753_unknown : Boolean = false
var var_$1720_changed : Boolean = false
var var_$1720_unknown : Boolean = false
var var_$1720_error : Throwable = null
var var_$1720_value : Map[Long, Long] = Map[Long, Long]()
var var_$1720_init : Boolean = false
var var_eventStimulus3$1709_changed : Boolean = false
var var_eventStimulus3$1709_unknown : Boolean = false
var var_eventStimulus3$1709_error : Throwable = null
var var_eventStimulus3$1709_value : Map[Long, Long] = Map[Long, Long]()
var var_eventStimulus3$1709_init : Boolean = false
var var_eventStimulus3$1709_ts : Long = 0L
var var_$1766_changed : Boolean = false
var var_$1766_unknown : Boolean = false
var var_$1766_error : Throwable = null
var var_$1766_value : Long = 0L
var var_$1766_init : Boolean = false
var var_$1708_changed : Boolean = false
var var_$1708_unknown : Boolean = false
var var_$1708_error : Throwable = null
var var_$1708_value : Boolean = false
var var_$1708_init : Boolean = false
var var_latestEventTimes$1764_changed : Boolean = false
var var_latestEventTimes$1764_value : Long = 0L
var var_latestEventTimes$1764_init : Boolean = false
var var_latestEventTimes$1764_unknown : Boolean = false
var var_latestEventTimes$1764_error : Throwable = null
var var_$1760_changed : Boolean = false
var var_$1760_unknown : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_value : Map[Long, Map[Long, Long]] = Map[Long, Map[Long, Long]]()
var var_latestEventTimes$1759_changed : Boolean = true
var var_latestEventTimes$1759_value : Map[Long, Map[Long, Long]] = var_$1763
var var_latestEventTimes$1759_init : Boolean = true
var var_latestEventTimes$1759_error : Throwable = null
var var_latestEventTimes$1759_unknown : Boolean = false
var var_$1761_changed : Boolean = false
var var_$1761_lastValue : Map[Long, Map[Long, Long]] = Map[Long, Map[Long, Long]]()
var var_$1761_lastInit : Boolean = false
var var_$1761_lastError : Throwable = null
var var_$1761_unknown : Boolean = false
var var_$1761_error : Throwable = null
var var_$1761_value : Map[Long, Map[Long, Long]] = Map[Long, Map[Long, Long]]()
var var_$1761_init : Boolean = false
var var_$1761_ts : Long = 0L
var var_$1769_changed : Boolean = true
var var_$1769_value : Long = 5L
var var_$1769_init : Boolean = true
var var_$1769_error : Throwable = null
var var_$1769_unknown : Boolean = false
var var_$1757_changed : Boolean = false
var var_$1757_unknown : Boolean = false
var var_$1757_error : Throwable = null
var var_$1757_value : Boolean = false
var var_$1757_init : Boolean = false
var var_$1772_changed : Boolean = true
var var_$1772_value : (Boolean, Boolean) = var_$1774
var var_$1772_init : Boolean = true
var var_$1772_error : Throwable = null
var var_$1772_unknown : Boolean = false
var var_$1756_changed : Boolean = false
var var_$1756_unknown : Boolean = false
var var_$1756_error : Throwable = null
var var_$1756_value : (Boolean, Boolean) = (false, false)
var var_$1756_init : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1707_value : (Boolean, Boolean) = (false, false)
var var_$1707_init : Boolean = false
var var_$1707_ts : Long = 0L
var var_$1789_changed : Boolean = false
var var_$1789_init : Boolean = false
var var_$1789_unknown : Boolean = false
var var_$1789_error : Throwable = null
var var_$1789_value : Boolean = false
var var_$1706_changed : Boolean = false
var var_$1706_unknown : Boolean = false
var var_$1706_error : Throwable = null
var var_$1706_value : Boolean = false
var var_$1706_init : Boolean = false
val var_$1810_value : Boolean = false
val var_$1810_error : Throwable = null
val var_$1810_changed : Boolean = false
val var_$1810_unknown : Boolean = false
var var_$1795_changed : Boolean = true
var var_$1795_value : Boolean = true
var var_$1795_init : Boolean = true
var var_$1795_error : Throwable = null
var var_$1795_unknown : Boolean = false
var var_$1792_changed : Boolean = false
var var_$1792_unknown : Boolean = false
var var_$1792_error : Throwable = null
var var_$1792_value : Boolean = false
var var_$1792_init : Boolean = false
var var_$1798_changed : Boolean = false
var var_$1798_unknown : Boolean = false
var var_$1798_error : Throwable = null
var var_$1798_value : Boolean = false
var var_$1798_init : Boolean = false
var var_$1809_changed : Boolean = true
var var_$1809_value : Boolean = false
var var_$1809_init : Boolean = true
var var_$1809_error : Throwable = null
var var_$1809_unknown : Boolean = false
var var_$1797_changed : Boolean = false
var var_$1797_unknown : Boolean = false
var var_$1797_error : Throwable = null
var var_$1797_value : Boolean = false
var var_$1797_init : Boolean = false
var var_$1791_changed : Boolean = false
var var_$1791_unknown : Boolean = false
var var_$1791_error : Throwable = null
var var_$1791_value : Boolean = false
var var_$1791_init : Boolean = false
var var_isFinalFalse$1788_changed : Boolean = false
var var_isFinalFalse$1788_unknown : Boolean = false
var var_isFinalFalse$1788_error : Throwable = null
var var_isFinalFalse$1788_value : Boolean = false
var var_$1805_changed : Boolean = true
var var_$1805_lastValue : Boolean = false
var var_$1805_lastInit : Boolean = false
var var_$1805_lastError : Throwable = null
var var_$1805_value : Boolean = false
var var_$1805_init : Boolean = true
var var_$1805_ts : Long = 0L
var var_$1805_error : Throwable = null
var var_$1805_unknown : Boolean = false
var var_$1782_changed : Boolean = false
var var_$1782_unknown : Boolean = false
var var_$1782_error : Throwable = null
var var_$1782_value : Boolean = false
var var_$1782_init : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : Boolean = false
var var_$1705_init : Boolean = false
var var_prev$1786_changed : Boolean = false
var var_prev$1786_init : Boolean = false
var var_prev$1786_unknown : Boolean = false
var var_prev$1786_error : Throwable = null
var var_prev$1786_value : Boolean = false
var var_$1785_changed : Boolean = false
var var_$1785_unknown : Boolean = false
var var_$1785_error : Throwable = null
var var_$1785_value : Boolean = false
var var_$1785_init : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : Boolean = false
var var_$1704_init : Boolean = false
var var_$1802_changed : Boolean = false
var var_$1802_value : Long = 0L
var var_$1802_init : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1803_changed : Boolean = false
var var_$1803_init : Boolean = false
var var_$1803_unknown : Boolean = false
var var_$1803_error : Throwable = null
var var_$1803_value : Long = 0L
var var_finalFalseSince$1703_changed : Boolean = false
var var_finalFalseSince$1703_unknown : Boolean = false
var var_finalFalseSince$1703_error : Throwable = null
var var_finalFalseSince$1703_value : Long = 0L
var var_$1804_changed : Boolean = true
var var_$1804_lastValue : Long = 0L
var var_$1804_lastInit : Boolean = false
var var_$1804_lastError : Throwable = null
var var_$1804_value : Long = 9223372036854775807L
var var_$1804_init : Boolean = true
var var_$1804_ts : Long = 0L
var var_$1804_error : Throwable = null
var var_$1804_unknown : Boolean = false
var var_$1806_changed : Boolean = true
var var_$1806_value : Long = 9223372036854775807L
var var_$1806_init : Boolean = true
var var_$1806_error : Throwable = null
var var_$1806_unknown : Boolean = false
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
var var_isFinalFalseReset$1699_changed : Boolean = false
var var_isFinalFalseReset$1699_unknown : Boolean = false
var var_isFinalFalseReset$1699_error : Throwable = null
var var_isFinalFalseReset$1699_value : Boolean = false
var var_$1790_changed : Boolean = false
var var_$1790_lastValue : Boolean = false
var var_$1790_lastInit : Boolean = false
var var_$1790_lastError : Throwable = null
var var_$1790_init : Boolean = false
var var_$1790_ts : Long = 0L
var var_$1790_unknown : Boolean = false
var var_$1790_value : Boolean = false
var var_$1790_error : Throwable = null
var var_stillFulfillableReset$1697_changed : Boolean = false
var var_stillFulfillableReset$1697_unknown : Boolean = false
var var_stillFulfillableReset$1697_error : Throwable = null
var var_stillFulfillableReset$1697_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1697_init : Boolean = false
var var_final$1817_changed : Boolean = false
var var_final$1817_unknown : Boolean = false
var var_final$1817_error : Throwable = null
var var_final$1817_value : Boolean = false
var var_final$1817_init : Boolean = false
var var_value$1696_changed : Boolean = false
var var_value$1696_unknown : Boolean = false
var var_value$1696_error : Throwable = null
var var_value$1696_value : Boolean = false
var var_value$1696_init : Boolean = false



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



        if (currTs == newInputTs) {
          doProcessing = false
        } else {

if ((!(currTs == 0L))) {
var_$1775_changed = false
}
if ((var_$1776_changed)) {
var_$1775_value = var_$1776_value
var_$1775_init = true
var_$1775_error = var_$1776_error
var_$1775_changed = true
var_$1775_unknown = var_$1776_unknown
}
var_$1714_changed = false
if ((var_stimulus3_changed)) {
var_$1714_value = var_stimulus3_ts
var_$1714_unknown = var_stimulus3_unknown
if ((var_$1714_unknown)) {
var_$1714_error = var_stimulus3_error
} else {
var_$1714_error = null
}
var_$1714_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1711_changed = false
}
if ((var_$1714_changed)) {
var_defaultTime$1711_value = var_$1714_value
var_defaultTime$1711_init = true
var_defaultTime$1711_error = var_$1714_error
var_defaultTime$1711_changed = true
var_defaultTime$1711_unknown = var_$1714_unknown
}
var_$1724_changed = false
if ((var_stimulus2_changed)) {
var_$1724_value = var_stimulus2_ts
var_$1724_unknown = var_stimulus2_unknown
if ((var_$1724_unknown)) {
var_$1724_error = var_stimulus2_error
} else {
var_$1724_error = null
}
var_$1724_changed = true
}
var_$1718_changed = false
if ((var_stimulus1_changed)) {
var_$1718_value = var_stimulus1_ts
var_$1718_unknown = var_stimulus1_unknown
if ((var_$1718_unknown)) {
var_$1718_error = var_stimulus1_error
} else {
var_$1718_error = null
}
var_$1718_changed = true
}
var_$1719_changed = false
if ((var_response_changed)) {
var_$1719_value = var_response_ts
var_$1719_unknown = var_response_unknown
if ((var_$1719_unknown)) {
var_$1719_error = var_response_error
} else {
var_$1719_error = null
}
var_$1719_changed = true
}
var_$1717_changed = false
if ((var_$1718_changed) || (var_$1719_changed)) {
var_$1717_changed = true
var_$1717_unknown = (var_$1718_unknown && var_$1719_unknown)
if ((var_$1718_changed)) {
var_$1717_value = var_$1718_value
var_$1717_error = var_$1718_error
} else {
if ((var_$1719_changed)) {
var_$1717_value = var_$1719_value
var_$1717_error = var_$1719_error
}
}
}
var_$1715_changed = false
if ((var_$1724_changed) || (var_$1717_changed)) {
var_$1715_changed = true
var_$1715_unknown = (var_$1724_unknown && var_$1717_unknown)
if ((var_$1724_changed)) {
var_$1715_value = var_$1724_value
var_$1715_error = var_$1724_error
} else {
if ((var_$1717_changed)) {
var_$1715_value = var_$1717_value
var_$1715_error = var_$1717_error
}
}
}
var_timeNow$1713_changed = false
if ((var_$1714_changed) || (var_$1715_changed)) {
var_timeNow$1713_init = true
var_timeNow$1713_changed = true
var_timeNow$1713_unknown = (var_$1714_unknown && var_$1715_unknown)
if ((var_$1714_changed)) {
var_timeNow$1713_value = var_$1714_value
var_timeNow$1713_error = var_$1714_error
} else {
if ((var_$1715_changed)) {
var_timeNow$1713_value = var_$1715_value
var_timeNow$1713_error = var_$1715_error
}
}
}
var_$1710_changed = false
if ((var_defaultTime$1711_init && var_timeNow$1713_init)) {
if ((var_defaultTime$1711_changed) || (var_timeNow$1713_changed)) {
var_$1710_unknown = (var_defaultTime$1711_unknown && var_timeNow$1713_unknown)
if ((var_$1710_unknown)) {
var_$1710_error = UnknownEventError(null)
} else {
var_$1710_error = null
try {
var_$1710_value = ((if((var_defaultTime$1711_error == null)) {var_defaultTime$1711_value} else {throw var_defaultTime$1711_error}) >= (if((var_timeNow$1713_error == null)) {var_timeNow$1713_value} else {throw var_timeNow$1713_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$1723_changed = false
}
if ((var_$1724_changed)) {
var_defaultTime$1723_value = var_$1724_value
var_defaultTime$1723_init = true
var_defaultTime$1723_error = var_$1724_error
var_defaultTime$1723_changed = true
var_defaultTime$1723_unknown = var_$1724_unknown
}
var_$1722_changed = false
if ((var_defaultTime$1723_init && var_timeNow$1713_init)) {
if ((var_defaultTime$1723_changed) || (var_timeNow$1713_changed)) {
var_$1722_unknown = (var_defaultTime$1723_unknown && var_timeNow$1713_unknown)
if ((var_$1722_unknown)) {
var_$1722_error = UnknownEventError(null)
} else {
var_$1722_error = null
try {
var_$1722_value = ((if((var_defaultTime$1723_error == null)) {var_defaultTime$1723_value} else {throw var_defaultTime$1723_error}) >= (if((var_timeNow$1713_error == null)) {var_timeNow$1713_value} else {throw var_timeNow$1713_error}))
} catch {
case var_err : Throwable => {
var_$1722_error = var_err
}
}
}
var_$1722_init = true
var_$1722_changed = true
}
}
if ((!(currTs == 0L))) {
var_defaultTime$1728_changed = false
}
if ((var_$1718_changed)) {
var_defaultTime$1728_value = var_$1718_value
var_defaultTime$1728_init = true
var_defaultTime$1728_error = var_$1718_error
var_defaultTime$1728_changed = true
var_defaultTime$1728_unknown = var_$1718_unknown
}
var_$1727_changed = false
if ((var_defaultTime$1728_init && var_timeNow$1713_init)) {
if ((var_defaultTime$1728_changed) || (var_timeNow$1713_changed)) {
var_$1727_unknown = (var_defaultTime$1728_unknown && var_timeNow$1713_unknown)
if ((var_$1727_unknown)) {
var_$1727_error = UnknownEventError(null)
} else {
var_$1727_error = null
try {
var_$1727_value = ((if((var_defaultTime$1728_error == null)) {var_defaultTime$1728_value} else {throw var_defaultTime$1728_error}) >= (if((var_timeNow$1713_error == null)) {var_timeNow$1713_value} else {throw var_timeNow$1713_error}))
} catch {
case var_err : Throwable => {
var_$1727_error = var_err
}
}
}
var_$1727_init = true
var_$1727_changed = true
}
}
if ((!(currTs == 0L))) {
var_defaultTime$1733_changed = false
}
if ((var_$1719_changed)) {
var_defaultTime$1733_value = var_$1719_value
var_defaultTime$1733_init = true
var_defaultTime$1733_error = var_$1719_error
var_defaultTime$1733_changed = true
var_defaultTime$1733_unknown = var_$1719_unknown
}
var_$1732_changed = false
if ((var_defaultTime$1733_init && var_timeNow$1713_init)) {
if ((var_defaultTime$1733_changed) || (var_timeNow$1713_changed)) {
var_$1732_unknown = (var_defaultTime$1733_unknown && var_timeNow$1713_unknown)
if ((var_$1732_unknown)) {
var_$1732_error = UnknownEventError(null)
} else {
var_$1732_error = null
try {
var_$1732_value = ((if((var_defaultTime$1733_error == null)) {var_defaultTime$1733_value} else {throw var_defaultTime$1733_error}) >= (if((var_timeNow$1713_error == null)) {var_timeNow$1713_value} else {throw var_timeNow$1713_error}))
} catch {
case var_err : Throwable => {
var_$1732_error = var_err
}
}
}
var_$1732_init = true
var_$1732_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1736_changed = false
}
if ((var_$1737_changed)) {
var_$1736_value = var_$1737_value
var_$1736_init = true
var_$1736_error = var_$1737_error
var_$1736_changed = true
var_$1736_unknown = var_$1737_unknown
}
if ((!(currTs == 0L))) {
var_$1767_changed = false
}
if ((var_$1770_changed)) {
var_$1767_value = var_$1770_value
var_$1767_init = true
var_$1767_error = var_$1770_error
var_$1767_changed = true
var_$1767_unknown = var_$1770_unknown
}
if ((!(currTs == 0L))) {
var_$1741_changed = false
}
if ((var_response_changed)) {
var_$1741_value = var_response_value
var_$1741_init = true
var_$1741_error = var_response_error
var_$1741_changed = true
var_$1741_unknown = var_response_unknown
}
var_$1735_changed = false
if ((var_$1736_init && var_$1767_init && var_$1741_init)) {
if ((var_$1736_changed) || (var_$1767_changed) || (var_$1741_changed)) {
var_$1735_unknown = (var_$1736_unknown && var_$1767_unknown && var_$1741_unknown)
if ((var_$1735_unknown)) {
var_$1735_error = UnknownEventError(null)
} else {
var_$1735_error = null
try {
var_$1735_value = ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) + (((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error})) -> ((if((var_$1741_error == null)) {var_$1741_value} else {throw var_$1741_error}))))
} catch {
case var_err : Throwable => {
var_$1735_error = var_err
}
}
}
var_$1735_init = true
var_$1735_changed = true
}
}
var_eventResponse$1731_changed = false
if ((var_$1732_init && var_$1735_init && var_$1736_init)) {
if ((var_$1732_changed) || (var_$1735_changed) || (var_$1736_changed)) {
var_eventResponse$1731_unknown = (var_$1732_unknown && var_$1735_unknown && var_$1736_unknown)
if ((var_eventResponse$1731_unknown)) {
var_eventResponse$1731_error = UnknownEventError(null)
} else {
var_eventResponse$1731_error = null
try {
var_eventResponse$1731_value = (if ((if((var_$1732_error == null)) {var_$1732_value} else {throw var_$1732_error})) (if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}) else (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}))
} catch {
case var_err : Throwable => {
var_eventResponse$1731_error = var_err
}
}
}
var_eventResponse$1731_init = true
var_eventResponse$1731_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1745_changed = false
}
if ((var_$1770_changed)) {
var_$1745_value = var_$1770_value
var_$1745_init = true
var_$1745_error = var_$1770_error
var_$1745_changed = true
var_$1745_unknown = var_$1770_unknown
}
if ((!(currTs == 0L))) {
var_$1747_changed = false
}
if ((var_stimulus1_changed)) {
var_$1747_value = var_stimulus1_value
var_$1747_init = true
var_$1747_error = var_stimulus1_error
var_$1747_changed = true
var_$1747_unknown = var_stimulus1_unknown
}
var_$1730_changed = false
if ((var_eventResponse$1731_init && var_$1745_init && var_$1747_init)) {
if ((var_eventResponse$1731_changed) || (var_$1745_changed) || (var_$1747_changed)) {
var_$1730_unknown = (var_eventResponse$1731_unknown && var_$1745_unknown && var_$1747_unknown)
if ((var_$1730_unknown)) {
var_$1730_error = UnknownEventError(null)
} else {
var_$1730_error = null
try {
var_$1730_value = ((if((var_eventResponse$1731_error == null)) {var_eventResponse$1731_value} else {throw var_eventResponse$1731_error}) + (((if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error})) -> ((if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error}))))
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
var_eventStimulus1$1726_changed = false
if ((var_$1727_init && var_$1730_init && var_eventResponse$1731_init)) {
if ((var_$1727_changed) || (var_$1730_changed) || (var_eventResponse$1731_changed)) {
var_eventStimulus1$1726_unknown = (var_$1727_unknown && var_$1730_unknown && var_eventResponse$1731_unknown)
if ((var_eventStimulus1$1726_unknown)) {
var_eventStimulus1$1726_error = UnknownEventError(null)
} else {
var_eventStimulus1$1726_error = null
try {
var_eventStimulus1$1726_value = (if ((if((var_$1727_error == null)) {var_$1727_value} else {throw var_$1727_error})) (if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}) else (if((var_eventResponse$1731_error == null)) {var_eventResponse$1731_value} else {throw var_eventResponse$1731_error}))
} catch {
case var_err : Throwable => {
var_eventStimulus1$1726_error = var_err
}
}
}
var_eventStimulus1$1726_init = true
var_eventStimulus1$1726_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1748_changed = false
}
if ((var_$1770_changed)) {
var_$1748_value = var_$1770_value
var_$1748_init = true
var_$1748_error = var_$1770_error
var_$1748_changed = true
var_$1748_unknown = var_$1770_unknown
}
if ((!(currTs == 0L))) {
var_$1750_changed = false
}
if ((var_stimulus2_changed)) {
var_$1750_value = var_stimulus2_value
var_$1750_init = true
var_$1750_error = var_stimulus2_error
var_$1750_changed = true
var_$1750_unknown = var_stimulus2_unknown
}
var_$1725_changed = false
if ((var_eventStimulus1$1726_init && var_$1748_init && var_$1750_init)) {
if ((var_eventStimulus1$1726_changed) || (var_$1748_changed) || (var_$1750_changed)) {
var_$1725_unknown = (var_eventStimulus1$1726_unknown && var_$1748_unknown && var_$1750_unknown)
if ((var_$1725_unknown)) {
var_$1725_error = UnknownEventError(null)
} else {
var_$1725_error = null
try {
var_$1725_value = ((if((var_eventStimulus1$1726_error == null)) {var_eventStimulus1$1726_value} else {throw var_eventStimulus1$1726_error}) + (((if((var_$1748_error == null)) {var_$1748_value} else {throw var_$1748_error})) -> ((if((var_$1750_error == null)) {var_$1750_value} else {throw var_$1750_error}))))
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
var_eventStimulus2$1721_changed = false
if ((var_$1722_init && var_$1725_init && var_eventStimulus1$1726_init)) {
if ((var_$1722_changed) || (var_$1725_changed) || (var_eventStimulus1$1726_changed)) {
var_eventStimulus2$1721_unknown = (var_$1722_unknown && var_$1725_unknown && var_eventStimulus1$1726_unknown)
if ((var_eventStimulus2$1721_unknown)) {
var_eventStimulus2$1721_error = UnknownEventError(null)
} else {
var_eventStimulus2$1721_error = null
try {
var_eventStimulus2$1721_value = (if ((if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error})) (if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}) else (if((var_eventStimulus1$1726_error == null)) {var_eventStimulus1$1726_value} else {throw var_eventStimulus1$1726_error}))
} catch {
case var_err : Throwable => {
var_eventStimulus2$1721_error = var_err
}
}
}
var_eventStimulus2$1721_init = true
var_eventStimulus2$1721_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1751_changed = false
}
if ((var_$1770_changed)) {
var_$1751_value = var_$1770_value
var_$1751_init = true
var_$1751_error = var_$1770_error
var_$1751_changed = true
var_$1751_unknown = var_$1770_unknown
}
if ((!(currTs == 0L))) {
var_$1753_changed = false
}
if ((var_stimulus3_changed)) {
var_$1753_value = var_stimulus3_value
var_$1753_init = true
var_$1753_error = var_stimulus3_error
var_$1753_changed = true
var_$1753_unknown = var_stimulus3_unknown
}
var_$1720_changed = false
if ((var_eventStimulus2$1721_init && var_$1751_init && var_$1753_init)) {
if ((var_eventStimulus2$1721_changed) || (var_$1751_changed) || (var_$1753_changed)) {
var_$1720_unknown = (var_eventStimulus2$1721_unknown && var_$1751_unknown && var_$1753_unknown)
if ((var_$1720_unknown)) {
var_$1720_error = UnknownEventError(null)
} else {
var_$1720_error = null
try {
var_$1720_value = ((if((var_eventStimulus2$1721_error == null)) {var_eventStimulus2$1721_value} else {throw var_eventStimulus2$1721_error}) + (((if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error})) -> ((if((var_$1753_error == null)) {var_$1753_value} else {throw var_$1753_error}))))
} catch {
case var_err : Throwable => {
var_$1720_error = var_err
}
}
}
var_$1720_init = true
var_$1720_changed = true
}
}
var_eventStimulus3$1709_changed = false
if ((var_$1710_init && var_$1720_init && var_eventStimulus2$1721_init)) {
if ((var_$1710_changed) || (var_$1720_changed) || (var_eventStimulus2$1721_changed)) {
var_eventStimulus3$1709_unknown = (var_$1710_unknown && var_$1720_unknown && var_eventStimulus2$1721_unknown)
if ((var_eventStimulus3$1709_unknown)) {
var_eventStimulus3$1709_error = UnknownEventError(null)
} else {
var_eventStimulus3$1709_error = null
try {
var_eventStimulus3$1709_value = (if ((if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error})) (if((var_$1720_error == null)) {var_$1720_value} else {throw var_$1720_error}) else (if((var_eventStimulus2$1721_error == null)) {var_eventStimulus2$1721_value} else {throw var_eventStimulus2$1721_error}))
} catch {
case var_err : Throwable => {
var_eventStimulus3$1709_error = var_err
}
}
}
var_eventStimulus3$1709_init = true
var_eventStimulus3$1709_ts = currTs
var_eventStimulus3$1709_changed = true
}
}
var_$1766_changed = false
if ((var_eventStimulus3$1709_init && var_$1767_init)) {
if ((var_eventStimulus3$1709_changed) || (var_$1767_changed)) {
var_$1766_unknown = (var_eventStimulus3$1709_unknown && var_$1767_unknown)
if ((var_$1766_unknown)) {
var_$1766_error = UnknownEventError(null)
} else {
var_$1766_error = null
try {
var_$1766_value = (if((var_eventStimulus3$1709_error == null)) {var_eventStimulus3$1709_value} else {throw var_eventStimulus3$1709_error})((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error}))
} catch {
case var_err : Throwable => {
var_$1766_error = var_err
}
}
}
var_$1766_init = true
var_$1766_changed = true
}
}
var_$1708_changed = false
if ((var_eventStimulus3$1709_init && var_$1767_init)) {
if ((var_eventStimulus3$1709_changed) || (var_$1767_changed)) {
var_$1708_unknown = (var_eventStimulus3$1709_unknown && var_$1767_unknown)
if ((var_$1708_unknown)) {
var_$1708_error = UnknownEventError(null)
} else {
var_$1708_error = null
try {
var_$1708_value = (if((var_eventStimulus3$1709_error == null)) {var_eventStimulus3$1709_value} else {throw var_eventStimulus3$1709_error}).contains((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error}))
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
var_latestEventTimes$1764_changed = false
if ((var_eventStimulus3$1709_changed)) {
var_latestEventTimes$1764_value = var_eventStimulus3$1709_ts
var_latestEventTimes$1764_init = true
var_latestEventTimes$1764_unknown = var_eventStimulus3$1709_unknown
if ((var_latestEventTimes$1764_unknown)) {
var_latestEventTimes$1764_error = var_eventStimulus3$1709_error
} else {
var_latestEventTimes$1764_error = null
}
var_latestEventTimes$1764_changed = true
}
var_$1760_changed = false
if ((var_latestEventTimes$1764_changed)) {
if ((var_$1761_ts == currTs && var_$1761_lastInit) || (!(var_$1761_ts == currTs) && var_$1761_init)) {
var_$1760_changed = true
var_$1760_unknown = var_latestEventTimes$1764_unknown
if ((var_$1760_unknown)) {
var_$1760_error = var_latestEventTimes$1764_error
} else {
if ((var_$1761_ts == currTs)) {
var_$1760_value = var_$1761_lastValue
var_$1760_error = var_$1761_lastError
} else {
var_$1760_value = var_$1761_value
var_$1760_error = var_$1761_error
}
}
}
}
if ((!(currTs == 0L))) {
var_latestEventTimes$1759_changed = false
}
if ((var_$1760_changed)) {
var_latestEventTimes$1759_value = var_$1760_value
var_latestEventTimes$1759_init = true
var_latestEventTimes$1759_error = var_$1760_error
var_latestEventTimes$1759_changed = true
var_latestEventTimes$1759_unknown = var_$1760_unknown
}
var_$1761_changed = false
if ((var_latestEventTimes$1759_init && var_latestEventTimes$1764_init && var_eventStimulus3$1709_init)) {
if ((var_latestEventTimes$1759_changed) || (var_latestEventTimes$1764_changed) || (var_eventStimulus3$1709_changed)) {
var_$1761_lastValue = var_$1761_value
var_$1761_lastInit = var_$1761_init
var_$1761_lastError = var_$1761_error
var_$1761_unknown = (var_latestEventTimes$1759_unknown && var_latestEventTimes$1764_unknown && var_eventStimulus3$1709_unknown)
if ((var_$1761_unknown)) {
var_$1761_error = UnknownEventError(null)
} else {
var_$1761_error = null
try {
var_$1761_value = var_addEventsToEmptylatestEventTimes$1765.apply((if((var_latestEventTimes$1759_error == null)) {var_latestEventTimes$1759_value} else {throw var_latestEventTimes$1759_error}), (if((var_latestEventTimes$1764_error == null)) {var_latestEventTimes$1764_value} else {throw var_latestEventTimes$1764_error}), (if((var_eventStimulus3$1709_error == null)) {var_eventStimulus3$1709_value} else {throw var_eventStimulus3$1709_error}))
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
if ((!(currTs == 0L))) {
var_$1769_changed = false
}
if ((var_$1770_changed)) {
var_$1769_value = var_$1770_value
var_$1769_init = true
var_$1769_error = var_$1770_error
var_$1769_changed = true
var_$1769_unknown = var_$1770_unknown
}
var_$1757_changed = false
if ((var_$1761_init && var_$1766_init && var_$1769_init)) {
if ((var_$1761_changed) || (var_$1766_changed) || (var_$1769_changed)) {
var_$1757_unknown = (var_$1761_unknown && var_$1766_unknown && var_$1769_unknown)
if ((var_$1757_unknown)) {
var_$1757_error = UnknownEventError(null)
} else {
var_$1757_error = null
try {
var_$1757_value = var_clusterFulfilled$1771.apply((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}), (if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}), (if((var_$1769_error == null)) {var_$1769_value} else {throw var_$1769_error}))
} catch {
case var_err : Throwable => {
var_$1757_error = var_err
}
}
}
var_$1757_init = true
var_$1757_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1772_changed = false
}
if ((var_$1776_changed)) {
var_$1772_value = var_$1776_value
var_$1772_init = true
var_$1772_error = var_$1776_error
var_$1772_changed = true
var_$1772_unknown = var_$1776_unknown
}
var_$1756_changed = false
if ((var_$1757_init && var_$1772_init && var_$1775_init)) {
if ((var_$1757_changed) || (var_$1772_changed) || (var_$1775_changed)) {
var_$1756_unknown = (var_$1757_unknown && var_$1772_unknown && var_$1775_unknown)
if ((var_$1756_unknown)) {
var_$1756_error = UnknownEventError(null)
} else {
var_$1756_error = null
try {
var_$1756_value = (if ((if((var_$1757_error == null)) {var_$1757_value} else {throw var_$1757_error})) (if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error}) else (if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}))
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
var_$1707_changed = false
if ((var_$1708_init && var_$1756_init && var_$1772_init)) {
if ((var_$1708_changed) || (var_$1756_changed) || (var_$1772_changed)) {
var_$1707_unknown = (var_$1708_unknown && var_$1756_unknown && var_$1772_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = (if ((if((var_$1708_error == null)) {var_$1708_value} else {throw var_$1708_error})) (if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error}) else (if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error}))
} catch {
case var_err : Throwable => {
var_$1707_error = var_err
}
}
}
var_$1707_init = true
var_$1707_ts = currTs
var_$1707_changed = true
}
}
var_$1789_changed = false
if ((var_$1707_changed)) {
if ((var_$1790_ts == currTs && var_$1790_lastInit) || (!(var_$1790_ts == currTs) && var_$1790_init)) {
var_$1789_changed = true
var_$1789_init = true
var_$1789_unknown = var_$1707_unknown
if ((var_$1789_unknown)) {
var_$1789_error = var_$1707_error
} else {
if ((var_$1790_ts == currTs)) {
var_$1789_value = var_$1790_lastValue
var_$1789_error = var_$1790_lastError
} else {
var_$1789_value = var_$1790_value
var_$1789_error = var_$1790_error
}
}
}
}
var_$1706_changed = false
if ((var_$1707_init)) {
if ((var_$1707_changed)) {
var_$1706_unknown = (var_$1707_unknown)
if ((var_$1706_unknown)) {
var_$1706_error = UnknownEventError(null)
} else {
var_$1706_error = null
try {
var_$1706_value = var_$1818.apply((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
} catch {
case var_err : Throwable => {
var_$1706_error = var_err
}
}
}
var_$1706_init = true
var_$1706_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1795_changed = false
}
if ((var_$1810_changed)) {
var_$1795_value = var_$1810_value
var_$1795_init = true
var_$1795_error = var_$1810_error
var_$1795_changed = true
var_$1795_unknown = var_$1810_unknown
}
var_$1792_changed = false
if ((var_$1706_init && var_$1795_init)) {
if ((var_$1706_changed) || (var_$1795_changed)) {
var_$1792_unknown = (var_$1706_unknown && var_$1795_unknown)
if ((var_$1792_unknown)) {
var_$1792_error = UnknownEventError(null)
} else {
var_$1792_error = null
try {
var_$1792_value = ((if((var_$1706_error == null)) {var_$1706_value} else {throw var_$1706_error}) == (if((var_$1795_error == null)) {var_$1795_value} else {throw var_$1795_error}))
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
var_$1798_changed = false
if ((var_$1707_init)) {
if ((var_$1707_changed)) {
var_$1798_unknown = (var_$1707_unknown)
if ((var_$1798_unknown)) {
var_$1798_error = UnknownEventError(null)
} else {
var_$1798_error = null
try {
var_$1798_value = var_$1799.apply((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
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
if ((!(currTs == 0L))) {
var_$1809_changed = false
}
if ((var_$1810_changed)) {
var_$1809_value = var_$1810_value
var_$1809_init = true
var_$1809_error = var_$1810_error
var_$1809_changed = true
var_$1809_unknown = var_$1810_unknown
}
var_$1797_changed = false
if ((var_$1798_init && var_$1809_init)) {
if ((var_$1798_changed) || (var_$1809_changed)) {
var_$1797_unknown = (var_$1798_unknown && var_$1809_unknown)
if ((var_$1797_unknown)) {
var_$1797_error = UnknownEventError(null)
} else {
var_$1797_error = null
try {
var_$1797_value = ((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}) == (if((var_$1809_error == null)) {var_$1809_value} else {throw var_$1809_error}))
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
var_$1791_changed = false
if ((var_$1792_init && var_$1797_init)) {
if ((var_$1792_changed) || (var_$1797_changed)) {
var_$1791_unknown = (var_$1792_unknown && var_$1797_unknown)
if ((var_$1791_unknown)) {
var_$1791_error = UnknownEventError(null)
} else {
var_$1791_error = null
try {
var_$1791_value = ((if((var_$1792_error == null)) {var_$1792_value} else {throw var_$1792_error}) && (if((var_$1797_error == null)) {var_$1797_value} else {throw var_$1797_error}))
} catch {
case var_err : Throwable => {
var_$1791_error = var_err
}
}
}
var_$1791_init = true
var_$1791_changed = true
}
}
var_isFinalFalse$1788_changed = false
if ((var_$1789_init && var_$1791_init)) {
if ((var_$1789_changed) || (var_$1791_changed)) {
var_isFinalFalse$1788_unknown = (var_$1789_unknown && var_$1791_unknown)
if ((var_isFinalFalse$1788_unknown)) {
var_isFinalFalse$1788_error = UnknownEventError(null)
} else {
var_isFinalFalse$1788_error = null
try {
var_isFinalFalse$1788_value = ((if((var_$1789_error == null)) {var_$1789_value} else {throw var_$1789_error}) || (if((var_$1791_error == null)) {var_$1791_value} else {throw var_$1791_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1788_error = var_err
}
}
}
var_isFinalFalse$1788_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1805_changed = false
}
if ((var_isFinalFalse$1788_changed)) {
var_$1805_lastValue = var_$1805_value
var_$1805_lastInit = var_$1805_init
var_$1805_lastError = var_$1805_error
var_$1805_value = var_isFinalFalse$1788_value
var_$1805_init = true
var_$1805_ts = currTs
var_$1805_error = var_isFinalFalse$1788_error
var_$1805_changed = true
var_$1805_unknown = var_isFinalFalse$1788_unknown
}
var_$1782_changed = false
if ((var_$1798_init)) {
if ((var_$1798_changed)) {
var_$1782_unknown = (var_$1798_unknown)
if ((var_$1782_unknown)) {
var_$1782_error = UnknownEventError(null)
} else {
var_$1782_error = null
try {
var_$1782_value = !((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}))
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
var_$1705_changed = false
if ((var_$1706_init && var_$1782_init)) {
if ((var_$1706_changed) || (var_$1782_changed)) {
var_$1705_unknown = (var_$1706_unknown && var_$1782_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = ((if((var_$1706_error == null)) {var_$1706_value} else {throw var_$1706_error}) && (if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}))
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
var_prev$1786_changed = false
if ((var_$1805_changed)) {
if ((var_$1805_ts == currTs && var_$1805_lastInit) || (!(var_$1805_ts == currTs) && var_$1805_init)) {
var_prev$1786_changed = true
var_prev$1786_init = true
var_prev$1786_unknown = var_$1805_unknown
if ((var_prev$1786_unknown)) {
var_prev$1786_error = var_$1805_error
} else {
if ((var_$1805_ts == currTs)) {
var_prev$1786_value = var_$1805_lastValue
var_prev$1786_error = var_$1805_lastError
} else {
var_prev$1786_value = var_$1805_value
var_prev$1786_error = var_$1805_error
}
}
}
}
var_$1785_changed = false
if ((var_prev$1786_init)) {
if ((var_prev$1786_changed)) {
var_$1785_unknown = (var_prev$1786_unknown)
if ((var_$1785_unknown)) {
var_$1785_error = UnknownEventError(null)
} else {
var_$1785_error = null
try {
var_$1785_value = !((if((var_prev$1786_error == null)) {var_prev$1786_value} else {throw var_prev$1786_error}))
} catch {
case var_err : Throwable => {
var_$1785_error = var_err
}
}
}
var_$1785_init = true
var_$1785_changed = true
}
}
var_$1704_changed = false
if ((var_$1705_init && var_$1785_init)) {
if ((var_$1705_changed) || (var_$1785_changed)) {
var_$1704_unknown = (var_$1705_unknown && var_$1785_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = ((if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}) && (if((var_$1785_error == null)) {var_$1785_value} else {throw var_$1785_error}))
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
var_$1802_changed = false
if ((var_$1707_changed)) {
var_$1802_value = var_$1707_ts
var_$1802_init = true
var_$1802_unknown = var_$1707_unknown
if ((var_$1802_unknown)) {
var_$1802_error = var_$1707_error
} else {
var_$1802_error = null
}
var_$1802_changed = true
}
var_$1803_changed = false
if ((var_$1805_changed)) {
if ((var_$1804_ts == currTs && var_$1804_lastInit) || (!(var_$1804_ts == currTs) && var_$1804_init)) {
var_$1803_changed = true
var_$1803_init = true
var_$1803_unknown = var_$1805_unknown
if ((var_$1803_unknown)) {
var_$1803_error = var_$1805_error
} else {
if ((var_$1804_ts == currTs)) {
var_$1803_value = var_$1804_lastValue
var_$1803_error = var_$1804_lastError
} else {
var_$1803_value = var_$1804_value
var_$1803_error = var_$1804_error
}
}
}
}
var_finalFalseSince$1703_changed = false
if ((var_$1704_init && var_$1802_init && var_$1803_init)) {
if ((var_$1704_changed) || (var_$1802_changed) || (var_$1803_changed)) {
var_finalFalseSince$1703_unknown = (var_$1704_unknown && var_$1802_unknown && var_$1803_unknown)
if ((var_finalFalseSince$1703_unknown)) {
var_finalFalseSince$1703_error = UnknownEventError(null)
} else {
var_finalFalseSince$1703_error = null
try {
var_finalFalseSince$1703_value = (if ((if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error})) (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) else (if((var_$1803_error == null)) {var_$1803_value} else {throw var_$1803_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1703_error = var_err
}
}
}
var_finalFalseSince$1703_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1804_changed = false
}
if ((var_finalFalseSince$1703_changed)) {
var_$1804_lastValue = var_$1804_value
var_$1804_lastInit = var_$1804_init
var_$1804_lastError = var_$1804_error
var_$1804_value = var_finalFalseSince$1703_value
var_$1804_init = true
var_$1804_ts = currTs
var_$1804_error = var_finalFalseSince$1703_error
var_$1804_changed = true
var_$1804_unknown = var_finalFalseSince$1703_unknown
}
if ((!(currTs == 0L))) {
var_$1806_changed = false
}
if ((var_$1770_changed)) {
var_$1806_value = var_$1770_value
var_$1806_init = true
var_$1806_error = var_$1770_error
var_$1806_changed = true
var_$1806_unknown = var_$1770_unknown
}
var_$1701_changed = false
if ((var_$1804_init && var_$1806_init)) {
if ((var_$1804_changed) || (var_$1806_changed)) {
var_$1701_unknown = (var_$1804_unknown && var_$1806_unknown)
if ((var_$1701_unknown)) {
var_$1701_error = UnknownEventError(null)
} else {
var_$1701_error = null
try {
var_$1701_value = ((if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error}) + (if((var_$1806_error == null)) {var_$1806_value} else {throw var_$1806_error}))
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
if ((var_$1701_init && var_$1802_init)) {
if ((var_$1701_changed) || (var_$1802_changed)) {
var_$1700_unknown = (var_$1701_unknown && var_$1802_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) < (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
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
var_isFinalFalseReset$1699_changed = false
if ((var_$1700_init && var_$1809_init && var_$1805_init)) {
if ((var_$1700_changed) || (var_$1809_changed) || (var_$1805_changed)) {
var_isFinalFalseReset$1699_unknown = (var_$1700_unknown && var_$1809_unknown && var_$1805_unknown)
if ((var_isFinalFalseReset$1699_unknown)) {
var_isFinalFalseReset$1699_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1699_error = null
try {
var_isFinalFalseReset$1699_value = (if ((if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error})) (if((var_$1809_error == null)) {var_$1809_value} else {throw var_$1809_error}) else (if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1699_error = var_err
}
}
}
var_isFinalFalseReset$1699_changed = true
}
}
var_$1790_changed = false
if ((var_isFinalFalseReset$1699_changed) || (var_$1805_changed)) {
var_$1790_lastValue = var_$1790_value
var_$1790_lastInit = var_$1790_init
var_$1790_lastError = var_$1790_error
var_$1790_init = true
var_$1790_ts = currTs
var_$1790_changed = true
var_$1790_unknown = (var_isFinalFalseReset$1699_unknown && var_$1805_unknown)
if ((var_isFinalFalseReset$1699_changed)) {
var_$1790_value = var_isFinalFalseReset$1699_value
var_$1790_error = var_isFinalFalseReset$1699_error
} else {
if ((var_$1805_changed)) {
var_$1790_value = var_$1805_value
var_$1790_error = var_$1805_error
}
}
}
var_stillFulfillableReset$1697_changed = false
if ((var_$1790_init && var_$1775_init && var_$1707_init)) {
if ((var_$1790_changed) || (var_$1775_changed) || (var_$1707_changed)) {
var_stillFulfillableReset$1697_unknown = (var_$1790_unknown && var_$1775_unknown && var_$1707_unknown)
if ((var_stillFulfillableReset$1697_unknown)) {
var_stillFulfillableReset$1697_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1697_error = null
try {
var_stillFulfillableReset$1697_value = (if ((if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error})) (if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}) else (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1697_error = var_err
}
}
}
var_stillFulfillableReset$1697_init = true
var_stillFulfillableReset$1697_changed = true
}
}
var_final$1817_changed = false
if ((var_stillFulfillableReset$1697_init)) {
if ((var_stillFulfillableReset$1697_changed)) {
var_final$1817_unknown = (var_stillFulfillableReset$1697_unknown)
if ((var_final$1817_unknown)) {
var_final$1817_error = UnknownEventError(null)
} else {
var_final$1817_error = null
try {
var_final$1817_value = var_$1818.apply((if((var_stillFulfillableReset$1697_error == null)) {var_stillFulfillableReset$1697_value} else {throw var_stillFulfillableReset$1697_error}))
} catch {
case var_err : Throwable => {
var_final$1817_error = var_err
}
}
}
var_final$1817_init = true
var_final$1817_changed = true
}
}
var_value$1696_changed = false
if ((var_stillFulfillableReset$1697_init)) {
if ((var_stillFulfillableReset$1697_changed)) {
var_value$1696_unknown = (var_stillFulfillableReset$1697_unknown)
if ((var_value$1696_unknown)) {
var_value$1696_error = UnknownEventError(null)
} else {
var_value$1696_error = null
try {
var_value$1696_value = var_$1799.apply((if((var_stillFulfillableReset$1697_error == null)) {var_stillFulfillableReset$1697_value} else {throw var_stillFulfillableReset$1697_error}))
} catch {
case var_err : Throwable => {
var_value$1696_error = var_err
}
}
}
var_value$1696_init = true
var_value$1696_changed = true
}
}

if ((var_value$1696_changed && var_value$1696_init)) {
out_value.apply(var_value$1696_value, currTs, "value", var_value$1696_error)
}
if ((var_final$1817_changed && var_final$1817_init)) {
out_final.apply(var_final$1817_value, currTs, "final", var_final$1817_error)
}
var_stimulus1_changed = false
var_stimulus3_changed = false
var_endOfStreams_changed = false
var_response_changed = false
var_stimulus2_changed = false

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
