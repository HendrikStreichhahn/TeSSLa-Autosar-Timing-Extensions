//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1679 : scala.Function1[List[Any], Any] = ((var_list$1805 : List[Any]) => {
val var_$1806 : Any = var_list$1805(0L.asInstanceOf[Int])
var_$1806
})
var var_removeItemsSmallerThanAFromListFront$1699 : scala.Function2[List[Long], Long, List[Long]] = null
val var_$1770 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1829 : (Boolean, Boolean)) => {
val var_$1830 : Boolean = var_$1829._2
var_$1830
})
val var_$1802 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1835 : (Boolean, Boolean)) => {
val var_$1836 : Boolean = var_$1835._1
var_$1836
})
lazy val var_$1703 : List[Long] = List[Long]()
val var_$1745 : (Boolean, Boolean) = (false, true)
val var_$1763 : (Boolean, Boolean) = (false, false)
val var_$1766 : (Boolean, Boolean) = (true, false)
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_source_error : Throwable = null
val var_source_unknown : Boolean = false
var set_var_source : scala.Function2[Long, Long, Unit] = null
var var_source_ts : Long = 0L
var var_source_changed : Boolean = false
val var_target_error : Throwable = null
val var_target_unknown : Boolean = false
var set_var_target : scala.Function2[Long, Long, Unit] = null
var var_target_ts : Long = 0L
var var_target_changed : Boolean = false

