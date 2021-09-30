//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_$1748 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1794 : (Boolean, Boolean)) => {
val var_$1795 : Boolean = var_$1794._2
var_$1795
})
val var_$1726 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1790 : (Boolean, Boolean)) => {
val var_$1791 : Boolean = var_$1790._1
var_$1791
})
val var_$1701 : (Boolean, Boolean) = (true, false)
val var_$1704 : (Boolean, Boolean) = (false, true)
val var_$1709 : (Boolean, Boolean) = (false, false)
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
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

out_value = null
out_final = null
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
var var_$1628_changed : Boolean = true
var var_$1628_value : Long = 0L
val var_$1628_init : Boolean = true
var var_$1628_unknown : Boolean = false
var var_$1628_error : Throwable = null
var var_$1653_changed : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_unknown : Boolean = false
var var_$1765_changed : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_unknown : Boolean = false
var var_mergeUnit2$1773_changed : Boolean = false
var var_mergeUnit2$1773_init : Boolean = false
var var_mergeUnit2$1773_ts : Long = 0L
var var_mergeUnit2$1773_unknown : Boolean = false
var var_mergeUnit2$1773_error : Throwable = null
var var_$1779_changed : Boolean = false
var var_$1779_init : Boolean = false
var var_$1779_unknown : Boolean = false
var var_$1779_error : Throwable = null
var var_$1779_value : Boolean = false
var var_$1778_changed : Boolean = false
var var_$1778_unknown : Boolean = false
var var_$1778_error : Throwable = null
var var_$1778_value : Boolean = false
var var_$1778_init : Boolean = false
var var_$1771_changed : Boolean = false
var var_$1771_lastValue : Boolean = false
var var_$1771_lastInit : Boolean = false
var var_$1771_lastError : Throwable = null
var var_$1771_ts : Long = 0L
var var_$1771_init : Boolean = false
var var_$1771_unknown : Boolean = false
var var_$1771_error : Throwable = null
var var_$1771_value : Boolean = false
var var_failingTimeStamps$1638_unknown : Boolean = false
var var_failingTimeStamps$1638_error : Throwable = null
var var_failingTimeStamps$1638_value : Boolean = false
var var_failingTimeStamps$1638_init : Boolean = false
var var_$1752_changed : Boolean = false
var var_$1752_error : Throwable = null
var var_$1752_init : Boolean = false
var var_$1752_unknown : Boolean = false
var var_targetCount$1666_changed : Boolean = false
var var_targetCount$1666_ts : Long = 0L
val var_targetCount$1666_error : Throwable = null
var var_targetCount$1666_unknown : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_value : Long = 0L
var var_$1643_init : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1639_changed : Boolean = false
var var_$1639_value : Long = 0L
var var_$1639_init : Boolean = false
var var_$1639_unknown : Boolean = false
var var_$1639_error : Throwable = null
var var_$1632_changed : Boolean = false
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_$1632_value : Boolean = false
var var_$1631_changed : Boolean = true
var var_$1631_value : Boolean = false
var var_$1631_init : Boolean = true
var var_$1631_error : Throwable = null
var var_$1631_unknown : Boolean = false
var var_$1642_changed : Boolean = false
var var_$1642_unknown : Boolean = false
var var_$1642_error : Throwable = null
var var_$1642_value : Boolean = false
var var_$1641_changed : Boolean = true
var var_$1641_value : Boolean = false
var var_$1641_init : Boolean = true
var var_$1641_error : Throwable = null
var var_$1641_unknown : Boolean = false
val var_$1648_value : Long = 0L
val var_$1648_error : Throwable = null
val var_$1648_changed : Boolean = false
val var_$1648_unknown : Boolean = false
var var_$1647_changed : Boolean = true
var var_$1647_value : Long = 1L
var var_$1647_init : Boolean = true
var var_$1647_error : Throwable = null
var var_$1647_unknown : Boolean = false
var var_$1645_changed : Boolean = false
var var_$1645_unknown : Boolean = false
var var_$1645_error : Throwable = null
var var_$1645_value : Long = 0L
var var_$1645_init : Boolean = false
var var_$1640_changed : Boolean = false
var var_$1640_unknown : Boolean = false
var var_$1640_error : Throwable = null
var var_$1640_value : Long = 0L
var var_$1640_init : Boolean = false
var var_$1655_changed : Boolean = false
var var_$1655_error : Throwable = null
var var_$1655_unknown : Boolean = false
var var_mergeUnit2$1652_changed : Boolean = false
var var_mergeUnit2$1652_unknown : Boolean = false
var var_mergeUnit2$1652_error : Throwable = null
var var_$1650_changed : Boolean = false
var var_$1650_init : Boolean = false
var var_$1650_unknown : Boolean = false
var var_$1650_error : Throwable = null
var var_$1650_value : Long = 0L
var var_minusStream$1630_changed : Boolean = false
var var_minusStream$1630_unknown : Boolean = false
var var_minusStream$1630_error : Throwable = null
var var_minusStream$1630_value : Long = 0L
var var_$1693_changed : Boolean = false
var var_$1693_value : Long = 0L
var var_$1693_init : Boolean = false
var var_$1693_unknown : Boolean = false
var var_$1693_error : Throwable = null
var var_$1670_changed : Boolean = false
var var_$1670_unknown : Boolean = false
var var_$1670_error : Throwable = null
var var_$1670_value : Boolean = false
var var_$1669_changed : Boolean = true
var var_$1669_value : Boolean = false
var var_$1669_init : Boolean = true
var var_$1669_error : Throwable = null
var var_$1669_unknown : Boolean = false
var var_$1674_changed : Boolean = true
var var_$1674_value : Long = 0L
val var_$1674_init : Boolean = true
var var_$1674_unknown : Boolean = false
var var_$1674_error : Throwable = null
var var_$1673_changed : Boolean = false
var var_$1673_unknown : Boolean = false
var var_$1673_error : Throwable = null
var var_$1673_value : Long = 0L
var var_$1673_init : Boolean = false
var var_$1668_changed : Boolean = false
var var_$1668_unknown : Boolean = false
var var_$1668_error : Throwable = null
var var_$1668_value : Long = 0L
var var_$1668_init : Boolean = false
var var_$1761_changed : Boolean = false
var var_$1761_lastValue : Long = 0L
var var_$1761_lastInit : Boolean = false
var var_$1761_lastError : Throwable = null
var var_$1761_value : Long = 0L
var var_$1761_init : Boolean = false
var var_$1761_ts : Long = 0L
var var_$1761_unknown : Boolean = false
var var_$1761_error : Throwable = null
var var_prev$1760_changed : Boolean = false
var var_prev$1760_init : Boolean = false
var var_prev$1760_unknown : Boolean = false
var var_prev$1760_error : Throwable = null
var var_prev$1760_value : Long = 0L
var var_minusStream$1685_changed : Boolean = true
var var_minusStream$1685_value : Long = 0L
var var_minusStream$1685_error : Throwable = null
var var_minusStream$1685_unknown : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_lastValue : Long = 0L
var var_$1629_lastInit : Boolean = false
var var_$1629_lastError : Throwable = null
var var_$1629_init : Boolean = false
var var_$1629_ts : Long = 0L
var var_$1629_unknown : Boolean = false
var var_$1629_value : Long = 0L
var var_$1629_error : Throwable = null
var var_resetCount2$1627_changed : Boolean = false
var var_resetCount2$1627_unknown : Boolean = false
var var_resetCount2$1627_error : Throwable = null
var var_resetCount2$1627_value : Long = 0L
var var_resetCount2$1627_init : Boolean = false
var var_$1664_changed : Boolean = false
var var_$1664_unknown : Boolean = false
var var_$1664_error : Throwable = null
var var_$1664_value : Boolean = false
var var_$1663_changed : Boolean = true
var var_$1663_value : Boolean = false
var var_$1663_init : Boolean = true
var var_$1663_error : Throwable = null
var var_$1663_unknown : Boolean = false
var var_mergeUnit2$1680_changed : Boolean = false
var var_mergeUnit2$1680_unknown : Boolean = false
var var_mergeUnit2$1680_error : Throwable = null
var var_$1678_changed : Boolean = false
var var_$1678_init : Boolean = false
var var_$1678_unknown : Boolean = false
var var_$1678_error : Throwable = null
var var_$1678_value : Long = 0L
var var_minusStream$1662_changed : Boolean = false
var var_minusStream$1662_unknown : Boolean = false
var var_minusStream$1662_error : Throwable = null
var var_minusStream$1662_value : Long = 0L
var var_$1679_changed : Boolean = false
var var_$1679_lastValue : Long = 0L
var var_$1679_lastInit : Boolean = false
var var_$1679_lastError : Throwable = null
var var_$1679_init : Boolean = false
var var_$1679_ts : Long = 0L
var var_$1679_unknown : Boolean = false
var var_$1679_value : Long = 0L
var var_$1679_error : Throwable = null
var var_resetCount2$1659_changed : Boolean = false
var var_resetCount2$1659_unknown : Boolean = false
var var_resetCount2$1659_error : Throwable = null
var var_resetCount2$1659_value : Long = 0L
var var_resetCount2$1659_init : Boolean = false
var var_$1626_changed : Boolean = false
var var_$1626_unknown : Boolean = false
var var_$1626_error : Throwable = null
var var_$1626_value : Boolean = false
var var_$1626_init : Boolean = false
var var_defaultTime$1695_changed : Boolean = true
var var_defaultTime$1695_value : Long = -1L
var var_defaultTime$1695_init : Boolean = true
var var_defaultTime$1695_error : Throwable = null
var var_defaultTime$1695_unknown : Boolean = false
var var_defaultTime$1692_changed : Boolean = true
var var_defaultTime$1692_value : Long = -1L
var var_defaultTime$1692_init : Boolean = true
var var_defaultTime$1692_error : Throwable = null
var var_defaultTime$1692_unknown : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1689_value : Boolean = false
var var_$1689_init : Boolean = false
var var_$1697_changed : Boolean = true
var var_$1697_value : Long = -1L
var var_$1697_init : Boolean = true
var var_$1697_error : Throwable = null
var var_$1697_unknown : Boolean = false
var var_$1694_changed : Boolean = false
var var_$1694_unknown : Boolean = false
var var_$1694_error : Throwable = null
var var_$1694_value : Boolean = false
var var_$1694_init : Boolean = false
var var_$1688_changed : Boolean = false
var var_$1688_unknown : Boolean = false
var var_$1688_error : Throwable = null
var var_$1688_value : Boolean = false
var var_$1688_init : Boolean = false
val var_$1703_value : (Boolean, Boolean) = (false, false)
val var_$1703_error : Throwable = null
val var_$1703_changed : Boolean = false
val var_$1703_unknown : Boolean = false
var var_$1745_changed : Boolean = true
var var_$1745_value : (Boolean, Boolean) = var_$1701
var var_$1745_init : Boolean = true
var var_$1745_error : Throwable = null
var var_$1745_unknown : Boolean = false
var var_$1702_changed : Boolean = true
var var_$1702_value : (Boolean, Boolean) = var_$1704
var var_$1702_init : Boolean = true
var var_$1702_error : Throwable = null
var var_$1702_unknown : Boolean = false
var var_$1687_changed : Boolean = false
var var_$1687_unknown : Boolean = false
var var_$1687_error : Throwable = null
var var_$1687_value : (Boolean, Boolean) = (false, false)
var var_$1687_init : Boolean = false
var var_$1706_changed : Boolean = false
var var_$1706_unknown : Boolean = false
var var_$1706_error : Throwable = null
var var_$1706_value : Boolean = false
var var_$1706_init : Boolean = false
var var_$1707_changed : Boolean = true
var var_$1707_value : (Boolean, Boolean) = var_$1709
var var_$1707_init : Boolean = true
var var_$1707_error : Throwable = null
var var_$1707_unknown : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : (Boolean, Boolean) = (false, false)
var var_$1705_init : Boolean = false
var var_result$1625_changed : Boolean = false
var var_result$1625_unknown : Boolean = false
var var_result$1625_error : Throwable = null
var var_result$1625_value : (Boolean, Boolean) = (false, false)
var var_result$1625_init : Boolean = false
var var_result$1625_ts : Long = 0L
var var_$1721_changed : Boolean = false
var var_$1721_init : Boolean = false
var var_$1721_unknown : Boolean = false
var var_$1721_error : Throwable = null
var var_$1721_value : Boolean = false
var var_$1725_changed : Boolean = false
var var_$1725_unknown : Boolean = false
var var_$1725_error : Throwable = null
var var_$1725_value : Boolean = false
var var_$1725_init : Boolean = false
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
var var_$1623_changed : Boolean = false
var var_$1623_unknown : Boolean = false
var var_$1623_error : Throwable = null
var var_$1623_value : Boolean = false
var var_$1623_init : Boolean = false
val var_$1728_value : Boolean = false
val var_$1728_error : Throwable = null
val var_$1728_changed : Boolean = false
val var_$1728_unknown : Boolean = false
var var_$1727_changed : Boolean = true
var var_$1727_value : Boolean = true
var var_$1727_init : Boolean = true
var var_$1727_error : Throwable = null
var var_$1727_unknown : Boolean = false
var var_$1724_changed : Boolean = false
var var_$1724_unknown : Boolean = false
var var_$1724_error : Throwable = null
var var_$1724_value : Boolean = false
var var_$1724_init : Boolean = false
var var_$1732_changed : Boolean = true
var var_$1732_value : Boolean = false
var var_$1732_init : Boolean = true
var var_$1732_error : Throwable = null
var var_$1732_unknown : Boolean = false
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
var var_$1622_changed : Boolean = false
var var_$1622_unknown : Boolean = false
var var_$1622_error : Throwable = null
var var_$1622_value : Boolean = false
var var_$1622_init : Boolean = false
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
var var_finalFalseSince$1621_changed : Boolean = false
var var_finalFalseSince$1621_unknown : Boolean = false
var var_finalFalseSince$1621_error : Throwable = null
var var_finalFalseSince$1621_value : Long = 0L
var var_$1736_changed : Boolean = true
var var_$1736_lastValue : Long = 0L
var var_$1736_lastInit : Boolean = false
var var_$1736_lastError : Throwable = null
var var_$1736_value : Long = 9223372036854775807L
var var_$1736_init : Boolean = true
var var_$1736_ts : Long = 0L
var var_$1736_error : Throwable = null
var var_$1736_unknown : Boolean = false
var var_$1738_changed : Boolean = true
var var_$1738_value : Long = 9223372036854775807L
var var_$1738_init : Boolean = true
var var_$1738_error : Throwable = null
var var_$1738_unknown : Boolean = false
var var_$1619_changed : Boolean = false
var var_$1619_unknown : Boolean = false
var var_$1619_error : Throwable = null
var var_$1619_value : Long = 0L
var var_$1619_init : Boolean = false
var var_$1618_changed : Boolean = false
var var_$1618_unknown : Boolean = false
var var_$1618_error : Throwable = null
var var_$1618_value : Boolean = false
var var_$1618_init : Boolean = false
var var_isFinalFalseReset$1617_changed : Boolean = false
var var_isFinalFalseReset$1617_unknown : Boolean = false
var var_isFinalFalseReset$1617_error : Throwable = null
var var_isFinalFalseReset$1617_value : Boolean = false
var var_$1722_changed : Boolean = false
var var_$1722_lastValue : Boolean = false
var var_$1722_lastInit : Boolean = false
var var_$1722_lastError : Throwable = null
var var_$1722_init : Boolean = false
var var_$1722_ts : Long = 0L
var var_$1722_unknown : Boolean = false
var var_$1722_value : Boolean = false
var var_$1722_error : Throwable = null
var var_stillFulfillableReset$1615_changed : Boolean = false
var var_stillFulfillableReset$1615_unknown : Boolean = false
var var_stillFulfillableReset$1615_error : Throwable = null
var var_stillFulfillableReset$1615_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1615_init : Boolean = false
var var_value$1614_changed : Boolean = false
var var_value$1614_unknown : Boolean = false
var var_value$1614_error : Throwable = null
var var_value$1614_value : Boolean = false
var var_value$1614_init : Boolean = false
var var_final$1749_changed : Boolean = false
var var_final$1749_lastValue : Boolean = false
var var_final$1749_lastInit : Boolean = false
var var_final$1749_lastError : Throwable = null
var var_final$1749_unknown : Boolean = false
var var_final$1749_error : Throwable = null
var var_final$1749_value : Boolean = false
var var_final$1749_init : Boolean = false
var var_final$1749_ts : Long = 0L
var var_$1751_changed : Boolean = false
var var_$1751_value : Long = 0L
var var_$1751_init : Boolean = false
var var_$1751_error : Throwable = null
var var_$1751_unknown : Boolean = false
var var_$1753_changed : Boolean = false
var var_$1753_unknown : Boolean = false
var var_$1753_error : Throwable = null
var var_$1753_value : Long = 0L
var var_$1753_init : Boolean = false
var var_resets$1635_changed : Boolean = false
var var_resets$1635_unknown : Boolean = false
var var_resets$1635_error : Throwable = null
var var_resets$1635_value : Long = 0L
var var_targetCount$1666_nextTs : Long = -1L



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

