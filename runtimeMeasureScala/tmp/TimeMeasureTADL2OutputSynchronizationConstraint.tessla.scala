//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1901 : scala.Function1[List[Any], Any] = ((var_list$2029 : List[Any]) => {
val var_$2030 : Any = var_list$2029(0L.asInstanceOf[Int])
var_$2030
})
var var_buildMap$2090 : scala.Function2[Long, Any, Map[Long, Any]] = null
val var_buildOutputSynchronizationCluster$2039 : scala.Function2[Long, Long, (Map[Long, Boolean], Long)] = ((var_time$2086 : Long, var_streamCount$2087 : Long) => {
var var_$2089 : Map[Long, Boolean] = Map[Long, Boolean]()
var var_$2088 : (Map[Long, Boolean], Long) = (Map[Long, Boolean](), 0L)
var_$2089 = (var_buildMap$2090.apply(var_streamCount$2087, false)).asInstanceOf[Map[Long, Boolean]]
var_$2088 = (var_$2089, var_time$2086)
var_$2088
})
val var_addNewCluster$1987 : scala.Function4[Map[Long, (Map[Long, Boolean], Long)], Long, Long, Long, Map[Long, (Map[Long, Boolean], Long)]] = ((var_storedClusters$2033 : Map[Long, (Map[Long, Boolean], Long)], var_newColor$2034 : Long, var_time$2035 : Long, var_responseStreamCount$2036 : Long) => {
val var_$2037 : Map[Long, (Map[Long, Boolean], Long)] = (var_storedClusters$2033 + ((var_newColor$2034) -> (var_buildOutputSynchronizationCluster$2039.apply(var_time$2035, var_responseStreamCount$2036))))
var_$2037
})
var var_updateSynchronizationClusters$1809 : scala.Function5[Map[Long, (Map[Long, Boolean], Long)], Map[Long, Long], List[Long], Set[Long], Long, Map[Long, (Map[Long, Boolean], Long)]] = null
var var_clusterFulfilled$2049 : scala.Function2[Map[Long, Boolean], List[Long], Boolean] = null
var var_fulfilledClustersInMapRec$1992 : scala.Function3[Map[Long, (Map[Long, Boolean], Long)], List[Long], List[Long], List[Long]] = null
val var_fulfilledClustersInMap$1815 : scala.Function1[Map[Long, (Map[Long, Boolean], Long)], List[Long]] = ((var_storedClusters$1990 : Map[Long, (Map[Long, Boolean], Long)]) => {
var var_$1991 : List[Long] = List[Long]()
var_$1991 = var_fulfilledClustersInMapRec$1992.apply(var_storedClusters$1990, List[Long](), var_storedClusters$1990.keys.toList)
var_$1991
})
val var_min$2010 : scala.Function2[Long, Long, Long] = ((var_a$2060 : Long, var_b$2061 : Long) => {
val var_$2062 : Long = (if ((var_a$2060 < var_b$2061)) var_a$2060 else var_b$2061)
var_$2062
})
var var_startTimeOldestCluster$1832 : scala.Function2[Map[Long, (Map[Long, Boolean], Long)], List[Long], Long] = null
val var_$1883 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$2025 : (Boolean, Boolean)) => {
val var_$2026 : Boolean = var_$2025._2
var_$2026
})
var var_removeListFromSet$1778 : scala.Function2[Set[Any], List[Any], Set[Any]] = null
var var_mapValuesToList$1777 : scala.Function2[Map[Any, Any], List[Any], List[Any]] = null
val var_$1795 : scala.Function2[ErrorOption[Boolean], ErrorOption[Map[Long, (Map[Long, Boolean], Long)]], ErrorOption[Map[Long, (Map[Long, Boolean], Long)]]] = ((var_trig$1939 : ErrorOption[Boolean], var_str$1940 : ErrorOption[Map[Long, (Map[Long, Boolean], Long)]]) => {
val var_$1941 : ErrorOption[Map[Long, (Map[Long, Boolean], Long)]] = (if (var_trig$1939.isEmpty) EONone() else var_str$1940)
var_$1941
})
val var_$1861 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$2021 : (Boolean, Boolean)) => {
val var_$2022 : Boolean = var_$2021._1
var_$2022
})
var var_removeClusters$1816 : scala.Function2[Map[Long, (Map[Long, Boolean], Long)], List[Long], Map[Long, (Map[Long, Boolean], Long)]] = null
val var_removeStimulusEvents$1774 : scala.Function1[Map[Long, Long], Map[Long, Long]] = ((var_events$1886 : Map[Long, Long]) => {
val var_$1887 : Map[Long, Long] = (if (var_events$1886.contains(0L)) (var_events$1886 - 0L) else var_events$1886)
var_$1887
})
val var_$1748 : Map[Long, Long] = Map[Long, Long]()
val var_$1764 : Set[Long] = Set[Long]()
val var_$1812 : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
val var_$1824 : (Boolean, Boolean) = (false, true)
val var_$1844 : (Boolean, Boolean) = (false, false)
val var_$1847 : (Boolean, Boolean) = (true, false)
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_response1_error : Throwable = null
val var_response1_unknown : Boolean = false
var set_var_response1 : scala.Function2[Long, Long, Unit] = null
var var_response1_value : Long = 0L
var var_response1_ts : Long = 0L
var var_response1_changed : Boolean = false
val var_response3_error : Throwable = null
val var_response3_unknown : Boolean = false
var set_var_response3 : scala.Function2[Long, Long, Unit] = null
var var_response3_value : Long = 0L
var var_response3_ts : Long = 0L
var var_response3_changed : Boolean = false
val var_stimulus_error : Throwable = null
val var_stimulus_unknown : Boolean = false
var set_var_stimulus : scala.Function2[Long, Long, Unit] = null
var var_stimulus_value : Long = 0L
var var_stimulus_ts : Long = 0L
var var_stimulus_changed : Boolean = false
val var_response2_error : Throwable = null
val var_response2_unknown : Boolean = false
var set_var_response2 : scala.Function2[Long, Long, Unit] = null
var var_response2_value : Long = 0L
var var_response2_ts : Long = 0L
var var_response2_changed : Boolean = false

