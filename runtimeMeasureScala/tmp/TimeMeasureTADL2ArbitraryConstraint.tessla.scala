//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1787 : scala.Function1[List[Any], Any] = ((var_list$1817 : List[Any]) => {
val var_$1818 : Any = var_list$1817(0L.asInstanceOf[Int])
var_$1818
})
var var_removeEventsAfterReset$1678 : scala.Function4[Map[Long, Long], List[Long], Long, Long, Map[Long, Long]] = null
val var_min$1825 : scala.Function2[Long, Long, Long] = ((var_a$1852 : Long, var_b$1853 : Long) => {
val var_$1854 : Long = (if ((var_a$1852 < var_b$1853)) var_a$1852 else var_b$1853)
var_$1854
})
var var_mapMinimumValueRec$1793 : scala.Function2[Map[Long, Long], List[Long], Long] = null
val var_mapMinimumValue$1719 : scala.Function1[Map[Long, Long], Long] = ((var_aMap$1791 : Map[Long, Long]) => {
var var_$1792 : Long = 0L
var_$1792 = var_mapMinimumValueRec$1793.apply(var_aMap$1791, var_aMap$1791.keys.toList)
var_$1792
})
val var_$1739 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1807 : (Boolean, Boolean)) => {
val var_$1808 : Boolean = var_$1807._2
var_$1808
})
val var_$1736 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1805 : (Boolean, Boolean)) => {
val var_$1806 : Boolean = var_$1805._1
var_$1806
})
lazy val var_unmatchedStimulusEventsRemoveReset$1679 : Map[Long, Long] = Map[Long, Long]()
val var_$1713 : (Boolean, Boolean) = (false, true)
val var_$1732 : (Boolean, Boolean) = (false, false)
val var_$1770 : (Boolean, Boolean) = (true, false)
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_stimulus_error : Throwable = null
val var_stimulus_unknown : Boolean = false
var set_var_stimulus : scala.Function2[Long, Long, Unit] = null
var var_stimulus_value : Long = 0L
var var_stimulus_init : Boolean = false
var var_stimulus_ts : Long = 0L
var var_stimulus_changed : Boolean = false
val var_response_error : Throwable = null
val var_response_unknown : Boolean = false
var set_var_response : scala.Function2[Long, Long, Unit] = null
var var_response_value : Long = 0L
var var_response_init : Boolean = false
var var_response_ts : Long = 0L
var var_response_changed : Boolean = false

