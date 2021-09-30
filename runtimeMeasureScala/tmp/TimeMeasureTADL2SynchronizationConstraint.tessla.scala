//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1801 : scala.Function1[List[Any], Any] = ((var_list$1854 : List[Any]) => {
val var_$1855 : Any = var_list$1854(0L.asInstanceOf[Int])
var_$1855
})
var var_timeOldestUnfulfilledEvent$1726 : scala.Function1[List[(Long, Boolean, Long)], Long] = null
var var_removeEvents$1725 : scala.Function3[List[(Long, Boolean, Long)], Long, Long, List[(Long, Boolean, Long)]] = null
val var_buildSynchronizationEventInfo$1799 : scala.Function3[Long, Long, Boolean, (Long, Boolean, Long)] = ((var_streamInd$1850 : Long, var_evtTime$1851 : Long, var_flflld$1852 : Boolean) => {
val var_$1853 : (Long, Boolean, Long) = (var_evtTime$1851, var_flflld$1852, var_streamInd$1850)
var_$1853
})
var var_setEventsToFulfilled$1811 : scala.Function4[List[(Long, Boolean, Long)], Long, Long, Long, List[(Long, Boolean, Long)]] = null
val var_clusterFulfilled$1809 : scala.Function4[List[(Long, Boolean, Long)], Long, Long, Long, Boolean] = ((var_events$1856 : List[(Long, Boolean, Long)], var_timeNow$1857 : Long, var_tolerance$1858 : Long, var_streamCount$1859 : Long) => {
var var_fillSet$1863 : scala.Function1[Long, Set[Long]] = null
var var_checkCluster$1861 : scala.Function4[List[(Long, Boolean, Long)], Long, Long, Set[Long], Boolean] = null
var var_$1860 : Boolean = false
var_fillSet$1863 = ((var_count$1890 : Long) => {
var var_$1891 : Set[Long] = Set[Long]()
var_$1891 = (if ((var_count$1890 == 0L)) Set[Long]() else (var_fillSet$1863.apply((var_count$1890 - 1L)) + (var_count$1890)))
var_$1891
})
var_checkCluster$1861 = ((var_events$1864 : List[(Long, Boolean, Long)], var_timeNow$1865 : Long, var_tolerance$1866 : Long, var_reaminingIndices$1867 : Set[Long]) => {
lazy val var_$1889 : List[(Long, Boolean, Long)] = var_events$1864.tail
lazy val var_$1884 : (Long, Boolean, Long) = (var_head$1801.apply((var_events$1864).asInstanceOf[List[Any]])).asInstanceOf[(Long, Boolean, Long)]
lazy val var_$1887 : Long = var_$1884._3
var var_$1868 : Boolean = false
var_$1868 = (if ((var_reaminingIndices$1867.size == 0L)) true else (if ((var_events$1864.size == 0L)) false else (if ((((var_$1884._1 + var_tolerance$1866) >= var_timeNow$1865) && var_reaminingIndices$1867(var_$1887))) var_checkCluster$1861.apply(var_$1889, var_timeNow$1865, var_tolerance$1866, (var_reaminingIndices$1867 - var_$1887)) else var_checkCluster$1861.apply(var_$1889, var_timeNow$1865, var_tolerance$1866, var_reaminingIndices$1867))))
var_$1868
})
var_$1860 = var_checkCluster$1861.apply(var_events$1856, var_timeNow$1857, var_tolerance$1858, var_fillSet$1863.apply(var_streamCount$1859))
var_$1860
})
val var_updateFullfilledEvents$1721 : scala.Function4[List[(Long, Boolean, Long)], Long, Long, Long, List[(Long, Boolean, Long)]] = ((var_events$1803 : List[(Long, Boolean, Long)], var_timeNow$1804 : Long, var_tolerance$1805 : Long, var_streamCount$1806 : Long) => {
var var_$1807 : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var_$1807 = (if (var_clusterFulfilled$1809.apply(var_events$1803, var_timeNow$1804, var_tolerance$1805, var_streamCount$1806)) var_setEventsToFulfilled$1811.apply(var_events$1803, var_timeNow$1804, var_tolerance$1805, var_streamCount$1806) else var_events$1803)
var_$1807
})
var var_addEvents$1715 : scala.Function3[List[(Long, Boolean, Long)], List[Long], Long, List[(Long, Boolean, Long)]] = null
val var_$1770 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1844 : (Boolean, Boolean)) => {
val var_$1845 : Boolean = var_$1844._2
var_$1845
})
val var_$1765 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1842 : (Boolean, Boolean)) => {
val var_$1843 : Boolean = var_$1842._1
var_$1843
})
val var_$1709 : List[Long] = (1L +: List[Long]())
val var_$1712 : List[Long] = List[Long]()
val var_$1713 : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
val var_$1731 : (Boolean, Boolean) = (false, true)
val var_$1748 : (Boolean, Boolean) = (false, false)
val var_$1786 : (Boolean, Boolean) = (true, false)
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

