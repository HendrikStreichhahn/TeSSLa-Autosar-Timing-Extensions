//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_$1666 : scala.Function2[ErrorOption[Long], ErrorOption[Long], ErrorOption[Long]] = ((var_trig$1740 : ErrorOption[Long], var_str$1741 : ErrorOption[Long]) => {
val var_$1742 : ErrorOption[Long] = (if (var_trig$1740.isEmpty) EONone() else var_str$1741)
var_$1742
})
val var_$1653 : scala.Function2[ErrorOption[Boolean], ErrorOption[Long], ErrorOption[Long]] = ((var_trig$1735 : ErrorOption[Boolean], var_str$1736 : ErrorOption[Long]) => {
val var_$1737 : ErrorOption[Long] = (if (var_trig$1735.isEmpty) EONone() else var_str$1736)
var_$1737
})
val var_$1726 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1753 : (Boolean, Boolean)) => {
val var_$1754 : Boolean = var_$1753._2
var_$1754
})
val var_$1728 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1755 : (Boolean, Boolean)) => {
val var_$1756 : Boolean = var_$1755._1
var_$1756
})
lazy val var_$1761 : Boolean = true
val var_$1687 : (Boolean, Boolean) = (false, true)
val var_$1725 : (Boolean, Boolean) = (true, false)
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_start_error : Throwable = null
val var_start_unknown : Boolean = false
var set_var_start : scala.Function2[Long, Long, Unit] = null
var var_start_ts : Long = 0L
var var_start_changed : Boolean = false
val var_preempt_error : Throwable = null
val var_preempt_unknown : Boolean = false
var set_var_preempt : scala.Function2[Long, Long, Unit] = null
var var_preempt_ts : Long = 0L
var var_preempt_changed : Boolean = false
val var_stop_error : Throwable = null
val var_stop_unknown : Boolean = false
var set_var_stop : scala.Function2[Long, Long, Unit] = null
var var_stop_ts : Long = 0L
var var_stop_changed : Boolean = false
val var_resume_error : Throwable = null
val var_resume_unknown : Boolean = false
var set_var_resume : scala.Function2[Long, Long, Unit] = null
var var_resume_value : Long = 0L
var var_resume_ts : Long = 0L
var var_resume_changed : Boolean = false

