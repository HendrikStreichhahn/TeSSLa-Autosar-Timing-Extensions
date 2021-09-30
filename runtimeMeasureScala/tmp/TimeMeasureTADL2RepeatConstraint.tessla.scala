//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1669 : scala.Function1[List[Any], Any] = ((var_list$1750 : List[Any]) => {
val var_$1751 : Any = var_list$1750(0L.asInstanceOf[Int])
var_$1751
})
val var_$1749 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1763 : (Boolean, Boolean)) => {
val var_$1764 : Boolean = var_$1763._1
var_$1764
})
val var_$1730 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1759 : (Boolean, Boolean)) => {
val var_$1760 : Boolean = var_$1759._2
var_$1760
})
lazy val var_$1639 : List[Long] = List[Long]()
val var_$1711 : (Boolean, Boolean) = (true, false)
val var_$1708 : (Boolean, Boolean) = (false, true)
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
var var_$1786_changed : Boolean = false
var var_$1786_value : Long = 0L
var var_$1786_init : Boolean = false
var var_$1786_unknown : Boolean = false
var var_$1786_error : Throwable = null
var var_defaultTime$1632_changed : Boolean = true
var var_defaultTime$1632_value : Long = -1L
var var_defaultTime$1632_init : Boolean = true
var var_defaultTime$1632_error : Throwable = null
var var_defaultTime$1632_unknown : Boolean = false
val var_$1704_value : Long = 0L
val var_$1704_error : Throwable = null
val var_$1704_changed : Boolean = false
val var_$1704_unknown : Boolean = false
var var_$1634_changed : Boolean = true
var var_$1634_value : Long = 0L
var var_$1634_init : Boolean = true
var var_$1634_error : Throwable = null
var var_$1634_unknown : Boolean = false
var var_latestSpanEventTimes$1631_changed : Boolean = false
var var_latestSpanEventTimes$1631_unknown : Boolean = false
var var_latestSpanEventTimes$1631_error : Throwable = null
var var_latestSpanEventTimes$1631_value : Boolean = false
var var_latestSpanEventTimes$1631_init : Boolean = false
val var_$1638_value : List[Long] = List[Long]()
val var_$1638_error : Throwable = null
val var_$1638_changed : Boolean = false
val var_$1638_unknown : Boolean = false
var var_$1637_changed : Boolean = true
var var_$1637_value : List[Long] = var_$1639
var var_$1637_init : Boolean = true
var var_$1637_error : Throwable = null
var var_$1637_unknown : Boolean = false
var var_latestSpanEventTimes$1636_changed : Boolean = false
var var_latestSpanEventTimes$1636_unknown : Boolean = false
var var_latestSpanEventTimes$1636_error : Throwable = null
var var_latestSpanEventTimes$1636_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1636_init : Boolean = false
var var_$1656_changed : Boolean = false
var var_$1656_init : Boolean = false
var var_$1656_unknown : Boolean = false
var var_$1656_error : Throwable = null
var var_$1656_value : List[Long] = List[Long]()
var var_$1646_changed : Boolean = false
var var_$1646_unknown : Boolean = false
var var_$1646_error : Throwable = null
var var_$1646_value : Long = 0L
var var_$1646_init : Boolean = false
var var_$1649_changed : Boolean = true
var var_$1649_value : Long = 50L
var var_$1649_init : Boolean = true
var var_$1649_error : Throwable = null
var var_$1649_unknown : Boolean = false
var var_$1645_changed : Boolean = false
var var_$1645_unknown : Boolean = false
var var_$1645_error : Throwable = null
var var_$1645_value : Boolean = false
var var_$1645_init : Boolean = false
var var_$1652_changed : Boolean = false
var var_$1652_init : Boolean = false
var var_$1652_unknown : Boolean = false
var var_$1652_error : Throwable = null
var var_$1652_value : List[Long] = List[Long]()
var var_$1651_changed : Boolean = false
var var_$1651_unknown : Boolean = false
var var_$1651_error : Throwable = null
var var_$1651_value : List[Long] = List[Long]()
var var_$1651_init : Boolean = false
var var_$1644_changed : Boolean = false
var var_$1644_unknown : Boolean = false
var var_$1644_error : Throwable = null
var var_$1644_value : List[Long] = List[Long]()
var var_$1644_init : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$1642_changed : Boolean = true
var var_latestSpanEventTimes$1642_value : List[Long] = var_$1639
var var_latestSpanEventTimes$1642_init : Boolean = true
var var_latestSpanEventTimes$1642_error : Throwable = null
var var_latestSpanEventTimes$1642_unknown : Boolean = false
var var_$1653_changed : Boolean = false
var var_$1653_lastValue : List[Long] = List[Long]()
var var_$1653_lastInit : Boolean = false
var var_$1653_lastError : Throwable = null
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : List[Long] = List[Long]()
var var_$1653_init : Boolean = false
var var_$1653_ts : Long = 0L
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Long = 0L
var var_$1629_init : Boolean = false
var var_$1628_changed : Boolean = false
var var_$1628_unknown : Boolean = false
var var_$1628_error : Throwable = null
var var_$1628_value : Boolean = false
var var_$1628_init : Boolean = false
var var_$1701_changed : Boolean = false
var var_$1701_unknown : Boolean = false
var var_$1701_error : Throwable = null
var var_$1701_value : Long = 0L
var var_$1701_init : Boolean = false
var var_$1670_changed : Boolean = true
var var_$1670_value : Long = 500L
var var_$1670_init : Boolean = true
var var_$1670_error : Throwable = null
var var_$1670_unknown : Boolean = false
var var_$1666_changed : Boolean = false
var var_$1666_unknown : Boolean = false
var var_$1666_error : Throwable = null
var var_$1666_value : Long = 0L
var var_$1666_init : Boolean = false
var var_$1674_changed : Boolean = false
var var_$1674_error : Throwable = null
var var_$1674_unknown : Boolean = false
var var_safeDelay$1678_changed : Boolean = false
val var_safeDelay$1678_error : Throwable = null
var var_safeDelay$1678_unknown : Boolean = false
var var_$1676_changed : Boolean = false
var var_$1676_error : Throwable = null
var var_$1676_unknown : Boolean = false
var var_mergeUnit2$1673_changed : Boolean = false
var var_mergeUnit2$1673_ts : Long = 0L
var var_mergeUnit2$1673_unknown : Boolean = false
var var_mergeUnit2$1673_error : Throwable = null
var var_$1705_changed : Boolean = false
var var_$1705_value : Long = 0L
var var_$1705_init : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1665_changed : Boolean = false
var var_$1665_unknown : Boolean = false
var var_$1665_error : Throwable = null
var var_$1665_value : Boolean = false
var var_$1665_init : Boolean = false
val var_$1681_value : Boolean = false
val var_$1681_error : Throwable = null
val var_$1681_changed : Boolean = false
val var_$1681_unknown : Boolean = false
var var_$1680_changed : Boolean = true
var var_$1680_value : Boolean = false
var var_$1680_init : Boolean = true
var var_$1680_error : Throwable = null
var var_$1680_unknown : Boolean = false
var var_$1703_changed : Boolean = true
var var_$1703_value : Long = 1000L
var var_$1703_init : Boolean = true
var var_$1703_error : Throwable = null
var var_$1703_unknown : Boolean = false
var var_$1781_changed : Boolean = false
var var_$1781_unknown : Boolean = false
var var_$1781_error : Throwable = null
var var_$1781_value : Long = 0L
var var_$1781_init : Boolean = false
var var_$1699_changed : Boolean = false
var var_$1699_unknown : Boolean = false
var var_$1699_error : Throwable = null
var var_$1699_value : Boolean = false
var var_$1699_init : Boolean = false
var var_$1679_changed : Boolean = false
var var_$1679_unknown : Boolean = false
var var_$1679_error : Throwable = null
var var_$1679_value : Boolean = false
var var_$1679_init : Boolean = false
var var_$1664_changed : Boolean = false
var var_$1664_unknown : Boolean = false
var var_$1664_error : Throwable = null
var var_$1664_value : Boolean = false
var var_$1664_init : Boolean = false
val var_$1745_value : (Boolean, Boolean) = (false, false)
val var_$1745_error : Throwable = null
val var_$1745_changed : Boolean = false
val var_$1745_unknown : Boolean = false
var var_$1689_changed : Boolean = true
var var_$1689_value : (Boolean, Boolean) = var_$1708
var var_$1689_init : Boolean = true
var var_$1689_error : Throwable = null
var var_$1689_unknown : Boolean = false
var var_$1744_changed : Boolean = true
var var_$1744_value : (Boolean, Boolean) = var_$1711
var var_$1744_init : Boolean = true
var var_$1744_error : Throwable = null
var var_$1744_unknown : Boolean = false
var var_$1663_changed : Boolean = false
var var_$1663_unknown : Boolean = false
var var_$1663_error : Throwable = null
var var_$1663_value : (Boolean, Boolean) = (false, false)
var var_$1663_init : Boolean = false
var var_$1695_changed : Boolean = false
var var_$1695_unknown : Boolean = false
var var_$1695_error : Throwable = null
var var_$1695_value : (Boolean, Boolean) = (false, false)
var var_$1695_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : (Boolean, Boolean) = (false, false)
var var_$1627_init : Boolean = false
var var_$1627_ts : Long = 0L
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
var var_$1713_changed : Boolean = false
var var_$1713_unknown : Boolean = false
var var_$1713_error : Throwable = null
var var_$1713_value : Boolean = false
var var_$1713_init : Boolean = false
var var_$1625_changed : Boolean = false
var var_$1625_unknown : Boolean = false
var var_$1625_error : Throwable = null
var var_$1625_value : Boolean = false
var var_$1625_init : Boolean = false
var var_delayPeriod$1769_changed : Boolean = true
var var_delayPeriod$1769_value : Long = -1L
var var_delayPeriod$1769_init : Boolean = true
var var_delayPeriod$1769_error : Throwable = null
var var_delayPeriod$1769_unknown : Boolean = false
var var_$1807_changed : Boolean = false
var var_$1807_unknown : Boolean = false
var var_$1807_error : Throwable = null
var var_$1806_changed : Boolean = false
var var_$1806_value : Boolean = false
var var_$1806_error : Throwable = null
var var_$1806_unknown : Boolean = false
var var_$1808_changed : Boolean = false
var var_$1808_value : Boolean = false
var var_$1808_error : Throwable = null
var var_$1808_unknown : Boolean = false
var var_isFirst$1778_init : Boolean = false
var var_isFirst$1778_unknown : Boolean = false
var var_isFirst$1778_value : Boolean = false
var var_isFirst$1778_error : Throwable = null
var var_firstEvent$1777_changed : Boolean = false
var var_firstEvent$1777_error : Throwable = null
var var_firstEvent$1777_ts : Long = 0L
var var_firstEvent$1777_unknown : Boolean = false
var var_$1776_changed : Boolean = false
var var_$1776_value : Long = 0L
var var_$1776_unknown : Boolean = false
var var_$1776_error : Throwable = null
var var_defaultTime$1775_changed : Boolean = true
var var_defaultTime$1775_value : Long = -1L
var var_defaultTime$1775_init : Boolean = true
var var_defaultTime$1775_error : Throwable = null
var var_defaultTime$1775_unknown : Boolean = false
var var_$1772_changed : Boolean = false
var var_$1772_unknown : Boolean = false
var var_$1772_error : Throwable = null
var var_$1772_value : Boolean = false
var var_$1772_init : Boolean = false
var var_$1780_changed : Boolean = false
var var_$1780_unknown : Boolean = false
var var_$1780_error : Throwable = null
var var_$1780_value : Long = 0L
var var_$1780_init : Boolean = false
var var_$1798_changed : Boolean = true
var var_$1798_value : Long = 1L
var var_$1798_init : Boolean = true
var var_$1798_error : Throwable = null
var var_$1798_unknown : Boolean = false
var var_$1779_changed : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1779_value : Long = 0L
var var_$1779_init : Boolean = false
var var_$1793_changed : Boolean = false
var var_$1793_unknown : Boolean = false
var var_$1793_error : Throwable = null
var var_$1793_value : List[Long] = List[Long]()
var var_$1793_init : Boolean = false
var var_$1792_changed : Boolean = false
var var_$1792_unknown : Boolean = false
var var_$1792_error : Throwable = null
var var_$1792_value : Long = 0L
var var_$1792_init : Boolean = false
var var_$1791_changed : Boolean = false
var var_$1791_unknown : Boolean = false
var var_$1791_error : Throwable = null
var var_$1791_value : Long = 0L
var var_$1791_init : Boolean = false
var var_$1790_changed : Boolean = false
var var_$1790_unknown : Boolean = false
var var_$1790_error : Throwable = null
var var_$1790_value : Long = 0L
var var_$1790_init : Boolean = false
var var_$1789_changed : Boolean = false
var var_$1789_unknown : Boolean = false
var var_$1789_error : Throwable = null
var var_$1789_value : Long = 0L
var var_$1789_init : Boolean = false
var var_delayPeriod$1771_changed : Boolean = false
var var_delayPeriod$1771_unknown : Boolean = false
var var_delayPeriod$1771_error : Throwable = null
var var_delayPeriod$1771_value : Long = 0L
var var_delayPeriod$1771_init : Boolean = false
var var_$1766_changed : Boolean = false
var var_$1766_unknown : Boolean = false
var var_$1766_error : Throwable = null
var var_$1766_value : Long = 0L
var var_$1766_init : Boolean = false
var var_$1766_ts : Long = 0L
var var_$1765_changed : Boolean = false
var var_$1765_unknown : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_value : Boolean = false
var var_$1765_init : Boolean = false
var var_$1720_changed : Boolean = false
var var_$1720_init : Boolean = false
var var_$1720_unknown : Boolean = false
var var_$1720_error : Throwable = null
var var_$1720_value : Boolean = false
var var_$1726_changed : Boolean = true
var var_$1726_value : Boolean = true
var var_$1726_init : Boolean = true
var var_$1726_error : Throwable = null
var var_$1726_unknown : Boolean = false
var var_$1723_changed : Boolean = false
var var_$1723_unknown : Boolean = false
var var_$1723_error : Throwable = null
var var_$1723_value : Boolean = false
var var_$1723_init : Boolean = false
var var_$1728_changed : Boolean = false
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_$1728_value : Boolean = false
var var_$1728_init : Boolean = false
var var_$1722_changed : Boolean = false
var var_$1722_unknown : Boolean = false
var var_$1722_error : Throwable = null
var var_$1722_value : Boolean = false
var var_$1722_init : Boolean = false
var var_isFinalFalse$1719_changed : Boolean = false
var var_isFinalFalse$1719_unknown : Boolean = false
var var_isFinalFalse$1719_error : Throwable = null
var var_isFinalFalse$1719_value : Boolean = false
var var_$1736_changed : Boolean = true
var var_$1736_lastValue : Boolean = false
var var_$1736_lastInit : Boolean = false
var var_$1736_lastError : Throwable = null
var var_$1736_value : Boolean = false
var var_$1736_init : Boolean = true
var var_$1736_ts : Long = 0L
var var_$1736_error : Throwable = null
var var_$1736_unknown : Boolean = false
var var_prev$1717_changed : Boolean = false
var var_prev$1717_init : Boolean = false
var var_prev$1717_unknown : Boolean = false
var var_prev$1717_error : Throwable = null
var var_prev$1717_value : Boolean = false
var var_$1716_changed : Boolean = false
var var_$1716_unknown : Boolean = false
var var_$1716_error : Throwable = null
var var_$1716_value : Boolean = false
var var_$1716_init : Boolean = false
var var_$1624_changed : Boolean = false
var var_$1624_unknown : Boolean = false
var var_$1624_error : Throwable = null
var var_$1624_value : Boolean = false
var var_$1624_init : Boolean = false
var var_$1733_changed : Boolean = false
var var_$1733_value : Long = 0L
var var_$1733_init : Boolean = false
var var_$1733_unknown : Boolean = false
var var_$1733_error : Throwable = null
var var_$1734_changed : Boolean = false
var var_$1734_init : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1734_value : Long = 0L
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
var var_$1737_changed : Boolean = true
var var_$1737_value : Long = 9223372036854775807L
var var_$1737_init : Boolean = true
var var_$1737_error : Throwable = null
var var_$1737_unknown : Boolean = false
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
var var_$1805_changed : Boolean = false
var var_$1805_value : Long = 0L
var var_$1805_init : Boolean = false
var var_$1805_unknown : Boolean = false
var var_$1805_error : Throwable = null
var var_$1802_changed : Boolean = false
var var_$1802_unknown : Boolean = false
var var_$1802_error : Throwable = null
var var_$1802_value : Long = 0L
var var_$1802_init : Boolean = false
var var_$1752_changed : Boolean = false
var var_$1752_unknown : Boolean = false
var var_$1752_error : Throwable = null
var var_$1752_value : Long = 0L
var var_isFinalFalseReset$1619_changed : Boolean = false
var var_isFinalFalseReset$1619_unknown : Boolean = false
var var_isFinalFalseReset$1619_error : Throwable = null
var var_isFinalFalseReset$1619_value : Boolean = false
var var_$1618_changed : Boolean = false
var var_$1618_lastValue : Boolean = false
var var_$1618_lastInit : Boolean = false
var var_$1618_lastError : Throwable = null
var var_$1618_init : Boolean = false
var var_$1618_ts : Long = 0L
var var_$1618_unknown : Boolean = false
var var_$1618_value : Boolean = false
var var_$1618_error : Throwable = null
var var_stillFulfillableReset$1617_changed : Boolean = false
var var_stillFulfillableReset$1617_unknown : Boolean = false
var var_stillFulfillableReset$1617_error : Throwable = null
var var_stillFulfillableReset$1617_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1617_init : Boolean = false
var var_final$1748_changed : Boolean = false
var var_final$1748_unknown : Boolean = false
var var_final$1748_error : Throwable = null
var var_final$1748_value : Boolean = false
var var_final$1748_init : Boolean = false
var var_value$1616_changed : Boolean = false
var var_value$1616_unknown : Boolean = false
var var_value$1616_error : Throwable = null
var var_value$1616_value : Boolean = false
var var_value$1616_init : Boolean = false
var var_safeDelay$1678_nextTs : Long = -1L



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