var_removeEventsAfterReset$1678 = ((var_aMap$1774 : Map[Long, Long], var_remainingKeys$1775 : List[Long], var_timeNow$1776 : Long, var_resetTime$1777 : Long) => {
lazy val var_$1790 : Long = (var_head$1787.apply((var_remainingKeys$1775).asInstanceOf[List[Any]])).asInstanceOf[Long]
var var_$1778 : Map[Long, Long] = Map[Long, Long]()
var_$1778 = (if ((var_remainingKeys$1775.size == 0L)) var_aMap$1774 else var_removeEventsAfterReset$1678.apply((if (((var_aMap$1774(var_$1790) + var_resetTime$1777) < var_timeNow$1776)) (var_aMap$1774 - var_$1790) else var_aMap$1774), var_remainingKeys$1775.tail, var_timeNow$1776, var_resetTime$1777))
var_$1778
})
var_mapMinimumValueRec$1793 = ((var_aMap$1819 : Map[Long, Long], var_keys$1820 : List[Long]) => {
var var_$1821 : Long = 0L
var_$1821 = (if ((var_keys$1820.size == 0L)) 9223372036854775807L else var_min$1825.apply(var_aMap$1819((var_head$1787.apply((var_keys$1820).asInstanceOf[List[Any]])).asInstanceOf[Long]), var_mapMinimumValueRec$1793.apply(var_aMap$1819, var_keys$1820.tail)))
var_$1821
})
out_final = null
out_value = null
set_var_stimulus = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stimulus_changed))) {
var_stimulus_value = value
var_stimulus_init = true
var_stimulus_ts = ts
var_stimulus_changed = true
}
})
set_var_response = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_response_changed))) {
var_response_value = value
var_response_init = true
var_response_ts = ts
var_response_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1648_changed : Boolean = false
var var_$1648_value : Long = 0L
var var_$1648_unknown : Boolean = false
var var_$1648_error : Throwable = null
var var_defaultTime$1647_changed : Boolean = true
var var_defaultTime$1647_value : Long = -1L
var var_defaultTime$1647_init : Boolean = true
var var_defaultTime$1647_error : Throwable = null
var var_defaultTime$1647_unknown : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_value : Long = 0L
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_defaultTime$1692_changed : Boolean = true
var var_defaultTime$1692_value : Long = -1L
var var_defaultTime$1692_init : Boolean = true
var var_defaultTime$1692_error : Throwable = null
var var_defaultTime$1692_unknown : Boolean = false
var var_$1635_changed : Boolean = false
var var_$1635_unknown : Boolean = false
var var_$1635_error : Throwable = null
var var_$1635_value : Boolean = false
var var_$1635_init : Boolean = false
var var_$1646_changed : Boolean = false
var var_$1646_unknown : Boolean = false
var var_$1646_error : Throwable = null
var var_$1646_value : Boolean = false
var var_$1646_init : Boolean = false
var var_$1655_changed : Boolean = false
var var_$1655_unknown : Boolean = false
var var_$1655_error : Throwable = null
var var_$1653_changed : Boolean = false
var var_$1653_init : Boolean = false
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : Map[Long, Long] = Map[Long, Long]()
var var_$1652_changed : Boolean = false
var var_$1652_unknown : Boolean = false
var var_$1652_error : Throwable = null
var var_$1652_value : Boolean = false
var var_$1652_init : Boolean = false
var var_$1651_changed : Boolean = false
var var_$1651_unknown : Boolean = false
var var_$1651_error : Throwable = null
var var_$1651_value : Boolean = false
var var_$1651_init : Boolean = false
var var_$1645_changed : Boolean = false
var var_$1645_unknown : Boolean = false
var var_$1645_error : Throwable = null
var var_$1645_value : Boolean = false
var var_$1645_init : Boolean = false
var var_$1656_changed : Boolean = false
var var_$1656_unknown : Boolean = false
var var_$1656_error : Throwable = null
var var_$1656_value : Map[Long, Long] = Map[Long, Long]()
var var_$1656_init : Boolean = false
var var_unmatchedStimulusEventsNewStimulus$1644_changed : Boolean = false
var var_unmatchedStimulusEventsNewStimulus$1644_unknown : Boolean = false
var var_unmatchedStimulusEventsNewStimulus$1644_error : Throwable = null
var var_unmatchedStimulusEventsNewStimulus$1644_value : Map[Long, Long] = Map[Long, Long]()
val var_$1666_value : Map[Long, Long] = Map[Long, Long]()
val var_$1666_error : Throwable = null
val var_$1666_changed : Boolean = false
val var_$1666_unknown : Boolean = false
var var_unmatchedStimulusEventsNewStimulus$1665_changed : Boolean = true
var var_unmatchedStimulusEventsNewStimulus$1665_value : Map[Long, Long] = var_unmatchedStimulusEventsRemoveReset$1679
var var_unmatchedStimulusEventsNewStimulus$1665_error : Throwable = null
var var_unmatchedStimulusEventsNewStimulus$1665_unknown : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_init : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_value : Map[Long, Long] = Map[Long, Long]()
var var_$1669_error : Throwable = null
var var_$1668_changed : Boolean = false
var var_$1668_unknown : Boolean = false
var var_$1668_error : Throwable = null
var var_$1668_value : List[Long] = List[Long]()
var var_$1668_init : Boolean = false
var var_$1795_changed : Boolean = false
var var_$1795_error : Throwable = null
var var_$1795_unknown : Boolean = false
var var_$1674_changed : Boolean = false
var var_$1674_error : Throwable = null
var var_$1674_unknown : Boolean = false
var var_mergeUnit2$1726_changed : Boolean = false
var var_mergeUnit2$1726_ts : Long = 0L
var var_mergeUnit2$1726_unknown : Boolean = false
var var_mergeUnit2$1726_error : Throwable = null
var var_$1838_changed : Boolean = false
var var_$1838_value : Long = 0L
var var_$1838_init : Boolean = false
var var_$1838_unknown : Boolean = false
var var_$1838_error : Throwable = null
val var_$1845_value : Long = 0L
val var_$1845_error : Throwable = null
val var_$1845_changed : Boolean = false
val var_$1845_unknown : Boolean = false
var var_$1761_changed : Boolean = true
var var_$1761_value : Long = 9223372036854775807L
var var_$1761_init : Boolean = true
var var_$1761_error : Throwable = null
var var_$1761_unknown : Boolean = false
var var_unmatchedStimulusEventsRemoveReset$1642_changed : Boolean = false
var var_unmatchedStimulusEventsRemoveReset$1642_unknown : Boolean = false
var var_unmatchedStimulusEventsRemoveReset$1642_error : Throwable = null
var var_unmatchedStimulusEventsRemoveReset$1642_value : Map[Long, Long] = Map[Long, Long]()
var var_$1707_changed : Boolean = true
var var_$1707_value : Map[Long, Long] = var_unmatchedStimulusEventsRemoveReset$1679
var var_$1707_init : Boolean = true
var var_$1707_error : Throwable = null
var var_$1707_unknown : Boolean = false
var var_$1681_changed : Boolean = true
var var_$1681_value : Long = -1L
var var_$1681_error : Throwable = null
var var_$1681_unknown : Boolean = false
var var_$1680_changed : Boolean = false
var var_$1680_init : Boolean = false
var var_$1680_unknown : Boolean = false
var var_$1680_value : Long = 0L
var var_$1680_error : Throwable = null
var var_$1640_changed : Boolean = false
var var_$1640_unknown : Boolean = false
var var_$1640_error : Throwable = null
var var_$1640_value : Boolean = false
var var_$1640_init : Boolean = false
var var_$1634_changed : Boolean = false
var var_$1634_unknown : Boolean = false
var var_$1634_error : Throwable = null
var var_$1634_value : Boolean = false
var var_$1634_init : Boolean = false
var var_$1685_changed : Boolean = false
var var_$1685_unknown : Boolean = false
var var_$1685_error : Throwable = null
var var_$1685_value : Long = 0L
var var_$1685_init : Boolean = false
var var_$1701_changed : Boolean = true
var var_$1701_value : Long = 50L
var var_$1701_init : Boolean = true
var var_$1701_error : Throwable = null
var var_$1701_unknown : Boolean = false
var var_$1684_changed : Boolean = false
var var_$1684_unknown : Boolean = false
var var_$1684_error : Throwable = null
var var_$1684_value : Long = 0L
var var_$1684_init : Boolean = false
var var_$1683_changed : Boolean = false
var var_$1683_unknown : Boolean = false
var var_$1683_error : Throwable = null
var var_$1683_value : Boolean = false
var var_$1683_init : Boolean = false
var var_$1633_changed : Boolean = false
var var_$1633_unknown : Boolean = false
var var_$1633_error : Throwable = null
var var_$1633_value : Boolean = false
var var_$1633_init : Boolean = false
var var_$1694_changed : Boolean = false
var var_$1694_unknown : Boolean = false
var var_$1694_error : Throwable = null
var var_$1694_value : Boolean = false
var var_$1694_init : Boolean = false
var var_$1632_changed : Boolean = false
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : Boolean = false
var var_$1632_init : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : Map[Long, Long] = Map[Long, Long]()
var var_$1705_init : Boolean = false
var var_unmatchedStimulusEvents$1631_changed : Boolean = false
var var_unmatchedStimulusEvents$1631_unknown : Boolean = false
var var_unmatchedStimulusEvents$1631_error : Throwable = null
var var_unmatchedStimulusEvents$1631_value : Map[Long, Long] = Map[Long, Long]()
var var_$1663_changed : Boolean = false
var var_$1663_lastValue : Map[Long, Long] = Map[Long, Long]()
var var_$1663_lastInit : Boolean = false
var var_$1663_lastError : Throwable = null
var var_$1663_init : Boolean = false
var var_$1663_ts : Long = 0L
var var_$1663_unknown : Boolean = false
var var_$1663_value : Map[Long, Long] = Map[Long, Long]()
var var_$1663_error : Throwable = null
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Long = 0L
var var_$1629_init : Boolean = false
var var_$1709_changed : Boolean = true
var var_$1709_value : Long = 0L
var var_$1709_init : Boolean = true
var var_$1709_error : Throwable = null
var var_$1709_unknown : Boolean = false
var var_$1628_changed : Boolean = false
var var_$1628_unknown : Boolean = false
var var_$1628_error : Throwable = null
var var_$1628_value : Boolean = false
var var_$1628_init : Boolean = false
val var_$1734_value : (Boolean, Boolean) = (false, false)
val var_$1734_error : Throwable = null
val var_$1734_changed : Boolean = false
val var_$1734_unknown : Boolean = false
var var_$1711_changed : Boolean = true
var var_$1711_value : (Boolean, Boolean) = var_$1713
var var_$1711_init : Boolean = true
var var_$1711_error : Throwable = null
var var_$1711_unknown : Boolean = false
var var_$1834_changed : Boolean = false
var var_$1834_unknown : Boolean = false
var var_$1834_error : Throwable = null
var var_$1834_value : Long = 0L
var var_$1834_init : Boolean = false
var var_$1833_changed : Boolean = false
var var_$1833_unknown : Boolean = false
var var_$1833_error : Throwable = null
var var_$1833_value : Long = 0L
var var_$1833_init : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_unknown : Boolean = false
var var_safeDelay$1729_changed : Boolean = false
val var_safeDelay$1729_error : Throwable = null
var var_safeDelay$1729_unknown : Boolean = false
var var_$1727_changed : Boolean = false
var var_$1727_error : Throwable = null
var var_$1727_unknown : Boolean = false
var var_mergeUnit2$1723_changed : Boolean = false
var var_mergeUnit2$1723_ts : Long = 0L
var var_mergeUnit2$1723_unknown : Boolean = false
var var_mergeUnit2$1723_error : Throwable = null
var var_$1722_changed : Boolean = false
var var_$1722_value : Long = 0L
var var_$1722_init : Boolean = false
var var_$1722_unknown : Boolean = false
var var_$1722_error : Throwable = null
var var_$1715_changed : Boolean = false
var var_$1715_unknown : Boolean = false
var var_$1715_error : Throwable = null
var var_$1715_value : Boolean = false
var var_$1715_init : Boolean = false
var var_$1730_changed : Boolean = true
var var_$1730_value : (Boolean, Boolean) = var_$1732
var var_$1730_init : Boolean = true
var var_$1730_error : Throwable = null
var var_$1730_unknown : Boolean = false
var var_$1733_changed : Boolean = true
var var_$1733_value : (Boolean, Boolean) = var_$1770
var var_$1733_init : Boolean = true
var var_$1733_error : Throwable = null
var var_$1733_unknown : Boolean = false
var var_$1714_changed : Boolean = false
var var_$1714_unknown : Boolean = false
var var_$1714_error : Throwable = null
var var_$1714_value : (Boolean, Boolean) = (false, false)
var var_$1714_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : (Boolean, Boolean) = (false, false)
var var_$1627_init : Boolean = false
var var_$1627_ts : Long = 0L
var var_$1748_changed : Boolean = false
var var_$1748_unknown : Boolean = false
var var_$1748_error : Throwable = null
var var_$1748_value : Boolean = false
var var_$1748_init : Boolean = false
var var_$1738_changed : Boolean = false
var var_$1738_unknown : Boolean = false
var var_$1738_error : Throwable = null
var var_$1738_value : Boolean = false
var var_$1738_init : Boolean = false
var var_$1737_changed : Boolean = false
var var_$1737_unknown : Boolean = false
var var_$1737_error : Throwable = null
var var_$1737_value : Boolean = false
var var_$1737_init : Boolean = false
var var_$1625_changed : Boolean = false
var var_$1625_unknown : Boolean = false
var var_$1625_error : Throwable = null
var var_$1625_value : Boolean = false
var var_$1625_init : Boolean = false
var var_$1744_changed : Boolean = false
var var_$1744_init : Boolean = false
var var_$1744_unknown : Boolean = false
var var_$1744_error : Throwable = null
var var_$1744_value : Boolean = false
val var_$1765_value : Boolean = false
val var_$1765_error : Throwable = null
val var_$1765_changed : Boolean = false
val var_$1765_unknown : Boolean = false
var var_$1750_changed : Boolean = true
var var_$1750_value : Boolean = true
var var_$1750_init : Boolean = true
var var_$1750_error : Throwable = null
var var_$1750_unknown : Boolean = false
var var_$1747_changed : Boolean = false
var var_$1747_unknown : Boolean = false
var var_$1747_error : Throwable = null
var var_$1747_value : Boolean = false
var var_$1747_init : Boolean = false
var var_$1764_changed : Boolean = true
var var_$1764_value : Boolean = false
var var_$1764_init : Boolean = true
var var_$1764_error : Throwable = null
var var_$1764_unknown : Boolean = false
var var_$1752_changed : Boolean = false
var var_$1752_unknown : Boolean = false
var var_$1752_error : Throwable = null
var var_$1752_value : Boolean = false
var var_$1752_init : Boolean = false
var var_$1746_changed : Boolean = false
var var_$1746_unknown : Boolean = false
var var_$1746_error : Throwable = null
var var_$1746_value : Boolean = false
var var_$1746_init : Boolean = false
var var_isFinalFalse$1743_changed : Boolean = false
var var_isFinalFalse$1743_unknown : Boolean = false
var var_isFinalFalse$1743_error : Throwable = null
var var_isFinalFalse$1743_value : Boolean = false
var var_$1766_changed : Boolean = true
var var_$1766_lastValue : Boolean = false
var var_$1766_lastInit : Boolean = false
var var_$1766_lastError : Throwable = null
var var_$1766_value : Boolean = false
var var_$1766_init : Boolean = true
var var_$1766_ts : Long = 0L
var var_$1766_error : Throwable = null
var var_$1766_unknown : Boolean = false
var var_prev$1741_changed : Boolean = false
var var_prev$1741_init : Boolean = false
var var_prev$1741_unknown : Boolean = false
var var_prev$1741_error : Throwable = null
var var_prev$1741_value : Boolean = false
var var_$1740_changed : Boolean = false
var var_$1740_unknown : Boolean = false
var var_$1740_error : Throwable = null
var var_$1740_value : Boolean = false
var var_$1740_init : Boolean = false
var var_$1624_changed : Boolean = false
var var_$1624_unknown : Boolean = false
var var_$1624_error : Throwable = null
var var_$1624_value : Boolean = false
var var_$1624_init : Boolean = false
var var_$1763_changed : Boolean = false
var var_$1763_value : Long = 0L
var var_$1763_init : Boolean = false
var var_$1763_unknown : Boolean = false
var var_$1763_error : Throwable = null
var var_$1758_changed : Boolean = false
var var_$1758_init : Boolean = false
var var_$1758_unknown : Boolean = false
var var_$1758_error : Throwable = null
var var_$1758_value : Long = 0L
var var_finalFalseSince$1623_changed : Boolean = false
var var_finalFalseSince$1623_unknown : Boolean = false
var var_finalFalseSince$1623_error : Throwable = null
var var_finalFalseSince$1623_value : Long = 0L
var var_$1622_changed : Boolean = true
var var_$1622_lastValue : Long = 0L
var var_$1622_lastInit : Boolean = false
var var_$1622_lastError : Throwable = null
var var_$1622_value : Long = 9223372036854775807L
var var_$1622_init : Boolean = true
var var_$1622_ts : Long = 0L
var var_$1622_error : Throwable = null
var var_$1622_unknown : Boolean = false
var var_$1621_changed : Boolean = false
var var_$1621_unknown : Boolean = false
var var_$1621_error : Throwable = null
var var_$1621_value : Long = 0L
var var_$1621_init : Boolean = false
var var_$1620_changed : Boolean = false
var var_$1620_unknown : Boolean = false
var var_$1620_error : Throwable = null
var var_$1620_value : Boolean = false
var var_$1620_init : Boolean = false
var var_isFinalFalseReset$1619_changed : Boolean = false
var var_isFinalFalseReset$1619_unknown : Boolean = false
var var_isFinalFalseReset$1619_error : Throwable = null
var var_isFinalFalseReset$1619_value : Boolean = false
var var_$1745_changed : Boolean = false
var var_$1745_lastValue : Boolean = false
var var_$1745_lastInit : Boolean = false
var var_$1745_lastError : Throwable = null
var var_$1745_init : Boolean = false
var var_$1745_ts : Long = 0L
var var_$1745_unknown : Boolean = false
var var_$1745_value : Boolean = false
var var_$1745_error : Throwable = null
var var_stillFulfillableReset$1617_changed : Boolean = false
var var_stillFulfillableReset$1617_unknown : Boolean = false
var var_stillFulfillableReset$1617_error : Throwable = null
var var_stillFulfillableReset$1617_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1617_init : Boolean = false
var var_final$1616_changed : Boolean = false
var var_final$1616_unknown : Boolean = false
var var_final$1616_error : Throwable = null
var var_final$1616_value : Boolean = false
var var_final$1616_init : Boolean = false
var var_$1832_changed : Boolean = false
var var_$1832_unknown : Boolean = false
var var_$1832_error : Throwable = null
var var_$1832_value : Long = 0L
var var_$1832_init : Boolean = false
var var_$1844_changed : Boolean = true
var var_$1844_value : Long = 1L
var var_$1844_init : Boolean = true
var var_$1844_error : Throwable = null
var var_$1844_unknown : Boolean = false
var var_$1831_changed : Boolean = false
var var_$1831_unknown : Boolean = false
var var_$1831_error : Throwable = null
var var_$1831_value : Long = 0L
var var_$1831_init : Boolean = false
var var_$1831_ts : Long = 0L
var var_$1830_changed : Boolean = false
var var_$1830_unknown : Boolean = false
var var_$1830_error : Throwable = null
var var_$1830_value : Boolean = false
var var_$1830_init : Boolean = false
var var_$1851_changed : Boolean = false
var var_$1851_value : Long = 0L
var var_$1851_init : Boolean = false
var var_$1851_unknown : Boolean = false
var var_$1851_error : Throwable = null
var var_$1848_changed : Boolean = false
var var_$1848_unknown : Boolean = false
var var_$1848_error : Throwable = null
var var_$1848_value : Long = 0L
var var_$1848_init : Boolean = false
var var_$1799_changed : Boolean = false
var var_$1799_unknown : Boolean = false
var var_$1799_error : Throwable = null
var var_$1799_value : Long = 0L
var var_value$1772_changed : Boolean = false
var var_value$1772_unknown : Boolean = false
var var_value$1772_error : Throwable = null
var var_value$1772_value : Boolean = false
var var_value$1772_init : Boolean = false
var var_safeDelay$1729_nextTs : Long = -1L



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

if (((var_safeDelay$1729_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1729_nextTs))) {
currTs = var_safeDelay$1729_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

var_$1648_changed = false
if ((var_stimulus_changed)) {
var_$1648_value = var_stimulus_ts
var_$1648_unknown = var_stimulus_unknown
if ((var_$1648_unknown)) {
var_$1648_error = var_stimulus_error
} else {
var_$1648_error = null
}
var_$1648_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1647_changed = false
}
if ((var_$1648_changed)) {
var_defaultTime$1647_value = var_$1648_value
var_defaultTime$1647_init = true
var_defaultTime$1647_error = var_$1648_error
var_defaultTime$1647_changed = true
var_defaultTime$1647_unknown = var_$1648_unknown
}
var_$1704_changed = false
if ((var_response_changed)) {
var_$1704_value = var_response_ts
var_$1704_unknown = var_response_unknown
if ((var_$1704_unknown)) {
var_$1704_error = var_response_error
} else {
var_$1704_error = null
}
var_$1704_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1692_changed = false
}
if ((var_$1704_changed)) {
var_defaultTime$1692_value = var_$1704_value
var_defaultTime$1692_init = true
var_defaultTime$1692_error = var_$1704_error
var_defaultTime$1692_changed = true
var_defaultTime$1692_unknown = var_$1704_unknown
}
var_$1635_changed = false
if ((var_defaultTime$1647_init && var_defaultTime$1692_init)) {
if ((var_defaultTime$1647_changed) || (var_defaultTime$1692_changed)) {
var_$1635_unknown = (var_defaultTime$1647_unknown && var_defaultTime$1692_unknown)
if ((var_$1635_unknown)) {
var_$1635_error = UnknownEventError(null)
} else {
var_$1635_error = null
try {
var_$1635_value = ((if((var_defaultTime$1647_error == null)) {var_defaultTime$1647_value} else {throw var_defaultTime$1647_error}) <= (if((var_defaultTime$1692_error == null)) {var_defaultTime$1692_value} else {throw var_defaultTime$1692_error}))
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
var_$1646_changed = false
if ((var_defaultTime$1647_init && var_defaultTime$1692_init)) {
if ((var_defaultTime$1647_changed) || (var_defaultTime$1692_changed)) {
var_$1646_unknown = (var_defaultTime$1647_unknown && var_defaultTime$1692_unknown)
if ((var_$1646_unknown)) {
var_$1646_error = UnknownEventError(null)
} else {
var_$1646_error = null
try {
var_$1646_value = ((if((var_defaultTime$1647_error == null)) {var_defaultTime$1647_value} else {throw var_defaultTime$1647_error}) >= (if((var_defaultTime$1692_error == null)) {var_defaultTime$1692_value} else {throw var_defaultTime$1692_error}))
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
var_$1655_changed = false
if ((var_stimulus_changed) || (var_response_changed)) {
var_$1655_changed = true
var_$1655_unknown = (var_stimulus_unknown && var_response_unknown)
if ((var_stimulus_changed)) {
var_$1655_error = var_stimulus_error
} else {
if ((var_response_changed)) {
var_$1655_error = var_response_error
}
}
}
var_$1653_changed = false
if ((var_$1655_changed)) {
if ((var_$1663_ts == currTs && var_$1663_lastInit) || (!(var_$1663_ts == currTs) && var_$1663_init)) {
var_$1653_changed = true
var_$1653_init = true
var_$1653_unknown = var_$1655_unknown
if ((var_$1653_unknown)) {
var_$1653_error = var_$1655_error
} else {
if ((var_$1663_ts == currTs)) {
var_$1653_value = var_$1663_lastValue
var_$1653_error = var_$1663_lastError
} else {
var_$1653_value = var_$1663_value
var_$1653_error = var_$1663_error
}
}
}
}
var_$1652_changed = false
if ((var_$1653_init && var_stimulus_init)) {
if ((var_$1653_changed) || (var_stimulus_changed)) {
var_$1652_unknown = (var_$1653_unknown && var_stimulus_unknown)
if ((var_$1652_unknown)) {
var_$1652_error = UnknownEventError(null)
} else {
var_$1652_error = null
try {
var_$1652_value = (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}).contains((if((var_stimulus_error == null)) {var_stimulus_value} else {throw var_stimulus_error}))
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
var_$1651_changed = false
if ((var_$1652_init)) {
if ((var_$1652_changed)) {
var_$1651_unknown = (var_$1652_unknown)
if ((var_$1651_unknown)) {
var_$1651_error = UnknownEventError(null)
} else {
var_$1651_error = null
try {
var_$1651_value = !((if((var_$1652_error == null)) {var_$1652_value} else {throw var_$1652_error}))
} catch {
case var_err : Throwable => {
var_$1651_error = var_err
}
}
}
var_$1651_init = true
var_$1651_changed = true
}
}
var_$1645_changed = false
if ((var_$1646_init && var_$1651_init)) {
if ((var_$1646_changed) || (var_$1651_changed)) {
var_$1645_unknown = (var_$1646_unknown && var_$1651_unknown)
if ((var_$1645_unknown)) {
var_$1645_error = UnknownEventError(null)
} else {
var_$1645_error = null
try {
var_$1645_value = ((if((var_$1646_error == null)) {var_$1646_value} else {throw var_$1646_error}) && (if((var_$1651_error == null)) {var_$1651_value} else {throw var_$1651_error}))
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
var_$1656_changed = false
if ((var_$1653_init && var_stimulus_init && var_defaultTime$1647_init)) {
if ((var_$1653_changed) || (var_stimulus_changed) || (var_defaultTime$1647_changed)) {
var_$1656_unknown = (var_$1653_unknown && var_stimulus_unknown && var_defaultTime$1647_unknown)
if ((var_$1656_unknown)) {
var_$1656_error = UnknownEventError(null)
} else {
var_$1656_error = null
try {
var_$1656_value = ((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}) + (((if((var_stimulus_error == null)) {var_stimulus_value} else {throw var_stimulus_error})) -> ((if((var_defaultTime$1647_error == null)) {var_defaultTime$1647_value} else {throw var_defaultTime$1647_error}))))
} catch {
case var_err : Throwable => {
var_$1656_error = var_err
}
}
}
var_$1656_init = true
var_$1656_changed = true
}
}
var_unmatchedStimulusEventsNewStimulus$1644_changed = false
if ((var_$1645_init && var_$1656_init && var_$1653_init)) {
if ((var_$1645_changed) || (var_$1656_changed) || (var_$1653_changed)) {
var_unmatchedStimulusEventsNewStimulus$1644_unknown = (var_$1645_unknown && var_$1656_unknown && var_$1653_unknown)
if ((var_unmatchedStimulusEventsNewStimulus$1644_unknown)) {
var_unmatchedStimulusEventsNewStimulus$1644_error = UnknownEventError(null)
} else {
var_unmatchedStimulusEventsNewStimulus$1644_error = null
try {
var_unmatchedStimulusEventsNewStimulus$1644_value = (if ((if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error})) (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}) else (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}))
} catch {
case var_err : Throwable => {
var_unmatchedStimulusEventsNewStimulus$1644_error = var_err
}
}
}
var_unmatchedStimulusEventsNewStimulus$1644_changed = true
}
}
if ((!(currTs == 0L))) {
var_unmatchedStimulusEventsNewStimulus$1665_changed = false
}
if ((var_$1666_changed)) {
var_unmatchedStimulusEventsNewStimulus$1665_value = var_$1666_value
var_unmatchedStimulusEventsNewStimulus$1665_error = var_$1666_error
var_unmatchedStimulusEventsNewStimulus$1665_changed = true
var_unmatchedStimulusEventsNewStimulus$1665_unknown = var_$1666_unknown
}
var_$1669_changed = false
if ((var_unmatchedStimulusEventsNewStimulus$1644_changed) || (var_unmatchedStimulusEventsNewStimulus$1665_changed)) {
var_$1669_init = true
var_$1669_changed = true
var_$1669_unknown = (var_unmatchedStimulusEventsNewStimulus$1644_unknown && var_unmatchedStimulusEventsNewStimulus$1665_unknown)
if ((var_unmatchedStimulusEventsNewStimulus$1644_changed)) {
var_$1669_value = var_unmatchedStimulusEventsNewStimulus$1644_value
var_$1669_error = var_unmatchedStimulusEventsNewStimulus$1644_error
} else {
if ((var_unmatchedStimulusEventsNewStimulus$1665_changed)) {
var_$1669_value = var_unmatchedStimulusEventsNewStimulus$1665_value
var_$1669_error = var_unmatchedStimulusEventsNewStimulus$1665_error
}
}
}
var_$1668_changed = false
if ((var_$1669_init)) {
if ((var_$1669_changed)) {
var_$1668_unknown = (var_$1669_unknown)
if ((var_$1668_unknown)) {
var_$1668_error = UnknownEventError(null)
} else {
var_$1668_error = null
try {
var_$1668_value = (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}).keys.toList
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
var_$1795_changed = false
if ((var_stimulus_changed)) {
if ((var_stimulus_unknown)) {
var_$1795_error = UnknownEventError(var_stimulus_error)
} else {
var_$1795_error = null
}
var_$1795_changed = var_stimulus_changed
var_$1795_unknown = var_stimulus_unknown
}
var_$1674_changed = false
if ((var_response_changed)) {
if ((var_response_unknown)) {
var_$1674_error = UnknownEventError(var_response_error)
} else {
var_$1674_error = null
}
var_$1674_changed = var_response_changed
var_$1674_unknown = var_response_unknown
}
var_mergeUnit2$1726_changed = false
if ((var_$1795_changed) || (var_$1674_changed)) {
var_mergeUnit2$1726_ts = currTs
var_mergeUnit2$1726_changed = true
var_mergeUnit2$1726_unknown = (var_$1795_unknown && var_$1674_unknown)
if ((var_$1795_changed)) {
var_mergeUnit2$1726_error = var_$1795_error
} else {
if ((var_$1674_changed)) {
var_mergeUnit2$1726_error = var_$1674_error
}
}
}
var_$1838_changed = false
if ((var_mergeUnit2$1726_changed)) {
var_$1838_value = var_mergeUnit2$1726_ts
var_$1838_init = true
var_$1838_unknown = var_mergeUnit2$1726_unknown
if ((var_$1838_unknown)) {
var_$1838_error = var_mergeUnit2$1726_error
} else {
var_$1838_error = null
}
var_$1838_changed = true
}
if ((!(currTs == 0L))) {
var_$1761_changed = false
}
if ((var_$1845_changed)) {
var_$1761_value = var_$1845_value
var_$1761_init = true
var_$1761_error = var_$1845_error
var_$1761_changed = true
var_$1761_unknown = var_$1845_unknown
}
var_unmatchedStimulusEventsRemoveReset$1642_changed = false
if ((var_$1669_init && var_$1668_init && var_$1838_init && var_$1761_init)) {
if ((var_$1669_changed) || (var_$1668_changed) || (var_$1838_changed) || (var_$1761_changed)) {
var_unmatchedStimulusEventsRemoveReset$1642_unknown = (var_$1669_unknown && var_$1668_unknown && var_$1838_unknown && var_$1761_unknown)
if ((var_unmatchedStimulusEventsRemoveReset$1642_unknown)) {
var_unmatchedStimulusEventsRemoveReset$1642_error = UnknownEventError(null)
} else {
var_unmatchedStimulusEventsRemoveReset$1642_error = null
try {
var_unmatchedStimulusEventsRemoveReset$1642_value = var_removeEventsAfterReset$1678.apply((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}), (if((var_$1668_error == null)) {var_$1668_value} else {throw var_$1668_error}), (if((var_$1838_error == null)) {var_$1838_value} else {throw var_$1838_error}), (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
} catch {
case var_err : Throwable => {
var_unmatchedStimulusEventsRemoveReset$1642_error = var_err
}
}
}
var_unmatchedStimulusEventsRemoveReset$1642_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1707_changed = false
}
if ((var_unmatchedStimulusEventsRemoveReset$1642_changed)) {
var_$1707_value = var_unmatchedStimulusEventsRemoveReset$1642_value
var_$1707_init = true
var_$1707_error = var_unmatchedStimulusEventsRemoveReset$1642_error
var_$1707_changed = true
var_$1707_unknown = var_unmatchedStimulusEventsRemoveReset$1642_unknown
}
if ((!(currTs == 0L))) {
var_$1681_changed = false
}
if ((var_$1845_changed)) {
var_$1681_value = var_$1845_value
var_$1681_error = var_$1845_error
var_$1681_changed = true
var_$1681_unknown = var_$1845_unknown
}
var_$1680_changed = false
if ((var_response_changed) || (var_$1681_changed)) {
var_$1680_init = true
var_$1680_changed = true
var_$1680_unknown = (var_response_unknown && var_$1681_unknown)
if ((var_response_changed)) {
var_$1680_value = var_response_value
var_$1680_error = var_response_error
} else {
if ((var_$1681_changed)) {
var_$1680_value = var_$1681_value
var_$1680_error = var_$1681_error
}
}
}
var_$1640_changed = false
if ((var_$1707_init && var_$1680_init)) {
if ((var_$1707_changed) || (var_$1680_changed)) {
var_$1640_unknown = (var_$1707_unknown && var_$1680_unknown)
if ((var_$1640_unknown)) {
var_$1640_error = UnknownEventError(null)
} else {
var_$1640_error = null
try {
var_$1640_value = (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}).contains((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
} catch {
case var_err : Throwable => {
var_$1640_error = var_err
}
}
}
var_$1640_init = true
var_$1640_changed = true
}
}
var_$1634_changed = false
if ((var_$1635_init && var_$1640_init)) {
if ((var_$1635_changed) || (var_$1640_changed)) {
var_$1634_unknown = (var_$1635_unknown && var_$1640_unknown)
if ((var_$1634_unknown)) {
var_$1634_error = UnknownEventError(null)
} else {
var_$1634_error = null
try {
var_$1634_value = ((if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error}) && (if((var_$1640_error == null)) {var_$1640_value} else {throw var_$1640_error}))
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
var_$1685_changed = false
if ((var_$1707_init && var_$1680_init)) {
if ((var_$1707_changed) || (var_$1680_changed)) {
var_$1685_unknown = (var_$1707_unknown && var_$1680_unknown)
if ((var_$1685_unknown)) {
var_$1685_error = UnknownEventError(null)
} else {
var_$1685_error = null
try {
var_$1685_value = (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error})((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
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
var_$1701_changed = false
}
if ((var_$1845_changed)) {
var_$1701_value = var_$1845_value
var_$1701_init = true
var_$1701_error = var_$1845_error
var_$1701_changed = true
var_$1701_unknown = var_$1845_unknown
}
var_$1684_changed = false
if ((var_$1685_init && var_$1701_init)) {
if ((var_$1685_changed) || (var_$1701_changed)) {
var_$1684_unknown = (var_$1685_unknown && var_$1701_unknown)
if ((var_$1684_unknown)) {
var_$1684_error = UnknownEventError(null)
} else {
var_$1684_error = null
try {
var_$1684_value = ((if((var_$1685_error == null)) {var_$1685_value} else {throw var_$1685_error}) + (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}))
} catch {
case var_err : Throwable => {
var_$1684_error = var_err
}
}
}
var_$1684_init = true
var_$1684_changed = true
}
}
var_$1683_changed = false
if ((var_$1684_init && var_defaultTime$1692_init)) {
if ((var_$1684_changed) || (var_defaultTime$1692_changed)) {
var_$1683_unknown = (var_$1684_unknown && var_defaultTime$1692_unknown)
if ((var_$1683_unknown)) {
var_$1683_error = UnknownEventError(null)
} else {
var_$1683_error = null
try {
var_$1683_value = ((if((var_$1684_error == null)) {var_$1684_value} else {throw var_$1684_error}) <= (if((var_defaultTime$1692_error == null)) {var_defaultTime$1692_value} else {throw var_defaultTime$1692_error}))
} catch {
case var_err : Throwable => {
var_$1683_error = var_err
}
}
}
var_$1683_init = true
var_$1683_changed = true
}
}
var_$1633_changed = false
if ((var_$1634_init && var_$1683_init)) {
if ((var_$1634_changed) || (var_$1683_changed)) {
var_$1633_unknown = (var_$1634_unknown && var_$1683_unknown)
if ((var_$1633_unknown)) {
var_$1633_error = UnknownEventError(null)
} else {
var_$1633_error = null
try {
var_$1633_value = ((if((var_$1634_error == null)) {var_$1634_value} else {throw var_$1634_error}) && (if((var_$1683_error == null)) {var_$1683_value} else {throw var_$1683_error}))
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
var_$1694_changed = false
if ((var_$1684_init && var_defaultTime$1692_init)) {
if ((var_$1684_changed) || (var_defaultTime$1692_changed)) {
var_$1694_unknown = (var_$1684_unknown && var_defaultTime$1692_unknown)
if ((var_$1694_unknown)) {
var_$1694_error = UnknownEventError(null)
} else {
var_$1694_error = null
try {
var_$1694_value = ((if((var_$1684_error == null)) {var_$1684_value} else {throw var_$1684_error}) >= (if((var_defaultTime$1692_error == null)) {var_defaultTime$1692_value} else {throw var_defaultTime$1692_error}))
} catch {
case var_err : Throwable => {
var_$1694_error = var_err
}
}
}
var_$1694_init = true
var_$1694_changed = true
}
}
var_$1632_changed = false
if ((var_$1633_init && var_$1694_init)) {
if ((var_$1633_changed) || (var_$1694_changed)) {
var_$1632_unknown = (var_$1633_unknown && var_$1694_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = ((if((var_$1633_error == null)) {var_$1633_value} else {throw var_$1633_error}) && (if((var_$1694_error == null)) {var_$1694_value} else {throw var_$1694_error}))
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
var_$1705_changed = false
if ((var_$1707_init && var_response_init)) {
if ((var_$1707_changed) || (var_response_changed)) {
var_$1705_unknown = (var_$1707_unknown && var_response_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = ((if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) - (if((var_response_error == null)) {var_response_value} else {throw var_response_error}))
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
var_unmatchedStimulusEvents$1631_changed = false
if ((var_$1632_init && var_$1705_init && var_$1707_init)) {
if ((var_$1632_changed) || (var_$1705_changed) || (var_$1707_changed)) {
var_unmatchedStimulusEvents$1631_unknown = (var_$1632_unknown && var_$1705_unknown && var_$1707_unknown)
if ((var_unmatchedStimulusEvents$1631_unknown)) {
var_unmatchedStimulusEvents$1631_error = UnknownEventError(null)
} else {
var_unmatchedStimulusEvents$1631_error = null
try {
var_unmatchedStimulusEvents$1631_value = (if ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error})) (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}) else (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
} catch {
case var_err : Throwable => {
var_unmatchedStimulusEvents$1631_error = var_err
}
}
}
var_unmatchedStimulusEvents$1631_changed = true
}
}
var_$1663_changed = false
if ((var_unmatchedStimulusEvents$1631_changed) || (var_$1707_changed)) {
var_$1663_lastValue = var_$1663_value
var_$1663_lastInit = var_$1663_init
var_$1663_lastError = var_$1663_error
var_$1663_init = true
var_$1663_ts = currTs
var_$1663_changed = true
var_$1663_unknown = (var_unmatchedStimulusEvents$1631_unknown && var_$1707_unknown)
if ((var_unmatchedStimulusEvents$1631_changed)) {
var_$1663_value = var_unmatchedStimulusEvents$1631_value
var_$1663_error = var_unmatchedStimulusEvents$1631_error
} else {
if ((var_$1707_changed)) {
var_$1663_value = var_$1707_value
var_$1663_error = var_$1707_error
}
}
}
var_$1629_changed = false
if ((var_$1663_init)) {
if ((var_$1663_changed)) {
var_$1629_unknown = (var_$1663_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}).size
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
var_$1709_changed = false
}
if ((var_$1845_changed)) {
var_$1709_value = var_$1845_value
var_$1709_init = true
var_$1709_error = var_$1845_error
var_$1709_changed = true
var_$1709_unknown = var_$1845_unknown
}
var_$1628_changed = false
if ((var_$1629_init && var_$1709_init)) {
if ((var_$1629_changed) || (var_$1709_changed)) {
var_$1628_unknown = (var_$1629_unknown && var_$1709_unknown)
if ((var_$1628_unknown)) {
var_$1628_error = UnknownEventError(null)
} else {
var_$1628_error = null
try {
var_$1628_value = ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}) == (if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}))
} catch {
case var_err : Throwable => {
var_$1628_error = var_err
}
}
}
var_$1628_init = true
var_$1628_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1711_changed = false
}
if ((var_$1734_changed)) {
var_$1711_value = var_$1734_value
var_$1711_init = true
var_$1711_error = var_$1734_error
var_$1711_changed = true
var_$1711_unknown = var_$1734_unknown
}
var_$1834_changed = false
if ((var_$1663_init)) {
if ((var_$1663_changed)) {
var_$1834_unknown = (var_$1663_unknown)
if ((var_$1834_unknown)) {
var_$1834_error = UnknownEventError(null)
} else {
var_$1834_error = null
try {
var_$1834_value = var_mapMinimumValue$1719.apply((if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}))
} catch {
case var_err : Throwable => {
var_$1834_error = var_err
}
}
}
var_$1834_init = true
var_$1834_changed = true
}
}
var_$1833_changed = false
if ((var_$1834_init && var_$1701_init)) {
if ((var_$1834_changed) || (var_$1701_changed)) {
var_$1833_unknown = (var_$1834_unknown && var_$1701_unknown)
if ((var_$1833_unknown)) {
var_$1833_error = UnknownEventError(null)
} else {
var_$1833_error = null
try {
var_$1833_value = ((if((var_$1834_error == null)) {var_$1834_value} else {throw var_$1834_error}) + (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}))
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
var_$1724_changed = false
if ((var_mergeUnit2$1726_changed)) {
if ((var_mergeUnit2$1726_unknown)) {
var_$1724_error = UnknownEventError(var_mergeUnit2$1726_error)
} else {
var_$1724_error = null
}
var_$1724_changed = var_mergeUnit2$1726_changed
var_$1724_unknown = var_mergeUnit2$1726_unknown
}
var_safeDelay$1729_changed = false
if ((var_safeDelay$1729_nextTs == currTs)) {
var_safeDelay$1729_changed = true
var_safeDelay$1729_unknown = false
}
var_$1727_changed = false
if ((var_safeDelay$1729_changed)) {
if ((var_safeDelay$1729_unknown)) {
var_$1727_error = UnknownEventError(var_safeDelay$1729_error)
} else {
var_$1727_error = null
}
var_$1727_changed = var_safeDelay$1729_changed
var_$1727_unknown = var_safeDelay$1729_unknown
}
var_mergeUnit2$1723_changed = false
if ((var_$1724_changed) || (var_$1727_changed)) {
var_mergeUnit2$1723_ts = currTs
var_mergeUnit2$1723_changed = true
var_mergeUnit2$1723_unknown = (var_$1724_unknown && var_$1727_unknown)
if ((var_$1724_changed)) {
var_mergeUnit2$1723_error = var_$1724_error
} else {
if ((var_$1727_changed)) {
var_mergeUnit2$1723_error = var_$1727_error
}
}
}
var_$1722_changed = false
if ((var_mergeUnit2$1723_changed)) {
var_$1722_value = var_mergeUnit2$1723_ts
var_$1722_init = true
var_$1722_unknown = var_mergeUnit2$1723_unknown
if ((var_$1722_unknown)) {
var_$1722_error = var_mergeUnit2$1723_error
} else {
var_$1722_error = null
}
var_$1722_changed = true
}
var_$1715_changed = false
if ((var_$1833_init && var_$1722_init)) {
if ((var_$1833_changed) || (var_$1722_changed)) {
var_$1715_unknown = (var_$1833_unknown && var_$1722_unknown)
if ((var_$1715_unknown)) {
var_$1715_error = UnknownEventError(null)
} else {
var_$1715_error = null
try {
var_$1715_value = ((if((var_$1833_error == null)) {var_$1833_value} else {throw var_$1833_error}) >= (if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error}))
} catch {
case var_err : Throwable => {
var_$1715_error = var_err
}
}
}
var_$1715_init = true
var_$1715_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1730_changed = false
}
if ((var_$1734_changed)) {
var_$1730_value = var_$1734_value
var_$1730_init = true
var_$1730_error = var_$1734_error
var_$1730_changed = true
var_$1730_unknown = var_$1734_unknown
}
if ((!(currTs == 0L))) {
var_$1733_changed = false
}
if ((var_$1734_changed)) {
var_$1733_value = var_$1734_value
var_$1733_init = true
var_$1733_error = var_$1734_error
var_$1733_changed = true
var_$1733_unknown = var_$1734_unknown
}
var_$1714_changed = false
if ((var_$1715_init && var_$1730_init && var_$1733_init)) {
if ((var_$1715_changed) || (var_$1730_changed) || (var_$1733_changed)) {
var_$1714_unknown = (var_$1715_unknown && var_$1730_unknown && var_$1733_unknown)
if ((var_$1714_unknown)) {
var_$1714_error = UnknownEventError(null)
} else {
var_$1714_error = null
try {
var_$1714_value = (if ((if((var_$1715_error == null)) {var_$1715_value} else {throw var_$1715_error})) (if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}) else (if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error}))
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
var_$1627_changed = false
if ((var_$1628_init && var_$1711_init && var_$1714_init)) {
if ((var_$1628_changed) || (var_$1711_changed) || (var_$1714_changed)) {
var_$1627_unknown = (var_$1628_unknown && var_$1711_unknown && var_$1714_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = (if ((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error})) (if((var_$1711_error == null)) {var_$1711_value} else {throw var_$1711_error}) else (if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error}))
} catch {
case var_err : Throwable => {
var_$1627_error = var_err
}
}
}
var_$1627_init = true
var_$1627_ts = currTs
var_$1627_changed = true
}
}
var_$1748_changed = false
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1748_unknown = (var_$1627_unknown)
if ((var_$1748_unknown)) {
var_$1748_error = UnknownEventError(null)
} else {
var_$1748_error = null
try {
var_$1748_value = var_$1736.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_$1738_changed = false
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1738_unknown = (var_$1627_unknown)
if ((var_$1738_unknown)) {
var_$1738_error = UnknownEventError(null)
} else {
var_$1738_error = null
try {
var_$1738_value = var_$1739.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_$1737_changed = false
if ((var_$1738_init)) {
if ((var_$1738_changed)) {
var_$1737_unknown = (var_$1738_unknown)
if ((var_$1737_unknown)) {
var_$1737_error = UnknownEventError(null)
} else {
var_$1737_error = null
try {
var_$1737_value = !((if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}))
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
var_$1625_changed = false
if ((var_$1748_init && var_$1737_init)) {
if ((var_$1748_changed) || (var_$1737_changed)) {
var_$1625_unknown = (var_$1748_unknown && var_$1737_unknown)
if ((var_$1625_unknown)) {
var_$1625_error = UnknownEventError(null)
} else {
var_$1625_error = null
try {
var_$1625_value = ((if((var_$1748_error == null)) {var_$1748_value} else {throw var_$1748_error}) && (if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}))
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
var_$1744_changed = false
if ((var_$1627_changed)) {
if ((var_$1745_ts == currTs && var_$1745_lastInit) || (!(var_$1745_ts == currTs) && var_$1745_init)) {
var_$1744_changed = true
var_$1744_init = true
var_$1744_unknown = var_$1627_unknown
if ((var_$1744_unknown)) {
var_$1744_error = var_$1627_error
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
if ((!(currTs == 0L))) {
var_$1750_changed = false
}
if ((var_$1765_changed)) {
var_$1750_value = var_$1765_value
var_$1750_init = true
var_$1750_error = var_$1765_error
var_$1750_changed = true
var_$1750_unknown = var_$1765_unknown
}
var_$1747_changed = false
if ((var_$1748_init && var_$1750_init)) {
if ((var_$1748_changed) || (var_$1750_changed)) {
var_$1747_unknown = (var_$1748_unknown && var_$1750_unknown)
if ((var_$1747_unknown)) {
var_$1747_error = UnknownEventError(null)
} else {
var_$1747_error = null
try {
var_$1747_value = ((if((var_$1748_error == null)) {var_$1748_value} else {throw var_$1748_error}) == (if((var_$1750_error == null)) {var_$1750_value} else {throw var_$1750_error}))
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
var_$1764_changed = false
}
if ((var_$1765_changed)) {
var_$1764_value = var_$1765_value
var_$1764_init = true
var_$1764_error = var_$1765_error
var_$1764_changed = true
var_$1764_unknown = var_$1765_unknown
}
var_$1752_changed = false
if ((var_$1738_init && var_$1764_init)) {
if ((var_$1738_changed) || (var_$1764_changed)) {
var_$1752_unknown = (var_$1738_unknown && var_$1764_unknown)
if ((var_$1752_unknown)) {
var_$1752_error = UnknownEventError(null)
} else {
var_$1752_error = null
try {
var_$1752_value = ((if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}) == (if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}))
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
var_$1746_changed = false
if ((var_$1747_init && var_$1752_init)) {
if ((var_$1747_changed) || (var_$1752_changed)) {
var_$1746_unknown = (var_$1747_unknown && var_$1752_unknown)
if ((var_$1746_unknown)) {
var_$1746_error = UnknownEventError(null)
} else {
var_$1746_error = null
try {
var_$1746_value = ((if((var_$1747_error == null)) {var_$1747_value} else {throw var_$1747_error}) && (if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}))
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
var_isFinalFalse$1743_changed = false
if ((var_$1744_init && var_$1746_init)) {
if ((var_$1744_changed) || (var_$1746_changed)) {
var_isFinalFalse$1743_unknown = (var_$1744_unknown && var_$1746_unknown)
if ((var_isFinalFalse$1743_unknown)) {
var_isFinalFalse$1743_error = UnknownEventError(null)
} else {
var_isFinalFalse$1743_error = null
try {
var_isFinalFalse$1743_value = ((if((var_$1744_error == null)) {var_$1744_value} else {throw var_$1744_error}) || (if((var_$1746_error == null)) {var_$1746_value} else {throw var_$1746_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1743_error = var_err
}
}
}
var_isFinalFalse$1743_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1766_changed = false
}
if ((var_isFinalFalse$1743_changed)) {
var_$1766_lastValue = var_$1766_value
var_$1766_lastInit = var_$1766_init
var_$1766_lastError = var_$1766_error
var_$1766_value = var_isFinalFalse$1743_value
var_$1766_init = true
var_$1766_ts = currTs
var_$1766_error = var_isFinalFalse$1743_error
var_$1766_changed = true
var_$1766_unknown = var_isFinalFalse$1743_unknown
}
var_prev$1741_changed = false
if ((var_$1766_changed)) {
if ((var_$1766_ts == currTs && var_$1766_lastInit) || (!(var_$1766_ts == currTs) && var_$1766_init)) {
var_prev$1741_changed = true
var_prev$1741_init = true
var_prev$1741_unknown = var_$1766_unknown
if ((var_prev$1741_unknown)) {
var_prev$1741_error = var_$1766_error
} else {
if ((var_$1766_ts == currTs)) {
var_prev$1741_value = var_$1766_lastValue
var_prev$1741_error = var_$1766_lastError
} else {
var_prev$1741_value = var_$1766_value
var_prev$1741_error = var_$1766_error
}
}
}
}
var_$1740_changed = false
if ((var_prev$1741_init)) {
if ((var_prev$1741_changed)) {
var_$1740_unknown = (var_prev$1741_unknown)
if ((var_$1740_unknown)) {
var_$1740_error = UnknownEventError(null)
} else {
var_$1740_error = null
try {
var_$1740_value = !((if((var_prev$1741_error == null)) {var_prev$1741_value} else {throw var_prev$1741_error}))
} catch {
case var_err : Throwable => {
var_$1740_error = var_err
}
}
}
var_$1740_init = true
var_$1740_changed = true
}
}
var_$1624_changed = false
if ((var_$1625_init && var_$1740_init)) {
if ((var_$1625_changed) || (var_$1740_changed)) {
var_$1624_unknown = (var_$1625_unknown && var_$1740_unknown)
if ((var_$1624_unknown)) {
var_$1624_error = UnknownEventError(null)
} else {
var_$1624_error = null
try {
var_$1624_value = ((if((var_$1625_error == null)) {var_$1625_value} else {throw var_$1625_error}) && (if((var_$1740_error == null)) {var_$1740_value} else {throw var_$1740_error}))
} catch {
case var_err : Throwable => {
var_$1624_error = var_err
}
}
}
var_$1624_init = true
var_$1624_changed = true
}
}
var_$1763_changed = false
if ((var_$1627_changed)) {
var_$1763_value = var_$1627_ts
var_$1763_init = true
var_$1763_unknown = var_$1627_unknown
if ((var_$1763_unknown)) {
var_$1763_error = var_$1627_error
} else {
var_$1763_error = null
}
var_$1763_changed = true
}
var_$1758_changed = false
if ((var_$1766_changed)) {
if ((var_$1622_ts == currTs && var_$1622_lastInit) || (!(var_$1622_ts == currTs) && var_$1622_init)) {
var_$1758_changed = true
var_$1758_init = true
var_$1758_unknown = var_$1766_unknown
if ((var_$1758_unknown)) {
var_$1758_error = var_$1766_error
} else {
if ((var_$1622_ts == currTs)) {
var_$1758_value = var_$1622_lastValue
var_$1758_error = var_$1622_lastError
} else {
var_$1758_value = var_$1622_value
var_$1758_error = var_$1622_error
}
}
}
}
var_finalFalseSince$1623_changed = false
if ((var_$1624_init && var_$1763_init && var_$1758_init)) {
if ((var_$1624_changed) || (var_$1763_changed) || (var_$1758_changed)) {
var_finalFalseSince$1623_unknown = (var_$1624_unknown && var_$1763_unknown && var_$1758_unknown)
if ((var_finalFalseSince$1623_unknown)) {
var_finalFalseSince$1623_error = UnknownEventError(null)
} else {
var_finalFalseSince$1623_error = null
try {
var_finalFalseSince$1623_value = (if ((if((var_$1624_error == null)) {var_$1624_value} else {throw var_$1624_error})) (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}) else (if((var_$1758_error == null)) {var_$1758_value} else {throw var_$1758_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1623_error = var_err
}
}
}
var_finalFalseSince$1623_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1622_changed = false
}
if ((var_finalFalseSince$1623_changed)) {
var_$1622_lastValue = var_$1622_value
var_$1622_lastInit = var_$1622_init
var_$1622_lastError = var_$1622_error
var_$1622_value = var_finalFalseSince$1623_value
var_$1622_init = true
var_$1622_ts = currTs
var_$1622_error = var_finalFalseSince$1623_error
var_$1622_changed = true
var_$1622_unknown = var_finalFalseSince$1623_unknown
}
var_$1621_changed = false
if ((var_$1622_init && var_$1761_init)) {
if ((var_$1622_changed) || (var_$1761_changed)) {
var_$1621_unknown = (var_$1622_unknown && var_$1761_unknown)
if ((var_$1621_unknown)) {
var_$1621_error = UnknownEventError(null)
} else {
var_$1621_error = null
try {
var_$1621_value = ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error}) + (if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}))
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
var_$1620_changed = false
if ((var_$1621_init && var_$1763_init)) {
if ((var_$1621_changed) || (var_$1763_changed)) {
var_$1620_unknown = (var_$1621_unknown && var_$1763_unknown)
if ((var_$1620_unknown)) {
var_$1620_error = UnknownEventError(null)
} else {
var_$1620_error = null
try {
var_$1620_value = ((if((var_$1621_error == null)) {var_$1621_value} else {throw var_$1621_error}) < (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}))
} catch {
case var_err : Throwable => {
var_$1620_error = var_err
}
}
}
var_$1620_init = true
var_$1620_changed = true
}
}
var_isFinalFalseReset$1619_changed = false
if ((var_$1620_init && var_$1764_init && var_$1766_init)) {
if ((var_$1620_changed) || (var_$1764_changed) || (var_$1766_changed)) {
var_isFinalFalseReset$1619_unknown = (var_$1620_unknown && var_$1764_unknown && var_$1766_unknown)
if ((var_isFinalFalseReset$1619_unknown)) {
var_isFinalFalseReset$1619_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1619_error = null
try {
var_isFinalFalseReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error}) else (if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1619_error = var_err
}
}
}
var_isFinalFalseReset$1619_changed = true
}
}
var_$1745_changed = false
if ((var_isFinalFalseReset$1619_changed) || (var_$1766_changed)) {
var_$1745_lastValue = var_$1745_value
var_$1745_lastInit = var_$1745_init
var_$1745_lastError = var_$1745_error
var_$1745_init = true
var_$1745_ts = currTs
var_$1745_changed = true
var_$1745_unknown = (var_isFinalFalseReset$1619_unknown && var_$1766_unknown)
if ((var_isFinalFalseReset$1619_changed)) {
var_$1745_value = var_isFinalFalseReset$1619_value
var_$1745_error = var_isFinalFalseReset$1619_error
} else {
if ((var_$1766_changed)) {
var_$1745_value = var_$1766_value
var_$1745_error = var_$1766_error
}
}
}
var_stillFulfillableReset$1617_changed = false
if ((var_$1745_init && var_$1733_init && var_$1627_init)) {
if ((var_$1745_changed) || (var_$1733_changed) || (var_$1627_changed)) {
var_stillFulfillableReset$1617_unknown = (var_$1745_unknown && var_$1733_unknown && var_$1627_unknown)
if ((var_stillFulfillableReset$1617_unknown)) {
var_stillFulfillableReset$1617_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1617_error = null
try {
var_stillFulfillableReset$1617_value = (if ((if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error})) (if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error}) else (if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1617_error = var_err
}
}
}
var_stillFulfillableReset$1617_init = true
var_stillFulfillableReset$1617_changed = true
}
}
var_final$1616_changed = false
if ((var_stillFulfillableReset$1617_init)) {
if ((var_stillFulfillableReset$1617_changed)) {
var_final$1616_unknown = (var_stillFulfillableReset$1617_unknown)
if ((var_final$1616_unknown)) {
var_final$1616_error = UnknownEventError(null)
} else {
var_final$1616_error = null
try {
var_final$1616_value = var_$1736.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
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
var_$1832_changed = false
if ((var_$1833_init && var_$1838_init)) {
if ((var_$1833_changed) || (var_$1838_changed)) {
var_$1832_unknown = (var_$1833_unknown && var_$1838_unknown)
if ((var_$1832_unknown)) {
var_$1832_error = UnknownEventError(null)
} else {
var_$1832_error = null
try {
var_$1832_value = ((if((var_$1833_error == null)) {var_$1833_value} else {throw var_$1833_error}) - (if((var_$1838_error == null)) {var_$1838_value} else {throw var_$1838_error}))
} catch {
case var_err : Throwable => {
var_$1832_error = var_err
}
}
}
var_$1832_init = true
var_$1832_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1844_changed = false
}
if ((var_$1845_changed)) {
var_$1844_value = var_$1845_value
var_$1844_init = true
var_$1844_error = var_$1845_error
var_$1844_changed = true
var_$1844_unknown = var_$1845_unknown
}
var_$1831_changed = false
if ((var_$1832_init && var_$1844_init)) {
if ((var_$1832_changed) || (var_$1844_changed)) {
var_$1831_unknown = (var_$1832_unknown && var_$1844_unknown)
if ((var_$1831_unknown)) {
var_$1831_error = UnknownEventError(null)
} else {
var_$1831_error = null
try {
var_$1831_value = ((if((var_$1832_error == null)) {var_$1832_value} else {throw var_$1832_error}) + (if((var_$1844_error == null)) {var_$1844_value} else {throw var_$1844_error}))
} catch {
case var_err : Throwable => {
var_$1831_error = var_err
}
}
}
var_$1831_init = true
var_$1831_ts = currTs
var_$1831_changed = true
}
}
var_$1830_changed = false
if ((var_$1831_init && var_$1709_init)) {
if ((var_$1831_changed) || (var_$1709_changed)) {
var_$1830_unknown = (var_$1831_unknown && var_$1709_unknown)
if ((var_$1830_unknown)) {
var_$1830_error = UnknownEventError(null)
} else {
var_$1830_error = null
try {
var_$1830_value = ((if((var_$1831_error == null)) {var_$1831_value} else {throw var_$1831_error}) > (if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}))
} catch {
case var_err : Throwable => {
var_$1830_error = var_err
}
}
}
var_$1830_init = true
var_$1830_changed = true
}
}
var_$1851_changed = false
if ((var_$1831_changed)) {
var_$1851_value = var_$1831_ts
var_$1851_init = true
var_$1851_unknown = var_$1831_unknown
if ((var_$1851_unknown)) {
var_$1851_error = var_$1831_error
} else {
var_$1851_error = null
}
var_$1851_changed = true
}
var_$1848_changed = false
if ((var_$1761_init && var_$1851_init)) {
if ((var_$1761_changed) || (var_$1851_changed)) {
var_$1848_unknown = (var_$1761_unknown && var_$1851_unknown)
if ((var_$1848_unknown)) {
var_$1848_error = UnknownEventError(null)
} else {
var_$1848_error = null
try {
var_$1848_value = ((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}) - (if((var_$1851_error == null)) {var_$1851_value} else {throw var_$1851_error}))
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
var_$1799_changed = false
if ((var_$1830_init && var_$1831_init && var_$1848_init)) {
if ((var_$1830_changed) || (var_$1831_changed) || (var_$1848_changed)) {
var_$1799_unknown = (var_$1830_unknown && var_$1831_unknown && var_$1848_unknown)
if ((var_$1799_unknown)) {
var_$1799_error = UnknownEventError(null)
} else {
var_$1799_error = null
try {
var_$1799_value = (if ((if((var_$1830_error == null)) {var_$1830_value} else {throw var_$1830_error})) (if((var_$1831_error == null)) {var_$1831_value} else {throw var_$1831_error}) else (if((var_$1848_error == null)) {var_$1848_value} else {throw var_$1848_error}))
} catch {
case var_err : Throwable => {
var_$1799_error = var_err
}
}
}
var_$1799_changed = true
}
}
var_value$1772_changed = false
if ((var_stillFulfillableReset$1617_init)) {
if ((var_stillFulfillableReset$1617_changed)) {
var_value$1772_unknown = (var_stillFulfillableReset$1617_unknown)
if ((var_value$1772_unknown)) {
var_value$1772_error = UnknownEventError(null)
} else {
var_value$1772_error = null
try {
var_value$1772_value = var_$1739.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
} catch {
case var_err : Throwable => {
var_value$1772_error = var_err
}
}
}
var_value$1772_init = true
var_value$1772_changed = true
}
}

if ((var_mergeUnit2$1726_unknown) || (!(var_$1799_error == null)) || (var_$1799_changed && (0L >= var_$1799_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1799_changed)) {
if ((var_safeDelay$1729_changed) || (var_mergeUnit2$1726_changed)) {
var_safeDelay$1729_nextTs = (currTs + var_$1799_value)
}
} else {
if ((var_mergeUnit2$1726_changed)) {
var_safeDelay$1729_nextTs = -1L
}
}
}
if ((var_final$1616_changed && var_final$1616_init)) {
out_final.apply(var_final$1616_value, currTs, "final", var_final$1616_error)
}
if ((var_value$1772_changed && var_value$1772_init)) {
out_value.apply(var_value$1772_value, currTs, "value", var_value$1772_error)
}
var_stimulus_changed = false
var_response_changed = false

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
