//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$1777 : scala.Function1[List[Any], Any] = ((var_list$1812 : List[Any]) => {
val var_$1813 : Any = var_list$1812(0L.asInstanceOf[Int])
var_$1813
})
val var_$1706 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1744 : (Boolean, Boolean)) => {
val var_$1745 : Boolean = var_$1744._2
var_$1745
})
var var_removeOldStimulusColorsFromSet$1737 : scala.Function3[List[Long], Map[Long, Long], Long, Map[Long, Long]] = null
var var_removeOldStimulusColorsFromList$1764 : scala.Function3[List[Long], Map[Long, Long], Long, List[Long]] = null
val var_$1701 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$1742 : (Boolean, Boolean)) => {
val var_$1743 : Boolean = var_$1742._1
var_$1743
})
var var_List_remove$1756 : scala.Function2[List[Long], Long, List[Long]] = null
val var_$1656 : Map[Long, Long] = Map[Long, Long]()
val var_$1684 : (Boolean, Boolean) = (false, true)
val var_$1722 : (Boolean, Boolean) = (true, false)
val var_$1729 : List[Long] = List[Long]()
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
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
var var_response_ts : Long = 0L
var var_response_changed : Boolean = false

var_removeOldStimulusColorsFromSet$1737 = ((var_latestStimulusColors$1765 : List[Long], var_colorTimeStamps$1766 : Map[Long, Long], var_timeBound$1767 : Long) => {
lazy val var_$1776 : Long = (var_head$1777.apply((var_latestStimulusColors$1765).asInstanceOf[List[Any]])).asInstanceOf[Long]
var var_$1768 : Map[Long, Long] = Map[Long, Long]()
var_$1768 = (if ((var_latestStimulusColors$1765.size == 0L)) var_colorTimeStamps$1766 else (if ((var_colorTimeStamps$1766.contains(var_$1776) && (var_colorTimeStamps$1766(var_$1776) >= var_timeBound$1767))) var_colorTimeStamps$1766 else var_removeOldStimulusColorsFromSet$1737.apply(var_latestStimulusColors$1765.tail, (var_colorTimeStamps$1766 - var_$1776), var_timeBound$1767)))
var_$1768
})
var_removeOldStimulusColorsFromList$1764 = ((var_latestStimulusColors$1797 : List[Long], var_colorTimeStamps$1798 : Map[Long, Long], var_timeBound$1799 : Long) => {
lazy val var_$1808 : Long = (var_head$1777.apply((var_latestStimulusColors$1797).asInstanceOf[List[Any]])).asInstanceOf[Long]
var var_$1800 : List[Long] = List[Long]()
var_$1800 = (if ((var_latestStimulusColors$1797.size == 0L)) var_latestStimulusColors$1797 else (if ((var_colorTimeStamps$1798.contains(var_$1808) && (var_colorTimeStamps$1798(var_$1808) >= var_timeBound$1799))) var_latestStimulusColors$1797 else var_removeOldStimulusColorsFromList$1764.apply(var_latestStimulusColors$1797.tail, var_colorTimeStamps$1798, var_timeBound$1799)))
var_$1800
})
var_List_remove$1756 = ((var_aList$1783 : List[Long], var_val$1784 : Long) => {
lazy val var_$1790 : Long = (var_head$1777.apply((var_aList$1783).asInstanceOf[List[Any]])).asInstanceOf[Long]
lazy val var_$1791 : List[Long] = var_List_remove$1756.apply(var_aList$1783.tail, var_val$1784)
val var_$1785 : List[Long] = (if ((var_aList$1783.size == 0L)) var_aList$1783 else (if ((var_$1790 == var_val$1784)) var_$1791 else (var_$1790 +: var_$1791)))
var_$1785
})
out_value = null
out_final = null
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
var_response_ts = ts
var_response_changed = true
}
})

