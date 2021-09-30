//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1677 : scala.Function1[List[Any], Any] = ((var_list$1832 : List[Any]) => {
val var_$1833 : Any = var_list$1832(0L.asInstanceOf[Int])
var_$1833
})
var var_removeItemsSmallerThanAFromListFront$1697 : scala.Function2[List[Long], Long, List[Long]] = null
val var_$1829 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1862 : (Boolean, Boolean)) => {
val var_$1863 : Boolean = var_$1862._1
var_$1863
})
val var_$1812 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1860 : (Boolean, Boolean)) => {
val var_$1861 : Boolean = var_$1860._2
var_$1861
})
lazy val var_$1701 : List[Long] = List[Long]()
val var_$1727 : List[Long] = (-9223372036854775807L +: List[Long]())
val var_$1733 : (Boolean, Boolean) = (false, true)
val var_$1742 : (Boolean, Boolean) = (true, false)
val var_$1790 : (Boolean, Boolean) = (false, false)
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

var_removeItemsSmallerThanAFromListFront$1697 = ((var_list$1834 : List[Long], var_A$1835 : Long) => {
var var_$1836 : List[Long] = List[Long]()
var_$1836 = (if ((var_list$1834.size == 0L)) var_list$1834 else (if (((var_head$1677.apply((var_list$1834).asInstanceOf[List[Any]])).asInstanceOf[Long] < var_A$1835)) var_removeItemsSmallerThanAFromListFront$1697.apply(var_list$1834.tail, var_A$1835) else var_list$1834))
var_$1836
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
var var_$1647_changed : Boolean = false
var var_$1647_value : Long = 0L
var var_$1647_init : Boolean = false
var var_$1647_unknown : Boolean = false
var var_$1647_error : Throwable = null
var var_defaultTime$1634_changed : Boolean = true
var var_defaultTime$1634_value : Long = -1L
var var_defaultTime$1634_init : Boolean = true
var var_defaultTime$1634_error : Throwable = null
var var_defaultTime$1634_unknown : Boolean = false
var var_$1764_changed : Boolean = false
var var_$1764_value : Long = 0L
var var_$1764_unknown : Boolean = false
var var_$1764_error : Throwable = null
var var_defaultTime$1771_changed : Boolean = true
var var_defaultTime$1771_value : Long = -1L
var var_defaultTime$1771_init : Boolean = true
var var_defaultTime$1771_error : Throwable = null
var var_defaultTime$1771_unknown : Boolean = false
var var_unfinishedSourceTimes$1633_changed : Boolean = false
var var_unfinishedSourceTimes$1633_unknown : Boolean = false
var var_unfinishedSourceTimes$1633_error : Throwable = null
var var_unfinishedSourceTimes$1633_value : Boolean = false
var var_unfinishedSourceTimes$1633_init : Boolean = false
var var_unfinishedSourceTimesNewSource$1645_changed : Boolean = false
var var_unfinishedSourceTimesNewSource$1645_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1645_error : Throwable = null
var var_unfinishedSourceTimesNewSource$1645_value : Boolean = false
var var_unfinishedSourceTimesNewSource$1645_init : Boolean = false
var var_$1655_changed : Boolean = false
var var_$1655_error : Throwable = null
var var_$1655_unknown : Boolean = false
var var_$1886_changed : Boolean = false
var var_$1886_error : Throwable = null
var var_$1886_unknown : Boolean = false
var var_mergeUnit2$1664_changed : Boolean = false
var var_mergeUnit2$1664_ts : Long = 0L
var var_mergeUnit2$1664_unknown : Boolean = false
var var_mergeUnit2$1664_error : Throwable = null
var var_$1652_changed : Boolean = false
var var_$1652_unknown : Boolean = false
var var_$1652_error : Throwable = null
var var_$1652_value : List[Long] = List[Long]()
var var_unfinishedSourceTimesNewSource$1661_changed : Boolean = true
var var_unfinishedSourceTimesNewSource$1661_value : List[Long] = var_$1701
var var_unfinishedSourceTimesNewSource$1661_init : Boolean = true
var var_unfinishedSourceTimesNewSource$1661_error : Throwable = null
var var_unfinishedSourceTimesNewSource$1661_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1650_changed : Boolean = false
var var_unfinishedSourceTimesNewSource$1650_unknown : Boolean = false
var var_unfinishedSourceTimesNewSource$1650_error : Throwable = null
var var_unfinishedSourceTimesNewSource$1650_value : List[Long] = List[Long]()
var var_unfinishedSourceTimesNewSource$1650_init : Boolean = false
var var_$1644_changed : Boolean = false
var var_$1644_unknown : Boolean = false
var var_$1644_error : Throwable = null
var var_$1644_value : List[Long] = List[Long]()
var var_$1644_init : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : Long = 0L
var var_$1643_init : Boolean = false
val var_$1703_value : Long = 0L
val var_$1703_error : Throwable = null
val var_$1703_changed : Boolean = false
val var_$1703_unknown : Boolean = false
var var_$1729_changed : Boolean = true
var var_$1729_value : Long = 0L
var var_$1729_init : Boolean = true
var var_$1729_error : Throwable = null
var var_$1729_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1642_changed : Boolean = false
var var_unfinishedSourceTimesAfterReset$1642_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1642_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1642_value : Boolean = false
var var_unfinishedSourceTimesAfterReset$1642_init : Boolean = false
var var_$1675_changed : Boolean = false
var var_$1675_unknown : Boolean = false
var var_$1675_error : Throwable = null
var var_$1675_value : Long = 0L
var var_$1675_init : Boolean = false
var var_$1893_changed : Boolean = true
var var_$1893_value : Long = 9223372036854775807L
var var_$1893_init : Boolean = true
var var_$1893_error : Throwable = null
var var_$1893_unknown : Boolean = false
var var_$1674_changed : Boolean = false
var var_$1674_unknown : Boolean = false
var var_$1674_error : Throwable = null
var var_$1674_value : Long = 0L
var var_$1674_init : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_value : Long = 0L
var var_$1689_init : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1673_changed : Boolean = false
var var_$1673_unknown : Boolean = false
var var_$1673_error : Throwable = null
var var_$1673_value : Boolean = false
var var_$1673_init : Boolean = false
var var_$1761_changed : Boolean = true
var var_$1761_value : Long = 50L
var var_$1761_init : Boolean = true
var var_$1761_error : Throwable = null
var var_$1761_unknown : Boolean = false
var var_$1688_changed : Boolean = false
var var_$1688_unknown : Boolean = false
var var_$1688_error : Throwable = null
var var_$1688_value : Long = 0L
var var_$1688_init : Boolean = false
var var_$1686_changed : Boolean = false
var var_$1686_unknown : Boolean = false
var var_$1686_error : Throwable = null
var var_$1686_value : List[Long] = List[Long]()
var var_$1686_init : Boolean = false
var var_unfinishedSourceTimesAfterReset$1672_changed : Boolean = false
var var_unfinishedSourceTimesAfterReset$1672_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1672_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1672_value : List[Long] = List[Long]()
var var_unfinishedSourceTimesAfterReset$1672_init : Boolean = false
val var_$1726_value : List[Long] = List[Long]()
val var_$1726_error : Throwable = null
val var_$1726_changed : Boolean = false
val var_$1726_unknown : Boolean = false
var var_unfinishedSourceTimesAfterReset$1699_changed : Boolean = true
var var_unfinishedSourceTimesAfterReset$1699_value : List[Long] = var_$1701
var var_unfinishedSourceTimesAfterReset$1699_init : Boolean = true
var var_unfinishedSourceTimesAfterReset$1699_error : Throwable = null
var var_unfinishedSourceTimesAfterReset$1699_unknown : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_value : List[Long] = List[Long]()
var var_$1724_init : Boolean = false
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Long = 0L
var var_$1736_init : Boolean = false
var var_$1639_changed : Boolean = false
var var_$1639_unknown : Boolean = false
var var_$1639_error : Throwable = null
var var_$1639_value : Boolean = false
var var_$1639_init : Boolean = false
var var_$1767_changed : Boolean = false
var var_$1767_unknown : Boolean = false
var var_$1767_error : Throwable = null
var var_$1767_value : Long = 0L
var var_$1767_init : Boolean = false
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
var var_$1765_changed : Boolean = false
var var_$1765_unknown : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_value : Boolean = false
var var_$1765_init : Boolean = false
var var_$1756_changed : Boolean = false
var var_$1756_unknown : Boolean = false
var var_$1756_error : Throwable = null
var var_$1756_value : Boolean = false
var var_$1756_init : Boolean = false
var var_$1722_changed : Boolean = false
var var_$1722_unknown : Boolean = false
var var_$1722_error : Throwable = null
var var_$1722_value : List[Long] = List[Long]()
var var_$1722_init : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : List[Long] = List[Long]()
var var_$1704_init : Boolean = false
var var_$1725_changed : Boolean = true
var var_$1725_value : List[Long] = var_$1727
var var_$1725_init : Boolean = true
var var_$1725_error : Throwable = null
var var_$1725_unknown : Boolean = false
var var_unfinishedSourceTimes$1638_changed : Boolean = false
var var_unfinishedSourceTimes$1638_unknown : Boolean = false
var var_unfinishedSourceTimes$1638_error : Throwable = null
var var_unfinishedSourceTimes$1638_value : List[Long] = List[Long]()
var var_unfinishedSourceTimes$1638_init : Boolean = false
var var_$1632_changed : Boolean = false
var var_$1632_lastValue : List[Long] = List[Long]()
var var_$1632_lastInit : Boolean = false
var var_$1632_lastError : Throwable = null
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : List[Long] = List[Long]()
var var_$1632_init : Boolean = false
var var_$1632_ts : Long = 0L
var var_$1869_changed : Boolean = false
var var_$1869_unknown : Boolean = false
var var_$1869_error : Throwable = null
var var_$1869_value : Long = 0L
var var_$1869_init : Boolean = false
var var_$1868_changed : Boolean = false
var var_$1868_unknown : Boolean = false
var var_$1868_error : Throwable = null
var var_$1868_value : Boolean = false
var var_$1868_init : Boolean = false
val var_$1777_value : (Boolean, Boolean) = (false, false)
val var_$1777_error : Throwable = null
val var_$1777_changed : Boolean = false
val var_$1777_unknown : Boolean = false
var var_$1731_changed : Boolean = true
var var_$1731_value : (Boolean, Boolean) = var_$1733
var var_$1731_init : Boolean = true
var var_$1731_error : Throwable = null
var var_$1731_unknown : Boolean = false
var var_$1735_changed : Boolean = false
var var_$1735_unknown : Boolean = false
var var_$1735_error : Throwable = null
var var_$1735_value : Boolean = false
var var_$1735_init : Boolean = false
var var_$1776_changed : Boolean = true
var var_$1776_value : (Boolean, Boolean) = var_$1742
var var_$1776_init : Boolean = true
var var_$1776_error : Throwable = null
var var_$1776_unknown : Boolean = false
var var_$1749_changed : Boolean = false
var var_$1749_error : Throwable = null
var var_$1749_unknown : Boolean = false
var var_safeDelay$1754_changed : Boolean = false
val var_safeDelay$1754_error : Throwable = null
var var_safeDelay$1754_unknown : Boolean = false
var var_$1752_changed : Boolean = false
var var_$1752_error : Throwable = null
var var_$1752_unknown : Boolean = false
var var_mergeUnit2$1748_changed : Boolean = false
var var_mergeUnit2$1748_ts : Long = 0L
var var_mergeUnit2$1748_unknown : Boolean = false
var var_mergeUnit2$1748_error : Throwable = null
var var_$1747_changed : Boolean = false
var var_$1747_value : Long = 0L
var var_$1747_init : Boolean = false
var var_$1747_unknown : Boolean = false
var var_$1747_error : Throwable = null
var var_$1744_changed : Boolean = false
var var_$1744_unknown : Boolean = false
var var_$1744_error : Throwable = null
var var_$1744_value : Boolean = false
var var_$1744_init : Boolean = false
var var_$1788_changed : Boolean = true
var var_$1788_value : (Boolean, Boolean) = var_$1790
var var_$1788_init : Boolean = true
var var_$1788_error : Throwable = null
var var_$1788_unknown : Boolean = false
var var_$1755_changed : Boolean = false
var var_$1755_unknown : Boolean = false
var var_$1755_error : Throwable = null
var var_$1755_value : (Boolean, Boolean) = (false, false)
var var_$1755_init : Boolean = false
var var_defaultTime$1786_changed : Boolean = true
var var_defaultTime$1786_value : Long = -1L
var var_defaultTime$1786_init : Boolean = true
var var_defaultTime$1786_error : Throwable = null
var var_defaultTime$1786_unknown : Boolean = false
var var_$1780_changed : Boolean = false
var var_$1780_unknown : Boolean = false
var var_$1780_error : Throwable = null
var var_$1780_value : Boolean = false
var var_$1780_init : Boolean = false
var var_$1779_changed : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1779_value : (Boolean, Boolean) = (false, false)
var var_$1779_init : Boolean = false
var var_$1743_changed : Boolean = false
var var_$1743_unknown : Boolean = false
var var_$1743_error : Throwable = null
var var_$1743_value : (Boolean, Boolean) = (false, false)
var var_$1743_init : Boolean = false
var var_$1734_changed : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1734_value : (Boolean, Boolean) = (false, false)
var var_$1734_init : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : (Boolean, Boolean) = (false, false)
var var_$1629_init : Boolean = false
var var_$1629_ts : Long = 0L
var var_$1806_changed : Boolean = false
var var_$1806_unknown : Boolean = false
var var_$1806_error : Throwable = null
var var_$1806_value : Boolean = false
var var_$1806_init : Boolean = false
val var_$1814_value : Boolean = false
val var_$1814_error : Throwable = null
val var_$1814_changed : Boolean = false
val var_$1814_unknown : Boolean = false
var var_$1808_changed : Boolean = true
var var_$1808_value : Boolean = true
var var_$1808_init : Boolean = true
var var_$1808_error : Throwable = null
var var_$1808_unknown : Boolean = false
var var_$1805_changed : Boolean = false
var var_$1805_unknown : Boolean = false
var var_$1805_error : Throwable = null
var var_$1805_value : Boolean = false
var var_$1805_init : Boolean = false
var var_$1796_changed : Boolean = false
var var_$1796_unknown : Boolean = false
var var_$1796_error : Throwable = null
var var_$1796_value : Boolean = false
var var_$1796_init : Boolean = false
var var_$1813_changed : Boolean = true
var var_$1813_value : Boolean = false
var var_$1813_init : Boolean = true
var var_$1813_error : Throwable = null
var var_$1813_unknown : Boolean = false
var var_$1810_changed : Boolean = false
var var_$1810_unknown : Boolean = false
var var_$1810_error : Throwable = null
var var_$1810_value : Boolean = false
var var_$1810_init : Boolean = false
var var_$1804_changed : Boolean = false
var var_$1804_unknown : Boolean = false
var var_$1804_error : Throwable = null
var var_$1804_value : Boolean = false
var var_$1804_init : Boolean = false
var var_$1873_changed : Boolean = true
var var_$1873_value : Long = -1L
var var_$1873_init : Boolean = true
var var_$1873_error : Throwable = null
var var_$1873_unknown : Boolean = false
var var_$1878_changed : Boolean = false
var var_$1878_unknown : Boolean = false
var var_$1878_error : Throwable = null
var var_$1878_value : Long = 0L
var var_$1878_init : Boolean = false
var var_$1877_changed : Boolean = false
var var_$1877_unknown : Boolean = false
var var_$1877_error : Throwable = null
var var_$1877_value : Long = 0L
var var_$1877_init : Boolean = false
var var_$1876_changed : Boolean = false
var var_$1876_unknown : Boolean = false
var var_$1876_error : Throwable = null
var var_$1876_value : Long = 0L
var var_$1876_init : Boolean = false
var var_$1888_changed : Boolean = true
var var_$1888_value : Long = 1L
var var_$1888_init : Boolean = true
var var_$1888_error : Throwable = null
var var_$1888_unknown : Boolean = false
var var_$1875_changed : Boolean = false
var var_$1875_unknown : Boolean = false
var var_$1875_error : Throwable = null
var var_$1875_value : Long = 0L
var var_$1875_init : Boolean = false
var var_$1867_changed : Boolean = false
var var_$1867_unknown : Boolean = false
var var_$1867_error : Throwable = null
var var_$1867_value : Long = 0L
var var_$1867_init : Boolean = false
var var_$1867_ts : Long = 0L
var var_$1866_changed : Boolean = false
var var_$1866_unknown : Boolean = false
var var_$1866_error : Throwable = null
var var_$1866_value : Boolean = false
var var_$1866_init : Boolean = false
var var_$1802_changed : Boolean = false
var var_$1802_init : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1802_value : Boolean = false
var var_isFinalFalse$1801_changed : Boolean = false
var var_isFinalFalse$1801_unknown : Boolean = false
var var_isFinalFalse$1801_error : Throwable = null
var var_isFinalFalse$1801_value : Boolean = false
var var_$1824_changed : Boolean = true
var var_$1824_lastValue : Boolean = false
var var_$1824_lastInit : Boolean = false
var var_$1824_lastError : Throwable = null
var var_$1824_value : Boolean = false
var var_$1824_init : Boolean = true
var var_$1824_ts : Long = 0L
var var_$1824_error : Throwable = null
var var_$1824_unknown : Boolean = false
var var_prev$1799_changed : Boolean = false
var var_prev$1799_init : Boolean = false
var var_prev$1799_unknown : Boolean = false
var var_prev$1799_error : Throwable = null
var var_prev$1799_value : Boolean = false
var var_$1895_changed : Boolean = false
var var_$1895_value : Long = 0L
var var_$1895_init : Boolean = false
var var_$1895_unknown : Boolean = false
var var_$1895_error : Throwable = null
var var_$1892_changed : Boolean = false
var var_$1892_unknown : Boolean = false
var var_$1892_error : Throwable = null
var var_$1892_value : Long = 0L
var var_$1892_init : Boolean = false
var var_$1795_changed : Boolean = false
var var_$1795_unknown : Boolean = false
var var_$1795_error : Throwable = null
var var_$1795_value : Boolean = false
var var_$1795_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : Boolean = false
var var_$1627_init : Boolean = false
var var_$1798_changed : Boolean = false
var var_$1798_unknown : Boolean = false
var var_$1798_error : Throwable = null
var var_$1798_value : Boolean = false
var var_$1798_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_$1821_changed : Boolean = false
var var_$1821_value : Long = 0L
var var_$1821_init : Boolean = false
var var_$1821_unknown : Boolean = false
var var_$1821_error : Throwable = null
var var_$1816_changed : Boolean = false
var var_$1816_init : Boolean = false
var var_$1816_unknown : Boolean = false
var var_$1816_error : Throwable = null
var var_$1816_value : Long = 0L
var var_finalFalseSince$1625_changed : Boolean = false
var var_finalFalseSince$1625_unknown : Boolean = false
var var_finalFalseSince$1625_error : Throwable = null
var var_finalFalseSince$1625_value : Long = 0L
var var_$1817_changed : Boolean = true
var var_$1817_lastValue : Long = 0L
var var_$1817_lastInit : Boolean = false
var var_$1817_lastError : Throwable = null
var var_$1817_value : Long = 9223372036854775807L
var var_$1817_init : Boolean = true
var var_$1817_ts : Long = 0L
var var_$1817_error : Throwable = null
var var_$1817_unknown : Boolean = false
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
var var_$1848_changed : Boolean = false
var var_$1848_unknown : Boolean = false
var var_$1848_error : Throwable = null
var var_$1848_value : Long = 0L
var var_stillFulfillableReset$1619_changed : Boolean = false
var var_stillFulfillableReset$1619_unknown : Boolean = false
var var_stillFulfillableReset$1619_error : Throwable = null
var var_stillFulfillableReset$1619_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1619_init : Boolean = false
var var_final$1618_changed : Boolean = false
var var_final$1618_unknown : Boolean = false
var var_final$1618_error : Throwable = null
var var_final$1618_value : Boolean = false
var var_final$1618_init : Boolean = false
var var_value$1830_changed : Boolean = false
var var_value$1830_unknown : Boolean = false
var var_value$1830_error : Throwable = null
var var_value$1830_value : Boolean = false
var var_value$1830_init : Boolean = false
var var_safeDelay$1754_nextTs : Long = -1L



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

if (((var_safeDelay$1754_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1754_nextTs))) {
currTs = var_safeDelay$1754_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1647_changed = false
if ((var_source_changed)) {
var_$1647_value = var_source_ts
var_$1647_init = true
var_$1647_unknown = var_source_unknown
if ((var_$1647_unknown)) {
var_$1647_error = var_source_error
} else {
var_$1647_error = null
}
var_$1647_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1634_changed = false
}
if ((var_$1647_changed)) {
var_defaultTime$1634_value = var_$1647_value
var_defaultTime$1634_init = true
var_defaultTime$1634_error = var_$1647_error
var_defaultTime$1634_changed = true
var_defaultTime$1634_unknown = var_$1647_unknown
}
var_$1764_changed = false
if ((var_target_changed)) {
var_$1764_value = var_target_ts
var_$1764_unknown = var_target_unknown
if ((var_$1764_unknown)) {
var_$1764_error = var_target_error
} else {
var_$1764_error = null
}
var_$1764_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1771_changed = false
}
if ((var_$1764_changed)) {
var_defaultTime$1771_value = var_$1764_value
var_defaultTime$1771_init = true
var_defaultTime$1771_error = var_$1764_error
var_defaultTime$1771_changed = true
var_defaultTime$1771_unknown = var_$1764_unknown
}
var_unfinishedSourceTimes$1633_changed = false
if ((var_defaultTime$1634_init && var_defaultTime$1771_init)) {
if ((var_defaultTime$1634_changed) || (var_defaultTime$1771_changed)) {
var_unfinishedSourceTimes$1633_unknown = (var_defaultTime$1634_unknown && var_defaultTime$1771_unknown)
if ((var_unfinishedSourceTimes$1633_unknown)) {
var_unfinishedSourceTimes$1633_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimes$1633_error = null
try {
var_unfinishedSourceTimes$1633_value = ((if((var_defaultTime$1634_error == null)) {var_defaultTime$1634_value} else {throw var_defaultTime$1634_error}) <= (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
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
var_unfinishedSourceTimesNewSource$1645_changed = false
if ((var_defaultTime$1634_init && var_defaultTime$1771_init)) {
if ((var_defaultTime$1634_changed) || (var_defaultTime$1771_changed)) {
var_unfinishedSourceTimesNewSource$1645_unknown = (var_defaultTime$1634_unknown && var_defaultTime$1771_unknown)
if ((var_unfinishedSourceTimesNewSource$1645_unknown)) {
var_unfinishedSourceTimesNewSource$1645_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesNewSource$1645_error = null
try {
var_unfinishedSourceTimesNewSource$1645_value = ((if((var_defaultTime$1634_error == null)) {var_defaultTime$1634_value} else {throw var_defaultTime$1634_error}) >= (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesNewSource$1645_error = var_err
}
}
}
var_unfinishedSourceTimesNewSource$1645_init = true
var_unfinishedSourceTimesNewSource$1645_changed = true
}
}
var_$1655_changed = false
if ((var_source_changed)) {
if ((var_source_unknown)) {
var_$1655_error = UnknownEventError(var_source_error)
} else {
var_$1655_error = null
}
var_$1655_changed = var_source_changed
var_$1655_unknown = var_source_unknown
}
var_$1886_changed = false
if ((var_target_changed)) {
if ((var_target_unknown)) {
var_$1886_error = UnknownEventError(var_target_error)
} else {
var_$1886_error = null
}
var_$1886_changed = var_target_changed
var_$1886_unknown = var_target_unknown
}
var_mergeUnit2$1664_changed = false
if ((var_$1655_changed) || (var_$1886_changed)) {
var_mergeUnit2$1664_ts = currTs
var_mergeUnit2$1664_changed = true
var_mergeUnit2$1664_unknown = (var_$1655_unknown && var_$1886_unknown)
if ((var_$1655_changed)) {
var_mergeUnit2$1664_error = var_$1655_error
} else {
if ((var_$1886_changed)) {
var_mergeUnit2$1664_error = var_$1886_error
}
}
}
var_$1652_changed = false
if ((var_mergeUnit2$1664_changed)) {
if ((var_$1632_ts == currTs && var_$1632_lastInit) || (!(var_$1632_ts == currTs) && var_$1632_init)) {
var_$1652_changed = true
var_$1652_unknown = var_mergeUnit2$1664_unknown
if ((var_$1652_unknown)) {
var_$1652_error = var_mergeUnit2$1664_error
} else {
if ((var_$1632_ts == currTs)) {
var_$1652_value = var_$1632_lastValue
var_$1652_error = var_$1632_lastError
} else {
var_$1652_value = var_$1632_value
var_$1652_error = var_$1632_error
}
}
}
}
if ((!(currTs == 0L))) {
var_unfinishedSourceTimesNewSource$1661_changed = false
}
if ((var_$1652_changed)) {
var_unfinishedSourceTimesNewSource$1661_value = var_$1652_value
var_unfinishedSourceTimesNewSource$1661_init = true
var_unfinishedSourceTimesNewSource$1661_error = var_$1652_error
var_unfinishedSourceTimesNewSource$1661_changed = true
var_unfinishedSourceTimesNewSource$1661_unknown = var_$1652_unknown
}
var_unfinishedSourceTimesNewSource$1650_changed = false
if ((var_unfinishedSourceTimesNewSource$1661_init && var_$1647_init)) {
if ((var_unfinishedSourceTimesNewSource$1661_changed) || (var_$1647_changed)) {
var_unfinishedSourceTimesNewSource$1650_unknown = (var_unfinishedSourceTimesNewSource$1661_unknown && var_$1647_unknown)
if ((var_unfinishedSourceTimesNewSource$1650_unknown)) {
var_unfinishedSourceTimesNewSource$1650_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesNewSource$1650_error = null
try {
var_unfinishedSourceTimesNewSource$1650_value = ((if((var_unfinishedSourceTimesNewSource$1661_error == null)) {var_unfinishedSourceTimesNewSource$1661_value} else {throw var_unfinishedSourceTimesNewSource$1661_error}) :+ (if((var_$1647_error == null)) {var_$1647_value} else {throw var_$1647_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesNewSource$1650_error = var_err
}
}
}
var_unfinishedSourceTimesNewSource$1650_init = true
var_unfinishedSourceTimesNewSource$1650_changed = true
}
}
var_$1644_changed = false
if ((var_unfinishedSourceTimesNewSource$1645_init && var_unfinishedSourceTimesNewSource$1650_init && var_unfinishedSourceTimesNewSource$1661_init)) {
if ((var_unfinishedSourceTimesNewSource$1645_changed) || (var_unfinishedSourceTimesNewSource$1650_changed) || (var_unfinishedSourceTimesNewSource$1661_changed)) {
var_$1644_unknown = (var_unfinishedSourceTimesNewSource$1645_unknown && var_unfinishedSourceTimesNewSource$1650_unknown && var_unfinishedSourceTimesNewSource$1661_unknown)
if ((var_$1644_unknown)) {
var_$1644_error = UnknownEventError(null)
} else {
var_$1644_error = null
try {
var_$1644_value = (if ((if((var_unfinishedSourceTimesNewSource$1645_error == null)) {var_unfinishedSourceTimesNewSource$1645_value} else {throw var_unfinishedSourceTimesNewSource$1645_error})) (if((var_unfinishedSourceTimesNewSource$1650_error == null)) {var_unfinishedSourceTimesNewSource$1650_value} else {throw var_unfinishedSourceTimesNewSource$1650_error}) else (if((var_unfinishedSourceTimesNewSource$1661_error == null)) {var_unfinishedSourceTimesNewSource$1661_value} else {throw var_unfinishedSourceTimesNewSource$1661_error}))
} catch {
case var_err : Throwable => {
var_$1644_error = var_err
}
}
}
var_$1644_init = true
var_$1644_changed = true
}
}
var_$1643_changed = false
if ((var_$1644_init)) {
if ((var_$1644_changed)) {
var_$1643_unknown = (var_$1644_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = (if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}).size
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
var_$1729_changed = false
}
if ((var_$1703_changed)) {
var_$1729_value = var_$1703_value
var_$1729_init = true
var_$1729_error = var_$1703_error
var_$1729_changed = true
var_$1729_unknown = var_$1703_unknown
}
var_unfinishedSourceTimesAfterReset$1642_changed = false
if ((var_$1643_init && var_$1729_init)) {
if ((var_$1643_changed) || (var_$1729_changed)) {
var_unfinishedSourceTimesAfterReset$1642_unknown = (var_$1643_unknown && var_$1729_unknown)
if ((var_unfinishedSourceTimesAfterReset$1642_unknown)) {
var_unfinishedSourceTimesAfterReset$1642_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesAfterReset$1642_error = null
try {
var_unfinishedSourceTimesAfterReset$1642_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) != (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesAfterReset$1642_error = var_err
}
}
}
var_unfinishedSourceTimesAfterReset$1642_init = true
var_unfinishedSourceTimesAfterReset$1642_changed = true
}
}
var_$1675_changed = false
if ((var_$1644_init)) {
if ((var_$1644_changed)) {
var_$1675_unknown = (var_$1644_unknown)
if ((var_$1675_unknown)) {
var_$1675_error = UnknownEventError(null)
} else {
var_$1675_error = null
try {
var_$1675_value = (var_head$1677.apply(((if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
var_$1893_changed = false
}
if ((var_$1703_changed)) {
var_$1893_value = var_$1703_value
var_$1893_init = true
var_$1893_error = var_$1703_error
var_$1893_changed = true
var_$1893_unknown = var_$1703_unknown
}
var_$1674_changed = false
if ((var_$1675_init && var_$1893_init)) {
if ((var_$1675_changed) || (var_$1893_changed)) {
var_$1674_unknown = (var_$1675_unknown && var_$1893_unknown)
if ((var_$1674_unknown)) {
var_$1674_error = UnknownEventError(null)
} else {
var_$1674_error = null
try {
var_$1674_value = ((if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error}) + (if((var_$1893_error == null)) {var_$1893_value} else {throw var_$1893_error}))
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
var_$1689_changed = false
if ((var_mergeUnit2$1664_changed)) {
var_$1689_value = var_mergeUnit2$1664_ts
var_$1689_init = true
var_$1689_unknown = var_mergeUnit2$1664_unknown
if ((var_$1689_unknown)) {
var_$1689_error = var_mergeUnit2$1664_error
} else {
var_$1689_error = null
}
var_$1689_changed = true
}
var_$1673_changed = false
if ((var_$1674_init && var_$1689_init)) {
if ((var_$1674_changed) || (var_$1689_changed)) {
var_$1673_unknown = (var_$1674_unknown && var_$1689_unknown)
if ((var_$1673_unknown)) {
var_$1673_error = UnknownEventError(null)
} else {
var_$1673_error = null
try {
var_$1673_value = ((if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}) < (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
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
if ((!(currTs == 0L))) {
var_$1761_changed = false
}
if ((var_$1703_changed)) {
var_$1761_value = var_$1703_value
var_$1761_init = true
var_$1761_error = var_$1703_error
var_$1761_changed = true
var_$1761_unknown = var_$1703_unknown
}
var_$1688_changed = false
if ((var_$1689_init && var_$1761_init)) {
if ((var_$1689_changed) || (var_$1761_changed)) {
var_$1688_unknown = (var_$1689_unknown && var_$1761_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = ((if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}) - (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
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
var_$1686_changed = false
if ((var_$1644_init && var_$1688_init)) {
if ((var_$1644_changed) || (var_$1688_changed)) {
var_$1686_unknown = (var_$1644_unknown && var_$1688_unknown)
if ((var_$1686_unknown)) {
var_$1686_error = UnknownEventError(null)
} else {
var_$1686_error = null
try {
var_$1686_value = var_removeItemsSmallerThanAFromListFront$1697.apply((if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}), (if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}))
} catch {
case var_err : Throwable => {
var_$1686_error = var_err
}
}
}
var_$1686_init = true
var_$1686_changed = true
}
}
var_unfinishedSourceTimesAfterReset$1672_changed = false
if ((var_$1673_init && var_$1686_init && var_$1644_init)) {
if ((var_$1673_changed) || (var_$1686_changed) || (var_$1644_changed)) {
var_unfinishedSourceTimesAfterReset$1672_unknown = (var_$1673_unknown && var_$1686_unknown && var_$1644_unknown)
if ((var_unfinishedSourceTimesAfterReset$1672_unknown)) {
var_unfinishedSourceTimesAfterReset$1672_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimesAfterReset$1672_error = null
try {
var_unfinishedSourceTimesAfterReset$1672_value = (if ((if((var_$1673_error == null)) {var_$1673_value} else {throw var_$1673_error})) (if((var_$1686_error == null)) {var_$1686_value} else {throw var_$1686_error}) else (if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimesAfterReset$1672_error = var_err
}
}
}
var_unfinishedSourceTimesAfterReset$1672_init = true
var_unfinishedSourceTimesAfterReset$1672_changed = true
}
}
if ((!(currTs == 0L))) {
var_unfinishedSourceTimesAfterReset$1699_changed = false
}
if ((var_$1726_changed)) {
var_unfinishedSourceTimesAfterReset$1699_value = var_$1726_value
var_unfinishedSourceTimesAfterReset$1699_init = true
var_unfinishedSourceTimesAfterReset$1699_error = var_$1726_error
var_unfinishedSourceTimesAfterReset$1699_changed = true
var_unfinishedSourceTimesAfterReset$1699_unknown = var_$1726_unknown
}
var_$1724_changed = false
if ((var_unfinishedSourceTimesAfterReset$1642_init && var_unfinishedSourceTimesAfterReset$1672_init && var_unfinishedSourceTimesAfterReset$1699_init)) {
if ((var_unfinishedSourceTimesAfterReset$1642_changed) || (var_unfinishedSourceTimesAfterReset$1672_changed) || (var_unfinishedSourceTimesAfterReset$1699_changed)) {
var_$1724_unknown = (var_unfinishedSourceTimesAfterReset$1642_unknown && var_unfinishedSourceTimesAfterReset$1672_unknown && var_unfinishedSourceTimesAfterReset$1699_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = (if ((if((var_unfinishedSourceTimesAfterReset$1642_error == null)) {var_unfinishedSourceTimesAfterReset$1642_value} else {throw var_unfinishedSourceTimesAfterReset$1642_error})) (if((var_unfinishedSourceTimesAfterReset$1672_error == null)) {var_unfinishedSourceTimesAfterReset$1672_value} else {throw var_unfinishedSourceTimesAfterReset$1672_error}) else (if((var_unfinishedSourceTimesAfterReset$1699_error == null)) {var_unfinishedSourceTimesAfterReset$1699_value} else {throw var_unfinishedSourceTimesAfterReset$1699_error}))
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
var_$1736_changed = false
if ((var_$1724_init)) {
if ((var_$1724_changed)) {
var_$1736_unknown = (var_$1724_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}).size
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
var_$1639_changed = false
if ((var_$1736_init && var_$1729_init)) {
if ((var_$1736_changed) || (var_$1729_changed)) {
var_$1639_unknown = (var_$1736_unknown && var_$1729_unknown)
if ((var_$1639_unknown)) {
var_$1639_error = UnknownEventError(null)
} else {
var_$1639_error = null
try {
var_$1639_value = ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) != (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_$1639_error = var_err
}
}
}
var_$1639_init = true
var_$1639_changed = true
}
}
var_$1767_changed = false
if ((var_$1724_init)) {
if ((var_$1724_changed)) {
var_$1767_unknown = (var_$1724_unknown)
if ((var_$1767_unknown)) {
var_$1767_error = UnknownEventError(null)
} else {
var_$1767_error = null
try {
var_$1767_value = (var_head$1677.apply(((if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1767_error = var_err
}
}
}
var_$1767_init = true
var_$1767_changed = true
}
}
var_$1707_changed = false
if ((var_$1767_init && var_$1761_init)) {
if ((var_$1767_changed) || (var_$1761_changed)) {
var_$1707_unknown = (var_$1767_unknown && var_$1761_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = ((if((var_$1767_error == null)) {var_$1767_value} else {throw var_$1767_error}) + (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
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
if ((var_$1707_init && var_defaultTime$1771_init)) {
if ((var_$1707_changed) || (var_defaultTime$1771_changed)) {
var_$1706_unknown = (var_$1707_unknown && var_defaultTime$1771_unknown)
if ((var_$1706_unknown)) {
var_$1706_error = UnknownEventError(null)
} else {
var_$1706_error = null
try {
var_$1706_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) <= (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
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
var_$1765_changed = false
if ((var_$1707_init && var_defaultTime$1771_init)) {
if ((var_$1707_changed) || (var_defaultTime$1771_changed)) {
var_$1765_unknown = (var_$1707_unknown && var_defaultTime$1771_unknown)
if ((var_$1765_unknown)) {
var_$1765_error = UnknownEventError(null)
} else {
var_$1765_error = null
try {
var_$1765_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) >= (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
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
var_$1756_changed = false
if ((var_$1706_init && var_$1765_init)) {
if ((var_$1706_changed) || (var_$1765_changed)) {
var_$1756_unknown = (var_$1706_unknown && var_$1765_unknown)
if ((var_$1756_unknown)) {
var_$1756_error = UnknownEventError(null)
} else {
var_$1756_error = null
try {
var_$1756_value = ((if((var_$1706_error == null)) {var_$1706_value} else {throw var_$1706_error}) && (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
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
var_$1722_changed = false
if ((var_$1724_init)) {
if ((var_$1724_changed)) {
var_$1722_unknown = (var_$1724_unknown)
if ((var_$1722_unknown)) {
var_$1722_error = UnknownEventError(null)
} else {
var_$1722_error = null
try {
var_$1722_value = (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}).tail
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
var_$1704_changed = false
if ((var_$1756_init && var_$1722_init && var_$1724_init)) {
if ((var_$1756_changed) || (var_$1722_changed) || (var_$1724_changed)) {
var_$1704_unknown = (var_$1756_unknown && var_$1722_unknown && var_$1724_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = (if ((if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error})) (if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error}) else (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}))
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
var_$1725_changed = false
}
if ((var_$1726_changed)) {
var_$1725_value = var_$1726_value
var_$1725_init = true
var_$1725_error = var_$1726_error
var_$1725_changed = true
var_$1725_unknown = var_$1726_unknown
}
var_unfinishedSourceTimes$1638_changed = false
if ((var_$1639_init && var_$1704_init && var_$1725_init)) {
if ((var_$1639_changed) || (var_$1704_changed) || (var_$1725_changed)) {
var_unfinishedSourceTimes$1638_unknown = (var_$1639_unknown && var_$1704_unknown && var_$1725_unknown)
if ((var_unfinishedSourceTimes$1638_unknown)) {
var_unfinishedSourceTimes$1638_error = UnknownEventError(null)
} else {
var_unfinishedSourceTimes$1638_error = null
try {
var_unfinishedSourceTimes$1638_value = (if ((if((var_$1639_error == null)) {var_$1639_value} else {throw var_$1639_error})) (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}) else (if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}))
} catch {
case var_err : Throwable => {
var_unfinishedSourceTimes$1638_error = var_err
}
}
}
var_unfinishedSourceTimes$1638_init = true
var_unfinishedSourceTimes$1638_changed = true
}
}
var_$1632_changed = false
if ((var_unfinishedSourceTimes$1633_init && var_unfinishedSourceTimes$1638_init && var_$1724_init)) {
if ((var_unfinishedSourceTimes$1633_changed) || (var_unfinishedSourceTimes$1638_changed) || (var_$1724_changed)) {
var_$1632_lastValue = var_$1632_value
var_$1632_lastInit = var_$1632_init
var_$1632_lastError = var_$1632_error
var_$1632_unknown = (var_unfinishedSourceTimes$1633_unknown && var_unfinishedSourceTimes$1638_unknown && var_$1724_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = (if ((if((var_unfinishedSourceTimes$1633_error == null)) {var_unfinishedSourceTimes$1633_value} else {throw var_unfinishedSourceTimes$1633_error})) (if((var_unfinishedSourceTimes$1638_error == null)) {var_unfinishedSourceTimes$1638_value} else {throw var_unfinishedSourceTimes$1638_error}) else (if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}))
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
var_$1869_changed = false
if ((var_$1632_init)) {
if ((var_$1632_changed)) {
var_$1869_unknown = (var_$1632_unknown)
if ((var_$1869_unknown)) {
var_$1869_error = UnknownEventError(null)
} else {
var_$1869_error = null
try {
var_$1869_value = (if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}).size
} catch {
case var_err : Throwable => {
var_$1869_error = var_err
}
}
}
var_$1869_init = true
var_$1869_changed = true
}
}
var_$1868_changed = false
if ((var_$1869_init && var_$1729_init)) {
if ((var_$1869_changed) || (var_$1729_changed)) {
var_$1868_unknown = (var_$1869_unknown && var_$1729_unknown)
if ((var_$1868_unknown)) {
var_$1868_error = UnknownEventError(null)
} else {
var_$1868_error = null
try {
var_$1868_value = ((if((var_$1869_error == null)) {var_$1869_value} else {throw var_$1869_error}) == (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_$1868_error = var_err
}
}
}
var_$1868_init = true
var_$1868_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1731_changed = false
}
if ((var_$1777_changed)) {
var_$1731_value = var_$1777_value
var_$1731_init = true
var_$1731_error = var_$1777_error
var_$1731_changed = true
var_$1731_unknown = var_$1777_unknown
}
var_$1735_changed = false
if ((var_$1736_init && var_$1729_init)) {
if ((var_$1736_changed) || (var_$1729_changed)) {
var_$1735_unknown = (var_$1736_unknown && var_$1729_unknown)
if ((var_$1735_unknown)) {
var_$1735_error = UnknownEventError(null)
} else {
var_$1735_error = null
try {
var_$1735_value = ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) == (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
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
if ((!(currTs == 0L))) {
var_$1776_changed = false
}
if ((var_$1777_changed)) {
var_$1776_value = var_$1777_value
var_$1776_init = true
var_$1776_error = var_$1777_error
var_$1776_changed = true
var_$1776_unknown = var_$1777_unknown
}
var_$1749_changed = false
if ((var_mergeUnit2$1664_changed)) {
if ((var_mergeUnit2$1664_unknown)) {
var_$1749_error = UnknownEventError(var_mergeUnit2$1664_error)
} else {
var_$1749_error = null
}
var_$1749_changed = var_mergeUnit2$1664_changed
var_$1749_unknown = var_mergeUnit2$1664_unknown
}
var_safeDelay$1754_changed = false
if ((var_safeDelay$1754_nextTs == currTs)) {
var_safeDelay$1754_changed = true
var_safeDelay$1754_unknown = false
}
var_$1752_changed = false
if ((var_safeDelay$1754_changed)) {
if ((var_safeDelay$1754_unknown)) {
var_$1752_error = UnknownEventError(var_safeDelay$1754_error)
} else {
var_$1752_error = null
}
var_$1752_changed = var_safeDelay$1754_changed
var_$1752_unknown = var_safeDelay$1754_unknown
}
var_mergeUnit2$1748_changed = false
if ((var_$1749_changed) || (var_$1752_changed)) {
var_mergeUnit2$1748_ts = currTs
var_mergeUnit2$1748_changed = true
var_mergeUnit2$1748_unknown = (var_$1749_unknown && var_$1752_unknown)
if ((var_$1749_changed)) {
var_mergeUnit2$1748_error = var_$1749_error
} else {
if ((var_$1752_changed)) {
var_mergeUnit2$1748_error = var_$1752_error
}
}
}
var_$1747_changed = false
if ((var_mergeUnit2$1748_changed)) {
var_$1747_value = var_mergeUnit2$1748_ts
var_$1747_init = true
var_$1747_unknown = var_mergeUnit2$1748_unknown
if ((var_$1747_unknown)) {
var_$1747_error = var_mergeUnit2$1748_error
} else {
var_$1747_error = null
}
var_$1747_changed = true
}
var_$1744_changed = false
if ((var_defaultTime$1771_init && var_$1747_init)) {
if ((var_defaultTime$1771_changed) || (var_$1747_changed)) {
var_$1744_unknown = (var_defaultTime$1771_unknown && var_$1747_unknown)
if ((var_$1744_unknown)) {
var_$1744_error = UnknownEventError(null)
} else {
var_$1744_error = null
try {
var_$1744_value = ((if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}) >= (if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error}))
} catch {
case var_err : Throwable => {
var_$1744_error = var_err
}
}
}
var_$1744_init = true
var_$1744_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1788_changed = false
}
if ((var_$1777_changed)) {
var_$1788_value = var_$1777_value
var_$1788_init = true
var_$1788_error = var_$1777_error
var_$1788_changed = true
var_$1788_unknown = var_$1777_unknown
}
var_$1755_changed = false
if ((var_$1756_init && var_$1788_init && var_$1776_init)) {
if ((var_$1756_changed) || (var_$1788_changed) || (var_$1776_changed)) {
var_$1755_unknown = (var_$1756_unknown && var_$1788_unknown && var_$1776_unknown)
if ((var_$1755_unknown)) {
var_$1755_error = UnknownEventError(null)
} else {
var_$1755_error = null
try {
var_$1755_value = (if ((if((var_$1756_error == null)) {var_$1756_value} else {throw var_$1756_error})) (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}) else (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$1786_changed = false
}
if ((var_$1747_changed)) {
var_defaultTime$1786_value = var_$1747_value
var_defaultTime$1786_init = true
var_defaultTime$1786_error = var_$1747_error
var_defaultTime$1786_changed = true
var_defaultTime$1786_unknown = var_$1747_unknown
}
var_$1780_changed = false
if ((var_$1707_init && var_defaultTime$1786_init)) {
if ((var_$1707_changed) || (var_defaultTime$1786_changed)) {
var_$1780_unknown = (var_$1707_unknown && var_defaultTime$1786_unknown)
if ((var_$1780_unknown)) {
var_$1780_error = UnknownEventError(null)
} else {
var_$1780_error = null
try {
var_$1780_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) >= (if((var_defaultTime$1786_error == null)) {var_defaultTime$1786_value} else {throw var_defaultTime$1786_error}))
} catch {
case var_err : Throwable => {
var_$1780_error = var_err
}
}
}
var_$1780_init = true
var_$1780_changed = true
}
}
var_$1779_changed = false
if ((var_$1780_init && var_$1788_init && var_$1776_init)) {
if ((var_$1780_changed) || (var_$1788_changed) || (var_$1776_changed)) {
var_$1779_unknown = (var_$1780_unknown && var_$1788_unknown && var_$1776_unknown)
if ((var_$1779_unknown)) {
var_$1779_error = UnknownEventError(null)
} else {
var_$1779_error = null
try {
var_$1779_value = (if ((if((var_$1780_error == null)) {var_$1780_value} else {throw var_$1780_error})) (if((var_$1788_error == null)) {var_$1788_value} else {throw var_$1788_error}) else (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}))
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
var_$1743_changed = false
if ((var_$1744_init && var_$1755_init && var_$1779_init)) {
if ((var_$1744_changed) || (var_$1755_changed) || (var_$1779_changed)) {
var_$1743_unknown = (var_$1744_unknown && var_$1755_unknown && var_$1779_unknown)
if ((var_$1743_unknown)) {
var_$1743_error = UnknownEventError(null)
} else {
var_$1743_error = null
try {
var_$1743_value = (if ((if((var_$1744_error == null)) {var_$1744_value} else {throw var_$1744_error})) (if((var_$1755_error == null)) {var_$1755_value} else {throw var_$1755_error}) else (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
} catch {
case var_err : Throwable => {
var_$1743_error = var_err
}
}
}
var_$1743_init = true
var_$1743_changed = true
}
}
var_$1734_changed = false
if ((var_$1735_init && var_$1776_init && var_$1743_init)) {
if ((var_$1735_changed) || (var_$1776_changed) || (var_$1743_changed)) {
var_$1734_unknown = (var_$1735_unknown && var_$1776_unknown && var_$1743_unknown)
if ((var_$1734_unknown)) {
var_$1734_error = UnknownEventError(null)
} else {
var_$1734_error = null
try {
var_$1734_value = (if ((if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error})) (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}) else (if((var_$1743_error == null)) {var_$1743_value} else {throw var_$1743_error}))
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
var_$1629_changed = false
if ((var_$1868_init && var_$1731_init && var_$1734_init)) {
if ((var_$1868_changed) || (var_$1731_changed) || (var_$1734_changed)) {
var_$1629_unknown = (var_$1868_unknown && var_$1731_unknown && var_$1734_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = (if ((if((var_$1868_error == null)) {var_$1868_value} else {throw var_$1868_error})) (if((var_$1731_error == null)) {var_$1731_value} else {throw var_$1731_error}) else (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
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
var_$1806_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1806_unknown = (var_$1629_unknown)
if ((var_$1806_unknown)) {
var_$1806_error = UnknownEventError(null)
} else {
var_$1806_error = null
try {
var_$1806_value = var_$1829.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
if ((!(currTs == 0L))) {
var_$1808_changed = false
}
if ((var_$1814_changed)) {
var_$1808_value = var_$1814_value
var_$1808_init = true
var_$1808_error = var_$1814_error
var_$1808_changed = true
var_$1808_unknown = var_$1814_unknown
}
var_$1805_changed = false
if ((var_$1806_init && var_$1808_init)) {
if ((var_$1806_changed) || (var_$1808_changed)) {
var_$1805_unknown = (var_$1806_unknown && var_$1808_unknown)
if ((var_$1805_unknown)) {
var_$1805_error = UnknownEventError(null)
} else {
var_$1805_error = null
try {
var_$1805_value = ((if((var_$1806_error == null)) {var_$1806_value} else {throw var_$1806_error}) == (if((var_$1808_error == null)) {var_$1808_value} else {throw var_$1808_error}))
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
var_$1796_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1796_unknown = (var_$1629_unknown)
if ((var_$1796_unknown)) {
var_$1796_error = UnknownEventError(null)
} else {
var_$1796_error = null
try {
var_$1796_value = var_$1812.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
var_$1813_changed = false
}
if ((var_$1814_changed)) {
var_$1813_value = var_$1814_value
var_$1813_init = true
var_$1813_error = var_$1814_error
var_$1813_changed = true
var_$1813_unknown = var_$1814_unknown
}
var_$1810_changed = false
if ((var_$1796_init && var_$1813_init)) {
if ((var_$1796_changed) || (var_$1813_changed)) {
var_$1810_unknown = (var_$1796_unknown && var_$1813_unknown)
if ((var_$1810_unknown)) {
var_$1810_error = UnknownEventError(null)
} else {
var_$1810_error = null
try {
var_$1810_value = ((if((var_$1796_error == null)) {var_$1796_value} else {throw var_$1796_error}) == (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}))
} catch {
case var_err : Throwable => {
var_$1810_error = var_err
}
}
}
var_$1810_init = true
var_$1810_changed = true
}
}
var_$1804_changed = false
if ((var_$1805_init && var_$1810_init)) {
if ((var_$1805_changed) || (var_$1810_changed)) {
var_$1804_unknown = (var_$1805_unknown && var_$1810_unknown)
if ((var_$1804_unknown)) {
var_$1804_error = UnknownEventError(null)
} else {
var_$1804_error = null
try {
var_$1804_value = ((if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error}) && (if((var_$1810_error == null)) {var_$1810_value} else {throw var_$1810_error}))
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
if ((!(currTs == 0L))) {
var_$1873_changed = false
}
if ((var_$1703_changed)) {
var_$1873_value = var_$1703_value
var_$1873_init = true
var_$1873_error = var_$1703_error
var_$1873_changed = true
var_$1873_unknown = var_$1703_unknown
}
var_$1878_changed = false
if ((var_$1632_init)) {
if ((var_$1632_changed)) {
var_$1878_unknown = (var_$1632_unknown)
if ((var_$1878_unknown)) {
var_$1878_error = UnknownEventError(null)
} else {
var_$1878_error = null
try {
var_$1878_value = (var_head$1677.apply(((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$1878_error = var_err
}
}
}
var_$1878_init = true
var_$1878_changed = true
}
}
var_$1877_changed = false
if ((var_$1878_init && var_$1761_init)) {
if ((var_$1878_changed) || (var_$1761_changed)) {
var_$1877_unknown = (var_$1878_unknown && var_$1761_unknown)
if ((var_$1877_unknown)) {
var_$1877_error = UnknownEventError(null)
} else {
var_$1877_error = null
try {
var_$1877_value = ((if((var_$1878_error == null)) {var_$1878_value} else {throw var_$1878_error}) + (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
} catch {
case var_err : Throwable => {
var_$1877_error = var_err
}
}
}
var_$1877_init = true
var_$1877_changed = true
}
}
var_$1876_changed = false
if ((var_$1877_init && var_$1689_init)) {
if ((var_$1877_changed) || (var_$1689_changed)) {
var_$1876_unknown = (var_$1877_unknown && var_$1689_unknown)
if ((var_$1876_unknown)) {
var_$1876_error = UnknownEventError(null)
} else {
var_$1876_error = null
try {
var_$1876_value = ((if((var_$1877_error == null)) {var_$1877_value} else {throw var_$1877_error}) - (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
} catch {
case var_err : Throwable => {
var_$1876_error = var_err
}
}
}
var_$1876_init = true
var_$1876_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1888_changed = false
}
if ((var_$1703_changed)) {
var_$1888_value = var_$1703_value
var_$1888_init = true
var_$1888_error = var_$1703_error
var_$1888_changed = true
var_$1888_unknown = var_$1703_unknown
}
var_$1875_changed = false
if ((var_$1876_init && var_$1888_init)) {
if ((var_$1876_changed) || (var_$1888_changed)) {
var_$1875_unknown = (var_$1876_unknown && var_$1888_unknown)
if ((var_$1875_unknown)) {
var_$1875_error = UnknownEventError(null)
} else {
var_$1875_error = null
try {
var_$1875_value = ((if((var_$1876_error == null)) {var_$1876_value} else {throw var_$1876_error}) + (if((var_$1888_error == null)) {var_$1888_value} else {throw var_$1888_error}))
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
var_$1867_changed = false
if ((var_$1868_init && var_$1873_init && var_$1875_init)) {
if ((var_$1868_changed) || (var_$1873_changed) || (var_$1875_changed)) {
var_$1867_unknown = (var_$1868_unknown && var_$1873_unknown && var_$1875_unknown)
if ((var_$1867_unknown)) {
var_$1867_error = UnknownEventError(null)
} else {
var_$1867_error = null
try {
var_$1867_value = (if ((if((var_$1868_error == null)) {var_$1868_value} else {throw var_$1868_error})) (if((var_$1873_error == null)) {var_$1873_value} else {throw var_$1873_error}) else (if((var_$1875_error == null)) {var_$1875_value} else {throw var_$1875_error}))
} catch {
case var_err : Throwable => {
var_$1867_error = var_err
}
}
}
var_$1867_init = true
var_$1867_ts = currTs
var_$1867_changed = true
}
}
var_$1866_changed = false
if ((var_$1867_init && var_$1729_init)) {
if ((var_$1867_changed) || (var_$1729_changed)) {
var_$1866_unknown = (var_$1867_unknown && var_$1729_unknown)
if ((var_$1866_unknown)) {
var_$1866_error = UnknownEventError(null)
} else {
var_$1866_error = null
try {
var_$1866_value = ((if((var_$1867_error == null)) {var_$1867_value} else {throw var_$1867_error}) > (if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_$1866_error = var_err
}
}
}
var_$1866_init = true
var_$1866_changed = true
}
}
var_$1802_changed = false
if ((var_$1629_changed)) {
if ((var_$1620_ts == currTs && var_$1620_lastInit) || (!(var_$1620_ts == currTs) && var_$1620_init)) {
var_$1802_changed = true
var_$1802_init = true
var_$1802_unknown = var_$1629_unknown
if ((var_$1802_unknown)) {
var_$1802_error = var_$1629_error
} else {
if ((var_$1620_ts == currTs)) {
var_$1802_value = var_$1620_lastValue
var_$1802_error = var_$1620_lastError
} else {
var_$1802_value = var_$1620_value
var_$1802_error = var_$1620_error
}
}
}
}
var_isFinalFalse$1801_changed = false
if ((var_$1802_init && var_$1804_init)) {
if ((var_$1802_changed) || (var_$1804_changed)) {
var_isFinalFalse$1801_unknown = (var_$1802_unknown && var_$1804_unknown)
if ((var_isFinalFalse$1801_unknown)) {
var_isFinalFalse$1801_error = UnknownEventError(null)
} else {
var_isFinalFalse$1801_error = null
try {
var_isFinalFalse$1801_value = ((if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}) || (if((var_$1804_error == null)) {var_$1804_value} else {throw var_$1804_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1801_error = var_err
}
}
}
var_isFinalFalse$1801_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1824_changed = false
}
if ((var_isFinalFalse$1801_changed)) {
var_$1824_lastValue = var_$1824_value
var_$1824_lastInit = var_$1824_init
var_$1824_lastError = var_$1824_error
var_$1824_value = var_isFinalFalse$1801_value
var_$1824_init = true
var_$1824_ts = currTs
var_$1824_error = var_isFinalFalse$1801_error
var_$1824_changed = true
var_$1824_unknown = var_isFinalFalse$1801_unknown
}
var_prev$1799_changed = false
if ((var_$1824_changed)) {
if ((var_$1824_ts == currTs && var_$1824_lastInit) || (!(var_$1824_ts == currTs) && var_$1824_init)) {
var_prev$1799_changed = true
var_prev$1799_init = true
var_prev$1799_unknown = var_$1824_unknown
if ((var_prev$1799_unknown)) {
var_prev$1799_error = var_$1824_error
} else {
if ((var_$1824_ts == currTs)) {
var_prev$1799_value = var_$1824_lastValue
var_prev$1799_error = var_$1824_lastError
} else {
var_prev$1799_value = var_$1824_value
var_prev$1799_error = var_$1824_error
}
}
}
}
var_$1895_changed = false
if ((var_$1867_changed)) {
var_$1895_value = var_$1867_ts
var_$1895_init = true
var_$1895_unknown = var_$1867_unknown
if ((var_$1895_unknown)) {
var_$1895_error = var_$1867_error
} else {
var_$1895_error = null
}
var_$1895_changed = true
}
var_$1892_changed = false
if ((var_$1893_init && var_$1895_init)) {
if ((var_$1893_changed) || (var_$1895_changed)) {
var_$1892_unknown = (var_$1893_unknown && var_$1895_unknown)
if ((var_$1892_unknown)) {
var_$1892_error = UnknownEventError(null)
} else {
var_$1892_error = null
try {
var_$1892_value = ((if((var_$1893_error == null)) {var_$1893_value} else {throw var_$1893_error}) - (if((var_$1895_error == null)) {var_$1895_value} else {throw var_$1895_error}))
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
var_$1795_changed = false
if ((var_$1796_init)) {
if ((var_$1796_changed)) {
var_$1795_unknown = (var_$1796_unknown)
if ((var_$1795_unknown)) {
var_$1795_error = UnknownEventError(null)
} else {
var_$1795_error = null
try {
var_$1795_value = !((if((var_$1796_error == null)) {var_$1796_value} else {throw var_$1796_error}))
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
var_$1627_changed = false
if ((var_$1806_init && var_$1795_init)) {
if ((var_$1806_changed) || (var_$1795_changed)) {
var_$1627_unknown = (var_$1806_unknown && var_$1795_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = ((if((var_$1806_error == null)) {var_$1806_value} else {throw var_$1806_error}) && (if((var_$1795_error == null)) {var_$1795_value} else {throw var_$1795_error}))
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
var_$1798_changed = false
if ((var_prev$1799_init)) {
if ((var_prev$1799_changed)) {
var_$1798_unknown = (var_prev$1799_unknown)
if ((var_$1798_unknown)) {
var_$1798_error = UnknownEventError(null)
} else {
var_$1798_error = null
try {
var_$1798_value = !((if((var_prev$1799_error == null)) {var_prev$1799_value} else {throw var_prev$1799_error}))
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
var_$1626_changed = false
if ((var_$1627_init && var_$1798_init)) {
if ((var_$1627_changed) || (var_$1798_changed)) {
var_$1626_unknown = (var_$1627_unknown && var_$1798_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) && (if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}))
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
var_$1821_changed = false
if ((var_$1629_changed)) {
var_$1821_value = var_$1629_ts
var_$1821_init = true
var_$1821_unknown = var_$1629_unknown
if ((var_$1821_unknown)) {
var_$1821_error = var_$1629_error
} else {
var_$1821_error = null
}
var_$1821_changed = true
}
var_$1816_changed = false
if ((var_$1824_changed)) {
if ((var_$1817_ts == currTs && var_$1817_lastInit) || (!(var_$1817_ts == currTs) && var_$1817_init)) {
var_$1816_changed = true
var_$1816_init = true
var_$1816_unknown = var_$1824_unknown
if ((var_$1816_unknown)) {
var_$1816_error = var_$1824_error
} else {
if ((var_$1817_ts == currTs)) {
var_$1816_value = var_$1817_lastValue
var_$1816_error = var_$1817_lastError
} else {
var_$1816_value = var_$1817_value
var_$1816_error = var_$1817_error
}
}
}
}
var_finalFalseSince$1625_changed = false
if ((var_$1626_init && var_$1821_init && var_$1816_init)) {
if ((var_$1626_changed) || (var_$1821_changed) || (var_$1816_changed)) {
var_finalFalseSince$1625_unknown = (var_$1626_unknown && var_$1821_unknown && var_$1816_unknown)
if ((var_finalFalseSince$1625_unknown)) {
var_finalFalseSince$1625_error = UnknownEventError(null)
} else {
var_finalFalseSince$1625_error = null
try {
var_finalFalseSince$1625_value = (if ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error})) (if((var_$1821_error == null)) {var_$1821_value} else {throw var_$1821_error}) else (if((var_$1816_error == null)) {var_$1816_value} else {throw var_$1816_error}))
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
var_$1817_changed = false
}
if ((var_finalFalseSince$1625_changed)) {
var_$1817_lastValue = var_$1817_value
var_$1817_lastInit = var_$1817_init
var_$1817_lastError = var_$1817_error
var_$1817_value = var_finalFalseSince$1625_value
var_$1817_init = true
var_$1817_ts = currTs
var_$1817_error = var_finalFalseSince$1625_error
var_$1817_changed = true
var_$1817_unknown = var_finalFalseSince$1625_unknown
}
var_$1623_changed = false
if ((var_$1817_init && var_$1893_init)) {
if ((var_$1817_changed) || (var_$1893_changed)) {
var_$1623_unknown = (var_$1817_unknown && var_$1893_unknown)
if ((var_$1623_unknown)) {
var_$1623_error = UnknownEventError(null)
} else {
var_$1623_error = null
try {
var_$1623_value = ((if((var_$1817_error == null)) {var_$1817_value} else {throw var_$1817_error}) + (if((var_$1893_error == null)) {var_$1893_value} else {throw var_$1893_error}))
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
if ((var_$1623_init && var_$1821_init)) {
if ((var_$1623_changed) || (var_$1821_changed)) {
var_$1622_unknown = (var_$1623_unknown && var_$1821_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1623_error == null)) {var_$1623_value} else {throw var_$1623_error}) < (if((var_$1821_error == null)) {var_$1821_value} else {throw var_$1821_error}))
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
if ((var_$1622_init && var_$1813_init && var_$1824_init)) {
if ((var_$1622_changed) || (var_$1813_changed) || (var_$1824_changed)) {
var_isFinalFalseReset$1621_unknown = (var_$1622_unknown && var_$1813_unknown && var_$1824_unknown)
if ((var_isFinalFalseReset$1621_unknown)) {
var_isFinalFalseReset$1621_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1621_error = null
try {
var_isFinalFalseReset$1621_value = (if ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error})) (if((var_$1813_error == null)) {var_$1813_value} else {throw var_$1813_error}) else (if((var_$1824_error == null)) {var_$1824_value} else {throw var_$1824_error}))
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
if ((var_isFinalFalseReset$1621_changed) || (var_$1824_changed)) {
var_$1620_lastValue = var_$1620_value
var_$1620_lastInit = var_$1620_init
var_$1620_lastError = var_$1620_error
var_$1620_init = true
var_$1620_ts = currTs
var_$1620_changed = true
var_$1620_unknown = (var_isFinalFalseReset$1621_unknown && var_$1824_unknown)
if ((var_isFinalFalseReset$1621_changed)) {
var_$1620_value = var_isFinalFalseReset$1621_value
var_$1620_error = var_isFinalFalseReset$1621_error
} else {
if ((var_$1824_changed)) {
var_$1620_value = var_$1824_value
var_$1620_error = var_$1824_error
}
}
}
var_$1848_changed = false
if ((var_$1866_init && var_$1867_init && var_$1892_init)) {
if ((var_$1866_changed) || (var_$1867_changed) || (var_$1892_changed)) {
var_$1848_unknown = (var_$1866_unknown && var_$1867_unknown && var_$1892_unknown)
if ((var_$1848_unknown)) {
var_$1848_error = UnknownEventError(null)
} else {
var_$1848_error = null
try {
var_$1848_value = (if ((if((var_$1866_error == null)) {var_$1866_value} else {throw var_$1866_error})) (if((var_$1867_error == null)) {var_$1867_value} else {throw var_$1867_error}) else (if((var_$1892_error == null)) {var_$1892_value} else {throw var_$1892_error}))
} catch {
case var_err : Throwable => {
var_$1848_error = var_err
}
}
}
var_$1848_changed = true
}
}
var_stillFulfillableReset$1619_changed = false
if ((var_$1620_init && var_$1776_init && var_$1629_init)) {
if ((var_$1620_changed) || (var_$1776_changed) || (var_$1629_changed)) {
var_stillFulfillableReset$1619_unknown = (var_$1620_unknown && var_$1776_unknown && var_$1629_unknown)
if ((var_stillFulfillableReset$1619_unknown)) {
var_stillFulfillableReset$1619_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1619_error = null
try {
var_stillFulfillableReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1776_error == null)) {var_$1776_value} else {throw var_$1776_error}) else (if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
var_final$1618_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_final$1618_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_final$1618_unknown)) {
var_final$1618_error = UnknownEventError(null)
} else {
var_final$1618_error = null
try {
var_final$1618_value = var_$1829.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
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
var_value$1830_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_value$1830_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_value$1830_unknown)) {
var_value$1830_error = UnknownEventError(null)
} else {
var_value$1830_error = null
try {
var_value$1830_value = var_$1812.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
} catch {
case var_err : Throwable => {
var_value$1830_error = var_err
}
}
}
var_value$1830_init = true
var_value$1830_changed = true
}
}

if ((var_mergeUnit2$1664_unknown) || (!(var_$1848_error == null)) || (var_$1848_changed && (0L >= var_$1848_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1848_changed)) {
if ((var_safeDelay$1754_changed) || (var_mergeUnit2$1664_changed)) {
var_safeDelay$1754_nextTs = (currTs + var_$1848_value)
}
} else {
if ((var_mergeUnit2$1664_changed)) {
var_safeDelay$1754_nextTs = -1L
}
}
}
if ((var_final$1618_changed && var_final$1618_init)) {
out_final.apply(var_final$1618_value, currTs, "final", var_final$1618_error)
}
if ((var_value$1830_changed && var_value$1830_init)) {
out_value.apply(var_value$1830_value, currTs, "value", var_value$1830_error)
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