if (((var_safeDelay$1678_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1678_nextTs))) {
currTs = var_safeDelay$1678_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

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
var_defaultTime$1632_changed = false
}
if ((var_$1786_changed)) {
var_defaultTime$1632_value = var_$1786_value
var_defaultTime$1632_init = true
var_defaultTime$1632_error = var_$1786_error
var_defaultTime$1632_changed = true
var_defaultTime$1632_unknown = var_$1786_unknown
}
if ((!(currTs == 0L))) {
var_$1634_changed = false
}
if ((var_$1704_changed)) {
var_$1634_value = var_$1704_value
var_$1634_init = true
var_$1634_error = var_$1704_error
var_$1634_changed = true
var_$1634_unknown = var_$1704_unknown
}
var_latestSpanEventTimes$1631_changed = false
if ((var_defaultTime$1632_init && var_$1634_init)) {
if ((var_defaultTime$1632_changed) || (var_$1634_changed)) {
var_latestSpanEventTimes$1631_unknown = (var_defaultTime$1632_unknown && var_$1634_unknown)
if ((var_latestSpanEventTimes$1631_unknown)) {
var_latestSpanEventTimes$1631_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1631_error = null
try {
var_latestSpanEventTimes$1631_value = ((if((var_defaultTime$1632_error == null)) {var_defaultTime$1632_value} else {throw var_defaultTime$1632_error}) == (if((var_$1634_error == null)) {var_$1634_value} else {throw var_$1634_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1631_error = var_err
}
}
}
var_latestSpanEventTimes$1631_init = true
var_latestSpanEventTimes$1631_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1637_changed = false
}
if ((var_$1638_changed)) {
var_$1637_value = var_$1638_value
var_$1637_init = true
var_$1637_error = var_$1638_error
var_$1637_changed = true
var_$1637_unknown = var_$1638_unknown
}
var_latestSpanEventTimes$1636_changed = false
if ((var_$1637_init && var_defaultTime$1632_init)) {
if ((var_$1637_changed) || (var_defaultTime$1632_changed)) {
var_latestSpanEventTimes$1636_unknown = (var_$1637_unknown && var_defaultTime$1632_unknown)
if ((var_latestSpanEventTimes$1636_unknown)) {
var_latestSpanEventTimes$1636_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$1636_error = null
try {
var_latestSpanEventTimes$1636_value = ((if((var_$1637_error == null)) {var_$1637_value} else {throw var_$1637_error}) :+ (if((var_defaultTime$1632_error == null)) {var_defaultTime$1632_value} else {throw var_defaultTime$1632_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$1636_error = var_err
}
}
}
var_latestSpanEventTimes$1636_init = true
var_latestSpanEventTimes$1636_changed = true
}
}
var_$1656_changed = false
if ((var_event_changed)) {
if ((var_$1653_ts == currTs && var_$1653_lastInit) || (!(var_$1653_ts == currTs) && var_$1653_init)) {
var_$1656_changed = true
var_$1656_init = true
var_$1656_unknown = var_event_unknown
if ((var_$1656_unknown)) {
var_$1656_error = var_event_error
} else {
if ((var_$1653_ts == currTs)) {
var_$1656_value = var_$1653_lastValue
var_$1656_error = var_$1653_lastError
} else {
var_$1656_value = var_$1653_value
var_$1656_error = var_$1653_error
}
}
}
}
var_$1646_changed = false
if ((var_$1656_init)) {
if ((var_$1656_changed)) {
var_$1646_unknown = (var_$1656_unknown)
if ((var_$1646_unknown)) {
var_$1646_error = UnknownEventError(null)
} else {
var_$1646_error = null
try {
var_$1646_value = (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}).size
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
if ((!(currTs == 0L))) {
var_$1649_changed = false
}
if ((var_$1704_changed)) {
var_$1649_value = var_$1704_value
var_$1649_init = true
var_$1649_error = var_$1704_error
var_$1649_changed = true
var_$1649_unknown = var_$1704_unknown
}
var_$1645_changed = false
if ((var_$1646_init && var_$1649_init)) {
if ((var_$1646_changed) || (var_$1649_changed)) {
var_$1645_unknown = (var_$1646_unknown && var_$1649_unknown)
if ((var_$1645_unknown)) {
var_$1645_error = UnknownEventError(null)
} else {
var_$1645_error = null
try {
var_$1645_value = ((if((var_$1646_error == null)) {var_$1646_value} else {throw var_$1646_error}) > (if((var_$1649_error == null)) {var_$1649_value} else {throw var_$1649_error}))
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
var_$1652_changed = false
if ((var_defaultTime$1632_changed)) {
if ((var_$1653_ts == currTs && var_$1653_lastInit) || (!(var_$1653_ts == currTs) && var_$1653_init)) {
var_$1652_changed = true
var_$1652_init = true
var_$1652_unknown = var_defaultTime$1632_unknown
if ((var_$1652_unknown)) {
var_$1652_error = var_defaultTime$1632_error
} else {
if ((var_$1653_ts == currTs)) {
var_$1652_value = var_$1653_lastValue
var_$1652_error = var_$1653_lastError
} else {
var_$1652_value = var_$1653_value
var_$1652_error = var_$1653_error
}
}
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
var_$1651_value = (if((var_$1652_error == null)) {var_$1652_value} else {throw var_$1652_error}).tail
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
var_$1644_changed = false
if ((var_$1645_init && var_$1651_init && var_$1656_init)) {
if ((var_$1645_changed) || (var_$1651_changed) || (var_$1656_changed)) {
var_$1644_unknown = (var_$1645_unknown && var_$1651_unknown && var_$1656_unknown)
if ((var_$1644_unknown)) {
var_$1644_error = UnknownEventError(null)
} else {
var_$1644_error = null
try {
var_$1644_value = (if ((if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error})) (if((var_$1651_error == null)) {var_$1651_value} else {throw var_$1651_error}) else (if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error}))
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
if ((var_$1644_init && var_defaultTime$1632_init)) {
if ((var_$1644_changed) || (var_defaultTime$1632_changed)) {
var_$1643_unknown = (var_$1644_unknown && var_defaultTime$1632_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = ((if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}) :+ (if((var_defaultTime$1632_error == null)) {var_defaultTime$1632_value} else {throw var_defaultTime$1632_error}))
} catch {
case var_err : Throwable => {
var_$1643_error = var_err
}
}
}
var_$1643_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$1642_changed = false
}
if ((var_$1643_changed)) {
var_latestSpanEventTimes$1642_value = var_$1643_value
var_latestSpanEventTimes$1642_init = true
var_latestSpanEventTimes$1642_error = var_$1643_error
var_latestSpanEventTimes$1642_changed = true
var_latestSpanEventTimes$1642_unknown = var_$1643_unknown
}
var_$1653_changed = false
if ((var_latestSpanEventTimes$1631_init && var_latestSpanEventTimes$1636_init && var_latestSpanEventTimes$1642_init)) {
if ((var_latestSpanEventTimes$1631_changed) || (var_latestSpanEventTimes$1636_changed) || (var_latestSpanEventTimes$1642_changed)) {
var_$1653_lastValue = var_$1653_value
var_$1653_lastInit = var_$1653_init
var_$1653_lastError = var_$1653_error
var_$1653_unknown = (var_latestSpanEventTimes$1631_unknown && var_latestSpanEventTimes$1636_unknown && var_latestSpanEventTimes$1642_unknown)
if ((var_$1653_unknown)) {
var_$1653_error = UnknownEventError(null)
} else {
var_$1653_error = null
try {
var_$1653_value = (if ((if((var_latestSpanEventTimes$1631_error == null)) {var_latestSpanEventTimes$1631_value} else {throw var_latestSpanEventTimes$1631_error})) (if((var_latestSpanEventTimes$1636_error == null)) {var_latestSpanEventTimes$1636_value} else {throw var_latestSpanEventTimes$1636_error}) else (if((var_latestSpanEventTimes$1642_error == null)) {var_latestSpanEventTimes$1642_value} else {throw var_latestSpanEventTimes$1642_error}))
} catch {
case var_err : Throwable => {
var_$1653_error = var_err
}
}
}
var_$1653_init = true
var_$1653_ts = currTs
var_$1653_changed = true
}
}
var_$1629_changed = false
if ((var_$1653_init)) {
if ((var_$1653_changed)) {
var_$1629_unknown = (var_$1653_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}).size
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
var_$1628_changed = false
if ((var_$1629_init && var_$1649_init)) {
if ((var_$1629_changed) || (var_$1649_changed)) {
var_$1628_unknown = (var_$1629_unknown && var_$1649_unknown)
if ((var_$1628_unknown)) {
var_$1628_error = UnknownEventError(null)
} else {
var_$1628_error = null
try {
var_$1628_value = ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}) > (if((var_$1649_error == null)) {var_$1649_value} else {throw var_$1649_error}))
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
var_$1701_changed = false
if ((var_$1653_init)) {
if ((var_$1653_changed)) {
var_$1701_unknown = (var_$1653_unknown)
if ((var_$1701_unknown)) {
var_$1701_error = UnknownEventError(null)
} else {
var_$1701_error = null
try {
var_$1701_value = (var_head$1669.apply(((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
if ((!(currTs == 0L))) {
var_$1670_changed = false
}
if ((var_$1704_changed)) {
var_$1670_value = var_$1704_value
var_$1670_init = true
var_$1670_error = var_$1704_error
var_$1670_changed = true
var_$1670_unknown = var_$1704_unknown
}
var_$1666_changed = false
if ((var_$1701_init && var_$1670_init)) {
if ((var_$1701_changed) || (var_$1670_changed)) {
var_$1666_unknown = (var_$1701_unknown && var_$1670_unknown)
if ((var_$1666_unknown)) {
var_$1666_error = UnknownEventError(null)
} else {
var_$1666_error = null
try {
var_$1666_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) + (if((var_$1670_error == null)) {var_$1670_value} else {throw var_$1670_error}))
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
var_$1674_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$1674_error = UnknownEventError(var_event_error)
} else {
var_$1674_error = null
}
var_$1674_changed = var_event_changed
var_$1674_unknown = var_event_unknown
}
var_safeDelay$1678_changed = false
if ((var_safeDelay$1678_nextTs == currTs)) {
var_safeDelay$1678_changed = true
var_safeDelay$1678_unknown = false
}
var_$1676_changed = false
if ((var_safeDelay$1678_changed)) {
if ((var_safeDelay$1678_unknown)) {
var_$1676_error = UnknownEventError(var_safeDelay$1678_error)
} else {
var_$1676_error = null
}
var_$1676_changed = var_safeDelay$1678_changed
var_$1676_unknown = var_safeDelay$1678_unknown
}
var_mergeUnit2$1673_changed = false
if ((var_$1674_changed) || (var_$1676_changed)) {
var_mergeUnit2$1673_ts = currTs
var_mergeUnit2$1673_changed = true
var_mergeUnit2$1673_unknown = (var_$1674_unknown && var_$1676_unknown)
if ((var_$1674_changed)) {
var_mergeUnit2$1673_error = var_$1674_error
} else {
if ((var_$1676_changed)) {
var_mergeUnit2$1673_error = var_$1676_error
}
}
}
var_$1705_changed = false
if ((var_mergeUnit2$1673_changed)) {
var_$1705_value = var_mergeUnit2$1673_ts
var_$1705_init = true
var_$1705_unknown = var_mergeUnit2$1673_unknown
if ((var_$1705_unknown)) {
var_$1705_error = var_mergeUnit2$1673_error
} else {
var_$1705_error = null
}
var_$1705_changed = true
}
var_$1665_changed = false
if ((var_$1666_init && var_$1705_init)) {
if ((var_$1666_changed) || (var_$1705_changed)) {
var_$1665_unknown = (var_$1666_unknown && var_$1705_unknown)
if ((var_$1665_unknown)) {
var_$1665_error = UnknownEventError(null)
} else {
var_$1665_error = null
try {
var_$1665_value = ((if((var_$1666_error == null)) {var_$1666_value} else {throw var_$1666_error}) <= (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}))
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
if ((!(currTs == 0L))) {
var_$1680_changed = false
}
if ((var_$1681_changed)) {
var_$1680_value = var_$1681_value
var_$1680_init = true
var_$1680_error = var_$1681_error
var_$1680_changed = true
var_$1680_unknown = var_$1681_unknown
}
if ((!(currTs == 0L))) {
var_$1703_changed = false
}
if ((var_$1704_changed)) {
var_$1703_value = var_$1704_value
var_$1703_init = true
var_$1703_error = var_$1704_error
var_$1703_changed = true
var_$1703_unknown = var_$1704_unknown
}
var_$1781_changed = false
if ((var_$1701_init && var_$1703_init)) {
if ((var_$1701_changed) || (var_$1703_changed)) {
var_$1781_unknown = (var_$1701_unknown && var_$1703_unknown)
if ((var_$1781_unknown)) {
var_$1781_error = UnknownEventError(null)
} else {
var_$1781_error = null
try {
var_$1781_value = ((if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1699_changed = false
if ((var_$1781_init && var_$1705_init)) {
if ((var_$1781_changed) || (var_$1705_changed)) {
var_$1699_unknown = (var_$1781_unknown && var_$1705_unknown)
if ((var_$1699_unknown)) {
var_$1699_error = UnknownEventError(null)
} else {
var_$1699_error = null
try {
var_$1699_value = ((if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}) >= (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}))
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
var_$1679_changed = false
if ((var_$1680_init && var_$1699_init)) {
if ((var_$1680_changed) || (var_$1699_changed)) {
var_$1679_unknown = (var_$1680_unknown && var_$1699_unknown)
if ((var_$1679_unknown)) {
var_$1679_error = UnknownEventError(null)
} else {
var_$1679_error = null
try {
var_$1679_value = ((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}) || (if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error}))
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
var_$1664_changed = false
if ((var_$1665_init && var_$1679_init)) {
if ((var_$1665_changed) || (var_$1679_changed)) {
var_$1664_unknown = (var_$1665_unknown && var_$1679_unknown)
if ((var_$1664_unknown)) {
var_$1664_error = UnknownEventError(null)
} else {
var_$1664_error = null
try {
var_$1664_value = ((if((var_$1665_error == null)) {var_$1665_value} else {throw var_$1665_error}) && (if((var_$1679_error == null)) {var_$1679_value} else {throw var_$1679_error}))
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
if ((!(currTs == 0L))) {
var_$1689_changed = false
}
if ((var_$1745_changed)) {
var_$1689_value = var_$1745_value
var_$1689_init = true
var_$1689_error = var_$1745_error
var_$1689_changed = true
var_$1689_unknown = var_$1745_unknown
}
if ((!(currTs == 0L))) {
var_$1744_changed = false
}
if ((var_$1745_changed)) {
var_$1744_value = var_$1745_value
var_$1744_init = true
var_$1744_error = var_$1745_error
var_$1744_changed = true
var_$1744_unknown = var_$1745_unknown
}
var_$1663_changed = false
if ((var_$1664_init && var_$1689_init && var_$1744_init)) {
if ((var_$1664_changed) || (var_$1689_changed) || (var_$1744_changed)) {
var_$1663_unknown = (var_$1664_unknown && var_$1689_unknown && var_$1744_unknown)
if ((var_$1663_unknown)) {
var_$1663_error = UnknownEventError(null)
} else {
var_$1663_error = null
try {
var_$1663_value = (if ((if((var_$1664_error == null)) {var_$1664_value} else {throw var_$1664_error})) (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}) else (if((var_$1744_error == null)) {var_$1744_value} else {throw var_$1744_error}))
} catch {
case var_err : Throwable => {
var_$1663_error = var_err
}
}
}
var_$1663_init = true
var_$1663_changed = true
}
}
var_$1695_changed = false
if ((var_$1679_init && var_$1689_init && var_$1744_init)) {
if ((var_$1679_changed) || (var_$1689_changed) || (var_$1744_changed)) {
var_$1695_unknown = (var_$1679_unknown && var_$1689_unknown && var_$1744_unknown)
if ((var_$1695_unknown)) {
var_$1695_error = UnknownEventError(null)
} else {
var_$1695_error = null
try {
var_$1695_value = (if ((if((var_$1679_error == null)) {var_$1679_value} else {throw var_$1679_error})) (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}) else (if((var_$1744_error == null)) {var_$1744_value} else {throw var_$1744_error}))
} catch {
case var_err : Throwable => {
var_$1695_error = var_err
}
}
}
var_$1695_init = true
var_$1695_changed = true
}
}
var_$1627_changed = false
if ((var_$1628_init && var_$1663_init && var_$1695_init)) {
if ((var_$1628_changed) || (var_$1663_changed) || (var_$1695_changed)) {
var_$1627_unknown = (var_$1628_unknown && var_$1663_unknown && var_$1695_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = (if ((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error})) (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}) else (if((var_$1695_error == null)) {var_$1695_value} else {throw var_$1695_error}))
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
var_$1724_changed = false
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1724_unknown = (var_$1627_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = var_$1749.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1729_unknown = (var_$1627_unknown)
if ((var_$1729_unknown)) {
var_$1729_error = UnknownEventError(null)
} else {
var_$1729_error = null
try {
var_$1729_value = var_$1730.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_$1713_changed = false
if ((var_$1729_init)) {
if ((var_$1729_changed)) {
var_$1713_unknown = (var_$1729_unknown)
if ((var_$1713_unknown)) {
var_$1713_error = UnknownEventError(null)
} else {
var_$1713_error = null
try {
var_$1713_value = !((if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}))
} catch {
case var_err : Throwable => {
var_$1713_error = var_err
}
}
}
var_$1713_init = true
var_$1713_changed = true
}
}
var_$1625_changed = false
if ((var_$1724_init && var_$1713_init)) {
if ((var_$1724_changed) || (var_$1713_changed)) {
var_$1625_unknown = (var_$1724_unknown && var_$1713_unknown)
if ((var_$1625_unknown)) {
var_$1625_error = UnknownEventError(null)
} else {
var_$1625_error = null
try {
var_$1625_value = ((if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}) && (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
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
if ((!(currTs == 0L))) {
var_delayPeriod$1769_changed = false
}
if ((var_$1704_changed)) {
var_delayPeriod$1769_value = var_$1704_value
var_delayPeriod$1769_init = true
var_delayPeriod$1769_error = var_$1704_error
var_delayPeriod$1769_changed = true
var_delayPeriod$1769_unknown = var_$1704_unknown
}
var_$1807_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$1807_changed = true
var_$1807_unknown = var_event_unknown
if ((var_$1807_unknown)) {
var_$1807_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$1807_error = var_event_lastError
} else {
var_$1807_error = var_event_error
}
}
}
}
var_$1806_changed = false
if ((var_$1807_changed)) {
var_$1806_value = false
if ((var_$1807_unknown)) {
var_$1806_error = UnknownEventError(var_$1807_error)
} else {
var_$1806_error = null
}
var_$1806_changed = var_$1807_changed
var_$1806_unknown = var_$1807_unknown
}
var_$1808_changed = false
if ((var_event_changed)) {
var_$1808_value = true
if ((var_event_unknown)) {
var_$1808_error = UnknownEventError(var_event_error)
} else {
var_$1808_error = null
}
var_$1808_changed = var_event_changed
var_$1808_unknown = var_event_unknown
}
if ((var_$1806_changed) || (var_$1808_changed) || (var_$1680_changed)) {
var_isFirst$1778_init = true
var_isFirst$1778_unknown = (var_$1806_unknown && var_$1808_unknown && var_$1680_unknown)
if ((var_$1806_changed)) {
var_isFirst$1778_value = var_$1806_value
var_isFirst$1778_error = var_$1806_error
} else {
if ((var_$1808_changed)) {
var_isFirst$1778_value = var_$1808_value
var_isFirst$1778_error = var_$1808_error
} else {
if ((var_$1680_changed)) {
var_isFirst$1778_value = var_$1680_value
var_isFirst$1778_error = var_$1680_error
}
}
}
}
var_firstEvent$1777_changed = false
if ((var_isFirst$1778_init && var_event_changed)) {
if ((var_isFirst$1778_value) || (!(var_isFirst$1778_error == null)) || (var_isFirst$1778_unknown)) {
if ((!(var_isFirst$1778_error == null))) {
var_firstEvent$1777_error = var_isFirst$1778_error
} else {
var_firstEvent$1777_error = var_event_error
}
var_firstEvent$1777_changed = true
var_firstEvent$1777_ts = var_event_ts
var_firstEvent$1777_unknown = (var_event_unknown || !(var_isFirst$1778_error == null))
}
}
var_$1776_changed = false
if ((var_firstEvent$1777_changed)) {
var_$1776_value = var_firstEvent$1777_ts
var_$1776_unknown = var_firstEvent$1777_unknown
if ((var_$1776_unknown)) {
var_$1776_error = var_firstEvent$1777_error
} else {
var_$1776_error = null
}
var_$1776_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1775_changed = false
}
if ((var_$1776_changed)) {
var_defaultTime$1775_value = var_$1776_value
var_defaultTime$1775_init = true
var_defaultTime$1775_error = var_$1776_error
var_defaultTime$1775_changed = true
var_defaultTime$1775_unknown = var_$1776_unknown
}
var_$1772_changed = false
if ((var_defaultTime$1632_init && var_defaultTime$1775_init)) {
if ((var_defaultTime$1632_changed) || (var_defaultTime$1775_changed)) {
var_$1772_unknown = (var_defaultTime$1632_unknown && var_defaultTime$1775_unknown)
if ((var_$1772_unknown)) {
var_$1772_error = UnknownEventError(null)
} else {
var_$1772_error = null
try {
var_$1772_value = ((if((var_defaultTime$1632_error == null)) {var_defaultTime$1632_value} else {throw var_defaultTime$1632_error}) == (if((var_defaultTime$1775_error == null)) {var_defaultTime$1775_value} else {throw var_defaultTime$1775_error}))
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
var_$1780_changed = false
if ((var_$1781_init && var_$1786_init)) {
if ((var_$1781_changed) || (var_$1786_changed)) {
var_$1780_unknown = (var_$1781_unknown && var_$1786_unknown)
if ((var_$1780_unknown)) {
var_$1780_error = UnknownEventError(null)
} else {
var_$1780_error = null
try {
var_$1780_value = ((if((var_$1781_error == null)) {var_$1781_value} else {throw var_$1781_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
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
if ((!(currTs == 0L))) {
var_$1798_changed = false
}
if ((var_$1704_changed)) {
var_$1798_value = var_$1704_value
var_$1798_init = true
var_$1798_error = var_$1704_error
var_$1798_changed = true
var_$1798_unknown = var_$1704_unknown
}
var_$1779_changed = false
if ((var_$1780_init && var_$1798_init)) {
if ((var_$1780_changed) || (var_$1798_changed)) {
var_$1779_unknown = (var_$1780_unknown && var_$1798_unknown)
if ((var_$1779_unknown)) {
var_$1779_error = UnknownEventError(null)
} else {
var_$1779_error = null
try {
var_$1779_value = ((if((var_$1780_error == null)) {var_$1780_value} else {throw var_$1780_error}) + (if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}))
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
var_$1793_changed = false
if ((var_$1653_init)) {
if ((var_$1653_changed)) {
var_$1793_unknown = (var_$1653_unknown)
if ((var_$1793_unknown)) {
var_$1793_error = UnknownEventError(null)
} else {
var_$1793_error = null
try {
var_$1793_value = (if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}).tail
} catch {
case var_err : Throwable => {
var_$1793_error = var_err
}
}
}
var_$1793_init = true
var_$1793_changed = true
}
}
var_$1792_changed = false
if ((var_$1793_init)) {
if ((var_$1793_changed)) {
var_$1792_unknown = (var_$1793_unknown)
if ((var_$1792_unknown)) {
var_$1792_error = UnknownEventError(null)
} else {
var_$1792_error = null
try {
var_$1792_value = (var_head$1669.apply(((if((var_$1793_error == null)) {var_$1793_value} else {throw var_$1793_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
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
var_$1791_changed = false
if ((var_$1792_init && var_$1703_init)) {
if ((var_$1792_changed) || (var_$1703_changed)) {
var_$1791_unknown = (var_$1792_unknown && var_$1703_unknown)
if ((var_$1791_unknown)) {
var_$1791_error = UnknownEventError(null)
} else {
var_$1791_error = null
try {
var_$1791_value = ((if((var_$1792_error == null)) {var_$1792_value} else {throw var_$1792_error}) + (if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}))
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
var_$1790_changed = false
if ((var_$1791_init && var_$1786_init)) {
if ((var_$1791_changed) || (var_$1786_changed)) {
var_$1790_unknown = (var_$1791_unknown && var_$1786_unknown)
if ((var_$1790_unknown)) {
var_$1790_error = UnknownEventError(null)
} else {
var_$1790_error = null
try {
var_$1790_value = ((if((var_$1791_error == null)) {var_$1791_value} else {throw var_$1791_error}) - (if((var_$1786_error == null)) {var_$1786_value} else {throw var_$1786_error}))
} catch {
case var_err : Throwable => {
var_$1790_error = var_err
}
}
}
var_$1790_init = true
var_$1790_changed = true
}
}
var_$1789_changed = false
if ((var_$1790_init && var_$1798_init)) {
if ((var_$1790_changed) || (var_$1798_changed)) {
var_$1789_unknown = (var_$1790_unknown && var_$1798_unknown)
if ((var_$1789_unknown)) {
var_$1789_error = UnknownEventError(null)
} else {
var_$1789_error = null
try {
var_$1789_value = ((if((var_$1790_error == null)) {var_$1790_value} else {throw var_$1790_error}) + (if((var_$1798_error == null)) {var_$1798_value} else {throw var_$1798_error}))
} catch {
case var_err : Throwable => {
var_$1789_error = var_err
}
}
}
var_$1789_init = true
var_$1789_changed = true
}
}
var_delayPeriod$1771_changed = false
if ((var_$1772_init && var_$1779_init && var_$1789_init)) {
if ((var_$1772_changed) || (var_$1779_changed) || (var_$1789_changed)) {
var_delayPeriod$1771_unknown = (var_$1772_unknown && var_$1779_unknown && var_$1789_unknown)
if ((var_delayPeriod$1771_unknown)) {
var_delayPeriod$1771_error = UnknownEventError(null)
} else {
var_delayPeriod$1771_error = null
try {
var_delayPeriod$1771_value = (if ((if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error})) (if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}) else (if((var_$1789_error == null)) {var_$1789_value} else {throw var_$1789_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$1771_error = var_err
}
}
}
var_delayPeriod$1771_init = true
var_delayPeriod$1771_changed = true
}
}
var_$1766_changed = false
if ((var_$1680_init && var_delayPeriod$1769_init && var_delayPeriod$1771_init)) {
if ((var_$1680_changed) || (var_delayPeriod$1769_changed) || (var_delayPeriod$1771_changed)) {
var_$1766_unknown = (var_$1680_unknown && var_delayPeriod$1769_unknown && var_delayPeriod$1771_unknown)
if ((var_$1766_unknown)) {
var_$1766_error = UnknownEventError(null)
} else {
var_$1766_error = null
try {
var_$1766_value = (if ((if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error})) (if((var_delayPeriod$1769_error == null)) {var_delayPeriod$1769_value} else {throw var_delayPeriod$1769_error}) else (if((var_delayPeriod$1771_error == null)) {var_delayPeriod$1771_value} else {throw var_delayPeriod$1771_error}))
} catch {
case var_err : Throwable => {
var_$1766_error = var_err
}
}
}
var_$1766_init = true
var_$1766_ts = currTs
var_$1766_changed = true
}
}
var_$1765_changed = false
if ((var_$1766_init && var_$1634_init)) {
if ((var_$1766_changed) || (var_$1634_changed)) {
var_$1765_unknown = (var_$1766_unknown && var_$1634_unknown)
if ((var_$1765_unknown)) {
var_$1765_error = UnknownEventError(null)
} else {
var_$1765_error = null
try {
var_$1765_value = ((if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}) > (if((var_$1634_error == null)) {var_$1634_value} else {throw var_$1634_error}))
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
var_$1720_changed = false
if ((var_$1627_changed)) {
if ((var_$1618_ts == currTs && var_$1618_lastInit) || (!(var_$1618_ts == currTs) && var_$1618_init)) {
var_$1720_changed = true
var_$1720_init = true
var_$1720_unknown = var_$1627_unknown
if ((var_$1720_unknown)) {
var_$1720_error = var_$1627_error
} else {
if ((var_$1618_ts == currTs)) {
var_$1720_value = var_$1618_lastValue
var_$1720_error = var_$1618_lastError
} else {
var_$1720_value = var_$1618_value
var_$1720_error = var_$1618_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1726_changed = false
}
if ((var_$1681_changed)) {
var_$1726_value = var_$1681_value
var_$1726_init = true
var_$1726_error = var_$1681_error
var_$1726_changed = true
var_$1726_unknown = var_$1681_unknown
}
var_$1723_changed = false
if ((var_$1724_init && var_$1726_init)) {
if ((var_$1724_changed) || (var_$1726_changed)) {
var_$1723_unknown = (var_$1724_unknown && var_$1726_unknown)
if ((var_$1723_unknown)) {
var_$1723_error = UnknownEventError(null)
} else {
var_$1723_error = null
try {
var_$1723_value = ((if((var_$1724_error == null)) {var_$1724_value} else {throw var_$1724_error}) == (if((var_$1726_error == null)) {var_$1726_value} else {throw var_$1726_error}))
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
var_$1728_changed = false
if ((var_$1729_init && var_$1680_init)) {
if ((var_$1729_changed) || (var_$1680_changed)) {
var_$1728_unknown = (var_$1729_unknown && var_$1680_unknown)
if ((var_$1728_unknown)) {
var_$1728_error = UnknownEventError(null)
} else {
var_$1728_error = null
try {
var_$1728_value = ((if((var_$1729_error == null)) {var_$1729_value} else {throw var_$1729_error}) == (if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}))
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
var_$1722_changed = false
if ((var_$1723_init && var_$1728_init)) {
if ((var_$1723_changed) || (var_$1728_changed)) {
var_$1722_unknown = (var_$1723_unknown && var_$1728_unknown)
if ((var_$1722_unknown)) {
var_$1722_error = UnknownEventError(null)
} else {
var_$1722_error = null
try {
var_$1722_value = ((if((var_$1723_error == null)) {var_$1723_value} else {throw var_$1723_error}) && (if((var_$1728_error == null)) {var_$1728_value} else {throw var_$1728_error}))
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
var_isFinalFalse$1719_changed = false
if ((var_$1720_init && var_$1722_init)) {
if ((var_$1720_changed) || (var_$1722_changed)) {
var_isFinalFalse$1719_unknown = (var_$1720_unknown && var_$1722_unknown)
if ((var_isFinalFalse$1719_unknown)) {
var_isFinalFalse$1719_error = UnknownEventError(null)
} else {
var_isFinalFalse$1719_error = null
try {
var_isFinalFalse$1719_value = ((if((var_$1720_error == null)) {var_$1720_value} else {throw var_$1720_error}) || (if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1719_error = var_err
}
}
}
var_isFinalFalse$1719_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1736_changed = false
}
if ((var_isFinalFalse$1719_changed)) {
var_$1736_lastValue = var_$1736_value
var_$1736_lastInit = var_$1736_init
var_$1736_lastError = var_$1736_error
var_$1736_value = var_isFinalFalse$1719_value
var_$1736_init = true
var_$1736_ts = currTs
var_$1736_error = var_isFinalFalse$1719_error
var_$1736_changed = true
var_$1736_unknown = var_isFinalFalse$1719_unknown
}
var_prev$1717_changed = false
if ((var_$1736_changed)) {
if ((var_$1736_ts == currTs && var_$1736_lastInit) || (!(var_$1736_ts == currTs) && var_$1736_init)) {
var_prev$1717_changed = true
var_prev$1717_init = true
var_prev$1717_unknown = var_$1736_unknown
if ((var_prev$1717_unknown)) {
var_prev$1717_error = var_$1736_error
} else {
if ((var_$1736_ts == currTs)) {
var_prev$1717_value = var_$1736_lastValue
var_prev$1717_error = var_$1736_lastError
} else {
var_prev$1717_value = var_$1736_value
var_prev$1717_error = var_$1736_error
}
}
}
}
var_$1716_changed = false
if ((var_prev$1717_init)) {
if ((var_prev$1717_changed)) {
var_$1716_unknown = (var_prev$1717_unknown)
if ((var_$1716_unknown)) {
var_$1716_error = UnknownEventError(null)
} else {
var_$1716_error = null
try {
var_$1716_value = !((if((var_prev$1717_error == null)) {var_prev$1717_value} else {throw var_prev$1717_error}))
} catch {
case var_err : Throwable => {
var_$1716_error = var_err
}
}
}
var_$1716_init = true
var_$1716_changed = true
}
}
var_$1624_changed = false
if ((var_$1625_init && var_$1716_init)) {
if ((var_$1625_changed) || (var_$1716_changed)) {
var_$1624_unknown = (var_$1625_unknown && var_$1716_unknown)
if ((var_$1624_unknown)) {
var_$1624_error = UnknownEventError(null)
} else {
var_$1624_error = null
try {
var_$1624_value = ((if((var_$1625_error == null)) {var_$1625_value} else {throw var_$1625_error}) && (if((var_$1716_error == null)) {var_$1716_value} else {throw var_$1716_error}))
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
var_$1733_changed = false
if ((var_$1627_changed)) {
var_$1733_value = var_$1627_ts
var_$1733_init = true
var_$1733_unknown = var_$1627_unknown
if ((var_$1733_unknown)) {
var_$1733_error = var_$1627_error
} else {
var_$1733_error = null
}
var_$1733_changed = true
}
var_$1734_changed = false
if ((var_$1736_changed)) {
if ((var_$1622_ts == currTs && var_$1622_lastInit) || (!(var_$1622_ts == currTs) && var_$1622_init)) {
var_$1734_changed = true
var_$1734_init = true
var_$1734_unknown = var_$1736_unknown
if ((var_$1734_unknown)) {
var_$1734_error = var_$1736_error
} else {
if ((var_$1622_ts == currTs)) {
var_$1734_value = var_$1622_lastValue
var_$1734_error = var_$1622_lastError
} else {
var_$1734_value = var_$1622_value
var_$1734_error = var_$1622_error
}
}
}
}
var_finalFalseSince$1623_changed = false
if ((var_$1624_init && var_$1733_init && var_$1734_init)) {
if ((var_$1624_changed) || (var_$1733_changed) || (var_$1734_changed)) {
var_finalFalseSince$1623_unknown = (var_$1624_unknown && var_$1733_unknown && var_$1734_unknown)
if ((var_finalFalseSince$1623_unknown)) {
var_finalFalseSince$1623_error = UnknownEventError(null)
} else {
var_finalFalseSince$1623_error = null
try {
var_finalFalseSince$1623_value = (if ((if((var_$1624_error == null)) {var_$1624_value} else {throw var_$1624_error})) (if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error}) else (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
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
if ((!(currTs == 0L))) {
var_$1737_changed = false
}
if ((var_$1704_changed)) {
var_$1737_value = var_$1704_value
var_$1737_init = true
var_$1737_error = var_$1704_error
var_$1737_changed = true
var_$1737_unknown = var_$1704_unknown
}
var_$1621_changed = false
if ((var_$1622_init && var_$1737_init)) {
if ((var_$1622_changed) || (var_$1737_changed)) {
var_$1621_unknown = (var_$1622_unknown && var_$1737_unknown)
if ((var_$1621_unknown)) {
var_$1621_error = UnknownEventError(null)
} else {
var_$1621_error = null
try {
var_$1621_value = ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error}) + (if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}))
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
if ((var_$1621_init && var_$1733_init)) {
if ((var_$1621_changed) || (var_$1733_changed)) {
var_$1620_unknown = (var_$1621_unknown && var_$1733_unknown)
if ((var_$1620_unknown)) {
var_$1620_error = UnknownEventError(null)
} else {
var_$1620_error = null
try {
var_$1620_value = ((if((var_$1621_error == null)) {var_$1621_value} else {throw var_$1621_error}) < (if((var_$1733_error == null)) {var_$1733_value} else {throw var_$1733_error}))
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
var_$1805_changed = false
if ((var_$1766_changed)) {
var_$1805_value = var_$1766_ts
var_$1805_init = true
var_$1805_unknown = var_$1766_unknown
if ((var_$1805_unknown)) {
var_$1805_error = var_$1766_error
} else {
var_$1805_error = null
}
var_$1805_changed = true
}
var_$1802_changed = false
if ((var_$1737_init && var_$1805_init)) {
if ((var_$1737_changed) || (var_$1805_changed)) {
var_$1802_unknown = (var_$1737_unknown && var_$1805_unknown)
if ((var_$1802_unknown)) {
var_$1802_error = UnknownEventError(null)
} else {
var_$1802_error = null
try {
var_$1802_value = ((if((var_$1737_error == null)) {var_$1737_value} else {throw var_$1737_error}) - (if((var_$1805_error == null)) {var_$1805_value} else {throw var_$1805_error}))
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
var_$1752_changed = false
if ((var_$1765_init && var_$1766_init && var_$1802_init)) {
if ((var_$1765_changed) || (var_$1766_changed) || (var_$1802_changed)) {
var_$1752_unknown = (var_$1765_unknown && var_$1766_unknown && var_$1802_unknown)
if ((var_$1752_unknown)) {
var_$1752_error = UnknownEventError(null)
} else {
var_$1752_error = null
try {
var_$1752_value = (if ((if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error})) (if((var_$1766_error == null)) {var_$1766_value} else {throw var_$1766_error}) else (if((var_$1802_error == null)) {var_$1802_value} else {throw var_$1802_error}))
} catch {
case var_err : Throwable => {
var_$1752_error = var_err
}
}
}
var_$1752_changed = true
}
}
var_isFinalFalseReset$1619_changed = false
if ((var_$1620_init && var_$1680_init && var_$1736_init)) {
if ((var_$1620_changed) || (var_$1680_changed) || (var_$1736_changed)) {
var_isFinalFalseReset$1619_unknown = (var_$1620_unknown && var_$1680_unknown && var_$1736_unknown)
if ((var_isFinalFalseReset$1619_unknown)) {
var_isFinalFalseReset$1619_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1619_error = null
try {
var_isFinalFalseReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1680_error == null)) {var_$1680_value} else {throw var_$1680_error}) else (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1619_error = var_err
}
}
}
var_isFinalFalseReset$1619_changed = true
}
}
var_$1618_changed = false
if ((var_isFinalFalseReset$1619_changed) || (var_$1736_changed)) {
var_$1618_lastValue = var_$1618_value
var_$1618_lastInit = var_$1618_init
var_$1618_lastError = var_$1618_error
var_$1618_init = true
var_$1618_ts = currTs
var_$1618_changed = true
var_$1618_unknown = (var_isFinalFalseReset$1619_unknown && var_$1736_unknown)
if ((var_isFinalFalseReset$1619_changed)) {
var_$1618_value = var_isFinalFalseReset$1619_value
var_$1618_error = var_isFinalFalseReset$1619_error
} else {
if ((var_$1736_changed)) {
var_$1618_value = var_$1736_value
var_$1618_error = var_$1736_error
}
}
}
var_stillFulfillableReset$1617_changed = false
if ((var_$1618_init && var_$1744_init && var_$1627_init)) {
if ((var_$1618_changed) || (var_$1744_changed) || (var_$1627_changed)) {
var_stillFulfillableReset$1617_unknown = (var_$1618_unknown && var_$1744_unknown && var_$1627_unknown)
if ((var_stillFulfillableReset$1617_unknown)) {
var_stillFulfillableReset$1617_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1617_error = null
try {
var_stillFulfillableReset$1617_value = (if ((if((var_$1618_error == null)) {var_$1618_value} else {throw var_$1618_error})) (if((var_$1744_error == null)) {var_$1744_value} else {throw var_$1744_error}) else (if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_final$1748_changed = false
if ((var_stillFulfillableReset$1617_init)) {
if ((var_stillFulfillableReset$1617_changed)) {
var_final$1748_unknown = (var_stillFulfillableReset$1617_unknown)
if ((var_final$1748_unknown)) {
var_final$1748_error = UnknownEventError(null)
} else {
var_final$1748_error = null
try {
var_final$1748_value = var_$1749.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
} catch {
case var_err : Throwable => {
var_final$1748_error = var_err
}
}
}
var_final$1748_init = true
var_final$1748_changed = true
}
}
var_value$1616_changed = false
if ((var_stillFulfillableReset$1617_init)) {
if ((var_stillFulfillableReset$1617_changed)) {
var_value$1616_unknown = (var_stillFulfillableReset$1617_unknown)
if ((var_value$1616_unknown)) {
var_value$1616_error = UnknownEventError(null)
} else {
var_value$1616_error = null
try {
var_value$1616_value = var_$1730.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
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

if ((var_event_unknown) || (!(var_$1752_error == null)) || (var_$1752_changed && (0L >= var_$1752_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1752_changed)) {
if ((var_safeDelay$1678_changed) || (var_event_changed)) {
var_safeDelay$1678_nextTs = (currTs + var_$1752_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1678_nextTs = -1L
}
}
}
if ((var_value$1616_changed && var_value$1616_init)) {
out_value.apply(var_value$1616_value, currTs, "value", var_value$1616_error)
}
if ((var_final$1748_changed && var_final$1748_init)) {
out_final.apply(var_final$1748_value, currTs, "final", var_final$1748_error)
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