var_removeItemsSmallerThanAFromListFront$1699 = ((var_list$1807 : List[Long], var_A$1808 : Long) => {
var var_$1809 : List[Long] = List[Long]()
var_$1809 = (if ((var_list$1807.size == 0L)) var_list$1807 else (if (((var_head$1679.apply((var_list$1807).asInstanceOf[List[Any]])).asInstanceOf[Long] < var_A$1808)) var_removeItemsSmallerThanAFromListFront$1699.apply(var_list$1807.tail, var_A$1808) else var_list$1807))
var_$1809
})
out_final = null
out_value = null
set_var_source = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_source_changed))) {
var_source_ts = ts
var_source_changed = true
}
})
set_var_target = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_target_changed))) {
var_target_ts = ts
var_target_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1649_changed : Boolean = false
var var_$1649_value : Long = 0L
var var_$1649_init : Boolean = false
var var_$1649_unknown : Boolean = false
var var_$1649_error : Throwable = null
var var_defaultTime$1648_changed : Boolean = true
var var_defaultTime$1648_value : Long = -1L
var var_defaultTime$1648_init : Boolean = true
var var_defaultTime$1648_error : Throwable = null
var var_defaultTime$1648_unknown : Boolean = false
var var_$1728_changed : Boolean = false
var var_$1728_value : Long = 0L
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_defaultTime$1650_changed : Boolean = true
var var_defaultTime$1650_value : Long = -1L
var var_defaultTime$1650_init : Boolean = true
var var_defaultTime$1650_error : Throwable = null
var var_defaultTime$1650_unknown : Boolean = false
var var_$1636_changed : Boolean = false
var var_$1636_unknown : Boolean = false
var var_$1636_error : Throwable = null
var var_$1636_value : Boolean = false
var var_$1636_init : Boolean = false
var var_unfinishedSourceTimesNewSource$1647_changed : Boolean = false
var var_unfinishedSourceTimesNewSource$1647_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1647_error : Throwable = null
var var_unfinishedSourceTimesNewSource$1647_value : Boolean = false
var var_unfinishedSourceTimesNewSource$1647_init : Boolean = false
var var_$1684_changed : Boolean = false
var var_$1684_error : Throwable = null
var var_$1684_unknown : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_unknown : Boolean = false
var var_mergeUnit2$1752_changed : Boolean = false
var var_mergeUnit2$1752_ts : Long = 0L
var var_mergeUnit2$1752_unknown : Boolean = false
var var_mergeUnit2$1752_error : Throwable = null
var var_$1654_changed : Boolean = false
var var_$1654_unknown : Boolean = false
var var_$1654_error : Throwable = null
var var_$1654_value : List[Long] = List[Long]()
var var_$1653_changed : Boolean = true
var var_$1653_value : List[Long] = var_$1703
var var_$1653_init : Boolean = true
var var_$1653_error : Throwable = null
var var_$1653_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1652_changed : Boolean = false
var var_unfinishedSourceTimesNewSource$1652_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1652_error : Throwable = null
var var_unfinishedSourceTimesNewSource$1652_value : List[Long] = List[Long]()
var var_unfinishedSourceTimesNewSource$1652_init : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1689_value : List[Long] = List[Long]()
var var_$1689_init : Boolean = false
var var_$1645_changed : Boolean = false
var var_$1645_unknown : Boolean = false
var var_$1645_error : Throwable = null
var var_$1645_value : Long = 0L
var var_$1645_init : Boolean = false
val var_$1845_value : Long = 0L
val var_$1845_error : Throwable = null
val var_$1845_changed : Boolean = false
val var_$1845_unknown : Boolean = false
var var_$1704_changed : Boolean = true
var var_$1704_value : Long = 0L
var var_$1704_init : Boolean = true
var var_$1704_error : Throwable = null
var var_$1704_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1644_changed : Boolean = false
var var_unfinishedSourceTimesAfterReset$1644_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1644_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1644_value : Boolean = false
var var_unfinishedSourceTimesAfterReset$1644_init : Boolean = false
var var_$1677_changed : Boolean = false
var var_$1677_unknown : Boolean = false
var var_$1677_error : Throwable = null
var var_$1677_value : Long = 0L
var var_$1677_init : Boolean = false
var var_$1680_changed : Boolean = true
var var_$1680_value : Long = 9223372036854775807L
var var_$1680_init : Boolean = true
var var_$1680_error : Throwable = null
var var_$1680_unknown : Boolean = false
var var_$1676_changed : Boolean = false
var var_$1676_unknown : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_value : Long = 0L
var var_$1676_init : Boolean = false
var var_$1682_changed : Boolean = false
var var_$1682_value : Long = 0L
var var_$1682_init : Boolean = false
var var_$1682_unknown : Boolean = false
var var_$1682_error : Throwable = null
var var_$1675_changed : Boolean = false
var var_$1675_unknown : Boolean = false
var var_$1675_error : Throwable = null
var var_$1675_value : Boolean = false
var var_$1675_init : Boolean = false
var var_$1853_changed : Boolean = true
var var_$1853_value : Long = 50L
var var_$1853_init : Boolean = true
var var_$1853_error : Throwable = null
var var_$1853_unknown : Boolean = false
var var_$1690_changed : Boolean = false
var var_$1690_unknown : Boolean = false
var var_$1690_error : Throwable = null
var var_$1690_value : Long = 0L
var var_$1690_init : Boolean = false
var var_$1688_changed : Boolean = false
var var_$1688_unknown : Boolean = false
var var_$1688_error : Throwable = null
var var_$1688_value : List[Long] = List[Long]()
var var_$1688_init : Boolean = false
var var_unfinishedSourceTimesAfterReset$1674_changed : Boolean = false
var var_unfinishedSourceTimesAfterReset$1674_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1674_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1674_value : List[Long] = List[Long]()
var var_unfinishedSourceTimesAfterReset$1674_init : Boolean = false
val var_$1734_value : List[Long] = List[Long]()
val var_$1734_error : Throwable = null
val var_$1734_changed : Boolean = false
val var_$1734_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1701_changed : Boolean = true
var var_unfinishedSourceTimesAfterReset$1701_value : List[Long] = var_$1703
var var_unfinishedSourceTimesAfterReset$1701_init : Boolean = true
var var_unfinishedSourceTimesAfterReset$1701_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1701_unknown : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : List[Long] = List[Long]()
var var_$1643_init : Boolean = false
var var_$1642_changed : Boolean = false
var var_$1642_unknown : Boolean = false
var var_$1642_error : Throwable = null
var var_$1642_value : Long = 0L
var var_$1642_init : Boolean = false
var var_$1641_changed : Boolean = false
var var_$1641_unknown : Boolean = false
var var_$1641_error : Throwable = null
var var_$1641_value : Boolean = false
var var_$1641_init : Boolean = false
var var_$1635_changed : Boolean = false
var var_$1635_unknown : Boolean = false
var var_$1635_error : Throwable = null
var var_$1635_value : Boolean = false
var var_$1635_init : Boolean = false
var var_$1708_changed : Boolean = false
var var_$1708_unknown : Boolean = false
var var_$1708_error : Throwable = null
var var_$1708_value : Long = 0L
var var_$1708_init : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1707_value : Long = 0L
var var_$1707_init : Boolean = false
var var_$1706_changed : Boolean = false
var var_$1706_unknown : Boolean = false
var var_$1706_error : Throwable = null
var var_$1706_value : Boolean = false
var var_$1706_init : Boolean = false
var var_$1634_changed : Boolean = false
var var_$1634_unknown : Boolean = false
var var_$1634_error : Throwable = null
var var_$1634_value : Boolean = false
var var_$1634_init : Boolean = false
var var_$1714_changed : Boolean = false
var var_$1714_unknown : Boolean = false
var var_$1714_error : Throwable = null
var var_$1714_value : Boolean = false
var var_$1714_init : Boolean = false
var var_unfinishedSourceTimes$1633_changed : Boolean = false
var var_unfinishedSourceTimes$1633_unknown : Boolean = false
var var_unfinishedSourceTimes$1633_error : Throwable = null
var var_unfinishedSourceTimes$1633_value : Boolean = false
var var_unfinishedSourceTimes$1633_init : Boolean = false
var var_$1726_changed : Boolean = false
var var_$1726_unknown : Boolean = false
var var_$1726_error : Throwable = null
var var_$1726_value : Long = 0L
var var_$1726_init : Boolean = false
var var_$1861_changed : Boolean = true
var var_$1861_value : Long = 1L
var var_$1861_init : Boolean = true
var var_$1861_error : Throwable = null
var var_$1861_unknown : Boolean = false
var var_$1725_changed : Boolean = false
var var_$1725_unknown : Boolean = false
var var_$1725_error : Throwable = null
var var_$1725_value : Long = 0L
var var_$1725_init : Boolean = false
var var_$1723_changed : Boolean = false
var var_$1723_unknown : Boolean = false
var var_$1723_error : Throwable = null
var var_$1723_value : List[Long] = List[Long]()
var var_unfinishedSourceTimes$1722_changed : Boolean = false
var var_unfinishedSourceTimes$1722_init : Boolean = false
var var_unfinishedSourceTimes$1722_unknown : Boolean = false
var var_unfinishedSourceTimes$1722_value : List[Long] = List[Long]()
var var_unfinishedSourceTimes$1722_error : Throwable = null
var var_unfinishedSourceTimes$1736_changed : Boolean = false
var var_unfinishedSourceTimes$1736_init : Boolean = false
var var_unfinishedSourceTimes$1736_unknown : Boolean = false
var var_unfinishedSourceTimes$1736_value : List[Long] = List[Long]()
var var_unfinishedSourceTimes$1736_error : Throwable = null
var var_$1632_changed : Boolean = false
var var_$1632_lastValue : List[Long] = List[Long]()
var var_$1632_lastInit : Boolean = false
var var_$1632_lastError : Throwable = null
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : List[Long] = List[Long]()
var var_$1632_init : Boolean = false
var var_$1632_ts : Long = 0L
var var_$1631_changed : Boolean = false
var var_$1631_unknown : Boolean = false
var var_$1631_error : Throwable = null
var var_$1631_value : Long = 0L
var var_$1631_init : Boolean = false
var var_$1841_changed : Boolean = false
var var_$1841_unknown : Boolean = false
var var_$1841_error : Throwable = null
var var_$1841_value : Boolean = false
var var_$1841_init : Boolean = false
val var_$1765_value : (Boolean, Boolean) = (false, false)
val var_$1765_error : Throwable = null
val var_$1765_changed : Boolean = false
val var_$1765_unknown : Boolean = false
var var_$1743_changed : Boolean = true
var var_$1743_value : (Boolean, Boolean) = var_$1745
var var_$1743_init : Boolean = true
var var_$1743_error : Throwable = null
var var_$1743_unknown : Boolean = false
var var_$1750_changed : Boolean = false
var var_$1750_error : Throwable = null
var var_$1750_unknown : Boolean = false
var var_safeDelay$1755_changed : Boolean = false
val var_safeDelay$1755_error : Throwable = null
var var_safeDelay$1755_unknown : Boolean = false
var var_$1753_changed : Boolean = false
var var_$1753_error : Throwable = null
var var_$1753_unknown : Boolean = false
var var_mergeUnit2$1749_changed : Boolean = false
var var_mergeUnit2$1749_ts : Long = 0L
var var_mergeUnit2$1749_unknown : Boolean = false
var var_mergeUnit2$1749_error : Throwable = null
var var_$1748_changed : Boolean = false
var var_$1748_value : Long = 0L
var var_$1748_init : Boolean = false
var var_$1748_unknown : Boolean = false
var var_$1748_error : Throwable = null
var var_$1851_changed : Boolean = false
var var_$1851_unknown : Boolean = false
var var_$1851_error : Throwable = null
var var_$1851_value : Long = 0L
var var_$1851_init : Boolean = false
var var_$1756_changed : Boolean = false
var var_$1756_unknown : Boolean = false
var var_$1756_error : Throwable = null
var var_$1756_value : Long = 0L
var var_$1756_init : Boolean = false
var var_$1747_changed : Boolean = false
var var_$1747_unknown : Boolean = false
var var_$1747_error : Throwable = null
var var_$1747_value : Boolean = false
var var_$1747_init : Boolean = false
var var_$1761_changed : Boolean = true
var var_$1761_value : (Boolean, Boolean) = var_$1763
var var_$1761_init : Boolean = true
var var_$1761_error : Throwable = null
var var_$1761_unknown : Boolean = false
var var_$1764_changed : Boolean = true
var var_$1764_value : (Boolean, Boolean) = var_$1766
var var_$1764_init : Boolean = true
var var_$1764_error : Throwable = null
var var_$1764_unknown : Boolean = false
var var_$1746_changed : Boolean = false
var var_$1746_unknown : Boolean = false
var var_$1746_error : Throwable = null
var var_$1746_value : (Boolean, Boolean) = (false, false)
var var_$1746_init : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : (Boolean, Boolean) = (false, false)
var var_$1629_init : Boolean = false
var var_$1629_ts : Long = 0L
var var_$1775_changed : Boolean = false
var var_$1775_init : Boolean = false
var var_$1775_unknown : Boolean = false
var var_$1775_error : Throwable = null
var var_$1775_value : Boolean = false
var var_$1784_changed : Boolean = false
var var_$1784_unknown : Boolean = false
var var_$1784_error : Throwable = null
var var_$1784_value : Boolean = false
var var_$1784_init : Boolean = false
var var_$1768_changed : Boolean = false
var var_$1768_unknown : Boolean = false
var var_$1768_error : Throwable = null
var var_$1768_value : Boolean = false
var var_$1768_init : Boolean = false
var var_$1779_changed : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1779_value : Boolean = false
var var_$1779_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : Boolean = false
var var_$1627_init : Boolean = false
val var_$1782_value : Boolean = false
val var_$1782_error : Throwable = null
val var_$1782_changed : Boolean = false
val var_$1782_unknown : Boolean = false
var var_$1781_changed : Boolean = true
var var_$1781_value : Boolean = true
var var_$1781_init : Boolean = true
var var_$1781_error : Throwable = null
var var_$1781_unknown : Boolean = false
var var_$1778_changed : Boolean = false
var var_$1778_unknown : Boolean = false
var var_$1778_error : Throwable = null
var var_$1778_value : Boolean = false
var var_$1778_init : Boolean = false
var var_$1786_changed : Boolean = true
var var_$1786_value : Boolean = false
var var_$1786_init : Boolean = true
var var_$1786_error : Throwable = null
var var_$1786_unknown : Boolean = false
var var_$1783_changed : Boolean = false
var var_$1783_unknown : Boolean = false
var var_$1783_error : Throwable = null
var var_$1783_value : Boolean = false
var var_$1783_init : Boolean = false
var var_$1777_changed : Boolean = false
var var_$1777_unknown : Boolean = false
var var_$1777_error : Throwable = null
var var_$1777_value : Boolean = false
var var_$1777_init : Boolean = false
var var_isFinalFalse$1774_changed : Boolean = false
var var_isFinalFalse$1774_unknown : Boolean = false
var var_isFinalFalse$1774_error : Throwable = null
var var_isFinalFalse$1774_value : Boolean = false
var var_isFinalFalseReset$1798_changed : Boolean = true
var var_isFinalFalseReset$1798_lastValue : Boolean = false
var var_isFinalFalseReset$1798_lastInit : Boolean = false
var var_isFinalFalseReset$1798_lastError : Throwable = null
var var_isFinalFalseReset$1798_value : Boolean = false
var var_isFinalFalseReset$1798_init : Boolean = true
var var_isFinalFalseReset$1798_ts : Long = 0L
var var_isFinalFalseReset$1798_error : Throwable = null
var var_isFinalFalseReset$1798_unknown : Boolean = false
var var_prev$1772_changed : Boolean = false
var var_prev$1772_init : Boolean = false
var var_prev$1772_unknown : Boolean = false
var var_prev$1772_error : Throwable = null
var var_prev$1772_value : Boolean = false
var var_$1771_changed : Boolean = false
var var_$1771_unknown : Boolean = false
var var_$1771_error : Throwable = null
var var_$1771_value : Boolean = false
var var_$1771_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_$1788_changed : Boolean = false
var var_$1788_value : Long = 0L
var var_$1788_init : Boolean = false
var var_$1788_unknown : Boolean = false
var var_$1788_error : Throwable = null
var var_$1789_changed : Boolean = false
var var_$1789_init : Boolean = false
var var_$1789_unknown : Boolean = false
var var_$1789_error : Throwable = null
var var_$1789_value : Long = 0L
var var_finalFalseSince$1625_changed : Boolean = false
var var_finalFalseSince$1625_unknown : Boolean = false
var var_finalFalseSince$1625_error : Throwable = null
var var_finalFalseSince$1625_value : Long = 0L
var var_$1790_changed : Boolean = true
var var_$1790_lastValue : Long = 0L
var var_$1790_lastInit : Boolean = false
var var_$1790_lastError : Throwable = null
var var_$1790_value : Long = 9223372036854775807L
var var_$1790_init : Boolean = true
var var_$1790_ts : Long = 0L
var var_$1790_error : Throwable = null
var var_$1790_unknown : Boolean = false
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
var var_$1776_changed : Boolean = false
var var_$1776_lastValue : Boolean = false
var var_$1776_lastInit : Boolean = false
var var_$1776_lastError : Throwable = null
var var_$1776_init : Boolean = false
var var_$1776_ts : Long = 0L
var var_$1776_unknown : Boolean = false
var var_$1776_value : Boolean = false
var var_$1776_error : Throwable = null
var var_stillFulfillableReset$1619_changed : Boolean = false
var var_stillFulfillableReset$1619_unknown : Boolean = false
var var_stillFulfillableReset$1619_error : Throwable = null
var var_stillFulfillableReset$1619_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1619_init : Boolean = false
var var_value$1803_changed : Boolean = false
var var_value$1803_unknown : Boolean = false
var var_value$1803_error : Throwable = null
var var_value$1803_value : Boolean = false
var var_value$1803_init : Boolean = false
var var_$1849_changed : Boolean = false
var var_$1849_unknown : Boolean = false
var var_$1849_error : Throwable = null
var var_$1849_value : Long = 0L
var var_$1849_init : Boolean = false
var var_$1846_changed : Boolean = true
var var_$1846_value : Long = -1L
var var_$1846_init : Boolean = true
var var_$1846_error : Throwable = null
var var_$1846_unknown : Boolean = false
var var_$1848_changed : Boolean = false
var var_$1848_unknown : Boolean = false
var var_$1848_error : Throwable = null
var var_$1848_value : Long = 0L
var var_$1848_init : Boolean = false
var var_$1840_changed : Boolean = false
var var_$1840_unknown : Boolean = false
var var_$1840_error : Throwable = null
var var_$1840_value : Long = 0L
var var_$1840_init : Boolean = false
var var_$1840_ts : Long = 0L
var var_$1868_changed : Boolean = false
var var_$1868_value : Long = 0L
var var_$1868_init : Boolean = false
var var_$1868_unknown : Boolean = false
var var_$1868_error : Throwable = null
var var_$1839_changed : Boolean = false
var var_$1839_unknown : Boolean = false
var var_$1839_error : Throwable = null
var var_$1839_value : Boolean = false
var var_$1839_init : Boolean = false
var var_$1865_changed : Boolean = false
var var_$1865_unknown : Boolean = false
var var_$1865_error : Throwable = null
var var_$1865_value : Long = 0L
var var_$1865_init : Boolean = false
var var_$1821_changed : Boolean = false
var var_$1821_unknown : Boolean = false
var var_$1821_error : Throwable = null
var var_$1821_value : Long = 0L
var var_final$1618_changed : Boolean = false
var var_final$1618_unknown : Boolean = false
var var_final$1618_error : Throwable = null
var var_final$1618_value : Boolean = false
var var_final$1618_init : Boolean = false
var var_safeDelay$1755_nextTs : Long = -1L



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

if (((var_safeDelay$1755_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1755_nextTs))) {
currTs = var_safeDelay$1755_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1649_changed = false
if ((var_source_changed)) {
var_$1649_value = var_source_ts
var_$1649_init = true
var_$1649_unknown = var_source_unknown
if ((var_$1649_unknown)) {
var_$1649_error = var_source_error
} else {
var_$1649_error = null
}
var_$1649_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1648_changed = false
}
if ((var_$1649_changed)) {
var_defaultTime$1648_value = var_$1649_value
var_defaultTime$1648_init = true
var_defaultTime$1648_error = var_$1649_error
var_defaultTime$1648_changed = true
var_defaultTime$1648_unknown = var_$1649_unknown
}
var_$1728_changed = false
if ((var_target_changed)) {
var_$1728_value = var_target_ts
var_$1728_unknown = var_target_unknown
if ((var_$1728_unknown)) {
var_$1728_error = var_target_error
} else {
var_$1728_error = null
}
var_$1728_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1650_changed = false
}
if ((var_$1728_changed)) {
var_defaultTime$1650_value = var_$1728_value
var_defaultTime$1650_init = true
var_defaultTime$1650_error = var_$1728_error
var_defaultTime$1650_changed = true
var_defaultTime$1650_unknown = var_$1728_unknown
}
var_$1636_changed = false
if ((var_defaultTime$1648_init && var_defaultTime$1650_init)) {
if ((var_defaultTime$1648_changed) || (var_defaultTime$1650_changed)) {
var_$1636_unknown = (var_defaultTime$1648_unknown && var_defaultTime$1650_unknown)
if ((var_$1636_unknown)) {
var_$1636_error = UnknownEventError(null)
} else {
var_$1636_error = null
try {
var_$1636_value = ((if((var_defaultTime$1648_error == null)) {var_defaultTime$1648_value} else {throw var_defaultTime$1648_error}) <= (if((var_defaultTime$1650_error == null)) {var_defaultTime$1650_value} else {throw var_defaultTime$1650_error}))
} catch {
case var_err : Throwable => {
var_$1636_error = var_err
}
}
}
var_$1636_init = true
var_$1636_changed = true
}
}
var_unfinishedSourceTimesNewSource$1647_changed = false
if ((var_defaultTime$1648_init && var_defaultTime$1650_init)) {
if ((var_defaultTime$1648_changed) || (var_defaultTime$1650_changed)) {
var_unfinishedSourceTimesNewSource$1647_unknown = (var_defaultTime$1648_unknown && var_defaultTime$1650_unknown)
if ((var_unfinishedSourceTimesNewSource$1647_unknown)) {
var_unfinishedSourceTimesNewSource$1647_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesNewSource$1647_error = null
try {
var_unfinishedSourceTimesNewSource$1647_value = ((if((var_defaultTime$1648_error == null)) {var_defaultTime$1648_value} else {throw var_defaultTime$1648_error}) >= (if((var_defaultTime$1650_error == null)) {var_defaultTime$1650_value} else {throw var_defaultTime$1650_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesNewSource$1647_error = var_err
}
}
}
var_unfinishedSourceTimesNewSource$1647_init = true
var_unfinishedSourceTimesNewSource$1647_changed = true
}
}
var_$1684_changed = false
if ((var_source_changed)) {
if ((var_source_unknown)) {
var_$1684_error = UnknownEventError(var_source_error)
} else {
var_$1684_error = null
}
var_$1684_changed = var_source_changed
var_$1684_unknown = var_source_unknown
}
var_$1669_changed = false
if ((var_target_changed)) {
if ((var_target_unknown)) {
var_$1669_error = UnknownEventError(var_target_error)
} else {
var_$1669_error = null
}
var_$1669_changed = var_target_changed
var_$1669_unknown = var_target_unknown
}
var_mergeUnit2$1752_changed = false
if ((var_$1684_changed) || (var_$1669_changed)) {
var_mergeUnit2$1752_ts = currTs
var_mergeUnit2$1752_changed = true
var_mergeUnit2$1752_unknown = (var_$1684_unknown && var_$1669_unknown)
if ((var_$1684_changed)) {
var_mergeUnit2$1752_error = var_$1684_error
} else {
if ((var_$1669_changed)) {
var_mergeUnit2$1752_error = var_$1669_error
}
}
}
var_$1654_changed = false
if ((var_mergeUnit2$1752_changed)) {
if ((var_$1632_ts == currTs && var_$1632_lastInit) || (!(var_$1632_ts == currTs) && var_$1632_init)) {
var_$1654_changed = true
var_$1654_unknown = var_mergeUnit2$1752_unknown
if ((var_$1654_unknown)) {
var_$1654_error = var_mergeUnit2$1752_error
} else {
if ((var_$1632_ts == currTs)) {
var_$1654_value = var_$1632_lastValue
var_$1654_error = var_$1632_lastError
} else {
var_$1654_value = var_$1632_value
var_$1654_error = var_$1632_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1653_changed = false
}
if ((var_$1654_changed)) {
var_$1653_value = var_$1654_value
var_$1653_init = true
var_$1653_error = var_$1654_error
var_$1653_changed = true
var_$1653_unknown = var_$1654_unknown
}
var_unfinishedSourceTimesNewSource$1652_changed = false
if ((var_$1653_init && var_$1649_init)) {
if ((var_$1653_changed) || (var_$1649_changed)) {
var_unfinishedSourceTimesNewSource$1652_unknown = (var_$1653_unknown && var_$1649_unknown)
if ((var_unfinishedSourceTimesNewSource$1652_unknown)) {
var_unfinishedSourceTimesNewSource$1652_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesNewSource$1652_error = null
try {
var_unfinishedSourceTimesNewSource$1652_value = ((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}) :+ (if((var_$1649_error == null)) {var_$1649_value} else {throw var_$1649_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesNewSource$1652_error = var_err
}
}
}
var_unfinishedSourceTimesNewSource$1652_init = true
var_unfinishedSourceTimesNewSource$1652_changed = true
}
}
var_$1689_changed = false
if ((var_unfinishedSourceTimesNewSource$1647_init && var_unfinishedSourceTimesNewSource$1652_init && var_$1653_init)) {
if ((var_unfinishedSourceTimesNewSource$1647_changed) || (var_unfinishedSourceTimesNewSource$1652_changed) || (var_$1653_changed)) {
var_$1689_unknown = (var_unfinishedSourceTimesNewSource$1647_unknown && var_unfinishedSourceTimesNewSource$1652_unknown && var_$1653_unknown)
if ((var_$1689_unknown)) {
var_$1689_error = UnknownEventError(null)
} else {
var_$1689_error = null
try {
var_$1689_value = (if ((if((var_unfinishedSourceTimesNewSource$1647_error == null)) {var_unfinishedSourceTimesNewSource$1647_value} else {throw var_unfinishedSourceTimesNewSource$1647_error})) (if((var_unfinishedSourceTimesNewSource$1652_error == null)) {var_unfinishedSourceTimesNewSource$1652_value} else {throw var_unfinishedSourceTimesNewSource$1652_error}) else (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}))
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
var_$1645_changed = false
if ((var_$1689_init)) {
if ((var_$1689_changed)) {
var_$1645_unknown = (var_$1689_unknown)
if ((var_$1645_unknown)) {
var_$1645_error = UnknownEventError(null)
} else {
var_$1645_error = null
try {
var_$1645_value = (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}).size
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
if ((!(currTs == 0L))) {
var_$1704_changed = false
}
if ((var_$1845_changed)) {
var_$1704_value = var_$1845_value
var_$1704_init = true
var_$1704_error = var_$1845_error
var_$1704_changed = true
var_$1704_unknown = var_$1845_unknown
}
var_unfinishedSourceTimesAfterReset$1644_changed = false
if ((var_$1645_init && var_$1704_init)) {
if ((var_$1645_changed) || (var_$1704_changed)) {
var_unfinishedSourceTimesAfterReset$1644_unknown = (var_$1645_unknown && var_$1704_unknown)
if ((var_unfinishedSourceTimesAfterReset$1644_unknown)) {
var_unfinishedSourceTimesAfterReset$1644_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesAfterReset$1644_error = null
try {
var_unfinishedSourceTimesAfterReset$1644_value = ((if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error}) != (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesAfterReset$1644_error = var_err
}
}
}
var_unfinishedSourceTimesAfterReset$1644_init = true
var_unfinishedSourceTimesAfterReset$1644_changed = true
}
}
var_$1677_changed = false
if ((var_$1689_init)) {
if ((var_$1689_changed)) {
var_$1677_unknown = (var_$1689_unknown)
if ((var_$1677_unknown)) {
var_$1677_error = UnknownEventError(null)
} else {
var_$1677_error = null
try {
var_$1677_value = (var_head$1679.apply(((if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
var_$1680_changed = false
}
if ((var_$1845_changed)) {
var_$1680_value = var_$1845_value
var_$1680_init = true
var_$1680_error = var_$1845_error
var_$1680_changed = true
var_$1680_unknown = var_$1845_unknown
}
var_$1676_changed = false
if ((var_$1677_init && var_$1680_init)) {
if ((var_$1677_changed) || (var_$1680_changed)) {
var_$1676_unknown = (var_$1677_unknown && var_$1680_unknown)
if ((var_$1676_unknown)) {
var_$1676_error = UnknownEventError(null)
} else {
var_$1676_error = null
try {
var_$1676_value = ((if((var_$1677_error == null)) {var_$1677_value} else {throw var_$1677_error}) + (if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
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
var_$1682_changed = false
if ((var_mergeUnit2$1752_changed)) {
var_$1682_value = var_mergeUnit2$1752_ts
var_$1682_init = true
var_$1682_unknown = var_mergeUnit2$1752_unknown
if ((var_$1682_unknown)) {
var_$1682_error = var_mergeUnit2$1752_error
} else {
var_$1682_error = null
}
var_$1682_changed = true
}
var_$1675_changed = false
if ((var_$1676_init && var_$1682_init)) {
if ((var_$1676_changed) || (var_$1682_changed)) {
var_$1675_unknown = (var_$1676_unknown && var_$1682_unknown)
if ((var_$1675_unknown)) {
var_$1675_error = UnknownEventError(null)
} else {
var_$1675_error = null
try {
var_$1675_value = ((if((var_$1676_error == null)) {var_$1676_value} else {throw var_$1676_error}) < (if((var_$1682_error == null)) {var_$1682_value} else {throw var_$1682_error}))
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
if ((!(currTs == 0L))) {
var_$1853_changed = false
}
if ((var_$1845_changed)) {
var_$1853_value = var_$1845_value
var_$1853_init = true
var_$1853_error = var_$1845_error
var_$1853_changed = true
var_$1853_unknown = var_$1845_unknown
}
var_$1690_changed = false
if ((var_$1682_init && var_$1853_init)) {
if ((var_$1682_changed) || (var_$1853_changed)) {
var_$1690_unknown = (var_$1682_unknown && var_$1853_unknown)
if ((var_$1690_unknown)) {
var_$1690_error = UnknownEventError(null)
} else {
var_$1690_error = null
try {
var_$1690_value = ((if((var_$1682_error == null)) {var_$1682_value} else {throw var_$1682_error}) - (if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}))
} catch {
case var_err : Throwable => {
var_$1690_error = var_err
}
}
}
var_$1690_init = true
var_$1690_changed = true
}
}
var_$1688_changed = false
if ((var_$1689_init && var_$1690_init)) {
if ((var_$1689_changed) || (var_$1690_changed)) {
var_$1688_unknown = (var_$1689_unknown && var_$1690_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = var_removeItemsSmallerThanAFromListFront$1699.apply((if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}), (if((var_$1690_error == null)) {var_$1690_value} else {throw var_$1690_error}))
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
var_unfinishedSourceTimesAfterReset$1674_changed = false
if ((var_$1675_init && var_$1688_init && var_$1689_init)) {
if ((var_$1675_changed) || (var_$1688_changed) || (var_$1689_changed)) {
var_unfinishedSourceTimesAfterReset$1674_unknown = (var_$1675_unknown && var_$1688_unknown && var_$1689_unknown)
if ((var_unfinishedSourceTimesAfterReset$1674_unknown)) {
var_unfinishedSourceTimesAfterReset$1674_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesAfterReset$1674_error = null
try {
var_unfinishedSourceTimesAfterReset$1674_value = (if ((if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error})) (if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}) else (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesAfterReset$1674_error = var_err
}
}
}
var_unfinishedSourceTimesAfterReset$1674_init = true
var_unfinishedSourceTimesAfterReset$1674_changed = true
}
}
if ((!(currTs == 0L))) {
var_unfinishedSourceTimesAfterReset$1701_changed = false
}
if ((var_$1734_changed)) {
var_unfinishedSourceTimesAfterReset$1701_value = var_$1734_value
var_unfinishedSourceTimesAfterReset$1701_init = true
var_unfinishedSourceTimesAfterReset$1701_error = var_$1734_error
var_unfinishedSourceTimesAfterReset$1701_changed = true
var_unfinishedSourceTimesAfterReset$1701_unknown = var_$1734_unknown
}
var_$1643_changed = false
if ((var_unfinishedSourceTimesAfterReset$1644_init && var_unfinishedSourceTimesAfterReset$1674_init && var_unfinishedSourceTimesAfterReset$1701_init)) {
if ((var_unfinishedSourceTimesAfterReset$1644_changed) || (var_unfinishedSourceTimesAfterReset$1674_changed) || (var_unfinishedSourceTimesAfterReset$1701_changed)) {
var_$1643_unknown = (var_unfinishedSourceTimesAfterReset$1644_unknown && var_unfinishedSourceTimesAfterReset$1674_unknown && var_unfinishedSourceTimesAfterReset$1701_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = (if ((if((var_unfinishedSourceTimesAfterReset$1644_error == null)) {var_unfinishedSourceTimesAfterReset$1644_value} else {throw var_unfinishedSourceTimesAfterReset$1644_error})) (if((var_unfinishedSourceTimesAfterReset$1674_error == null)) {var_unfinishedSourceTimesAfterReset$1674_value} else {throw var_unfinishedSourceTimesAfterReset$1674_error}) else (if((var_unfinishedSourceTimesAfterReset$1701_error == null)) {var_unfinishedSourceTimesAfterReset$1701_value} else {throw var_unfinishedSourceTimesAfterReset$1701_error}))
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
var_$1642_changed = false
if ((var_$1643_init)) {
if ((var_$1643_changed)) {
var_$1642_unknown = (var_$1643_unknown)
if ((var_$1642_unknown)) {
var_$1642_error = UnknownEventError(null)
} else {
var_$1642_error = null
try {
var_$1642_value = (if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}).size
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
var_$1641_changed = false
if ((var_$1642_init && var_$1704_init)) {
if ((var_$1642_changed) || (var_$1704_changed)) {
var_$1641_unknown = (var_$1642_unknown && var_$1704_unknown)
if ((var_$1641_unknown)) {
var_$1641_error = UnknownEventError(null)
} else {
var_$1641_error = null
try {
var_$1641_value = ((if((var_$1642_error == null)) {var_$1642_value} else {throw var_$1642_error}) > (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
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
var_$1635_changed = false
if ((var_$1636_init && var_$1641_init)) {
if ((var_$1636_changed) || (var_$1641_changed)) {
var_$1635_unknown = (var_$1636_unknown && var_$1641_unknown)
if ((var_$1635_unknown)) {
var_$1635_error = UnknownEventError(null)
} else {
var_$1635_error = null
try {
var_$1635_value = ((if((var_$1636_error == null)) {var_$1636_value} else {throw var_$1636_error}) && (if((var_$1641_error == null)) {var_$1641_value} else {throw var_$1641_error}))
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
var_$1708_changed = false
if ((var_$1643_init)) {
if ((var_$1643_changed)) {
var_$1708_unknown = (var_$1643_unknown)
if ((var_$1708_unknown)) {
var_$1708_error = UnknownEventError(null)
} else {
var_$1708_error = null
try {
var_$1708_value = (var_head$1679.apply(((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
var_$1707_changed = false
if ((var_$1708_init && var_$1853_init)) {
if ((var_$1708_changed) || (var_$1853_changed)) {
var_$1707_unknown = (var_$1708_unknown && var_$1853_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = ((if((var_$1708_error == null)) {var_$1708_value} else {throw var_$1708_error}) + (if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}))
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
var_$1706_changed = false
if ((var_$1707_init && var_defaultTime$1650_init)) {
if ((var_$1707_changed) || (var_defaultTime$1650_changed)) {
var_$1706_unknown = (var_$1707_unknown && var_defaultTime$1650_unknown)
if ((var_$1706_unknown)) {
var_$1706_error = UnknownEventError(null)
} else {
var_$1706_error = null
try {
var_$1706_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) <= (if((var_defaultTime$1650_error == null)) {var_defaultTime$1650_value} else {throw var_defaultTime$1650_error}))
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
var_$1634_changed = false
if ((var_$1635_init && var_$1706_init)) {
if ((var_$1635_changed) || (var_$1706_changed)) {
var_$1634_unknown = (var_$1635_unknown && var_$1706_unknown)
if ((var_$1634_unknown)) {
var_$1634_error = UnknownEventError(null)
} else {
var_$1634_error = null
try {
var_$1634_value = ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error}) && (if((var_$1706_error == null)) {var_$1706_value} else {throw var_$1706_error}))
} catch {
case var_err : Throwable => {
var_$1634_error = var_err
}
}
}
var_$1634_init = true
var_$1634_changed = true
}
}
var_$1714_changed = false
if ((var_$1707_init && var_defaultTime$1650_init)) {
if ((var_$1707_changed) || (var_defaultTime$1650_changed)) {
var_$1714_unknown = (var_$1707_unknown && var_defaultTime$1650_unknown)
if ((var_$1714_unknown)) {
var_$1714_error = UnknownEventError(null)
} else {
var_$1714_error = null
try {
var_$1714_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) >= (if((var_defaultTime$1650_error == null)) {var_defaultTime$1650_value} else {throw var_defaultTime$1650_error}))
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
var_unfinishedSourceTimes$1633_changed = false
if ((var_$1634_init && var_$1714_init)) {
if ((var_$1634_changed) || (var_$1714_changed)) {
var_unfinishedSourceTimes$1633_unknown = (var_$1634_unknown && var_$1714_unknown)
if ((var_unfinishedSourceTimes$1633_unknown)) {
var_unfinishedSourceTimes$1633_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimes$1633_error = null
try {
var_unfinishedSourceTimes$1633_value = ((if((var_$1634_error == null)) {var_$1634_value} else {throw var_$1634_error}) && (if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimes$1633_error = var_err
}
}
}
var_unfinishedSourceTimes$1633_init = true
var_unfinishedSourceTimes$1633_changed = true
}
}
var_$1726_changed = false
if ((var_defaultTime$1650_init && var_$1853_init)) {
if ((var_defaultTime$1650_changed) || (var_$1853_changed)) {
var_$1726_unknown = (var_defaultTime$1650_unknown && var_$1853_unknown)
if ((var_$1726_unknown)) {
var_$1726_error = UnknownEventError(null)
} else {
var_$1726_error = null
try {
var_$1726_value = ((if((var_defaultTime$1650_error == null)) {var_defaultTime$1650_value} else {throw var_defaultTime$1650_error}) - (if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}))
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
var_$1861_changed = false
}
if ((var_$1845_changed)) {
var_$1861_value = var_$1845_value
var_$1861_init = true
var_$1861_error = var_$1845_error
var_$1861_changed = true
var_$1861_unknown = var_$1845_unknown
}
var_$1725_changed = false
if ((var_$1726_init && var_$1861_init)) {
if ((var_$1726_changed) || (var_$1861_changed)) {
var_$1725_unknown = (var_$1726_unknown && var_$1861_unknown)
if ((var_$1725_unknown)) {
var_$1725_error = UnknownEventError(null)
} else {
var_$1725_error = null
try {
var_$1725_value = ((if((var_$1726_error == null)) {var_$1726_value} else {throw var_$1726_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
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
var_$1723_changed = false
if ((var_$1643_init && var_$1725_init)) {
if ((var_$1643_changed) || (var_$1725_changed)) {
var_$1723_unknown = (var_$1643_unknown && var_$1725_unknown)
if ((var_$1723_unknown)) {
var_$1723_error = UnknownEventError(null)
} else {
var_$1723_error = null
try {
var_$1723_value = var_removeItemsSmallerThanAFromListFront$1699.apply((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}), (if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}))
} catch {
case var_err : Throwable => {
var_$1723_error = var_err
}
}
}
var_$1723_changed = true
}
}
var_unfinishedSourceTimes$1722_changed = false
if ((var_$1723_changed) || (var_unfinishedSourceTimesAfterReset$1701_changed)) {
var_unfinishedSourceTimes$1722_init = true
var_unfinishedSourceTimes$1722_changed = true
var_unfinishedSourceTimes$1722_unknown = (var_$1723_unknown && var_unfinishedSourceTimesAfterReset$1701_unknown)
if ((var_$1723_changed)) {
var_unfinishedSourceTimes$1722_value = var_$1723_value
var_unfinishedSourceTimes$1722_error = var_$1723_error
} else {
if ((var_unfinishedSourceTimesAfterReset$1701_changed)) {
var_unfinishedSourceTimes$1722_value = var_unfinishedSourceTimesAfterReset$1701_value
var_unfinishedSourceTimes$1722_error = var_unfinishedSourceTimesAfterReset$1701_error
}
}
}
var_unfinishedSourceTimes$1736_changed = false
if ((var_$1643_changed) || (var_unfinishedSourceTimesAfterReset$1701_changed)) {
var_unfinishedSourceTimes$1736_init = true
var_unfinishedSourceTimes$1736_changed = true
var_unfinishedSourceTimes$1736_unknown = (var_$1643_unknown && var_unfinishedSourceTimesAfterReset$1701_unknown)
if ((var_$1643_changed)) {
var_unfinishedSourceTimes$1736_value = var_$1643_value
var_unfinishedSourceTimes$1736_error = var_$1643_error
} else {
if ((var_unfinishedSourceTimesAfterReset$1701_changed)) {
var_unfinishedSourceTimes$1736_value = var_unfinishedSourceTimesAfterReset$1701_value
var_unfinishedSourceTimes$1736_error = var_unfinishedSourceTimesAfterReset$1701_error
}
}
}
var_$1632_changed = false
if ((var_unfinishedSourceTimes$1633_init && var_unfinishedSourceTimes$1722_init && var_unfinishedSourceTimes$1736_init)) {
if ((var_unfinishedSourceTimes$1633_changed) || (var_unfinishedSourceTimes$1722_changed) || (var_unfinishedSourceTimes$1736_changed)) {
var_$1632_lastValue = var_$1632_value
var_$1632_lastInit = var_$1632_init
var_$1632_lastError = var_$1632_error
var_$1632_unknown = (var_unfinishedSourceTimes$1633_unknown && var_unfinishedSourceTimes$1722_unknown && var_unfinishedSourceTimes$1736_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = (if ((if((var_unfinishedSourceTimes$1633_error == null)) {var_unfinishedSourceTimes$1633_value} else {throw var_unfinishedSourceTimes$1633_error})) (if((var_unfinishedSourceTimes$1722_error == null)) {var_unfinishedSourceTimes$1722_value} else {throw var_unfinishedSourceTimes$1722_error}) else (if((var_unfinishedSourceTimes$1736_error == null)) {var_unfinishedSourceTimes$1736_value} else {throw var_unfinishedSourceTimes$1736_error}))
} catch {
case var_err : Throwable => {
var_$1632_error = var_err
}
}
}
var_$1632_init = true
var_$1632_ts = currTs
var_$1632_changed = true
}
}
var_$1631_changed = false
if ((var_$1632_init)) {
if ((var_$1632_changed)) {
var_$1631_unknown = (var_$1632_unknown)
if ((var_$1631_unknown)) {
var_$1631_error = UnknownEventError(null)
} else {
var_$1631_error = null
try {
var_$1631_value = (if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}).size
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
var_$1841_changed = false
if ((var_$1631_init && var_$1704_init)) {
if ((var_$1631_changed) || (var_$1704_changed)) {
var_$1841_unknown = (var_$1631_unknown && var_$1704_unknown)
if ((var_$1841_unknown)) {
var_$1841_error = UnknownEventError(null)
} else {
var_$1841_error = null
try {
var_$1841_value = ((if((var_$1631_error == null)) {var_$1631_value} else {throw var_$1631_error}) == (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
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
var_$1743_changed = false
}
if ((var_$1765_changed)) {
var_$1743_value = var_$1765_value
var_$1743_init = true
var_$1743_error = var_$1765_error
var_$1743_changed = true
var_$1743_unknown = var_$1765_unknown
}
var_$1750_changed = false
if ((var_mergeUnit2$1752_changed)) {
if ((var_mergeUnit2$1752_unknown)) {
var_$1750_error = UnknownEventError(var_mergeUnit2$1752_error)
} else {
var_$1750_error = null
}
var_$1750_changed = var_mergeUnit2$1752_changed
var_$1750_unknown = var_mergeUnit2$1752_unknown
}
var_safeDelay$1755_changed = false
if ((var_safeDelay$1755_nextTs == currTs)) {
var_safeDelay$1755_changed = true
var_safeDelay$1755_unknown = false
}
var_$1753_changed = false
if ((var_safeDelay$1755_changed)) {
if ((var_safeDelay$1755_unknown)) {
var_$1753_error = UnknownEventError(var_safeDelay$1755_error)
} else {
var_$1753_error = null
}
var_$1753_changed = var_safeDelay$1755_changed
var_$1753_unknown = var_safeDelay$1755_unknown
}
var_mergeUnit2$1749_changed = false
if ((var_$1750_changed) || (var_$1753_changed)) {
var_mergeUnit2$1749_ts = currTs
var_mergeUnit2$1749_changed = true
var_mergeUnit2$1749_unknown = (var_$1750_unknown && var_$1753_unknown)
if ((var_$1750_changed)) {
var_mergeUnit2$1749_error = var_$1750_error
} else {
if ((var_$1753_changed)) {
var_mergeUnit2$1749_error = var_$1753_error
}
}
}
var_$1748_changed = false
if ((var_mergeUnit2$1749_changed)) {
var_$1748_value = var_mergeUnit2$1749_ts
var_$1748_init = true
var_$1748_unknown = var_mergeUnit2$1749_unknown
if ((var_$1748_unknown)) {
var_$1748_error = var_mergeUnit2$1749_error
} else {
var_$1748_error = null
}
var_$1748_changed = true
}
var_$1851_changed = false
if ((var_$1632_init)) {
if ((var_$1632_changed)) {
var_$1851_unknown = (var_$1632_unknown)
if ((var_$1851_unknown)) {
var_$1851_error = UnknownEventError(null)
} else {
var_$1851_error = null
try {
var_$1851_value = (var_head$1679.apply(((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
var_$1756_changed = false
if ((var_$1851_init && var_$1853_init)) {
if ((var_$1851_changed) || (var_$1853_changed)) {
var_$1756_unknown = (var_$1851_unknown && var_$1853_unknown)
if ((var_$1756_unknown)) {
var_$1756_error = UnknownEventError(null)
} else {
var_$1756_error = null
try {
var_$1756_value = ((if((var_$1851_error == null)) {var_$1851_value} else {throw var_$1851_error}) + (if((var_$1853_error == null)) {var_$1853_value} else {throw var_$1853_error}))
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
var_$1747_changed = false
if ((var_$1748_init && var_$1756_init)) {
if ((var_$1748_changed) || (var_$1756_changed)) {
var_$1747_unknown = (var_$1748_unknown && var_$1756_unknown)
if ((var_$1747_unknown)) {
var_$1747_error = UnknownEventError(null)
} else {
var_$1747_error = null
try {
var_$1747_value = ((if((var_$1748_error == null)) {var_$1748_value} else {throw var_$1748_error}) <= (if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error}))
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
if ((!(currTs == 0L))) {
var_$1761_changed = false
}
if ((var_$1765_changed)) {
var_$1761_value = var_$1765_value
var_$1761_init = true
var_$1761_error = var_$1765_error
var_$1761_changed = true
var_$1761_unknown = var_$1765_unknown
}
if ((!(currTs == 0L))) {
var_$1764_changed = false
}
if ((var_$1765_changed)) {
var_$1764_value = var_$1765_value
var_$1764_init = true
var_$1764_error = var_$1765_error
var_$1764_changed = true
var_$1764_unknown = var_$1765_unknown
}
var_$1746_changed = false
if ((var_$1747_init && var_$1761_init && var_$1764_init)) {
if ((var_$1747_changed) || (var_$1761_changed) || (var_$1764_changed)) {
var_$1746_unknown = (var_$1747_unknown && var_$1761_unknown && var_$1764_unknown)
if ((var_$1746_unknown)) {
var_$1746_error = UnknownEventError(null)
} else {
var_$1746_error = null
try {
var_$1746_value = (if ((if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error})) (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}) else (if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}))
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
var_$1629_changed = false
if ((var_$1841_init && var_$1743_init && var_$1746_init)) {
if ((var_$1841_changed) || (var_$1743_changed) || (var_$1746_changed)) {
var_$1629_unknown = (var_$1841_unknown && var_$1743_unknown && var_$1746_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = (if ((if((var_$1841_error == null)) {var_$1841_value} else {throw var_$1841_error})) (if((var_$1743_error == null)) {var_$1743_value} else {throw var_$1743_error}) else (if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}))
} catch {
case var_err : Throwable => {
var_$1629_error = var_err
}
}
}
var_$1629_init = true
var_$1629_ts = currTs
var_$1629_changed = true
}
}
var_$1775_changed = false
if ((var_$1629_changed)) {
if ((var_$1776_ts == currTs && var_$1776_lastInit) || (!(var_$1776_ts == currTs) && var_$1776_init)) {
var_$1775_changed = true
var_$1775_init = true
var_$1775_unknown = var_$1629_unknown
if ((var_$1775_unknown)) {
var_$1775_error = var_$1629_error
} else {
if ((var_$1776_ts == currTs)) {
var_$1775_value = var_$1776_lastValue
var_$1775_error = var_$1776_lastError
} else {
var_$1775_value = var_$1776_value
var_$1775_error = var_$1776_error
}
}
}
}
var_$1784_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1784_unknown = (var_$1629_unknown)
if ((var_$1784_unknown)) {
var_$1784_error = UnknownEventError(null)
} else {
var_$1784_error = null
try {
var_$1784_value = var_$1770.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
} catch {
case var_err : Throwable => {
var_$1784_error = var_err
}
}
}
var_$1784_init = true
var_$1784_changed = true
}
}
var_$1768_changed = false
if ((var_$1784_init)) {
if ((var_$1784_changed)) {
var_$1768_unknown = (var_$1784_unknown)
if ((var_$1768_unknown)) {
var_$1768_error = UnknownEventError(null)
} else {
var_$1768_error = null
try {
var_$1768_value = !((if((var_$1784_error == null)) {var_$1784_value} else {throw var_$1784_error}))
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
var_$1779_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1779_unknown = (var_$1629_unknown)
if ((var_$1779_unknown)) {
var_$1779_error = UnknownEventError(null)
} else {
var_$1779_error = null
try {
var_$1779_value = var_$1802.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
} catch {
case var_err : Throwable => {
var_$1779_error = var_err
}
}
}
var_$1779_init = true
var_$1779_changed = true
}
}
var_$1627_changed = false
if ((var_$1779_init && var_$1768_init)) {
if ((var_$1779_changed) || (var_$1768_changed)) {
var_$1627_unknown = (var_$1779_unknown && var_$1768_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = ((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}) && (if((var_$1768_error == null)) {var_$1768_value} else {throw var_$1768_error}))
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
if ((!(currTs == 0L))) {
var_$1781_changed = false
}
if ((var_$1782_changed)) {
var_$1781_value = var_$1782_value
var_$1781_init = true
var_$1781_error = var_$1782_error
var_$1781_changed = true
var_$1781_unknown = var_$1782_unknown
}
var_$1778_changed = false
if ((var_$1779_init && var_$1781_init)) {
if ((var_$1779_changed) || (var_$1781_changed)) {
var_$1778_unknown = (var_$1779_unknown && var_$1781_unknown)
if ((var_$1778_unknown)) {
var_$1778_error = UnknownEventError(null)
} else {
var_$1778_error = null
try {
var_$1778_value = ((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}) == (if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}))
} catch {
case var_err : Throwable => {
var_$1778_error = var_err
}
}
}
var_$1778_init = true
var_$1778_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1786_changed = false
}
if ((var_$1782_changed)) {
var_$1786_value = var_$1782_value
var_$1786_init = true
var_$1786_error = var_$1782_error
var_$1786_changed = true
var_$1786_unknown = var_$1782_unknown
}
var_$1783_changed = false
if ((var_$1784_init && var_$1786_init)) {
if ((var_$1784_changed) || (var_$1786_changed)) {
var_$1783_unknown = (var_$1784_unknown && var_$1786_unknown)
if ((var_$1783_unknown)) {
var_$1783_error = UnknownEventError(null)
} else {
var_$1783_error = null
try {
var_$1783_value = ((if((var_$1784_error == null)) {var_$1784_value} else {throw var_$1784_error}) == (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1783_error = var_err
}
}
}
var_$1783_init = true
var_$1783_changed = true
}
}
var_$1777_changed = false
if ((var_$1778_init && var_$1783_init)) {
if ((var_$1778_changed) || (var_$1783_changed)) {
var_$1777_unknown = (var_$1778_unknown && var_$1783_unknown)
if ((var_$1777_unknown)) {
var_$1777_error = UnknownEventError(null)
} else {
var_$1777_error = null
try {
var_$1777_value = ((if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}) && (if((var_$1783_error == null)) {var_$1783_value} else {throw var_$1783_error}))
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
var_isFinalFalse$1774_changed = false
if ((var_$1775_init && var_$1777_init)) {
if ((var_$1775_changed) || (var_$1777_changed)) {
var_isFinalFalse$1774_unknown = (var_$1775_unknown && var_$1777_unknown)
if ((var_isFinalFalse$1774_unknown)) {
var_isFinalFalse$1774_error = UnknownEventError(null)
} else {
var_isFinalFalse$1774_error = null
try {
var_isFinalFalse$1774_value = ((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}) || (if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1774_error = var_err
}
}
}
var_isFinalFalse$1774_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$1798_changed = false
}
if ((var_isFinalFalse$1774_changed)) {
var_isFinalFalseReset$1798_lastValue = var_isFinalFalseReset$1798_value
var_isFinalFalseReset$1798_lastInit = var_isFinalFalseReset$1798_init
var_isFinalFalseReset$1798_lastError = var_isFinalFalseReset$1798_error
var_isFinalFalseReset$1798_value = var_isFinalFalse$1774_value
var_isFinalFalseReset$1798_init = true
var_isFinalFalseReset$1798_ts = currTs
var_isFinalFalseReset$1798_error = var_isFinalFalse$1774_error
var_isFinalFalseReset$1798_changed = true
var_isFinalFalseReset$1798_unknown = var_isFinalFalse$1774_unknown
}
var_prev$1772_changed = false
if ((var_isFinalFalseReset$1798_changed)) {
if ((var_isFinalFalseReset$1798_ts == currTs && var_isFinalFalseReset$1798_lastInit) || (!(var_isFinalFalseReset$1798_ts == currTs) && var_isFinalFalseReset$1798_init)) {
var_prev$1772_changed = true
var_prev$1772_init = true
var_prev$1772_unknown = var_isFinalFalseReset$1798_unknown
if ((var_prev$1772_unknown)) {
var_prev$1772_error = var_isFinalFalseReset$1798_error
} else {
if ((var_isFinalFalseReset$1798_ts == currTs)) {
var_prev$1772_value = var_isFinalFalseReset$1798_lastValue
var_prev$1772_error = var_isFinalFalseReset$1798_lastError
} else {
var_prev$1772_value = var_isFinalFalseReset$1798_value
var_prev$1772_error = var_isFinalFalseReset$1798_error
}
}
}
}
var_$1771_changed = false
if ((var_prev$1772_init)) {
if ((var_prev$1772_changed)) {
var_$1771_unknown = (var_prev$1772_unknown)
if ((var_$1771_unknown)) {
var_$1771_error = UnknownEventError(null)
} else {
var_$1771_error = null
try {
var_$1771_value = !((if((var_prev$1772_error == null)) {var_prev$1772_value} else {throw var_prev$1772_error}))
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
var_$1626_changed = false
if ((var_$1627_init && var_$1771_init)) {
if ((var_$1627_changed) || (var_$1771_changed)) {
var_$1626_unknown = (var_$1627_unknown && var_$1771_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) && (if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}))
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
var_$1788_changed = false
if ((var_$1629_changed)) {
var_$1788_value = var_$1629_ts
var_$1788_init = true
var_$1788_unknown = var_$1629_unknown
if ((var_$1788_unknown)) {
var_$1788_error = var_$1629_error
} else {
var_$1788_error = null
}
var_$1788_changed = true
}
var_$1789_changed = false
if ((var_isFinalFalseReset$1798_changed)) {
if ((var_$1790_ts == currTs && var_$1790_lastInit) || (!(var_$1790_ts == currTs) && var_$1790_init)) {
var_$1789_changed = true
var_$1789_init = true
var_$1789_unknown = var_isFinalFalseReset$1798_unknown
if ((var_$1789_unknown)) {
var_$1789_error = var_isFinalFalseReset$1798_error
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
var_finalFalseSince$1625_changed = false
if ((var_$1626_init && var_$1788_init && var_$1789_init)) {
if ((var_$1626_changed) || (var_$1788_changed) || (var_$1789_changed)) {
var_finalFalseSince$1625_unknown = (var_$1626_unknown && var_$1788_unknown && var_$1789_unknown)
if ((var_finalFalseSince$1625_unknown)) {
var_finalFalseSince$1625_error = UnknownEventError(null)
} else {
var_finalFalseSince$1625_error = null
try {
var_finalFalseSince$1625_value = (if ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error})) (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}) else (if((var_$1789_error == null)) {var_$1789_value} else {throw var_$1789_error}))
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
var_$1790_changed = false
}
if ((var_finalFalseSince$1625_changed)) {
var_$1790_lastValue = var_$1790_value
var_$1790_lastInit = var_$1790_init
var_$1790_lastError = var_$1790_error
var_$1790_value = var_finalFalseSince$1625_value
var_$1790_init = true
var_$1790_ts = currTs
var_$1790_error = var_finalFalseSince$1625_error
var_$1790_changed = true
var_$1790_unknown = var_finalFalseSince$1625_unknown
}
var_$1623_changed = false
if ((var_$1790_init && var_$1680_init)) {
if ((var_$1790_changed) || (var_$1680_changed)) {
var_$1623_unknown = (var_$1790_unknown && var_$1680_unknown)
if ((var_$1623_unknown)) {
var_$1623_error = UnknownEventError(null)
} else {
var_$1623_error = null
try {
var_$1623_value = ((if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error}) + (if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
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
if ((var_$1623_init && var_$1788_init)) {
if ((var_$1623_changed) || (var_$1788_changed)) {
var_$1622_unknown = (var_$1623_unknown && var_$1788_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1623_error == null)) {var_$1623_value} else {throw var_$1623_error}) < (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}))
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
if ((var_$1622_init && var_$1786_init && var_isFinalFalseReset$1798_init)) {
if ((var_$1622_changed) || (var_$1786_changed) || (var_isFinalFalseReset$1798_changed)) {
var_isFinalFalseReset$1621_unknown = (var_$1622_unknown && var_$1786_unknown && var_isFinalFalseReset$1798_unknown)
if ((var_isFinalFalseReset$1621_unknown)) {
var_isFinalFalseReset$1621_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1621_error = null
try {
var_isFinalFalseReset$1621_value = (if ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error})) (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}) else (if((var_isFinalFalseReset$1798_error == null)) {var_isFinalFalseReset$1798_value} else {throw var_isFinalFalseReset$1798_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1621_error = var_err
}
}
}
var_isFinalFalseReset$1621_changed = true
}
}
var_$1776_changed = false
if ((var_isFinalFalseReset$1621_changed) || (var_isFinalFalseReset$1798_changed)) {
var_$1776_lastValue = var_$1776_value
var_$1776_lastInit = var_$1776_init
var_$1776_lastError = var_$1776_error
var_$1776_init = true
var_$1776_ts = currTs
var_$1776_changed = true
var_$1776_unknown = (var_isFinalFalseReset$1621_unknown && var_isFinalFalseReset$1798_unknown)
if ((var_isFinalFalseReset$1621_changed)) {
var_$1776_value = var_isFinalFalseReset$1621_value
var_$1776_error = var_isFinalFalseReset$1621_error
} else {
if ((var_isFinalFalseReset$1798_changed)) {
var_$1776_value = var_isFinalFalseReset$1798_value
var_$1776_error = var_isFinalFalseReset$1798_error
}
}
}
var_stillFulfillableReset$1619_changed = false
if ((var_$1776_init && var_$1764_init && var_$1629_init)) {
if ((var_$1776_changed) || (var_$1764_changed) || (var_$1629_changed)) {
var_stillFulfillableReset$1619_unknown = (var_$1776_unknown && var_$1764_unknown && var_$1629_unknown)
if ((var_stillFulfillableReset$1619_unknown)) {
var_stillFulfillableReset$1619_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1619_error = null
try {
var_stillFulfillableReset$1619_value = (if ((if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error})) (if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}) else (if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1619_error = var_err
}
}
}
var_stillFulfillableReset$1619_init = true
var_stillFulfillableReset$1619_changed = true
}
}
var_value$1803_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_value$1803_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_value$1803_unknown)) {
var_value$1803_error = UnknownEventError(null)
} else {
var_value$1803_error = null
try {
var_value$1803_value = var_$1770.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
} catch {
case var_err : Throwable => {
var_value$1803_error = var_err
}
}
}
var_value$1803_init = true
var_value$1803_changed = true
}
}
var_$1849_changed = false
if ((var_$1756_init && var_$1682_init)) {
if ((var_$1756_changed) || (var_$1682_changed)) {
var_$1849_unknown = (var_$1756_unknown && var_$1682_unknown)
if ((var_$1849_unknown)) {
var_$1849_error = UnknownEventError(null)
} else {
var_$1849_error = null
try {
var_$1849_value = ((if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error}) - (if((var_$1682_error == null)) {var_$1682_value} else {throw var_$1682_error}))
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
if ((!(currTs == 0L))) {
var_$1846_changed = false
}
if ((var_$1845_changed)) {
var_$1846_value = var_$1845_value
var_$1846_init = true
var_$1846_error = var_$1845_error
var_$1846_changed = true
var_$1846_unknown = var_$1845_unknown
}
var_$1848_changed = false
if ((var_$1849_init && var_$1861_init)) {
if ((var_$1849_changed) || (var_$1861_changed)) {
var_$1848_unknown = (var_$1849_unknown && var_$1861_unknown)
if ((var_$1848_unknown)) {
var_$1848_error = UnknownEventError(null)
} else {
var_$1848_error = null
try {
var_$1848_value = ((if((var_$1849_error == null)) {var_$1849_value} else {throw var_$1849_error}) + (if((var_$1861_error == null)) {var_$1861_value} else {throw var_$1861_error}))
} catch {
case var_err : Throwable => {
var_$1848_error = var_err
}
}
}
var_$1848_init = true
var_$1848_changed = true
}
}
var_$1840_changed = false
if ((var_$1841_init && var_$1846_init && var_$1848_init)) {
if ((var_$1841_changed) || (var_$1846_changed) || (var_$1848_changed)) {
var_$1840_unknown = (var_$1841_unknown && var_$1846_unknown && var_$1848_unknown)
if ((var_$1840_unknown)) {
var_$1840_error = UnknownEventError(null)
} else {
var_$1840_error = null
try {
var_$1840_value = (if ((if((var_$1841_error == null)) {var_$1841_value} else {throw var_$1841_error})) (if((var_$1846_error == null)) {var_$1846_value} else {throw var_$1846_error}) else (if((var_$1848_error == null)) {var_$1848_value} else {throw var_$1848_error}))
} catch {
case var_err : Throwable => {
var_$1840_error = var_err
}
}
}
var_$1840_init = true
var_$1840_ts = currTs
var_$1840_changed = true
}
}
var_$1868_changed = false
if ((var_$1840_changed)) {
var_$1868_value = var_$1840_ts
var_$1868_init = true
var_$1868_unknown = var_$1840_unknown
if ((var_$1868_unknown)) {
var_$1868_error = var_$1840_error
} else {
var_$1868_error = null
}
var_$1868_changed = true
}
var_$1839_changed = false
if ((var_$1840_init && var_$1704_init)) {
if ((var_$1840_changed) || (var_$1704_changed)) {
var_$1839_unknown = (var_$1840_unknown && var_$1704_unknown)
if ((var_$1839_unknown)) {
var_$1839_error = UnknownEventError(null)
} else {
var_$1839_error = null
try {
var_$1839_value = ((if((var_$1840_error == null)) {var_$1840_value} else {throw var_$1840_error}) > (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
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
var_$1865_changed = false
if ((var_$1680_init && var_$1868_init)) {
if ((var_$1680_changed) || (var_$1868_changed)) {
var_$1865_unknown = (var_$1680_unknown && var_$1868_unknown)
if ((var_$1865_unknown)) {
var_$1865_error = UnknownEventError(null)
} else {
var_$1865_error = null
try {
var_$1865_value = ((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}) - (if((var_$1868_error == null)) {var_$1868_value} else {throw var_$1868_error}))
} catch {
case var_err : Throwable => {
var_$1865_error = var_err
}
}
}
var_$1865_init = true
var_$1865_changed = true
}
}
var_$1821_changed = false
if ((var_$1839_init && var_$1840_init && var_$1865_init)) {
if ((var_$1839_changed) || (var_$1840_changed) || (var_$1865_changed)) {
var_$1821_unknown = (var_$1839_unknown && var_$1840_unknown && var_$1865_unknown)
if ((var_$1821_unknown)) {
var_$1821_error = UnknownEventError(null)
} else {
var_$1821_error = null
try {
var_$1821_value = (if ((if((var_$1839_error == null)) {var_$1839_value} else {throw var_$1839_error})) (if((var_$1840_error == null)) {var_$1840_value} else {throw var_$1840_error}) else (if((var_$1865_error == null)) {var_$1865_value} else {throw var_$1865_error}))
} catch {
case var_err : Throwable => {
var_$1821_error = var_err
}
}
}
var_$1821_changed = true
}
}
var_final$1618_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_final$1618_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_final$1618_unknown)) {
var_final$1618_error = UnknownEventError(null)
} else {
var_final$1618_error = null
try {
var_final$1618_value = var_$1802.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
} catch {
case var_err : Throwable => {
var_final$1618_error = var_err
}
}
}
var_final$1618_init = true
var_final$1618_changed = true
}
}

if ((var_mergeUnit2$1752_unknown) || (!(var_$1821_error == null)) || (var_$1821_changed && (0L >= var_$1821_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1821_changed)) {
if ((var_safeDelay$1755_changed) || (var_mergeUnit2$1752_changed)) {
var_safeDelay$1755_nextTs = (currTs + var_$1821_value)
}
} else {
if ((var_mergeUnit2$1752_changed)) {
var_safeDelay$1755_nextTs = -1L
}
}
}
if ((var_final$1618_changed && var_final$1618_init)) {
out_final.apply(var_final$1618_value, currTs, "final", var_final$1618_error)
}
if ((var_value$1803_changed && var_value$1803_init)) {
out_value.apply(var_value$1803_value, currTs, "value", var_value$1803_error)
}
var_source_changed = false
var_target_changed = false

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