var inputStream : String = ""
var value : String = ""
var currTs : Long = 0L
var lastProcessedTs : Long = 0L
var newInputTs : Long = 0L
var var_$1632_changed : Boolean = false
var var_$1632_value : Long = 0L
var var_$1632_unknown : Boolean = false
var var_$1632_error : Throwable = null
var var_defaultTime$1640_changed : Boolean = true
var var_defaultTime$1640_value : Long = -1L
var var_defaultTime$1640_init : Boolean = true
var var_defaultTime$1640_error : Throwable = null
var var_defaultTime$1640_unknown : Boolean = false
var var_$1681_changed : Boolean = false
var var_$1681_value : Long = 0L
var var_$1681_unknown : Boolean = false
var var_$1681_error : Throwable = null
var var_defaultTime$1642_changed : Boolean = true
var var_defaultTime$1642_value : Long = -1L
var var_defaultTime$1642_init : Boolean = true
var var_defaultTime$1642_error : Throwable = null
var var_defaultTime$1642_unknown : Boolean = false
var var_$1630_changed : Boolean = false
var var_$1630_unknown : Boolean = false
var var_$1630_error : Throwable = null
var var_$1630_value : Boolean = false
var var_$1630_init : Boolean = false
var var_$1629_changed : Boolean = false
var var_$1629_unknown : Boolean = false
var var_$1629_error : Throwable = null
var var_$1629_value : Boolean = false
var var_$1629_init : Boolean = false
var var_stimulusEventsNewStimulus$1639_changed : Boolean = false
var var_stimulusEventsNewStimulus$1639_unknown : Boolean = false
var var_stimulusEventsNewStimulus$1639_error : Throwable = null
var var_stimulusEventsNewStimulus$1639_value : Boolean = false
var var_stimulusEventsNewStimulus$1639_init : Boolean = false
var var_$1761_changed : Boolean = false
var var_$1761_ts : Long = 0L
var var_$1761_unknown : Boolean = false
var var_$1761_error : Throwable = null
var var_$1653_changed : Boolean = false
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : Map[Long, Long] = Map[Long, Long]()
var var_$1645_changed : Boolean = true
var var_$1645_value : Map[Long, Long] = var_$1656
var var_$1645_init : Boolean = true
var var_$1645_error : Throwable = null
var var_$1645_unknown : Boolean = false
var var_stimulusEventsNewStimulus$1644_changed : Boolean = false
var var_stimulusEventsNewStimulus$1644_unknown : Boolean = false
var var_stimulusEventsNewStimulus$1644_error : Throwable = null
var var_stimulusEventsNewStimulus$1644_value : Map[Long, Long] = Map[Long, Long]()
var var_stimulusEventsNewStimulus$1644_init : Boolean = false
var var_$1663_changed : Boolean = false
var var_$1663_unknown : Boolean = false
var var_$1663_error : Throwable = null
var var_$1663_value : Map[Long, Long] = Map[Long, Long]()
var var_$1663_init : Boolean = false
val var_$1736_value : Long = 0L
val var_$1736_error : Throwable = null
val var_$1736_changed : Boolean = false
val var_$1736_unknown : Boolean = false
var var_$1665_changed : Boolean = true
var var_$1665_value : Long = -1L
var var_$1665_error : Throwable = null
var var_$1665_unknown : Boolean = false
var var_$1675_changed : Boolean = false
var var_$1675_init : Boolean = false
var var_$1675_unknown : Boolean = false
var var_$1675_value : Long = 0L
var var_$1675_error : Throwable = null
var var_$1637_changed : Boolean = false
var var_$1637_unknown : Boolean = false
var var_$1637_error : Throwable = null
var var_$1637_value : Boolean = false
var var_$1637_init : Boolean = false
var var_$1662_changed : Boolean = false
var var_$1662_unknown : Boolean = false
var var_$1662_error : Throwable = null
var var_$1662_value : Long = 0L
var var_$1662_init : Boolean = false
var var_$1735_changed : Boolean = true
var var_$1735_value : Long = 50L
var var_$1735_init : Boolean = true
var var_$1735_error : Throwable = null
var var_$1735_unknown : Boolean = false
var var_$1661_changed : Boolean = false
var var_$1661_unknown : Boolean = false
var var_$1661_error : Throwable = null
var var_$1661_value : Long = 0L
var var_$1661_init : Boolean = false
var var_$1660_changed : Boolean = false
var var_$1660_unknown : Boolean = false
var var_$1660_error : Throwable = null
var var_$1660_value : Boolean = false
var var_$1660_init : Boolean = false
var var_$1636_changed : Boolean = false
var var_$1636_unknown : Boolean = false
var var_$1636_error : Throwable = null
var var_$1636_value : Boolean = false
var var_$1636_init : Boolean = false
var var_$1671_changed : Boolean = false
var var_$1671_unknown : Boolean = false
var var_$1671_error : Throwable = null
var var_$1671_value : Boolean = false
var var_$1671_init : Boolean = false
var var_$1635_changed : Boolean = false
var var_$1635_unknown : Boolean = false
var var_$1635_error : Throwable = null
var var_$1635_value : Boolean = false
var var_$1635_init : Boolean = false
var var_$1628_changed : Boolean = false
var var_$1628_unknown : Boolean = false
var var_$1628_error : Throwable = null
var var_$1628_value : Boolean = false
var var_$1628_init : Boolean = false
var var_$1733_changed : Boolean = false
var var_$1733_value : Long = 0L
var var_$1733_unknown : Boolean = false
var var_$1733_error : Throwable = null
val var_$1683_value : (Boolean, Boolean) = (false, false)
val var_$1683_error : Throwable = null
val var_$1683_changed : Boolean = false
val var_$1683_unknown : Boolean = false
var var_$1682_changed : Boolean = true
var var_$1682_value : (Boolean, Boolean) = var_$1684
var var_$1682_init : Boolean = true
var var_$1682_error : Throwable = null
var var_$1682_unknown : Boolean = false
var var_$1685_changed : Boolean = true
var var_$1685_value : (Boolean, Boolean) = var_$1722
var var_$1685_init : Boolean = true
var var_$1685_error : Throwable = null
var var_$1685_unknown : Boolean = false
var var_$1627_changed : Boolean = false
var var_$1627_unknown : Boolean = false
var var_$1627_error : Throwable = null
var var_$1627_value : (Boolean, Boolean) = (false, false)
var var_$1627_init : Boolean = false
var var_$1627_ts : Long = 0L
var var_$1700_changed : Boolean = false
var var_$1700_unknown : Boolean = false
var var_$1700_error : Throwable = null
var var_$1700_value : Boolean = false
var var_$1700_init : Boolean = false
var var_$1705_changed : Boolean = false
var var_$1705_unknown : Boolean = false
var var_$1705_error : Throwable = null
var var_$1705_value : Boolean = false
var var_$1705_init : Boolean = false
var var_$1689_changed : Boolean = false
var var_$1689_unknown : Boolean = false
var var_$1689_error : Throwable = null
var var_$1689_value : Boolean = false
var var_$1689_init : Boolean = false
var var_$1625_changed : Boolean = false
var var_$1625_unknown : Boolean = false
var var_$1625_error : Throwable = null
var var_$1625_value : Boolean = false
var var_$1625_init : Boolean = false
var var_$1696_changed : Boolean = false
var var_$1696_init : Boolean = false
var var_$1696_unknown : Boolean = false
var var_$1696_error : Throwable = null
var var_$1696_value : Boolean = false
val var_$1703_value : Boolean = false
val var_$1703_error : Throwable = null
val var_$1703_changed : Boolean = false
val var_$1703_unknown : Boolean = false
var var_$1702_changed : Boolean = true
var var_$1702_value : Boolean = true
var var_$1702_init : Boolean = true
var var_$1702_error : Throwable = null
var var_$1702_unknown : Boolean = false
var var_$1699_changed : Boolean = false
var var_$1699_unknown : Boolean = false
var var_$1699_error : Throwable = null
var var_$1699_value : Boolean = false
var var_$1699_init : Boolean = false
var var_$1707_changed : Boolean = true
var var_$1707_value : Boolean = false
var var_$1707_init : Boolean = true
var var_$1707_error : Throwable = null
var var_$1707_unknown : Boolean = false
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : Boolean = false
var var_$1704_init : Boolean = false
var var_$1698_changed : Boolean = false
var var_$1698_unknown : Boolean = false
var var_$1698_error : Throwable = null
var var_$1698_value : Boolean = false
var var_$1698_init : Boolean = false
var var_isFinalFalse$1695_changed : Boolean = false
var var_isFinalFalse$1695_unknown : Boolean = false
var var_isFinalFalse$1695_error : Throwable = null
var var_isFinalFalse$1695_value : Boolean = false
var var_$1718_changed : Boolean = true
var var_$1718_lastValue : Boolean = false
var var_$1718_lastInit : Boolean = false
var var_$1718_lastError : Throwable = null
var var_$1718_value : Boolean = false
var var_$1718_init : Boolean = true
var var_$1718_ts : Long = 0L
var var_$1718_error : Throwable = null
var var_$1718_unknown : Boolean = false
var var_prev$1693_changed : Boolean = false
var var_prev$1693_init : Boolean = false
var var_prev$1693_unknown : Boolean = false
var var_prev$1693_error : Throwable = null
var var_prev$1693_value : Boolean = false
var var_$1692_changed : Boolean = false
var var_$1692_unknown : Boolean = false
var var_$1692_error : Throwable = null
var var_$1692_value : Boolean = false
var var_$1692_init : Boolean = false
var var_$1624_changed : Boolean = false
var var_$1624_unknown : Boolean = false
var var_$1624_error : Throwable = null
var var_$1624_value : Boolean = false
var var_$1624_init : Boolean = false
var var_$1709_changed : Boolean = false
var var_$1709_value : Long = 0L
var var_$1709_init : Boolean = false
var var_$1709_unknown : Boolean = false
var var_$1709_error : Throwable = null
var var_$1710_changed : Boolean = false
var var_$1710_init : Boolean = false
var var_$1710_unknown : Boolean = false
var var_$1710_error : Throwable = null
var var_$1710_value : Long = 0L
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
var var_$1713_changed : Boolean = true
var var_$1713_value : Long = 9223372036854775807L
var var_$1713_init : Boolean = true
var var_$1713_error : Throwable = null
var var_$1713_unknown : Boolean = false
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
var var_$1697_changed : Boolean = false
var var_$1697_lastValue : Boolean = false
var var_$1697_lastInit : Boolean = false
var var_$1697_lastError : Throwable = null
var var_$1697_init : Boolean = false
var var_$1697_ts : Long = 0L
var var_$1697_unknown : Boolean = false
var var_$1697_value : Boolean = false
var var_$1697_error : Throwable = null
var var_stillFulfillableReset$1617_changed : Boolean = false
var var_stillFulfillableReset$1617_unknown : Boolean = false
var var_stillFulfillableReset$1617_error : Throwable = null
var var_stillFulfillableReset$1617_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1617_init : Boolean = false
var var_defaultTime$1732_changed : Boolean = true
var var_defaultTime$1732_value : Long = -1L
var var_defaultTime$1732_init : Boolean = true
var var_defaultTime$1732_error : Throwable = null
var var_defaultTime$1732_unknown : Boolean = false
var var_$1727_changed : Boolean = false
var var_$1727_unknown : Boolean = false
var var_$1727_error : Throwable = null
var var_$1727_value : List[Long] = List[Long]()
var var_$1752_changed : Boolean = true
var var_$1752_value : List[Long] = var_$1729
var var_$1752_init : Boolean = true
var var_$1752_error : Throwable = null
var var_$1752_unknown : Boolean = false
var var_$1751_changed : Boolean = false
var var_$1751_unknown : Boolean = false
var var_$1751_error : Throwable = null
var var_$1751_value : List[Long] = List[Long]()
var var_$1751_init : Boolean = false
var var_stimulusColorsYoungerThanMax$1750_changed : Boolean = false
var var_stimulusColorsYoungerThanMax$1750_unknown : Boolean = false
var var_stimulusColorsYoungerThanMax$1750_error : Throwable = null
var var_stimulusColorsYoungerThanMax$1750_value : List[Long] = List[Long]()
var var_stimulusColorsYoungerThanMax$1750_init : Boolean = false
var var_stimulusEvents$1731_changed : Boolean = false
var var_stimulusEvents$1731_unknown : Boolean = false
var var_stimulusEvents$1731_error : Throwable = null
var var_stimulusEvents$1731_value : Long = 0L
var var_stimulusEvents$1731_init : Boolean = false
var var_$1728_lastValue : List[Long] = List[Long]()
var var_$1728_lastInit : Boolean = false
var var_$1728_lastError : Throwable = null
var var_$1728_unknown : Boolean = false
var var_$1728_error : Throwable = null
var var_$1728_value : List[Long] = List[Long]()
var var_$1728_init : Boolean = false
var var_$1728_ts : Long = 0L
var var_$1647_lastValue : Map[Long, Long] = Map[Long, Long]()
var var_$1647_lastInit : Boolean = false
var var_$1647_lastError : Throwable = null
var var_$1647_unknown : Boolean = false
var var_$1647_error : Throwable = null
var var_$1647_value : Map[Long, Long] = Map[Long, Long]()
var var_$1647_init : Boolean = false
var var_$1647_ts : Long = 0L
var var_final$1724_changed : Boolean = false
var var_final$1724_unknown : Boolean = false
var var_final$1724_error : Throwable = null
var var_final$1724_value : Boolean = false
var var_final$1724_init : Boolean = false
var var_value$1616_changed : Boolean = false
var var_value$1616_unknown : Boolean = false
var var_value$1616_error : Throwable = null
var var_value$1616_value : Boolean = false
var var_value$1616_init : Boolean = false



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