var_timeOldestUnfulfilledEvent$1726 = ((var_storedEvents$1825 : List[(Long, Boolean, Long)]) => {
lazy val var_$1832 : (Long, Boolean, Long) = (var_head$1801.apply((var_storedEvents$1825).asInstanceOf[List[Any]])).asInstanceOf[(Long, Boolean, Long)]
var var_$1826 : Long = 0L
var_$1826 = (if ((var_storedEvents$1825.size == 0L)) 9223372036854775807L else (if (!(var_$1832._2)) var_$1832._1 else var_timeOldestUnfulfilledEvent$1726.apply(var_storedEvents$1825.tail)))
var_$1826
})
var_removeEvents$1725 = ((var_events$1812 : List[(Long, Boolean, Long)], var_timeNow$1813 : Long, var_tolerance$1814 : Long) => {
var var_$1815 : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var_$1815 = (if ((var_events$1812.size == 0L)) var_events$1812 else (if (((var_timeNow$1813 - (var_head$1801.apply((var_events$1812).asInstanceOf[List[Any]])).asInstanceOf[(Long, Boolean, Long)]._1) > var_tolerance$1814)) var_removeEvents$1725.apply(var_events$1812.tail, var_timeNow$1813, var_tolerance$1814) else var_events$1812))
var_$1815
})
var_setEventsToFulfilled$1811 = ((var_events$1897 : List[(Long, Boolean, Long)], var_timeNow$1898 : Long, var_tolerance$1899 : Long, var_streamCount$1900 : Long) => {
lazy val var_$1911 : (Long, Boolean, Long) = (var_head$1801.apply((var_events$1897).asInstanceOf[List[Any]])).asInstanceOf[(Long, Boolean, Long)]
lazy val var_$1916 : Long = var_$1911._1
var var_$1901 : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var_$1901 = (if ((var_events$1897.size == 0L)) var_events$1897 else ((if (((var_$1916 + var_tolerance$1899) >= var_timeNow$1898)) var_buildSynchronizationEventInfo$1799.apply(var_$1911._3, var_$1916, true) else var_$1911) +: var_setEventsToFulfilled$1811.apply(var_events$1897.tail, var_timeNow$1898, var_tolerance$1899, var_streamCount$1900)))
var_$1901
})
var_addEvents$1715 = ((var_existingEvents$1790 : List[(Long, Boolean, Long)], var_newEventStreamIndices$1791 : List[Long], var_timeNow$1792 : Long) => {
var var_$1793 : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var_$1793 = (if ((var_newEventStreamIndices$1791.size == 0L)) var_existingEvents$1790 else var_addEvents$1715.apply((var_existingEvents$1790 :+ var_buildSynchronizationEventInfo$1799.apply((var_head$1801.apply((var_newEventStreamIndices$1791).asInstanceOf[List[Any]])).asInstanceOf[Long], var_timeNow$1792, false)), var_newEventStreamIndices$1791.tail, var_timeNow$1792))
var_$1793
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
val var_$1711_value : List[Long] = List[Long]()
val var_$1711_error : Throwable = null
val var_$1711_changed : Boolean = false
val var_$1711_unknown : Boolean = false
var var_$1707_changed : Boolean = true
var var_$1707_value : List[Long] = var_$1709
var var_$1707_init : Boolean = true
var var_$1707_error : Throwable = null
var var_$1707_unknown : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_value : Long = 0L
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_defaultTime$1686_changed : Boolean = true
var var_defaultTime$1686_value : Long = -1L
var var_defaultTime$1686_init : Boolean = true
var var_defaultTime$1686_error : Throwable = null
var var_defaultTime$1686_unknown : Boolean = false
var var_$1699_changed : Boolean = false
var var_$1699_value : Long = 0L
var var_$1699_unknown : Boolean = false
var var_$1699_error : Throwable = null
var var_$1692_changed : Boolean = false
var var_$1692_value : Long = 0L
var var_$1692_unknown : Boolean = false
var var_$1692_error : Throwable = null
var var_$1690_changed : Boolean = false
var var_$1690_unknown : Boolean = false
var var_$1690_value : Long = 0L
var var_$1690_error : Throwable = null
var var_timeNow$1688_changed : Boolean = false
var var_timeNow$1688_init : Boolean = false
var var_timeNow$1688_unknown : Boolean = false
var var_timeNow$1688_value : Long = 0L
var var_timeNow$1688_error : Throwable = null
var var_$1685_changed : Boolean = false
var var_$1685_unknown : Boolean = false
var var_$1685_error : Throwable = null
var var_$1685_value : Boolean = false
var var_$1685_init : Boolean = false
val var_$1728_value : Long = 0L
val var_$1728_error : Throwable = null
val var_$1728_changed : Boolean = false
val var_$1728_unknown : Boolean = false
var var_storedEventsBeforeRemove$1719_changed : Boolean = true
var var_storedEventsBeforeRemove$1719_value : Long = 3L
var var_storedEventsBeforeRemove$1719_init : Boolean = true
var var_storedEventsBeforeRemove$1719_error : Throwable = null
var var_storedEventsBeforeRemove$1719_unknown : Boolean = false
var var_defaultTime$1698_changed : Boolean = true
var var_defaultTime$1698_value : Long = -1L
var var_defaultTime$1698_init : Boolean = true
var var_defaultTime$1698_error : Throwable = null
var var_defaultTime$1698_unknown : Boolean = false
var var_$1697_changed : Boolean = false
var var_$1697_unknown : Boolean = false
var var_$1697_error : Throwable = null
var var_$1697_value : Boolean = false
var var_$1697_init : Boolean = false
var var_$1701_changed : Boolean = true
var var_$1701_value : Long = 2L
var var_$1701_init : Boolean = true
var var_$1701_error : Throwable = null
var var_$1701_unknown : Boolean = false
var var_defaultTime$1705_changed : Boolean = true
var var_defaultTime$1705_value : Long = -1L
var var_defaultTime$1705_init : Boolean = true
var var_defaultTime$1705_error : Throwable = null
var var_defaultTime$1705_unknown : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : Boolean = false
var var_$1704_init : Boolean = false
var var_$1710_changed : Boolean = true
var var_$1710_value : List[Long] = var_$1712
var var_$1710_init : Boolean = true
var var_$1710_error : Throwable = null
var var_$1710_unknown : Boolean = false
var var_eventList0$1703_changed : Boolean = false
var var_eventList0$1703_unknown : Boolean = false
var var_eventList0$1703_error : Throwable = null
var var_eventList0$1703_value : List[Long] = List[Long]()
var var_eventList0$1703_init : Boolean = false
var var_$1700_changed : Boolean = false
var var_$1700_unknown : Boolean = false
var var_$1700_error : Throwable = null
var var_$1700_value : List[Long] = List[Long]()
var var_$1700_init : Boolean = false
var var_eventList1$1696_changed : Boolean = false
var var_eventList1$1696_unknown : Boolean = false
var var_eventList1$1696_error : Throwable = null
var var_eventList1$1696_value : List[Long] = List[Long]()
var var_eventList1$1696_init : Boolean = false
var var_$1693_changed : Boolean = false
var var_$1693_unknown : Boolean = false
var var_$1693_error : Throwable = null
var var_$1693_value : List[Long] = List[Long]()
var var_$1693_init : Boolean = false
var var_eventList2$1684_changed : Boolean = false
var var_eventList2$1684_unknown : Boolean = false
var var_eventList2$1684_error : Throwable = null
var var_eventList2$1684_value : List[Long] = List[Long]()
var var_eventList2$1684_init : Boolean = false
var var_eventList2$1684_ts : Long = 0L
var var_$1682_changed : Boolean = false
var var_$1682_unknown : Boolean = false
var var_$1682_error : Throwable = null
var var_$1682_value : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var var_$1681_changed : Boolean = true
var var_$1681_value : List[(Long, Boolean, Long)] = var_$1713
var var_$1681_init : Boolean = true
var var_$1681_error : Throwable = null
var var_$1681_unknown : Boolean = false
var var_storedEventsBeforeRemove$1716_changed : Boolean = false
var var_storedEventsBeforeRemove$1716_value : Long = 0L
var var_storedEventsBeforeRemove$1716_init : Boolean = false
var var_storedEventsBeforeRemove$1716_unknown : Boolean = false
var var_storedEventsBeforeRemove$1716_error : Throwable = null
var var_storedEventsBeforeRemove$1680_changed : Boolean = false
var var_storedEventsBeforeRemove$1680_unknown : Boolean = false
var var_storedEventsBeforeRemove$1680_error : Throwable = null
var var_storedEventsBeforeRemove$1680_value : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var var_storedEventsBeforeRemove$1680_init : Boolean = false
var var_storedEventsBeforeRemove$1717_changed : Boolean = true
var var_storedEventsBeforeRemove$1717_value : Long = 5L
var var_storedEventsBeforeRemove$1717_init : Boolean = true
var var_storedEventsBeforeRemove$1717_error : Throwable = null
var var_storedEventsBeforeRemove$1717_unknown : Boolean = false
var var_$1735_changed : Boolean = false
var var_$1735_unknown : Boolean = false
var var_$1735_error : Throwable = null
var var_$1735_value : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var var_$1735_init : Boolean = false
var var_$1683_changed : Boolean = false
var var_$1683_lastValue : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var var_$1683_lastInit : Boolean = false
var var_$1683_lastError : Throwable = null
var var_$1683_unknown : Boolean = false
var var_$1683_error : Throwable = null
var var_$1683_value : List[(Long, Boolean, Long)] = List[(Long, Boolean, Long)]()
var var_$1683_init : Boolean = false
var var_$1683_ts : Long = 0L
var var_$1922_changed : Boolean = false
var var_$1922_unknown : Boolean = false
var var_$1922_error : Throwable = null
var var_$1922_value : Long = 0L
var var_$1922_init : Boolean = false
var var_$1777_changed : Boolean = true
var var_$1777_value : Long = 9223372036854775807L
var var_$1777_init : Boolean = true
var var_$1777_error : Throwable = null
var var_$1777_unknown : Boolean = false
var var_$1676_changed : Boolean = false
var var_$1676_unknown : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_value : Boolean = false
var var_$1676_init : Boolean = false
val var_$1730_value : (Boolean, Boolean) = (false, false)
val var_$1730_error : Throwable = null
val var_$1730_changed : Boolean = false
val var_$1730_unknown : Boolean = false
var var_$1729_changed : Boolean = true
var var_$1729_value : (Boolean, Boolean) = var_$1731
var var_$1729_init : Boolean = true
var var_$1729_error : Throwable = null
var var_$1729_unknown : Boolean = false
var var_$1734_changed : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1734_value : Long = 0L
var var_$1734_init : Boolean = false
var var_$1739_changed : Boolean = false
var var_$1739_error : Throwable = null
var var_$1739_unknown : Boolean = false
var var_safeDelay$1743_changed : Boolean = false
val var_safeDelay$1743_error : Throwable = null
var var_safeDelay$1743_unknown : Boolean = false
var var_$1741_changed : Boolean = false
var var_$1741_error : Throwable = null
var var_$1741_unknown : Boolean = false
var var_mergeUnit2$1738_changed : Boolean = false
var var_mergeUnit2$1738_ts : Long = 0L
var var_mergeUnit2$1738_unknown : Boolean = false
var var_mergeUnit2$1738_error : Throwable = null
var var_$1737_changed : Boolean = false
var var_$1737_value : Long = 0L
var var_$1737_init : Boolean = false
var var_$1737_unknown : Boolean = false
var var_$1737_error : Throwable = null
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Long = 0L
var var_$1736_init : Boolean = false
var var_$1733_changed : Boolean = false
var var_$1733_unknown : Boolean = false
var var_$1733_error : Throwable = null
var var_$1733_value : Boolean = false
var var_$1733_init : Boolean = false
var var_$1746_changed : Boolean = true
var var_$1746_value : (Boolean, Boolean) = var_$1748
var var_$1746_init : Boolean = true
var var_$1746_error : Throwable = null
var var_$1746_unknown : Boolean = false
var var_$1749_changed : Boolean = true
var var_$1749_value : (Boolean, Boolean) = var_$1786
var var_$1749_init : Boolean = true
var var_$1749_error : Throwable = null
var var_$1749_unknown : Boolean = false
var var_$1732_changed : Boolean = false
var var_$1732_unknown : Boolean = false
var var_$1732_error : Throwable = null
var var_$1732_value : (Boolean, Boolean) = (false, false)
var var_$1732_init : Boolean = false
var var_result$1675_changed : Boolean = false
var var_result$1675_unknown : Boolean = false
var var_result$1675_error : Throwable = null
var var_result$1675_value : (Boolean, Boolean) = (false, false)
var var_result$1675_init : Boolean = false
var var_result$1675_ts : Long = 0L
var var_$1764_changed : Boolean = false
var var_$1764_unknown : Boolean = false
var var_$1764_error : Throwable = null
var var_$1764_value : Boolean = false
var var_$1764_init : Boolean = false
var var_$1754_changed : Boolean = false
var var_$1754_unknown : Boolean = false
var var_$1754_error : Throwable = null
var var_$1754_value : Boolean = false
var var_$1754_init : Boolean = false
var var_$1753_changed : Boolean = false
var var_$1753_unknown : Boolean = false
var var_$1753_error : Throwable = null
var var_$1753_value : Boolean = false
var var_$1753_init : Boolean = false
var var_$1673_changed : Boolean = false
var var_$1673_unknown : Boolean = false
var var_$1673_error : Throwable = null
var var_$1673_value : Boolean = false
var var_$1673_init : Boolean = false
var var_$1760_changed : Boolean = false
var var_$1760_init : Boolean = false
var var_$1760_unknown : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_value : Boolean = false
val var_$1767_value : Boolean = false
val var_$1767_error : Throwable = null
val var_$1767_changed : Boolean = false
val var_$1767_unknown : Boolean = false
var var_$1766_changed : Boolean = true
var var_$1766_value : Boolean = true
var var_$1766_init : Boolean = true
var var_$1766_error : Throwable = null
var var_$1766_unknown : Boolean = false
var var_$1763_changed : Boolean = false
var var_$1763_unknown : Boolean = false
var var_$1763_error : Throwable = null
var var_$1763_value : Boolean = false
var var_$1763_init : Boolean = false
var var_$1771_changed : Boolean = true
var var_$1771_value : Boolean = false
var var_$1771_init : Boolean = true
var var_$1771_error : Throwable = null
var var_$1771_unknown : Boolean = false
var var_$1768_changed : Boolean = false
var var_$1768_unknown : Boolean = false
var var_$1768_error : Throwable = null
var var_$1768_value : Boolean = false
var var_$1768_init : Boolean = false
var var_$1762_changed : Boolean = false
var var_$1762_unknown : Boolean = false
var var_$1762_error : Throwable = null
var var_$1762_value : Boolean = false
var var_$1762_init : Boolean = false
var var_isFinalFalse$1759_changed : Boolean = false
var var_isFinalFalse$1759_unknown : Boolean = false
var var_isFinalFalse$1759_error : Throwable = null
var var_isFinalFalse$1759_value : Boolean = false
var var_$1776_changed : Boolean = true
var var_$1776_lastValue : Boolean = false
var var_$1776_lastInit : Boolean = false
var var_$1776_lastError : Throwable = null
var var_$1776_value : Boolean = false
var var_$1776_init : Boolean = true
var var_$1776_ts : Long = 0L
var var_$1776_error : Throwable = null
var var_$1776_unknown : Boolean = false
var var_prev$1757_changed : Boolean = false
var var_prev$1757_init : Boolean = false
var var_prev$1757_unknown : Boolean = false
var var_prev$1757_error : Throwable = null
var var_prev$1757_value : Boolean = false
var var_$1756_changed : Boolean = false
var var_$1756_unknown : Boolean = false
var var_$1756_error : Throwable = null
var var_$1756_value : Boolean = false
var var_$1756_init : Boolean = false
var var_$1672_changed : Boolean = false
var var_$1672_unknown : Boolean = false
var var_$1672_error : Throwable = null
var var_$1672_value : Boolean = false
var var_$1672_init : Boolean = false
var var_$1773_changed : Boolean = false
var var_$1773_value : Long = 0L
var var_$1773_init : Boolean = false
var var_$1773_unknown : Boolean = false
var var_$1773_error : Throwable = null
var var_$1774_changed : Boolean = false
var var_$1774_init : Boolean = false
var var_$1774_unknown : Boolean = false
var var_$1774_error : Throwable = null
var var_$1774_value : Long = 0L
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
var var_$1669_changed : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_$1668_changed : Boolean = false
var var_$1668_unknown : Boolean = false
var var_$1668_error : Throwable = null
var var_$1668_value : Boolean = false
var var_$1668_init : Boolean = false
var var_isFinalFalseReset$1667_changed : Boolean = false
var var_isFinalFalseReset$1667_unknown : Boolean = false
var var_isFinalFalseReset$1667_error : Throwable = null
var var_isFinalFalseReset$1667_value : Boolean = false
var var_$1761_changed : Boolean = false
var var_$1761_lastValue : Boolean = false
var var_$1761_lastInit : Boolean = false
var var_$1761_lastError : Throwable = null
var var_$1761_init : Boolean = false
var var_$1761_ts : Long = 0L
var var_$1761_unknown : Boolean = false
var var_$1761_value : Boolean = false
var var_$1761_error : Throwable = null
var var_$1929_changed : Boolean = true
var var_$1929_value : Long = 0L
var var_$1929_init : Boolean = true
var var_$1929_error : Throwable = null
var var_$1929_unknown : Boolean = false
var var_$1921_changed : Boolean = false
var var_$1921_unknown : Boolean = false
var var_$1921_error : Throwable = null
var var_$1921_value : Long = 0L
var var_$1921_init : Boolean = false
var var_$1920_changed : Boolean = false
var var_$1920_unknown : Boolean = false
var var_$1920_error : Throwable = null
var var_$1920_value : Long = 0L
var var_$1920_init : Boolean = false
var var_$1927_changed : Boolean = true
var var_$1927_value : Long = 1L
var var_$1927_init : Boolean = true
var var_$1927_error : Throwable = null
var var_$1927_unknown : Boolean = false
var var_$1919_changed : Boolean = false
var var_$1919_unknown : Boolean = false
var var_$1919_error : Throwable = null
var var_$1919_value : Long = 0L
var var_$1919_init : Boolean = false
var var_$1919_ts : Long = 0L
var var_$1918_changed : Boolean = false
var var_$1918_unknown : Boolean = false
var var_$1918_error : Throwable = null
var var_$1918_value : Boolean = false
var var_$1918_init : Boolean = false
var var_$1934_changed : Boolean = false
var var_$1934_value : Long = 0L
var var_$1934_init : Boolean = false
var var_$1934_unknown : Boolean = false
var var_$1934_error : Throwable = null
var var_$1931_changed : Boolean = false
var var_$1931_unknown : Boolean = false
var var_$1931_error : Throwable = null
var var_$1931_value : Long = 0L
var var_$1931_init : Boolean = false
var var_$1837_changed : Boolean = false
var var_$1837_unknown : Boolean = false
var var_$1837_error : Throwable = null
var var_$1837_value : Long = 0L
var var_stillFulfillableReset$1665_changed : Boolean = false
var var_stillFulfillableReset$1665_unknown : Boolean = false
var var_stillFulfillableReset$1665_error : Throwable = null
var var_stillFulfillableReset$1665_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1665_init : Boolean = false
var var_value$1788_changed : Boolean = false
var var_value$1788_unknown : Boolean = false
var var_value$1788_error : Throwable = null
var var_value$1788_value : Boolean = false
var var_value$1788_init : Boolean = false
var var_final$1664_changed : Boolean = false
var var_final$1664_unknown : Boolean = false
var var_final$1664_error : Throwable = null
var var_final$1664_value : Boolean = false
var var_final$1664_init : Boolean = false
var var_safeDelay$1743_nextTs : Long = -1L



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

if (((var_safeDelay$1743_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1743_nextTs))) {
currTs = var_safeDelay$1743_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

if ((!(currTs == 0L))) {
var_$1707_changed = false
}
if ((var_$1711_changed)) {
var_$1707_value = var_$1711_value
var_$1707_init = true
var_$1707_error = var_$1711_error
var_$1707_changed = true
var_$1707_unknown = var_$1711_unknown
}
var_$1689_changed = false
if ((var_event2_changed)) {
var_$1689_value = var_event2_ts
var_$1689_unknown = var_event2_unknown
if ((var_$1689_unknown)) {
var_$1689_error = var_event2_error
} else {
var_$1689_error = null
}
var_$1689_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1686_changed = false
}
if ((var_$1689_changed)) {
var_defaultTime$1686_value = var_$1689_value
var_defaultTime$1686_init = true
var_defaultTime$1686_error = var_$1689_error
var_defaultTime$1686_changed = true
var_defaultTime$1686_unknown = var_$1689_unknown
}
var_$1699_changed = false
if ((var_event1_changed)) {
var_$1699_value = var_event1_ts
var_$1699_unknown = var_event1_unknown
if ((var_$1699_unknown)) {
var_$1699_error = var_event1_error
} else {
var_$1699_error = null
}
var_$1699_changed = true
}
var_$1692_changed = false
if ((var_event0_changed)) {
var_$1692_value = var_event0_ts
var_$1692_unknown = var_event0_unknown
if ((var_$1692_unknown)) {
var_$1692_error = var_event0_error
} else {
var_$1692_error = null
}
var_$1692_changed = true
}
var_$1690_changed = false
if ((var_$1699_changed) || (var_$1692_changed)) {
var_$1690_changed = true
var_$1690_unknown = (var_$1699_unknown && var_$1692_unknown)
if ((var_$1699_changed)) {
var_$1690_value = var_$1699_value
var_$1690_error = var_$1699_error
} else {
if ((var_$1692_changed)) {
var_$1690_value = var_$1692_value
var_$1690_error = var_$1692_error
}
}
}
var_timeNow$1688_changed = false
if ((var_$1689_changed) || (var_$1690_changed)) {
var_timeNow$1688_init = true
var_timeNow$1688_changed = true
var_timeNow$1688_unknown = (var_$1689_unknown && var_$1690_unknown)
if ((var_$1689_changed)) {
var_timeNow$1688_value = var_$1689_value
var_timeNow$1688_error = var_$1689_error
} else {
if ((var_$1690_changed)) {
var_timeNow$1688_value = var_$1690_value
var_timeNow$1688_error = var_$1690_error
}
}
}
var_$1685_changed = false
if ((var_defaultTime$1686_init && var_timeNow$1688_init)) {
if ((var_defaultTime$1686_changed) || (var_timeNow$1688_changed)) {
var_$1685_unknown = (var_defaultTime$1686_unknown && var_timeNow$1688_unknown)
if ((var_$1685_unknown)) {
var_$1685_error = UnknownEventError(null)
} else {
var_$1685_error = null
try {
var_$1685_value = ((if((var_defaultTime$1686_error == null)) {var_defaultTime$1686_value} else {throw var_defaultTime$1686_error}) >= (if((var_timeNow$1688_error == null)) {var_timeNow$1688_value} else {throw var_timeNow$1688_error}))
} catch {
case var_err : Throwable => {
var_$1685_error = var_err
}
}
}
var_$1685_init = true
var_$1685_changed = true
}
}
if ((!(currTs == 0L))) {
var_storedEventsBeforeRemove$1719_changed = false
}
if ((var_$1728_changed)) {
var_storedEventsBeforeRemove$1719_value = var_$1728_value
var_storedEventsBeforeRemove$1719_init = true
var_storedEventsBeforeRemove$1719_error = var_$1728_error
var_storedEventsBeforeRemove$1719_changed = true
var_storedEventsBeforeRemove$1719_unknown = var_$1728_unknown
}
if ((!(currTs == 0L))) {
var_defaultTime$1698_changed = false
}
if ((var_$1699_changed)) {
var_defaultTime$1698_value = var_$1699_value
var_defaultTime$1698_init = true
var_defaultTime$1698_error = var_$1699_error
var_defaultTime$1698_changed = true
var_defaultTime$1698_unknown = var_$1699_unknown
}
var_$1697_changed = false
if ((var_defaultTime$1698_init && var_timeNow$1688_init)) {
if ((var_defaultTime$1698_changed) || (var_timeNow$1688_changed)) {
var_$1697_unknown = (var_defaultTime$1698_unknown && var_timeNow$1688_unknown)
if ((var_$1697_unknown)) {
var_$1697_error = UnknownEventError(null)
} else {
var_$1697_error = null
try {
var_$1697_value = ((if((var_defaultTime$1698_error == null)) {var_defaultTime$1698_value} else {throw var_defaultTime$1698_error}) >= (if((var_timeNow$1688_error == null)) {var_timeNow$1688_value} else {throw var_timeNow$1688_error}))
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
if ((!(currTs == 0L))) {
var_$1701_changed = false
}
if ((var_$1728_changed)) {
var_$1701_value = var_$1728_value
var_$1701_init = true
var_$1701_error = var_$1728_error
var_$1701_changed = true
var_$1701_unknown = var_$1728_unknown
}
if ((!(currTs == 0L))) {
var_defaultTime$1705_changed = false
}
if ((var_$1692_changed)) {
var_defaultTime$1705_value = var_$1692_value
var_defaultTime$1705_init = true
var_defaultTime$1705_error = var_$1692_error
var_defaultTime$1705_changed = true
var_defaultTime$1705_unknown = var_$1692_unknown
}
var_$1704_changed = false
if ((var_defaultTime$1705_init && var_timeNow$1688_init)) {
if ((var_defaultTime$1705_changed) || (var_timeNow$1688_changed)) {
var_$1704_unknown = (var_defaultTime$1705_unknown && var_timeNow$1688_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = ((if((var_defaultTime$1705_error == null)) {var_defaultTime$1705_value} else {throw var_defaultTime$1705_error}) >= (if((var_timeNow$1688_error == null)) {var_timeNow$1688_value} else {throw var_timeNow$1688_error}))
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
if ((!(currTs == 0L))) {
var_$1710_changed = false
}
if ((var_$1711_changed)) {
var_$1710_value = var_$1711_value
var_$1710_init = true
var_$1710_error = var_$1711_error
var_$1710_changed = true
var_$1710_unknown = var_$1711_unknown
}
var_eventList0$1703_changed = false
if ((var_$1704_init && var_$1707_init && var_$1710_init)) {
if ((var_$1704_changed) || (var_$1707_changed) || (var_$1710_changed)) {
var_eventList0$1703_unknown = (var_$1704_unknown && var_$1707_unknown && var_$1710_unknown)
if ((var_eventList0$1703_unknown)) {
var_eventList0$1703_error = UnknownEventError(null)
} else {
var_eventList0$1703_error = null
try {
var_eventList0$1703_value = (if ((if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}))
} catch {
case var_err : Throwable => {
var_eventList0$1703_error = var_err
}
}
}
var_eventList0$1703_init = true
var_eventList0$1703_changed = true
}
}
var_$1700_changed = false
if ((var_$1701_init && var_eventList0$1703_init)) {
if ((var_$1701_changed) || (var_eventList0$1703_changed)) {
var_$1700_unknown = (var_$1701_unknown && var_eventList0$1703_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) +: (if((var_eventList0$1703_error == null)) {var_eventList0$1703_value} else {throw var_eventList0$1703_error}))
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
var_eventList1$1696_changed = false
if ((var_$1697_init && var_$1700_init && var_eventList0$1703_init)) {
if ((var_$1697_changed) || (var_$1700_changed) || (var_eventList0$1703_changed)) {
var_eventList1$1696_unknown = (var_$1697_unknown && var_$1700_unknown && var_eventList0$1703_unknown)
if ((var_eventList1$1696_unknown)) {
var_eventList1$1696_error = UnknownEventError(null)
} else {
var_eventList1$1696_error = null
try {
var_eventList1$1696_value = (if ((if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error})) (if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}) else (if((var_eventList0$1703_error == null)) {var_eventList0$1703_value} else {throw var_eventList0$1703_error}))
} catch {
case var_err : Throwable => {
var_eventList1$1696_error = var_err
}
}
}
var_eventList1$1696_init = true
var_eventList1$1696_changed = true
}
}
var_$1693_changed = false
if ((var_storedEventsBeforeRemove$1719_init && var_eventList1$1696_init)) {
if ((var_storedEventsBeforeRemove$1719_changed) || (var_eventList1$1696_changed)) {
var_$1693_unknown = (var_storedEventsBeforeRemove$1719_unknown && var_eventList1$1696_unknown)
if ((var_$1693_unknown)) {
var_$1693_error = UnknownEventError(null)
} else {
var_$1693_error = null
try {
var_$1693_value = ((if((var_storedEventsBeforeRemove$1719_error == null)) {var_storedEventsBeforeRemove$1719_value} else {throw var_storedEventsBeforeRemove$1719_error}) +: (if((var_eventList1$1696_error == null)) {var_eventList1$1696_value} else {throw var_eventList1$1696_error}))
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
var_eventList2$1684_changed = false
if ((var_$1685_init && var_$1693_init && var_eventList1$1696_init)) {
if ((var_$1685_changed) || (var_$1693_changed) || (var_eventList1$1696_changed)) {
var_eventList2$1684_unknown = (var_$1685_unknown && var_$1693_unknown && var_eventList1$1696_unknown)
if ((var_eventList2$1684_unknown)) {
var_eventList2$1684_error = UnknownEventError(null)
} else {
var_eventList2$1684_error = null
try {
var_eventList2$1684_value = (if ((if((var_$1685_error == null)) {var_$1685_value} else {throw var_$1685_error})) (if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error}) else (if((var_eventList1$1696_error == null)) {var_eventList1$1696_value} else {throw var_eventList1$1696_error}))
} catch {
case var_err : Throwable => {
var_eventList2$1684_error = var_err
}
}
}
var_eventList2$1684_init = true
var_eventList2$1684_ts = currTs
var_eventList2$1684_changed = true
}
}
var_$1682_changed = false
if ((var_eventList2$1684_changed)) {
if ((var_$1683_ts == currTs && var_$1683_lastInit) || (!(var_$1683_ts == currTs) && var_$1683_init)) {
var_$1682_changed = true
var_$1682_unknown = var_eventList2$1684_unknown
if ((var_$1682_unknown)) {
var_$1682_error = var_eventList2$1684_error
} else {
if ((var_$1683_ts == currTs)) {
var_$1682_value = var_$1683_lastValue
var_$1682_error = var_$1683_lastError
} else {
var_$1682_value = var_$1683_value
var_$1682_error = var_$1683_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1681_changed = false
}
if ((var_$1682_changed)) {
var_$1681_value = var_$1682_value
var_$1681_init = true
var_$1681_error = var_$1682_error
var_$1681_changed = true
var_$1681_unknown = var_$1682_unknown
}
var_storedEventsBeforeRemove$1716_changed = false
if ((var_eventList2$1684_changed)) {
var_storedEventsBeforeRemove$1716_value = var_eventList2$1684_ts
var_storedEventsBeforeRemove$1716_init = true
var_storedEventsBeforeRemove$1716_unknown = var_eventList2$1684_unknown
if ((var_storedEventsBeforeRemove$1716_unknown)) {
var_storedEventsBeforeRemove$1716_error = var_eventList2$1684_error
} else {
var_storedEventsBeforeRemove$1716_error = null
}
var_storedEventsBeforeRemove$1716_changed = true
}
var_storedEventsBeforeRemove$1680_changed = false
if ((var_$1681_init && var_eventList2$1684_init && var_storedEventsBeforeRemove$1716_init)) {
if ((var_$1681_changed) || (var_eventList2$1684_changed) || (var_storedEventsBeforeRemove$1716_changed)) {
var_storedEventsBeforeRemove$1680_unknown = (var_$1681_unknown && var_eventList2$1684_unknown && var_storedEventsBeforeRemove$1716_unknown)
if ((var_storedEventsBeforeRemove$1680_unknown)) {
var_storedEventsBeforeRemove$1680_error = UnknownEventError(null)
} else {
var_storedEventsBeforeRemove$1680_error = null
try {
var_storedEventsBeforeRemove$1680_value = var_addEvents$1715.apply((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}), (if((var_eventList2$1684_error == null)) {var_eventList2$1684_value} else {throw var_eventList2$1684_error}), (if((var_storedEventsBeforeRemove$1716_error == null)) {var_storedEventsBeforeRemove$1716_value} else {throw var_storedEventsBeforeRemove$1716_error}))
} catch {
case var_err : Throwable => {
var_storedEventsBeforeRemove$1680_error = var_err
}
}
}
var_storedEventsBeforeRemove$1680_init = true
var_storedEventsBeforeRemove$1680_changed = true
}
}
if ((!(currTs == 0L))) {
var_storedEventsBeforeRemove$1717_changed = false
}
if ((var_$1728_changed)) {
var_storedEventsBeforeRemove$1717_value = var_$1728_value
var_storedEventsBeforeRemove$1717_init = true
var_storedEventsBeforeRemove$1717_error = var_$1728_error
var_storedEventsBeforeRemove$1717_changed = true
var_storedEventsBeforeRemove$1717_unknown = var_$1728_unknown
}
var_$1735_changed = false
if ((var_storedEventsBeforeRemove$1680_init && var_storedEventsBeforeRemove$1716_init && var_storedEventsBeforeRemove$1717_init && var_storedEventsBeforeRemove$1719_init)) {
if ((var_storedEventsBeforeRemove$1680_changed) || (var_storedEventsBeforeRemove$1716_changed) || (var_storedEventsBeforeRemove$1717_changed) || (var_storedEventsBeforeRemove$1719_changed)) {
var_$1735_unknown = (var_storedEventsBeforeRemove$1680_unknown && var_storedEventsBeforeRemove$1716_unknown && var_storedEventsBeforeRemove$1717_unknown && var_storedEventsBeforeRemove$1719_unknown)
if ((var_$1735_unknown)) {
var_$1735_error = UnknownEventError(null)
} else {
var_$1735_error = null
try {
var_$1735_value = var_updateFullfilledEvents$1721.apply((if((var_storedEventsBeforeRemove$1680_error == null)) {var_storedEventsBeforeRemove$1680_value} else {throw var_storedEventsBeforeRemove$1680_error}), (if((var_storedEventsBeforeRemove$1716_error == null)) {var_storedEventsBeforeRemove$1716_value} else {throw var_storedEventsBeforeRemove$1716_error}), (if((var_storedEventsBeforeRemove$1717_error == null)) {var_storedEventsBeforeRemove$1717_value} else {throw var_storedEventsBeforeRemove$1717_error}), (if((var_storedEventsBeforeRemove$1719_error == null)) {var_storedEventsBeforeRemove$1719_value} else {throw var_storedEventsBeforeRemove$1719_error}))
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
var_$1683_changed = false
if ((var_$1735_init && var_storedEventsBeforeRemove$1716_init && var_storedEventsBeforeRemove$1717_init)) {
if ((var_$1735_changed) || (var_storedEventsBeforeRemove$1716_changed) || (var_storedEventsBeforeRemove$1717_changed)) {
var_$1683_lastValue = var_$1683_value
var_$1683_lastInit = var_$1683_init
var_$1683_lastError = var_$1683_error
var_$1683_unknown = (var_$1735_unknown && var_storedEventsBeforeRemove$1716_unknown && var_storedEventsBeforeRemove$1717_unknown)
if ((var_$1683_unknown)) {
var_$1683_error = UnknownEventError(null)
} else {
var_$1683_error = null
try {
var_$1683_value = var_removeEvents$1725.apply((if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}), (if((var_storedEventsBeforeRemove$1716_error == null)) {var_storedEventsBeforeRemove$1716_value} else {throw var_storedEventsBeforeRemove$1716_error}), (if((var_storedEventsBeforeRemove$1717_error == null)) {var_storedEventsBeforeRemove$1717_value} else {throw var_storedEventsBeforeRemove$1717_error}))
} catch {
case var_err : Throwable => {
var_$1683_error = var_err
}
}
}
var_$1683_init = true
var_$1683_ts = currTs
var_$1683_changed = true
}
}
var_$1922_changed = false
if ((var_$1683_init)) {
if ((var_$1683_changed)) {
var_$1922_unknown = (var_$1683_unknown)
if ((var_$1922_unknown)) {
var_$1922_error = UnknownEventError(null)
} else {
var_$1922_error = null
try {
var_$1922_value = var_timeOldestUnfulfilledEvent$1726.apply((if((var_$1683_error == null)) {var_$1683_value} else {throw var_$1683_error}))
} catch {
case var_err : Throwable => {
var_$1922_error = var_err
}
}
}
var_$1922_init = true
var_$1922_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1777_changed = false
}
if ((var_$1728_changed)) {
var_$1777_value = var_$1728_value
var_$1777_init = true
var_$1777_error = var_$1728_error
var_$1777_changed = true
var_$1777_unknown = var_$1728_unknown
}
var_$1676_changed = false
if ((var_$1922_init && var_$1777_init)) {
if ((var_$1922_changed) || (var_$1777_changed)) {
var_$1676_unknown = (var_$1922_unknown && var_$1777_unknown)
if ((var_$1676_unknown)) {
var_$1676_error = UnknownEventError(null)
} else {
var_$1676_error = null
try {
var_$1676_value = ((if((var_$1922_error == null)) {var_$1922_value} else {throw var_$1922_error}) == (if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}))
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
if ((!(currTs == 0L))) {
var_$1729_changed = false
}
if ((var_$1730_changed)) {
var_$1729_value = var_$1730_value
var_$1729_init = true
var_$1729_error = var_$1730_error
var_$1729_changed = true
var_$1729_unknown = var_$1730_unknown
}
var_$1734_changed = false
if ((var_$1735_init)) {
if ((var_$1735_changed)) {
var_$1734_unknown = (var_$1735_unknown)
if ((var_$1734_unknown)) {
var_$1734_error = UnknownEventError(null)
} else {
var_$1734_error = null
try {
var_$1734_value = var_timeOldestUnfulfilledEvent$1726.apply((if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}))
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
var_$1739_changed = false
if ((var_eventList2$1684_changed)) {
if ((var_eventList2$1684_unknown)) {
var_$1739_error = UnknownEventError(var_eventList2$1684_error)
} else {
var_$1739_error = null
}
var_$1739_changed = var_eventList2$1684_changed
var_$1739_unknown = var_eventList2$1684_unknown
}
var_safeDelay$1743_changed = false
if ((var_safeDelay$1743_nextTs == currTs)) {
var_safeDelay$1743_changed = true
var_safeDelay$1743_unknown = false
}
var_$1741_changed = false
if ((var_safeDelay$1743_changed)) {
if ((var_safeDelay$1743_unknown)) {
var_$1741_error = UnknownEventError(var_safeDelay$1743_error)
} else {
var_$1741_error = null
}
var_$1741_changed = var_safeDelay$1743_changed
var_$1741_unknown = var_safeDelay$1743_unknown
}
var_mergeUnit2$1738_changed = false
if ((var_$1739_changed) || (var_$1741_changed)) {
var_mergeUnit2$1738_ts = currTs
var_mergeUnit2$1738_changed = true
var_mergeUnit2$1738_unknown = (var_$1739_unknown && var_$1741_unknown)
if ((var_$1739_changed)) {
var_mergeUnit2$1738_error = var_$1739_error
} else {
if ((var_$1741_changed)) {
var_mergeUnit2$1738_error = var_$1741_error
}
}
}
var_$1737_changed = false
if ((var_mergeUnit2$1738_changed)) {
var_$1737_value = var_mergeUnit2$1738_ts
var_$1737_init = true
var_$1737_unknown = var_mergeUnit2$1738_unknown
if ((var_$1737_unknown)) {
var_$1737_error = var_mergeUnit2$1738_error
} else {
var_$1737_error = null
}
var_$1737_changed = true
}
var_$1736_changed = false
if ((var_$1737_init && var_storedEventsBeforeRemove$1717_init)) {
if ((var_$1737_changed) || (var_storedEventsBeforeRemove$1717_changed)) {
var_$1736_unknown = (var_$1737_unknown && var_storedEventsBeforeRemove$1717_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = ((if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}) - (if((var_storedEventsBeforeRemove$1717_error == null)) {var_storedEventsBeforeRemove$1717_value} else {throw var_storedEventsBeforeRemove$1717_error}))
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
var_$1733_changed = false
if ((var_$1734_init && var_$1736_init)) {
if ((var_$1734_changed) || (var_$1736_changed)) {
var_$1733_unknown = (var_$1734_unknown && var_$1736_unknown)
if ((var_$1733_unknown)) {
var_$1733_error = UnknownEventError(null)
} else {
var_$1733_error = null
try {
var_$1733_value = ((if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}) >= (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}))
} catch {
case var_err : Throwable => {
var_$1733_error = var_err
}
}
}
var_$1733_init = true
var_$1733_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1746_changed = false
}
if ((var_$1730_changed)) {
var_$1746_value = var_$1730_value
var_$1746_init = true
var_$1746_error = var_$1730_error
var_$1746_changed = true
var_$1746_unknown = var_$1730_unknown
}
if ((!(currTs == 0L))) {
var_$1749_changed = false
}
if ((var_$1730_changed)) {
var_$1749_value = var_$1730_value
var_$1749_init = true
var_$1749_error = var_$1730_error
var_$1749_changed = true
var_$1749_unknown = var_$1730_unknown
}
var_$1732_changed = false
if ((var_$1733_init && var_$1746_init && var_$1749_init)) {
if ((var_$1733_changed) || (var_$1746_changed) || (var_$1749_changed)) {
var_$1732_unknown = (var_$1733_unknown && var_$1746_unknown && var_$1749_unknown)
if ((var_$1732_unknown)) {
var_$1732_error = UnknownEventError(null)
} else {
var_$1732_error = null
try {
var_$1732_value = (if ((if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error})) (if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}) else (if((var_$1749_error == null)) {var_$1749_value} else {throw var_$1749_error}))
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
var_result$1675_changed = false
if ((var_$1676_init && var_$1729_init && var_$1732_init)) {
if ((var_$1676_changed) || (var_$1729_changed) || (var_$1732_changed)) {
var_result$1675_unknown = (var_$1676_unknown && var_$1729_unknown && var_$1732_unknown)
if ((var_result$1675_unknown)) {
var_result$1675_error = UnknownEventError(null)
} else {
var_result$1675_error = null
try {
var_result$1675_value = (if ((if((var_$1676_error == null)) {var_$1676_value} else {throw var_$1676_error})) (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}) else (if((var_$1732_error == null)) {var_$1732_value} else {throw var_$1732_error}))
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
var_$1764_changed = false
if ((var_result$1675_init)) {
if ((var_result$1675_changed)) {
var_$1764_unknown = (var_result$1675_unknown)
if ((var_$1764_unknown)) {
var_$1764_error = UnknownEventError(null)
} else {
var_$1764_error = null
try {
var_$1764_value = var_$1765.apply((if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
} catch {
case var_err : Throwable => {
var_$1764_error = var_err
}
}
}
var_$1764_init = true
var_$1764_changed = true
}
}
var_$1754_changed = false
if ((var_result$1675_init)) {
if ((var_result$1675_changed)) {
var_$1754_unknown = (var_result$1675_unknown)
if ((var_$1754_unknown)) {
var_$1754_error = UnknownEventError(null)
} else {
var_$1754_error = null
try {
var_$1754_value = var_$1770.apply((if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
} catch {
case var_err : Throwable => {
var_$1754_error = var_err
}
}
}
var_$1754_init = true
var_$1754_changed = true
}
}
var_$1753_changed = false
if ((var_$1754_init)) {
if ((var_$1754_changed)) {
var_$1753_unknown = (var_$1754_unknown)
if ((var_$1753_unknown)) {
var_$1753_error = UnknownEventError(null)
} else {
var_$1753_error = null
try {
var_$1753_value = !((if((var_$1754_error == null)) {var_$1754_value} else {throw var_$1754_error}))
} catch {
case var_err : Throwable => {
var_$1753_error = var_err
}
}
}
var_$1753_init = true
var_$1753_changed = true
}
}
var_$1673_changed = false
if ((var_$1764_init && var_$1753_init)) {
if ((var_$1764_changed) || (var_$1753_changed)) {
var_$1673_unknown = (var_$1764_unknown && var_$1753_unknown)
if ((var_$1673_unknown)) {
var_$1673_error = UnknownEventError(null)
} else {
var_$1673_error = null
try {
var_$1673_value = ((if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}) && (if((var_$1753_error == null)) {var_$1753_value} else {throw var_$1753_error}))
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
var_$1760_changed = false
if ((var_result$1675_changed)) {
if ((var_$1761_ts == currTs && var_$1761_lastInit) || (!(var_$1761_ts == currTs) && var_$1761_init)) {
var_$1760_changed = true
var_$1760_init = true
var_$1760_unknown = var_result$1675_unknown
if ((var_$1760_unknown)) {
var_$1760_error = var_result$1675_error
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
var_$1766_changed = false
}
if ((var_$1767_changed)) {
var_$1766_value = var_$1767_value
var_$1766_init = true
var_$1766_error = var_$1767_error
var_$1766_changed = true
var_$1766_unknown = var_$1767_unknown
}
var_$1763_changed = false
if ((var_$1764_init && var_$1766_init)) {
if ((var_$1764_changed) || (var_$1766_changed)) {
var_$1763_unknown = (var_$1764_unknown && var_$1766_unknown)
if ((var_$1763_unknown)) {
var_$1763_error = UnknownEventError(null)
} else {
var_$1763_error = null
try {
var_$1763_value = ((if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}) == (if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}))
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
if ((!(currTs == 0L))) {
var_$1771_changed = false
}
if ((var_$1767_changed)) {
var_$1771_value = var_$1767_value
var_$1771_init = true
var_$1771_error = var_$1767_error
var_$1771_changed = true
var_$1771_unknown = var_$1767_unknown
}
var_$1768_changed = false
if ((var_$1754_init && var_$1771_init)) {
if ((var_$1754_changed) || (var_$1771_changed)) {
var_$1768_unknown = (var_$1754_unknown && var_$1771_unknown)
if ((var_$1768_unknown)) {
var_$1768_error = UnknownEventError(null)
} else {
var_$1768_error = null
try {
var_$1768_value = ((if((var_$1754_error == null)) {var_$1754_value} else {throw var_$1754_error}) == (if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}))
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
var_$1762_changed = false
if ((var_$1763_init && var_$1768_init)) {
if ((var_$1763_changed) || (var_$1768_changed)) {
var_$1762_unknown = (var_$1763_unknown && var_$1768_unknown)
if ((var_$1762_unknown)) {
var_$1762_error = UnknownEventError(null)
} else {
var_$1762_error = null
try {
var_$1762_value = ((if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}) && (if((var_$1768_error == null)) {var_$1768_value} else {throw var_$1768_error}))
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
var_isFinalFalse$1759_changed = false
if ((var_$1760_init && var_$1762_init)) {
if ((var_$1760_changed) || (var_$1762_changed)) {
var_isFinalFalse$1759_unknown = (var_$1760_unknown && var_$1762_unknown)
if ((var_isFinalFalse$1759_unknown)) {
var_isFinalFalse$1759_error = UnknownEventError(null)
} else {
var_isFinalFalse$1759_error = null
try {
var_isFinalFalse$1759_value = ((if((var_$1760_error == null)) {var_$1760_value} else {throw var_$1760_error}) || (if((var_$1762_error == null)) {var_$1762_value} else {throw var_$1762_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1759_error = var_err
}
}
}
var_isFinalFalse$1759_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1776_changed = false
}
if ((var_isFinalFalse$1759_changed)) {
var_$1776_lastValue = var_$1776_value
var_$1776_lastInit = var_$1776_init
var_$1776_lastError = var_$1776_error
var_$1776_value = var_isFinalFalse$1759_value
var_$1776_init = true
var_$1776_ts = currTs
var_$1776_error = var_isFinalFalse$1759_error
var_$1776_changed = true
var_$1776_unknown = var_isFinalFalse$1759_unknown
}
var_prev$1757_changed = false
if ((var_$1776_changed)) {
if ((var_$1776_ts == currTs && var_$1776_lastInit) || (!(var_$1776_ts == currTs) && var_$1776_init)) {
var_prev$1757_changed = true
var_prev$1757_init = true
var_prev$1757_unknown = var_$1776_unknown
if ((var_prev$1757_unknown)) {
var_prev$1757_error = var_$1776_error
} else {
if ((var_$1776_ts == currTs)) {
var_prev$1757_value = var_$1776_lastValue
var_prev$1757_error = var_$1776_lastError
} else {
var_prev$1757_value = var_$1776_value
var_prev$1757_error = var_$1776_error
}
}
}
}
var_$1756_changed = false
if ((var_prev$1757_init)) {
if ((var_prev$1757_changed)) {
var_$1756_unknown = (var_prev$1757_unknown)
if ((var_$1756_unknown)) {
var_$1756_error = UnknownEventError(null)
} else {
var_$1756_error = null
try {
var_$1756_value = !((if((var_prev$1757_error == null)) {var_prev$1757_value} else {throw var_prev$1757_error}))
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
var_$1672_changed = false
if ((var_$1673_init && var_$1756_init)) {
if ((var_$1673_changed) || (var_$1756_changed)) {
var_$1672_unknown = (var_$1673_unknown && var_$1756_unknown)
if ((var_$1672_unknown)) {
var_$1672_error = UnknownEventError(null)
} else {
var_$1672_error = null
try {
var_$1672_value = ((if((var_$1673_error == null)) {var_$1673_value} else {throw var_$1673_error}) && (if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error}))
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
var_$1773_changed = false
if ((var_result$1675_changed)) {
var_$1773_value = var_result$1675_ts
var_$1773_init = true
var_$1773_unknown = var_result$1675_unknown
if ((var_$1773_unknown)) {
var_$1773_error = var_result$1675_error
} else {
var_$1773_error = null
}
var_$1773_changed = true
}
var_$1774_changed = false
if ((var_$1776_changed)) {
if ((var_$1670_ts == currTs && var_$1670_lastInit) || (!(var_$1670_ts == currTs) && var_$1670_init)) {
var_$1774_changed = true
var_$1774_init = true
var_$1774_unknown = var_$1776_unknown
if ((var_$1774_unknown)) {
var_$1774_error = var_$1776_error
} else {
if ((var_$1670_ts == currTs)) {
var_$1774_value = var_$1670_lastValue
var_$1774_error = var_$1670_lastError
} else {
var_$1774_value = var_$1670_value
var_$1774_error = var_$1670_error
}
}
}
}
var_finalFalseSince$1671_changed = false
if ((var_$1672_init && var_$1773_init && var_$1774_init)) {
if ((var_$1672_changed) || (var_$1773_changed) || (var_$1774_changed)) {
var_finalFalseSince$1671_unknown = (var_$1672_unknown && var_$1773_unknown && var_$1774_unknown)
if ((var_finalFalseSince$1671_unknown)) {
var_finalFalseSince$1671_error = UnknownEventError(null)
} else {
var_finalFalseSince$1671_error = null
try {
var_finalFalseSince$1671_value = (if ((if((var_$1672_error == null)) {var_$1672_value} else {throw var_$1672_error})) (if((var_$1773_error == null)) {var_$1773_value} else {throw var_$1773_error}) else (if((var_$1774_error == null)) {var_$1774_value} else {throw var_$1774_error}))
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
var_$1669_changed = false
if ((var_$1670_init && var_$1777_init)) {
if ((var_$1670_changed) || (var_$1777_changed)) {
var_$1669_unknown = (var_$1670_unknown && var_$1777_unknown)
if ((var_$1669_unknown)) {
var_$1669_error = UnknownEventError(null)
} else {
var_$1669_error = null
try {
var_$1669_value = ((if((var_$1670_error == null)) {var_$1670_value} else {throw var_$1670_error}) + (if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}))
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
var_$1668_changed = false
if ((var_$1669_init && var_$1773_init)) {
if ((var_$1669_changed) || (var_$1773_changed)) {
var_$1668_unknown = (var_$1669_unknown && var_$1773_unknown)
if ((var_$1668_unknown)) {
var_$1668_error = UnknownEventError(null)
} else {
var_$1668_error = null
try {
var_$1668_value = ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) < (if((var_$1773_error == null)) {var_$1773_value} else {throw var_$1773_error}))
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
if ((var_$1668_init && var_$1771_init && var_$1776_init)) {
if ((var_$1668_changed) || (var_$1771_changed) || (var_$1776_changed)) {
var_isFinalFalseReset$1667_unknown = (var_$1668_unknown && var_$1771_unknown && var_$1776_unknown)
if ((var_isFinalFalseReset$1667_unknown)) {
var_isFinalFalseReset$1667_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1667_error = null
try {
var_isFinalFalseReset$1667_value = (if ((if((var_$1668_error == null)) {var_$1668_value} else {throw var_$1668_error})) (if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}) else (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1667_error = var_err
}
}
}
var_isFinalFalseReset$1667_changed = true
}
}
var_$1761_changed = false
if ((var_isFinalFalseReset$1667_changed) || (var_$1776_changed)) {
var_$1761_lastValue = var_$1761_value
var_$1761_lastInit = var_$1761_init
var_$1761_lastError = var_$1761_error
var_$1761_init = true
var_$1761_ts = currTs
var_$1761_changed = true
var_$1761_unknown = (var_isFinalFalseReset$1667_unknown && var_$1776_unknown)
if ((var_isFinalFalseReset$1667_changed)) {
var_$1761_value = var_isFinalFalseReset$1667_value
var_$1761_error = var_isFinalFalseReset$1667_error
} else {
if ((var_$1776_changed)) {
var_$1761_value = var_$1776_value
var_$1761_error = var_$1776_error
}
}
}
if ((!(currTs == 0L))) {
var_$1929_changed = false
}
if ((var_$1728_changed)) {
var_$1929_value = var_$1728_value
var_$1929_init = true
var_$1929_error = var_$1728_error
var_$1929_changed = true
var_$1929_unknown = var_$1728_unknown
}
var_$1921_changed = false
if ((var_$1922_init && var_storedEventsBeforeRemove$1717_init)) {
if ((var_$1922_changed) || (var_storedEventsBeforeRemove$1717_changed)) {
var_$1921_unknown = (var_$1922_unknown && var_storedEventsBeforeRemove$1717_unknown)
if ((var_$1921_unknown)) {
var_$1921_error = UnknownEventError(null)
} else {
var_$1921_error = null
try {
var_$1921_value = ((if((var_$1922_error == null)) {var_$1922_value} else {throw var_$1922_error}) + (if((var_storedEventsBeforeRemove$1717_error == null)) {var_storedEventsBeforeRemove$1717_value} else {throw var_storedEventsBeforeRemove$1717_error}))
} catch {
case var_err : Throwable => {
var_$1921_error = var_err
}
}
}
var_$1921_init = true
var_$1921_changed = true
}
}
var_$1920_changed = false
if ((var_$1921_init && var_storedEventsBeforeRemove$1716_init)) {
if ((var_$1921_changed) || (var_storedEventsBeforeRemove$1716_changed)) {
var_$1920_unknown = (var_$1921_unknown && var_storedEventsBeforeRemove$1716_unknown)
if ((var_$1920_unknown)) {
var_$1920_error = UnknownEventError(null)
} else {
var_$1920_error = null
try {
var_$1920_value = ((if((var_$1921_error == null)) {var_$1921_value} else {throw var_$1921_error}) - (if((var_storedEventsBeforeRemove$1716_error == null)) {var_storedEventsBeforeRemove$1716_value} else {throw var_storedEventsBeforeRemove$1716_error}))
} catch {
case var_err : Throwable => {
var_$1920_error = var_err
}
}
}
var_$1920_init = true
var_$1920_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1927_changed = false
}
if ((var_$1728_changed)) {
var_$1927_value = var_$1728_value
var_$1927_init = true
var_$1927_error = var_$1728_error
var_$1927_changed = true
var_$1927_unknown = var_$1728_unknown
}
var_$1919_changed = false
if ((var_$1920_init && var_$1927_init)) {
if ((var_$1920_changed) || (var_$1927_changed)) {
var_$1919_unknown = (var_$1920_unknown && var_$1927_unknown)
if ((var_$1919_unknown)) {
var_$1919_error = UnknownEventError(null)
} else {
var_$1919_error = null
try {
var_$1919_value = ((if((var_$1920_error == null)) {var_$1920_value} else {throw var_$1920_error}) + (if((var_$1927_error == null)) {var_$1927_value} else {throw var_$1927_error}))
} catch {
case var_err : Throwable => {
var_$1919_error = var_err
}
}
}
var_$1919_init = true
var_$1919_ts = currTs
var_$1919_changed = true
}
}
var_$1918_changed = false
if ((var_$1919_init && var_$1929_init)) {
if ((var_$1919_changed) || (var_$1929_changed)) {
var_$1918_unknown = (var_$1919_unknown && var_$1929_unknown)
if ((var_$1918_unknown)) {
var_$1918_error = UnknownEventError(null)
} else {
var_$1918_error = null
try {
var_$1918_value = ((if((var_$1919_error == null)) {var_$1919_value} else {throw var_$1919_error}) > (if((var_$1929_error == null)) {var_$1929_value} else {throw var_$1929_error}))
} catch {
case var_err : Throwable => {
var_$1918_error = var_err
}
}
}
var_$1918_init = true
var_$1918_changed = true
}
}
var_$1934_changed = false
if ((var_$1919_changed)) {
var_$1934_value = var_$1919_ts
var_$1934_init = true
var_$1934_unknown = var_$1919_unknown
if ((var_$1934_unknown)) {
var_$1934_error = var_$1919_error
} else {
var_$1934_error = null
}
var_$1934_changed = true
}
var_$1931_changed = false
if ((var_$1777_init && var_$1934_init)) {
if ((var_$1777_changed) || (var_$1934_changed)) {
var_$1931_unknown = (var_$1777_unknown && var_$1934_unknown)
if ((var_$1931_unknown)) {
var_$1931_error = UnknownEventError(null)
} else {
var_$1931_error = null
try {
var_$1931_value = ((if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}) - (if((var_$1934_error == null)) {var_$1934_value} else {throw var_$1934_error}))
} catch {
case var_err : Throwable => {
var_$1931_error = var_err
}
}
}
var_$1931_init = true
var_$1931_changed = true
}
}
var_$1837_changed = false
if ((var_$1918_init && var_$1919_init && var_$1931_init)) {
if ((var_$1918_changed) || (var_$1919_changed) || (var_$1931_changed)) {
var_$1837_unknown = (var_$1918_unknown && var_$1919_unknown && var_$1931_unknown)
if ((var_$1837_unknown)) {
var_$1837_error = UnknownEventError(null)
} else {
var_$1837_error = null
try {
var_$1837_value = (if ((if((var_$1918_error == null)) {var_$1918_value} else {throw var_$1918_error})) (if((var_$1919_error == null)) {var_$1919_value} else {throw var_$1919_error}) else (if((var_$1931_error == null)) {var_$1931_value} else {throw var_$1931_error}))
} catch {
case var_err : Throwable => {
var_$1837_error = var_err
}
}
}
var_$1837_changed = true
}
}
var_stillFulfillableReset$1665_changed = false
if ((var_$1761_init && var_$1749_init && var_result$1675_init)) {
if ((var_$1761_changed) || (var_$1749_changed) || (var_result$1675_changed)) {
var_stillFulfillableReset$1665_unknown = (var_$1761_unknown && var_$1749_unknown && var_result$1675_unknown)
if ((var_stillFulfillableReset$1665_unknown)) {
var_stillFulfillableReset$1665_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1665_error = null
try {
var_stillFulfillableReset$1665_value = (if ((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error})) (if((var_$1749_error == null)) {var_$1749_value} else {throw var_$1749_error}) else (if((var_result$1675_error == null)) {var_result$1675_value} else {throw var_result$1675_error}))
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
var_value$1788_changed = false
if ((var_stillFulfillableReset$1665_init)) {
if ((var_stillFulfillableReset$1665_changed)) {
var_value$1788_unknown = (var_stillFulfillableReset$1665_unknown)
if ((var_value$1788_unknown)) {
var_value$1788_error = UnknownEventError(null)
} else {
var_value$1788_error = null
try {
var_value$1788_value = var_$1770.apply((if((var_stillFulfillableReset$1665_error == null)) {var_stillFulfillableReset$1665_value} else {throw var_stillFulfillableReset$1665_error}))
} catch {
case var_err : Throwable => {
var_value$1788_error = var_err
}
}
}
var_value$1788_init = true
var_value$1788_changed = true
}
}
var_final$1664_changed = false
if ((var_stillFulfillableReset$1665_init)) {
if ((var_stillFulfillableReset$1665_changed)) {
var_final$1664_unknown = (var_stillFulfillableReset$1665_unknown)
if ((var_final$1664_unknown)) {
var_final$1664_error = UnknownEventError(null)
} else {
var_final$1664_error = null
try {
var_final$1664_value = var_$1765.apply((if((var_stillFulfillableReset$1665_error == null)) {var_stillFulfillableReset$1665_value} else {throw var_stillFulfillableReset$1665_error}))
} catch {
case var_err : Throwable => {
var_final$1664_error = var_err
}
}
}
var_final$1664_init = true
var_final$1664_changed = true
}
}

if ((var_eventList2$1684_unknown) || (!(var_$1837_error == null)) || (var_$1837_changed && (0L >= var_$1837_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1837_changed)) {
if ((var_safeDelay$1743_changed) || (var_eventList2$1684_changed)) {
var_safeDelay$1743_nextTs = (currTs + var_$1837_value)
}
} else {
if ((var_eventList2$1684_changed)) {
var_safeDelay$1743_nextTs = -1L
}
}
}
if ((var_final$1664_changed && var_final$1664_init)) {
out_final.apply(var_final$1664_value, currTs, "final", var_final$1664_error)
}
if ((var_value$1788_changed && var_value$1788_init)) {
out_value.apply(var_value$1788_value, currTs, "value", var_value$1788_error)
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