out_value = null
out_final = null
set_var_start = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_start_changed))) {
var_start_ts = ts
var_start_changed = true
}
})
set_var_preempt = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_preempt_changed))) {
var_preempt_ts = ts
var_preempt_changed = true
}
})
set_var_stop = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_stop_changed))) {
var_stop_ts = ts
var_stop_changed = true
}
})
set_var_resume = ((value : Long, ts : Long) => {

if ((!(currTs == ts))) {
step(ts)
}
if ((!(var_resume_changed))) {
var_resume_value = value
var_resume_ts = ts
var_resume_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
val var_$1776_value : Long = 0L
val var_$1776_error : Throwable = null
val var_$1776_changed : Boolean = false
val var_$1776_unknown : Boolean = false
var var_$1775_changed : Boolean = true
var var_$1775_value : Long = 200L
var var_$1775_init : Boolean = true
var var_$1775_error : Throwable = null
var var_$1775_unknown : Boolean = false
var var_$1778_changed : Boolean = true
var var_$1778_value : Long = 1L
var var_$1778_init : Boolean = true
var var_$1778_error : Throwable = null
var var_$1778_unknown : Boolean = false
var var_$1788_changed : Boolean = false
var var_$1788_error : Throwable = null
var var_$1788_unknown : Boolean = false
var var_$1790_changed : Boolean = false
var var_$1790_error : Throwable = null
var var_$1790_unknown : Boolean = false
var var_mergeUnit2$1759_changed : Boolean = false
var var_mergeUnit2$1759_unknown : Boolean = false
var var_mergeUnit2$1759_error : Throwable = null
var var_$1757_changed : Boolean = false
var var_$1757_error : Throwable = null
var var_$1757_unknown : Boolean = false
var var_$1760_changed : Boolean = false
var var_$1760_error : Throwable = null
var var_$1760_unknown : Boolean = false
var var_mergeUnit2$1731_changed : Boolean = false
var var_mergeUnit2$1731_unknown : Boolean = false
var var_mergeUnit2$1731_error : Throwable = null
var var_$1729_changed : Boolean = false
var var_$1729_error : Throwable = null
var var_$1729_unknown : Boolean = false
var var_$1732_changed : Boolean = false
var var_$1732_error : Throwable = null
var var_$1732_unknown : Boolean = false
var var_mergeUnit2$1636_changed : Boolean = false
var var_mergeUnit2$1636_ts : Long = 0L
var var_mergeUnit2$1636_unknown : Boolean = false
var var_mergeUnit2$1636_error : Throwable = null
var var_$1634_changed : Boolean = false
var var_$1634_value : Boolean = true
var var_$1634_error : Throwable = null
var var_$1634_unknown : Boolean = false
var var_safeDelay$1639_changed : Boolean = false
val var_safeDelay$1639_error : Throwable = null
var var_safeDelay$1639_unknown : Boolean = false
var var_$1637_changed : Boolean = false
var var_$1637_value : Boolean = true
var var_$1637_error : Throwable = null
var var_$1637_unknown : Boolean = false
var var_mergeUnit2$1633_changed : Boolean = false
var var_mergeUnit2$1633_ts : Long = 0L
var var_mergeUnit2$1633_unknown : Boolean = false
var var_mergeUnit2$1633_value : Boolean = true
var var_mergeUnit2$1633_error : Throwable = null
var var_$1632_changed : Boolean = false
var var_$1632_value : Long = 0L
var var_$1632_init : Boolean = false
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1641_changed : Boolean = false
var var_$1641_value : Long = 0L
var var_$1641_unknown : Boolean = false
var var_$1641_error : Throwable = null
var var_defaultTime$1640_changed : Boolean = true
var var_defaultTime$1640_value : Long = -1L
var var_defaultTime$1640_init : Boolean = true
var var_defaultTime$1640_error : Throwable = null
var var_defaultTime$1640_unknown : Boolean = false
var var_$1631_changed : Boolean = false
var var_$1631_unknown : Boolean = false
var var_$1631_error : Throwable = null
var var_$1631_value : Boolean = false
var var_$1631_init : Boolean = false
var var_$1663_changed : Boolean = false
var var_$1663_value : Long = 0L
var var_$1663_init : Boolean = false
var var_$1663_unknown : Boolean = false
var var_$1663_error : Throwable = null
var var_$1772_changed : Boolean = false
var var_$1772_value : Long = 0L
var var_$1772_init : Boolean = false
var var_$1772_unknown : Boolean = false
var var_$1772_error : Throwable = null
var var_$1662_changed : Boolean = false
var var_$1662_lastValue : Long = 0L
var var_$1662_lastInit : Boolean = false
var var_$1662_lastError : Throwable = null
var var_$1662_unknown : Boolean = false
var var_$1662_error : Throwable = null
var var_$1662_value : Long = 0L
var var_$1662_init : Boolean = false
var var_$1662_ts : Long = 0L
var var_mergedStream$1665_changed : Boolean = false
var var_mergedStream$1665_unknown : Boolean = false
var var_mergedStream$1665_error : Throwable = null
var var_mergedStream$1665_value : Long = 0L
var var_$1661_changed : Boolean = false
var var_$1661_unknown : Boolean = false
var var_$1661_value : Long = 0L
var var_$1661_error : Throwable = null
var var_on$1660_changed : Boolean = false
var var_on$1660_error : Throwable = null
var var_on$1660_unknown : Boolean = false
var var_on$1660_fval : ErrorOption[Long] = null
var var_on$1660_newValue : Long = 0L
var var_on$1660_init : Boolean = false
var var_on$1660_ts : Long = 0L
var var_on$1660_value : Long = 0L
var var_$1675_changed : Boolean = false
var var_$1675_init : Boolean = false
var var_$1675_unknown : Boolean = false
var var_$1675_error : Throwable = null
var var_$1675_value : Long = 0L
var var_mergedStream$1652_changed : Boolean = false
var var_mergedStream$1652_unknown : Boolean = false
var var_mergedStream$1652_error : Throwable = null
var var_mergedStream$1652_value : Long = 0L
var var_$1770_changed : Boolean = false
var var_$1770_value : Long = 0L
var var_$1770_init : Boolean = false
var var_$1770_unknown : Boolean = false
var var_$1770_error : Throwable = null
var var_$1765_changed : Boolean = false
var var_$1765_unknown : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_value : Boolean = false
var var_$1765_init : Boolean = false
var var_$1644_changed : Boolean = true
var var_$1644_value : Long = 100L
var var_$1644_init : Boolean = true
var var_$1644_error : Throwable = null
var var_$1644_unknown : Boolean = false
var var_$1672_changed : Boolean = false
var var_$1672_value : Long = 0L
var var_$1672_init : Boolean = false
var var_$1672_unknown : Boolean = false
var var_$1672_error : Throwable = null
var var_$1649_changed : Boolean = false
var var_$1649_lastValue : Long = 0L
var var_$1649_lastInit : Boolean = false
var var_$1649_lastError : Throwable = null
var var_$1649_unknown : Boolean = false
var var_$1649_error : Throwable = null
var var_$1649_value : Long = 0L
var var_$1649_init : Boolean = false
var var_$1649_ts : Long = 0L
var var_$1648_changed : Boolean = false
var var_$1648_unknown : Boolean = false
var var_$1648_value : Long = 0L
var var_$1648_error : Throwable = null
var var_on$1647_changed : Boolean = false
var var_on$1647_error : Throwable = null
var var_on$1647_unknown : Boolean = false
var var_on$1647_fval : ErrorOption[Long] = null
var var_on$1647_newValue : Long = 0L
var var_on$1647_init : Boolean = false
var var_on$1647_value : Long = 0L
var var_$1659_changed : Boolean = false
var var_$1659_value : Long = 0L
var var_$1659_init : Boolean = false
var var_$1659_unknown : Boolean = false
var var_$1659_error : Throwable = null
var var_$1657_changed : Boolean = false
var var_$1657_unknown : Boolean = false
var var_$1657_error : Throwable = null
var var_$1657_value : Boolean = false
var var_$1656_changed : Boolean = true
var var_$1656_value : Boolean = false
var var_$1656_init : Boolean = true
var var_$1656_error : Throwable = null
var var_$1656_unknown : Boolean = false
var var_$1782_changed : Boolean = true
var var_$1782_value : Long = 0L
var var_$1782_init : Boolean = true
var var_$1782_error : Throwable = null
var var_$1782_unknown : Boolean = false
var var_$1671_changed : Boolean = false
var var_$1671_unknown : Boolean = false
var var_$1671_error : Throwable = null
var var_$1671_value : Boolean = false
var var_$1670_changed : Boolean = true
var var_$1670_value : Boolean = false
var var_$1670_init : Boolean = true
var var_$1670_error : Throwable = null
var var_$1670_unknown : Boolean = false
var var_$1674_changed : Boolean = false
var var_$1674_unknown : Boolean = false
var var_$1674_error : Throwable = null
var var_$1674_value : Long = 0L
var var_$1674_init : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_sum$1655_changed : Boolean = false
var var_sum$1655_unknown : Boolean = false
var var_sum$1655_error : Throwable = null
var var_sum$1655_value : Long = 0L
var var_resetSum$1654_changed : Boolean = true
var var_resetSum$1654_lastValue : Long = 0L
var var_resetSum$1654_lastInit : Boolean = false
var var_resetSum$1654_lastError : Throwable = null
var var_resetSum$1654_value : Long = 0L
var var_resetSum$1654_init : Boolean = true
var var_resetSum$1654_ts : Long = 0L
var var_resetSum$1654_error : Throwable = null
var var_resetSum$1654_unknown : Boolean = false
var var_$1777_changed : Boolean = false
var var_$1777_unknown : Boolean = false
var var_$1777_error : Throwable = null
var var_$1777_value : Long = 0L
var var_$1777_init : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : Boolean = false
var var_$1643_init : Boolean = false
var var_$1681_changed : Boolean = false
var var_$1681_unknown : Boolean = false
var var_$1681_error : Throwable = null
var var_$1681_value : Boolean = false
var var_$1681_init : Boolean = false
var var_$1642_changed : Boolean = false
var var_$1642_unknown : Boolean = false
var var_$1642_error : Throwable = null
var var_$1642_value : Boolean = false
var var_$1642_init : Boolean = false
var var_$1630_changed : Boolean = false
var var_$1630_unknown : Boolean = false
var var_$1630_error : Throwable = null
var var_$1630_value : Boolean = false
var var_$1630_init : Boolean = false
val var_$1689_value : (Boolean, Boolean) = (false, false)
val var_$1689_error : Throwable = null
val var_$1689_changed : Boolean = false
val var_$1689_unknown : Boolean = false
var var_$1685_changed : Boolean = true
var var_$1685_value : (Boolean, Boolean) = var_$1687
var var_$1685_init : Boolean = true
var var_$1685_error : Throwable = null
var var_$1685_unknown : Boolean = false
var var_$1688_changed : Boolean = true
var var_$1688_value : (Boolean, Boolean) = var_$1725
var var_$1688_init : Boolean = true
var var_$1688_error : Throwable = null
var var_$1688_unknown : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : (Boolean, Boolean) = (false, false)
var var_$1629_init : Boolean = false
var var_$1629_ts : Long = 0L
var var_$1703_changed : Boolean = false
var var_$1703_unknown : Boolean = false
var var_$1703_error : Throwable = null
var var_$1703_value : Boolean = false
var var_$1703_init : Boolean = false
val var_$1711_value : Boolean = false
val var_$1711_error : Throwable = null
val var_$1711_changed : Boolean = false
val var_$1711_unknown : Boolean = false
var var_$1705_changed : Boolean = true
var var_$1705_value : Boolean = true
var var_$1705_init : Boolean = true
var var_$1705_error : Throwable = null
var var_$1705_unknown : Boolean = false
var var_$1702_changed : Boolean = false
var var_$1702_unknown : Boolean = false
var var_$1702_error : Throwable = null
var var_$1702_value : Boolean = false
var var_$1702_init : Boolean = false
var var_$1693_changed : Boolean = false
var var_$1693_unknown : Boolean = false
var var_$1693_error : Throwable = null
var var_$1693_value : Boolean = false
var var_$1693_init : Boolean = false
var var_$1710_changed : Boolean = true
var var_$1710_value : Boolean = false
var var_$1710_init : Boolean = true
var var_$1710_error : Throwable = null
var var_$1710_unknown : Boolean = false
var var_$1707_changed : Boolean = false
var var_$1707_unknown : Boolean = false
var var_$1707_error : Throwable = null
var var_$1707_value : Boolean = false
var var_$1707_init : Boolean = false
var var_$1701_changed : Boolean = false
var var_$1701_unknown : Boolean = false
var var_$1701_error : Throwable = null
var var_$1701_value : Boolean = false
var var_$1701_init : Boolean = false
var var_$1718_changed : Boolean = false
var var_$1718_value : Long = 0L
var var_$1718_init : Boolean = false
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_$1692_changed : Boolean = false
var var_$1692_unknown : Boolean = false
var var_$1692_error : Throwable = null
var var_$1692_value : Boolean = false
var var_$1692_init : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : Boolean = false
var var_$1627_init : Boolean = false
var var_$1699_changed : Boolean = false
var var_$1699_init : Boolean = false
var var_$1699_unknown : Boolean = false
var var_$1699_error : Throwable = null
var var_$1699_value : Boolean = false
var var_isFinalFalse$1698_changed : Boolean = false
var var_isFinalFalse$1698_unknown : Boolean = false
var var_isFinalFalse$1698_error : Throwable = null
var var_isFinalFalse$1698_value : Boolean = false
var var_$1697_changed : Boolean = true
var var_$1697_lastValue : Boolean = false
var var_$1697_lastInit : Boolean = false
var var_$1697_lastError : Throwable = null
var var_$1697_value : Boolean = false
var var_$1697_init : Boolean = true
var var_$1697_ts : Long = 0L
var var_$1697_error : Throwable = null
var var_$1697_unknown : Boolean = false
var var_prev$1696_changed : Boolean = false
var var_prev$1696_init : Boolean = false
var var_prev$1696_unknown : Boolean = false
var var_prev$1696_error : Throwable = null
var var_prev$1696_value : Boolean = false
var var_$1695_changed : Boolean = false
var var_$1695_unknown : Boolean = false
var var_$1695_error : Throwable = null
var var_$1695_value : Boolean = false
var var_$1695_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_$1713_changed : Boolean = false
var var_$1713_init : Boolean = false
var var_$1713_unknown : Boolean = false
var var_$1713_error : Throwable = null
var var_$1713_value : Long = 0L
var var_finalFalseSince$1625_changed : Boolean = false
var var_finalFalseSince$1625_unknown : Boolean = false
var var_finalFalseSince$1625_error : Throwable = null
var var_finalFalseSince$1625_value : Long = 0L
var var_$1714_changed : Boolean = true
var var_$1714_lastValue : Long = 0L
var var_$1714_lastInit : Boolean = false
var var_$1714_lastError : Throwable = null
var var_$1714_value : Long = 9223372036854775807L
var var_$1714_init : Boolean = true
var var_$1714_ts : Long = 0L
var var_$1714_error : Throwable = null
var var_$1714_unknown : Boolean = false
var var_$1785_changed : Boolean = true
var var_$1785_value : Long = 9223372036854775807L
var var_$1785_init : Boolean = true
var var_$1785_error : Throwable = null
var var_$1785_unknown : Boolean = false
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
var var_defaultTime$1771_changed : Boolean = true
var var_defaultTime$1771_value : Long = -1L
var var_defaultTime$1771_init : Boolean = true
var var_defaultTime$1771_error : Throwable = null
var var_defaultTime$1771_unknown : Boolean = false
var var_$1769_changed : Boolean = false
var var_$1769_unknown : Boolean = false
var var_$1769_error : Throwable = null
var var_$1769_value : Boolean = false
var var_$1769_init : Boolean = false
var var_$1764_changed : Boolean = false
var var_$1764_unknown : Boolean = false
var var_$1764_error : Throwable = null
var var_$1764_value : Boolean = false
var var_$1764_init : Boolean = false
var var_$1774_changed : Boolean = false
var var_$1774_unknown : Boolean = false
var var_$1774_error : Throwable = null
var var_$1774_value : Long = 0L
var var_$1774_init : Boolean = false
var var_$1773_changed : Boolean = false
var var_$1773_unknown : Boolean = false
var var_$1773_error : Throwable = null
var var_$1773_value : Long = 0L
var var_$1773_init : Boolean = false
var var_$1780_changed : Boolean = true
var var_$1780_value : Long = -1L
var var_$1780_init : Boolean = true
var var_$1780_error : Throwable = null
var var_$1780_unknown : Boolean = false
var var_$1763_changed : Boolean = false
var var_$1763_unknown : Boolean = false
var var_$1763_error : Throwable = null
var var_$1763_value : Long = 0L
var var_$1763_init : Boolean = false
var var_$1763_ts : Long = 0L
var var_$1762_changed : Boolean = false
var var_$1762_unknown : Boolean = false
var var_$1762_error : Throwable = null
var var_$1762_value : Boolean = false
var var_$1762_init : Boolean = false
var var_$1787_changed : Boolean = false
var var_$1787_value : Long = 0L
var var_$1787_init : Boolean = false
var var_$1787_unknown : Boolean = false
var var_$1787_error : Throwable = null
var var_$1784_changed : Boolean = false
var var_$1784_unknown : Boolean = false
var var_$1784_error : Throwable = null
var var_$1784_value : Long = 0L
var var_$1784_init : Boolean = false
var var_$1734_changed : Boolean = false
var var_$1734_unknown : Boolean = false
var var_$1734_error : Throwable = null
var var_$1734_value : Long = 0L
var var_stillFulfillableReset$1619_changed : Boolean = false
var var_stillFulfillableReset$1619_unknown : Boolean = false
var var_stillFulfillableReset$1619_error : Throwable = null
var var_stillFulfillableReset$1619_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1619_init : Boolean = false
var var_final$1727_changed : Boolean = false
var var_final$1727_unknown : Boolean = false
var var_final$1727_error : Throwable = null
var var_final$1727_value : Boolean = false
var var_final$1727_init : Boolean = false
var var_value$1618_changed : Boolean = false
var var_value$1618_unknown : Boolean = false
var var_value$1618_error : Throwable = null
var var_value$1618_value : Boolean = false
var var_value$1618_init : Boolean = false
var var_safeDelay$1639_nextTs : Long = -1L



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

if (((var_safeDelay$1639_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1639_nextTs))) {
currTs = var_safeDelay$1639_nextTs
}

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
if ((!(currTs == 0L))) {
var_$1778_changed = false
}
if ((var_$1776_changed)) {
var_$1778_value = var_$1776_value
var_$1778_init = true
var_$1778_error = var_$1776_error
var_$1778_changed = true
var_$1778_unknown = var_$1776_unknown
}
var_$1788_changed = false
if ((var_start_changed)) {
if ((var_start_unknown)) {
var_$1788_error = UnknownEventError(var_start_error)
} else {
var_$1788_error = null
}
var_$1788_changed = var_start_changed
var_$1788_unknown = var_start_unknown
}
var_$1790_changed = false
if ((var_stop_changed)) {
if ((var_stop_unknown)) {
var_$1790_error = UnknownEventError(var_stop_error)
} else {
var_$1790_error = null
}
var_$1790_changed = var_stop_changed
var_$1790_unknown = var_stop_unknown
}
var_mergeUnit2$1759_changed = false
if ((var_$1788_changed) || (var_$1790_changed)) {
var_mergeUnit2$1759_changed = true
var_mergeUnit2$1759_unknown = (var_$1788_unknown && var_$1790_unknown)
if ((var_$1788_changed)) {
var_mergeUnit2$1759_error = var_$1788_error
} else {
if ((var_$1790_changed)) {
var_mergeUnit2$1759_error = var_$1790_error
}
}
}
var_$1757_changed = false
if ((var_mergeUnit2$1759_changed)) {
if ((var_mergeUnit2$1759_unknown)) {
var_$1757_error = UnknownEventError(var_mergeUnit2$1759_error)
} else {
var_$1757_error = null
}
var_$1757_changed = var_mergeUnit2$1759_changed
var_$1757_unknown = var_mergeUnit2$1759_unknown
}
var_$1760_changed = false
if ((var_preempt_changed)) {
if ((var_preempt_unknown)) {
var_$1760_error = UnknownEventError(var_preempt_error)
} else {
var_$1760_error = null
}
var_$1760_changed = var_preempt_changed
var_$1760_unknown = var_preempt_unknown
}
var_mergeUnit2$1731_changed = false
if ((var_$1757_changed) || (var_$1760_changed)) {
var_mergeUnit2$1731_changed = true
var_mergeUnit2$1731_unknown = (var_$1757_unknown && var_$1760_unknown)
if ((var_$1757_changed)) {
var_mergeUnit2$1731_error = var_$1757_error
} else {
if ((var_$1760_changed)) {
var_mergeUnit2$1731_error = var_$1760_error
}
}
}
var_$1729_changed = false
if ((var_mergeUnit2$1731_changed)) {
if ((var_mergeUnit2$1731_unknown)) {
var_$1729_error = UnknownEventError(var_mergeUnit2$1731_error)
} else {
var_$1729_error = null
}
var_$1729_changed = var_mergeUnit2$1731_changed
var_$1729_unknown = var_mergeUnit2$1731_unknown
}
var_$1732_changed = false
if ((var_resume_changed)) {
if ((var_resume_unknown)) {
var_$1732_error = UnknownEventError(var_resume_error)
} else {
var_$1732_error = null
}
var_$1732_changed = var_resume_changed
var_$1732_unknown = var_resume_unknown
}
var_mergeUnit2$1636_changed = false
if ((var_$1729_changed) || (var_$1732_changed)) {
var_mergeUnit2$1636_ts = currTs
var_mergeUnit2$1636_changed = true
var_mergeUnit2$1636_unknown = (var_$1729_unknown && var_$1732_unknown)
if ((var_$1729_changed)) {
var_mergeUnit2$1636_error = var_$1729_error
} else {
if ((var_$1732_changed)) {
var_mergeUnit2$1636_error = var_$1732_error
}
}
}
var_$1634_changed = false
if ((var_mergeUnit2$1636_changed)) {
var_$1634_value = var_$1761
if ((var_mergeUnit2$1636_unknown)) {
var_$1634_error = UnknownEventError(var_mergeUnit2$1636_error)
} else {
var_$1634_error = null
}
var_$1634_changed = var_mergeUnit2$1636_changed
var_$1634_unknown = var_mergeUnit2$1636_unknown
}
var_safeDelay$1639_changed = false
if ((var_safeDelay$1639_nextTs == currTs)) {
var_safeDelay$1639_changed = true
var_safeDelay$1639_unknown = false
}
var_$1637_changed = false
if ((var_safeDelay$1639_changed)) {
var_$1637_value = var_$1761
if ((var_safeDelay$1639_unknown)) {
var_$1637_error = UnknownEventError(var_safeDelay$1639_error)
} else {
var_$1637_error = null
}
var_$1637_changed = var_safeDelay$1639_changed
var_$1637_unknown = var_safeDelay$1639_unknown
}
var_mergeUnit2$1633_changed = false
if ((var_$1634_changed) || (var_$1637_changed)) {
var_mergeUnit2$1633_ts = currTs
var_mergeUnit2$1633_changed = true
var_mergeUnit2$1633_unknown = (var_$1634_unknown && var_$1637_unknown)
if ((var_$1634_changed)) {
var_mergeUnit2$1633_value = var_$1634_value
var_mergeUnit2$1633_error = var_$1634_error
} else {
if ((var_$1637_changed)) {
var_mergeUnit2$1633_value = var_$1637_value
var_mergeUnit2$1633_error = var_$1637_error
}
}
}
var_$1632_changed = false
if ((var_mergeUnit2$1633_changed)) {
var_$1632_value = var_mergeUnit2$1633_ts
var_$1632_init = true
var_$1632_unknown = var_mergeUnit2$1633_unknown
if ((var_$1632_unknown)) {
var_$1632_error = var_mergeUnit2$1633_error
} else {
var_$1632_error = null
}
var_$1632_changed = true
}
var_$1641_changed = false
if ((var_stop_changed)) {
var_$1641_value = var_stop_ts
var_$1641_unknown = var_stop_unknown
if ((var_$1641_unknown)) {
var_$1641_error = var_stop_error
} else {
var_$1641_error = null
}
var_$1641_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1640_changed = false
}
if ((var_$1641_changed)) {
var_defaultTime$1640_value = var_$1641_value
var_defaultTime$1640_init = true
var_defaultTime$1640_error = var_$1641_error
var_defaultTime$1640_changed = true
var_defaultTime$1640_unknown = var_$1641_unknown
}
var_$1631_changed = false
if ((var_$1632_init && var_defaultTime$1640_init)) {
if ((var_$1632_changed) || (var_defaultTime$1640_changed)) {
var_$1631_unknown = (var_$1632_unknown && var_defaultTime$1640_unknown)
if ((var_$1631_unknown)) {
var_$1631_error = UnknownEventError(null)
} else {
var_$1631_error = null
try {
var_$1631_value = ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}) == (if((var_defaultTime$1640_error == null)) {var_defaultTime$1640_value} else {throw var_defaultTime$1640_error}))
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
var_$1663_changed = false
if ((var_resume_changed)) {
var_$1663_value = var_resume_ts
var_$1663_init = true
var_$1663_unknown = var_resume_unknown
if ((var_$1663_unknown)) {
var_$1663_error = var_resume_error
} else {
var_$1663_error = null
}
var_$1663_changed = true
}
var_$1772_changed = false
if ((var_preempt_changed)) {
var_$1772_value = var_preempt_ts
var_$1772_init = true
var_$1772_unknown = var_preempt_unknown
if ((var_$1772_unknown)) {
var_$1772_error = var_preempt_error
} else {
var_$1772_error = null
}
var_$1772_changed = true
}
var_$1662_changed = false
if ((var_$1663_init && var_$1772_init)) {
if ((var_$1663_changed) || (var_$1772_changed)) {
var_$1662_lastValue = var_$1662_value
var_$1662_lastInit = var_$1662_init
var_$1662_lastError = var_$1662_error
var_$1662_unknown = (var_$1663_unknown && var_$1772_unknown)
if ((var_$1662_unknown)) {
var_$1662_error = UnknownEventError(null)
} else {
var_$1662_error = null
try {
var_$1662_value = ((if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}) - (if((var_$1772_error == null)) {var_$1772_value} else {throw var_$1772_error}))
} catch {
case var_err : Throwable => {
var_$1662_error = var_err
}
}
}
var_$1662_init = true
var_$1662_ts = currTs
var_$1662_changed = true
}
}
var_mergedStream$1665_changed = false
if ((var_resume_changed)) {
if ((var_$1662_ts == currTs && var_$1662_lastInit) || (!(var_$1662_ts == currTs) && var_$1662_init)) {
var_mergedStream$1665_changed = true
var_mergedStream$1665_unknown = var_resume_unknown
if ((var_mergedStream$1665_unknown)) {
var_mergedStream$1665_error = var_resume_error
} else {
if ((var_$1662_ts == currTs)) {
var_mergedStream$1665_value = var_$1662_lastValue
var_mergedStream$1665_error = var_$1662_lastError
} else {
var_mergedStream$1665_value = var_$1662_value
var_mergedStream$1665_error = var_$1662_error
}
}
}
}
var_$1661_changed = false
if ((var_$1662_changed) || (var_mergedStream$1665_changed)) {
var_$1661_changed = true
var_$1661_unknown = (var_$1662_unknown && var_mergedStream$1665_unknown)
if ((var_$1662_changed)) {
var_$1661_value = var_$1662_value
var_$1661_error = var_$1662_error
} else {
if ((var_mergedStream$1665_changed)) {
var_$1661_value = var_mergedStream$1665_value
var_$1661_error = var_mergedStream$1665_error
}
}
}
var_on$1660_changed = false
if ((var_resume_changed) || (var_$1661_changed)) {
var_on$1660_error = null
try {
var_on$1660_unknown = true
var_on$1660_fval = var_$1666.apply((if((var_resume_changed)) {EOSome((if((var_resume_error == null)) {var_resume_value} else {throw var_resume_error}))} else {EONone()}), (if((var_$1661_changed)) {EOSome((if((var_$1661_error == null)) {var_$1661_value} else {throw var_$1661_error}))} else {EONone()}))
var_on$1660_unknown = false
if ((var_on$1660_fval.isDefined)) {
var_on$1660_changed = true
var_on$1660_newValue = var_on$1660_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1660_changed = true
var_on$1660_error = var_err
}
}
if ((var_on$1660_unknown) || (var_resume_unknown && var_$1661_unknown)) {
var_on$1660_changed = true
var_on$1660_unknown = true
var_on$1660_error = UnknownEventError(var_on$1660_error)
}
if ((var_on$1660_changed)) {
var_on$1660_init = true
var_on$1660_ts = currTs
var_on$1660_value = var_on$1660_newValue
}
}
var_$1675_changed = false
if ((var_on$1660_changed)) {
if ((var_resetSum$1654_ts == currTs && var_resetSum$1654_lastInit) || (!(var_resetSum$1654_ts == currTs) && var_resetSum$1654_init)) {
var_$1675_changed = true
var_$1675_init = true
var_$1675_unknown = var_on$1660_unknown
if ((var_$1675_unknown)) {
var_$1675_error = var_on$1660_error
} else {
if ((var_resetSum$1654_ts == currTs)) {
var_$1675_value = var_resetSum$1654_lastValue
var_$1675_error = var_resetSum$1654_lastError
} else {
var_$1675_value = var_resetSum$1654_value
var_$1675_error = var_resetSum$1654_error
}
}
}
}
var_mergedStream$1652_changed = false
if ((var_mergeUnit2$1633_changed)) {
if ((var_$1649_ts == currTs && var_$1649_lastInit) || (!(var_$1649_ts == currTs) && var_$1649_init)) {
var_mergedStream$1652_changed = true
var_mergedStream$1652_unknown = var_mergeUnit2$1633_unknown
if ((var_mergedStream$1652_unknown)) {
var_mergedStream$1652_error = var_mergeUnit2$1633_error
} else {
if ((var_$1649_ts == currTs)) {
var_mergedStream$1652_value = var_$1649_lastValue
var_mergedStream$1652_error = var_$1649_lastError
} else {
var_mergedStream$1652_value = var_$1649_value
var_mergedStream$1652_error = var_$1649_error
}
}
}
}
var_$1770_changed = false
if ((var_mergeUnit2$1636_changed)) {
var_$1770_value = var_mergeUnit2$1636_ts
var_$1770_init = true
var_$1770_unknown = var_mergeUnit2$1636_unknown
if ((var_$1770_unknown)) {
var_$1770_error = var_mergeUnit2$1636_error
} else {
var_$1770_error = null
}
var_$1770_changed = true
}
var_$1765_changed = false
if ((var_$1770_init && var_defaultTime$1640_init)) {
if ((var_$1770_changed) || (var_defaultTime$1640_changed)) {
var_$1765_unknown = (var_$1770_unknown && var_defaultTime$1640_unknown)
if ((var_$1765_unknown)) {
var_$1765_error = UnknownEventError(null)
} else {
var_$1765_error = null
try {
var_$1765_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) != (if((var_defaultTime$1640_error == null)) {var_defaultTime$1640_value} else {throw var_defaultTime$1640_error}))
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
if ((!(currTs == 0L))) {
var_$1644_changed = false
}
if ((var_$1776_changed)) {
var_$1644_value = var_$1776_value
var_$1644_init = true
var_$1644_error = var_$1776_error
var_$1644_changed = true
var_$1644_unknown = var_$1776_unknown
}
var_$1672_changed = false
if ((var_start_changed)) {
var_$1672_value = var_start_ts
var_$1672_init = true
var_$1672_unknown = var_start_unknown
if ((var_$1672_unknown)) {
var_$1672_error = var_start_error
} else {
var_$1672_error = null
}
var_$1672_changed = true
}
var_$1649_changed = false
if ((var_$1632_init && var_$1672_init)) {
if ((var_$1632_changed) || (var_$1672_changed)) {
var_$1649_lastValue = var_$1649_value
var_$1649_lastInit = var_$1649_init
var_$1649_lastError = var_$1649_error
var_$1649_unknown = (var_$1632_unknown && var_$1672_unknown)
if ((var_$1649_unknown)) {
var_$1649_error = UnknownEventError(null)
} else {
var_$1649_error = null
try {
var_$1649_value = ((if((var_$1632_error == null)) {var_$1632_value} else {throw var_$1632_error}) - (if((var_$1672_error == null)) {var_$1672_value} else {throw var_$1672_error}))
} catch {
case var_err : Throwable => {
var_$1649_error = var_err
}
}
}
var_$1649_init = true
var_$1649_ts = currTs
var_$1649_changed = true
}
}
var_$1648_changed = false
if ((var_$1649_changed) || (var_mergedStream$1652_changed)) {
var_$1648_changed = true
var_$1648_unknown = (var_$1649_unknown && var_mergedStream$1652_unknown)
if ((var_$1649_changed)) {
var_$1648_value = var_$1649_value
var_$1648_error = var_$1649_error
} else {
if ((var_mergedStream$1652_changed)) {
var_$1648_value = var_mergedStream$1652_value
var_$1648_error = var_mergedStream$1652_error
}
}
}
var_on$1647_changed = false
if ((var_mergeUnit2$1633_changed) || (var_$1648_changed)) {
var_on$1647_error = null
try {
var_on$1647_unknown = true
var_on$1647_fval = var_$1653.apply((if((var_mergeUnit2$1633_changed)) {EOSome((if((var_mergeUnit2$1633_error == null)) {var_mergeUnit2$1633_value} else {throw var_mergeUnit2$1633_error}))} else {EONone()}), (if((var_$1648_changed)) {EOSome((if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}))} else {EONone()}))
var_on$1647_unknown = false
if ((var_on$1647_fval.isDefined)) {
var_on$1647_changed = true
var_on$1647_newValue = var_on$1647_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1647_changed = true
var_on$1647_error = var_err
}
}
if ((var_on$1647_unknown) || (var_mergeUnit2$1633_unknown && var_$1648_unknown)) {
var_on$1647_changed = true
var_on$1647_unknown = true
var_on$1647_error = UnknownEventError(var_on$1647_error)
}
if ((var_on$1647_changed)) {
var_on$1647_init = true
var_on$1647_value = var_on$1647_newValue
}
}
var_$1659_changed = false
if ((var_on$1660_changed)) {
var_$1659_value = var_on$1660_ts
var_$1659_init = true
var_$1659_unknown = var_on$1660_unknown
if ((var_$1659_unknown)) {
var_$1659_error = var_on$1660_error
} else {
var_$1659_error = null
}
var_$1659_changed = true
}
var_$1657_changed = false
if ((var_$1672_init && var_$1659_init)) {
if ((var_$1672_changed) || (var_$1659_changed)) {
var_$1657_unknown = (var_$1672_unknown && var_$1659_unknown)
if ((var_$1657_unknown)) {
var_$1657_error = UnknownEventError(null)
} else {
var_$1657_error = null
try {
var_$1657_value = ((if((var_$1672_error == null)) {var_$1672_value} else {throw var_$1672_error}) > (if((var_$1659_error == null)) {var_$1659_value} else {throw var_$1659_error}))
} catch {
case var_err : Throwable => {
var_$1657_error = var_err
}
}
}
var_$1657_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1656_changed = false
}
if ((var_$1657_changed)) {
var_$1656_value = var_$1657_value
var_$1656_init = true
var_$1656_error = var_$1657_error
var_$1656_changed = true
var_$1656_unknown = var_$1657_unknown
}
if ((!(currTs == 0L))) {
var_$1782_changed = false
}
if ((var_$1776_changed)) {
var_$1782_value = var_$1776_value
var_$1782_init = true
var_$1782_error = var_$1776_error
var_$1782_changed = true
var_$1782_unknown = var_$1776_unknown
}
var_$1671_changed = false
if ((var_$1672_init && var_$1659_init)) {
if ((var_$1672_changed) || (var_$1659_changed)) {
var_$1671_unknown = (var_$1672_unknown && var_$1659_unknown)
if ((var_$1671_unknown)) {
var_$1671_error = UnknownEventError(null)
} else {
var_$1671_error = null
try {
var_$1671_value = ((if((var_$1672_error == null)) {var_$1672_value} else {throw var_$1672_error}) == (if((var_$1659_error == null)) {var_$1659_value} else {throw var_$1659_error}))
} catch {
case var_err : Throwable => {
var_$1671_error = var_err
}
}
}
var_$1671_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1670_changed = false
}
if ((var_$1671_changed)) {
var_$1670_value = var_$1671_value
var_$1670_init = true
var_$1670_error = var_$1671_error
var_$1670_changed = true
var_$1670_unknown = var_$1671_unknown
}
var_$1674_changed = false
if ((var_$1675_init && var_on$1660_init)) {
if ((var_$1675_changed) || (var_on$1660_changed)) {
var_$1674_unknown = (var_$1675_unknown && var_on$1660_unknown)
if ((var_$1674_unknown)) {
var_$1674_error = UnknownEventError(null)
} else {
var_$1674_error = null
try {
var_$1674_value = ((if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error}) + (if((var_on$1660_error == null)) {var_on$1660_value} else {throw var_on$1660_error}))
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
var_$1669_changed = false
if ((var_$1670_init && var_on$1660_init && var_$1674_init)) {
if ((var_$1670_changed) || (var_on$1660_changed) || (var_$1674_changed)) {
var_$1669_unknown = (var_$1670_unknown && var_on$1660_unknown && var_$1674_unknown)
if ((var_$1669_unknown)) {
var_$1669_error = UnknownEventError(null)
} else {
var_$1669_error = null
try {
var_$1669_value = (if ((if((var_$1670_error == null)) {var_$1670_value} else {throw var_$1670_error})) (if((var_on$1660_error == null)) {var_on$1660_value} else {throw var_on$1660_error}) else (if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}))
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
var_sum$1655_changed = false
if ((var_$1656_init && var_$1782_init && var_$1669_init)) {
if ((var_$1656_changed) || (var_$1782_changed) || (var_$1669_changed)) {
var_sum$1655_unknown = (var_$1656_unknown && var_$1782_unknown && var_$1669_unknown)
if ((var_sum$1655_unknown)) {
var_sum$1655_error = UnknownEventError(null)
} else {
var_sum$1655_error = null
try {
var_sum$1655_value = (if ((if((var_$1656_error == null)) {var_$1656_value} else {throw var_$1656_error})) (if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}) else (if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}))
} catch {
case var_err : Throwable => {
var_sum$1655_error = var_err
}
}
}
var_sum$1655_changed = true
}
}
if ((!(currTs == 0L))) {
var_resetSum$1654_changed = false
}
if ((var_sum$1655_changed)) {
var_resetSum$1654_lastValue = var_resetSum$1654_value
var_resetSum$1654_lastInit = var_resetSum$1654_init
var_resetSum$1654_lastError = var_resetSum$1654_error
var_resetSum$1654_value = var_sum$1655_value
var_resetSum$1654_init = true
var_resetSum$1654_ts = currTs
var_resetSum$1654_error = var_sum$1655_error
var_resetSum$1654_changed = true
var_resetSum$1654_unknown = var_sum$1655_unknown
}
var_$1777_changed = false
if ((var_on$1647_init && var_resetSum$1654_init)) {
if ((var_on$1647_changed) || (var_resetSum$1654_changed)) {
var_$1777_unknown = (var_on$1647_unknown && var_resetSum$1654_unknown)
if ((var_$1777_unknown)) {
var_$1777_error = UnknownEventError(null)
} else {
var_$1777_error = null
try {
var_$1777_value = ((if((var_on$1647_error == null)) {var_on$1647_value} else {throw var_on$1647_error}) - (if((var_resetSum$1654_error == null)) {var_resetSum$1654_value} else {throw var_resetSum$1654_error}))
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
var_$1643_changed = false
if ((var_$1644_init && var_$1777_init)) {
if ((var_$1644_changed) || (var_$1777_changed)) {
var_$1643_unknown = (var_$1644_unknown && var_$1777_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = ((if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}) <= (if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}))
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
var_$1681_changed = false
if ((var_$1777_init && var_$1775_init)) {
if ((var_$1777_changed) || (var_$1775_changed)) {
var_$1681_unknown = (var_$1777_unknown && var_$1775_unknown)
if ((var_$1681_unknown)) {
var_$1681_error = UnknownEventError(null)
} else {
var_$1681_error = null
try {
var_$1681_value = ((if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}) <= (if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}))
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
var_$1642_changed = false
if ((var_$1643_init && var_$1681_init)) {
if ((var_$1643_changed) || (var_$1681_changed)) {
var_$1642_unknown = (var_$1643_unknown && var_$1681_unknown)
if ((var_$1642_unknown)) {
var_$1642_error = UnknownEventError(null)
} else {
var_$1642_error = null
try {
var_$1642_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) && (if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}))
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
var_$1630_changed = false
if ((var_$1631_init && var_$1642_init && var_$1681_init)) {
if ((var_$1631_changed) || (var_$1642_changed) || (var_$1681_changed)) {
var_$1630_unknown = (var_$1631_unknown && var_$1642_unknown && var_$1681_unknown)
if ((var_$1630_unknown)) {
var_$1630_error = UnknownEventError(null)
} else {
var_$1630_error = null
try {
var_$1630_value = (if ((if((var_$1631_error == null)) {var_$1631_value} else {throw var_$1631_error})) (if((var_$1642_error == null)) {var_$1642_value} else {throw var_$1642_error}) else (if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error}))
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
if ((!(currTs == 0L))) {
var_$1685_changed = false
}
if ((var_$1689_changed)) {
var_$1685_value = var_$1689_value
var_$1685_init = true
var_$1685_error = var_$1689_error
var_$1685_changed = true
var_$1685_unknown = var_$1689_unknown
}
if ((!(currTs == 0L))) {
var_$1688_changed = false
}
if ((var_$1689_changed)) {
var_$1688_value = var_$1689_value
var_$1688_init = true
var_$1688_error = var_$1689_error
var_$1688_changed = true
var_$1688_unknown = var_$1689_unknown
}
var_$1629_changed = false
if ((var_$1630_init && var_$1685_init && var_$1688_init)) {
if ((var_$1630_changed) || (var_$1685_changed) || (var_$1688_changed)) {
var_$1629_unknown = (var_$1630_unknown && var_$1685_unknown && var_$1688_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = (if ((if((var_$1630_error == null)) {var_$1630_value} else {throw var_$1630_error})) (if((var_$1685_error == null)) {var_$1685_value} else {throw var_$1685_error}) else (if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}))
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
var_$1703_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1703_unknown = (var_$1629_unknown)
if ((var_$1703_unknown)) {
var_$1703_error = UnknownEventError(null)
} else {
var_$1703_error = null
try {
var_$1703_value = var_$1728.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
if ((!(currTs == 0L))) {
var_$1705_changed = false
}
if ((var_$1711_changed)) {
var_$1705_value = var_$1711_value
var_$1705_init = true
var_$1705_error = var_$1711_error
var_$1705_changed = true
var_$1705_unknown = var_$1711_unknown
}
var_$1702_changed = false
if ((var_$1703_init && var_$1705_init)) {
if ((var_$1703_changed) || (var_$1705_changed)) {
var_$1702_unknown = (var_$1703_unknown && var_$1705_unknown)
if ((var_$1702_unknown)) {
var_$1702_error = UnknownEventError(null)
} else {
var_$1702_error = null
try {
var_$1702_value = ((if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}) == (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}))
} catch {
case var_err : Throwable => {
var_$1702_error = var_err
}
}
}
var_$1702_init = true
var_$1702_changed = true
}
}
var_$1693_changed = false
if ((var_$1629_init)) {
if ((var_$1629_changed)) {
var_$1693_unknown = (var_$1629_unknown)
if ((var_$1693_unknown)) {
var_$1693_error = UnknownEventError(null)
} else {
var_$1693_error = null
try {
var_$1693_value = var_$1726.apply((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
var_$1710_changed = false
}
if ((var_$1711_changed)) {
var_$1710_value = var_$1711_value
var_$1710_init = true
var_$1710_error = var_$1711_error
var_$1710_changed = true
var_$1710_unknown = var_$1711_unknown
}
var_$1707_changed = false
if ((var_$1693_init && var_$1710_init)) {
if ((var_$1693_changed) || (var_$1710_changed)) {
var_$1707_unknown = (var_$1693_unknown && var_$1710_unknown)
if ((var_$1707_unknown)) {
var_$1707_error = UnknownEventError(null)
} else {
var_$1707_error = null
try {
var_$1707_value = ((if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error}) == (if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}))
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
var_$1701_changed = false
if ((var_$1702_init && var_$1707_init)) {
if ((var_$1702_changed) || (var_$1707_changed)) {
var_$1701_unknown = (var_$1702_unknown && var_$1707_unknown)
if ((var_$1701_unknown)) {
var_$1701_error = UnknownEventError(null)
} else {
var_$1701_error = null
try {
var_$1701_value = ((if((var_$1702_error == null)) {var_$1702_value} else {throw var_$1702_error}) && (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
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
var_$1718_changed = false
if ((var_$1629_changed)) {
var_$1718_value = var_$1629_ts
var_$1718_init = true
var_$1718_unknown = var_$1629_unknown
if ((var_$1718_unknown)) {
var_$1718_error = var_$1629_error
} else {
var_$1718_error = null
}
var_$1718_changed = true
}
var_$1692_changed = false
if ((var_$1693_init)) {
if ((var_$1693_changed)) {
var_$1692_unknown = (var_$1693_unknown)
if ((var_$1692_unknown)) {
var_$1692_error = UnknownEventError(null)
} else {
var_$1692_error = null
try {
var_$1692_value = !((if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error}))
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
var_$1627_changed = false
if ((var_$1703_init && var_$1692_init)) {
if ((var_$1703_changed) || (var_$1692_changed)) {
var_$1627_unknown = (var_$1703_unknown && var_$1692_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = ((if((var_$1703_error == null)) {var_$1703_value} else {throw var_$1703_error}) && (if((var_$1692_error == null)) {var_$1692_value} else {throw var_$1692_error}))
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
var_$1699_changed = false
if ((var_$1629_changed)) {
if ((var_$1620_ts == currTs && var_$1620_lastInit) || (!(var_$1620_ts == currTs) && var_$1620_init)) {
var_$1699_changed = true
var_$1699_init = true
var_$1699_unknown = var_$1629_unknown
if ((var_$1699_unknown)) {
var_$1699_error = var_$1629_error
} else {
if ((var_$1620_ts == currTs)) {
var_$1699_value = var_$1620_lastValue
var_$1699_error = var_$1620_lastError
} else {
var_$1699_value = var_$1620_value
var_$1699_error = var_$1620_error
}
}
}
}
var_isFinalFalse$1698_changed = false
if ((var_$1699_init && var_$1701_init)) {
if ((var_$1699_changed) || (var_$1701_changed)) {
var_isFinalFalse$1698_unknown = (var_$1699_unknown && var_$1701_unknown)
if ((var_isFinalFalse$1698_unknown)) {
var_isFinalFalse$1698_error = UnknownEventError(null)
} else {
var_isFinalFalse$1698_error = null
try {
var_isFinalFalse$1698_value = ((if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error}) || (if((var_$1701_error == null)) {var_$1701_value} else {throw var_$1701_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1698_error = var_err
}
}
}
var_isFinalFalse$1698_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1697_changed = false
}
if ((var_isFinalFalse$1698_changed)) {
var_$1697_lastValue = var_$1697_value
var_$1697_lastInit = var_$1697_init
var_$1697_lastError = var_$1697_error
var_$1697_value = var_isFinalFalse$1698_value
var_$1697_init = true
var_$1697_ts = currTs
var_$1697_error = var_isFinalFalse$1698_error
var_$1697_changed = true
var_$1697_unknown = var_isFinalFalse$1698_unknown
}
var_prev$1696_changed = false
if ((var_$1697_changed)) {
if ((var_$1697_ts == currTs && var_$1697_lastInit) || (!(var_$1697_ts == currTs) && var_$1697_init)) {
var_prev$1696_changed = true
var_prev$1696_init = true
var_prev$1696_unknown = var_$1697_unknown
if ((var_prev$1696_unknown)) {
var_prev$1696_error = var_$1697_error
} else {
if ((var_$1697_ts == currTs)) {
var_prev$1696_value = var_$1697_lastValue
var_prev$1696_error = var_$1697_lastError
} else {
var_prev$1696_value = var_$1697_value
var_prev$1696_error = var_$1697_error
}
}
}
}
var_$1695_changed = false
if ((var_prev$1696_init)) {
if ((var_prev$1696_changed)) {
var_$1695_unknown = (var_prev$1696_unknown)
if ((var_$1695_unknown)) {
var_$1695_error = UnknownEventError(null)
} else {
var_$1695_error = null
try {
var_$1695_value = !((if((var_prev$1696_error == null)) {var_prev$1696_value} else {throw var_prev$1696_error}))
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
var_$1626_changed = false
if ((var_$1627_init && var_$1695_init)) {
if ((var_$1627_changed) || (var_$1695_changed)) {
var_$1626_unknown = (var_$1627_unknown && var_$1695_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}) && (if((var_$1695_error == null)) {var_$1695_value} else {throw var_$1695_error}))
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
var_$1713_changed = false
if ((var_$1697_changed)) {
if ((var_$1714_ts == currTs && var_$1714_lastInit) || (!(var_$1714_ts == currTs) && var_$1714_init)) {
var_$1713_changed = true
var_$1713_init = true
var_$1713_unknown = var_$1697_unknown
if ((var_$1713_unknown)) {
var_$1713_error = var_$1697_error
} else {
if ((var_$1714_ts == currTs)) {
var_$1713_value = var_$1714_lastValue
var_$1713_error = var_$1714_lastError
} else {
var_$1713_value = var_$1714_value
var_$1713_error = var_$1714_error
}
}
}
}
var_finalFalseSince$1625_changed = false
if ((var_$1626_init && var_$1718_init && var_$1713_init)) {
if ((var_$1626_changed) || (var_$1718_changed) || (var_$1713_changed)) {
var_finalFalseSince$1625_unknown = (var_$1626_unknown && var_$1718_unknown && var_$1713_unknown)
if ((var_finalFalseSince$1625_unknown)) {
var_finalFalseSince$1625_error = UnknownEventError(null)
} else {
var_finalFalseSince$1625_error = null
try {
var_finalFalseSince$1625_value = (if ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error})) (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}) else (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
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
var_$1714_changed = false
}
if ((var_finalFalseSince$1625_changed)) {
var_$1714_lastValue = var_$1714_value
var_$1714_lastInit = var_$1714_init
var_$1714_lastError = var_$1714_error
var_$1714_value = var_finalFalseSince$1625_value
var_$1714_init = true
var_$1714_ts = currTs
var_$1714_error = var_finalFalseSince$1625_error
var_$1714_changed = true
var_$1714_unknown = var_finalFalseSince$1625_unknown
}
if ((!(currTs == 0L))) {
var_$1785_changed = false
}
if ((var_$1776_changed)) {
var_$1785_value = var_$1776_value
var_$1785_init = true
var_$1785_error = var_$1776_error
var_$1785_changed = true
var_$1785_unknown = var_$1776_unknown
}
var_$1623_changed = false
if ((var_$1714_init && var_$1785_init)) {
if ((var_$1714_changed) || (var_$1785_changed)) {
var_$1623_unknown = (var_$1714_unknown && var_$1785_unknown)
if ((var_$1623_unknown)) {
var_$1623_error = UnknownEventError(null)
} else {
var_$1623_error = null
try {
var_$1623_value = ((if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error}) + (if((var_$1785_error == null)) {var_$1785_value} else {throw var_$1785_error}))
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
if ((var_$1623_init && var_$1718_init)) {
if ((var_$1623_changed) || (var_$1718_changed)) {
var_$1622_unknown = (var_$1623_unknown && var_$1718_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1623_error == null)) {var_$1623_value} else {throw var_$1623_error}) < (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}))
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
if ((var_$1622_init && var_$1710_init && var_$1697_init)) {
if ((var_$1622_changed) || (var_$1710_changed) || (var_$1697_changed)) {
var_isFinalFalseReset$1621_unknown = (var_$1622_unknown && var_$1710_unknown && var_$1697_unknown)
if ((var_isFinalFalseReset$1621_unknown)) {
var_isFinalFalseReset$1621_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1621_error = null
try {
var_isFinalFalseReset$1621_value = (if ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error})) (if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}) else (if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error}))
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
if ((var_isFinalFalseReset$1621_changed) || (var_$1697_changed)) {
var_$1620_lastValue = var_$1620_value
var_$1620_lastInit = var_$1620_init
var_$1620_lastError = var_$1620_error
var_$1620_init = true
var_$1620_ts = currTs
var_$1620_changed = true
var_$1620_unknown = (var_isFinalFalseReset$1621_unknown && var_$1697_unknown)
if ((var_isFinalFalseReset$1621_changed)) {
var_$1620_value = var_isFinalFalseReset$1621_value
var_$1620_error = var_isFinalFalseReset$1621_error
} else {
if ((var_$1697_changed)) {
var_$1620_value = var_$1697_value
var_$1620_error = var_$1697_error
}
}
}
if ((!(currTs == 0L))) {
var_defaultTime$1771_changed = false
}
if ((var_$1772_changed)) {
var_defaultTime$1771_value = var_$1772_value
var_defaultTime$1771_init = true
var_defaultTime$1771_error = var_$1772_error
var_defaultTime$1771_changed = true
var_defaultTime$1771_unknown = var_$1772_unknown
}
var_$1769_changed = false
if ((var_$1770_init && var_defaultTime$1771_init)) {
if ((var_$1770_changed) || (var_defaultTime$1771_changed)) {
var_$1769_unknown = (var_$1770_unknown && var_defaultTime$1771_unknown)
if ((var_$1769_unknown)) {
var_$1769_error = UnknownEventError(null)
} else {
var_$1769_error = null
try {
var_$1769_value = ((if((var_$1770_error == null)) {var_$1770_value} else {throw var_$1770_error}) != (if((var_defaultTime$1771_error == null)) {var_defaultTime$1771_value} else {throw var_defaultTime$1771_error}))
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
var_$1764_changed = false
if ((var_$1765_init && var_$1769_init)) {
if ((var_$1765_changed) || (var_$1769_changed)) {
var_$1764_unknown = (var_$1765_unknown && var_$1769_unknown)
if ((var_$1764_unknown)) {
var_$1764_error = UnknownEventError(null)
} else {
var_$1764_error = null
try {
var_$1764_value = ((if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}) && (if((var_$1769_error == null)) {var_$1769_value} else {throw var_$1769_error}))
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
var_$1774_changed = false
if ((var_$1775_init && var_$1777_init)) {
if ((var_$1775_changed) || (var_$1777_changed)) {
var_$1774_unknown = (var_$1775_unknown && var_$1777_unknown)
if ((var_$1774_unknown)) {
var_$1774_error = UnknownEventError(null)
} else {
var_$1774_error = null
try {
var_$1774_value = ((if((var_$1775_error == null)) {var_$1775_value} else {throw var_$1775_error}) - (if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error}))
} catch {
case var_err : Throwable => {
var_$1774_error = var_err
}
}
}
var_$1774_init = true
var_$1774_changed = true
}
}
var_$1773_changed = false
if ((var_$1774_init && var_$1778_init)) {
if ((var_$1774_changed) || (var_$1778_changed)) {
var_$1773_unknown = (var_$1774_unknown && var_$1778_unknown)
if ((var_$1773_unknown)) {
var_$1773_error = UnknownEventError(null)
} else {
var_$1773_error = null
try {
var_$1773_value = ((if((var_$1774_error == null)) {var_$1774_value} else {throw var_$1774_error}) + (if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}))
} catch {
case var_err : Throwable => {
var_$1773_error = var_err
}
}
}
var_$1773_init = true
var_$1773_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1780_changed = false
}
if ((var_$1776_changed)) {
var_$1780_value = var_$1776_value
var_$1780_init = true
var_$1780_error = var_$1776_error
var_$1780_changed = true
var_$1780_unknown = var_$1776_unknown
}
var_$1763_changed = false
if ((var_$1764_init && var_$1773_init && var_$1780_init)) {
if ((var_$1764_changed) || (var_$1773_changed) || (var_$1780_changed)) {
var_$1763_unknown = (var_$1764_unknown && var_$1773_unknown && var_$1780_unknown)
if ((var_$1763_unknown)) {
var_$1763_error = UnknownEventError(null)
} else {
var_$1763_error = null
try {
var_$1763_value = (if ((if((var_$1764_error == null)) {var_$1764_value} else {throw var_$1764_error})) (if((var_$1773_error == null)) {var_$1773_value} else {throw var_$1773_error}) else (if((var_$1780_error == null)) {var_$1780_value} else {throw var_$1780_error}))
} catch {
case var_err : Throwable => {
var_$1763_error = var_err
}
}
}
var_$1763_init = true
var_$1763_ts = currTs
var_$1763_changed = true
}
}
var_$1762_changed = false
if ((var_$1763_init && var_$1782_init)) {
if ((var_$1763_changed) || (var_$1782_changed)) {
var_$1762_unknown = (var_$1763_unknown && var_$1782_unknown)
if ((var_$1762_unknown)) {
var_$1762_error = UnknownEventError(null)
} else {
var_$1762_error = null
try {
var_$1762_value = ((if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}) > (if((var_$1782_error == null)) {var_$1782_value} else {throw var_$1782_error}))
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
var_$1787_changed = false
if ((var_$1763_changed)) {
var_$1787_value = var_$1763_ts
var_$1787_init = true
var_$1787_unknown = var_$1763_unknown
if ((var_$1787_unknown)) {
var_$1787_error = var_$1763_error
} else {
var_$1787_error = null
}
var_$1787_changed = true
}
var_$1784_changed = false
if ((var_$1785_init && var_$1787_init)) {
if ((var_$1785_changed) || (var_$1787_changed)) {
var_$1784_unknown = (var_$1785_unknown && var_$1787_unknown)
if ((var_$1784_unknown)) {
var_$1784_error = UnknownEventError(null)
} else {
var_$1784_error = null
try {
var_$1784_value = ((if((var_$1785_error == null)) {var_$1785_value} else {throw var_$1785_error}) - (if((var_$1787_error == null)) {var_$1787_value} else {throw var_$1787_error}))
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
var_$1734_changed = false
if ((var_$1762_init && var_$1763_init && var_$1784_init)) {
if ((var_$1762_changed) || (var_$1763_changed) || (var_$1784_changed)) {
var_$1734_unknown = (var_$1762_unknown && var_$1763_unknown && var_$1784_unknown)
if ((var_$1734_unknown)) {
var_$1734_error = UnknownEventError(null)
} else {
var_$1734_error = null
try {
var_$1734_value = (if ((if((var_$1762_error == null)) {var_$1762_value} else {throw var_$1762_error})) (if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}) else (if((var_$1784_error == null)) {var_$1784_value} else {throw var_$1784_error}))
} catch {
case var_err : Throwable => {
var_$1734_error = var_err
}
}
}
var_$1734_changed = true
}
}
var_stillFulfillableReset$1619_changed = false
if ((var_$1620_init && var_$1688_init && var_$1629_init)) {
if ((var_$1620_changed) || (var_$1688_changed) || (var_$1629_changed)) {
var_stillFulfillableReset$1619_unknown = (var_$1620_unknown && var_$1688_unknown && var_$1629_unknown)
if ((var_stillFulfillableReset$1619_unknown)) {
var_stillFulfillableReset$1619_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1619_error = null
try {
var_stillFulfillableReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error}) else (if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
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
var_final$1727_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_final$1727_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_final$1727_unknown)) {
var_final$1727_error = UnknownEventError(null)
} else {
var_final$1727_error = null
try {
var_final$1727_value = var_$1728.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
} catch {
case var_err : Throwable => {
var_final$1727_error = var_err
}
}
}
var_final$1727_init = true
var_final$1727_changed = true
}
}
var_value$1618_changed = false
if ((var_stillFulfillableReset$1619_init)) {
if ((var_stillFulfillableReset$1619_changed)) {
var_value$1618_unknown = (var_stillFulfillableReset$1619_unknown)
if ((var_value$1618_unknown)) {
var_value$1618_error = UnknownEventError(null)
} else {
var_value$1618_error = null
try {
var_value$1618_value = var_$1726.apply((if((var_stillFulfillableReset$1619_error == null)) {var_stillFulfillableReset$1619_value} else {throw var_stillFulfillableReset$1619_error}))
} catch {
case var_err : Throwable => {
var_value$1618_error = var_err
}
}
}
var_value$1618_init = true
var_value$1618_changed = true
}
}

if ((var_mergeUnit2$1636_unknown) || (!(var_$1734_error == null)) || (var_$1734_changed && (0L >= var_$1734_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$1734_changed)) {
if ((var_safeDelay$1639_changed) || (var_mergeUnit2$1636_changed)) {
var_safeDelay$1639_nextTs = (currTs + var_$1734_value)
}
} else {
if ((var_mergeUnit2$1636_changed)) {
var_safeDelay$1639_nextTs = -1L
}
}
}
if ((var_value$1618_changed && var_value$1618_init)) {
out_value.apply(var_value$1618_value, currTs, "value", var_value$1618_error)
}
if ((var_final$1727_changed && var_final$1727_init)) {
out_final.apply(var_final$1727_value, currTs, "final", var_final$1727_error)
}
var_start_changed = false
var_preempt_changed = false
var_stop_changed = false
var_resume_changed = false

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
