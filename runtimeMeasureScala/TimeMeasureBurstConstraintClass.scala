//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitorClass {

val var_$656 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$695 : (Boolean, Boolean)) => {
val var_$696 : Boolean = var_$695._1
var_$696
})
val var_head$471 : scala.Function1[List[Any], Any] = ((var_list$679 : List[Any]) => {
val var_$680 : Any = var_list$679(0L.asInstanceOf[Int])
var_$680
})
val var_$517 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$684 : (Boolean, Boolean)) => {
val var_$685 : Boolean = var_$684._2
var_$685
})
val var_fourValuedConjunction$678 : scala.Function2[(Boolean, Boolean), (Boolean, Boolean), (Boolean, Boolean)] = ((var_a$699 : (Boolean, Boolean), var_b$700 : (Boolean, Boolean)) => {
lazy val var_$727 : Boolean = var_a$699._2
lazy val var_$707 : Boolean = !(var_$727)
lazy val var_$728 : Boolean = var_a$699._1
lazy val var_$733 : Boolean = var_b$700._2
lazy val var_$709 : Boolean = !(var_$733)
lazy val var_$710 : Boolean = var_b$700._1
lazy val var_$732 : Boolean = !(var_$728)
lazy val var_$734 : Boolean = !(var_$710)
val var_$701 : (Boolean, Boolean) = (if (((var_$707 && var_$728) || (var_$709 && var_$710))) (true, false) else (if (((var_$707 && var_$732) || (var_$709 && var_$734))) (false, false) else (if (((var_$727 && var_$732) || (var_$733 && var_$734))) (false, true) else (true, true))))
var_$701
})
lazy val var_$462 : List[Long] = List[Long]()
val var_$510 : (Boolean, Boolean) = (false, true)
val var_$677 : (Boolean, Boolean) = (true, false)
var out_constraint : scala.Function4[(Boolean, Boolean), Long, String, Throwable, Unit] = null
val var_event_lastError : Throwable = null
val var_event_error : Throwable = null
val var_event_unknown : Boolean = false
var set_var_event : scala.Function2[Long, Long, Unit] = null
var var_event_lastInit : Boolean = false
var var_event_init : Boolean = false
var var_event_ts : Long = 0L
var var_event_changed : Boolean = false