var_buildMap$2090 = ((var_size$2103 : Long, var_init$2104 : Any) => {
var var_$2105 : Map[Long, Any] = Map[Long, Any]()
var_$2105 = (if ((var_size$2103 <= 0L)) Map[Long, Any]() else (var_buildMap$2090.apply((var_size$2103 - 1L), var_init$2104) + ((var_size$2103) -> (var_init$2104))))
var_$2105
})
var_updateSynchronizationClusters$1809 = ((var_storedClusters$1944 : Map[Long, (Map[Long, Boolean], Long)], var_events$1945 : Map[Long, Long], var_eventKeys$1946 : List[Long], var_unmatchedStimulusColors$1947 : Set[Long], var_timeNow$1948 : Long) => {
val var_setStreamInSynchronizationCluster$1966 : scala.Function2[(Map[Long, Boolean], Long), Long, (Map[Long, Boolean], Long)] = ((var_cluster$1976 : (Map[Long, Boolean], Long), var_stream$1977 : Long) => {
val var_$1979 : Long = var_cluster$1976._2
val var_$1980 : Map[Long, Boolean] = (var_cluster$1976._1 + ((var_stream$1977) -> (true)))
val var_$1978 : (Map[Long, Boolean], Long) = (var_$1980, var_$1979)
var_$1978
})
lazy val var_$1974 : Long = (var_head$1901.apply((var_eventKeys$1946).asInstanceOf[List[Any]])).asInstanceOf[Long]
lazy val var_$1963 : Long = var_events$1945(var_$1974)
lazy val var_$1955 : Boolean = var_storedClusters$1944.contains(var_$1963)
lazy val var_$1956 : Boolean = var_unmatchedStimulusColors$1947(var_$1963)
var var_$1949 : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var_$1949 = (if ((var_eventKeys$1946.size == 0L)) var_storedClusters$1944 else var_updateSynchronizationClusters$1809.apply((if ((var_$1955 || var_$1956)) (var_storedClusters$1944 + ((var_$1963) -> (var_setStreamInSynchronizationCluster$1966.apply((if ((!(var_$1955) && var_$1956)) var_addNewCluster$1987.apply(var_storedClusters$1944, var_$1963, var_timeNow$1948, 3L) else var_storedClusters$1944)(var_$1963), var_$1974)))) else var_storedClusters$1944), var_events$1945, var_eventKeys$1946.tail, var_unmatchedStimulusColors$1947, var_timeNow$1948))
var_$1949
})
var_clusterFulfilled$2049 = ((var_fulfilledStreams$2091 : Map[Long, Boolean], var_keys$2092 : List[Long]) => {
var var_$2093 : Boolean = false
var_$2093 = (if ((var_keys$2092.size == 0L)) true else (if (var_fulfilledStreams$2091((var_head$1901.apply((var_keys$2092).asInstanceOf[List[Any]])).asInstanceOf[Long])) var_clusterFulfilled$2049.apply(var_fulfilledStreams$2091, var_keys$2092.tail) else false))
var_$2093
})
var_fulfilledClustersInMapRec$1992 = ((var_storedClusters$2040 : Map[Long, (Map[Long, Boolean], Long)], var_aList$2041 : List[Long], var_keys$2042 : List[Long]) => {
lazy val var_$2056 : Long = (var_head$1901.apply((var_keys$2042).asInstanceOf[List[Any]])).asInstanceOf[Long]
lazy val var_$2054 : Map[Long, Boolean] = var_storedClusters$2040(var_$2056)._1
var var_$2043 : List[Long] = List[Long]()
var_$2043 = (if ((var_keys$2042.size == 0L)) var_aList$2041 else var_fulfilledClustersInMapRec$1992.apply(var_storedClusters$2040, (if (var_clusterFulfilled$2049.apply(var_$2054, var_$2054.keys.toList)) (var_aList$2041 :+ var_$2056) else var_aList$2041), var_keys$2042.tail))
var_$2043
})
var_startTimeOldestCluster$1832 = ((var_storedClustersBeforeRemove$2004 : Map[Long, (Map[Long, Boolean], Long)], var_keys$2005 : List[Long]) => {
var var_$2006 : Long = 0L
var_$2006 = (if ((var_keys$2005.size == 0L)) 9223372036854775802L else var_min$2010.apply(var_storedClustersBeforeRemove$2004((var_head$1901.apply((var_keys$2005).asInstanceOf[List[Any]])).asInstanceOf[Long])._2, var_startTimeOldestCluster$1832.apply(var_storedClustersBeforeRemove$2004, var_keys$2005.tail)))
var_$2006
})
var_removeListFromSet$1778 = ((var_aSet$1902 : Set[Any], var_listToRemove$1903 : List[Any]) => {
var var_$1904 : Set[Any] = Set[Any]()
var_$1904 = (if ((var_listToRemove$1903.size == 0L)) var_aSet$1902 else var_removeListFromSet$1778.apply((if (var_aSet$1902(var_head$1901.apply(var_listToRemove$1903))) (var_aSet$1902 - var_head$1901.apply(var_listToRemove$1903)) else var_aSet$1902), var_listToRemove$1903.tail))
var_$1904
})
var_mapValuesToList$1777 = ((var_aMap$1890 : Map[Any, Any], var_remainingKeys$1891 : List[Any]) => {
var var_$1892 : List[Any] = List[Any]()
var_$1892 = (if ((var_remainingKeys$1891.size == 0L)) List[Any]() else (var_mapValuesToList$1777.apply(var_aMap$1890, var_remainingKeys$1891.tail) :+ var_aMap$1890(var_head$1901.apply(var_remainingKeys$1891))))
var_$1892
})
var_removeClusters$1816 = ((var_storedClusters$1995 : Map[Long, (Map[Long, Boolean], Long)], var_colorsToRemove$1996 : List[Long]) => {
var var_$1997 : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var_$1997 = (if ((var_colorsToRemove$1996.size == 0L)) var_storedClusters$1995 else var_removeClusters$1816.apply((var_storedClusters$1995 - (var_head$1901.apply((var_colorsToRemove$1996).asInstanceOf[List[Any]])).asInstanceOf[Long]), var_colorsToRemove$1996.tail))
var_$1997
})
out_value = null
out_final = null
set_var_response1 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_response1_changed))) {
var_response1_value = value
var_response1_ts = ts
var_response1_changed = true
}
})
set_var_response3 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_response3_changed))) {
var_response3_value = value
var_response3_ts = ts
var_response3_changed = true
}
})
set_var_stimulus = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stimulus_changed))) {
var_stimulus_value = value
var_stimulus_ts = ts
var_stimulus_changed = true
}
})
set_var_response2 = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_response2_changed))) {
var_response2_value = value
var_response2_ts = ts
var_response2_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1718_changed : Boolean = false
var var_$1718_value : Long = 0L
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_defaultTime$1715_changed : Boolean = true
var var_defaultTime$1715_value : Long = -1L
var var_defaultTime$1715_init : Boolean = true
var var_defaultTime$1715_error : Throwable = null
var var_defaultTime$1715_unknown : Boolean = false
var var_$1728_changed : Boolean = false
var var_$1728_value : Long = 0L
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_$1722_changed : Boolean = false
var var_$1722_value : Long = 0L
var var_$1722_unknown : Boolean = false
var var_$1722_error : Throwable = null
var var_$1738_changed : Boolean = false
var var_$1738_value : Long = 0L
var var_$1738_unknown : Boolean = false
var var_$1738_error : Throwable = null
var var_$1721_changed : Boolean = false
var var_$1721_unknown : Boolean = false
var var_$1721_value : Long = 0L
var var_$1721_error : Throwable = null
var var_$1719_changed : Boolean = false
var var_$1719_unknown : Boolean = false
var var_$1719_value : Long = 0L
var var_$1719_error : Throwable = null
var var_timeNow$1717_changed : Boolean = false
var var_timeNow$1717_init : Boolean = false
var var_timeNow$1717_unknown : Boolean = false
var var_timeNow$1717_value : Long = 0L
var var_timeNow$1717_error : Throwable = null
var var_$1714_changed : Boolean = false
var var_$1714_unknown : Boolean = false
var var_$1714_error : Throwable = null
var var_$1714_value : Boolean = false
var var_$1714_init : Boolean = false
var var_defaultTime$1727_changed : Boolean = true
var var_defaultTime$1727_value : Long = -1L
var var_defaultTime$1727_init : Boolean = true
var var_defaultTime$1727_error : Throwable = null
var var_defaultTime$1727_unknown : Boolean = false
var var_$1726_changed : Boolean = false
var var_$1726_unknown : Boolean = false
var var_$1726_error : Throwable = null
var var_$1726_value : Boolean = false
var var_$1726_init : Boolean = false
var var_defaultTime$1732_changed : Boolean = true
var var_defaultTime$1732_value : Long = -1L
var var_defaultTime$1732_init : Boolean = true
var var_defaultTime$1732_error : Throwable = null
var var_defaultTime$1732_unknown : Boolean = false
var var_$1731_changed : Boolean = false
var var_$1731_unknown : Boolean = false
var var_$1731_error : Throwable = null
var var_$1731_value : Boolean = false
var var_$1731_init : Boolean = false
var var_defaultTime$1737_changed : Boolean = true
var var_defaultTime$1737_value : Long = -1L
var var_defaultTime$1737_init : Boolean = true
var var_defaultTime$1737_error : Throwable = null
var var_defaultTime$1737_unknown : Boolean = false
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Boolean = false
var var_$1736_init : Boolean = false
val var_$1741_value : Map[Long, Long] = Map[Long, Long]()
val var_$1741_error : Throwable = null
val var_$1741_changed : Boolean = false
val var_$1741_unknown : Boolean = false
var var_$1746_changed : Boolean = true
var var_$1746_value : Map[Long, Long] = var_$1748
var var_$1746_init : Boolean = true
var var_$1746_error : Throwable = null
var var_$1746_unknown : Boolean = false
val var_$1834_value : Long = 0L
val var_$1834_error : Throwable = null
val var_$1834_changed : Boolean = false
val var_$1834_unknown : Boolean = false
var var_$1779_changed : Boolean = true
var var_$1779_value : Long = 0L
var var_$1779_init : Boolean = true
var var_$1779_error : Throwable = null
var var_$1779_unknown : Boolean = false
var var_$1745_changed : Boolean = true
var var_$1745_value : Long = -1L
var var_$1745_init : Boolean = true
var var_$1745_error : Throwable = null
var var_$1745_unknown : Boolean = false
var var_$1739_changed : Boolean = false
var var_$1739_unknown : Boolean = false
var var_$1739_error : Throwable = null
var var_$1739_value : Map[Long, Long] = Map[Long, Long]()
var var_$1739_init : Boolean = false
var var_eventStimulus$1735_changed : Boolean = false
var var_eventStimulus$1735_unknown : Boolean = false
var var_eventStimulus$1735_error : Throwable = null
var var_eventStimulus$1735_value : Map[Long, Long] = Map[Long, Long]()
var var_eventStimulus$1735_init : Boolean = false
var var_$2075_changed : Boolean = true
var var_$2075_value : Long = 1L
var var_$2075_init : Boolean = true
var var_$2075_error : Throwable = null
var var_$2075_unknown : Boolean = false
var var_$1751_changed : Boolean = true
var var_$1751_value : Long = -1L
var var_$1751_init : Boolean = true
var var_$1751_error : Throwable = null
var var_$1751_unknown : Boolean = false
var var_$1734_changed : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1734_value : Map[Long, Long] = Map[Long, Long]()
var var_$1734_init : Boolean = false
var var_eventResponse1$1730_changed : Boolean = false
var var_eventResponse1$1730_unknown : Boolean = false
var var_eventResponse1$1730_error : Throwable = null
var var_eventResponse1$1730_value : Map[Long, Long] = Map[Long, Long]()
var var_eventResponse1$1730_init : Boolean = false
var var_$1752_changed : Boolean = true
var var_$1752_value : Long = 2L
var var_$1752_init : Boolean = true
var var_$1752_error : Throwable = null
var var_$1752_unknown : Boolean = false
var var_$1754_changed : Boolean = true
var var_$1754_value : Long = -1L
var var_$1754_init : Boolean = true
var var_$1754_error : Throwable = null
var var_$1754_unknown : Boolean = false
var var_$1729_changed : Boolean = false
var var_$1729_unknown : Boolean = false
var var_$1729_error : Throwable = null
var var_$1729_value : Map[Long, Long] = Map[Long, Long]()
var var_$1729_init : Boolean = false
var var_eventResponse2$1725_changed : Boolean = false
var var_eventResponse2$1725_unknown : Boolean = false
var var_eventResponse2$1725_error : Throwable = null
var var_eventResponse2$1725_value : Map[Long, Long] = Map[Long, Long]()
var var_eventResponse2$1725_init : Boolean = false
var var_$1755_changed : Boolean = true
var var_$1755_value : Long = 3L
var var_$1755_init : Boolean = true
var var_$1755_error : Throwable = null
var var_$1755_unknown : Boolean = false
var var_$1757_changed : Boolean = true
var var_$1757_value : Long = -1L
var var_$1757_init : Boolean = true
var var_$1757_error : Throwable = null
var var_$1757_unknown : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_value : Map[Long, Long] = Map[Long, Long]()
var var_$1724_init : Boolean = false
var var_eventResponse3$1713_changed : Boolean = false
var var_eventResponse3$1713_unknown : Boolean = false
var var_eventResponse3$1713_error : Throwable = null
var var_eventResponse3$1713_value : Map[Long, Long] = Map[Long, Long]()
var var_eventResponse3$1713_init : Boolean = false
var var_eventResponse3$1713_ts : Long = 0L
var var_$1712_changed : Boolean = false
var var_$1712_unknown : Boolean = false
var var_$1712_error : Throwable = null
var var_$1712_value : Boolean = false
var var_$1712_init : Boolean = false
var var_$1762_changed : Boolean = false
var var_$1762_unknown : Boolean = false
var var_$1762_error : Throwable = null
var var_$1762_value : Set[Long] = Set[Long]()
var var_$1761_changed : Boolean = true
var var_$1761_value : Set[Long] = var_$1764
var var_$1761_init : Boolean = true
var var_$1761_error : Throwable = null
var var_$1761_unknown : Boolean = false
var var_$1765_changed : Boolean = false
var var_$1765_unknown : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_value : Long = 0L
var var_$1765_init : Boolean = false
var var_$1760_changed : Boolean = false
var var_$1760_unknown : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_value : Set[Long] = Set[Long]()
var var_$1760_init : Boolean = false
var var_unmatchedStimulusColors$1711_changed : Boolean = false
var var_unmatchedStimulusColors$1711_unknown : Boolean = false
var var_unmatchedStimulusColors$1711_error : Throwable = null
var var_unmatchedStimulusColors$1711_value : Set[Long] = Set[Long]()
var var_unmatchedStimulusColors$1711_init : Boolean = false
var var_$1776_changed : Boolean = false
var var_$1776_unknown : Boolean = false
var var_$1776_error : Throwable = null
var var_$1776_value : Map[Long, Long] = Map[Long, Long]()
var var_$1776_init : Boolean = false
var var_$1775_changed : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : List[Long] = List[Long]()
var var_$1775_init : Boolean = false
var var_unmatchedStimulusColors$1772_changed : Boolean = false
var var_unmatchedStimulusColors$1772_unknown : Boolean = false
var var_unmatchedStimulusColors$1772_error : Throwable = null
var var_unmatchedStimulusColors$1772_value : List[Long] = List[Long]()
var var_unmatchedStimulusColors$1772_init : Boolean = false
var var_$1770_changed : Boolean = false
var var_$1770_lastValue : Set[Long] = Set[Long]()
var var_$1770_lastInit : Boolean = false
var var_$1770_lastError : Throwable = null
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1770_value : Set[Long] = Set[Long]()
var var_$1770_init : Boolean = false
var var_$1770_ts : Long = 0L
var var_$1709_changed : Boolean = false
var var_$1709_unknown : Boolean = false
var var_$1709_error : Throwable = null
var var_$1709_value : Long = 0L
var var_$1709_init : Boolean = false
var var_$1708_changed : Boolean = false
var var_$1708_unknown : Boolean = false
var var_$1708_error : Throwable = null
var var_$1708_value : Boolean = false
var var_$1708_init : Boolean = false
var var_$1837_changed : Boolean = false
var var_$1837_init : Boolean = false
var var_$1837_error : Throwable = null
var var_$1837_unknown : Boolean = false
var var_$1938_changed : Boolean = false
var var_$1938_lastValue : Boolean = false
var var_$1938_lastInit : Boolean = false
var var_$1938_lastError : Throwable = null
var var_$1938_ts : Long = 0L
var var_$1938_init : Boolean = false
var var_$1938_unknown : Boolean = false
var var_$1938_error : Throwable = null
var var_$1938_value : Boolean = false
var var_$1937_changed : Boolean = false
var var_$1937_init : Boolean = false
var var_$1937_unknown : Boolean = false
var var_$1937_error : Throwable = null
var var_$1937_value : Boolean = false
var var_$1936_changed : Boolean = false
var var_$1936_unknown : Boolean = false
var var_$1936_error : Throwable = null
var var_$1936_value : Boolean = false
var var_$1936_init : Boolean = false
var var_failingTimeStamps$1789_unknown : Boolean = false
var var_failingTimeStamps$1789_error : Throwable = null
var var_failingTimeStamps$1789_value : Boolean = false
var var_failingTimeStamps$1789_init : Boolean = false
var var_$1926_changed : Boolean = false
var var_$1926_error : Throwable = null
var var_$1926_init : Boolean = false
var var_$1926_unknown : Boolean = false
var var_$1785_changed : Boolean = false
val var_$1785_value : Boolean = true
val var_$1785_error : Throwable = null
var var_$1785_unknown : Boolean = false
val var_$1818_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
val var_$1818_error : Throwable = null
val var_$1818_changed : Boolean = false
val var_$1818_unknown : Boolean = false
var var_storedClustersBeforeRemove$1810_changed : Boolean = true
var var_storedClustersBeforeRemove$1810_lastValue : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_storedClustersBeforeRemove$1810_lastInit : Boolean = false
var var_storedClustersBeforeRemove$1810_lastError : Throwable = null
var var_storedClustersBeforeRemove$1810_value : Map[Long, (Map[Long, Boolean], Long)] = var_$1812
var var_storedClustersBeforeRemove$1810_init : Boolean = true
var var_storedClustersBeforeRemove$1810_ts : Long = 0L
var var_storedClustersBeforeRemove$1810_error : Throwable = null
var var_storedClustersBeforeRemove$1810_unknown : Boolean = false
var var_mergedStream$1794_changed : Boolean = false
var var_mergedStream$1794_unknown : Boolean = false
var var_mergedStream$1794_error : Throwable = null
var var_mergedStream$1794_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$1790_changed : Boolean = false
var var_$1790_unknown : Boolean = false
var var_$1790_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$1790_error : Throwable = null
var var_on$1784_changed : Boolean = false
var var_on$1784_error : Throwable = null
var var_on$1784_unknown : Boolean = false
var var_on$1784_fval : ErrorOption[Map[Long, (Map[Long, Boolean], Long)]] = null
var var_on$1784_newValue : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_on$1784_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$1802_changed : Boolean = false
var var_$1802_lastValue : Long = 0L
var var_$1802_lastInit : Boolean = false
var var_$1802_lastError : Throwable = null
var var_$1802_value : Long = 0L
var var_$1802_init : Boolean = false
var var_$1802_ts : Long = 0L
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1800_changed : Boolean = false
var var_$1800_init : Boolean = false
var var_$1800_unknown : Boolean = false
var var_$1800_error : Throwable = null
var var_$1800_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_prev$1806_changed : Boolean = false
var var_prev$1806_init : Boolean = false
var var_prev$1806_unknown : Boolean = false
var var_prev$1806_error : Throwable = null
var var_prev$1806_value : Set[Long] = Set[Long]()
var var_storedClustersBeforeRemove$1799_changed : Boolean = false
var var_storedClustersBeforeRemove$1799_unknown : Boolean = false
var var_storedClustersBeforeRemove$1799_error : Throwable = null
var var_storedClustersBeforeRemove$1799_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$1798_changed : Boolean = false
var var_$1798_init : Boolean = false
var var_$1798_unknown : Boolean = false
var var_$1798_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$1798_error : Throwable = null
var var_$1813_changed : Boolean = false
var var_$1813_unknown : Boolean = false
var var_$1813_error : Throwable = null
var var_$1813_value : List[Long] = List[Long]()
var var_$1813_init : Boolean = false
var var_$1797_changed : Boolean = false
var var_$1797_unknown : Boolean = false
var var_$1797_error : Throwable = null
var var_$1797_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_storedClusters$1796_changed : Boolean = false
var var_storedClusters$1796_unknown : Boolean = false
var var_storedClusters$1796_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_storedClusters$1796_error : Throwable = null
var var_$2069_changed : Boolean = false
var var_$2069_lastValue : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$2069_lastInit : Boolean = false
var var_$2069_lastError : Throwable = null
var var_$2069_init : Boolean = false
var var_$2069_ts : Long = 0L
var var_$2069_unknown : Boolean = false
var var_$2069_value : Map[Long, (Map[Long, Boolean], Long)] = Map[Long, (Map[Long, Boolean], Long)]()
var var_$2069_error : Throwable = null
var var_$1782_changed : Boolean = false
var var_$1782_unknown : Boolean = false
var var_$1782_error : Throwable = null
var var_$1782_value : Long = 0L
var var_$1782_init : Boolean = false
var var_$1781_changed : Boolean = false
var var_$1781_unknown : Boolean = false
var var_$1781_error : Throwable = null
var var_$1781_value : Boolean = false
var var_$1781_init : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1707_value : Boolean = false
var var_$1707_init : Boolean = false
val var_$1843_value : (Boolean, Boolean) = (false, false)
val var_$1843_error : Throwable = null
val var_$1843_changed : Boolean = false
val var_$1843_unknown : Boolean = false
var var_$1822_changed : Boolean = true
var var_$1822_value : (Boolean, Boolean) = var_$1824
var var_$1822_init : Boolean = true
var var_$1822_error : Throwable = null
var var_$1822_unknown : Boolean = false
var var_$2070_changed : Boolean = false
var var_$2070_unknown : Boolean = false
var var_$2070_error : Throwable = null
var var_$2070_value : List[Long] = List[Long]()
var var_$2070_init : Boolean = false
var var_$2068_changed : Boolean = false
var var_$2068_unknown : Boolean = false
var var_$2068_error : Throwable = null
var var_$2068_value : Long = 0L
var var_$2068_init : Boolean = false
var var_$2072_changed : Boolean = true
var var_$2072_value : Long = 5L
var var_$2072_init : Boolean = true
var var_$2072_error : Throwable = null
var var_$2072_unknown : Boolean = false
var var_$1827_changed : Boolean = false
var var_$1827_unknown : Boolean = false
var var_$1827_error : Throwable = null
var var_$1827_value : Long = 0L
var var_$1827_init : Boolean = false
var var_safeDelay$1841_changed : Boolean = false
val var_safeDelay$1841_error : Throwable = null
var var_safeDelay$1841_unknown : Boolean = false
var var_$1839_changed : Boolean = false
var var_$1839_error : Throwable = null
var var_$1839_unknown : Boolean = false
var var_mergeUnit2$1836_changed : Boolean = false
var var_mergeUnit2$1836_ts : Long = 0L
var var_mergeUnit2$1836_unknown : Boolean = false
var var_mergeUnit2$1836_error : Throwable = null
var var_$1835_changed : Boolean = false
var var_$1835_value : Long = 0L
var var_$1835_init : Boolean = false
var var_$1835_unknown : Boolean = false
var var_$1835_error : Throwable = null
var var_$1826_changed : Boolean = false
var var_$1826_unknown : Boolean = false
var var_$1826_error : Throwable = null
var var_$1826_value : Boolean = false
var var_$1826_init : Boolean = false
var var_$1842_changed : Boolean = true
var var_$1842_value : (Boolean, Boolean) = var_$1844
var var_$1842_init : Boolean = true
var var_$1842_error : Throwable = null
var var_$1842_unknown : Boolean = false
var var_$1845_changed : Boolean = true
var var_$1845_value : (Boolean, Boolean) = var_$1847
var var_$1845_init : Boolean = true
var var_$1845_error : Throwable = null
var var_$1845_unknown : Boolean = false
var var_$1825_changed : Boolean = false
var var_$1825_unknown : Boolean = false
var var_$1825_error : Throwable = null
var var_$1825_value : (Boolean, Boolean) = (false, false)
var var_$1825_init : Boolean = false
var var_result$1706_changed : Boolean = false
var var_result$1706_unknown : Boolean = false
var var_result$1706_error : Throwable = null
var var_result$1706_value : (Boolean, Boolean) = (false, false)
var var_result$1706_init : Boolean = false
var var_result$1706_ts : Long = 0L
var var_$1860_changed : Boolean = false
var var_$1860_unknown : Boolean = false
var var_$1860_error : Throwable = null
var var_$1860_value : Boolean = false
var var_$1860_init : Boolean = false
var var_$1850_changed : Boolean = false
var var_$1850_unknown : Boolean = false
var var_$1850_error : Throwable = null
var var_$1850_value : Boolean = false
var var_$1850_init : Boolean = false
var var_$1849_changed : Boolean = false
var var_$1849_unknown : Boolean = false
var var_$1849_error : Throwable = null
var var_$1849_value : Boolean = false
var var_$1849_init : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : Boolean = false
var var_$1704_init : Boolean = false
var var_$1856_changed : Boolean = false
var var_$1856_init : Boolean = false
var var_$1856_unknown : Boolean = false
var var_$1856_error : Throwable = null
var var_$1856_value : Boolean = false
val var_$1877_value : Boolean = false
val var_$1877_error : Throwable = null
val var_$1877_changed : Boolean = false
val var_$1877_unknown : Boolean = false
var var_$1862_changed : Boolean = true
var var_$1862_value : Boolean = true
var var_$1862_init : Boolean = true
var var_$1862_error : Throwable = null
var var_$1862_unknown : Boolean = false
var var_$1859_changed : Boolean = false
var var_$1859_unknown : Boolean = false
var var_$1859_error : Throwable = null
var var_$1859_value : Boolean = false
var var_$1859_init : Boolean = false
var var_$1876_changed : Boolean = true
var var_$1876_value : Boolean = false
var var_$1876_init : Boolean = true
var var_$1876_error : Throwable = null
var var_$1876_unknown : Boolean = false
var var_$1864_changed : Boolean = false
var var_$1864_unknown : Boolean = false
var var_$1864_error : Throwable = null
var var_$1864_value : Boolean = false
var var_$1864_init : Boolean = false
var var_$1858_changed : Boolean = false
var var_$1858_unknown : Boolean = false
var var_$1858_error : Throwable = null
var var_$1858_value : Boolean = false
var var_$1858_init : Boolean = false
var var_isFinalFalse$1855_changed : Boolean = false
var var_isFinalFalse$1855_unknown : Boolean = false
var var_isFinalFalse$1855_error : Throwable = null
var var_isFinalFalse$1855_value : Boolean = false
var var_$1872_changed : Boolean = true
var var_$1872_lastValue : Boolean = false
var var_$1872_lastInit : Boolean = false
var var_$1872_lastError : Throwable = null
var var_$1872_value : Boolean = false
var var_$1872_init : Boolean = true
var var_$1872_ts : Long = 0L
var var_$1872_error : Throwable = null
var var_$1872_unknown : Boolean = false
var var_prev$1853_changed : Boolean = false
var var_prev$1853_init : Boolean = false
var var_prev$1853_unknown : Boolean = false
var var_prev$1853_error : Throwable = null
var var_prev$1853_value : Boolean = false
var var_$1852_changed : Boolean = false
var var_$1852_unknown : Boolean = false
var var_$1852_error : Throwable = null
var var_$1852_value : Boolean = false
var var_$1852_init : Boolean = false
var var_$1703_changed : Boolean = false
var var_$1703_unknown : Boolean = false
var var_$1703_error : Throwable = null
var var_$1703_value : Boolean = false
var var_$1703_init : Boolean = false
var var_$1875_changed : Boolean = false
var var_$1875_value : Long = 0L
var var_$1875_init : Boolean = false
var var_$1875_unknown : Boolean = false
var var_$1875_error : Throwable = null
var var_$1870_changed : Boolean = false
var var_$1870_init : Boolean = false
var var_$1870_unknown : Boolean = false
var var_$1870_error : Throwable = null
var var_$1870_value : Long = 0L
var var_finalFalseSince$1702_changed : Boolean = false
var var_finalFalseSince$1702_unknown : Boolean = false
var var_finalFalseSince$1702_error : Throwable = null
var var_finalFalseSince$1702_value : Long = 0L
var var_$1701_changed : Boolean = true
var var_$1701_lastValue : Long = 0L
var var_$1701_lastInit : Boolean = false
var var_$1701_lastError : Throwable = null
var var_$1701_value : Long = 9223372036854775807L
var var_$1701_init : Boolean = true
var var_$1701_ts : Long = 0L
var var_$1701_error : Throwable = null
var var_$1701_unknown : Boolean = false
var var_$1873_changed : Boolean = true
var var_$1873_value : Long = 9223372036854775807L
var var_$1873_init : Boolean = true
var var_$1873_error : Throwable = null
var var_$1873_unknown : Boolean = false
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
var var_isFinalFalseReset$1698_changed : Boolean = false
var var_isFinalFalseReset$1698_unknown : Boolean = false
var var_isFinalFalseReset$1698_error : Throwable = null
var var_isFinalFalseReset$1698_value : Boolean = false
var var_$1697_changed : Boolean = false
var var_$1697_lastValue : Boolean = false
var var_$1697_lastInit : Boolean = false
var var_$1697_lastError : Throwable = null
var var_$1697_init : Boolean = false
var var_$1697_ts : Long = 0L
var var_$1697_unknown : Boolean = false
var var_$1697_value : Boolean = false
var var_$1697_error : Throwable = null
var var_stillFulfillableReset$1696_changed : Boolean = false
var var_stillFulfillableReset$1696_unknown : Boolean = false
var var_stillFulfillableReset$1696_error : Throwable = null
var var_stillFulfillableReset$1696_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1696_init : Boolean = false
var var_value$1695_changed : Boolean = false
var var_value$1695_unknown : Boolean = false
var var_value$1695_error : Throwable = null
var var_value$1695_value : Boolean = false
var var_value$1695_init : Boolean = false
var var_$1935_changed : Boolean = false
var var_$1935_lastValue : Boolean = false
var var_$1935_lastInit : Boolean = false
var var_$1935_lastError : Throwable = null
var var_$1935_unknown : Boolean = false
var var_$1935_error : Throwable = null
var var_$1935_value : Boolean = false
var var_$1935_init : Boolean = false
var var_$1935_ts : Long = 0L
var var_$1916_changed : Boolean = false
var var_$1916_value : Long = 0L
var var_$1916_init : Boolean = false
var var_$1916_error : Throwable = null
var var_$1916_unknown : Boolean = false
var var_$2066_changed : Boolean = false
var var_$2066_unknown : Boolean = false
var var_$2066_error : Throwable = null
var var_$2066_value : Long = 0L
var var_$2066_init : Boolean = false
var var_prev$1929_changed : Boolean = false
var var_prev$1929_init : Boolean = false
var var_prev$1929_unknown : Boolean = false
var var_prev$1929_error : Throwable = null
var var_prev$1929_value : Long = 0L
var var_$1927_changed : Boolean = false
var var_$1927_unknown : Boolean = false
var var_$1927_error : Throwable = null
var var_$1927_value : Long = 0L
var var_$1927_init : Boolean = false
var var_$1924_changed : Boolean = false
var var_$1924_unknown : Boolean = false
var var_$1924_error : Throwable = null
var var_$1924_value : Long = 0L
var var_$1924_init : Boolean = false
var var_$2065_changed : Boolean = false
var var_$2065_unknown : Boolean = false
var var_$2065_error : Throwable = null
var var_$2065_value : Long = 0L
var var_$2065_init : Boolean = false
var var_$2065_ts : Long = 0L
var var_$2082_changed : Boolean = false
var var_$2082_value : Long = 0L
var var_$2082_init : Boolean = false
var var_$2082_unknown : Boolean = false
var var_$2082_error : Throwable = null
var var_$2079_changed : Boolean = false
var var_$2079_unknown : Boolean = false
var var_$2079_error : Throwable = null
var var_$2079_value : Long = 0L
var var_$2079_init : Boolean = false
var var_$2064_changed : Boolean = false
var var_$2064_unknown : Boolean = false
var var_$2064_error : Throwable = null
var var_$2064_value : Boolean = false
var var_$2064_init : Boolean = false
var var_$2016_changed : Boolean = false
var var_$2016_unknown : Boolean = false
var var_$2016_error : Throwable = null
var var_$2016_value : Long = 0L
var var_$1914_changed : Boolean = false
var var_$1914_unknown : Boolean = false
var var_$1914_error : Throwable = null
var var_$1914_value : Boolean = false
var var_$1914_init : Boolean = false
var var_resets$1786_changed : Boolean = false
var var_resets$1786_unknown : Boolean = false
var var_resets$1786_error : Throwable = null
var var_resets$1786_value : Long = 0L
var var_$1785_nextTs : Long = -1L
var var_safeDelay$1841_nextTs : Long = -1L



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

if (((var_$1785_nextTs > lastProcessedTs) && (currTs > var_$1785_nextTs))) {
currTs = var_$1785_nextTs
}
if (((var_safeDelay$1841_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1841_nextTs))) {
currTs = var_safeDelay$1841_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1718_changed = false
if ((var_response3_changed)) {
var_$1718_value = var_response3_ts
var_$1718_unknown = var_response3_unknown
if ((var_$1718_unknown)) {
var_$1718_error = var_response3_error
} else {
var_$1718_error = null
}
var_$1718_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1715_changed = false
}
if ((var_$1718_changed)) {
var_defaultTime$1715_value = var_$1718_value
var_defaultTime$1715_init = true
var_defaultTime$1715_error = var_$1718_error
var_defaultTime$1715_changed = true
var_defaultTime$1715_unknown = var_$1718_unknown
}
var_$1728_changed = false
if ((var_response2_changed)) {
var_$1728_value = var_response2_ts
var_$1728_unknown = var_response2_unknown
if ((var_$1728_unknown)) {
var_$1728_error = var_response2_error
} else {
var_$1728_error = null
}
var_$1728_changed = true
}
var_$1722_changed = false
if ((var_response1_changed)) {
var_$1722_value = var_response1_ts
var_$1722_unknown = var_response1_unknown
if ((var_$1722_unknown)) {
var_$1722_error = var_response1_error
} else {
var_$1722_error = null
}
var_$1722_changed = true
}
var_$1738_changed = false
if ((var_stimulus_changed)) {
var_$1738_value = var_stimulus_ts
var_$1738_unknown = var_stimulus_unknown
if ((var_$1738_unknown)) {
var_$1738_error = var_stimulus_error
} else {
var_$1738_error = null
}
var_$1738_changed = true
}
var_$1721_changed = false
if ((var_$1722_changed) || (var_$1738_changed)) {
var_$1721_changed = true
var_$1721_unknown = (var_$1722_unknown && var_$1738_unknown)
if ((var_$1722_changed)) {
var_$1721_value = var_$1722_value
var_$1721_error = var_$1722_error
} else {
if ((var_$1738_changed)) {
var_$1721_value = var_$1738_value
var_$1721_error = var_$1738_error
}
}
}
var_$1719_changed = false
if ((var_$1728_changed) || (var_$1721_changed)) {
var_$1719_changed = true
var_$1719_unknown = (var_$1728_unknown && var_$1721_unknown)
if ((var_$1728_changed)) {
var_$1719_value = var_$1728_value
var_$1719_error = var_$1728_error
} else {
if ((var_$1721_changed)) {
var_$1719_value = var_$1721_value
var_$1719_error = var_$1721_error
}
}
}
var_timeNow$1717_changed = false
if ((var_$1718_changed) || (var_$1719_changed)) {
var_timeNow$1717_init = true
var_timeNow$1717_changed = true
var_timeNow$1717_unknown = (var_$1718_unknown && var_$1719_unknown)
if ((var_$1718_changed)) {
var_timeNow$1717_value = var_$1718_value
var_timeNow$1717_error = var_$1718_error
} else {
if ((var_$1719_changed)) {
var_timeNow$1717_value = var_$1719_value
var_timeNow$1717_error = var_$1719_error
}
}
}
var_$1714_changed = false
if ((var_defaultTime$1715_init && var_timeNow$1717_init)) {
if ((var_defaultTime$1715_changed) || (var_timeNow$1717_changed)) {
var_$1714_unknown = (var_defaultTime$1715_unknown && var_timeNow$1717_unknown)
if ((var_$1714_unknown)) {
var_$1714_error = UnknownEventError(null)
} else {
var_$1714_error = null
try {
var_$1714_value = ((if((var_defaultTime$1715_error == null)) {var_defaultTime$1715_value} else {throw var_defaultTime$1715_error}) >= (if((var_timeNow$1717_error == null)) {var_timeNow$1717_value} else {throw var_timeNow$1717_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$1727_changed = false
}
if ((var_$1728_changed)) {
var_defaultTime$1727_value = var_$1728_value
var_defaultTime$1727_init = true
var_defaultTime$1727_error = var_$1728_error
var_defaultTime$1727_changed = true
var_defaultTime$1727_unknown = var_$1728_unknown
}
var_$1726_changed = false
if ((var_defaultTime$1727_init && var_timeNow$1717_init)) {
if ((var_defaultTime$1727_changed) || (var_timeNow$1717_changed)) {
var_$1726_unknown = (var_defaultTime$1727_unknown && var_timeNow$1717_unknown)
if ((var_$1726_unknown)) {
var_$1726_error = UnknownEventError(null)
} else {
var_$1726_error = null
try {
var_$1726_value = ((if((var_defaultTime$1727_error == null)) {var_defaultTime$1727_value} else {throw var_defaultTime$1727_error}) >= (if((var_timeNow$1717_error == null)) {var_timeNow$1717_value} else {throw var_timeNow$1717_error}))
} catch {
case var_err : Throwable => {
var_$1726_error = var_err
}
}
}
var_$1726_init = true
var_$1726_changed = true
}
}
if ((!(currTs == 0L))) {
var_defaultTime$1732_changed = false
}
if ((var_$1722_changed)) {
var_defaultTime$1732_value = var_$1722_value
var_defaultTime$1732_init = true
var_defaultTime$1732_error = var_$1722_error
var_defaultTime$1732_changed = true
var_defaultTime$1732_unknown = var_$1722_unknown
}
var_$1731_changed = false
if ((var_defaultTime$1732_init && var_timeNow$1717_init)) {
if ((var_defaultTime$1732_changed) || (var_timeNow$1717_changed)) {
var_$1731_unknown = (var_defaultTime$1732_unknown && var_timeNow$1717_unknown)
if ((var_$1731_unknown)) {
var_$1731_error = UnknownEventError(null)
} else {
var_$1731_error = null
try {
var_$1731_value = ((if((var_defaultTime$1732_error == null)) {var_defaultTime$1732_value} else {throw var_defaultTime$1732_error}) >= (if((var_timeNow$1717_error == null)) {var_timeNow$1717_value} else {throw var_timeNow$1717_error}))
} catch {
case var_err : Throwable => {
var_$1731_error = var_err
}
}
}
var_$1731_init = true
var_$1731_changed = true
}
}
if ((!(currTs == 0L))) {
var_defaultTime$1737_changed = false
}
if ((var_$1738_changed)) {
var_defaultTime$1737_value = var_$1738_value
var_defaultTime$1737_init = true
var_defaultTime$1737_error = var_$1738_error
var_defaultTime$1737_changed = true
var_defaultTime$1737_unknown = var_$1738_unknown
}
var_$1736_changed = false
if ((var_defaultTime$1737_init && var_timeNow$1717_init)) {
if ((var_defaultTime$1737_changed) || (var_timeNow$1717_changed)) {
var_$1736_unknown = (var_defaultTime$1737_unknown && var_timeNow$1717_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = ((if((var_defaultTime$1737_error == null)) {var_defaultTime$1737_value} else {throw var_defaultTime$1737_error}) >= (if((var_timeNow$1717_error == null)) {var_timeNow$1717_value} else {throw var_timeNow$1717_error}))
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
if ((!(currTs == 0L))) {
var_$1746_changed = false
}
if ((var_$1741_changed)) {
var_$1746_value = var_$1741_value
var_$1746_init = true
var_$1746_error = var_$1741_error
var_$1746_changed = true
var_$1746_unknown = var_$1741_unknown
}
if ((!(currTs == 0L))) {
var_$1779_changed = false
}
if ((var_$1834_changed)) {
var_$1779_value = var_$1834_value
var_$1779_init = true
var_$1779_error = var_$1834_error
var_$1779_changed = true
var_$1779_unknown = var_$1834_unknown
}
if ((!(currTs == 0L))) {
var_$1745_changed = false
}
if ((var_stimulus_changed)) {
var_$1745_value = var_stimulus_value
var_$1745_init = true
var_$1745_error = var_stimulus_error
var_$1745_changed = true
var_$1745_unknown = var_stimulus_unknown
}
var_$1739_changed = false
if ((var_$1746_init && var_$1779_init && var_$1745_init)) {
if ((var_$1746_changed) || (var_$1779_changed) || (var_$1745_changed)) {
var_$1739_unknown = (var_$1746_unknown && var_$1779_unknown && var_$1745_unknown)
if ((var_$1739_unknown)) {
var_$1739_error = UnknownEventError(null)
} else {
var_$1739_error = null
try {
var_$1739_value = ((if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}) + (((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error})) -> ((if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))))
} catch {
case var_err : Throwable => {
var_$1739_error = var_err
}
}
}
var_$1739_init = true
var_$1739_changed = true
}
}
var_eventStimulus$1735_changed = false
if ((var_$1736_init && var_$1739_init && var_$1746_init)) {
if ((var_$1736_changed) || (var_$1739_changed) || (var_$1746_changed)) {
var_eventStimulus$1735_unknown = (var_$1736_unknown && var_$1739_unknown && var_$1746_unknown)
if ((var_eventStimulus$1735_unknown)) {
var_eventStimulus$1735_error = UnknownEventError(null)
} else {
var_eventStimulus$1735_error = null
try {
var_eventStimulus$1735_value = (if ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error})) (if((var_$1739_error == null)) {var_$1739_value} else {throw var_$1739_error}) else (if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}))
} catch {
case var_err : Throwable => {
var_eventStimulus$1735_error = var_err
}
}
}
var_eventStimulus$1735_init = true
var_eventStimulus$1735_changed = true
}
}
if ((!(currTs == 0L))) {
var_$2075_changed = false
}
if ((var_$1834_changed)) {
var_$2075_value = var_$1834_value
var_$2075_init = true
var_$2075_error = var_$1834_error
var_$2075_changed = true
var_$2075_unknown = var_$1834_unknown
}
if ((!(currTs == 0L))) {
var_$1751_changed = false
}
if ((var_response1_changed)) {
var_$1751_value = var_response1_value
var_$1751_init = true
var_$1751_error = var_response1_error
var_$1751_changed = true
var_$1751_unknown = var_response1_unknown
}
var_$1734_changed = false
if ((var_eventStimulus$1735_init && var_$2075_init && var_$1751_init)) {
if ((var_eventStimulus$1735_changed) || (var_$2075_changed) || (var_$1751_changed)) {
var_$1734_unknown = (var_eventStimulus$1735_unknown && var_$2075_unknown && var_$1751_unknown)
if ((var_$1734_unknown)) {
var_$1734_error = UnknownEventError(null)
} else {
var_$1734_error = null
try {
var_$1734_value = ((if((var_eventStimulus$1735_error == null)) {var_eventStimulus$1735_value} else {throw var_eventStimulus$1735_error}) + (((if((var_$2075_error == null)) {var_$2075_value} else {throw var_$2075_error})) -> ((if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error}))))
} catch {
case var_err : Throwable => {
var_$1734_error = var_err
}
}
}
var_$1734_init = true
var_$1734_changed = true
}
}
var_eventResponse1$1730_changed = false
if ((var_$1731_init && var_$1734_init && var_eventStimulus$1735_init)) {
if ((var_$1731_changed) || (var_$1734_changed) || (var_eventStimulus$1735_changed)) {
var_eventResponse1$1730_unknown = (var_$1731_unknown && var_$1734_unknown && var_eventStimulus$1735_unknown)
if ((var_eventResponse1$1730_unknown)) {
var_eventResponse1$1730_error = UnknownEventError(null)
} else {
var_eventResponse1$1730_error = null
try {
var_eventResponse1$1730_value = (if ((if((var_$1731_error == null)) {var_$1731_value} else {throw var_$1731_error})) (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}) else (if((var_eventStimulus$1735_error == null)) {var_eventStimulus$1735_value} else {throw var_eventStimulus$1735_error}))
} catch {
case var_err : Throwable => {
var_eventResponse1$1730_error = var_err
}
}
}
var_eventResponse1$1730_init = true
var_eventResponse1$1730_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1752_changed = false
}
if ((var_$1834_changed)) {
var_$1752_value = var_$1834_value
var_$1752_init = true
var_$1752_error = var_$1834_error
var_$1752_changed = true
var_$1752_unknown = var_$1834_unknown
}
if ((!(currTs == 0L))) {
var_$1754_changed = false
}
if ((var_response2_changed)) {
var_$1754_value = var_response2_value
var_$1754_init = true
var_$1754_error = var_response2_error
var_$1754_changed = true
var_$1754_unknown = var_response2_unknown
}
var_$1729_changed = false
if ((var_eventResponse1$1730_init && var_$1752_init && var_$1754_init)) {
if ((var_eventResponse1$1730_changed) || (var_$1752_changed) || (var_$1754_changed)) {
var_$1729_unknown = (var_eventResponse1$1730_unknown && var_$1752_unknown && var_$1754_unknown)
if ((var_$1729_unknown)) {
var_$1729_error = UnknownEventError(null)
} else {
var_$1729_error = null
try {
var_$1729_value = ((if((var_eventResponse1$1730_error == null)) {var_eventResponse1$1730_value} else {throw var_eventResponse1$1730_error}) + (((if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error})) -> ((if((var_$1754_error == null)) {var_$1754_value} else {throw var_$1754_error}))))
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
var_eventResponse2$1725_changed = false
if ((var_$1726_init && var_$1729_init && var_eventResponse1$1730_init)) {
if ((var_$1726_changed) || (var_$1729_changed) || (var_eventResponse1$1730_changed)) {
var_eventResponse2$1725_unknown = (var_$1726_unknown && var_$1729_unknown && var_eventResponse1$1730_unknown)
if ((var_eventResponse2$1725_unknown)) {
var_eventResponse2$1725_error = UnknownEventError(null)
} else {
var_eventResponse2$1725_error = null
try {
var_eventResponse2$1725_value = (if ((if((var_$1726_error == null)) {var_$1726_value} else {throw var_$1726_error})) (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}) else (if((var_eventResponse1$1730_error == null)) {var_eventResponse1$1730_value} else {throw var_eventResponse1$1730_error}))
} catch {
case var_err : Throwable => {
var_eventResponse2$1725_error = var_err
}
}
}
var_eventResponse2$1725_init = true
var_eventResponse2$1725_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1755_changed = false
}
if ((var_$1834_changed)) {
var_$1755_value = var_$1834_value
var_$1755_init = true
var_$1755_error = var_$1834_error
var_$1755_changed = true
var_$1755_unknown = var_$1834_unknown
}
if ((!(currTs == 0L))) {
var_$1757_changed = false
}
if ((var_response3_changed)) {
var_$1757_value = var_response3_value
var_$1757_init = true
var_$1757_error = var_response3_error
var_$1757_changed = true
var_$1757_unknown = var_response3_unknown
}
var_$1724_changed = false
if ((var_eventResponse2$1725_init && var_$1755_init && var_$1757_init)) {
if ((var_eventResponse2$1725_changed) || (var_$1755_changed) || (var_$1757_changed)) {
var_$1724_unknown = (var_eventResponse2$1725_unknown && var_$1755_unknown && var_$1757_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = ((if((var_eventResponse2$1725_error == null)) {var_eventResponse2$1725_value} else {throw var_eventResponse2$1725_error}) + (((if((var_$1755_error == null)) {var_$1755_value} else {throw var_$1755_error})) -> ((if((var_$1757_error == null)) {var_$1757_value} else {throw var_$1757_error}))))
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
var_eventResponse3$1713_changed = false
if ((var_$1714_init && var_$1724_init && var_eventResponse2$1725_init)) {
if ((var_$1714_changed) || (var_$1724_changed) || (var_eventResponse2$1725_changed)) {
var_eventResponse3$1713_unknown = (var_$1714_unknown && var_$1724_unknown && var_eventResponse2$1725_unknown)
if ((var_eventResponse3$1713_unknown)) {
var_eventResponse3$1713_error = UnknownEventError(null)
} else {
var_eventResponse3$1713_error = null
try {
var_eventResponse3$1713_value = (if ((if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error})) (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}) else (if((var_eventResponse2$1725_error == null)) {var_eventResponse2$1725_value} else {throw var_eventResponse2$1725_error}))
} catch {
case var_err : Throwable => {
var_eventResponse3$1713_error = var_err
}
}
}
var_eventResponse3$1713_init = true
var_eventResponse3$1713_ts = currTs
var_eventResponse3$1713_changed = true
}
}
var_$1712_changed = false
if ((var_eventResponse3$1713_init && var_$1779_init)) {
if ((var_eventResponse3$1713_changed) || (var_$1779_changed)) {
var_$1712_unknown = (var_eventResponse3$1713_unknown && var_$1779_unknown)
if ((var_$1712_unknown)) {
var_$1712_error = UnknownEventError(null)
} else {
var_$1712_error = null
try {
var_$1712_value = (if((var_eventResponse3$1713_error == null)) {var_eventResponse3$1713_value} else {throw var_eventResponse3$1713_error}).contains((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
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
var_$1762_changed = false
if ((var_eventResponse3$1713_changed)) {
if ((var_$1770_ts == currTs && var_$1770_lastInit) || (!(var_$1770_ts == currTs) && var_$1770_init)) {
var_$1762_changed = true
var_$1762_unknown = var_eventResponse3$1713_unknown
if ((var_$1762_unknown)) {
var_$1762_error = var_eventResponse3$1713_error
} else {
if ((var_$1770_ts == currTs)) {
var_$1762_value = var_$1770_lastValue
var_$1762_error = var_$1770_lastError
} else {
var_$1762_value = var_$1770_value
var_$1762_error = var_$1770_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1761_changed = false
}
if ((var_$1762_changed)) {
var_$1761_value = var_$1762_value
var_$1761_init = true
var_$1761_error = var_$1762_error
var_$1761_changed = true
var_$1761_unknown = var_$1762_unknown
}
var_$1765_changed = false
if ((var_eventResponse3$1713_init && var_$1779_init)) {
if ((var_eventResponse3$1713_changed) || (var_$1779_changed)) {
var_$1765_unknown = (var_eventResponse3$1713_unknown && var_$1779_unknown)
if ((var_$1765_unknown)) {
var_$1765_error = UnknownEventError(null)
} else {
var_$1765_error = null
try {
var_$1765_value = (if((var_eventResponse3$1713_error == null)) {var_eventResponse3$1713_value} else {throw var_eventResponse3$1713_error})((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
} catch {
case var_err : Throwable => {
var_$1765_error = var_err
}
}
}
var_$1765_init = true
var_$1765_changed = true
}
}
var_$1760_changed = false
if ((var_$1761_init && var_$1765_init)) {
if ((var_$1761_changed) || (var_$1765_changed)) {
var_$1760_unknown = (var_$1761_unknown && var_$1765_unknown)
if ((var_$1760_unknown)) {
var_$1760_error = UnknownEventError(null)
} else {
var_$1760_error = null
try {
var_$1760_value = ((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}) + ((if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error})))
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
var_unmatchedStimulusColors$1711_changed = false
if ((var_$1712_init && var_$1760_init && var_$1761_init)) {
if ((var_$1712_changed) || (var_$1760_changed) || (var_$1761_changed)) {
var_unmatchedStimulusColors$1711_unknown = (var_$1712_unknown && var_$1760_unknown && var_$1761_unknown)
if ((var_unmatchedStimulusColors$1711_unknown)) {
var_unmatchedStimulusColors$1711_error = UnknownEventError(null)
} else {
var_unmatchedStimulusColors$1711_error = null
try {
var_unmatchedStimulusColors$1711_value = (if ((if((var_$1712_error == null)) {var_$1712_value} else {throw var_$1712_error})) (if((var_$1760_error == null)) {var_$1760_value} else {throw var_$1760_error}) else (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
} catch {
case var_err : Throwable => {
var_unmatchedStimulusColors$1711_error = var_err
}
}
}
var_unmatchedStimulusColors$1711_init = true
var_unmatchedStimulusColors$1711_changed = true
}
}
var_$1776_changed = false
if ((var_eventResponse3$1713_init)) {
if ((var_eventResponse3$1713_changed)) {
var_$1776_unknown = (var_eventResponse3$1713_unknown)
if ((var_$1776_unknown)) {
var_$1776_error = UnknownEventError(null)
} else {
var_$1776_error = null
try {
var_$1776_value = var_removeStimulusEvents$1774.apply((if((var_eventResponse3$1713_error == null)) {var_eventResponse3$1713_value} else {throw var_eventResponse3$1713_error}))
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
if ((var_$1776_init)) {
if ((var_$1776_changed)) {
var_$1775_unknown = (var_$1776_unknown)
if ((var_$1775_unknown)) {
var_$1775_error = UnknownEventError(null)
} else {
var_$1775_error = null
try {
var_$1775_value = (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}).keys.toList
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
var_unmatchedStimulusColors$1772_changed = false
if ((var_$1776_init && var_$1775_init)) {
if ((var_$1776_changed) || (var_$1775_changed)) {
var_unmatchedStimulusColors$1772_unknown = (var_$1776_unknown && var_$1775_unknown)
if ((var_unmatchedStimulusColors$1772_unknown)) {
var_unmatchedStimulusColors$1772_error = UnknownEventError(null)
} else {
var_unmatchedStimulusColors$1772_error = null
try {
var_unmatchedStimulusColors$1772_value = (var_mapValuesToList$1777.apply(((if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error})).asInstanceOf[Map[Any, Any]], ((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error})).asInstanceOf[List[Any]])).asInstanceOf[List[Long]]
} catch {
case var_err : Throwable => {
var_unmatchedStimulusColors$1772_error = var_err
}
}
}
var_unmatchedStimulusColors$1772_init = true
var_unmatchedStimulusColors$1772_changed = true
}
}
var_$1770_changed = false
if ((var_unmatchedStimulusColors$1711_init && var_unmatchedStimulusColors$1772_init)) {
if ((var_unmatchedStimulusColors$1711_changed) || (var_unmatchedStimulusColors$1772_changed)) {
var_$1770_lastValue = var_$1770_value
var_$1770_lastInit = var_$1770_init
var_$1770_lastError = var_$1770_error
var_$1770_unknown = (var_unmatchedStimulusColors$1711_unknown && var_unmatchedStimulusColors$1772_unknown)
if ((var_$1770_unknown)) {
var_$1770_error = UnknownEventError(null)
} else {
var_$1770_error = null
try {
var_$1770_value = (var_removeListFromSet$1778.apply(((if((var_unmatchedStimulusColors$1711_error == null)) {var_unmatchedStimulusColors$1711_value} else {throw var_unmatchedStimulusColors$1711_error})).asInstanceOf[Set[Any]], ((if((var_unmatchedStimulusColors$1772_error == null)) {var_unmatchedStimulusColors$1772_value} else {throw var_unmatchedStimulusColors$1772_error})).asInstanceOf[List[Any]])).asInstanceOf[Set[Long]]
} catch {
case var_err : Throwable => {
var_$1770_error = var_err
}
}
}
var_$1770_init = true
var_$1770_ts = currTs
var_$1770_changed = true
}
}
var_$1709_changed = false
if ((var_$1770_init)) {
if ((var_$1770_changed)) {
var_$1709_unknown = (var_$1770_unknown)
if ((var_$1709_unknown)) {
var_$1709_error = UnknownEventError(null)
} else {
var_$1709_error = null
try {
var_$1709_value = (if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}).size
} catch {
case var_err : Throwable => {
var_$1709_error = var_err
}
}
}
var_$1709_init = true
var_$1709_changed = true
}
}
var_$1708_changed = false
if ((var_$1709_init && var_$1779_init)) {
if ((var_$1709_changed) || (var_$1779_changed)) {
var_$1708_unknown = (var_$1709_unknown && var_$1779_unknown)
if ((var_$1708_unknown)) {
var_$1708_error = UnknownEventError(null)
} else {
var_$1708_error = null
try {
var_$1708_value = ((if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}) == (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
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
var_$1837_changed = false
if ((var_eventResponse3$1713_changed)) {
var_$1837_init = var_eventResponse3$1713_init
if ((var_eventResponse3$1713_unknown)) {
var_$1837_error = UnknownEventError(var_eventResponse3$1713_error)
} else {
var_$1837_error = null
}
var_$1837_changed = var_eventResponse3$1713_changed
var_$1837_unknown = var_eventResponse3$1713_unknown
}
var_$1938_changed = false
if ((var_eventResponse3$1713_changed)) {
if ((var_$1935_ts == currTs && var_$1935_lastInit) || (!(var_$1935_ts == currTs) && var_$1935_init)) {
var_$1938_lastValue = var_$1938_value
var_$1938_lastInit = var_$1938_init
var_$1938_lastError = var_$1938_error
var_$1938_ts = currTs
var_$1938_changed = true
var_$1938_init = true
var_$1938_unknown = var_eventResponse3$1713_unknown
if ((var_$1938_unknown)) {
var_$1938_error = var_eventResponse3$1713_error
} else {
if ((var_$1935_ts == currTs)) {
var_$1938_value = var_$1935_lastValue
var_$1938_error = var_$1935_lastError
} else {
var_$1938_value = var_$1935_value
var_$1938_error = var_$1935_error
}
}
}
}
var_$1937_changed = false
if ((var_eventResponse3$1713_changed)) {
if ((var_$1938_ts == currTs && var_$1938_lastInit) || (!(var_$1938_ts == currTs) && var_$1938_init)) {
var_$1937_changed = true
var_$1937_init = true
var_$1937_unknown = var_eventResponse3$1713_unknown
if ((var_$1937_unknown)) {
var_$1937_error = var_eventResponse3$1713_error
} else {
if ((var_$1938_ts == currTs)) {
var_$1937_value = var_$1938_lastValue
var_$1937_error = var_$1938_lastError
} else {
var_$1937_value = var_$1938_value
var_$1937_error = var_$1938_error
}
}
}
}
var_$1936_changed = false
if ((var_$1937_init)) {
if ((var_$1937_changed)) {
var_$1936_unknown = (var_$1937_unknown)
if ((var_$1936_unknown)) {
var_$1936_error = UnknownEventError(null)
} else {
var_$1936_error = null
try {
var_$1936_value = !((if((var_$1937_error == null)) {var_$1937_value} else {throw var_$1937_error}))
} catch {
case var_err : Throwable => {
var_$1936_error = var_err
}
}
}
var_$1936_init = true
var_$1936_changed = true
}
}
if ((var_$1938_init && var_$1936_init)) {
if ((var_$1938_changed) || (var_$1936_changed)) {
var_failingTimeStamps$1789_unknown = (var_$1938_unknown && var_$1936_unknown)
if ((var_failingTimeStamps$1789_unknown)) {
var_failingTimeStamps$1789_error = UnknownEventError(null)
} else {
var_failingTimeStamps$1789_error = null
try {
var_failingTimeStamps$1789_value = ((if((var_$1938_error == null)) {var_$1938_value} else {throw var_$1938_error}) && (if((var_$1936_error == null)) {var_$1936_value} else {throw var_$1936_error}))
} catch {
case var_err : Throwable => {
var_failingTimeStamps$1789_error = var_err
}
}
}
var_failingTimeStamps$1789_init = true
}
}
var_$1926_changed = false
if ((var_failingTimeStamps$1789_init && var_$1837_changed)) {
if ((var_failingTimeStamps$1789_value) || (!(var_failingTimeStamps$1789_error == null)) || (var_failingTimeStamps$1789_unknown)) {
if ((!(var_failingTimeStamps$1789_error == null))) {
var_$1926_error = var_failingTimeStamps$1789_error
} else {
var_$1926_error = var_$1837_error
}
var_$1926_changed = true
var_$1926_init = var_$1837_init
var_$1926_unknown = (var_$1837_unknown || !(var_failingTimeStamps$1789_error == null))
}
}
var_$1785_changed = false
if ((var_$1785_nextTs == currTs)) {
var_$1785_changed = true
var_$1785_unknown = false
}
if ((!(currTs == 0L))) {
var_storedClustersBeforeRemove$1810_changed = false
}
if ((var_$1818_changed)) {
var_storedClustersBeforeRemove$1810_lastValue = var_storedClustersBeforeRemove$1810_value
var_storedClustersBeforeRemove$1810_lastInit = var_storedClustersBeforeRemove$1810_init
var_storedClustersBeforeRemove$1810_lastError = var_storedClustersBeforeRemove$1810_error
var_storedClustersBeforeRemove$1810_value = var_$1818_value
var_storedClustersBeforeRemove$1810_init = true
var_storedClustersBeforeRemove$1810_ts = currTs
var_storedClustersBeforeRemove$1810_error = var_$1818_error
var_storedClustersBeforeRemove$1810_changed = true
var_storedClustersBeforeRemove$1810_unknown = var_$1818_unknown
}
var_mergedStream$1794_changed = false
if ((var_$1785_changed)) {
if ((var_storedClustersBeforeRemove$1810_ts == currTs && var_storedClustersBeforeRemove$1810_lastInit) || (!(var_storedClustersBeforeRemove$1810_ts == currTs) && var_storedClustersBeforeRemove$1810_init)) {
var_mergedStream$1794_changed = true
var_mergedStream$1794_unknown = var_$1785_unknown
if ((var_mergedStream$1794_unknown)) {
var_mergedStream$1794_error = var_$1785_error
} else {
if ((var_storedClustersBeforeRemove$1810_ts == currTs)) {
var_mergedStream$1794_value = var_storedClustersBeforeRemove$1810_lastValue
var_mergedStream$1794_error = var_storedClustersBeforeRemove$1810_lastError
} else {
var_mergedStream$1794_value = var_storedClustersBeforeRemove$1810_value
var_mergedStream$1794_error = var_storedClustersBeforeRemove$1810_error
}
}
}
}
var_$1790_changed = false
if ((var_storedClustersBeforeRemove$1810_changed) || (var_mergedStream$1794_changed)) {
var_$1790_changed = true
var_$1790_unknown = (var_storedClustersBeforeRemove$1810_unknown && var_mergedStream$1794_unknown)
if ((var_storedClustersBeforeRemove$1810_changed)) {
var_$1790_value = var_storedClustersBeforeRemove$1810_value
var_$1790_error = var_storedClustersBeforeRemove$1810_error
} else {
if ((var_mergedStream$1794_changed)) {
var_$1790_value = var_mergedStream$1794_value
var_$1790_error = var_mergedStream$1794_error
}
}
}
var_on$1784_changed = false
if ((var_$1785_changed) || (var_$1790_changed)) {
var_on$1784_error = null
try {
var_on$1784_unknown = true
var_on$1784_fval = var_$1795.apply((if((var_$1785_changed)) {EOSome((if((var_$1785_error == null)) {var_$1785_value} else {throw var_$1785_error}))} else {EONone()}), (if((var_$1790_changed)) {EOSome((if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error}))} else {EONone()}))
var_on$1784_unknown = false
if ((var_on$1784_fval.isDefined)) {
var_on$1784_changed = true
var_on$1784_newValue = var_on$1784_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1784_changed = true
var_on$1784_error = var_err
}
}
if ((var_on$1784_unknown) || (var_$1785_unknown && var_$1790_unknown)) {
var_on$1784_changed = true
var_on$1784_unknown = true
var_on$1784_error = UnknownEventError(var_on$1784_error)
}
if ((var_on$1784_changed)) {
var_on$1784_value = var_on$1784_newValue
}
}
var_$1802_changed = false
if ((var_eventResponse3$1713_changed)) {
var_$1802_lastValue = var_$1802_value
var_$1802_lastInit = var_$1802_init
var_$1802_lastError = var_$1802_error
var_$1802_value = var_eventResponse3$1713_ts
var_$1802_init = true
var_$1802_ts = currTs
var_$1802_unknown = var_eventResponse3$1713_unknown
if ((var_$1802_unknown)) {
var_$1802_error = var_eventResponse3$1713_error
} else {
var_$1802_error = null
}
var_$1802_changed = true
}
var_$1800_changed = false
if ((var_$1802_changed)) {
if ((var_$2069_ts == currTs && var_$2069_lastInit) || (!(var_$2069_ts == currTs) && var_$2069_init)) {
var_$1800_changed = true
var_$1800_init = true
var_$1800_unknown = var_$1802_unknown
if ((var_$1800_unknown)) {
var_$1800_error = var_$1802_error
} else {
if ((var_$2069_ts == currTs)) {
var_$1800_value = var_$2069_lastValue
var_$1800_error = var_$2069_lastError
} else {
var_$1800_value = var_$2069_value
var_$1800_error = var_$2069_error
}
}
}
}
var_prev$1806_changed = false
if ((var_$1770_changed)) {
if ((var_$1770_ts == currTs && var_$1770_lastInit) || (!(var_$1770_ts == currTs) && var_$1770_init)) {
var_prev$1806_changed = true
var_prev$1806_init = true
var_prev$1806_unknown = var_$1770_unknown
if ((var_prev$1806_unknown)) {
var_prev$1806_error = var_$1770_error
} else {
if ((var_$1770_ts == currTs)) {
var_prev$1806_value = var_$1770_lastValue
var_prev$1806_error = var_$1770_lastError
} else {
var_prev$1806_value = var_$1770_value
var_prev$1806_error = var_$1770_error
}
}
}
}
var_storedClustersBeforeRemove$1799_changed = false
if ((var_$1800_init && var_$1776_init && var_$1775_init && var_prev$1806_init && var_$1802_init)) {
if ((var_$1800_changed) || (var_$1776_changed) || (var_$1775_changed) || (var_prev$1806_changed) || (var_$1802_changed)) {
var_storedClustersBeforeRemove$1799_unknown = (var_$1800_unknown && var_$1776_unknown && var_$1775_unknown && var_prev$1806_unknown && var_$1802_unknown)
if ((var_storedClustersBeforeRemove$1799_unknown)) {
var_storedClustersBeforeRemove$1799_error = UnknownEventError(null)
} else {
var_storedClustersBeforeRemove$1799_error = null
try {
var_storedClustersBeforeRemove$1799_value = var_updateSynchronizationClusters$1809.apply((if((var_$1800_error == null)) {var_$1800_value} else {throw var_$1800_error}), (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}), (if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}), (if((var_prev$1806_error == null)) {var_prev$1806_value} else {throw var_prev$1806_error}), (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
} catch {
case var_err : Throwable => {
var_storedClustersBeforeRemove$1799_error = var_err
}
}
}
var_storedClustersBeforeRemove$1799_changed = true
}
}
var_$1798_changed = false
if ((var_storedClustersBeforeRemove$1799_changed) || (var_storedClustersBeforeRemove$1810_changed)) {
var_$1798_init = true
var_$1798_changed = true
var_$1798_unknown = (var_storedClustersBeforeRemove$1799_unknown && var_storedClustersBeforeRemove$1810_unknown)
if ((var_storedClustersBeforeRemove$1799_changed)) {
var_$1798_value = var_storedClustersBeforeRemove$1799_value
var_$1798_error = var_storedClustersBeforeRemove$1799_error
} else {
if ((var_storedClustersBeforeRemove$1810_changed)) {
var_$1798_value = var_storedClustersBeforeRemove$1810_value
var_$1798_error = var_storedClustersBeforeRemove$1810_error
}
}
}
var_$1813_changed = false
if ((var_$1798_init)) {
if ((var_$1798_changed)) {
var_$1813_unknown = (var_$1798_unknown)
if ((var_$1813_unknown)) {
var_$1813_error = UnknownEventError(null)
} else {
var_$1813_error = null
try {
var_$1813_value = var_fulfilledClustersInMap$1815.apply((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}))
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
var_$1797_changed = false
if ((var_$1798_init && var_$1813_init)) {
if ((var_$1798_changed) || (var_$1813_changed)) {
var_$1797_unknown = (var_$1798_unknown && var_$1813_unknown)
if ((var_$1797_unknown)) {
var_$1797_error = UnknownEventError(null)
} else {
var_$1797_error = null
try {
var_$1797_value = var_removeClusters$1816.apply((if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}), (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}))
} catch {
case var_err : Throwable => {
var_$1797_error = var_err
}
}
}
var_$1797_changed = true
}
}
var_storedClusters$1796_changed = false
if ((var_$1797_changed) || (var_storedClustersBeforeRemove$1810_changed)) {
var_storedClusters$1796_changed = true
var_storedClusters$1796_unknown = (var_$1797_unknown && var_storedClustersBeforeRemove$1810_unknown)
if ((var_$1797_changed)) {
var_storedClusters$1796_value = var_$1797_value
var_storedClusters$1796_error = var_$1797_error
} else {
if ((var_storedClustersBeforeRemove$1810_changed)) {
var_storedClusters$1796_value = var_storedClustersBeforeRemove$1810_value
var_storedClusters$1796_error = var_storedClustersBeforeRemove$1810_error
}
}
}
var_$2069_changed = false
if ((var_on$1784_changed) || (var_storedClusters$1796_changed)) {
var_$2069_lastValue = var_$2069_value
var_$2069_lastInit = var_$2069_init
var_$2069_lastError = var_$2069_error
var_$2069_init = true
var_$2069_ts = currTs
var_$2069_changed = true
var_$2069_unknown = (var_on$1784_unknown && var_storedClusters$1796_unknown)
if ((var_on$1784_changed)) {
var_$2069_value = var_on$1784_value
var_$2069_error = var_on$1784_error
} else {
if ((var_storedClusters$1796_changed)) {
var_$2069_value = var_storedClusters$1796_value
var_$2069_error = var_storedClusters$1796_error
}
}
}
var_$1782_changed = false
if ((var_$2069_init)) {
if ((var_$2069_changed)) {
var_$1782_unknown = (var_$2069_unknown)
if ((var_$1782_unknown)) {
var_$1782_error = UnknownEventError(null)
} else {
var_$1782_error = null
try {
var_$1782_value = (if((var_$2069_error == null)) {var_$2069_value} else {throw var_$2069_error}).size
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
var_$1781_changed = false
if ((var_$1782_init && var_$1779_init)) {
if ((var_$1782_changed) || (var_$1779_changed)) {
var_$1781_unknown = (var_$1782_unknown && var_$1779_unknown)
if ((var_$1781_unknown)) {
var_$1781_error = UnknownEventError(null)
} else {
var_$1781_error = null
try {
var_$1781_value = ((if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}) == (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
} catch {
case var_err : Throwable => {
var_$1781_error = var_err
}
}
}
var_$1781_init = true
var_$1781_changed = true
}
}
var_$1707_changed = false
if ((var_$1708_init && var_$1781_init)) {
if ((var_$1708_changed) || (var_$1781_changed)) {
var_$1707_unknown = (var_$1708_unknown && var_$1781_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = ((if((var_$1708_error == null)) {var_$1708_value} else {throw var_$1708_error}) && (if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}))
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
if ((!(currTs == 0L))) {
var_$1822_changed = false
}
if ((var_$1843_changed)) {
var_$1822_value = var_$1843_value
var_$1822_init = true
var_$1822_error = var_$1843_error
var_$1822_changed = true
var_$1822_unknown = var_$1843_unknown
}
var_$2070_changed = false
if ((var_$2069_init)) {
if ((var_$2069_changed)) {
var_$2070_unknown = (var_$2069_unknown)
if ((var_$2070_unknown)) {
var_$2070_error = UnknownEventError(null)
} else {
var_$2070_error = null
try {
var_$2070_value = (if((var_$2069_error == null)) {var_$2069_value} else {throw var_$2069_error}).keys.toList
} catch {
case var_err : Throwable => {
var_$2070_error = var_err
}
}
}
var_$2070_init = true
var_$2070_changed = true
}
}
var_$2068_changed = false
if ((var_$2069_init && var_$2070_init)) {
if ((var_$2069_changed) || (var_$2070_changed)) {
var_$2068_unknown = (var_$2069_unknown && var_$2070_unknown)
if ((var_$2068_unknown)) {
var_$2068_error = UnknownEventError(null)
} else {
var_$2068_error = null
try {
var_$2068_value = var_startTimeOldestCluster$1832.apply((if((var_$2069_error == null)) {var_$2069_value} else {throw var_$2069_error}), (if((var_$2070_error == null)) {var_$2070_value} else {throw var_$2070_error}))
} catch {
case var_err : Throwable => {
var_$2068_error = var_err
}
}
}
var_$2068_init = true
var_$2068_changed = true
}
}
if ((!(currTs == 0L))) {
var_$2072_changed = false
}
if ((var_$1834_changed)) {
var_$2072_value = var_$1834_value
var_$2072_init = true
var_$2072_error = var_$1834_error
var_$2072_changed = true
var_$2072_unknown = var_$1834_unknown
}
var_$1827_changed = false
if ((var_$2068_init && var_$2072_init)) {
if ((var_$2068_changed) || (var_$2072_changed)) {
var_$1827_unknown = (var_$2068_unknown && var_$2072_unknown)
if ((var_$1827_unknown)) {
var_$1827_error = UnknownEventError(null)
} else {
var_$1827_error = null
try {
var_$1827_value = ((if((var_$2068_error == null)) {var_$2068_value} else {throw var_$2068_error}) + (if((var_$2072_error == null)) {var_$2072_value} else {throw var_$2072_error}))
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
var_safeDelay$1841_changed = false
if ((var_safeDelay$1841_nextTs == currTs)) {
var_safeDelay$1841_changed = true
var_safeDelay$1841_unknown = false
}
var_$1839_changed = false
if ((var_safeDelay$1841_changed)) {
if ((var_safeDelay$1841_unknown)) {
var_$1839_error = UnknownEventError(var_safeDelay$1841_error)
} else {
var_$1839_error = null
}
var_$1839_changed = var_safeDelay$1841_changed
var_$1839_unknown = var_safeDelay$1841_unknown
}
var_mergeUnit2$1836_changed = false
if ((var_$1837_changed) || (var_$1839_changed)) {
var_mergeUnit2$1836_ts = currTs
var_mergeUnit2$1836_changed = true
var_mergeUnit2$1836_unknown = (var_$1837_unknown && var_$1839_unknown)
if ((var_$1837_changed)) {
var_mergeUnit2$1836_error = var_$1837_error
} else {
if ((var_$1839_changed)) {
var_mergeUnit2$1836_error = var_$1839_error
}
}
}
var_$1835_changed = false
if ((var_mergeUnit2$1836_changed)) {
var_$1835_value = var_mergeUnit2$1836_ts
var_$1835_init = true
var_$1835_unknown = var_mergeUnit2$1836_unknown
if ((var_$1835_unknown)) {
var_$1835_error = var_mergeUnit2$1836_error
} else {
var_$1835_error = null
}
var_$1835_changed = true
}
var_$1826_changed = false
if ((var_$1827_init && var_$1835_init)) {
if ((var_$1827_changed) || (var_$1835_changed)) {
var_$1826_unknown = (var_$1827_unknown && var_$1835_unknown)
if ((var_$1826_unknown)) {
var_$1826_error = UnknownEventError(null)
} else {
var_$1826_error = null
try {
var_$1826_value = ((if((var_$1827_error == null)) {var_$1827_value} else {throw var_$1827_error}) > (if((var_$1835_error == null)) {var_$1835_value} else {throw var_$1835_error}))
} catch {
case var_err : Throwable => {
var_$1826_error = var_err
}
}
}
var_$1826_init = true
var_$1826_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1842_changed = false
}
if ((var_$1843_changed)) {
var_$1842_value = var_$1843_value
var_$1842_init = true
var_$1842_error = var_$1843_error
var_$1842_changed = true
var_$1842_unknown = var_$1843_unknown
}
if ((!(currTs == 0L))) {
var_$1845_changed = false
}
if ((var_$1843_changed)) {
var_$1845_value = var_$1843_value
var_$1845_init = true
var_$1845_error = var_$1843_error
var_$1845_changed = true
var_$1845_unknown = var_$1843_unknown
}
var_$1825_changed = false
if ((var_$1826_init && var_$1842_init && var_$1845_init)) {
if ((var_$1826_changed) || (var_$1842_changed) || (var_$1845_changed)) {
var_$1825_unknown = (var_$1826_unknown && var_$1842_unknown && var_$1845_unknown)
if ((var_$1825_unknown)) {
var_$1825_error = UnknownEventError(null)
} else {
var_$1825_error = null
try {
var_$1825_value = (if ((if((var_$1826_error == null)) {var_$1826_value} else {throw var_$1826_error})) (if((var_$1842_error == null)) {var_$1842_value} else {throw var_$1842_error}) else (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}))
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
var_result$1706_changed = false
if ((var_$1707_init && var_$1822_init && var_$1825_init)) {
if ((var_$1707_changed) || (var_$1822_changed) || (var_$1825_changed)) {
var_result$1706_unknown = (var_$1707_unknown && var_$1822_unknown && var_$1825_unknown)
if ((var_result$1706_unknown)) {
var_result$1706_error = UnknownEventError(null)
} else {
var_result$1706_error = null
try {
var_result$1706_value = (if ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error})) (if((var_$1822_error == null)) {var_$1822_value} else {throw var_$1822_error}) else (if((var_$1825_error == null)) {var_$1825_value} else {throw var_$1825_error}))
} catch {
case var_err : Throwable => {
var_result$1706_error = var_err
}
}
}
var_result$1706_init = true
var_result$1706_ts = currTs
var_result$1706_changed = true
}
}
var_$1860_changed = false
if ((var_result$1706_init)) {
if ((var_result$1706_changed)) {
var_$1860_unknown = (var_result$1706_unknown)
if ((var_$1860_unknown)) {
var_$1860_error = UnknownEventError(null)
} else {
var_$1860_error = null
try {
var_$1860_value = var_$1861.apply((if((var_result$1706_error == null)) {var_result$1706_value} else {throw var_result$1706_error}))
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
var_$1850_changed = false
if ((var_result$1706_init)) {
if ((var_result$1706_changed)) {
var_$1850_unknown = (var_result$1706_unknown)
if ((var_$1850_unknown)) {
var_$1850_error = UnknownEventError(null)
} else {
var_$1850_error = null
try {
var_$1850_value = var_$1883.apply((if((var_result$1706_error == null)) {var_result$1706_value} else {throw var_result$1706_error}))
} catch {
case var_err : Throwable => {
var_$1850_error = var_err
}
}
}
var_$1850_init = true
var_$1850_changed = true
}
}
var_$1849_changed = false
if ((var_$1850_init)) {
if ((var_$1850_changed)) {
var_$1849_unknown = (var_$1850_unknown)
if ((var_$1849_unknown)) {
var_$1849_error = UnknownEventError(null)
} else {
var_$1849_error = null
try {
var_$1849_value = !((if((var_$1850_error == null)) {var_$1850_value} else {throw var_$1850_error}))
} catch {
case var_err : Throwable => {
var_$1849_error = var_err
}
}
}
var_$1849_init = true
var_$1849_changed = true
}
}
var_$1704_changed = false
if ((var_$1860_init && var_$1849_init)) {
if ((var_$1860_changed) || (var_$1849_changed)) {
var_$1704_unknown = (var_$1860_unknown && var_$1849_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = ((if((var_$1860_error == null)) {var_$1860_value} else {throw var_$1860_error}) && (if((var_$1849_error == null)) {var_$1849_value} else {throw var_$1849_error}))
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
var_$1856_changed = false
if ((var_result$1706_changed)) {
if ((var_$1697_ts == currTs && var_$1697_lastInit) || (!(var_$1697_ts == currTs) && var_$1697_init)) {
var_$1856_changed = true
var_$1856_init = true
var_$1856_unknown = var_result$1706_unknown
if ((var_$1856_unknown)) {
var_$1856_error = var_result$1706_error
} else {
if ((var_$1697_ts == currTs)) {
var_$1856_value = var_$1697_lastValue
var_$1856_error = var_$1697_lastError
} else {
var_$1856_value = var_$1697_value
var_$1856_error = var_$1697_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1862_changed = false
}
if ((var_$1877_changed)) {
var_$1862_value = var_$1877_value
var_$1862_init = true
var_$1862_error = var_$1877_error
var_$1862_changed = true
var_$1862_unknown = var_$1877_unknown
}
var_$1859_changed = false
if ((var_$1860_init && var_$1862_init)) {
if ((var_$1860_changed) || (var_$1862_changed)) {
var_$1859_unknown = (var_$1860_unknown && var_$1862_unknown)
if ((var_$1859_unknown)) {
var_$1859_error = UnknownEventError(null)
} else {
var_$1859_error = null
try {
var_$1859_value = ((if((var_$1860_error == null)) {var_$1860_value} else {throw var_$1860_error}) == (if((var_$1862_error == null)) {var_$1862_value} else {throw var_$1862_error}))
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
if ((!(currTs == 0L))) {
var_$1876_changed = false
}
if ((var_$1877_changed)) {
var_$1876_value = var_$1877_value
var_$1876_init = true
var_$1876_error = var_$1877_error
var_$1876_changed = true
var_$1876_unknown = var_$1877_unknown
}
var_$1864_changed = false
if ((var_$1850_init && var_$1876_init)) {
if ((var_$1850_changed) || (var_$1876_changed)) {
var_$1864_unknown = (var_$1850_unknown && var_$1876_unknown)
if ((var_$1864_unknown)) {
var_$1864_error = UnknownEventError(null)
} else {
var_$1864_error = null
try {
var_$1864_value = ((if((var_$1850_error == null)) {var_$1850_value} else {throw var_$1850_error}) == (if((var_$1876_error == null)) {var_$1876_value} else {throw var_$1876_error}))
} catch {
case var_err : Throwable => {
var_$1864_error = var_err
}
}
}
var_$1864_init = true
var_$1864_changed = true
}
}
var_$1858_changed = false
if ((var_$1859_init && var_$1864_init)) {
if ((var_$1859_changed) || (var_$1864_changed)) {
var_$1858_unknown = (var_$1859_unknown && var_$1864_unknown)
if ((var_$1858_unknown)) {
var_$1858_error = UnknownEventError(null)
} else {
var_$1858_error = null
try {
var_$1858_value = ((if((var_$1859_error == null)) {var_$1859_value} else {throw var_$1859_error}) && (if((var_$1864_error == null)) {var_$1864_value} else {throw var_$1864_error}))
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
var_isFinalFalse$1855_changed = false
if ((var_$1856_init && var_$1858_init)) {
if ((var_$1856_changed) || (var_$1858_changed)) {
var_isFinalFalse$1855_unknown = (var_$1856_unknown && var_$1858_unknown)
if ((var_isFinalFalse$1855_unknown)) {
var_isFinalFalse$1855_error = UnknownEventError(null)
} else {
var_isFinalFalse$1855_error = null
try {
var_isFinalFalse$1855_value = ((if((var_$1856_error == null)) {var_$1856_value} else {throw var_$1856_error}) || (if((var_$1858_error == null)) {var_$1858_value} else {throw var_$1858_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1855_error = var_err
}
}
}
var_isFinalFalse$1855_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1872_changed = false
}
if ((var_isFinalFalse$1855_changed)) {
var_$1872_lastValue = var_$1872_value
var_$1872_lastInit = var_$1872_init
var_$1872_lastError = var_$1872_error
var_$1872_value = var_isFinalFalse$1855_value
var_$1872_init = true
var_$1872_ts = currTs
var_$1872_error = var_isFinalFalse$1855_error
var_$1872_changed = true
var_$1872_unknown = var_isFinalFalse$1855_unknown
}
var_prev$1853_changed = false
if ((var_$1872_changed)) {
if ((var_$1872_ts == currTs && var_$1872_lastInit) || (!(var_$1872_ts == currTs) && var_$1872_init)) {
var_prev$1853_changed = true
var_prev$1853_init = true
var_prev$1853_unknown = var_$1872_unknown
if ((var_prev$1853_unknown)) {
var_prev$1853_error = var_$1872_error
} else {
if ((var_$1872_ts == currTs)) {
var_prev$1853_value = var_$1872_lastValue
var_prev$1853_error = var_$1872_lastError
} else {
var_prev$1853_value = var_$1872_value
var_prev$1853_error = var_$1872_error
}
}
}
}
var_$1852_changed = false
if ((var_prev$1853_init)) {
if ((var_prev$1853_changed)) {
var_$1852_unknown = (var_prev$1853_unknown)
if ((var_$1852_unknown)) {
var_$1852_error = UnknownEventError(null)
} else {
var_$1852_error = null
try {
var_$1852_value = !((if((var_prev$1853_error == null)) {var_prev$1853_value} else {throw var_prev$1853_error}))
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
var_$1703_changed = false
if ((var_$1704_init && var_$1852_init)) {
if ((var_$1704_changed) || (var_$1852_changed)) {
var_$1703_unknown = (var_$1704_unknown && var_$1852_unknown)
if ((var_$1703_unknown)) {
var_$1703_error = UnknownEventError(null)
} else {
var_$1703_error = null
try {
var_$1703_value = ((if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}) && (if((var_$1852_error == null)) {var_$1852_value} else {throw var_$1852_error}))
} catch {
case var_err : Throwable => {
var_$1703_error = var_err
}
}
}
var_$1703_init = true
var_$1703_changed = true
}
}
var_$1875_changed = false
if ((var_result$1706_changed)) {
var_$1875_value = var_result$1706_ts
var_$1875_init = true
var_$1875_unknown = var_result$1706_unknown
if ((var_$1875_unknown)) {
var_$1875_error = var_result$1706_error
} else {
var_$1875_error = null
}
var_$1875_changed = true
}
var_$1870_changed = false
if ((var_$1872_changed)) {
if ((var_$1701_ts == currTs && var_$1701_lastInit) || (!(var_$1701_ts == currTs) && var_$1701_init)) {
var_$1870_changed = true
var_$1870_init = true
var_$1870_unknown = var_$1872_unknown
if ((var_$1870_unknown)) {
var_$1870_error = var_$1872_error
} else {
if ((var_$1701_ts == currTs)) {
var_$1870_value = var_$1701_lastValue
var_$1870_error = var_$1701_lastError
} else {
var_$1870_value = var_$1701_value
var_$1870_error = var_$1701_error
}
}
}
}
var_finalFalseSince$1702_changed = false
if ((var_$1703_init && var_$1875_init && var_$1870_init)) {
if ((var_$1703_changed) || (var_$1875_changed) || (var_$1870_changed)) {
var_finalFalseSince$1702_unknown = (var_$1703_unknown && var_$1875_unknown && var_$1870_unknown)
if ((var_finalFalseSince$1702_unknown)) {
var_finalFalseSince$1702_error = UnknownEventError(null)
} else {
var_finalFalseSince$1702_error = null
try {
var_finalFalseSince$1702_value = (if ((if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error})) (if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}) else (if((var_$1870_error == null)) {var_$1870_value} else {throw var_$1870_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1702_error = var_err
}
}
}
var_finalFalseSince$1702_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1701_changed = false
}
if ((var_finalFalseSince$1702_changed)) {
var_$1701_lastValue = var_$1701_value
var_$1701_lastInit = var_$1701_init
var_$1701_lastError = var_$1701_error
var_$1701_value = var_finalFalseSince$1702_value
var_$1701_init = true
var_$1701_ts = currTs
var_$1701_error = var_finalFalseSince$1702_error
var_$1701_changed = true
var_$1701_unknown = var_finalFalseSince$1702_unknown
}
if ((!(currTs == 0L))) {
var_$1873_changed = false
}
if ((var_$1834_changed)) {
var_$1873_value = var_$1834_value
var_$1873_init = true
var_$1873_error = var_$1834_error
var_$1873_changed = true
var_$1873_unknown = var_$1834_unknown
}
var_$1700_changed = false
if ((var_$1701_init && var_$1873_init)) {
if ((var_$1701_changed) || (var_$1873_changed)) {
var_$1700_unknown = (var_$1701_unknown && var_$1873_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) + (if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}))
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
if ((var_$1700_init && var_$1875_init)) {
if ((var_$1700_changed) || (var_$1875_changed)) {
var_$1699_unknown = (var_$1700_unknown && var_$1875_unknown)
if ((var_$1699_unknown)) {
var_$1699_error = UnknownEventError(null)
} else {
var_$1699_error = null
try {
var_$1699_value = ((if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}) < (if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}))
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
var_isFinalFalseReset$1698_changed = false
if ((var_$1699_init && var_$1876_init && var_$1872_init)) {
if ((var_$1699_changed) || (var_$1876_changed) || (var_$1872_changed)) {
var_isFinalFalseReset$1698_unknown = (var_$1699_unknown && var_$1876_unknown && var_$1872_unknown)
if ((var_isFinalFalseReset$1698_unknown)) {
var_isFinalFalseReset$1698_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1698_error = null
try {
var_isFinalFalseReset$1698_value = (if ((if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error})) (if((var_$1876_error == null)) {var_$1876_value} else {throw var_$1876_error}) else (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1698_error = var_err
}
}
}
var_isFinalFalseReset$1698_changed = true
}
}
var_$1697_changed = false
if ((var_isFinalFalseReset$1698_changed) || (var_$1872_changed)) {
var_$1697_lastValue = var_$1697_value
var_$1697_lastInit = var_$1697_init
var_$1697_lastError = var_$1697_error
var_$1697_init = true
var_$1697_ts = currTs
var_$1697_changed = true
var_$1697_unknown = (var_isFinalFalseReset$1698_unknown && var_$1872_unknown)
if ((var_isFinalFalseReset$1698_changed)) {
var_$1697_value = var_isFinalFalseReset$1698_value
var_$1697_error = var_isFinalFalseReset$1698_error
} else {
if ((var_$1872_changed)) {
var_$1697_value = var_$1872_value
var_$1697_error = var_$1872_error
}
}
}
var_stillFulfillableReset$1696_changed = false
if ((var_$1697_init && var_$1845_init && var_result$1706_init)) {
if ((var_$1697_changed) || (var_$1845_changed) || (var_result$1706_changed)) {
var_stillFulfillableReset$1696_unknown = (var_$1697_unknown && var_$1845_unknown && var_result$1706_unknown)
if ((var_stillFulfillableReset$1696_unknown)) {
var_stillFulfillableReset$1696_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1696_error = null
try {
var_stillFulfillableReset$1696_value = (if ((if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error})) (if((var_$1845_error == null)) {var_$1845_value} else {throw var_$1845_error}) else (if((var_result$1706_error == null)) {var_result$1706_value} else {throw var_result$1706_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1696_error = var_err
}
}
}
var_stillFulfillableReset$1696_init = true
var_stillFulfillableReset$1696_changed = true
}
}
var_value$1695_changed = false
if ((var_stillFulfillableReset$1696_init)) {
if ((var_stillFulfillableReset$1696_changed)) {
var_value$1695_unknown = (var_stillFulfillableReset$1696_unknown)
if ((var_value$1695_unknown)) {
var_value$1695_error = UnknownEventError(null)
} else {
var_value$1695_error = null
try {
var_value$1695_value = var_$1883.apply((if((var_stillFulfillableReset$1696_error == null)) {var_stillFulfillableReset$1696_value} else {throw var_stillFulfillableReset$1696_error}))
} catch {
case var_err : Throwable => {
var_value$1695_error = var_err
}
}
}
var_value$1695_init = true
var_value$1695_changed = true
}
}
var_$1935_changed = false
if ((var_stillFulfillableReset$1696_init)) {
if ((var_stillFulfillableReset$1696_changed)) {
var_$1935_lastValue = var_$1935_value
var_$1935_lastInit = var_$1935_init
var_$1935_lastError = var_$1935_error
var_$1935_unknown = (var_stillFulfillableReset$1696_unknown)
if ((var_$1935_unknown)) {
var_$1935_error = UnknownEventError(null)
} else {
var_$1935_error = null
try {
var_$1935_value = var_$1861.apply((if((var_stillFulfillableReset$1696_error == null)) {var_stillFulfillableReset$1696_value} else {throw var_stillFulfillableReset$1696_error}))
} catch {
case var_err : Throwable => {
var_$1935_error = var_err
}
}
}
var_$1935_init = true
var_$1935_ts = currTs
var_$1935_changed = true
}
}
var_$1916_changed = false
if ((var_$1926_changed)) {
var_$1916_value = 9223372036854775807L
var_$1916_init = var_$1926_init
if ((var_$1926_unknown)) {
var_$1916_error = UnknownEventError(var_$1926_error)
} else {
var_$1916_error = null
}
var_$1916_changed = var_$1926_changed
var_$1916_unknown = var_$1926_unknown
}
var_$2066_changed = false
if ((var_$1827_init && var_$1802_init)) {
if ((var_$1827_changed) || (var_$1802_changed)) {
var_$2066_unknown = (var_$1827_unknown && var_$1802_unknown)
if ((var_$2066_unknown)) {
var_$2066_error = UnknownEventError(null)
} else {
var_$2066_error = null
try {
var_$2066_value = ((if((var_$1827_error == null)) {var_$1827_value} else {throw var_$1827_error}) - (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
} catch {
case var_err : Throwable => {
var_$2066_error = var_err
}
}
}
var_$2066_init = true
var_$2066_changed = true
}
}
var_prev$1929_changed = false
if ((var_$1802_changed)) {
if ((var_$1802_ts == currTs && var_$1802_lastInit) || (!(var_$1802_ts == currTs) && var_$1802_init)) {
var_prev$1929_changed = true
var_prev$1929_init = true
var_prev$1929_unknown = var_$1802_unknown
if ((var_prev$1929_unknown)) {
var_prev$1929_error = var_$1802_error
} else {
if ((var_$1802_ts == currTs)) {
var_prev$1929_value = var_$1802_lastValue
var_prev$1929_error = var_$1802_lastError
} else {
var_prev$1929_value = var_$1802_value
var_prev$1929_error = var_$1802_error
}
}
}
}
var_$1927_changed = false
if ((var_$1802_init && var_prev$1929_init)) {
if ((var_$1802_changed) || (var_prev$1929_changed)) {
var_$1927_unknown = (var_$1802_unknown && var_prev$1929_unknown)
if ((var_$1927_unknown)) {
var_$1927_error = UnknownEventError(null)
} else {
var_$1927_error = null
try {
var_$1927_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) - (if((var_prev$1929_error == null)) {var_prev$1929_value} else {throw var_prev$1929_error}))
} catch {
case var_err : Throwable => {
var_$1927_error = var_err
}
}
}
var_$1927_init = true
var_$1927_changed = true
}
}
var_$1924_changed = false
if ((var_$1916_init && var_$1927_init)) {
if ((var_$1916_changed) || (var_$1927_changed)) {
var_$1924_unknown = (var_$1916_unknown && var_$1927_unknown)
if ((var_$1924_unknown)) {
var_$1924_error = UnknownEventError(null)
} else {
var_$1924_error = null
try {
var_$1924_value = ((if((var_$1916_error == null)) {var_$1916_value} else {throw var_$1916_error}) - (if((var_$1927_error == null)) {var_$1927_value} else {throw var_$1927_error}))
} catch {
case var_err : Throwable => {
var_$1924_error = var_err
}
}
}
var_$1924_init = true
var_$1924_changed = true
}
}
var_$2065_changed = false
if ((var_$2066_init && var_$2075_init)) {
if ((var_$2066_changed) || (var_$2075_changed)) {
var_$2065_unknown = (var_$2066_unknown && var_$2075_unknown)
if ((var_$2065_unknown)) {
var_$2065_error = UnknownEventError(null)
} else {
var_$2065_error = null
try {
var_$2065_value = ((if((var_$2066_error == null)) {var_$2066_value} else {throw var_$2066_error}) + (if((var_$2075_error == null)) {var_$2075_value} else {throw var_$2075_error}))
} catch {
case var_err : Throwable => {
var_$2065_error = var_err
}
}
}
var_$2065_init = true
var_$2065_ts = currTs
var_$2065_changed = true
}
}
var_$2082_changed = false
if ((var_$2065_changed)) {
var_$2082_value = var_$2065_ts
var_$2082_init = true
var_$2082_unknown = var_$2065_unknown
if ((var_$2082_unknown)) {
var_$2082_error = var_$2065_error
} else {
var_$2082_error = null
}
var_$2082_changed = true
}
var_$2079_changed = false
if ((var_$1873_init && var_$2082_init)) {
if ((var_$1873_changed) || (var_$2082_changed)) {
var_$2079_unknown = (var_$1873_unknown && var_$2082_unknown)
if ((var_$2079_unknown)) {
var_$2079_error = UnknownEventError(null)
} else {
var_$2079_error = null
try {
var_$2079_value = ((if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}) - (if((var_$2082_error == null)) {var_$2082_value} else {throw var_$2082_error}))
} catch {
case var_err : Throwable => {
var_$2079_error = var_err
}
}
}
var_$2079_init = true
var_$2079_changed = true
}
}
var_$2064_changed = false
if ((var_$2065_init && var_$1779_init)) {
if ((var_$2065_changed) || (var_$1779_changed)) {
var_$2064_unknown = (var_$2065_unknown && var_$1779_unknown)
if ((var_$2064_unknown)) {
var_$2064_error = UnknownEventError(null)
} else {
var_$2064_error = null
try {
var_$2064_value = ((if((var_$2065_error == null)) {var_$2065_value} else {throw var_$2065_error}) > (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
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
var_$2016_changed = false
if ((var_$2064_init && var_$2065_init && var_$2079_init)) {
if ((var_$2064_changed) || (var_$2065_changed) || (var_$2079_changed)) {
var_$2016_unknown = (var_$2064_unknown && var_$2065_unknown && var_$2079_unknown)
if ((var_$2016_unknown)) {
var_$2016_error = UnknownEventError(null)
} else {
var_$2016_error = null
try {
var_$2016_value = (if ((if((var_$2064_error == null)) {var_$2064_value} else {throw var_$2064_error})) (if((var_$2065_error == null)) {var_$2065_value} else {throw var_$2065_error}) else (if((var_$2079_error == null)) {var_$2079_value} else {throw var_$2079_error}))
} catch {
case var_err : Throwable => {
var_$2016_error = var_err
}
}
}
var_$2016_changed = true
}
}
var_$1914_changed = false
if ((var_$1924_init && var_$1779_init)) {
if ((var_$1924_changed) || (var_$1779_changed)) {
var_$1914_unknown = (var_$1924_unknown && var_$1779_unknown)
if ((var_$1914_unknown)) {
var_$1914_error = UnknownEventError(null)
} else {
var_$1914_error = null
try {
var_$1914_value = ((if((var_$1924_error == null)) {var_$1924_value} else {throw var_$1924_error}) > (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
} catch {
case var_err : Throwable => {
var_$1914_error = var_err
}
}
}
var_$1914_init = true
var_$1914_changed = true
}
}
var_resets$1786_changed = false
if ((var_$1914_init && var_$1924_init && var_$2075_init)) {
if ((var_$1914_changed) || (var_$1924_changed) || (var_$2075_changed)) {
var_resets$1786_unknown = (var_$1914_unknown && var_$1924_unknown && var_$2075_unknown)
if ((var_resets$1786_unknown)) {
var_resets$1786_error = UnknownEventError(null)
} else {
var_resets$1786_error = null
try {
var_resets$1786_value = (if ((if((var_$1914_error == null)) {var_$1914_value} else {throw var_$1914_error})) (if((var_$1924_error == null)) {var_$1924_value} else {throw var_$1924_error}) else (if((var_$2075_error == null)) {var_$2075_value} else {throw var_$2075_error}))
} catch {
case var_err : Throwable => {
var_resets$1786_error = var_err
}
}
}
var_resets$1786_changed = true
}
}

if ((var_$1926_unknown) || (!(var_resets$1786_error == null)) || (var_resets$1786_changed && (0L >= var_resets$1786_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_resets$1786_changed)) {
if ((var_$1785_changed) || (var_$1926_changed)) {
var_$1785_nextTs = (currTs + var_resets$1786_value)
}
} else {
if ((var_$1926_changed)) {
var_$1785_nextTs = -1L
}
}
}
if ((var_eventResponse3$1713_unknown) || (!(var_$2016_error == null)) || (var_$2016_changed && (0L >= var_$2016_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$2016_changed)) {
if ((var_safeDelay$1841_changed) || (var_eventResponse3$1713_changed)) {
var_safeDelay$1841_nextTs = (currTs + var_$2016_value)
}
} else {
if ((var_eventResponse3$1713_changed)) {
var_safeDelay$1841_nextTs = -1L
}
}
}
if ((var_value$1695_changed && var_value$1695_init)) {
out_value.apply(var_value$1695_value, currTs, "value", var_value$1695_error)
}
if ((var_$1935_changed && var_$1935_init)) {
out_final.apply(var_$1935_value, currTs, "final", var_$1935_error)
}
var_response1_changed = false
var_response3_changed = false
var_stimulus_changed = false
var_response2_changed = false

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