var_$1632_changed = false
if ((var_stimulus_changed)) {
var_$1632_value = var_stimulus_ts
var_$1632_unknown = var_stimulus_unknown
if ((var_$1632_unknown)) {
var_$1632_error = var_stimulus_error
} else {
var_$1632_error = null
}
var_$1632_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1640_changed = false
}
if ((var_$1632_changed)) {
var_defaultTime$1640_value = var_$1632_value
var_defaultTime$1640_init = true
var_defaultTime$1640_error = var_$1632_error
var_defaultTime$1640_changed = true
var_defaultTime$1640_unknown = var_$1632_unknown
}
var_$1681_changed = false
if ((var_response_changed)) {
var_$1681_value = var_response_ts
var_$1681_unknown = var_response_unknown
if ((var_$1681_unknown)) {
var_$1681_error = var_response_error
} else {
var_$1681_error = null
}
var_$1681_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$1642_changed = false
}
if ((var_$1681_changed)) {
var_defaultTime$1642_value = var_$1681_value
var_defaultTime$1642_init = true
var_defaultTime$1642_error = var_$1681_error
var_defaultTime$1642_changed = true
var_defaultTime$1642_unknown = var_$1681_unknown
}
var_$1630_changed = false
if ((var_defaultTime$1640_init && var_defaultTime$1642_init)) {
if ((var_defaultTime$1640_changed) || (var_defaultTime$1642_changed)) {
var_$1630_unknown = (var_defaultTime$1640_unknown && var_defaultTime$1642_unknown)
if ((var_$1630_unknown)) {
var_$1630_error = UnknownEventError(null)
} else {
var_$1630_error = null
try {
var_$1630_value = ((if((var_defaultTime$1640_error == null)) {var_defaultTime$1640_value} else {throw var_defaultTime$1640_error}) <= (if((var_defaultTime$1642_error == null)) {var_defaultTime$1642_value} else {throw var_defaultTime$1642_error}))
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
var_$1629_changed = false
if ((var_$1630_init)) {
if ((var_$1630_changed)) {
var_$1629_unknown = (var_$1630_unknown)
if ((var_$1629_unknown)) {
var_$1629_error = UnknownEventError(null)
} else {
var_$1629_error = null
try {
var_$1629_value = !((if((var_$1630_error == null)) {var_$1630_value} else {throw var_$1630_error}))
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
var_stimulusEventsNewStimulus$1639_changed = false
if ((var_defaultTime$1640_init && var_defaultTime$1642_init)) {
if ((var_defaultTime$1640_changed) || (var_defaultTime$1642_changed)) {
var_stimulusEventsNewStimulus$1639_unknown = (var_defaultTime$1640_unknown && var_defaultTime$1642_unknown)
if ((var_stimulusEventsNewStimulus$1639_unknown)) {
var_stimulusEventsNewStimulus$1639_error = UnknownEventError(null)
} else {
var_stimulusEventsNewStimulus$1639_error = null
try {
var_stimulusEventsNewStimulus$1639_value = ((if((var_defaultTime$1640_error == null)) {var_defaultTime$1640_value} else {throw var_defaultTime$1640_error}) >= (if((var_defaultTime$1642_error == null)) {var_defaultTime$1642_value} else {throw var_defaultTime$1642_error}))
} catch {
case var_err : Throwable => {
var_stimulusEventsNewStimulus$1639_error = var_err
}
}
}
var_stimulusEventsNewStimulus$1639_init = true
var_stimulusEventsNewStimulus$1639_changed = true
}
}
var_$1761_changed = false
if ((var_stimulus_changed) || (var_response_changed)) {
var_$1761_ts = currTs
var_$1761_changed = true
var_$1761_unknown = (var_stimulus_unknown && var_response_unknown)
if ((var_stimulus_changed)) {
var_$1761_error = var_stimulus_error
} else {
if ((var_response_changed)) {
var_$1761_error = var_response_error
}
}
}
var_$1653_changed = false
if ((var_$1761_changed)) {
if ((var_$1647_ts == currTs && var_$1647_lastInit) || (!(var_$1647_ts == currTs) && var_$1647_init)) {
var_$1653_changed = true
var_$1653_unknown = var_$1761_unknown
if ((var_$1653_unknown)) {
var_$1653_error = var_$1761_error
} else {
if ((var_$1647_ts == currTs)) {
var_$1653_value = var_$1647_lastValue
var_$1653_error = var_$1647_lastError
} else {
var_$1653_value = var_$1647_value
var_$1653_error = var_$1647_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1645_changed = false
}
if ((var_$1653_changed)) {
var_$1645_value = var_$1653_value
var_$1645_init = true
var_$1645_error = var_$1653_error
var_$1645_changed = true
var_$1645_unknown = var_$1653_unknown
}
var_stimulusEventsNewStimulus$1644_changed = false
if ((var_$1645_init && var_stimulus_init && var_defaultTime$1640_init)) {
if ((var_$1645_changed) || (var_stimulus_changed) || (var_defaultTime$1640_changed)) {
var_stimulusEventsNewStimulus$1644_unknown = (var_$1645_unknown && var_stimulus_unknown && var_defaultTime$1640_unknown)
if ((var_stimulusEventsNewStimulus$1644_unknown)) {
var_stimulusEventsNewStimulus$1644_error = UnknownEventError(null)
} else {
var_stimulusEventsNewStimulus$1644_error = null
try {
var_stimulusEventsNewStimulus$1644_value = ((if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error}) + (((if((var_stimulus_error == null)) {var_stimulus_value} else {throw var_stimulus_error})) -> ((if((var_defaultTime$1640_error == null)) {var_defaultTime$1640_value} else {throw var_defaultTime$1640_error}))))
} catch {
case var_err : Throwable => {
var_stimulusEventsNewStimulus$1644_error = var_err
}
}
}
var_stimulusEventsNewStimulus$1644_init = true
var_stimulusEventsNewStimulus$1644_changed = true
}
}
var_$1663_changed = false
if ((var_stimulusEventsNewStimulus$1639_init && var_stimulusEventsNewStimulus$1644_init && var_$1645_init)) {
if ((var_stimulusEventsNewStimulus$1639_changed) || (var_stimulusEventsNewStimulus$1644_changed) || (var_$1645_changed)) {
var_$1663_unknown = (var_stimulusEventsNewStimulus$1639_unknown && var_stimulusEventsNewStimulus$1644_unknown && var_$1645_unknown)
if ((var_$1663_unknown)) {
var_$1663_error = UnknownEventError(null)
} else {
var_$1663_error = null
try {
var_$1663_value = (if ((if((var_stimulusEventsNewStimulus$1639_error == null)) {var_stimulusEventsNewStimulus$1639_value} else {throw var_stimulusEventsNewStimulus$1639_error})) (if((var_stimulusEventsNewStimulus$1644_error == null)) {var_stimulusEventsNewStimulus$1644_value} else {throw var_stimulusEventsNewStimulus$1644_error}) else (if((var_$1645_error == null)) {var_$1645_value} else {throw var_$1645_error}))
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
if ((!(currTs == 0L))) {
var_$1665_changed = false
}
if ((var_$1736_changed)) {
var_$1665_value = var_$1736_value
var_$1665_error = var_$1736_error
var_$1665_changed = true
var_$1665_unknown = var_$1736_unknown
}
var_$1675_changed = false
if ((var_response_changed) || (var_$1665_changed)) {
var_$1675_init = true
var_$1675_changed = true
var_$1675_unknown = (var_response_unknown && var_$1665_unknown)
if ((var_response_changed)) {
var_$1675_value = var_response_value
var_$1675_error = var_response_error
} else {
if ((var_$1665_changed)) {
var_$1675_value = var_$1665_value
var_$1675_error = var_$1665_error
}
}
}
var_$1637_changed = false
if ((var_$1663_init && var_$1675_init)) {
if ((var_$1663_changed) || (var_$1675_changed)) {
var_$1637_unknown = (var_$1663_unknown && var_$1675_unknown)
if ((var_$1637_unknown)) {
var_$1637_error = UnknownEventError(null)
} else {
var_$1637_error = null
try {
var_$1637_value = (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}).contains((if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error}))
} catch {
case var_err : Throwable => {
var_$1637_error = var_err
}
}
}
var_$1637_init = true
var_$1637_changed = true
}
}
var_$1662_changed = false
if ((var_$1663_init && var_$1675_init)) {
if ((var_$1663_changed) || (var_$1675_changed)) {
var_$1662_unknown = (var_$1663_unknown && var_$1675_unknown)
if ((var_$1662_unknown)) {
var_$1662_error = UnknownEventError(null)
} else {
var_$1662_error = null
try {
var_$1662_value = (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error})((if((var_$1675_error == null)) {var_$1675_value} else {throw var_$1675_error}))
} catch {
case var_err : Throwable => {
var_$1662_error = var_err
}
}
}
var_$1662_init = true
var_$1662_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1735_changed = false
}
if ((var_$1736_changed)) {
var_$1735_value = var_$1736_value
var_$1735_init = true
var_$1735_error = var_$1736_error
var_$1735_changed = true
var_$1735_unknown = var_$1736_unknown
}
var_$1661_changed = false
if ((var_$1662_init && var_$1735_init)) {
if ((var_$1662_changed) || (var_$1735_changed)) {
var_$1661_unknown = (var_$1662_unknown && var_$1735_unknown)
if ((var_$1661_unknown)) {
var_$1661_error = UnknownEventError(null)
} else {
var_$1661_error = null
try {
var_$1661_value = ((if((var_$1662_error == null)) {var_$1662_value} else {throw var_$1662_error}) + (if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}))
} catch {
case var_err : Throwable => {
var_$1661_error = var_err
}
}
}
var_$1661_init = true
var_$1661_changed = true
}
}
var_$1660_changed = false
if ((var_$1661_init && var_defaultTime$1642_init)) {
if ((var_$1661_changed) || (var_defaultTime$1642_changed)) {
var_$1660_unknown = (var_$1661_unknown && var_defaultTime$1642_unknown)
if ((var_$1660_unknown)) {
var_$1660_error = UnknownEventError(null)
} else {
var_$1660_error = null
try {
var_$1660_value = ((if((var_$1661_error == null)) {var_$1661_value} else {throw var_$1661_error}) <= (if((var_defaultTime$1642_error == null)) {var_defaultTime$1642_value} else {throw var_defaultTime$1642_error}))
} catch {
case var_err : Throwable => {
var_$1660_error = var_err
}
}
}
var_$1660_init = true
var_$1660_changed = true
}
}
var_$1636_changed = false
if ((var_$1637_init && var_$1660_init)) {
if ((var_$1637_changed) || (var_$1660_changed)) {
var_$1636_unknown = (var_$1637_unknown && var_$1660_unknown)
if ((var_$1636_unknown)) {
var_$1636_error = UnknownEventError(null)
} else {
var_$1636_error = null
try {
var_$1636_value = ((if((var_$1637_error == null)) {var_$1637_value} else {throw var_$1637_error}) && (if((var_$1660_error == null)) {var_$1660_value} else {throw var_$1660_error}))
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
var_$1671_changed = false
if ((var_$1661_init && var_defaultTime$1642_init)) {
if ((var_$1661_changed) || (var_defaultTime$1642_changed)) {
var_$1671_unknown = (var_$1661_unknown && var_defaultTime$1642_unknown)
if ((var_$1671_unknown)) {
var_$1671_error = UnknownEventError(null)
} else {
var_$1671_error = null
try {
var_$1671_value = ((if((var_$1661_error == null)) {var_$1661_value} else {throw var_$1661_error}) >= (if((var_defaultTime$1642_error == null)) {var_defaultTime$1642_value} else {throw var_defaultTime$1642_error}))
} catch {
case var_err : Throwable => {
var_$1671_error = var_err
}
}
}
var_$1671_init = true
var_$1671_changed = true
}
}
var_$1635_changed = false
if ((var_$1636_init && var_$1671_init)) {
if ((var_$1636_changed) || (var_$1671_changed)) {
var_$1635_unknown = (var_$1636_unknown && var_$1671_unknown)
if ((var_$1635_unknown)) {
var_$1635_error = UnknownEventError(null)
} else {
var_$1635_error = null
try {
var_$1635_value = ((if((var_$1636_error == null)) {var_$1636_value} else {throw var_$1636_error}) && (if((var_$1671_error == null)) {var_$1671_value} else {throw var_$1671_error}))
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
var_$1628_changed = false
if ((var_$1629_init && var_$1635_init)) {
if ((var_$1629_changed) || (var_$1635_changed)) {
var_$1628_unknown = (var_$1629_unknown && var_$1635_unknown)
if ((var_$1628_unknown)) {
var_$1628_error = UnknownEventError(null)
} else {
var_$1628_error = null
try {
var_$1628_value = ((if((var_$1629_error == null)) {var_$1629_value} else {throw var_$1629_error}) || (if((var_$1635_error == null)) {var_$1635_value} else {throw var_$1635_error}))
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
var_$1733_changed = false
if ((var_$1761_changed)) {
var_$1733_value = var_$1761_ts
var_$1733_unknown = var_$1761_unknown
if ((var_$1733_unknown)) {
var_$1733_error = var_$1761_error
} else {
var_$1733_error = null
}
var_$1733_changed = true
}
if ((!(currTs == 0L))) {
var_$1682_changed = false
}
if ((var_$1683_changed)) {
var_$1682_value = var_$1683_value
var_$1682_init = true
var_$1682_error = var_$1683_error
var_$1682_changed = true
var_$1682_unknown = var_$1683_unknown
}
if ((!(currTs == 0L))) {
var_$1685_changed = false
}
if ((var_$1683_changed)) {
var_$1685_value = var_$1683_value
var_$1685_init = true
var_$1685_error = var_$1683_error
var_$1685_changed = true
var_$1685_unknown = var_$1683_unknown
}
var_$1627_changed = false
if ((var_$1628_init && var_$1682_init && var_$1685_init)) {
if ((var_$1628_changed) || (var_$1682_changed) || (var_$1685_changed)) {
var_$1627_unknown = (var_$1628_unknown && var_$1682_unknown && var_$1685_unknown)
if ((var_$1627_unknown)) {
var_$1627_error = UnknownEventError(null)
} else {
var_$1627_error = null
try {
var_$1627_value = (if ((if((var_$1628_error == null)) {var_$1628_value} else {throw var_$1628_error})) (if((var_$1682_error == null)) {var_$1682_value} else {throw var_$1682_error}) else (if((var_$1685_error == null)) {var_$1685_value} else {throw var_$1685_error}))
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
var_$1700_changed = false
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1700_unknown = (var_$1627_unknown)
if ((var_$1700_unknown)) {
var_$1700_error = UnknownEventError(null)
} else {
var_$1700_error = null
try {
var_$1700_value = var_$1701.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_$1705_changed = false
if ((var_$1627_init)) {
if ((var_$1627_changed)) {
var_$1705_unknown = (var_$1627_unknown)
if ((var_$1705_unknown)) {
var_$1705_error = UnknownEventError(null)
} else {
var_$1705_error = null
try {
var_$1705_value = var_$1706.apply((if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
var_$1689_changed = false
if ((var_$1705_init)) {
if ((var_$1705_changed)) {
var_$1689_unknown = (var_$1705_unknown)
if ((var_$1689_unknown)) {
var_$1689_error = UnknownEventError(null)
} else {
var_$1689_error = null
try {
var_$1689_value = !((if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}))
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
var_$1625_changed = false
if ((var_$1700_init && var_$1689_init)) {
if ((var_$1700_changed) || (var_$1689_changed)) {
var_$1625_unknown = (var_$1700_unknown && var_$1689_unknown)
if ((var_$1625_unknown)) {
var_$1625_error = UnknownEventError(null)
} else {
var_$1625_error = null
try {
var_$1625_value = ((if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}) && (if((var_$1689_error == null)) {var_$1689_value} else {throw var_$1689_error}))
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
var_$1696_changed = false
if ((var_$1627_changed)) {
if ((var_$1697_ts == currTs && var_$1697_lastInit) || (!(var_$1697_ts == currTs) && var_$1697_init)) {
var_$1696_changed = true
var_$1696_init = true
var_$1696_unknown = var_$1627_unknown
if ((var_$1696_unknown)) {
var_$1696_error = var_$1627_error
} else {
if ((var_$1697_ts == currTs)) {
var_$1696_value = var_$1697_lastValue
var_$1696_error = var_$1697_lastError
} else {
var_$1696_value = var_$1697_value
var_$1696_error = var_$1697_error
}
}
}
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
var_$1699_changed = false
if ((var_$1700_init && var_$1702_init)) {
if ((var_$1700_changed) || (var_$1702_changed)) {
var_$1699_unknown = (var_$1700_unknown && var_$1702_unknown)
if ((var_$1699_unknown)) {
var_$1699_error = UnknownEventError(null)
} else {
var_$1699_error = null
try {
var_$1699_value = ((if((var_$1700_error == null)) {var_$1700_value} else {throw var_$1700_error}) == (if((var_$1702_error == null)) {var_$1702_value} else {throw var_$1702_error}))
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
var_$1704_changed = false
if ((var_$1705_init && var_$1707_init)) {
if ((var_$1705_changed) || (var_$1707_changed)) {
var_$1704_unknown = (var_$1705_unknown && var_$1707_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = ((if((var_$1705_error == null)) {var_$1705_value} else {throw var_$1705_error}) == (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}))
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
var_$1698_changed = false
if ((var_$1699_init && var_$1704_init)) {
if ((var_$1699_changed) || (var_$1704_changed)) {
var_$1698_unknown = (var_$1699_unknown && var_$1704_unknown)
if ((var_$1698_unknown)) {
var_$1698_error = UnknownEventError(null)
} else {
var_$1698_error = null
try {
var_$1698_value = ((if((var_$1699_error == null)) {var_$1699_value} else {throw var_$1699_error}) && (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1698_error = var_err
}
}
}
var_$1698_init = true
var_$1698_changed = true
}
}
var_isFinalFalse$1695_changed = false
if ((var_$1696_init && var_$1698_init)) {
if ((var_$1696_changed) || (var_$1698_changed)) {
var_isFinalFalse$1695_unknown = (var_$1696_unknown && var_$1698_unknown)
if ((var_isFinalFalse$1695_unknown)) {
var_isFinalFalse$1695_error = UnknownEventError(null)
} else {
var_isFinalFalse$1695_error = null
try {
var_isFinalFalse$1695_value = ((if((var_$1696_error == null)) {var_$1696_value} else {throw var_$1696_error}) || (if((var_$1698_error == null)) {var_$1698_value} else {throw var_$1698_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$1695_error = var_err
}
}
}
var_isFinalFalse$1695_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1718_changed = false
}
if ((var_isFinalFalse$1695_changed)) {
var_$1718_lastValue = var_$1718_value
var_$1718_lastInit = var_$1718_init
var_$1718_lastError = var_$1718_error
var_$1718_value = var_isFinalFalse$1695_value
var_$1718_init = true
var_$1718_ts = currTs
var_$1718_error = var_isFinalFalse$1695_error
var_$1718_changed = true
var_$1718_unknown = var_isFinalFalse$1695_unknown
}
var_prev$1693_changed = false
if ((var_$1718_changed)) {
if ((var_$1718_ts == currTs && var_$1718_lastInit) || (!(var_$1718_ts == currTs) && var_$1718_init)) {
var_prev$1693_changed = true
var_prev$1693_init = true
var_prev$1693_unknown = var_$1718_unknown
if ((var_prev$1693_unknown)) {
var_prev$1693_error = var_$1718_error
} else {
if ((var_$1718_ts == currTs)) {
var_prev$1693_value = var_$1718_lastValue
var_prev$1693_error = var_$1718_lastError
} else {
var_prev$1693_value = var_$1718_value
var_prev$1693_error = var_$1718_error
}
}
}
}
var_$1692_changed = false
if ((var_prev$1693_init)) {
if ((var_prev$1693_changed)) {
var_$1692_unknown = (var_prev$1693_unknown)
if ((var_$1692_unknown)) {
var_$1692_error = UnknownEventError(null)
} else {
var_$1692_error = null
try {
var_$1692_value = !((if((var_prev$1693_error == null)) {var_prev$1693_value} else {throw var_prev$1693_error}))
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
var_$1624_changed = false
if ((var_$1625_init && var_$1692_init)) {
if ((var_$1625_changed) || (var_$1692_changed)) {
var_$1624_unknown = (var_$1625_unknown && var_$1692_unknown)
if ((var_$1624_unknown)) {
var_$1624_error = UnknownEventError(null)
} else {
var_$1624_error = null
try {
var_$1624_value = ((if((var_$1625_error == null)) {var_$1625_value} else {throw var_$1625_error}) && (if((var_$1692_error == null)) {var_$1692_value} else {throw var_$1692_error}))
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
var_$1709_changed = false
if ((var_$1627_changed)) {
var_$1709_value = var_$1627_ts
var_$1709_init = true
var_$1709_unknown = var_$1627_unknown
if ((var_$1709_unknown)) {
var_$1709_error = var_$1627_error
} else {
var_$1709_error = null
}
var_$1709_changed = true
}
var_$1710_changed = false
if ((var_$1718_changed)) {
if ((var_$1622_ts == currTs && var_$1622_lastInit) || (!(var_$1622_ts == currTs) && var_$1622_init)) {
var_$1710_changed = true
var_$1710_init = true
var_$1710_unknown = var_$1718_unknown
if ((var_$1710_unknown)) {
var_$1710_error = var_$1718_error
} else {
if ((var_$1622_ts == currTs)) {
var_$1710_value = var_$1622_lastValue
var_$1710_error = var_$1622_lastError
} else {
var_$1710_value = var_$1622_value
var_$1710_error = var_$1622_error
}
}
}
}
var_finalFalseSince$1623_changed = false
if ((var_$1624_init && var_$1709_init && var_$1710_init)) {
if ((var_$1624_changed) || (var_$1709_changed) || (var_$1710_changed)) {
var_finalFalseSince$1623_unknown = (var_$1624_unknown && var_$1709_unknown && var_$1710_unknown)
if ((var_finalFalseSince$1623_unknown)) {
var_finalFalseSince$1623_error = UnknownEventError(null)
} else {
var_finalFalseSince$1623_error = null
try {
var_finalFalseSince$1623_value = (if ((if((var_$1624_error == null)) {var_$1624_value} else {throw var_$1624_error})) (if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}) else (if((var_$1710_error == null)) {var_$1710_value} else {throw var_$1710_error}))
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
var_$1713_changed = false
}
if ((var_$1736_changed)) {
var_$1713_value = var_$1736_value
var_$1713_init = true
var_$1713_error = var_$1736_error
var_$1713_changed = true
var_$1713_unknown = var_$1736_unknown
}
var_$1621_changed = false
if ((var_$1622_init && var_$1713_init)) {
if ((var_$1622_changed) || (var_$1713_changed)) {
var_$1621_unknown = (var_$1622_unknown && var_$1713_unknown)
if ((var_$1621_unknown)) {
var_$1621_error = UnknownEventError(null)
} else {
var_$1621_error = null
try {
var_$1621_value = ((if((var_$1622_error == null)) {var_$1622_value} else {throw var_$1622_error}) + (if((var_$1713_error == null)) {var_$1713_value} else {throw var_$1713_error}))
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
if ((var_$1621_init && var_$1709_init)) {
if ((var_$1621_changed) || (var_$1709_changed)) {
var_$1620_unknown = (var_$1621_unknown && var_$1709_unknown)
if ((var_$1620_unknown)) {
var_$1620_error = UnknownEventError(null)
} else {
var_$1620_error = null
try {
var_$1620_value = ((if((var_$1621_error == null)) {var_$1621_value} else {throw var_$1621_error}) < (if((var_$1709_error == null)) {var_$1709_value} else {throw var_$1709_error}))
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
if ((var_$1620_init && var_$1707_init && var_$1718_init)) {
if ((var_$1620_changed) || (var_$1707_changed) || (var_$1718_changed)) {
var_isFinalFalseReset$1619_unknown = (var_$1620_unknown && var_$1707_unknown && var_$1718_unknown)
if ((var_isFinalFalseReset$1619_unknown)) {
var_isFinalFalseReset$1619_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1619_error = null
try {
var_isFinalFalseReset$1619_value = (if ((if((var_$1620_error == null)) {var_$1620_value} else {throw var_$1620_error})) (if((var_$1707_error == null)) {var_$1707_value} else {throw var_$1707_error}) else (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1619_error = var_err
}
}
}
var_isFinalFalseReset$1619_changed = true
}
}
var_$1697_changed = false
if ((var_isFinalFalseReset$1619_changed) || (var_$1718_changed)) {
var_$1697_lastValue = var_$1697_value
var_$1697_lastInit = var_$1697_init
var_$1697_lastError = var_$1697_error
var_$1697_init = true
var_$1697_ts = currTs
var_$1697_changed = true
var_$1697_unknown = (var_isFinalFalseReset$1619_unknown && var_$1718_unknown)
if ((var_isFinalFalseReset$1619_changed)) {
var_$1697_value = var_isFinalFalseReset$1619_value
var_$1697_error = var_isFinalFalseReset$1619_error
} else {
if ((var_$1718_changed)) {
var_$1697_value = var_$1718_value
var_$1697_error = var_$1718_error
}
}
}
var_stillFulfillableReset$1617_changed = false
if ((var_$1697_init && var_$1685_init && var_$1627_init)) {
if ((var_$1697_changed) || (var_$1685_changed) || (var_$1627_changed)) {
var_stillFulfillableReset$1617_unknown = (var_$1697_unknown && var_$1685_unknown && var_$1627_unknown)
if ((var_stillFulfillableReset$1617_unknown)) {
var_stillFulfillableReset$1617_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1617_error = null
try {
var_stillFulfillableReset$1617_value = (if ((if((var_$1697_error == null)) {var_$1697_value} else {throw var_$1697_error})) (if((var_$1685_error == null)) {var_$1685_value} else {throw var_$1685_error}) else (if((var_$1627_error == null)) {var_$1627_value} else {throw var_$1627_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$1732_changed = false
}
if ((var_$1733_changed)) {
var_defaultTime$1732_value = var_$1733_value
var_defaultTime$1732_init = true
var_defaultTime$1732_error = var_$1733_error
var_defaultTime$1732_changed = true
var_defaultTime$1732_unknown = var_$1733_unknown
}
var_$1727_changed = false
if ((var_stimulus_changed)) {
if ((var_$1728_ts == currTs && var_$1728_lastInit) || (!(var_$1728_ts == currTs) && var_$1728_init)) {
var_$1727_changed = true
var_$1727_unknown = var_stimulus_unknown
if ((var_$1727_unknown)) {
var_$1727_error = var_stimulus_error
} else {
if ((var_$1728_ts == currTs)) {
var_$1727_value = var_$1728_lastValue
var_$1727_error = var_$1728_lastError
} else {
var_$1727_value = var_$1728_value
var_$1727_error = var_$1728_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$1752_changed = false
}
if ((var_$1727_changed)) {
var_$1752_value = var_$1727_value
var_$1752_init = true
var_$1752_error = var_$1727_error
var_$1752_changed = true
var_$1752_unknown = var_$1727_unknown
}
var_$1751_changed = false
if ((var_$1752_init && var_stimulus_init)) {
if ((var_$1752_changed) || (var_stimulus_changed)) {
var_$1751_unknown = (var_$1752_unknown && var_stimulus_unknown)
if ((var_$1751_unknown)) {
var_$1751_error = UnknownEventError(null)
} else {
var_$1751_error = null
try {
var_$1751_value = var_List_remove$1756.apply((if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}), (if((var_stimulus_error == null)) {var_stimulus_value} else {throw var_stimulus_error}))
} catch {
case var_err : Throwable => {
var_$1751_error = var_err
}
}
}
var_$1751_init = true
var_$1751_changed = true
}
}
var_stimulusColorsYoungerThanMax$1750_changed = false
if ((var_$1751_init && var_stimulus_init)) {
if ((var_$1751_changed) || (var_stimulus_changed)) {
var_stimulusColorsYoungerThanMax$1750_unknown = (var_$1751_unknown && var_stimulus_unknown)
if ((var_stimulusColorsYoungerThanMax$1750_unknown)) {
var_stimulusColorsYoungerThanMax$1750_error = UnknownEventError(null)
} else {
var_stimulusColorsYoungerThanMax$1750_error = null
try {
var_stimulusColorsYoungerThanMax$1750_value = ((if((var_$1751_error == null)) {var_$1751_value} else {throw var_$1751_error}) :+ (if((var_stimulus_error == null)) {var_stimulus_value} else {throw var_stimulus_error}))
} catch {
case var_err : Throwable => {
var_stimulusColorsYoungerThanMax$1750_error = var_err
}
}
}
var_stimulusColorsYoungerThanMax$1750_init = true
var_stimulusColorsYoungerThanMax$1750_changed = true
}
}
var_stimulusEvents$1731_changed = false
if ((var_defaultTime$1732_init && var_$1735_init)) {
if ((var_defaultTime$1732_changed) || (var_$1735_changed)) {
var_stimulusEvents$1731_unknown = (var_defaultTime$1732_unknown && var_$1735_unknown)
if ((var_stimulusEvents$1731_unknown)) {
var_stimulusEvents$1731_error = UnknownEventError(null)
} else {
var_stimulusEvents$1731_error = null
try {
var_stimulusEvents$1731_value = ((if((var_defaultTime$1732_error == null)) {var_defaultTime$1732_value} else {throw var_defaultTime$1732_error}) - (if((var_$1735_error == null)) {var_$1735_value} else {throw var_$1735_error}))
} catch {
case var_err : Throwable => {
var_stimulusEvents$1731_error = var_err
}
}
}
var_stimulusEvents$1731_init = true
var_stimulusEvents$1731_changed = true
}
}
if ((var_stimulusColorsYoungerThanMax$1750_init && var_$1663_init && var_stimulusEvents$1731_init)) {
if ((var_stimulusColorsYoungerThanMax$1750_changed) || (var_$1663_changed) || (var_stimulusEvents$1731_changed)) {
var_$1728_lastValue = var_$1728_value
var_$1728_lastInit = var_$1728_init
var_$1728_lastError = var_$1728_error
var_$1728_unknown = (var_stimulusColorsYoungerThanMax$1750_unknown && var_$1663_unknown && var_stimulusEvents$1731_unknown)
if ((var_$1728_unknown)) {
var_$1728_error = UnknownEventError(null)
} else {
var_$1728_error = null
try {
var_$1728_value = var_removeOldStimulusColorsFromList$1764.apply((if((var_stimulusColorsYoungerThanMax$1750_error == null)) {var_stimulusColorsYoungerThanMax$1750_value} else {throw var_stimulusColorsYoungerThanMax$1750_error}), (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}), (if((var_stimulusEvents$1731_error == null)) {var_stimulusEvents$1731_value} else {throw var_stimulusEvents$1731_error}))
} catch {
case var_err : Throwable => {
var_$1728_error = var_err
}
}
}
var_$1728_init = true
var_$1728_ts = currTs
}
}
if ((var_$1752_init && var_$1663_init && var_stimulusEvents$1731_init)) {
if ((var_$1752_changed) || (var_$1663_changed) || (var_stimulusEvents$1731_changed)) {
var_$1647_lastValue = var_$1647_value
var_$1647_lastInit = var_$1647_init
var_$1647_lastError = var_$1647_error
var_$1647_unknown = (var_$1752_unknown && var_$1663_unknown && var_stimulusEvents$1731_unknown)
if ((var_$1647_unknown)) {
var_$1647_error = UnknownEventError(null)
} else {
var_$1647_error = null
try {
var_$1647_value = var_removeOldStimulusColorsFromSet$1737.apply((if((var_$1752_error == null)) {var_$1752_value} else {throw var_$1752_error}), (if((var_$1663_error == null)) {var_$1663_value} else {throw var_$1663_error}), (if((var_stimulusEvents$1731_error == null)) {var_stimulusEvents$1731_value} else {throw var_stimulusEvents$1731_error}))
} catch {
case var_err : Throwable => {
var_$1647_error = var_err
}
}
}
var_$1647_init = true
var_$1647_ts = currTs
}
}
var_final$1724_changed = false
if ((var_stillFulfillableReset$1617_init)) {
if ((var_stillFulfillableReset$1617_changed)) {
var_final$1724_unknown = (var_stillFulfillableReset$1617_unknown)
if ((var_final$1724_unknown)) {
var_final$1724_error = UnknownEventError(null)
} else {
var_final$1724_error = null
try {
var_final$1724_value = var_$1701.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
} catch {
case var_err : Throwable => {
var_final$1724_error = var_err
}
}
}
var_final$1724_init = true
var_final$1724_changed = true
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
var_value$1616_value = var_$1706.apply((if((var_stillFulfillableReset$1617_error == null)) {var_stillFulfillableReset$1617_value} else {throw var_stillFulfillableReset$1617_error}))
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

if ((var_value$1616_changed && var_value$1616_init)) {
out_value.apply(var_value$1616_value, currTs, "value", var_value$1616_error)
}
if ((var_final$1724_changed && var_final$1724_init)) {
out_final.apply(var_final$1724_value, currTs, "final", var_final$1724_error)
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