out_constraint = null
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
var var_$746_changed : Boolean = false
var var_$746_value : Long = 0L
var var_$746_init : Boolean = false
var var_$746_unknown : Boolean = false
var var_$746_error : Throwable = null
var var_defaultTime$745_changed : Boolean = true
var var_defaultTime$745_value : Long = -1L
var var_defaultTime$745_init : Boolean = true
var var_defaultTime$745_error : Throwable = null
var var_defaultTime$745_unknown : Boolean = false
val var_$594_value : Long = 0L
val var_$594_error : Throwable = null
val var_$594_changed : Boolean = false
val var_$594_unknown : Boolean = false
var var_$566_changed : Boolean = true
var var_$566_value : Long = 0L
var var_$566_init : Boolean = true
var var_$566_error : Throwable = null
var var_$566_unknown : Boolean = false
var var_latestSpanEventTimes$433_changed : Boolean = false
var var_latestSpanEventTimes$433_unknown : Boolean = false
var var_latestSpanEventTimes$433_error : Throwable = null
var var_latestSpanEventTimes$433_value : Boolean = false
var var_latestSpanEventTimes$433_init : Boolean = false
val var_$440_value : List[Long] = List[Long]()
val var_$440_error : Throwable = null
val var_$440_changed : Boolean = false
val var_$440_unknown : Boolean = false
var var_$569_changed : Boolean = true
var var_$569_value : List[Long] = var_$462
var var_$569_init : Boolean = true
var var_$569_error : Throwable = null
var var_$569_unknown : Boolean = false
var var_latestSpanEventTimes$438_changed : Boolean = false
var var_latestSpanEventTimes$438_unknown : Boolean = false
var var_latestSpanEventTimes$438_error : Throwable = null
var var_latestSpanEventTimes$438_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$438_init : Boolean = false
var var_$588_changed : Boolean = false
var var_$588_init : Boolean = false
var var_$588_unknown : Boolean = false
var var_$588_error : Throwable = null
var var_$588_value : List[Long] = List[Long]()
var var_$578_changed : Boolean = false
var var_$578_unknown : Boolean = false
var var_$578_error : Throwable = null
var var_$578_value : Long = 0L
var var_$578_init : Boolean = false
var var_$800_changed : Boolean = true
var var_$800_value : Long = 1L
var var_$800_init : Boolean = true
var var_$800_error : Throwable = null
var var_$800_unknown : Boolean = false
var var_$577_changed : Boolean = false
var var_$577_unknown : Boolean = false
var var_$577_error : Throwable = null
var var_$577_value : Boolean = false
var var_$577_init : Boolean = false
var var_$584_changed : Boolean = false
var var_$584_init : Boolean = false
var var_$584_unknown : Boolean = false
var var_$584_error : Throwable = null
var var_$584_value : List[Long] = List[Long]()
var var_$583_changed : Boolean = false
var var_$583_unknown : Boolean = false
var var_$583_error : Throwable = null
var var_$583_value : List[Long] = List[Long]()
var var_$583_init : Boolean = false
var var_$576_changed : Boolean = false
var var_$576_unknown : Boolean = false
var var_$576_error : Throwable = null
var var_$576_value : List[Long] = List[Long]()
var var_$576_init : Boolean = false
var var_$575_changed : Boolean = false
var var_$575_unknown : Boolean = false
var var_$575_error : Throwable = null
var var_$575_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$574_changed : Boolean = true
var var_latestSpanEventTimes$574_value : List[Long] = var_$462
var var_latestSpanEventTimes$574_init : Boolean = true
var var_latestSpanEventTimes$574_error : Throwable = null
var var_latestSpanEventTimes$574_unknown : Boolean = false
var var_$580_changed : Boolean = false
var var_$580_lastValue : List[Long] = List[Long]()
var var_$580_lastInit : Boolean = false
var var_$580_lastError : Throwable = null
var var_$580_unknown : Boolean = false
var var_$580_error : Throwable = null
var var_$580_value : List[Long] = List[Long]()
var var_$580_init : Boolean = false
var var_$580_ts : Long = 0L
var var_$561_changed : Boolean = false
var var_$561_unknown : Boolean = false
var var_$561_error : Throwable = null
var var_$561_value : Long = 0L
var var_$561_init : Boolean = false
var var_$560_changed : Boolean = false
var var_$560_unknown : Boolean = false
var var_$560_error : Throwable = null
var var_$560_value : Boolean = false
var var_$560_init : Boolean = false
var var_$615_changed : Boolean = false
var var_$615_unknown : Boolean = false
var var_$615_error : Throwable = null
var var_$615_value : Long = 0L
var var_$615_init : Boolean = false
var var_$598_changed : Boolean = false
var var_$598_unknown : Boolean = false
var var_$598_error : Throwable = null
var var_$598_value : Long = 0L
var var_$598_init : Boolean = false
var var_$605_changed : Boolean = false
var var_$605_error : Throwable = null
var var_$605_unknown : Boolean = false
var var_safeDelay$609_changed : Boolean = false
val var_safeDelay$609_error : Throwable = null
var var_safeDelay$609_unknown : Boolean = false
var var_$607_changed : Boolean = false
var var_$607_error : Throwable = null
var var_$607_unknown : Boolean = false
var var_mergeUnit2$604_changed : Boolean = false
var var_mergeUnit2$604_ts : Long = 0L
var var_mergeUnit2$604_unknown : Boolean = false
var var_mergeUnit2$604_error : Throwable = null
var var_$619_changed : Boolean = false
var var_$619_value : Long = 0L
var var_$619_init : Boolean = false
var var_$619_unknown : Boolean = false
var var_$619_error : Throwable = null
var var_$597_changed : Boolean = false
var var_$597_unknown : Boolean = false
var var_$597_error : Throwable = null
var var_$597_value : Boolean = false
var var_$597_init : Boolean = false
val var_$612_value : Boolean = false
val var_$612_error : Throwable = null
val var_$612_changed : Boolean = false
val var_$612_unknown : Boolean = false
var var_delayPeriod$739_changed : Boolean = true
var var_delayPeriod$739_value : Boolean = true
var var_delayPeriod$739_init : Boolean = true
var var_delayPeriod$739_error : Throwable = null
var var_delayPeriod$739_unknown : Boolean = false
var var_$539_changed : Boolean = true
var var_$539_value : Long = 9223372036854775807L
var var_$539_init : Boolean = true
var var_$539_error : Throwable = null
var var_$539_unknown : Boolean = false
var var_$794_changed : Boolean = false
var var_$794_unknown : Boolean = false
var var_$794_error : Throwable = null
var var_$794_value : Long = 0L
var var_$794_init : Boolean = false
var var_$630_changed : Boolean = false
var var_$630_unknown : Boolean = false
var var_$630_error : Throwable = null
var var_$630_value : Boolean = false
var var_$630_init : Boolean = false
var var_$627_changed : Boolean = false
var var_$627_unknown : Boolean = false
var var_$627_error : Throwable = null
var var_$627_value : Boolean = false
var var_$627_init : Boolean = false
var var_$596_changed : Boolean = false
var var_$596_unknown : Boolean = false
var var_$596_error : Throwable = null
var var_$596_value : Boolean = false
var var_$596_init : Boolean = false
val var_$492_value : (Boolean, Boolean) = (false, false)
val var_$492_error : Throwable = null
val var_$492_changed : Boolean = false
val var_$492_unknown : Boolean = false
var var_$491_changed : Boolean = true
var var_$491_value : (Boolean, Boolean) = var_$510
var var_$491_init : Boolean = true
var var_$491_error : Throwable = null
var var_$491_unknown : Boolean = false
var var_$675_changed : Boolean = true
var var_$675_value : (Boolean, Boolean) = var_$677
var var_$675_init : Boolean = true
var var_$675_error : Throwable = null
var var_$675_unknown : Boolean = false
var var_$595_changed : Boolean = false
var var_$595_unknown : Boolean = false
var var_$595_error : Throwable = null
var var_$595_value : (Boolean, Boolean) = (false, false)
var var_$595_init : Boolean = false
var var_$626_changed : Boolean = false
var var_$626_unknown : Boolean = false
var var_$626_error : Throwable = null
var var_$626_value : (Boolean, Boolean) = (false, false)
var var_$626_init : Boolean = false
var var_$559_changed : Boolean = false
var var_$559_unknown : Boolean = false
var var_$559_error : Throwable = null
var var_$559_value : (Boolean, Boolean) = (false, false)
var var_$559_init : Boolean = false
var var_$559_ts : Long = 0L
var var_$558_changed : Boolean = false
var var_$558_unknown : Boolean = false
var var_$558_error : Throwable = null
var var_$558_value : Boolean = false
var var_$558_init : Boolean = false
var var_safeDelay$480_changed : Boolean = false
val var_safeDelay$480_error : Throwable = null
var var_safeDelay$480_unknown : Boolean = false
var var_$478_changed : Boolean = false
var var_$478_error : Throwable = null
var var_$478_unknown : Boolean = false
var var_$660_changed : Boolean = false
var var_$660_unknown : Boolean = false
var var_$660_error : Throwable = null
var var_$660_value : Boolean = false
var var_$660_init : Boolean = false
var var_$662_changed : Boolean = true
var var_$662_value : Boolean = false
var var_$662_init : Boolean = true
var var_$662_error : Throwable = null
var var_$662_unknown : Boolean = false
var var_$659_changed : Boolean = false
var var_$659_unknown : Boolean = false
var var_$659_error : Throwable = null
var var_$659_value : Boolean = false
var var_$659_init : Boolean = false
var var_$449_changed : Boolean = false
var var_$449_init : Boolean = false
var var_$449_unknown : Boolean = false
var var_$449_error : Throwable = null
var var_$449_value : List[Long] = List[Long]()
var var_$448_changed : Boolean = false
var var_$448_unknown : Boolean = false
var var_$448_error : Throwable = null
var var_$448_value : Long = 0L
var var_$448_init : Boolean = false
var var_$463_changed : Boolean = true
var var_$463_value : Long = 3L
var var_$463_init : Boolean = true
var var_$463_error : Throwable = null
var var_$463_unknown : Boolean = false
var var_$447_changed : Boolean = false
var var_$447_unknown : Boolean = false
var var_$447_error : Throwable = null
var var_$447_value : Boolean = false
var var_$447_init : Boolean = false
var var_$454_changed : Boolean = false
var var_$454_init : Boolean = false
var var_$454_unknown : Boolean = false
var var_$454_error : Throwable = null
var var_$454_value : List[Long] = List[Long]()
var var_$453_changed : Boolean = false
var var_$453_unknown : Boolean = false
var var_$453_error : Throwable = null
var var_$453_value : List[Long] = List[Long]()
var var_$453_init : Boolean = false
var var_$446_changed : Boolean = false
var var_$446_unknown : Boolean = false
var var_$446_error : Throwable = null
var var_$446_value : List[Long] = List[Long]()
var var_$446_init : Boolean = false
var var_$445_changed : Boolean = false
var var_$445_unknown : Boolean = false
var var_$445_error : Throwable = null
var var_$445_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$444_changed : Boolean = true
var var_latestSpanEventTimes$444_value : List[Long] = var_$462
var var_latestSpanEventTimes$444_init : Boolean = true
var var_latestSpanEventTimes$444_error : Throwable = null
var var_latestSpanEventTimes$444_unknown : Boolean = false
var var_$504_changed : Boolean = false
var var_$504_lastValue : List[Long] = List[Long]()
var var_$504_lastInit : Boolean = false
var var_$504_lastError : Throwable = null
var var_$504_unknown : Boolean = false
var var_$504_error : Throwable = null
var var_$504_value : List[Long] = List[Long]()
var var_$504_init : Boolean = false
var var_$504_ts : Long = 0L
var var_$651_changed : Boolean = false
var var_$651_init : Boolean = false
var var_$651_unknown : Boolean = false
var var_$651_error : Throwable = null
var var_$651_value : Boolean = false
var var_$654_changed : Boolean = false
var var_$654_unknown : Boolean = false
var var_$654_error : Throwable = null
var var_$654_value : Boolean = false
var var_$654_init : Boolean = false
var var_$653_changed : Boolean = false
var var_$653_unknown : Boolean = false
var var_$653_error : Throwable = null
var var_$653_value : Boolean = false
var var_$653_init : Boolean = false
var var_isFinalFalse$650_changed : Boolean = false
var var_isFinalFalse$650_unknown : Boolean = false
var var_isFinalFalse$650_error : Throwable = null
var var_isFinalFalse$650_value : Boolean = false
var var_$667_changed : Boolean = true
var var_$667_lastValue : Boolean = false
var var_$667_lastInit : Boolean = false
var var_$667_lastError : Throwable = null
var var_$667_value : Boolean = false
var var_$667_init : Boolean = true
var var_$667_ts : Long = 0L
var var_$667_error : Throwable = null
var var_$667_unknown : Boolean = false
var var_delayPeriod$782_changed : Boolean = true
var var_delayPeriod$782_value : Long = -1L
var var_delayPeriod$782_init : Boolean = true
var var_delayPeriod$782_error : Throwable = null
var var_delayPeriod$782_unknown : Boolean = false
var var_$820_changed : Boolean = false
var var_$820_unknown : Boolean = false
var var_$820_error : Throwable = null
var var_$824_changed : Boolean = false
var var_$824_value : Boolean = false
var var_$824_error : Throwable = null
var var_$824_unknown : Boolean = false
var var_$821_changed : Boolean = false
var var_$821_value : Boolean = false
var var_$821_error : Throwable = null
var var_$821_unknown : Boolean = false
var var_isFirst$750_init : Boolean = false
var var_isFirst$750_unknown : Boolean = false
var var_isFirst$750_value : Boolean = false
var var_isFirst$750_error : Throwable = null
var var_firstEvent$749_changed : Boolean = false
var var_firstEvent$749_error : Throwable = null
var var_firstEvent$749_ts : Long = 0L
var var_firstEvent$749_unknown : Boolean = false
var var_$748_changed : Boolean = false
var var_$748_value : Long = 0L
var var_$748_unknown : Boolean = false
var var_$748_error : Throwable = null
var var_defaultTime$788_changed : Boolean = true
var var_defaultTime$788_value : Long = -1L
var var_defaultTime$788_init : Boolean = true
var var_defaultTime$788_error : Throwable = null
var var_defaultTime$788_unknown : Boolean = false
var var_$785_changed : Boolean = false
var var_$785_unknown : Boolean = false
var var_$785_error : Throwable = null
var var_$785_value : Boolean = false
var var_$785_init : Boolean = false
var var_$793_changed : Boolean = false
var var_$793_unknown : Boolean = false
var var_$793_error : Throwable = null
var var_$793_value : Long = 0L
var var_$793_init : Boolean = false
var var_$792_changed : Boolean = false
var var_$792_unknown : Boolean = false
var var_$792_error : Throwable = null
var var_$792_value : Long = 0L
var var_$792_init : Boolean = false
var var_$806_changed : Boolean = false
var var_$806_unknown : Boolean = false
var var_$806_error : Throwable = null
var var_$806_value : List[Long] = List[Long]()
var var_$806_init : Boolean = false
var var_$805_changed : Boolean = false
var var_$805_unknown : Boolean = false
var var_$805_error : Throwable = null
var var_$805_value : Long = 0L
var var_$805_init : Boolean = false
var var_$804_changed : Boolean = false
var var_$804_unknown : Boolean = false
var var_$804_error : Throwable = null
var var_$804_value : Long = 0L
var var_$804_init : Boolean = false
var var_$803_changed : Boolean = false
var var_$803_unknown : Boolean = false
var var_$803_error : Throwable = null
var var_$803_value : Long = 0L
var var_$803_init : Boolean = false
var var_$802_changed : Boolean = false
var var_$802_unknown : Boolean = false
var var_$802_error : Throwable = null
var var_$802_value : Long = 0L
var var_$802_init : Boolean = false
var var_delayPeriod$784_changed : Boolean = false
var var_delayPeriod$784_unknown : Boolean = false
var var_delayPeriod$784_error : Throwable = null
var var_delayPeriod$784_value : Long = 0L
var var_delayPeriod$784_init : Boolean = false
var var_$779_changed : Boolean = false
var var_$779_unknown : Boolean = false
var var_$779_error : Throwable = null
var var_$779_value : Long = 0L
var var_$779_init : Boolean = false
var var_$779_ts : Long = 0L
var var_$778_changed : Boolean = false
var var_$778_unknown : Boolean = false
var var_$778_error : Throwable = null
var var_$778_value : Boolean = false
var var_$778_init : Boolean = false
var var_$818_changed : Boolean = false
var var_$818_value : Long = 0L
var var_$818_init : Boolean = false
var var_$818_unknown : Boolean = false
var var_$818_error : Throwable = null
var var_$815_changed : Boolean = false
var var_$815_unknown : Boolean = false
var var_$815_error : Throwable = null
var var_$815_value : Long = 0L
var var_$815_init : Boolean = false
var var_$690_changed : Boolean = false
var var_$690_unknown : Boolean = false
var var_$690_error : Throwable = null
var var_$690_value : Long = 0L
var var_$431_changed : Boolean = false
var var_$431_unknown : Boolean = false
var var_$431_error : Throwable = null
var var_$431_value : Long = 0L
var var_$431_init : Boolean = false
var var_$430_changed : Boolean = false
var var_$430_unknown : Boolean = false
var var_$430_error : Throwable = null
var var_$430_value : Boolean = false
var var_$430_init : Boolean = false
var var_$469_changed : Boolean = false
var var_$469_unknown : Boolean = false
var var_$469_error : Throwable = null
var var_$469_value : Long = 0L
var var_$469_init : Boolean = false
var var_$472_changed : Boolean = true
var var_$472_value : Long = 10L
var var_$472_init : Boolean = true
var var_$472_error : Throwable = null
var var_$472_unknown : Boolean = false
var var_$468_changed : Boolean = false
var var_$468_unknown : Boolean = false
var var_$468_error : Throwable = null
var var_$468_value : Long = 0L
var var_$468_init : Boolean = false
var var_mergeUnit2$475_changed : Boolean = false
var var_mergeUnit2$475_ts : Long = 0L
var var_mergeUnit2$475_unknown : Boolean = false
var var_mergeUnit2$475_error : Throwable = null
var var_$474_changed : Boolean = false
var var_$474_value : Long = 0L
var var_$474_init : Boolean = false
var var_$474_unknown : Boolean = false
var var_$474_error : Throwable = null
var var_$467_changed : Boolean = false
var var_$467_unknown : Boolean = false
var var_$467_error : Throwable = null
var var_$467_value : Boolean = false
var var_$467_init : Boolean = false
var var_$502_changed : Boolean = false
var var_$502_unknown : Boolean = false
var var_$502_error : Throwable = null
var var_$502_value : Long = 0L
var var_$502_init : Boolean = false
var var_$501_changed : Boolean = false
var var_$501_unknown : Boolean = false
var var_$501_error : Throwable = null
var var_$501_value : Boolean = false
var var_$501_init : Boolean = false
var var_$498_changed : Boolean = false
var var_$498_unknown : Boolean = false
var var_$498_error : Throwable = null
var var_$498_value : Boolean = false
var var_$498_init : Boolean = false
var var_$466_changed : Boolean = false
var var_$466_unknown : Boolean = false
var var_$466_error : Throwable = null
var var_$466_value : Boolean = false
var var_$466_init : Boolean = false
var var_$465_changed : Boolean = false
var var_$465_unknown : Boolean = false
var var_$465_error : Throwable = null
var var_$465_value : (Boolean, Boolean) = (false, false)
var var_$465_init : Boolean = false
var var_$497_changed : Boolean = false
var var_$497_unknown : Boolean = false
var var_$497_error : Throwable = null
var var_$497_value : (Boolean, Boolean) = (false, false)
var var_$497_init : Boolean = false
var var_$429_changed : Boolean = false
var var_$429_unknown : Boolean = false
var var_$429_error : Throwable = null
var var_$429_value : (Boolean, Boolean) = (false, false)
var var_$429_init : Boolean = false
var var_$429_ts : Long = 0L
var var_$516_changed : Boolean = false
var var_$516_unknown : Boolean = false
var var_$516_error : Throwable = null
var var_$516_value : Boolean = false
var var_$516_init : Boolean = false
var var_$530_changed : Boolean = false
var var_$530_unknown : Boolean = false
var var_$530_error : Throwable = null
var var_$530_value : Boolean = false
var var_$530_init : Boolean = false
var var_$644_changed : Boolean = false
var var_$644_unknown : Boolean = false
var var_$644_error : Throwable = null
var var_$644_value : Boolean = false
var var_$644_init : Boolean = false
var var_$557_changed : Boolean = false
var var_$557_unknown : Boolean = false
var var_$557_error : Throwable = null
var var_$557_value : Boolean = false
var var_$557_init : Boolean = false
var var_prev$648_changed : Boolean = false
var var_prev$648_init : Boolean = false
var var_prev$648_unknown : Boolean = false
var var_prev$648_error : Throwable = null
var var_prev$648_value : Boolean = false
var var_$647_changed : Boolean = false
var var_$647_unknown : Boolean = false
var var_$647_error : Throwable = null
var var_$647_value : Boolean = false
var var_$647_init : Boolean = false
var var_$556_changed : Boolean = false
var var_$556_unknown : Boolean = false
var var_$556_error : Throwable = null
var var_$556_value : Boolean = false
var var_$556_init : Boolean = false
var var_$670_changed : Boolean = false
var var_$670_value : Long = 0L
var var_$670_init : Boolean = false
var var_$670_unknown : Boolean = false
var var_$670_error : Throwable = null
var var_$665_changed : Boolean = false
var var_$665_init : Boolean = false
var var_$665_unknown : Boolean = false
var var_$665_error : Throwable = null
var var_$665_value : Long = 0L
var var_finalFalseSince$555_changed : Boolean = false
var var_finalFalseSince$555_unknown : Boolean = false
var var_finalFalseSince$555_error : Throwable = null
var var_finalFalseSince$555_value : Long = 0L
var var_$554_changed : Boolean = true
var var_$554_lastValue : Long = 0L
var var_$554_lastInit : Boolean = false
var var_$554_lastError : Throwable = null
var var_$554_value : Long = 9223372036854775807L
var var_$554_init : Boolean = true
var var_$554_ts : Long = 0L
var var_$554_error : Throwable = null
var var_$554_unknown : Boolean = false
var var_$553_changed : Boolean = false
var var_$553_unknown : Boolean = false
var var_$553_error : Throwable = null
var var_$553_value : Long = 0L
var var_$553_init : Boolean = false
var var_$552_changed : Boolean = false
var var_$552_unknown : Boolean = false
var var_$552_error : Throwable = null
var var_$552_value : Boolean = false
var var_$552_init : Boolean = false
var var_$752_changed : Boolean = false
var var_$752_unknown : Boolean = false
var var_$752_error : Throwable = null
var var_$752_value : Long = 0L
var var_$752_init : Boolean = false
var var_$751_changed : Boolean = false
var var_$751_unknown : Boolean = false
var var_$751_error : Throwable = null
var var_$751_value : Long = 0L
var var_$751_init : Boolean = false
var var_$515_changed : Boolean = false
var var_$515_unknown : Boolean = false
var var_$515_error : Throwable = null
var var_$515_value : Boolean = false
var var_$515_init : Boolean = false
var var_$765_changed : Boolean = false
var var_$765_unknown : Boolean = false
var var_$765_error : Throwable = null
var var_$765_value : List[Long] = List[Long]()
var var_$765_init : Boolean = false
var var_$526_changed : Boolean = false
var var_$526_unknown : Boolean = false
var var_$526_error : Throwable = null
var var_$526_value : Boolean = false
var var_$526_init : Boolean = false
var var_$427_changed : Boolean = false
var var_$427_unknown : Boolean = false
var var_$427_error : Throwable = null
var var_$427_value : Boolean = false
var var_$427_init : Boolean = false
var var_$522_changed : Boolean = false
var var_$522_init : Boolean = false
var var_$522_unknown : Boolean = false
var var_$522_error : Throwable = null
var var_$522_value : Boolean = false
var var_$525_changed : Boolean = false
var var_$525_unknown : Boolean = false
var var_$525_error : Throwable = null
var var_$525_value : Boolean = false
var var_$525_init : Boolean = false
var var_$524_changed : Boolean = false
var var_$524_unknown : Boolean = false
var var_$524_error : Throwable = null
var var_$524_value : Boolean = false
var var_$524_init : Boolean = false
var var_isFinalFalse$521_changed : Boolean = false
var var_isFinalFalse$521_unknown : Boolean = false
var var_isFinalFalse$521_error : Throwable = null
var var_isFinalFalse$521_value : Boolean = false
var var_isFinalFalseReset$545_changed : Boolean = true
var var_isFinalFalseReset$545_lastValue : Boolean = false
var var_isFinalFalseReset$545_lastInit : Boolean = false
var var_isFinalFalseReset$545_lastError : Throwable = null
var var_isFinalFalseReset$545_value : Boolean = false
var var_isFinalFalseReset$545_init : Boolean = true
var var_isFinalFalseReset$545_ts : Long = 0L
var var_isFinalFalseReset$545_error : Throwable = null
var var_isFinalFalseReset$545_unknown : Boolean = false
var var_prev$519_changed : Boolean = false
var var_prev$519_init : Boolean = false
var var_prev$519_unknown : Boolean = false
var var_prev$519_error : Throwable = null
var var_prev$519_value : Boolean = false
var var_$518_changed : Boolean = false
var var_$518_unknown : Boolean = false
var var_$518_error : Throwable = null
var var_$518_value : Boolean = false
var var_$518_init : Boolean = false
var var_$426_changed : Boolean = false
var var_$426_unknown : Boolean = false
var var_$426_error : Throwable = null
var var_$426_value : Boolean = false
var var_$426_init : Boolean = false
var var_$535_changed : Boolean = false
var var_$535_value : Long = 0L
var var_$535_init : Boolean = false
var var_$535_unknown : Boolean = false
var var_$535_error : Throwable = null
var var_$536_changed : Boolean = false
var var_$536_init : Boolean = false
var var_$536_unknown : Boolean = false
var var_$536_error : Throwable = null
var var_$536_value : Long = 0L
var var_finalFalseSince$425_changed : Boolean = false
var var_finalFalseSince$425_unknown : Boolean = false
var var_finalFalseSince$425_error : Throwable = null
var var_finalFalseSince$425_value : Long = 0L
var var_$424_changed : Boolean = true
var var_$424_lastValue : Long = 0L
var var_$424_lastInit : Boolean = false
var var_$424_lastError : Throwable = null
var var_$424_value : Long = 9223372036854775807L
var var_$424_init : Boolean = true
var var_$424_ts : Long = 0L
var var_$424_error : Throwable = null
var var_$424_unknown : Boolean = false
var var_$423_changed : Boolean = false
var var_$423_unknown : Boolean = false
var var_$423_error : Throwable = null
var var_$423_value : Long = 0L
var var_$423_init : Boolean = false
var var_$764_changed : Boolean = false
var var_$764_unknown : Boolean = false
var var_$764_error : Throwable = null
var var_$764_value : Long = 0L
var var_$764_init : Boolean = false
var var_$763_changed : Boolean = false
var var_$763_unknown : Boolean = false
var var_$763_error : Throwable = null
var var_$763_value : Long = 0L
var var_$763_init : Boolean = false
var var_$762_changed : Boolean = false
var var_$762_unknown : Boolean = false
var var_$762_error : Throwable = null
var var_$762_value : Long = 0L
var var_$762_init : Boolean = false
var var_$761_changed : Boolean = false
var var_$761_unknown : Boolean = false
var var_$761_error : Throwable = null
var var_$761_value : Long = 0L
var var_$761_init : Boolean = false
var var_delayPeriod$743_changed : Boolean = false
var var_delayPeriod$743_unknown : Boolean = false
var var_delayPeriod$743_error : Throwable = null
var var_delayPeriod$743_value : Long = 0L
var var_delayPeriod$743_init : Boolean = false
var var_$738_changed : Boolean = false
var var_$738_unknown : Boolean = false
var var_$738_error : Throwable = null
var var_$738_value : Long = 0L
var var_$738_init : Boolean = false
var var_$738_ts : Long = 0L
var var_$737_changed : Boolean = false
var var_$737_unknown : Boolean = false
var var_$737_error : Throwable = null
var var_$737_value : Boolean = false
var var_$737_init : Boolean = false
var var_$422_changed : Boolean = false
var var_$422_unknown : Boolean = false
var var_$422_error : Throwable = null
var var_$422_value : Boolean = false
var var_$422_init : Boolean = false
var var_isFinalFalseReset$421_changed : Boolean = false
var var_isFinalFalseReset$421_unknown : Boolean = false
var var_isFinalFalseReset$421_error : Throwable = null
var var_isFinalFalseReset$421_value : Boolean = false
var var_$420_changed : Boolean = false
var var_$420_lastValue : Boolean = false
var var_$420_lastInit : Boolean = false
var var_$420_lastError : Throwable = null
var var_$420_init : Boolean = false
var var_$420_ts : Long = 0L
var var_$420_unknown : Boolean = false
var var_$420_value : Boolean = false
var var_$420_error : Throwable = null
var var_$777_changed : Boolean = false
var var_$777_value : Long = 0L
var var_$777_init : Boolean = false
var var_$777_unknown : Boolean = false
var var_$777_error : Throwable = null
var var_$774_changed : Boolean = false
var var_$774_unknown : Boolean = false
var var_$774_error : Throwable = null
var var_$774_value : Long = 0L
var var_$774_init : Boolean = false
var var_$681_changed : Boolean = false
var var_$681_unknown : Boolean = false
var var_$681_error : Throwable = null
var var_$681_value : Long = 0L
var var_isFinalFalseReset$551_changed : Boolean = false
var var_isFinalFalseReset$551_unknown : Boolean = false
var var_isFinalFalseReset$551_error : Throwable = null
var var_isFinalFalseReset$551_value : Boolean = false
var var_$550_changed : Boolean = false
var var_$550_lastValue : Boolean = false
var var_$550_lastInit : Boolean = false
var var_$550_lastError : Throwable = null
var var_$550_init : Boolean = false
var var_$550_ts : Long = 0L
var var_$550_unknown : Boolean = false
var var_$550_value : Boolean = false
var var_$550_error : Throwable = null
var var_stillFulfillableReset$549_changed : Boolean = false
var var_stillFulfillableReset$549_unknown : Boolean = false
var var_stillFulfillableReset$549_error : Throwable = null
var var_stillFulfillableReset$549_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$549_init : Boolean = false
var var_stillFulfillableReset$419_changed : Boolean = false
var var_stillFulfillableReset$419_unknown : Boolean = false
var var_stillFulfillableReset$419_error : Throwable = null
var var_stillFulfillableReset$419_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$419_init : Boolean = false
var var_burstConstraintReset$418_changed : Boolean = false
var var_burstConstraintReset$418_unknown : Boolean = false
var var_burstConstraintReset$418_error : Throwable = null
var var_burstConstraintReset$418_value : (Boolean, Boolean) = (false, false)
var var_burstConstraintReset$418_init : Boolean = false
var var_safeDelay$609_nextTs : Long = -1L
var var_safeDelay$480_nextTs : Long = -1L