if (((var_targetCount$1666_nextTs > lastProcessedTs) && (currTs > var_targetCount$1666_nextTs))) {
currTs = var_targetCount$1666_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

if ((!(currTs == 0L))) {
var_$1628_changed = false
}
if ((var_source_changed)) {
var_$1628_value = (var_$1628_value + 1L)
var_$1628_unknown = var_source_unknown
if ((!(var_$1628_error == null))) {
var_$1628_error = var_source_error
}
var_$1628_changed = true
}
var_$1653_changed = false
if ((var_source_changed)) {
if ((var_source_unknown)) {
var_$1653_error = UnknownEventError(var_source_error)
} else {
var_$1653_error = null
}
var_$1653_changed = var_source_changed
var_$1653_unknown = var_source_unknown
}
var_$1765_changed = false
if ((var_target_changed)) {
if ((var_target_unknown)) {
var_$1765_error = UnknownEventError(var_target_error)
} else {
var_$1765_error = null
}
var_$1765_changed = var_target_changed
var_$1765_unknown = var_target_unknown
}
var_mergeUnit2$1773_changed = false
if ((var_$1653_changed) || (var_$1765_changed)) {
var_mergeUnit2$1773_init = true
var_mergeUnit2$1773_ts = currTs
var_mergeUnit2$1773_changed = true
var_mergeUnit2$1773_unknown = (var_$1653_unknown && var_$1765_unknown)
if ((var_$1653_changed)) {
var_mergeUnit2$1773_error = var_$1653_error
} else {
if ((var_$1765_changed)) {
var_mergeUnit2$1773_error = var_$1765_error
}
}
}
var_$1779_changed = false
if ((var_mergeUnit2$1773_changed)) {
if ((var_$1771_ts == currTs && var_$1771_lastInit) || (!(var_$1771_ts == currTs) && var_$1771_init)) {
var_$1779_changed = true
var_$1779_init = true
var_$1779_unknown = var_mergeUnit2$1773_unknown
if ((var_$1779_unknown)) {
var_$1779_error = var_mergeUnit2$1773_error
} else {
if ((var_$1771_ts == currTs)) {
var_$1779_value = var_$1771_lastValue
var_$1779_error = var_$1771_lastError
} else {
var_$1779_value = var_$1771_value
var_$1779_error = var_$1771_error
}
}
}
}
var_$1778_changed = false
if ((var_$1779_init)) {
if ((var_$1779_changed)) {
var_$1778_unknown = (var_$1779_unknown)
if ((var_$1778_unknown)) {
var_$1778_error = UnknownEventError(null)
} else {
var_$1778_error = null
try {
var_$1778_value = !((if((var_$1779_error == null)) {var_$1779_value} else {throw var_$1779_error}))
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
var_$1771_changed = false
if ((var_mergeUnit2$1773_changed)) {
if ((var_final$1749_ts == currTs && var_final$1749_lastInit) || (!(var_final$1749_ts == currTs) && var_final$1749_init)) {
var_$1771_lastValue = var_$1771_value
var_$1771_lastInit = var_$1771_init
var_$1771_lastError = var_$1771_error
var_$1771_ts = currTs
var_$1771_changed = true
var_$1771_init = true
var_$1771_unknown = var_mergeUnit2$1773_unknown
if ((var_$1771_unknown)) {
var_$1771_error = var_mergeUnit2$1773_error
} else {
if ((var_final$1749_ts == currTs)) {
var_$1771_value = var_final$1749_lastValue
var_$1771_error = var_final$1749_lastError
} else {
var_$1771_value = var_final$1749_value
var_$1771_error = var_final$1749_error
}
}
}
}
if ((var_$1771_init && var_$1778_init)) {
if ((var_$1771_changed) || (var_$1778_changed)) {
var_failingTimeStamps$1638_unknown = (var_$1771_unknown && var_$1778_unknown)
if ((var_failingTimeStamps$1638_unknown)) {
var_failingTimeStamps$1638_error = UnknownEventError(null)
} else {
var_failingTimeStamps$1638_error = null
try {
var_failingTimeStamps$1638_value = ((if((var_$1771_error == null)) {var_$1771_value} else {throw var_$1771_error}) && (if((var_$1778_error == null)) {var_$1778_value} else {throw var_$1778_error}))
} catch {
case var_err : Throwable => {
var_failingTimeStamps$1638_error = var_err
}
}
}
var_failingTimeStamps$1638_init = true
}
}
var_$1752_changed = false
if ((var_failingTimeStamps$1638_init && var_mergeUnit2$1773_changed)) {
if ((var_failingTimeStamps$1638_value) || (!(var_failingTimeStamps$1638_error == null)) || (var_failingTimeStamps$1638_unknown)) {
if ((!(var_failingTimeStamps$1638_error == null))) {
var_$1752_error = var_failingTimeStamps$1638_error
} else {
var_$1752_error = var_mergeUnit2$1773_error
}
var_$1752_changed = true
var_$1752_init = var_mergeUnit2$1773_init
var_$1752_unknown = (var_mergeUnit2$1773_unknown || !(var_failingTimeStamps$1638_error == null))
}
}
var_targetCount$1666_changed = false
if ((var_targetCount$1666_nextTs == currTs)) {
var_targetCount$1666_ts = currTs
var_targetCount$1666_changed = true
var_targetCount$1666_unknown = false
}
var_$1643_changed = false
if ((var_targetCount$1666_changed)) {
var_$1643_value = var_targetCount$1666_ts
var_$1643_init = true
var_$1643_unknown = var_targetCount$1666_unknown
if ((var_$1643_unknown)) {
var_$1643_error = var_targetCount$1666_error
} else {
var_$1643_error = null
}
var_$1643_changed = true
}
var_$1639_changed = false
if ((var_source_changed)) {
var_$1639_value = var_source_ts
var_$1639_init = true
var_$1639_unknown = var_source_unknown
if ((var_$1639_unknown)) {
var_$1639_error = var_source_error
} else {
var_$1639_error = null
}
var_$1639_changed = true
}
var_$1632_changed = false
if ((var_$1643_init && var_$1639_init)) {
if ((var_$1643_changed) || (var_$1639_changed)) {
var_$1632_unknown = (var_$1643_unknown && var_$1639_unknown)
if ((var_$1632_unknown)) {
var_$1632_error = UnknownEventError(null)
} else {
var_$1632_error = null
try {
var_$1632_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) >= (if((var_$1639_error == null)) {var_$1639_value} else {throw var_$1639_error}))
} catch {
case var_err : Throwable => {
var_$1632_error = var_err
}
}
}
var_$1632_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1631_changed = false
}
if ((var_$1632_changed)) {
var_$1631_value = var_$1632_value
var_$1631_init = true
var_$1631_error = var_$1632_error
var_$1631_changed = true
var_$1631_unknown = var_$1632_unknown
}
var_$1642_changed = false
if ((var_$1643_init && var_$1639_init)) {
if ((var_$1643_changed) || (var_$1639_changed)) {
var_$1642_unknown = (var_$1643_unknown && var_$1639_unknown)
if ((var_$1642_unknown)) {
var_$1642_error = UnknownEventError(null)
} else {
var_$1642_error = null
try {
var_$1642_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) == (if((var_$1639_error == null)) {var_$1639_value} else {throw var_$1639_error}))
} catch {
case var_err : Throwable => {
var_$1642_error = var_err
}
}
}
var_$1642_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1641_changed = false
}
if ((var_$1642_changed)) {
var_$1641_value = var_$1642_value
var_$1641_init = true
var_$1641_error = var_$1642_error
var_$1641_changed = true
var_$1641_unknown = var_$1642_unknown
}
if ((!(currTs == 0L))) {
var_$1647_changed = false
}
if ((var_$1648_changed)) {
var_$1647_value = var_$1648_value
var_$1647_init = true
var_$1647_error = var_$1648_error
var_$1647_changed = true
var_$1647_unknown = var_$1648_unknown
}
var_$1645_changed = false
if ((var_$1628_init && var_$1647_init)) {
if ((var_$1628_changed) || (var_$1647_changed)) {
var_$1645_unknown = (var_$1628_unknown && var_$1647_unknown)
if ((var_$1645_unknown)) {
var_$1645_error = UnknownEventError(null)
} else {
var_$1645_error = null
try {
var_$1645_value = ((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}) - (if((var_$1647_error == null)) {var_$1647_value} else {throw var_$1647_error}))
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
var_$1640_changed = false
if ((var_$1641_init && var_$1645_init && var_$1628_init)) {
if ((var_$1641_changed) || (var_$1645_changed) || (var_$1628_changed)) {
var_$1640_unknown = (var_$1641_unknown && var_$1645_unknown && var_$1628_unknown)
if ((var_$1640_unknown)) {
var_$1640_error = UnknownEventError(null)
} else {
var_$1640_error = null
try {
var_$1640_value = (if ((if((var_$1641_error == null)) {var_$1641_value} else {throw var_$1641_error})) (if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error}) else (if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}))
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
var_$1655_changed = false
if ((var_targetCount$1666_changed)) {
if ((var_targetCount$1666_unknown)) {
var_$1655_error = UnknownEventError(var_targetCount$1666_error)
} else {
var_$1655_error = null
}
var_$1655_changed = var_targetCount$1666_changed
var_$1655_unknown = var_targetCount$1666_unknown
}
var_mergeUnit2$1652_changed = false
if ((var_$1653_changed) || (var_$1655_changed)) {
var_mergeUnit2$1652_changed = true
var_mergeUnit2$1652_unknown = (var_$1653_unknown && var_$1655_unknown)
if ((var_$1653_changed)) {
var_mergeUnit2$1652_error = var_$1653_error
} else {
if ((var_$1655_changed)) {
var_mergeUnit2$1652_error = var_$1655_error
}
}
}
var_$1650_changed = false
if ((var_mergeUnit2$1652_changed)) {
if ((var_$1629_ts == currTs && var_$1629_lastInit) || (!(var_$1629_ts == currTs) && var_$1629_init)) {
var_$1650_changed = true
var_$1650_init = true
var_$1650_unknown = var_mergeUnit2$1652_unknown
if ((var_$1650_unknown)) {
var_$1650_error = var_mergeUnit2$1652_error
} else {
if ((var_$1629_ts == currTs)) {
var_$1650_value = var_$1629_lastValue
var_$1650_error = var_$1629_lastError
} else {
var_$1650_value = var_$1629_value
var_$1650_error = var_$1629_error
}
}
}
}
var_minusStream$1630_changed = false
if ((var_$1631_init && var_$1640_init && var_$1650_init)) {
if ((var_$1631_changed) || (var_$1640_changed) || (var_$1650_changed)) {
var_minusStream$1630_unknown = (var_$1631_unknown && var_$1640_unknown && var_$1650_unknown)
if ((var_minusStream$1630_unknown)) {
var_minusStream$1630_error = UnknownEventError(null)
} else {
var_minusStream$1630_error = null
try {
var_minusStream$1630_value = (if ((if((var_$1631_error == null)) {var_$1631_value} else {throw var_$1631_error})) (if((var_$1640_error == null)) {var_$1640_value} else {throw var_$1640_error}) else (if((var_$1650_error == null)) {var_$1650_value} else {throw var_$1650_error}))
} catch {
case var_err : Throwable => {
var_minusStream$1630_error = var_err
}
}
}
var_minusStream$1630_changed = true
}
}
var_$1693_changed = false
if ((var_target_changed)) {
var_$1693_value = var_target_ts
var_$1693_init = true
var_$1693_unknown = var_target_unknown
if ((var_$1693_unknown)) {
var_$1693_error = var_target_error
} else {
var_$1693_error = null
}
var_$1693_changed = true
}
var_$1670_changed = false
if ((var_$1643_init && var_$1693_init)) {
if ((var_$1643_changed) || (var_$1693_changed)) {
var_$1670_unknown = (var_$1643_unknown && var_$1693_unknown)
if ((var_$1670_unknown)) {
var_$1670_error = UnknownEventError(null)
} else {
var_$1670_error = null
try {
var_$1670_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) == (if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error}))
} catch {
case var_err : Throwable => {
var_$1670_error = var_err
}
}
}
var_$1670_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1669_changed = false
}
if ((var_$1670_changed)) {
var_$1669_value = var_$1670_value
var_$1669_init = true
var_$1669_error = var_$1670_error
var_$1669_changed = true
var_$1669_unknown = var_$1670_unknown
}
if ((!(currTs == 0L))) {
var_$1674_changed = false
}
if ((var_target_changed)) {
var_$1674_value = (var_$1674_value + 1L)
var_$1674_unknown = var_target_unknown
if ((!(var_$1674_error == null))) {
var_$1674_error = var_target_error
}
var_$1674_changed = true
}
var_$1673_changed = false
if ((var_$1674_init && var_$1647_init)) {
if ((var_$1674_changed) || (var_$1647_changed)) {
var_$1673_unknown = (var_$1674_unknown && var_$1647_unknown)
if ((var_$1673_unknown)) {
var_$1673_error = UnknownEventError(null)
} else {
var_$1673_error = null
try {
var_$1673_value = ((if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}) - (if((var_$1647_error == null)) {var_$1647_value} else {throw var_$1647_error}))
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
var_$1668_changed = false
if ((var_$1669_init && var_$1673_init && var_$1674_init)) {
if ((var_$1669_changed) || (var_$1673_changed) || (var_$1674_changed)) {
var_$1668_unknown = (var_$1669_unknown && var_$1673_unknown && var_$1674_unknown)
if ((var_$1668_unknown)) {
var_$1668_error = UnknownEventError(null)
} else {
var_$1668_error = null
try {
var_$1668_value = (if ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error})) (if((var_$1673_error == null)) {var_$1673_value} else {throw var_$1673_error}) else (if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}))
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
var_$1761_changed = false
if ((var_mergeUnit2$1773_changed)) {
var_$1761_lastValue = var_$1761_value
var_$1761_lastInit = var_$1761_init
var_$1761_lastError = var_$1761_error
var_$1761_value = var_mergeUnit2$1773_ts
var_$1761_init = true
var_$1761_ts = currTs
var_$1761_unknown = var_mergeUnit2$1773_unknown
if ((var_$1761_unknown)) {
var_$1761_error = var_mergeUnit2$1773_error
} else {
var_$1761_error = null
}
var_$1761_changed = true
}
var_prev$1760_changed = false
if ((var_$1761_changed)) {
if ((var_$1761_ts == currTs && var_$1761_lastInit) || (!(var_$1761_ts == currTs) && var_$1761_init)) {
var_prev$1760_changed = true
var_prev$1760_init = true
var_prev$1760_unknown = var_$1761_unknown
if ((var_prev$1760_unknown)) {
var_prev$1760_error = var_$1761_error
} else {
if ((var_$1761_ts == currTs)) {
var_prev$1760_value = var_$1761_lastValue
var_prev$1760_error = var_$1761_lastError
} else {
var_prev$1760_value = var_$1761_value
var_prev$1760_error = var_$1761_error
}
}
}
}
if ((!(currTs == 0L))) {
var_minusStream$1685_changed = false
}
if ((var_$1648_changed)) {
var_minusStream$1685_value = var_$1648_value
var_minusStream$1685_error = var_$1648_error
var_minusStream$1685_changed = true
var_minusStream$1685_unknown = var_$1648_unknown
}
var_$1629_changed = false
if ((var_minusStream$1630_changed) || (var_minusStream$1685_changed)) {
var_$1629_lastValue = var_$1629_value
var_$1629_lastInit = var_$1629_init
var_$1629_lastError = var_$1629_error
var_$1629_init = true
var_$1629_ts = currTs
var_$1629_changed = true
var_$1629_unknown = (var_minusStream$1630_unknown && var_minusStream$1685_unknown)
if ((var_minusStream$1630_changed)) {
var_$1629_value = var_minusStream$1630_value
var_$1629_error = var_minusStream$1630_error
} else {
if ((var_minusStream$1685_changed)) {
var_$1629_value = var_minusStream$1685_value
var_$1629_error = var_minusStream$1685_error
}
}
}
var_resetCount2$1627_changed = false
if ((var_$1628_init && var_$1629_init)) {
if ((var_$1628_changed) || (var_$1629_changed)) {
var_resetCount2$1627_unknown = (var_$1628_unknown && var_$1629_unknown)
if ((var_resetCount2$1627_unknown)) {
var_resetCount2$1627_error = UnknownEventError(null)
} else {
var_resetCount2$1627_error = null
try {
var_resetCount2$1627_value = ((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error}) - (if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}))
} catch {
case var_err : Throwable => {
var_resetCount2$1627_error = var_err
}
}
}
var_resetCount2$1627_init = true
var_resetCount2$1627_changed = true
}
}
var_$1664_changed = false
if ((var_$1643_init && var_$1693_init)) {
if ((var_$1643_changed) || (var_$1693_changed)) {
var_$1664_unknown = (var_$1643_unknown && var_$1693_unknown)
if ((var_$1664_unknown)) {
var_$1664_error = UnknownEventError(null)
} else {
var_$1664_error = null
try {
var_$1664_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) >= (if((var_$1693_error == null)) {var_$1693_value} else {throw var_$1693_error}))
} catch {
case var_err : Throwable => {
var_$1664_error = var_err
}
}
}
var_$1664_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1663_changed = false
}
if ((var_$1664_changed)) {
var_$1663_value = var_$1664_value
var_$1663_init = true
var_$1663_error = var_$1664_error
var_$1663_changed = true
var_$1663_unknown = var_$1664_unknown
}
var_mergeUnit2$1680_changed = false
if ((var_$1765_changed) || (var_$1655_changed)) {
var_mergeUnit2$1680_changed = true
var_mergeUnit2$1680_unknown = (var_$1765_unknown && var_$1655_unknown)
if ((var_$1765_changed)) {
var_mergeUnit2$1680_error = var_$1765_error
} else {
if ((var_$1655_changed)) {
var_mergeUnit2$1680_error = var_$1655_error
}
}
}
var_$1678_changed = false
if ((var_mergeUnit2$1680_changed)) {
if ((var_$1679_ts == currTs && var_$1679_lastInit) || (!(var_$1679_ts == currTs) && var_$1679_init)) {
var_$1678_changed = true
var_$1678_init = true
var_$1678_unknown = var_mergeUnit2$1680_unknown
if ((var_$1678_unknown)) {
var_$1678_error = var_mergeUnit2$1680_error
} else {
if ((var_$1679_ts == currTs)) {
var_$1678_value = var_$1679_lastValue
var_$1678_error = var_$1679_lastError
} else {
var_$1678_value = var_$1679_value
var_$1678_error = var_$1679_error
}
}
}
}
var_minusStream$1662_changed = false
if ((var_$1663_init && var_$1668_init && var_$1678_init)) {
if ((var_$1663_changed) || (var_$1668_changed) || (var_$1678_changed)) {
var_minusStream$1662_unknown = (var_$1663_unknown && var_$1668_unknown && var_$1678_unknown)
if ((var_minusStream$1662_unknown)) {
var_minusStream$1662_error = UnknownEventError(null)
} else {
var_minusStream$1662_error = null
try {
var_minusStream$1662_value = (if ((if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error})) (if((var_$1668_error == null)) {var_$1668_value} else {throw var_$1668_error}) else (if((var_$1678_error == null)) {var_$1678_value} else {throw var_$1678_error}))
} catch {
case var_err : Throwable => {
var_minusStream$1662_error = var_err
}
}
}
var_minusStream$1662_changed = true
}
}
var_$1679_changed = false
if ((var_minusStream$1662_changed) || (var_minusStream$1685_changed)) {
var_$1679_lastValue = var_$1679_value
var_$1679_lastInit = var_$1679_init
var_$1679_lastError = var_$1679_error
var_$1679_init = true
var_$1679_ts = currTs
var_$1679_changed = true
var_$1679_unknown = (var_minusStream$1662_unknown && var_minusStream$1685_unknown)
if ((var_minusStream$1662_changed)) {
var_$1679_value = var_minusStream$1662_value
var_$1679_error = var_minusStream$1662_error
} else {
if ((var_minusStream$1685_changed)) {
var_$1679_value = var_minusStream$1685_value
var_$1679_error = var_minusStream$1685_error
}
}
}
var_resetCount2$1659_changed = false
if ((var_$1674_init && var_$1679_init)) {
if ((var_$1674_changed) || (var_$1679_changed)) {
var_resetCount2$1659_unknown = (var_$1674_unknown && var_$1679_unknown)
if ((var_resetCount2$1659_unknown)) {
var_resetCount2$1659_error = UnknownEventError(null)
} else {
var_resetCount2$1659_error = null
try {
var_resetCount2$1659_value = ((if((var_$1674_error == null)) {var_$1674_value} else {throw var_$1674_error}) - (if((var_$1679_error == null)) {var_$1679_value} else {throw var_$1679_error}))
} catch {
case var_err : Throwable => {
var_resetCount2$1659_error = var_err
}
}
}
var_resetCount2$1659_init = true
var_resetCount2$1659_changed = true
}
}
var_$1626_changed = false
if ((var_resetCount2$1627_init && var_resetCount2$1659_init)) {
if ((var_resetCount2$1627_changed) || (var_resetCount2$1659_changed)) {
var_$1626_unknown = (var_resetCount2$1627_unknown && var_resetCount2$1659_unknown)
if ((var_$1626_unknown)) {
var_$1626_error = UnknownEventError(null)
} else {
var_$1626_error = null
try {
var_$1626_value = ((if((var_resetCount2$1627_error == null)) {var_resetCount2$1627_value} else {throw var_resetCount2$1627_error}) == (if((var_resetCount2$1659_error == null)) {var_resetCount2$1659_value} else {throw var_resetCount2$1659_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$1695_changed = false
}
if ((var_$1639_changed)) {
var_defaultTime$1695_value = var_$1639_value
var_defaultTime$1695_init = true
var_defaultTime$1695_error = var_$1639_error
var_defaultTime$1695_changed = true
var_defaultTime$1695_unknown = var_$1639_unknown
}
if ((!(currTs == 0L))) {
var_defaultTime$1692_changed = false
}
if ((var_$1693_changed)) {
var_defaultTime$1692_value = var_$1693_value
var_defaultTime$1692_init = true
var_defaultTime$1692_error = var_$1693_error
var_defaultTime$1692_changed = true
var_defaultTime$1692_unknown = var_$1693_unknown
}
var_$1689_changed = false
if ((var_defaultTime$1695_init && var_defaultTime$1692_init)) {
if ((var_defaultTime$1695_changed) || (var_defaultTime$1692_changed)) {
var_$1689_unknown = (var_defaultTime$1695_unknown && var_defaultTime$1692_unknown)
if ((var_$1689_unknown)) {
var_$1689_error = UnknownEventError(null)
} else {
var_$1689_error = null
try {
var_$1689_value = ((if((var_defaultTime$1695_error == null)) {var_defaultTime$1695_value} else {throw var_defaultTime$1695_error}) == (if((var_defaultTime$1692_error == null)) {var_defaultTime$1692_value} else {throw var_defaultTime$1692_error}))
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
if ((!(currTs == 0L))) {
var_$1697_changed = false
}
if ((var_$1648_changed)) {
var_$1697_value = var_$1648_value
var_$1697_init = true
var_$1697_error = var_$1648_error
var_$1697_changed = true
var_$1697_unknown = var_$1648_unknown
}
var_$1694_changed = false
if ((var_defaultTime$1695_init && var_$1697_init)) {
if ((var_defaultTime$1695_changed) || (var_$1697_changed)) {
var_$1694_unknown = (var_defaultTime$1695_unknown && var_$1697_unknown)
if ((var_$1694_unknown)) {
var_$1694_error = UnknownEventError(null)
} else {
var_$1694_error = null
try {
var_$1694_value = ((if((var_defaultTime$1695_error == null)) {var_defaultTime$1695_value} else {throw var_defaultTime$1695_error}) != (if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error}))
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
var_$1688_changed = false
if ((var_$1689_init && var_$1694_init)) {
if ((var_$1689_changed) || (var_$1694_changed)) {
var_$1688_unknown = (var_$1689_unknown && var_$1694_unknown)
if ((var_$1688_unknown)) {
var_$1688_error = UnknownEventError(null)
} else {
var_$1688_error = null
try {
var_$1688_value = ((if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}) && (if((var_$1694_error == null)) {var_$1694_value} else {throw var_$1694_error}))
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
if ((!(currTs == 0L))) {
var_$1745_changed = false
}
if ((var_$1703_changed)) {
var_$1745_value = var_$1703_value
var_$1745_init = true
var_$1745_error = var_$1703_error
var_$1745_changed = true
var_$1745_unknown = var_$1703_unknown
}
if ((!(currTs == 0L))) {
var_$1702_changed = false
}
if ((var_$1703_changed)) {
var_$1702_value = var_$1703_value
var_$1702_init = true
var_$1702_error = var_$1703_error
var_$1702_changed = true
var_$1702_unknown = var_$1703_unknown
}
var_$1687_changed = false
if ((var_$1688_init && var_$1745_init && var_$1702_init)) {
if ((var_$1688_changed) || (var_$1745_changed) || (var_$1702_changed)) {
var_$1687_unknown = (var_$1688_unknown && var_$1745_unknown && var_$1702_unknown)
if ((var_$1687_unknown)) {
var_$1687_error = UnknownEventError(null)
} else {
var_$1687_error = null
try {
var_$1687_value = (if ((if((var_$1688_error == null)) {var_$1688_value} else {throw var_$1688_error})) (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}) else (if((var_$1702_error == null)) {var_$1702_value} else {throw var_$1702_error}))
} catch {
case var_err : Throwable => {
var_$1687_error = var_err
}
}
}
var_$1687_init = true
var_$1687_changed = true
}
}
var_$1706_changed = false
if ((var_resetCount2$1627_init && var_resetCount2$1659_init)) {
if ((var_resetCount2$1627_changed) || (var_resetCount2$1659_changed)) {
var_$1706_unknown = (var_resetCount2$1627_unknown && var_resetCount2$1659_unknown)
if ((var_$1706_unknown)) {
var_$1706_error = UnknownEventError(null)
} else {
var_$1706_error = null
try {
var_$1706_value = ((if((var_resetCount2$1627_error == null)) {var_resetCount2$1627_value} else {throw var_resetCount2$1627_error}) >= (if((var_resetCount2$1659_error == null)) {var_resetCount2$1659_value} else {throw var_resetCount2$1659_error}))
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
var_$1707_changed = false
}
if ((var_$1703_changed)) {
var_$1707_value = var_$1703_value
var_$1707_init = true
var_$1707_error = var_$1703_error
var_$1707_changed = true
var_$1707_unknown = var_$1703_unknown
}
var_$1705_changed = false
if ((var_$1706_init && var_$1707_init && var_$1745_init)) {
if ((var_$1706_changed) || (var_$1707_changed) || (var_$1745_changed)) {
var_$1705_unknown = (var_$1706_unknown && var_$1707_unknown && var_$1745_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = (if ((if((var_$1706_error == null)) {var_$1706_value} else {throw var_$1706_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}))
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
var_result$1625_changed = false
if ((var_$1626_init && var_$1687_init && var_$1705_init)) {
if ((var_$1626_changed) || (var_$1687_changed) || (var_$1705_changed)) {
var_result$1625_unknown = (var_$1626_unknown && var_$1687_unknown && var_$1705_unknown)
if ((var_result$1625_unknown)) {
var_result$1625_error = UnknownEventError(null)
} else {
var_result$1625_error = null
try {
var_result$1625_value = (if ((if((var_$1626_error == null)) {var_$1626_value} else {throw var_$1626_error})) (if((var_$1687_error == null)) {var_$1687_value} else {throw var_$1687_error}) else (if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}))
} catch {
case var_err : Throwable => {
var_result$1625_error = var_err
}
}
}
var_result$1625_init = true
var_result$1625_ts = currTs
var_result$1625_changed = true
}
}
var_$1721_changed = false
if ((var_result$1625_changed)) {
if ((var_$1722_ts == currTs && var_$1722_lastInit) || (!(var_$1722_ts == currTs) && var_$1722_init)) {
var_$1721_changed = true
var_$1721_init = true
var_$1721_unknown = var_result$1625_unknown
if ((var_$1721_unknown)) {
var_$1721_error = var_result$1625_error
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
var_$1725_changed = false
if ((var_result$1625_init)) {
if ((var_result$1625_changed)) {
var_$1725_unknown = (var_result$1625_unknown)
if ((var_$1725_unknown)) {
var_$1725_error = UnknownEventError(null)
} else {
var_$1725_error = null
try {
var_$1725_value = var_$1726.apply((if((var_result$1625_error == null)) {var_result$1625_value} else {throw var_result$1625_error}))
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
var_$1730_changed = false
if ((var_result$1625_init)) {
if ((var_result$1625_changed)) {
var_$1730_unknown = (var_result$1625_unknown)
if ((var_$1730_unknown)) {
var_$1730_error = UnknownEventError(null)
} else {
var_$1730_error = null
try {
var_$1730_value = var_$1748.apply((if((var_result$1625_error == null)) {var_result$1625_value} else {throw var_result$1625_error}))
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
var_$1623_changed = false
if ((var_$1725_init && var_$1714_init)) {
if ((var_$1725_changed) || (var_$1714_changed)) {
var_$1623_unknown = (var_$1725_unknown && var_$1714_unknown)
if ((var_$1623_unknown)) {
var_$1623_error = UnknownEventError(null)
} else {
var_$1623_error = null
try {
var_$1623_value = ((if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}) && (if((var_$1714_error == null)) {var_$1714_value} else {throw var_$1714_error}))
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
if ((!(currTs == 0L))) {
var_$1727_changed = false
}
if ((var_$1728_changed)) {
var_$1727_value = var_$1728_value
var_$1727_init = true
var_$1727_error = var_$1728_error
var_$1727_changed = true
var_$1727_unknown = var_$1728_unknown
}
var_$1724_changed = false
if ((var_$1725_init && var_$1727_init)) {
if ((var_$1725_changed) || (var_$1727_changed)) {
var_$1724_unknown = (var_$1725_unknown && var_$1727_unknown)
if ((var_$1724_unknown)) {
var_$1724_error = UnknownEventError(null)
} else {
var_$1724_error = null
try {
var_$1724_value = ((if((var_$1725_error == null)) {var_$1725_value} else {throw var_$1725_error}) == (if((var_$1727_error == null)) {var_$1727_value} else {throw var_$1727_error}))
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
if ((!(currTs == 0L))) {
var_$1732_changed = false
}
if ((var_$1728_changed)) {
var_$1732_value = var_$1728_value
var_$1732_init = true
var_$1732_error = var_$1728_error
var_$1732_changed = true
var_$1732_unknown = var_$1728_unknown
}
var_$1729_changed = false
if ((var_$1730_init && var_$1732_init)) {
if ((var_$1730_changed) || (var_$1732_changed)) {
var_$1729_unknown = (var_$1730_unknown && var_$1732_unknown)
if ((var_$1729_unknown)) {
var_$1729_error = UnknownEventError(null)
} else {
var_$1729_error = null
try {
var_$1729_value = ((if((var_$1730_error == null)) {var_$1730_value} else {throw var_$1730_error}) == (if((var_$1732_error == null)) {var_$1732_value} else {throw var_$1732_error}))
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
var_$1622_changed = false
if ((var_$1623_init && var_$1717_init)) {
if ((var_$1623_changed) || (var_$1717_changed)) {
var_$1622_unknown = (var_$1623_unknown && var_$1717_unknown)
if ((var_$1622_unknown)) {
var_$1622_error = UnknownEventError(null)
} else {
var_$1622_error = null
try {
var_$1622_value = ((if((var_$1623_error == null)) {var_$1623_value} else {throw var_$1623_error}) && (if((var_$1717_error == null)) {var_$1717_value} else {throw var_$1717_error}))
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
var_$1734_changed = false
if ((var_result$1625_changed)) {
var_$1734_value = var_result$1625_ts
var_$1734_init = true
var_$1734_unknown = var_result$1625_unknown
if ((var_$1734_unknown)) {
var_$1734_error = var_result$1625_error
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
var_finalFalseSince$1621_changed = false
if ((var_$1622_init && var_$1734_init && var_$1735_init)) {
if ((var_$1622_changed) || (var_$1734_changed) || (var_$1735_changed)) {
var_finalFalseSince$1621_unknown = (var_$1622_unknown && var_$1734_unknown && var_$1735_unknown)
if ((var_finalFalseSince$1621_unknown)) {
var_finalFalseSince$1621_error = UnknownEventError(null)
} else {
var_finalFalseSince$1621_error = null
try {
var_finalFalseSince$1621_value = (if ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error})) (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}) else (if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1621_error = var_err
}
}
}
var_finalFalseSince$1621_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1736_changed = false
}
if ((var_finalFalseSince$1621_changed)) {
var_$1736_lastValue = var_$1736_value
var_$1736_lastInit = var_$1736_init
var_$1736_lastError = var_$1736_error
var_$1736_value = var_finalFalseSince$1621_value
var_$1736_init = true
var_$1736_ts = currTs
var_$1736_error = var_finalFalseSince$1621_error
var_$1736_changed = true
var_$1736_unknown = var_finalFalseSince$1621_unknown
}
if ((!(currTs == 0L))) {
var_$1738_changed = false
}
if ((var_$1648_changed)) {
var_$1738_value = var_$1648_value
var_$1738_init = true
var_$1738_error = var_$1648_error
var_$1738_changed = true
var_$1738_unknown = var_$1648_unknown
}
var_$1619_changed = false
if ((var_$1736_init && var_$1738_init)) {
if ((var_$1736_changed) || (var_$1738_changed)) {
var_$1619_unknown = (var_$1736_unknown && var_$1738_unknown)
if ((var_$1619_unknown)) {
var_$1619_error = UnknownEventError(null)
} else {
var_$1619_error = null
try {
var_$1619_value = ((if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) + (if((var_$1738_error == null)) {var_$1738_value} else {throw var_$1738_error}))
} catch {
case var_err : Throwable => {
var_$1619_error = var_err
}
}
}
var_$1619_init = true
var_$1619_changed = true
}
}
var_$1618_changed = false
if ((var_$1619_init && var_$1734_init)) {
if ((var_$1619_changed) || (var_$1734_changed)) {
var_$1618_unknown = (var_$1619_unknown && var_$1734_unknown)
if ((var_$1618_unknown)) {
var_$1618_error = UnknownEventError(null)
} else {
var_$1618_error = null
try {
var_$1618_value = ((if((var_$1619_error == null)) {var_$1619_value} else {throw var_$1619_error}) < (if((var_$1734_error == null)) {var_$1734_value} else {throw var_$1734_error}))
} catch {
case var_err : Throwable => {
var_$1618_error = var_err
}
}
}
var_$1618_init = true
var_$1618_changed = true
}
}
var_isFinalFalseReset$1617_changed = false
if ((var_$1618_init && var_$1732_init && var_isFinalFalseReset$1744_init)) {
if ((var_$1618_changed) || (var_$1732_changed) || (var_isFinalFalseReset$1744_changed)) {
var_isFinalFalseReset$1617_unknown = (var_$1618_unknown && var_$1732_unknown && var_isFinalFalseReset$1744_unknown)
if ((var_isFinalFalseReset$1617_unknown)) {
var_isFinalFalseReset$1617_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1617_error = null
try {
var_isFinalFalseReset$1617_value = (if ((if((var_$1618_error == null)) {var_$1618_value} else {throw var_$1618_error})) (if((var_$1732_error == null)) {var_$1732_value} else {throw var_$1732_error}) else (if((var_isFinalFalseReset$1744_error == null)) {var_isFinalFalseReset$1744_value} else {throw var_isFinalFalseReset$1744_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1617_error = var_err
}
}
}
var_isFinalFalseReset$1617_changed = true
}
}
var_$1722_changed = false
if ((var_isFinalFalseReset$1617_changed) || (var_isFinalFalseReset$1744_changed)) {
var_$1722_lastValue = var_$1722_value
var_$1722_lastInit = var_$1722_init
var_$1722_lastError = var_$1722_error
var_$1722_init = true
var_$1722_ts = currTs
var_$1722_changed = true
var_$1722_unknown = (var_isFinalFalseReset$1617_unknown && var_isFinalFalseReset$1744_unknown)
if ((var_isFinalFalseReset$1617_changed)) {
var_$1722_value = var_isFinalFalseReset$1617_value
var_$1722_error = var_isFinalFalseReset$1617_error
} else {
if ((var_isFinalFalseReset$1744_changed)) {
var_$1722_value = var_isFinalFalseReset$1744_value
var_$1722_error = var_isFinalFalseReset$1744_error
}
}
}
var_stillFulfillableReset$1615_changed = false
if ((var_$1722_init && var_$1745_init && var_result$1625_init)) {
if ((var_$1722_changed) || (var_$1745_changed) || (var_result$1625_changed)) {
var_stillFulfillableReset$1615_unknown = (var_$1722_unknown && var_$1745_unknown && var_result$1625_unknown)
if ((var_stillFulfillableReset$1615_unknown)) {
var_stillFulfillableReset$1615_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1615_error = null
try {
var_stillFulfillableReset$1615_value = (if ((if((var_$1722_error == null)) {var_$1722_value} else {throw var_$1722_error})) (if((var_$1745_error == null)) {var_$1745_value} else {throw var_$1745_error}) else (if((var_result$1625_error == null)) {var_result$1625_value} else {throw var_result$1625_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1615_error = var_err
}
}
}
var_stillFulfillableReset$1615_init = true
var_stillFulfillableReset$1615_changed = true
}
}
var_value$1614_changed = false
if ((var_stillFulfillableReset$1615_init)) {
if ((var_stillFulfillableReset$1615_changed)) {
var_value$1614_unknown = (var_stillFulfillableReset$1615_unknown)
if ((var_value$1614_unknown)) {
var_value$1614_error = UnknownEventError(null)
} else {
var_value$1614_error = null
try {
var_value$1614_value = var_$1748.apply((if((var_stillFulfillableReset$1615_error == null)) {var_stillFulfillableReset$1615_value} else {throw var_stillFulfillableReset$1615_error}))
} catch {
case var_err : Throwable => {
var_value$1614_error = var_err
}
}
}
var_value$1614_init = true
var_value$1614_changed = true
}
}
var_final$1749_changed = false
if ((var_stillFulfillableReset$1615_init)) {
if ((var_stillFulfillableReset$1615_changed)) {
var_final$1749_lastValue = var_final$1749_value
var_final$1749_lastInit = var_final$1749_init
var_final$1749_lastError = var_final$1749_error
var_final$1749_unknown = (var_stillFulfillableReset$1615_unknown)
if ((var_final$1749_unknown)) {
var_final$1749_error = UnknownEventError(null)
} else {
var_final$1749_error = null
try {
var_final$1749_value = var_$1726.apply((if((var_stillFulfillableReset$1615_error == null)) {var_stillFulfillableReset$1615_value} else {throw var_stillFulfillableReset$1615_error}))
} catch {
case var_err : Throwable => {
var_final$1749_error = var_err
}
}
}
var_final$1749_init = true
var_final$1749_ts = currTs
var_final$1749_changed = true
}
}
var_$1751_changed = false
if ((var_$1752_changed)) {
var_$1751_value = 9223372036854775807L
var_$1751_init = var_$1752_init
if ((var_$1752_unknown)) {
var_$1751_error = UnknownEventError(var_$1752_error)
} else {
var_$1751_error = null
}
var_$1751_changed = var_$1752_changed
var_$1751_unknown = var_$1752_unknown
}
var_$1753_changed = false
if ((var_$1761_init && var_prev$1760_init)) {
if ((var_$1761_changed) || (var_prev$1760_changed)) {
var_$1753_unknown = (var_$1761_unknown && var_prev$1760_unknown)
if ((var_$1753_unknown)) {
var_$1753_error = UnknownEventError(null)
} else {
var_$1753_error = null
try {
var_$1753_value = ((if((var_$1761_error == null)) {var_$1761_value} else {throw var_$1761_error}) - (if((var_prev$1760_error == null)) {var_prev$1760_value} else {throw var_prev$1760_error}))
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
var_resets$1635_changed = false
if ((var_$1751_init && var_$1753_init)) {
if ((var_$1751_changed) || (var_$1753_changed)) {
var_resets$1635_unknown = (var_$1751_unknown && var_$1753_unknown)
if ((var_resets$1635_unknown)) {
var_resets$1635_error = UnknownEventError(null)
} else {
var_resets$1635_error = null
try {
var_resets$1635_value = ((if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error}) - (if((var_$1753_error == null)) {var_$1753_value} else {throw var_$1753_error}))
} catch {
case var_err : Throwable => {
var_resets$1635_error = var_err
}
}
}
var_resets$1635_changed = true
}
}

if ((var_$1752_unknown) || (!(var_resets$1635_error == null)) || (var_resets$1635_changed && (0L >= var_resets$1635_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_resets$1635_changed)) {
if ((var_targetCount$1666_changed) || (var_$1752_changed)) {
var_targetCount$1666_nextTs = (currTs + var_resets$1635_value)
}
} else {
if ((var_$1752_changed)) {
var_targetCount$1666_nextTs = -1L
}
}
}
if ((var_value$1614_changed && var_value$1614_init)) {
out_value.apply(var_value$1614_value, currTs, "value", var_value$1614_error)
}
if ((var_final$1749_changed && var_final$1749_init)) {
out_final.apply(var_final$1749_value, currTs, "final", var_final$1749_error)
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