def chunk1() = {
var_$746_changed = false
if ((var_event_changed)) {
var_$746_value = var_event_ts
var_$746_init = true
var_$746_unknown = var_event_unknown
if ((var_$746_unknown)) {
var_$746_error = var_event_error
} else {
var_$746_error = null
}
var_$746_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$745_changed = false
}
if ((var_$746_changed)) {
var_defaultTime$745_value = var_$746_value
var_defaultTime$745_init = true
var_defaultTime$745_error = var_$746_error
var_defaultTime$745_changed = true
var_defaultTime$745_unknown = var_$746_unknown
}
if ((!(currTs == 0L))) {
var_$566_changed = false
}
if ((var_$594_changed)) {
var_$566_value = var_$594_value
var_$566_init = true
var_$566_error = var_$594_error
var_$566_changed = true
var_$566_unknown = var_$594_unknown
}
var_latestSpanEventTimes$433_changed = false
if ((var_defaultTime$745_init && var_$566_init)) {
if ((var_defaultTime$745_changed) || (var_$566_changed)) {
var_latestSpanEventTimes$433_unknown = (var_defaultTime$745_unknown && var_$566_unknown)
if ((var_latestSpanEventTimes$433_unknown)) {
var_latestSpanEventTimes$433_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$433_error = null
try {
var_latestSpanEventTimes$433_value = ((if((var_defaultTime$745_error == null)) {var_defaultTime$745_value} else {throw var_defaultTime$745_error}) == (if((var_$566_error == null)) {var_$566_value} else {throw var_$566_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$433_error = var_err
}
}
}
var_latestSpanEventTimes$433_init = true
var_latestSpanEventTimes$433_changed = true
}
}
if ((!(currTs == 0L))) {
var_$569_changed = false
}
if ((var_$440_changed)) {
var_$569_value = var_$440_value
var_$569_init = true
var_$569_error = var_$440_error
var_$569_changed = true
var_$569_unknown = var_$440_unknown
}
var_latestSpanEventTimes$438_changed = false
if ((var_$569_init && var_defaultTime$745_init)) {
if ((var_$569_changed) || (var_defaultTime$745_changed)) {
var_latestSpanEventTimes$438_unknown = (var_$569_unknown && var_defaultTime$745_unknown)
if ((var_latestSpanEventTimes$438_unknown)) {
var_latestSpanEventTimes$438_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$438_error = null
try {
var_latestSpanEventTimes$438_value = ((if((var_$569_error == null)) {var_$569_value} else {throw var_$569_error}) :+ (if((var_defaultTime$745_error == null)) {var_defaultTime$745_value} else {throw var_defaultTime$745_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$438_error = var_err
}
}
}
var_latestSpanEventTimes$438_init = true
var_latestSpanEventTimes$438_changed = true
}
}
var_$588_changed = false
if ((var_event_changed)) {
if ((var_$580_ts == currTs && var_$580_lastInit) || (!(var_$580_ts == currTs) && var_$580_init)) {
var_$588_changed = true
var_$588_init = true
var_$588_unknown = var_event_unknown
if ((var_$588_unknown)) {
var_$588_error = var_event_error
} else {
if ((var_$580_ts == currTs)) {
var_$588_value = var_$580_lastValue
var_$588_error = var_$580_lastError
} else {
var_$588_value = var_$580_value
var_$588_error = var_$580_error
}
}
}
}
var_$578_changed = false
if ((var_$588_init)) {
if ((var_$588_changed)) {
var_$578_unknown = (var_$588_unknown)
if ((var_$578_unknown)) {
var_$578_error = UnknownEventError(null)
} else {
var_$578_error = null
try {
var_$578_value = (if((var_$588_error == null)) {var_$588_value} else {throw var_$588_error}).size
} catch {
case var_err : Throwable => {
var_$578_error = var_err
}
}
}
var_$578_init = true
var_$578_changed = true
}
}
if ((!(currTs == 0L))) {
var_$800_changed = false
}
if ((var_$594_changed)) {
var_$800_value = var_$594_value
var_$800_init = true
var_$800_error = var_$594_error
var_$800_changed = true
var_$800_unknown = var_$594_unknown
}
var_$577_changed = false
if ((var_$578_init && var_$800_init)) {
if ((var_$578_changed) || (var_$800_changed)) {
var_$577_unknown = (var_$578_unknown && var_$800_unknown)
if ((var_$577_unknown)) {
var_$577_error = UnknownEventError(null)
} else {
var_$577_error = null
try {
var_$577_value = ((if((var_$578_error == null)) {var_$578_value} else {throw var_$578_error}) > (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$577_error = var_err
}
}
}
var_$577_init = true
var_$577_changed = true
}
}
var_$584_changed = false
if ((var_defaultTime$745_changed)) {
if ((var_$580_ts == currTs && var_$580_lastInit) || (!(var_$580_ts == currTs) && var_$580_init)) {
var_$584_changed = true
var_$584_init = true
var_$584_unknown = var_defaultTime$745_unknown
if ((var_$584_unknown)) {
var_$584_error = var_defaultTime$745_error
} else {
if ((var_$580_ts == currTs)) {
var_$584_value = var_$580_lastValue
var_$584_error = var_$580_lastError
} else {
var_$584_value = var_$580_value
var_$584_error = var_$580_error
}
}
}
}
var_$583_changed = false
if ((var_$584_init)) {
if ((var_$584_changed)) {
var_$583_unknown = (var_$584_unknown)
if ((var_$583_unknown)) {
var_$583_error = UnknownEventError(null)
} else {
var_$583_error = null
try {
var_$583_value = (if((var_$584_error == null)) {var_$584_value} else {throw var_$584_error}).tail
} catch {
case var_err : Throwable => {
var_$583_error = var_err
}
}
}
var_$583_init = true
var_$583_changed = true
}
}
var_$576_changed = false
if ((var_$577_init && var_$583_init && var_$588_init)) {
if ((var_$577_changed) || (var_$583_changed) || (var_$588_changed)) {
var_$576_unknown = (var_$577_unknown && var_$583_unknown && var_$588_unknown)
if ((var_$576_unknown)) {
var_$576_error = UnknownEventError(null)
} else {
var_$576_error = null
try {
var_$576_value = (if ((if((var_$577_error == null)) {var_$577_value} else {throw var_$577_error})) (if((var_$583_error == null)) {var_$583_value} else {throw var_$583_error}) else (if((var_$588_error == null)) {var_$588_value} else {throw var_$588_error}))
} catch {
case var_err : Throwable => {
var_$576_error = var_err
}
}
}
var_$576_init = true
var_$576_changed = true
}
}
var_$575_changed = false
if ((var_$576_init && var_defaultTime$745_init)) {
if ((var_$576_changed) || (var_defaultTime$745_changed)) {
var_$575_unknown = (var_$576_unknown && var_defaultTime$745_unknown)
if ((var_$575_unknown)) {
var_$575_error = UnknownEventError(null)
} else {
var_$575_error = null
try {
var_$575_value = ((if((var_$576_error == null)) {var_$576_value} else {throw var_$576_error}) :+ (if((var_defaultTime$745_error == null)) {var_defaultTime$745_value} else {throw var_defaultTime$745_error}))
} catch {
case var_err : Throwable => {
var_$575_error = var_err
}
}
}
var_$575_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$574_changed = false
}
if ((var_$575_changed)) {
var_latestSpanEventTimes$574_value = var_$575_value
var_latestSpanEventTimes$574_init = true
var_latestSpanEventTimes$574_error = var_$575_error
var_latestSpanEventTimes$574_changed = true
var_latestSpanEventTimes$574_unknown = var_$575_unknown
}
var_$580_changed = false
if ((var_latestSpanEventTimes$433_init && var_latestSpanEventTimes$438_init && var_latestSpanEventTimes$574_init)) {
if ((var_latestSpanEventTimes$433_changed) || (var_latestSpanEventTimes$438_changed) || (var_latestSpanEventTimes$574_changed)) {
var_$580_lastValue = var_$580_value
var_$580_lastInit = var_$580_init
var_$580_lastError = var_$580_error
var_$580_unknown = (var_latestSpanEventTimes$433_unknown && var_latestSpanEventTimes$438_unknown && var_latestSpanEventTimes$574_unknown)
if ((var_$580_unknown)) {
var_$580_error = UnknownEventError(null)
} else {
var_$580_error = null
try {
var_$580_value = (if ((if((var_latestSpanEventTimes$433_error == null)) {var_latestSpanEventTimes$433_value} else {throw var_latestSpanEventTimes$433_error})) (if((var_latestSpanEventTimes$438_error == null)) {var_latestSpanEventTimes$438_value} else {throw var_latestSpanEventTimes$438_error}) else (if((var_latestSpanEventTimes$574_error == null)) {var_latestSpanEventTimes$574_value} else {throw var_latestSpanEventTimes$574_error}))
} catch {
case var_err : Throwable => {
var_$580_error = var_err
}
}
}
var_$580_init = true
var_$580_ts = currTs
var_$580_changed = true
}
}
var_$561_changed = false
if ((var_$580_init)) {
if ((var_$580_changed)) {
var_$561_unknown = (var_$580_unknown)
if ((var_$561_unknown)) {
var_$561_error = UnknownEventError(null)
} else {
var_$561_error = null
try {
var_$561_value = (if((var_$580_error == null)) {var_$580_value} else {throw var_$580_error}).size
} catch {
case var_err : Throwable => {
var_$561_error = var_err
}
}
}
var_$561_init = true
var_$561_changed = true
}
}
var_$560_changed = false
if ((var_$561_init && var_$800_init)) {
if ((var_$561_changed) || (var_$800_changed)) {
var_$560_unknown = (var_$561_unknown && var_$800_unknown)
if ((var_$560_unknown)) {
var_$560_error = UnknownEventError(null)
} else {
var_$560_error = null
try {
var_$560_value = ((if((var_$561_error == null)) {var_$561_value} else {throw var_$561_error}) > (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$560_error = var_err
}
}
}
var_$560_init = true
var_$560_changed = true
}
}
var_$615_changed = false
if ((var_$580_init)) {
if ((var_$580_changed)) {
var_$615_unknown = (var_$580_unknown)
if ((var_$615_unknown)) {
var_$615_error = UnknownEventError(null)
} else {
var_$615_error = null
try {
var_$615_value = (var_head$471.apply(((if((var_$580_error == null)) {var_$580_value} else {throw var_$580_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$615_error = var_err
}
}
}
var_$615_init = true
var_$615_changed = true
}
}
var_$598_changed = false
if ((var_$615_init && var_$566_init)) {
if ((var_$615_changed) || (var_$566_changed)) {
var_$598_unknown = (var_$615_unknown && var_$566_unknown)
if ((var_$598_unknown)) {
var_$598_error = UnknownEventError(null)
} else {
var_$598_error = null
try {
var_$598_value = ((if((var_$615_error == null)) {var_$615_value} else {throw var_$615_error}) + (if((var_$566_error == null)) {var_$566_value} else {throw var_$566_error}))
} catch {
case var_err : Throwable => {
var_$598_error = var_err
}
}
}
var_$598_init = true
var_$598_changed = true
}
}
var_$605_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$605_error = UnknownEventError(var_event_error)
} else {
var_$605_error = null
}
var_$605_changed = var_event_changed
var_$605_unknown = var_event_unknown
}
var_safeDelay$609_changed = false
if ((var_safeDelay$609_nextTs == currTs)) {
var_safeDelay$609_changed = true
var_safeDelay$609_unknown = false
}
var_$607_changed = false
if ((var_safeDelay$609_changed)) {
if ((var_safeDelay$609_unknown)) {
var_$607_error = UnknownEventError(var_safeDelay$609_error)
} else {
var_$607_error = null
}
var_$607_changed = var_safeDelay$609_changed
var_$607_unknown = var_safeDelay$609_unknown
}
var_mergeUnit2$604_changed = false
if ((var_$605_changed) || (var_$607_changed)) {
var_mergeUnit2$604_ts = currTs
var_mergeUnit2$604_changed = true
var_mergeUnit2$604_unknown = (var_$605_unknown && var_$607_unknown)
if ((var_$605_changed)) {
var_mergeUnit2$604_error = var_$605_error
} else {
if ((var_$607_changed)) {
var_mergeUnit2$604_error = var_$607_error
}
}
}
var_$619_changed = false
if ((var_mergeUnit2$604_changed)) {
var_$619_value = var_mergeUnit2$604_ts
var_$619_init = true
var_$619_unknown = var_mergeUnit2$604_unknown
if ((var_$619_unknown)) {
var_$619_error = var_mergeUnit2$604_error
} else {
var_$619_error = null
}
var_$619_changed = true
}
var_$597_changed = false
if ((var_$598_init && var_$619_init)) {
if ((var_$598_changed) || (var_$619_changed)) {
var_$597_unknown = (var_$598_unknown && var_$619_unknown)
if ((var_$597_unknown)) {
var_$597_error = UnknownEventError(null)
} else {
var_$597_error = null
try {
var_$597_value = ((if((var_$598_error == null)) {var_$598_value} else {throw var_$598_error}) <= (if((var_$619_error == null)) {var_$619_value} else {throw var_$619_error}))
} catch {
case var_err : Throwable => {
var_$597_error = var_err
}
}
}
var_$597_init = true
var_$597_changed = true
}
}
if ((!(currTs == 0L))) {
var_delayPeriod$739_changed = false
}
if ((var_$612_changed)) {
var_delayPeriod$739_value = var_$612_value
var_delayPeriod$739_init = true
var_delayPeriod$739_error = var_$612_error
var_delayPeriod$739_changed = true
var_delayPeriod$739_unknown = var_$612_unknown
}
if ((!(currTs == 0L))) {
var_$539_changed = false
}
if ((var_$594_changed)) {
var_$539_value = var_$594_value
var_$539_init = true
var_$539_error = var_$594_error
var_$539_changed = true
var_$539_unknown = var_$594_unknown
}
var_$794_changed = false
if ((var_$615_init && var_$539_init)) {
if ((var_$615_changed) || (var_$539_changed)) {
var_$794_unknown = (var_$615_unknown && var_$539_unknown)
if ((var_$794_unknown)) {
var_$794_error = UnknownEventError(null)
} else {
var_$794_error = null
try {
var_$794_value = ((if((var_$615_error == null)) {var_$615_value} else {throw var_$615_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$794_error = var_err
}
}
}
var_$794_init = true
var_$794_changed = true
}
}
var_$630_changed = false
if ((var_$794_init && var_$619_init)) {
if ((var_$794_changed) || (var_$619_changed)) {
var_$630_unknown = (var_$794_unknown && var_$619_unknown)
if ((var_$630_unknown)) {
var_$630_error = UnknownEventError(null)
} else {
var_$630_error = null
try {
var_$630_value = ((if((var_$794_error == null)) {var_$794_value} else {throw var_$794_error}) >= (if((var_$619_error == null)) {var_$619_value} else {throw var_$619_error}))
} catch {
case var_err : Throwable => {
var_$630_error = var_err
}
}
}
var_$630_init = true
var_$630_changed = true
}
}
var_$627_changed = false
if ((var_delayPeriod$739_init && var_$630_init)) {
if ((var_delayPeriod$739_changed) || (var_$630_changed)) {
var_$627_unknown = (var_delayPeriod$739_unknown && var_$630_unknown)
if ((var_$627_unknown)) {
var_$627_error = UnknownEventError(null)
} else {
var_$627_error = null
try {
var_$627_value = ((if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error}) || (if((var_$630_error == null)) {var_$630_value} else {throw var_$630_error}))
} catch {
case var_err : Throwable => {
var_$627_error = var_err
}
}
}
var_$627_init = true
var_$627_changed = true
}
}
var_$596_changed = false
if ((var_$597_init && var_$627_init)) {
if ((var_$597_changed) || (var_$627_changed)) {
var_$596_unknown = (var_$597_unknown && var_$627_unknown)
if ((var_$596_unknown)) {
var_$596_error = UnknownEventError(null)
} else {
var_$596_error = null
try {
var_$596_value = ((if((var_$597_error == null)) {var_$597_value} else {throw var_$597_error}) && (if((var_$627_error == null)) {var_$627_value} else {throw var_$627_error}))
} catch {
case var_err : Throwable => {
var_$596_error = var_err
}
}
}
var_$596_init = true
var_$596_changed = true
}
}
if ((!(currTs == 0L))) {
var_$491_changed = false
}
if ((var_$492_changed)) {
var_$491_value = var_$492_value
var_$491_init = true
var_$491_error = var_$492_error
var_$491_changed = true
var_$491_unknown = var_$492_unknown
}
if ((!(currTs == 0L))) {
var_$675_changed = false
}
if ((var_$492_changed)) {
var_$675_value = var_$492_value
var_$675_init = true
var_$675_error = var_$492_error
var_$675_changed = true
var_$675_unknown = var_$492_unknown
}
var_$595_changed = false
if ((var_$596_init && var_$491_init && var_$675_init)) {
if ((var_$596_changed) || (var_$491_changed) || (var_$675_changed)) {
var_$595_unknown = (var_$596_unknown && var_$491_unknown && var_$675_unknown)
if ((var_$595_unknown)) {
var_$595_error = UnknownEventError(null)
} else {
var_$595_error = null
try {
var_$595_value = (if ((if((var_$596_error == null)) {var_$596_value} else {throw var_$596_error})) (if((var_$491_error == null)) {var_$491_value} else {throw var_$491_error}) else (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}))
} catch {
case var_err : Throwable => {
var_$595_error = var_err
}
}
}
var_$595_init = true
var_$595_changed = true
}
}
var_$626_changed = false
if ((var_$627_init && var_$491_init && var_$675_init)) {
if ((var_$627_changed) || (var_$491_changed) || (var_$675_changed)) {
var_$626_unknown = (var_$627_unknown && var_$491_unknown && var_$675_unknown)
if ((var_$626_unknown)) {
var_$626_error = UnknownEventError(null)
} else {
var_$626_error = null
try {
var_$626_value = (if ((if((var_$627_error == null)) {var_$627_value} else {throw var_$627_error})) (if((var_$491_error == null)) {var_$491_value} else {throw var_$491_error}) else (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}))
} catch {
case var_err : Throwable => {
var_$626_error = var_err
}
}
}
var_$626_init = true
var_$626_changed = true
}
}
var_$559_changed = false
if ((var_$560_init && var_$595_init && var_$626_init)) {
if ((var_$560_changed) || (var_$595_changed) || (var_$626_changed)) {
var_$559_unknown = (var_$560_unknown && var_$595_unknown && var_$626_unknown)
if ((var_$559_unknown)) {
var_$559_error = UnknownEventError(null)
} else {
var_$559_error = null
try {
var_$559_value = (if ((if((var_$560_error == null)) {var_$560_value} else {throw var_$560_error})) (if((var_$595_error == null)) {var_$595_value} else {throw var_$595_error}) else (if((var_$626_error == null)) {var_$626_value} else {throw var_$626_error}))
} catch {
case var_err : Throwable => {
var_$559_error = var_err
}
}
}
var_$559_init = true
var_$559_ts = currTs
var_$559_changed = true
}
}
var_$558_changed = false
if ((var_$559_init)) {
if ((var_$559_changed)) {
var_$558_unknown = (var_$559_unknown)
if ((var_$558_unknown)) {
var_$558_error = UnknownEventError(null)
} else {
var_$558_error = null
try {
var_$558_value = var_$656.apply((if((var_$559_error == null)) {var_$559_value} else {throw var_$559_error}))
} catch {
case var_err : Throwable => {
var_$558_error = var_err
}
}
}
var_$558_init = true
var_$558_changed = true
}
}
var_safeDelay$480_changed = false
if ((var_safeDelay$480_nextTs == currTs)) {
var_safeDelay$480_changed = true
var_safeDelay$480_unknown = false
}
var_$478_changed = false
if ((var_safeDelay$480_changed)) {
if ((var_safeDelay$480_unknown)) {
var_$478_error = UnknownEventError(var_safeDelay$480_error)
} else {
var_$478_error = null
}
var_$478_changed = var_safeDelay$480_changed
var_$478_unknown = var_safeDelay$480_unknown
}
var_$660_changed = false
if ((var_$559_init)) {
if ((var_$559_changed)) {
var_$660_unknown = (var_$559_unknown)
if ((var_$660_unknown)) {
var_$660_error = UnknownEventError(null)
} else {
var_$660_error = null
try {
var_$660_value = var_$517.apply((if((var_$559_error == null)) {var_$559_value} else {throw var_$559_error}))
} catch {
case var_err : Throwable => {
var_$660_error = var_err
}
}
}
var_$660_init = true
var_$660_changed = true
}
}
if ((!(currTs == 0L))) {
var_$662_changed = false
}
if ((var_$612_changed)) {
var_$662_value = var_$612_value
var_$662_init = true
var_$662_error = var_$612_error
var_$662_changed = true
var_$662_unknown = var_$612_unknown
}
var_$659_changed = false
if ((var_$660_init && var_$662_init)) {
if ((var_$660_changed) || (var_$662_changed)) {
var_$659_unknown = (var_$660_unknown && var_$662_unknown)
if ((var_$659_unknown)) {
var_$659_error = UnknownEventError(null)
} else {
var_$659_error = null
try {
var_$659_value = ((if((var_$660_error == null)) {var_$660_value} else {throw var_$660_error}) == (if((var_$662_error == null)) {var_$662_value} else {throw var_$662_error}))
} catch {
case var_err : Throwable => {
var_$659_error = var_err
}
}
}
var_$659_init = true
var_$659_changed = true
}
}
var_$449_changed = false
if ((var_event_changed)) {
if ((var_$504_ts == currTs && var_$504_lastInit) || (!(var_$504_ts == currTs) && var_$504_init)) {
var_$449_changed = true
var_$449_init = true
var_$449_unknown = var_event_unknown
if ((var_$449_unknown)) {
var_$449_error = var_event_error
} else {
if ((var_$504_ts == currTs)) {
var_$449_value = var_$504_lastValue
var_$449_error = var_$504_lastError
} else {
var_$449_value = var_$504_value
var_$449_error = var_$504_error
}
}
}
}
var_$448_changed = false
if ((var_$449_init)) {
if ((var_$449_changed)) {
var_$448_unknown = (var_$449_unknown)
if ((var_$448_unknown)) {
var_$448_error = UnknownEventError(null)
} else {
var_$448_error = null
try {
var_$448_value = (if((var_$449_error == null)) {var_$449_value} else {throw var_$449_error}).size
} catch {
case var_err : Throwable => {
var_$448_error = var_err
}
}
}
var_$448_init = true
var_$448_changed = true
}
}
if ((!(currTs == 0L))) {
var_$463_changed = false
}
if ((var_$594_changed)) {
var_$463_value = var_$594_value
var_$463_init = true
var_$463_error = var_$594_error
var_$463_changed = true
var_$463_unknown = var_$594_unknown
}
var_$447_changed = false
if ((var_$448_init && var_$463_init)) {
if ((var_$448_changed) || (var_$463_changed)) {
var_$447_unknown = (var_$448_unknown && var_$463_unknown)
if ((var_$447_unknown)) {
var_$447_error = UnknownEventError(null)
} else {
var_$447_error = null
try {
var_$447_value = ((if((var_$448_error == null)) {var_$448_value} else {throw var_$448_error}) > (if((var_$463_error == null)) {var_$463_value} else {throw var_$463_error}))
} catch {
case var_err : Throwable => {
var_$447_error = var_err
}
}
}
var_$447_init = true
var_$447_changed = true
}
}
var_$454_changed = false
if ((var_defaultTime$745_changed)) {
if ((var_$504_ts == currTs && var_$504_lastInit) || (!(var_$504_ts == currTs) && var_$504_init)) {
var_$454_changed = true
var_$454_init = true
var_$454_unknown = var_defaultTime$745_unknown
if ((var_$454_unknown)) {
var_$454_error = var_defaultTime$745_error
} else {
if ((var_$504_ts == currTs)) {
var_$454_value = var_$504_lastValue
var_$454_error = var_$504_lastError
} else {
var_$454_value = var_$504_value
var_$454_error = var_$504_error
}
}
}
}
var_$453_changed = false
if ((var_$454_init)) {
if ((var_$454_changed)) {
var_$453_unknown = (var_$454_unknown)
if ((var_$453_unknown)) {
var_$453_error = UnknownEventError(null)
} else {
var_$453_error = null
try {
var_$453_value = (if((var_$454_error == null)) {var_$454_value} else {throw var_$454_error}).tail
} catch {
case var_err : Throwable => {
var_$453_error = var_err
}
}
}
var_$453_init = true
var_$453_changed = true
}
}
var_$446_changed = false
if ((var_$447_init && var_$453_init && var_$449_init)) {
if ((var_$447_changed) || (var_$453_changed) || (var_$449_changed)) {
var_$446_unknown = (var_$447_unknown && var_$453_unknown && var_$449_unknown)
if ((var_$446_unknown)) {
var_$446_error = UnknownEventError(null)
} else {
var_$446_error = null
try {
var_$446_value = (if ((if((var_$447_error == null)) {var_$447_value} else {throw var_$447_error})) (if((var_$453_error == null)) {var_$453_value} else {throw var_$453_error}) else (if((var_$449_error == null)) {var_$449_value} else {throw var_$449_error}))
} catch {
case var_err : Throwable => {
var_$446_error = var_err
}
}
}
var_$446_init = true
var_$446_changed = true
}
}
var_$445_changed = false
if ((var_$446_init && var_defaultTime$745_init)) {
if ((var_$446_changed) || (var_defaultTime$745_changed)) {
var_$445_unknown = (var_$446_unknown && var_defaultTime$745_unknown)
if ((var_$445_unknown)) {
var_$445_error = UnknownEventError(null)
} else {
var_$445_error = null
try {
var_$445_value = ((if((var_$446_error == null)) {var_$446_value} else {throw var_$446_error}) :+ (if((var_defaultTime$745_error == null)) {var_defaultTime$745_value} else {throw var_defaultTime$745_error}))
} catch {
case var_err : Throwable => {
var_$445_error = var_err
}
}
}
var_$445_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$444_changed = false
}
if ((var_$445_changed)) {
var_latestSpanEventTimes$444_value = var_$445_value
var_latestSpanEventTimes$444_init = true
var_latestSpanEventTimes$444_error = var_$445_error
var_latestSpanEventTimes$444_changed = true
var_latestSpanEventTimes$444_unknown = var_$445_unknown
}
var_$504_changed = false
if ((var_latestSpanEventTimes$433_init && var_latestSpanEventTimes$438_init && var_latestSpanEventTimes$444_init)) {
if ((var_latestSpanEventTimes$433_changed) || (var_latestSpanEventTimes$438_changed) || (var_latestSpanEventTimes$444_changed)) {
var_$504_lastValue = var_$504_value
var_$504_lastInit = var_$504_init
var_$504_lastError = var_$504_error
var_$504_unknown = (var_latestSpanEventTimes$433_unknown && var_latestSpanEventTimes$438_unknown && var_latestSpanEventTimes$444_unknown)
if ((var_$504_unknown)) {
var_$504_error = UnknownEventError(null)
} else {
var_$504_error = null
try {
var_$504_value = (if ((if((var_latestSpanEventTimes$433_error == null)) {var_latestSpanEventTimes$433_value} else {throw var_latestSpanEventTimes$433_error})) (if((var_latestSpanEventTimes$438_error == null)) {var_latestSpanEventTimes$438_value} else {throw var_latestSpanEventTimes$438_error}) else (if((var_latestSpanEventTimes$444_error == null)) {var_latestSpanEventTimes$444_value} else {throw var_latestSpanEventTimes$444_error}))
} catch {
case var_err : Throwable => {
var_$504_error = var_err
}
}
}
var_$504_init = true
var_$504_ts = currTs
var_$504_changed = true
}
}
var_$651_changed = false
if ((var_$559_changed)) {
if ((var_$550_ts == currTs && var_$550_lastInit) || (!(var_$550_ts == currTs) && var_$550_init)) {
var_$651_changed = true
var_$651_init = true
var_$651_unknown = var_$559_unknown
if ((var_$651_unknown)) {
var_$651_error = var_$559_error
} else {
if ((var_$550_ts == currTs)) {
var_$651_value = var_$550_lastValue
var_$651_error = var_$550_lastError
} else {
var_$651_value = var_$550_value
var_$651_error = var_$550_error
}
}
}
}
var_$654_changed = false
if ((var_$558_init && var_delayPeriod$739_init)) {
if ((var_$558_changed) || (var_delayPeriod$739_changed)) {
var_$654_unknown = (var_$558_unknown && var_delayPeriod$739_unknown)
if ((var_$654_unknown)) {
var_$654_error = UnknownEventError(null)
} else {
var_$654_error = null
try {
var_$654_value = ((if((var_$558_error == null)) {var_$558_value} else {throw var_$558_error}) == (if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error}))
} catch {
case var_err : Throwable => {
var_$654_error = var_err
}
}
}
var_$654_init = true
var_$654_changed = true
}
}
var_$653_changed = false
if ((var_$654_init && var_$659_init)) {
if ((var_$654_changed) || (var_$659_changed)) {
var_$653_unknown = (var_$654_unknown && var_$659_unknown)
if ((var_$653_unknown)) {
var_$653_error = UnknownEventError(null)
} else {
var_$653_error = null
try {
var_$653_value = ((if((var_$654_error == null)) {var_$654_value} else {throw var_$654_error}) && (if((var_$659_error == null)) {var_$659_value} else {throw var_$659_error}))
} catch {
case var_err : Throwable => {
var_$653_error = var_err
}
}
}
var_$653_init = true
var_$653_changed = true
}
}
var_isFinalFalse$650_changed = false
if ((var_$651_init && var_$653_init)) {
if ((var_$651_changed) || (var_$653_changed)) {
var_isFinalFalse$650_unknown = (var_$651_unknown && var_$653_unknown)
if ((var_isFinalFalse$650_unknown)) {
var_isFinalFalse$650_error = UnknownEventError(null)
} else {
var_isFinalFalse$650_error = null
try {
var_isFinalFalse$650_value = ((if((var_$651_error == null)) {var_$651_value} else {throw var_$651_error}) || (if((var_$653_error == null)) {var_$653_value} else {throw var_$653_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$650_error = var_err
}
}
}
var_isFinalFalse$650_changed = true
}
}
if ((!(currTs == 0L))) {
var_$667_changed = false
}
if ((var_isFinalFalse$650_changed)) {
var_$667_lastValue = var_$667_value
var_$667_lastInit = var_$667_init
var_$667_lastError = var_$667_error
var_$667_value = var_isFinalFalse$650_value
var_$667_init = true
var_$667_ts = currTs
var_$667_error = var_isFinalFalse$650_error
var_$667_changed = true
var_$667_unknown = var_isFinalFalse$650_unknown
}
if ((!(currTs == 0L))) {
var_delayPeriod$782_changed = false
}
if ((var_$594_changed)) {
var_delayPeriod$782_value = var_$594_value
var_delayPeriod$782_init = true
var_delayPeriod$782_error = var_$594_error
var_delayPeriod$782_changed = true
var_delayPeriod$782_unknown = var_$594_unknown
}
var_$820_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$820_changed = true
var_$820_unknown = var_event_unknown
if ((var_$820_unknown)) {
var_$820_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$820_error = var_event_lastError
} else {
var_$820_error = var_event_error
}
}
}
}
var_$824_changed = false
if ((var_$820_changed)) {
var_$824_value = false
if ((var_$820_unknown)) {
var_$824_error = UnknownEventError(var_$820_error)
} else {
var_$824_error = null
}
var_$824_changed = var_$820_changed
var_$824_unknown = var_$820_unknown
}
var_$821_changed = false
if ((var_event_changed)) {
var_$821_value = true
if ((var_event_unknown)) {
var_$821_error = UnknownEventError(var_event_error)
} else {
var_$821_error = null
}
var_$821_changed = var_event_changed
var_$821_unknown = var_event_unknown
}
if ((var_$824_changed) || (var_$821_changed) || (var_$662_changed)) {
var_isFirst$750_init = true
var_isFirst$750_unknown = (var_$824_unknown && var_$821_unknown && var_$662_unknown)
if ((var_$824_changed)) {
var_isFirst$750_value = var_$824_value
var_isFirst$750_error = var_$824_error
} else {
if ((var_$821_changed)) {
var_isFirst$750_value = var_$821_value
var_isFirst$750_error = var_$821_error
} else {
if ((var_$662_changed)) {
var_isFirst$750_value = var_$662_value
var_isFirst$750_error = var_$662_error
}
}
}
}
var_firstEvent$749_changed = false
if ((var_isFirst$750_init && var_event_changed)) {
if ((var_isFirst$750_value) || (!(var_isFirst$750_error == null)) || (var_isFirst$750_unknown)) {
if ((!(var_isFirst$750_error == null))) {
var_firstEvent$749_error = var_isFirst$750_error
} else {
var_firstEvent$749_error = var_event_error
}
var_firstEvent$749_changed = true
var_firstEvent$749_ts = var_event_ts
var_firstEvent$749_unknown = (var_event_unknown || !(var_isFirst$750_error == null))
}
}
var_$748_changed = false
if ((var_firstEvent$749_changed)) {
var_$748_value = var_firstEvent$749_ts
var_$748_unknown = var_firstEvent$749_unknown
if ((var_$748_unknown)) {
var_$748_error = var_firstEvent$749_error
} else {
var_$748_error = null
}
var_$748_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$788_changed = false
}
if ((var_$748_changed)) {
var_defaultTime$788_value = var_$748_value
var_defaultTime$788_init = true
var_defaultTime$788_error = var_$748_error
var_defaultTime$788_changed = true
var_defaultTime$788_unknown = var_$748_unknown
}
var_$785_changed = false
if ((var_defaultTime$745_init && var_defaultTime$788_init)) {
if ((var_defaultTime$745_changed) || (var_defaultTime$788_changed)) {
var_$785_unknown = (var_defaultTime$745_unknown && var_defaultTime$788_unknown)
if ((var_$785_unknown)) {
var_$785_error = UnknownEventError(null)
} else {
var_$785_error = null
try {
var_$785_value = ((if((var_defaultTime$745_error == null)) {var_defaultTime$745_value} else {throw var_defaultTime$745_error}) == (if((var_defaultTime$788_error == null)) {var_defaultTime$788_value} else {throw var_defaultTime$788_error}))
} catch {
case var_err : Throwable => {
var_$785_error = var_err
}
}
}
var_$785_init = true
var_$785_changed = true
}
}
var_$793_changed = false
if ((var_$794_init && var_$746_init)) {
if ((var_$794_changed) || (var_$746_changed)) {
var_$793_unknown = (var_$794_unknown && var_$746_unknown)
if ((var_$793_unknown)) {
var_$793_error = UnknownEventError(null)
} else {
var_$793_error = null
try {
var_$793_value = ((if((var_$794_error == null)) {var_$794_value} else {throw var_$794_error}) - (if((var_$746_error == null)) {var_$746_value} else {throw var_$746_error}))
} catch {
case var_err : Throwable => {
var_$793_error = var_err
}
}
}
var_$793_init = true
var_$793_changed = true
}
}
var_$792_changed = false
if ((var_$793_init && var_$800_init)) {
if ((var_$793_changed) || (var_$800_changed)) {
var_$792_unknown = (var_$793_unknown && var_$800_unknown)
if ((var_$792_unknown)) {
var_$792_error = UnknownEventError(null)
} else {
var_$792_error = null
try {
var_$792_value = ((if((var_$793_error == null)) {var_$793_value} else {throw var_$793_error}) + (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$792_error = var_err
}
}
}
var_$792_init = true
var_$792_changed = true
}
}
var_$806_changed = false
if ((var_$580_init)) {
if ((var_$580_changed)) {
var_$806_unknown = (var_$580_unknown)
if ((var_$806_unknown)) {
var_$806_error = UnknownEventError(null)
} else {
var_$806_error = null
try {
var_$806_value = (if((var_$580_error == null)) {var_$580_value} else {throw var_$580_error}).tail
} catch {
case var_err : Throwable => {
var_$806_error = var_err
}
}
}
var_$806_init = true
var_$806_changed = true
}
}
var_$805_changed = false
if ((var_$806_init)) {
if ((var_$806_changed)) {
var_$805_unknown = (var_$806_unknown)
if ((var_$805_unknown)) {
var_$805_error = UnknownEventError(null)
} else {
var_$805_error = null
try {
var_$805_value = (var_head$471.apply(((if((var_$806_error == null)) {var_$806_value} else {throw var_$806_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$805_error = var_err
}
}
}
var_$805_init = true
var_$805_changed = true
}
}
var_$804_changed = false
if ((var_$805_init && var_$539_init)) {
if ((var_$805_changed) || (var_$539_changed)) {
var_$804_unknown = (var_$805_unknown && var_$539_unknown)
if ((var_$804_unknown)) {
var_$804_error = UnknownEventError(null)
} else {
var_$804_error = null
try {
var_$804_value = ((if((var_$805_error == null)) {var_$805_value} else {throw var_$805_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$804_error = var_err
}
}
}
var_$804_init = true
var_$804_changed = true
}
}
var_$803_changed = false
if ((var_$804_init && var_$746_init)) {
if ((var_$804_changed) || (var_$746_changed)) {
var_$803_unknown = (var_$804_unknown && var_$746_unknown)
if ((var_$803_unknown)) {
var_$803_error = UnknownEventError(null)
} else {
var_$803_error = null
try {
var_$803_value = ((if((var_$804_error == null)) {var_$804_value} else {throw var_$804_error}) - (if((var_$746_error == null)) {var_$746_value} else {throw var_$746_error}))
} catch {
case var_err : Throwable => {
var_$803_error = var_err
}
}
}
var_$803_init = true
var_$803_changed = true
}
}
var_$802_changed = false
if ((var_$803_init && var_$800_init)) {
if ((var_$803_changed) || (var_$800_changed)) {
var_$802_unknown = (var_$803_unknown && var_$800_unknown)
if ((var_$802_unknown)) {
var_$802_error = UnknownEventError(null)
} else {
var_$802_error = null
try {
var_$802_value = ((if((var_$803_error == null)) {var_$803_value} else {throw var_$803_error}) + (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$802_error = var_err
}
}
}
var_$802_init = true
var_$802_changed = true
}
}
var_delayPeriod$784_changed = false
if ((var_$785_init && var_$792_init && var_$802_init)) {
if ((var_$785_changed) || (var_$792_changed) || (var_$802_changed)) {
var_delayPeriod$784_unknown = (var_$785_unknown && var_$792_unknown && var_$802_unknown)
if ((var_delayPeriod$784_unknown)) {
var_delayPeriod$784_error = UnknownEventError(null)
} else {
var_delayPeriod$784_error = null
try {
var_delayPeriod$784_value = (if ((if((var_$785_error == null)) {var_$785_value} else {throw var_$785_error})) (if((var_$792_error == null)) {var_$792_value} else {throw var_$792_error}) else (if((var_$802_error == null)) {var_$802_value} else {throw var_$802_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$784_error = var_err
}
}
}
var_delayPeriod$784_init = true
var_delayPeriod$784_changed = true
}
}
var_$779_changed = false
if ((var_delayPeriod$739_init && var_delayPeriod$782_init && var_delayPeriod$784_init)) {
if ((var_delayPeriod$739_changed) || (var_delayPeriod$782_changed) || (var_delayPeriod$784_changed)) {
var_$779_unknown = (var_delayPeriod$739_unknown && var_delayPeriod$782_unknown && var_delayPeriod$784_unknown)
if ((var_$779_unknown)) {
var_$779_error = UnknownEventError(null)
} else {
var_$779_error = null
try {
var_$779_value = (if ((if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error})) (if((var_delayPeriod$782_error == null)) {var_delayPeriod$782_value} else {throw var_delayPeriod$782_error}) else (if((var_delayPeriod$784_error == null)) {var_delayPeriod$784_value} else {throw var_delayPeriod$784_error}))
} catch {
case var_err : Throwable => {
var_$779_error = var_err
}
}
}
var_$779_init = true
var_$779_ts = currTs
var_$779_changed = true
}
}
var_$778_changed = false
if ((var_$779_init && var_$566_init)) {
if ((var_$779_changed) || (var_$566_changed)) {
var_$778_unknown = (var_$779_unknown && var_$566_unknown)
if ((var_$778_unknown)) {
var_$778_error = UnknownEventError(null)
} else {
var_$778_error = null
try {
var_$778_value = ((if((var_$779_error == null)) {var_$779_value} else {throw var_$779_error}) > (if((var_$566_error == null)) {var_$566_value} else {throw var_$566_error}))
} catch {
case var_err : Throwable => {
var_$778_error = var_err
}
}
}
var_$778_init = true
var_$778_changed = true
}
}
var_$818_changed = false
if ((var_$779_changed)) {
var_$818_value = var_$779_ts
var_$818_init = true
var_$818_unknown = var_$779_unknown
if ((var_$818_unknown)) {
var_$818_error = var_$779_error
} else {
var_$818_error = null
}
var_$818_changed = true
}
var_$815_changed = false
if ((var_$539_init && var_$818_init)) {
if ((var_$539_changed) || (var_$818_changed)) {
var_$815_unknown = (var_$539_unknown && var_$818_unknown)
if ((var_$815_unknown)) {
var_$815_error = UnknownEventError(null)
} else {
var_$815_error = null
try {
var_$815_value = ((if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}) - (if((var_$818_error == null)) {var_$818_value} else {throw var_$818_error}))
} catch {
case var_err : Throwable => {
var_$815_error = var_err
}
}
}
var_$815_init = true
var_$815_changed = true
}
}
var_$690_changed = false
if ((var_$778_init && var_$779_init && var_$815_init)) {
if ((var_$778_changed) || (var_$779_changed) || (var_$815_changed)) {
var_$690_unknown = (var_$778_unknown && var_$779_unknown && var_$815_unknown)
if ((var_$690_unknown)) {
var_$690_error = UnknownEventError(null)
} else {
var_$690_error = null
try {
var_$690_value = (if ((if((var_$778_error == null)) {var_$778_value} else {throw var_$778_error})) (if((var_$779_error == null)) {var_$779_value} else {throw var_$779_error}) else (if((var_$815_error == null)) {var_$815_value} else {throw var_$815_error}))
} catch {
case var_err : Throwable => {
var_$690_error = var_err
}
}
}
var_$690_changed = true
}
}
var_$431_changed = false
if ((var_$504_init)) {
if ((var_$504_changed)) {
var_$431_unknown = (var_$504_unknown)
if ((var_$431_unknown)) {
var_$431_error = UnknownEventError(null)
} else {
var_$431_error = null
try {
var_$431_value = (if((var_$504_error == null)) {var_$504_value} else {throw var_$504_error}).size
} catch {
case var_err : Throwable => {
var_$431_error = var_err
}
}
}
var_$431_init = true
var_$431_changed = true
}
}
var_$430_changed = false
if ((var_$431_init && var_$463_init)) {
if ((var_$431_changed) || (var_$463_changed)) {
var_$430_unknown = (var_$431_unknown && var_$463_unknown)
if ((var_$430_unknown)) {
var_$430_error = UnknownEventError(null)
} else {
var_$430_error = null
try {
var_$430_value = ((if((var_$431_error == null)) {var_$431_value} else {throw var_$431_error}) > (if((var_$463_error == null)) {var_$463_value} else {throw var_$463_error}))
} catch {
case var_err : Throwable => {
var_$430_error = var_err
}
}
}
var_$430_init = true
var_$430_changed = true
}
}
var_$469_changed = false
if ((var_$504_init)) {
if ((var_$504_changed)) {
var_$469_unknown = (var_$504_unknown)
if ((var_$469_unknown)) {
var_$469_error = UnknownEventError(null)
} else {
var_$469_error = null
try {
var_$469_value = (var_head$471.apply(((if((var_$504_error == null)) {var_$504_value} else {throw var_$504_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$469_error = var_err
}
}
}
var_$469_init = true
var_$469_changed = true
}
}
if ((!(currTs == 0L))) {
var_$472_changed = false
}
if ((var_$594_changed)) {
var_$472_value = var_$594_value
var_$472_init = true
var_$472_error = var_$594_error
var_$472_changed = true
var_$472_unknown = var_$594_unknown
}
var_$468_changed = false
if ((var_$469_init && var_$472_init)) {
if ((var_$469_changed) || (var_$472_changed)) {
var_$468_unknown = (var_$469_unknown && var_$472_unknown)
if ((var_$468_unknown)) {
var_$468_error = UnknownEventError(null)
} else {
var_$468_error = null
try {
var_$468_value = ((if((var_$469_error == null)) {var_$469_value} else {throw var_$469_error}) + (if((var_$472_error == null)) {var_$472_value} else {throw var_$472_error}))
} catch {
case var_err : Throwable => {
var_$468_error = var_err
}
}
}
var_$468_init = true
var_$468_changed = true
}
}
var_mergeUnit2$475_changed = false
if ((var_$605_changed) || (var_$478_changed)) {
var_mergeUnit2$475_ts = currTs
var_mergeUnit2$475_changed = true
var_mergeUnit2$475_unknown = (var_$605_unknown && var_$478_unknown)
if ((var_$605_changed)) {
var_mergeUnit2$475_error = var_$605_error
} else {
if ((var_$478_changed)) {
var_mergeUnit2$475_error = var_$478_error
}
}
}
var_$474_changed = false
if ((var_mergeUnit2$475_changed)) {
var_$474_value = var_mergeUnit2$475_ts
var_$474_init = true
var_$474_unknown = var_mergeUnit2$475_unknown
if ((var_$474_unknown)) {
var_$474_error = var_mergeUnit2$475_error
} else {
var_$474_error = null
}
var_$474_changed = true
}
var_$467_changed = false
if ((var_$468_init && var_$474_init)) {
if ((var_$468_changed) || (var_$474_changed)) {
var_$467_unknown = (var_$468_unknown && var_$474_unknown)
if ((var_$467_unknown)) {
var_$467_error = UnknownEventError(null)
} else {
var_$467_error = null
try {
var_$467_value = ((if((var_$468_error == null)) {var_$468_value} else {throw var_$468_error}) <= (if((var_$474_error == null)) {var_$474_value} else {throw var_$474_error}))
} catch {
case var_err : Throwable => {
var_$467_error = var_err
}
}
}
var_$467_init = true
var_$467_changed = true
}
}
var_$502_changed = false
if ((var_$469_init && var_$539_init)) {
if ((var_$469_changed) || (var_$539_changed)) {
var_$502_unknown = (var_$469_unknown && var_$539_unknown)
if ((var_$502_unknown)) {
var_$502_error = UnknownEventError(null)
} else {
var_$502_error = null
try {
var_$502_value = ((if((var_$469_error == null)) {var_$469_value} else {throw var_$469_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$502_error = var_err
}
}
}
var_$502_init = true
var_$502_changed = true
}
}
var_$501_changed = false
if ((var_$502_init && var_$474_init)) {
if ((var_$502_changed) || (var_$474_changed)) {
var_$501_unknown = (var_$502_unknown && var_$474_unknown)
if ((var_$501_unknown)) {
var_$501_error = UnknownEventError(null)
} else {
var_$501_error = null
try {
var_$501_value = ((if((var_$502_error == null)) {var_$502_value} else {throw var_$502_error}) >= (if((var_$474_error == null)) {var_$474_value} else {throw var_$474_error}))
} catch {
case var_err : Throwable => {
var_$501_error = var_err
}
}
}
var_$501_init = true
var_$501_changed = true
}
}
var_$498_changed = false
if ((var_delayPeriod$739_init && var_$501_init)) {
if ((var_delayPeriod$739_changed) || (var_$501_changed)) {
var_$498_unknown = (var_delayPeriod$739_unknown && var_$501_unknown)
if ((var_$498_unknown)) {
var_$498_error = UnknownEventError(null)
} else {
var_$498_error = null
try {
var_$498_value = ((if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error}) || (if((var_$501_error == null)) {var_$501_value} else {throw var_$501_error}))
} catch {
case var_err : Throwable => {
var_$498_error = var_err
}
}
}
var_$498_init = true
var_$498_changed = true
}
}
var_$466_changed = false
if ((var_$467_init && var_$498_init)) {
if ((var_$467_changed) || (var_$498_changed)) {
var_$466_unknown = (var_$467_unknown && var_$498_unknown)
if ((var_$466_unknown)) {
var_$466_error = UnknownEventError(null)
} else {
var_$466_error = null
try {
var_$466_value = ((if((var_$467_error == null)) {var_$467_value} else {throw var_$467_error}) && (if((var_$498_error == null)) {var_$498_value} else {throw var_$498_error}))
} catch {
case var_err : Throwable => {
var_$466_error = var_err
}
}
}
var_$466_init = true
var_$466_changed = true
}
}
var_$465_changed = false
if ((var_$466_init && var_$491_init && var_$675_init)) {
if ((var_$466_changed) || (var_$491_changed) || (var_$675_changed)) {
var_$465_unknown = (var_$466_unknown && var_$491_unknown && var_$675_unknown)
if ((var_$465_unknown)) {
var_$465_error = UnknownEventError(null)
} else {
var_$465_error = null
try {
var_$465_value = (if ((if((var_$466_error == null)) {var_$466_value} else {throw var_$466_error})) (if((var_$491_error == null)) {var_$491_value} else {throw var_$491_error}) else (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}))
} catch {
case var_err : Throwable => {
var_$465_error = var_err
}
}
}
var_$465_init = true
var_$465_changed = true
}
}
var_$497_changed = false
if ((var_$498_init && var_$491_init && var_$675_init)) {
if ((var_$498_changed) || (var_$491_changed) || (var_$675_changed)) {
var_$497_unknown = (var_$498_unknown && var_$491_unknown && var_$675_unknown)
if ((var_$497_unknown)) {
var_$497_error = UnknownEventError(null)
} else {
var_$497_error = null
try {
var_$497_value = (if ((if((var_$498_error == null)) {var_$498_value} else {throw var_$498_error})) (if((var_$491_error == null)) {var_$491_value} else {throw var_$491_error}) else (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}))
} catch {
case var_err : Throwable => {
var_$497_error = var_err
}
}
}
var_$497_init = true
var_$497_changed = true
}
}
var_$429_changed = false
if ((var_$430_init && var_$465_init && var_$497_init)) {
if ((var_$430_changed) || (var_$465_changed) || (var_$497_changed)) {
var_$429_unknown = (var_$430_unknown && var_$465_unknown && var_$497_unknown)
if ((var_$429_unknown)) {
var_$429_error = UnknownEventError(null)
} else {
var_$429_error = null
try {
var_$429_value = (if ((if((var_$430_error == null)) {var_$430_value} else {throw var_$430_error})) (if((var_$465_error == null)) {var_$465_value} else {throw var_$465_error}) else (if((var_$497_error == null)) {var_$497_value} else {throw var_$497_error}))
} catch {
case var_err : Throwable => {
var_$429_error = var_err
}
}
}
var_$429_init = true
var_$429_ts = currTs
var_$429_changed = true
}
}
var_$516_changed = false
if ((var_$429_init)) {
if ((var_$429_changed)) {
var_$516_unknown = (var_$429_unknown)
if ((var_$516_unknown)) {
var_$516_error = UnknownEventError(null)
} else {
var_$516_error = null
try {
var_$516_value = var_$517.apply((if((var_$429_error == null)) {var_$429_value} else {throw var_$429_error}))
} catch {
case var_err : Throwable => {
var_$516_error = var_err
}
}
}
var_$516_init = true
var_$516_changed = true
}
}
var_$530_changed = false
if ((var_$516_init && var_$662_init)) {
if ((var_$516_changed) || (var_$662_changed)) {
var_$530_unknown = (var_$516_unknown && var_$662_unknown)
if ((var_$530_unknown)) {
var_$530_error = UnknownEventError(null)
} else {
var_$530_error = null
try {
var_$530_value = ((if((var_$516_error == null)) {var_$516_value} else {throw var_$516_error}) == (if((var_$662_error == null)) {var_$662_value} else {throw var_$662_error}))
} catch {
case var_err : Throwable => {
var_$530_error = var_err
}
}
}
var_$530_init = true
var_$530_changed = true
}
}
var_$644_changed = false
if ((var_$660_init)) {
if ((var_$660_changed)) {
var_$644_unknown = (var_$660_unknown)
if ((var_$644_unknown)) {
var_$644_error = UnknownEventError(null)
} else {
var_$644_error = null
try {
var_$644_value = !((if((var_$660_error == null)) {var_$660_value} else {throw var_$660_error}))
} catch {
case var_err : Throwable => {
var_$644_error = var_err
}
}
}
var_$644_init = true
var_$644_changed = true
}
}
var_$557_changed = false
if ((var_$558_init && var_$644_init)) {
if ((var_$558_changed) || (var_$644_changed)) {
var_$557_unknown = (var_$558_unknown && var_$644_unknown)
if ((var_$557_unknown)) {
var_$557_error = UnknownEventError(null)
} else {
var_$557_error = null
try {
var_$557_value = ((if((var_$558_error == null)) {var_$558_value} else {throw var_$558_error}) && (if((var_$644_error == null)) {var_$644_value} else {throw var_$644_error}))
} catch {
case var_err : Throwable => {
var_$557_error = var_err
}
}
}
var_$557_init = true
var_$557_changed = true
}
}
var_prev$648_changed = false
if ((var_$667_changed)) {
if ((var_$667_ts == currTs && var_$667_lastInit) || (!(var_$667_ts == currTs) && var_$667_init)) {
var_prev$648_changed = true
var_prev$648_init = true
var_prev$648_unknown = var_$667_unknown
if ((var_prev$648_unknown)) {
var_prev$648_error = var_$667_error
} else {
if ((var_$667_ts == currTs)) {
var_prev$648_value = var_$667_lastValue
var_prev$648_error = var_$667_lastError
} else {
var_prev$648_value = var_$667_value
var_prev$648_error = var_$667_error
}
}
}
}
var_$647_changed = false
if ((var_prev$648_init)) {
if ((var_prev$648_changed)) {
var_$647_unknown = (var_prev$648_unknown)
if ((var_$647_unknown)) {
var_$647_error = UnknownEventError(null)
} else {
var_$647_error = null
try {
var_$647_value = !((if((var_prev$648_error == null)) {var_prev$648_value} else {throw var_prev$648_error}))
} catch {
case var_err : Throwable => {
var_$647_error = var_err
}
}
}
var_$647_init = true
var_$647_changed = true
}
}
var_$556_changed = false
if ((var_$557_init && var_$647_init)) {
if ((var_$557_changed) || (var_$647_changed)) {
var_$556_unknown = (var_$557_unknown && var_$647_unknown)
if ((var_$556_unknown)) {
var_$556_error = UnknownEventError(null)
} else {
var_$556_error = null
try {
var_$556_value = ((if((var_$557_error == null)) {var_$557_value} else {throw var_$557_error}) && (if((var_$647_error == null)) {var_$647_value} else {throw var_$647_error}))
} catch {
case var_err : Throwable => {
var_$556_error = var_err
}
}
}
var_$556_init = true
var_$556_changed = true
}
}
var_$670_changed = false
if ((var_$559_changed)) {
var_$670_value = var_$559_ts
var_$670_init = true
var_$670_unknown = var_$559_unknown
if ((var_$670_unknown)) {
var_$670_error = var_$559_error
} else {
var_$670_error = null
}
var_$670_changed = true
}
var_$665_changed = false
if ((var_$667_changed)) {
if ((var_$554_ts == currTs && var_$554_lastInit) || (!(var_$554_ts == currTs) && var_$554_init)) {
var_$665_changed = true
var_$665_init = true
var_$665_unknown = var_$667_unknown
if ((var_$665_unknown)) {
var_$665_error = var_$667_error
} else {
if ((var_$554_ts == currTs)) {
var_$665_value = var_$554_lastValue
var_$665_error = var_$554_lastError
} else {
var_$665_value = var_$554_value
var_$665_error = var_$554_error
}
}
}
}
var_finalFalseSince$555_changed = false
if ((var_$556_init && var_$670_init && var_$665_init)) {
if ((var_$556_changed) || (var_$670_changed) || (var_$665_changed)) {
var_finalFalseSince$555_unknown = (var_$556_unknown && var_$670_unknown && var_$665_unknown)
if ((var_finalFalseSince$555_unknown)) {
var_finalFalseSince$555_error = UnknownEventError(null)
} else {
var_finalFalseSince$555_error = null
try {
var_finalFalseSince$555_value = (if ((if((var_$556_error == null)) {var_$556_value} else {throw var_$556_error})) (if((var_$670_error == null)) {var_$670_value} else {throw var_$670_error}) else (if((var_$665_error == null)) {var_$665_value} else {throw var_$665_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$555_error = var_err
}
}
}
var_finalFalseSince$555_changed = true
}
}
if ((!(currTs == 0L))) {
var_$554_changed = false
}
if ((var_finalFalseSince$555_changed)) {
var_$554_lastValue = var_$554_value
var_$554_lastInit = var_$554_init
var_$554_lastError = var_$554_error
var_$554_value = var_finalFalseSince$555_value
var_$554_init = true
var_$554_ts = currTs
var_$554_error = var_finalFalseSince$555_error
var_$554_changed = true
var_$554_unknown = var_finalFalseSince$555_unknown
}
var_$553_changed = false
if ((var_$554_init && var_$539_init)) {
if ((var_$554_changed) || (var_$539_changed)) {
var_$553_unknown = (var_$554_unknown && var_$539_unknown)
if ((var_$553_unknown)) {
var_$553_error = UnknownEventError(null)
} else {
var_$553_error = null
try {
var_$553_value = ((if((var_$554_error == null)) {var_$554_value} else {throw var_$554_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$553_error = var_err
}
}
}
var_$553_init = true
var_$553_changed = true
}
}
var_$552_changed = false
if ((var_$553_init && var_$670_init)) {
if ((var_$553_changed) || (var_$670_changed)) {
var_$552_unknown = (var_$553_unknown && var_$670_unknown)
if ((var_$552_unknown)) {
var_$552_error = UnknownEventError(null)
} else {
var_$552_error = null
try {
var_$552_value = ((if((var_$553_error == null)) {var_$553_value} else {throw var_$553_error}) < (if((var_$670_error == null)) {var_$670_value} else {throw var_$670_error}))
} catch {
case var_err : Throwable => {
var_$552_error = var_err
}
}
}
var_$552_init = true
var_$552_changed = true
}
}
var_$752_changed = false
if ((var_$502_init && var_$746_init)) {
if ((var_$502_changed) || (var_$746_changed)) {
var_$752_unknown = (var_$502_unknown && var_$746_unknown)
if ((var_$752_unknown)) {
var_$752_error = UnknownEventError(null)
} else {
var_$752_error = null
try {
var_$752_value = ((if((var_$502_error == null)) {var_$502_value} else {throw var_$502_error}) - (if((var_$746_error == null)) {var_$746_value} else {throw var_$746_error}))
} catch {
case var_err : Throwable => {
var_$752_error = var_err
}
}
}
var_$752_init = true
var_$752_changed = true
}
}
var_$751_changed = false
if ((var_$752_init && var_$800_init)) {
if ((var_$752_changed) || (var_$800_changed)) {
var_$751_unknown = (var_$752_unknown && var_$800_unknown)
if ((var_$751_unknown)) {
var_$751_error = UnknownEventError(null)
} else {
var_$751_error = null
try {
var_$751_value = ((if((var_$752_error == null)) {var_$752_value} else {throw var_$752_error}) + (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$751_error = var_err
}
}
}
var_$751_init = true
var_$751_changed = true
}
}
var_$515_changed = false
if ((var_$516_init)) {
if ((var_$516_changed)) {
var_$515_unknown = (var_$516_unknown)
if ((var_$515_unknown)) {
var_$515_error = UnknownEventError(null)
} else {
var_$515_error = null
try {
var_$515_value = !((if((var_$516_error == null)) {var_$516_value} else {throw var_$516_error}))
} catch {
case var_err : Throwable => {
var_$515_error = var_err
}
}
}
var_$515_init = true
var_$515_changed = true
}
}
var_$765_changed = false
if ((var_$504_init)) {
if ((var_$504_changed)) {
var_$765_unknown = (var_$504_unknown)
if ((var_$765_unknown)) {
var_$765_error = UnknownEventError(null)
} else {
var_$765_error = null
try {
var_$765_value = (if((var_$504_error == null)) {var_$504_value} else {throw var_$504_error}).tail
} catch {
case var_err : Throwable => {
var_$765_error = var_err
}
}
}
var_$765_init = true
var_$765_changed = true
}
}
var_$526_changed = false
if ((var_$429_init)) {
if ((var_$429_changed)) {
var_$526_unknown = (var_$429_unknown)
if ((var_$526_unknown)) {
var_$526_error = UnknownEventError(null)
} else {
var_$526_error = null
try {
var_$526_value = var_$656.apply((if((var_$429_error == null)) {var_$429_value} else {throw var_$429_error}))
} catch {
case var_err : Throwable => {
var_$526_error = var_err
}
}
}
var_$526_init = true
var_$526_changed = true
}
}
var_$427_changed = false
if ((var_$526_init && var_$515_init)) {
if ((var_$526_changed) || (var_$515_changed)) {
var_$427_unknown = (var_$526_unknown && var_$515_unknown)
if ((var_$427_unknown)) {
var_$427_error = UnknownEventError(null)
} else {
var_$427_error = null
try {
var_$427_value = ((if((var_$526_error == null)) {var_$526_value} else {throw var_$526_error}) && (if((var_$515_error == null)) {var_$515_value} else {throw var_$515_error}))
} catch {
case var_err : Throwable => {
var_$427_error = var_err
}
}
}
var_$427_init = true
var_$427_changed = true
}
}
var_$522_changed = false
if ((var_$429_changed)) {
if ((var_$420_ts == currTs && var_$420_lastInit) || (!(var_$420_ts == currTs) && var_$420_init)) {
var_$522_changed = true
var_$522_init = true
var_$522_unknown = var_$429_unknown
if ((var_$522_unknown)) {
var_$522_error = var_$429_error
} else {
if ((var_$420_ts == currTs)) {
var_$522_value = var_$420_lastValue
var_$522_error = var_$420_lastError
} else {
var_$522_value = var_$420_value
var_$522_error = var_$420_error
}
}
}
}
var_$525_changed = false
if ((var_$526_init && var_delayPeriod$739_init)) {
if ((var_$526_changed) || (var_delayPeriod$739_changed)) {
var_$525_unknown = (var_$526_unknown && var_delayPeriod$739_unknown)
if ((var_$525_unknown)) {
var_$525_error = UnknownEventError(null)
} else {
var_$525_error = null
try {
var_$525_value = ((if((var_$526_error == null)) {var_$526_value} else {throw var_$526_error}) == (if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error}))
} catch {
case var_err : Throwable => {
var_$525_error = var_err
}
}
}
var_$525_init = true
var_$525_changed = true
}
}
var_$524_changed = false
if ((var_$525_init && var_$530_init)) {
if ((var_$525_changed) || (var_$530_changed)) {
var_$524_unknown = (var_$525_unknown && var_$530_unknown)
if ((var_$524_unknown)) {
var_$524_error = UnknownEventError(null)
} else {
var_$524_error = null
try {
var_$524_value = ((if((var_$525_error == null)) {var_$525_value} else {throw var_$525_error}) && (if((var_$530_error == null)) {var_$530_value} else {throw var_$530_error}))
} catch {
case var_err : Throwable => {
var_$524_error = var_err
}
}
}
var_$524_init = true
var_$524_changed = true
}
}
var_isFinalFalse$521_changed = false
if ((var_$522_init && var_$524_init)) {
if ((var_$522_changed) || (var_$524_changed)) {
var_isFinalFalse$521_unknown = (var_$522_unknown && var_$524_unknown)
if ((var_isFinalFalse$521_unknown)) {
var_isFinalFalse$521_error = UnknownEventError(null)
} else {
var_isFinalFalse$521_error = null
try {
var_isFinalFalse$521_value = ((if((var_$522_error == null)) {var_$522_value} else {throw var_$522_error}) || (if((var_$524_error == null)) {var_$524_value} else {throw var_$524_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$521_error = var_err
}
}
}
var_isFinalFalse$521_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$545_changed = false
}
if ((var_isFinalFalse$521_changed)) {
var_isFinalFalseReset$545_lastValue = var_isFinalFalseReset$545_value
var_isFinalFalseReset$545_lastInit = var_isFinalFalseReset$545_init
var_isFinalFalseReset$545_lastError = var_isFinalFalseReset$545_error
var_isFinalFalseReset$545_value = var_isFinalFalse$521_value
var_isFinalFalseReset$545_init = true
var_isFinalFalseReset$545_ts = currTs
var_isFinalFalseReset$545_error = var_isFinalFalse$521_error
var_isFinalFalseReset$545_changed = true
var_isFinalFalseReset$545_unknown = var_isFinalFalse$521_unknown
}
var_prev$519_changed = false
if ((var_isFinalFalseReset$545_changed)) {
if ((var_isFinalFalseReset$545_ts == currTs && var_isFinalFalseReset$545_lastInit) || (!(var_isFinalFalseReset$545_ts == currTs) && var_isFinalFalseReset$545_init)) {
var_prev$519_changed = true
var_prev$519_init = true
var_prev$519_unknown = var_isFinalFalseReset$545_unknown
if ((var_prev$519_unknown)) {
var_prev$519_error = var_isFinalFalseReset$545_error
} else {
if ((var_isFinalFalseReset$545_ts == currTs)) {
var_prev$519_value = var_isFinalFalseReset$545_lastValue
var_prev$519_error = var_isFinalFalseReset$545_lastError
} else {
var_prev$519_value = var_isFinalFalseReset$545_value
var_prev$519_error = var_isFinalFalseReset$545_error
}
}
}
}
var_$518_changed = false
if ((var_prev$519_init)) {
if ((var_prev$519_changed)) {
var_$518_unknown = (var_prev$519_unknown)
if ((var_$518_unknown)) {
var_$518_error = UnknownEventError(null)
} else {
var_$518_error = null
try {
var_$518_value = !((if((var_prev$519_error == null)) {var_prev$519_value} else {throw var_prev$519_error}))
} catch {
case var_err : Throwable => {
var_$518_error = var_err
}
}
}
var_$518_init = true
var_$518_changed = true
}
}
var_$426_changed = false
if ((var_$427_init && var_$518_init)) {
if ((var_$427_changed) || (var_$518_changed)) {
var_$426_unknown = (var_$427_unknown && var_$518_unknown)
if ((var_$426_unknown)) {
var_$426_error = UnknownEventError(null)
} else {
var_$426_error = null
try {
var_$426_value = ((if((var_$427_error == null)) {var_$427_value} else {throw var_$427_error}) && (if((var_$518_error == null)) {var_$518_value} else {throw var_$518_error}))
} catch {
case var_err : Throwable => {
var_$426_error = var_err
}
}
}
var_$426_init = true
var_$426_changed = true
}
}
var_$535_changed = false
if ((var_$429_changed)) {
var_$535_value = var_$429_ts
var_$535_init = true
var_$535_unknown = var_$429_unknown
if ((var_$535_unknown)) {
var_$535_error = var_$429_error
} else {
var_$535_error = null
}
var_$535_changed = true
}
var_$536_changed = false
if ((var_isFinalFalseReset$545_changed)) {
if ((var_$424_ts == currTs && var_$424_lastInit) || (!(var_$424_ts == currTs) && var_$424_init)) {
var_$536_changed = true
var_$536_init = true
var_$536_unknown = var_isFinalFalseReset$545_unknown
if ((var_$536_unknown)) {
var_$536_error = var_isFinalFalseReset$545_error
} else {
if ((var_$424_ts == currTs)) {
var_$536_value = var_$424_lastValue
var_$536_error = var_$424_lastError
} else {
var_$536_value = var_$424_value
var_$536_error = var_$424_error
}
}
}
}
var_finalFalseSince$425_changed = false
if ((var_$426_init && var_$535_init && var_$536_init)) {
if ((var_$426_changed) || (var_$535_changed) || (var_$536_changed)) {
var_finalFalseSince$425_unknown = (var_$426_unknown && var_$535_unknown && var_$536_unknown)
if ((var_finalFalseSince$425_unknown)) {
var_finalFalseSince$425_error = UnknownEventError(null)
} else {
var_finalFalseSince$425_error = null
try {
var_finalFalseSince$425_value = (if ((if((var_$426_error == null)) {var_$426_value} else {throw var_$426_error})) (if((var_$535_error == null)) {var_$535_value} else {throw var_$535_error}) else (if((var_$536_error == null)) {var_$536_value} else {throw var_$536_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$425_error = var_err
}
}
}
var_finalFalseSince$425_changed = true
}
}
if ((!(currTs == 0L))) {
var_$424_changed = false
}
if ((var_finalFalseSince$425_changed)) {
var_$424_lastValue = var_$424_value
var_$424_lastInit = var_$424_init
var_$424_lastError = var_$424_error
var_$424_value = var_finalFalseSince$425_value
var_$424_init = true
var_$424_ts = currTs
var_$424_error = var_finalFalseSince$425_error
var_$424_changed = true
var_$424_unknown = var_finalFalseSince$425_unknown
}
var_$423_changed = false
if ((var_$424_init && var_$539_init)) {
if ((var_$424_changed) || (var_$539_changed)) {
var_$423_unknown = (var_$424_unknown && var_$539_unknown)
if ((var_$423_unknown)) {
var_$423_error = UnknownEventError(null)
} else {
var_$423_error = null
try {
var_$423_value = ((if((var_$424_error == null)) {var_$424_value} else {throw var_$424_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$423_error = var_err
}
}
}
var_$423_init = true
var_$423_changed = true
}
}
var_$764_changed = false
if ((var_$765_init)) {
if ((var_$765_changed)) {
var_$764_unknown = (var_$765_unknown)
if ((var_$764_unknown)) {
var_$764_error = UnknownEventError(null)
} else {
var_$764_error = null
try {
var_$764_value = (var_head$471.apply(((if((var_$765_error == null)) {var_$765_value} else {throw var_$765_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$764_error = var_err
}
}
}
var_$764_init = true
var_$764_changed = true
}
}
var_$763_changed = false
if ((var_$764_init && var_$539_init)) {
if ((var_$764_changed) || (var_$539_changed)) {
var_$763_unknown = (var_$764_unknown && var_$539_unknown)
if ((var_$763_unknown)) {
var_$763_error = UnknownEventError(null)
} else {
var_$763_error = null
try {
var_$763_value = ((if((var_$764_error == null)) {var_$764_value} else {throw var_$764_error}) + (if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}))
} catch {
case var_err : Throwable => {
var_$763_error = var_err
}
}
}
var_$763_init = true
var_$763_changed = true
}
}
var_$762_changed = false
if ((var_$763_init && var_$746_init)) {
if ((var_$763_changed) || (var_$746_changed)) {
var_$762_unknown = (var_$763_unknown && var_$746_unknown)
if ((var_$762_unknown)) {
var_$762_error = UnknownEventError(null)
} else {
var_$762_error = null
try {
var_$762_value = ((if((var_$763_error == null)) {var_$763_value} else {throw var_$763_error}) - (if((var_$746_error == null)) {var_$746_value} else {throw var_$746_error}))
} catch {
case var_err : Throwable => {
var_$762_error = var_err
}
}
}
var_$762_init = true
var_$762_changed = true
}
}
var_$761_changed = false
if ((var_$762_init && var_$800_init)) {
if ((var_$762_changed) || (var_$800_changed)) {
var_$761_unknown = (var_$762_unknown && var_$800_unknown)
if ((var_$761_unknown)) {
var_$761_error = UnknownEventError(null)
} else {
var_$761_error = null
try {
var_$761_value = ((if((var_$762_error == null)) {var_$762_value} else {throw var_$762_error}) + (if((var_$800_error == null)) {var_$800_value} else {throw var_$800_error}))
} catch {
case var_err : Throwable => {
var_$761_error = var_err
}
}
}
var_$761_init = true
var_$761_changed = true
}
}
var_delayPeriod$743_changed = false
if ((var_$785_init && var_$751_init && var_$761_init)) {
if ((var_$785_changed) || (var_$751_changed) || (var_$761_changed)) {
var_delayPeriod$743_unknown = (var_$785_unknown && var_$751_unknown && var_$761_unknown)
if ((var_delayPeriod$743_unknown)) {
var_delayPeriod$743_error = UnknownEventError(null)
} else {
var_delayPeriod$743_error = null
try {
var_delayPeriod$743_value = (if ((if((var_$785_error == null)) {var_$785_value} else {throw var_$785_error})) (if((var_$751_error == null)) {var_$751_value} else {throw var_$751_error}) else (if((var_$761_error == null)) {var_$761_value} else {throw var_$761_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$743_error = var_err
}
}
}
var_delayPeriod$743_init = true
var_delayPeriod$743_changed = true
}
}
var_$738_changed = false
if ((var_delayPeriod$739_init && var_delayPeriod$782_init && var_delayPeriod$743_init)) {
if ((var_delayPeriod$739_changed) || (var_delayPeriod$782_changed) || (var_delayPeriod$743_changed)) {
var_$738_unknown = (var_delayPeriod$739_unknown && var_delayPeriod$782_unknown && var_delayPeriod$743_unknown)
if ((var_$738_unknown)) {
var_$738_error = UnknownEventError(null)
} else {
var_$738_error = null
try {
var_$738_value = (if ((if((var_delayPeriod$739_error == null)) {var_delayPeriod$739_value} else {throw var_delayPeriod$739_error})) (if((var_delayPeriod$782_error == null)) {var_delayPeriod$782_value} else {throw var_delayPeriod$782_error}) else (if((var_delayPeriod$743_error == null)) {var_delayPeriod$743_value} else {throw var_delayPeriod$743_error}))
} catch {
case var_err : Throwable => {
var_$738_error = var_err
}
}
}
var_$738_init = true
var_$738_ts = currTs
var_$738_changed = true
}
}
var_$737_changed = false
if ((var_$738_init && var_$566_init)) {
if ((var_$738_changed) || (var_$566_changed)) {
var_$737_unknown = (var_$738_unknown && var_$566_unknown)
if ((var_$737_unknown)) {
var_$737_error = UnknownEventError(null)
} else {
var_$737_error = null
try {
var_$737_value = ((if((var_$738_error == null)) {var_$738_value} else {throw var_$738_error}) > (if((var_$566_error == null)) {var_$566_value} else {throw var_$566_error}))
} catch {
case var_err : Throwable => {
var_$737_error = var_err
}
}
}
var_$737_init = true
var_$737_changed = true
}
}
var_$422_changed = false
if ((var_$423_init && var_$535_init)) {
if ((var_$423_changed) || (var_$535_changed)) {
var_$422_unknown = (var_$423_unknown && var_$535_unknown)
if ((var_$422_unknown)) {
var_$422_error = UnknownEventError(null)
} else {
var_$422_error = null
try {
var_$422_value = ((if((var_$423_error == null)) {var_$423_value} else {throw var_$423_error}) < (if((var_$535_error == null)) {var_$535_value} else {throw var_$535_error}))
} catch {
case var_err : Throwable => {
var_$422_error = var_err
}
}
}
var_$422_init = true
var_$422_changed = true
}
}
var_isFinalFalseReset$421_changed = false
if ((var_$422_init && var_$662_init && var_isFinalFalseReset$545_init)) {
if ((var_$422_changed) || (var_$662_changed) || (var_isFinalFalseReset$545_changed)) {
var_isFinalFalseReset$421_unknown = (var_$422_unknown && var_$662_unknown && var_isFinalFalseReset$545_unknown)
if ((var_isFinalFalseReset$421_unknown)) {
var_isFinalFalseReset$421_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$421_error = null
try {
var_isFinalFalseReset$421_value = (if ((if((var_$422_error == null)) {var_$422_value} else {throw var_$422_error})) (if((var_$662_error == null)) {var_$662_value} else {throw var_$662_error}) else (if((var_isFinalFalseReset$545_error == null)) {var_isFinalFalseReset$545_value} else {throw var_isFinalFalseReset$545_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$421_error = var_err
}
}
}
var_isFinalFalseReset$421_changed = true
}
}
var_$420_changed = false
if ((var_isFinalFalseReset$421_changed) || (var_isFinalFalseReset$545_changed)) {
var_$420_lastValue = var_$420_value
var_$420_lastInit = var_$420_init
var_$420_lastError = var_$420_error
var_$420_init = true
var_$420_ts = currTs
var_$420_changed = true
var_$420_unknown = (var_isFinalFalseReset$421_unknown && var_isFinalFalseReset$545_unknown)
if ((var_isFinalFalseReset$421_changed)) {
var_$420_value = var_isFinalFalseReset$421_value
var_$420_error = var_isFinalFalseReset$421_error
} else {
if ((var_isFinalFalseReset$545_changed)) {
var_$420_value = var_isFinalFalseReset$545_value
var_$420_error = var_isFinalFalseReset$545_error
}
}
}
var_$777_changed = false
if ((var_$738_changed)) {
var_$777_value = var_$738_ts
var_$777_init = true
var_$777_unknown = var_$738_unknown
if ((var_$777_unknown)) {
var_$777_error = var_$738_error
} else {
var_$777_error = null
}
var_$777_changed = true
}
var_$774_changed = false
if ((var_$539_init && var_$777_init)) {
if ((var_$539_changed) || (var_$777_changed)) {
var_$774_unknown = (var_$539_unknown && var_$777_unknown)
if ((var_$774_unknown)) {
var_$774_error = UnknownEventError(null)
} else {
var_$774_error = null
try {
var_$774_value = ((if((var_$539_error == null)) {var_$539_value} else {throw var_$539_error}) - (if((var_$777_error == null)) {var_$777_value} else {throw var_$777_error}))
} catch {
case var_err : Throwable => {
var_$774_error = var_err
}
}
}
var_$774_init = true
var_$774_changed = true
}
}
var_$681_changed = false
if ((var_$737_init && var_$738_init && var_$774_init)) {
if ((var_$737_changed) || (var_$738_changed) || (var_$774_changed)) {
var_$681_unknown = (var_$737_unknown && var_$738_unknown && var_$774_unknown)
if ((var_$681_unknown)) {
var_$681_error = UnknownEventError(null)
} else {
var_$681_error = null
try {
var_$681_value = (if ((if((var_$737_error == null)) {var_$737_value} else {throw var_$737_error})) (if((var_$738_error == null)) {var_$738_value} else {throw var_$738_error}) else (if((var_$774_error == null)) {var_$774_value} else {throw var_$774_error}))
} catch {
case var_err : Throwable => {
var_$681_error = var_err
}
}
}
var_$681_changed = true
}
}
var_isFinalFalseReset$551_changed = false
if ((var_$552_init && var_$662_init && var_$667_init)) {
if ((var_$552_changed) || (var_$662_changed) || (var_$667_changed)) {
var_isFinalFalseReset$551_unknown = (var_$552_unknown && var_$662_unknown && var_$667_unknown)
if ((var_isFinalFalseReset$551_unknown)) {
var_isFinalFalseReset$551_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$551_error = null
try {
var_isFinalFalseReset$551_value = (if ((if((var_$552_error == null)) {var_$552_value} else {throw var_$552_error})) (if((var_$662_error == null)) {var_$662_value} else {throw var_$662_error}) else (if((var_$667_error == null)) {var_$667_value} else {throw var_$667_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$551_error = var_err
}
}
}
var_isFinalFalseReset$551_changed = true
}
}
var_$550_changed = false
if ((var_isFinalFalseReset$551_changed) || (var_$667_changed)) {
var_$550_lastValue = var_$550_value
var_$550_lastInit = var_$550_init
var_$550_lastError = var_$550_error
var_$550_init = true
var_$550_ts = currTs
var_$550_changed = true
var_$550_unknown = (var_isFinalFalseReset$551_unknown && var_$667_unknown)
if ((var_isFinalFalseReset$551_changed)) {
var_$550_value = var_isFinalFalseReset$551_value
var_$550_error = var_isFinalFalseReset$551_error
} else {
if ((var_$667_changed)) {
var_$550_value = var_$667_value
var_$550_error = var_$667_error
}
}
}
var_stillFulfillableReset$549_changed = false
}
def chunk2() = {
if ((var_$550_init && var_$675_init && var_$559_init)) {
if ((var_$550_changed) || (var_$675_changed) || (var_$559_changed)) {
var_stillFulfillableReset$549_unknown = (var_$550_unknown && var_$675_unknown && var_$559_unknown)
if ((var_stillFulfillableReset$549_unknown)) {
var_stillFulfillableReset$549_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$549_error = null
try {
var_stillFulfillableReset$549_value = (if ((if((var_$550_error == null)) {var_$550_value} else {throw var_$550_error})) (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}) else (if((var_$559_error == null)) {var_$559_value} else {throw var_$559_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$549_error = var_err
}
}
}
var_stillFulfillableReset$549_init = true
var_stillFulfillableReset$549_changed = true
}
}
var_stillFulfillableReset$419_changed = false
if ((var_$420_init && var_$675_init && var_$429_init)) {
if ((var_$420_changed) || (var_$675_changed) || (var_$429_changed)) {
var_stillFulfillableReset$419_unknown = (var_$420_unknown && var_$675_unknown && var_$429_unknown)
if ((var_stillFulfillableReset$419_unknown)) {
var_stillFulfillableReset$419_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$419_error = null
try {
var_stillFulfillableReset$419_value = (if ((if((var_$420_error == null)) {var_$420_value} else {throw var_$420_error})) (if((var_$675_error == null)) {var_$675_value} else {throw var_$675_error}) else (if((var_$429_error == null)) {var_$429_value} else {throw var_$429_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$419_error = var_err
}
}
}
var_stillFulfillableReset$419_init = true
var_stillFulfillableReset$419_changed = true
}
}
var_burstConstraintReset$418_changed = false
if ((var_stillFulfillableReset$419_init && var_stillFulfillableReset$549_init)) {
if ((var_stillFulfillableReset$419_changed) || (var_stillFulfillableReset$549_changed)) {
var_burstConstraintReset$418_unknown = (var_stillFulfillableReset$419_unknown && var_stillFulfillableReset$549_unknown)
if ((var_burstConstraintReset$418_unknown)) {
var_burstConstraintReset$418_error = UnknownEventError(null)
} else {
var_burstConstraintReset$418_error = null
try {
var_burstConstraintReset$418_value = var_fourValuedConjunction$678.apply((if((var_stillFulfillableReset$419_error == null)) {var_stillFulfillableReset$419_value} else {throw var_stillFulfillableReset$419_error}), (if((var_stillFulfillableReset$549_error == null)) {var_stillFulfillableReset$549_value} else {throw var_stillFulfillableReset$549_error}))
} catch {
case var_err : Throwable => {
var_burstConstraintReset$418_error = var_err
}
}
}
var_burstConstraintReset$418_init = true
var_burstConstraintReset$418_changed = true
}
}
}


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

if (((var_safeDelay$609_nextTs > lastProcessedTs) && (currTs > var_safeDelay$609_nextTs))) {
currTs = var_safeDelay$609_nextTs
}
if (((var_safeDelay$480_nextTs > lastProcessedTs) && (currTs > var_safeDelay$480_nextTs))) {
currTs = var_safeDelay$480_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

chunk1()
chunk2()


if ((var_event_unknown) || (!(var_$690_error == null)) || (var_$690_changed && (0L >= var_$690_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$690_changed)) {
if ((var_safeDelay$609_changed) || (var_event_changed)) {
var_safeDelay$609_nextTs = (currTs + var_$690_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$609_nextTs = -1L
}
}
}
if ((var_event_unknown) || (!(var_$681_error == null)) || (var_$681_changed && (0L >= var_$681_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$681_changed)) {
if ((var_safeDelay$480_changed) || (var_event_changed)) {
var_safeDelay$480_nextTs = (currTs + var_$681_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$480_nextTs = -1L
}
}
}
if ((var_burstConstraintReset$418_changed && var_burstConstraintReset$418_init)) {
out_constraint.apply(var_burstConstraintReset$418_value, currTs, "constraint", var_burstConstraintReset$418_error)
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
