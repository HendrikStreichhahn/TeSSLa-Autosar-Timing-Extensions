//This Scala code was automatically created by tessla-compiler from a TeSSLa Specification



class TesslaMonitor {

val var_head$2183 : scala.Function1[List[Any], Any] = ((var_list$2349 : List[Any]) => {
val var_$2350 : Any = var_list$2349(0L.asInstanceOf[Int])
var_$2350
})
val var_max$1761 : scala.Function2[Long, Long, Long] = ((var_a$2317 : Long, var_b$2318 : Long) => {
val var_$2319 : Long = (if ((var_a$2317 > var_b$2318)) var_a$2317 else var_b$2318)
var_$2319
})
val var_fourValuedConjunction$2261 : scala.Function2[(Boolean, Boolean), (Boolean, Boolean), (Boolean, Boolean)] = ((var_a$2360 : (Boolean, Boolean), var_b$2361 : (Boolean, Boolean)) => {
lazy val var_$2396 : Boolean = var_a$2360._1
lazy val var_$2393 : Boolean = !(var_$2396)
lazy val var_$2390 : Boolean = var_b$2361._2
lazy val var_$2377 : Boolean = var_a$2360._2
lazy val var_$2397 : Boolean = var_b$2361._1
lazy val var_$2395 : Boolean = !(var_$2397)
lazy val var_$2379 : Boolean = !(var_$2377)
lazy val var_$2370 : Boolean = !(var_$2390)
val var_$2362 : (Boolean, Boolean) = (if (((var_$2379 && var_$2396) || (var_$2370 && var_$2397))) (true, false) else (if (((var_$2379 && var_$2393) || (var_$2370 && var_$2395))) (false, false) else (if (((var_$2377 && var_$2393) || (var_$2390 && var_$2395))) (false, true) else (true, true))))
var_$2362
})
val var_min$2001 : scala.Function2[Long, Long, Long] = ((var_a$2339 : Long, var_b$2340 : Long) => {
val var_$2341 : Long = (if ((var_a$2339 < var_b$2340)) var_a$2339 else var_b$2340)
var_$2341
})
val var_aModuloBOr1if1$1701 : scala.Function2[Long, Long, Long] = ((var_a$2310 : Long, var_b$2311 : Long) => {
val var_$2312 : Long = (if ((var_b$2311 == 1L)) 1L else (var_a$2310 % var_b$2311))
var_$2312
})
val var_$2244 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$2358 : (Boolean, Boolean)) => {
val var_$2359 : Boolean = var_$2358._2
var_$2359
})
val var_$1909 : scala.Function2[ErrorOption[Long], ErrorOption[Long], ErrorOption[Long]] = ((var_trig$2330 : ErrorOption[Long], var_str$2331 : ErrorOption[Long]) => {
val var_$2332 : ErrorOption[Long] = (if (var_trig$2330.isEmpty) EONone() else var_str$2331)
var_$2332
})
val var_$2309 : scala.Function1[(Boolean, Boolean), Boolean] = ((var_$2410 : (Boolean, Boolean)) => {
val var_$2411 : Boolean = var_$2410._1
var_$2411
})
val var_$1723 : Map[Long, Long] = (((((Map[Long, Long]() + ((4L) -> (5L))) + ((3L) -> (4L))) + ((2L) -> (3L))) + ((1L) -> (2L))) + ((0L) -> (1L)))
lazy val var_$2262 : (Boolean, Boolean) = (false, true)
val var_$2208 : (Boolean, Boolean) = (true, false)
lazy val var_$2174 : List[Long] = List[Long]()
var out_value : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
var out_final : scala.Function4[Boolean, Long, String, Throwable, Unit] = null
val var_event_lastError : Throwable = null
val var_event_error : Throwable = null
val var_event_unknown : Boolean = false
var set_var_event : scala.Function2[Long, Long, Unit] = null
var var_event_lastInit : Boolean = false
var var_event_value : Long = 0L
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
var_event_value = value
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
var var_$2315_changed : Boolean = false
var var_$2315_init : Boolean = false
var var_$2315_unknown : Boolean = false
var var_$2315_error : Throwable = null
var var_$2315_value : (Boolean, Boolean) = (false, false)
var var_lowerBoundX$1656_changed : Boolean = false
var var_lowerBoundX$1656_unknown : Boolean = false
var var_lowerBoundX$1656_error : Throwable = null
var var_lowerBoundX$1656_value : Boolean = false
var var_lowerBoundX$1656_init : Boolean = false
val var_$2499_value : Long = 0L
val var_$2499_error : Throwable = null
val var_$2499_changed : Boolean = false
val var_$2499_unknown : Boolean = false
var var_minusStream$1883_changed : Boolean = true
var var_minusStream$1883_lastValue : Long = 0L
var var_minusStream$1883_lastInit : Boolean = false
var var_minusStream$1883_lastError : Throwable = null
var var_minusStream$1883_value : Long = 0L
var var_minusStream$1883_init : Boolean = true
var var_minusStream$1883_ts : Long = 0L
var var_minusStream$1883_error : Throwable = null
var var_minusStream$1883_unknown : Boolean = false
var var_mergedStream$1663_changed : Boolean = false
var var_mergedStream$1663_unknown : Boolean = false
var var_mergedStream$1663_error : Throwable = null
var var_mergedStream$1663_value : Long = 0L
var var_$1660_changed : Boolean = false
var var_$1660_unknown : Boolean = false
var var_$1660_value : Long = 0L
var var_$1660_error : Throwable = null
var var_on$1659_changed : Boolean = false
var var_on$1659_error : Throwable = null
var var_on$1659_unknown : Boolean = false
var var_on$1659_fval : ErrorOption[Long] = null
var var_on$1659_newValue : Long = 0L
var var_on$1659_init : Boolean = false
var var_on$1659_value : Long = 0L
var var_$1872_changed : Boolean = true
var var_$1872_value : Long = 0L
val var_$1872_init : Boolean = true
var var_$1872_unknown : Boolean = false
var var_$1872_error : Throwable = null
var var_$1975_changed : Boolean = false
var var_$1975_error : Throwable = null
var var_$1975_ts : Long = 0L
var var_$1975_unknown : Boolean = false
var var_$1974_changed : Boolean = false
var var_$1974_value : Long = 0L
var var_$1974_init : Boolean = false
var var_$1974_unknown : Boolean = false
var var_$1974_error : Throwable = null
var var_$1977_changed : Boolean = false
var var_$1977_value : Long = 0L
var var_$1977_init : Boolean = false
var var_$1977_unknown : Boolean = false
var var_$1977_error : Throwable = null
var var_$2476_changed : Boolean = false
var var_$2476_unknown : Boolean = false
var var_$2476_error : Throwable = null
var var_$2476_value : Boolean = false
var var_$1777_changed : Boolean = true
var var_$1777_value : Boolean = false
var var_$1777_init : Boolean = true
var var_$1777_error : Throwable = null
var var_$1777_unknown : Boolean = false
var var_$1927_changed : Boolean = false
var var_$1927_unknown : Boolean = false
var var_$1927_error : Throwable = null
var var_$1927_value : Boolean = false
var var_$1681_changed : Boolean = true
var var_$1681_value : Boolean = false
var var_$1681_init : Boolean = true
var var_$1681_error : Throwable = null
var var_$1681_unknown : Boolean = false
var var_$2184_changed : Boolean = true
var var_$2184_value : Long = 1L
var var_$2184_init : Boolean = true
var var_$2184_error : Throwable = null
var var_$2184_unknown : Boolean = false
var var_$1983_changed : Boolean = false
var var_$1983_unknown : Boolean = false
var var_$1983_error : Throwable = null
var var_$1983_value : Long = 0L
var var_$1983_init : Boolean = false
var var_$1736_changed : Boolean = false
var var_$1736_unknown : Boolean = false
var var_$1736_error : Throwable = null
var var_$1736_value : Long = 0L
var var_$1736_init : Boolean = false
var var_$2035_changed : Boolean = false
var var_$2035_error : Throwable = null
var var_$2035_unknown : Boolean = false
var var_$2455_changed : Boolean = false
var var_$2455_error : Throwable = null
var var_$2455_unknown : Boolean = false
var var_mergeUnit2$1878_changed : Boolean = false
var var_mergeUnit2$1878_unknown : Boolean = false
var var_mergeUnit2$1878_error : Throwable = null
var var_$1935_changed : Boolean = false
var var_$1935_init : Boolean = false
var var_$1935_unknown : Boolean = false
var var_$1935_error : Throwable = null
var var_$1935_value : Long = 0L
var var_minusStream$1971_changed : Boolean = false
var var_minusStream$1971_unknown : Boolean = false
var var_minusStream$1971_error : Throwable = null
var var_minusStream$1971_value : Long = 0L
var var_$1936_changed : Boolean = false
var var_$1936_lastValue : Long = 0L
var var_$1936_lastInit : Boolean = false
var var_$1936_lastError : Throwable = null
var var_$1936_init : Boolean = false
var var_$1936_ts : Long = 0L
var var_$1936_unknown : Boolean = false
var var_$1936_value : Long = 0L
var var_$1936_error : Throwable = null
var var_resetCount2$1915_changed : Boolean = false
var var_resetCount2$1915_unknown : Boolean = false
var var_resetCount2$1915_error : Throwable = null
var var_resetCount2$1915_value : Long = 0L
var var_resetCount2$1915_init : Boolean = false
var var_$1999_changed : Boolean = true
var var_$1999_value : Long = 5L
var var_$1999_init : Boolean = true
var var_$1999_error : Throwable = null
var var_$1999_unknown : Boolean = false
var var_$1669_changed : Boolean = false
var var_$1669_unknown : Boolean = false
var var_$1669_error : Throwable = null
var var_$1669_value : Long = 0L
var var_$1669_init : Boolean = false
var var_$1913_changed : Boolean = false
var var_$1913_unknown : Boolean = false
var var_$1913_error : Throwable = null
var var_$1913_value : Boolean = false
var var_$1913_init : Boolean = false
var var_$1951_changed : Boolean = false
var var_$1951_unknown : Boolean = false
var var_$1951_error : Throwable = null
var var_$2568_changed : Boolean = false
var var_$2568_value : Boolean = false
var var_$2568_error : Throwable = null
var var_$2568_unknown : Boolean = false
var var_$1952_changed : Boolean = false
var var_$1952_value : Boolean = false
var var_$1952_error : Throwable = null
var var_$1952_unknown : Boolean = false
val var_$2241_value : Boolean = false
val var_$2241_error : Throwable = null
val var_$2241_changed : Boolean = false
val var_$2241_unknown : Boolean = false
var var_$2571_changed : Boolean = true
var var_$2571_value : Boolean = false
var var_$2571_init : Boolean = true
var var_$2571_error : Throwable = null
var var_$2571_unknown : Boolean = false
var var_isFirst$1949_changed : Boolean = false
var var_isFirst$1949_init : Boolean = false
var var_isFirst$1949_unknown : Boolean = false
var var_isFirst$1949_value : Boolean = false
var var_isFirst$1949_error : Throwable = null
var var_$1704_changed : Boolean = false
var var_$1704_unknown : Boolean = false
var var_$1704_error : Throwable = null
var var_$1704_value : Boolean = false
var var_$1704_init : Boolean = false
var var_$1912_changed : Boolean = false
var var_$1912_unknown : Boolean = false
var var_$1912_error : Throwable = null
var var_$1912_value : Boolean = false
var var_$1912_init : Boolean = false
var var_$1763_changed : Boolean = false
var var_$1763_init : Boolean = false
var var_$1763_unknown : Boolean = false
var var_$1763_error : Throwable = null
var var_$1763_value : Long = 0L
var var_$2463_changed : Boolean = true
var var_$2463_value : Long = 50L
var var_$2463_init : Boolean = true
var var_$2463_error : Throwable = null
var var_$2463_unknown : Boolean = false
var var_$1712_changed : Boolean = false
var var_$1712_unknown : Boolean = false
var var_$1712_error : Throwable = null
var var_$1712_value : Long = 0L
var var_$1712_init : Boolean = false
val var_$1853_value : Map[Long, Long] = Map[Long, Long]()
val var_$1853_error : Throwable = null
val var_$1853_changed : Boolean = false
val var_$1853_unknown : Boolean = false
var var_$2086_changed : Boolean = true
var var_$2086_value : Map[Long, Long] = var_$1723
var var_$2086_init : Boolean = true
var var_$2086_error : Throwable = null
var var_$2086_unknown : Boolean = false
var var_$2051_changed : Boolean = false
var var_$2051_unknown : Boolean = false
var var_$2051_error : Throwable = null
var var_$2051_value : Long = 0L
var var_$2051_init : Boolean = false
var var_$1854_changed : Boolean = false
var var_$1854_unknown : Boolean = false
var var_$1854_error : Throwable = null
var var_$1854_value : Long = 0L
var var_$1854_init : Boolean = false
var var_$1963_changed : Boolean = false
var var_$1963_unknown : Boolean = false
var var_$1963_error : Throwable = null
var var_$1963_value : Long = 0L
var var_$1963_init : Boolean = false
var var_$1718_changed : Boolean = false
var var_$1718_unknown : Boolean = false
var var_$1718_error : Throwable = null
var var_$1718_value : Long = 0L
var var_$1718_init : Boolean = false
var var_$1765_changed : Boolean = false
var var_$1765_unknown : Boolean = false
var var_$1765_error : Throwable = null
var var_$1765_value : Long = 0L
var var_$1765_init : Boolean = false
var var_$1711_changed : Boolean = false
var var_$1711_unknown : Boolean = false
var var_$1711_error : Throwable = null
var var_$1711_value : Long = 0L
var var_$1711_init : Boolean = false
var var_$1762_changed : Boolean = false
var var_$1762_unknown : Boolean = false
var var_$1762_error : Throwable = null
var var_$1762_value : Long = 0L
var var_$1762_init : Boolean = false
var var_$1666_changed : Boolean = false
var var_$1666_unknown : Boolean = false
var var_$1666_error : Throwable = null
var var_$1666_value : Long = 0L
var var_lowerBoundX$1665_changed : Boolean = false
var var_lowerBoundX$1665_init : Boolean = false
var var_lowerBoundX$1665_unknown : Boolean = false
var var_lowerBoundX$1665_value : Long = 0L
var var_lowerBoundX$1665_error : Throwable = null
var var_$1655_changed : Boolean = false
var var_$1655_lastValue : Long = 0L
var var_$1655_lastInit : Boolean = false
var var_$1655_lastError : Throwable = null
var var_$1655_unknown : Boolean = false
var var_$1655_error : Throwable = null
var var_$1655_value : Long = 0L
var var_$1655_init : Boolean = false
var var_$1655_ts : Long = 0L
var var_$1654_changed : Boolean = false
var var_$1654_unknown : Boolean = false
var var_$1654_error : Throwable = null
var var_$1654_value : Long = 0L
var var_$1654_init : Boolean = false
var var_safeDelay$1895_changed : Boolean = false
val var_safeDelay$1895_error : Throwable = null
var var_safeDelay$1895_unknown : Boolean = false
var var_$1893_changed : Boolean = false
var var_$1893_error : Throwable = null
var var_$1893_unknown : Boolean = false
var var_mergeUnit2$1890_changed : Boolean = false
var var_mergeUnit2$1890_ts : Long = 0L
var var_mergeUnit2$1890_unknown : Boolean = false
var var_mergeUnit2$1890_error : Throwable = null
var var_$1889_changed : Boolean = false
var var_$1889_value : Long = 0L
var var_$1889_init : Boolean = false
var var_$1889_unknown : Boolean = false
var var_$1889_error : Throwable = null
var var_$1653_changed : Boolean = false
var var_$1653_unknown : Boolean = false
var var_$1653_error : Throwable = null
var var_$1653_value : Boolean = false
var var_$1653_init : Boolean = false
var var_$2542_changed : Boolean = true
var var_$2542_lastValue : Long = 0L
var var_$2542_lastInit : Boolean = false
var var_$2542_lastError : Throwable = null
var var_$2542_value : Long = 9223372036854775807L
var var_$2542_init : Boolean = true
var var_$2542_ts : Long = 0L
var var_$2542_error : Throwable = null
var var_$2542_unknown : Boolean = false
var var_mergedStream$1908_changed : Boolean = false
var var_mergedStream$1908_unknown : Boolean = false
var var_mergedStream$1908_error : Throwable = null
var var_mergedStream$1908_value : Long = 0L
var var_$1905_changed : Boolean = false
var var_$1905_unknown : Boolean = false
var var_$1905_value : Long = 0L
var var_$1905_error : Throwable = null
var var_on$1904_changed : Boolean = false
var var_on$1904_error : Throwable = null
var var_on$1904_unknown : Boolean = false
var var_on$1904_fval : ErrorOption[Long] = null
var var_on$1904_newValue : Long = 0L
var var_on$1904_init : Boolean = false
var var_on$1904_value : Long = 0L
var var_$2003_changed : Boolean = false
var var_$2003_init : Boolean = false
var var_$2003_unknown : Boolean = false
var var_$2003_error : Throwable = null
var var_$2003_value : Long = 0L
var var_$1956_changed : Boolean = false
var var_$1956_unknown : Boolean = false
var var_$1956_error : Throwable = null
var var_$1956_value : Long = 0L
var var_$1956_init : Boolean = false
var var_$1955_changed : Boolean = false
var var_$1955_unknown : Boolean = false
var var_$1955_error : Throwable = null
var var_$1955_value : Long = 0L
var var_$1955_init : Boolean = false
var var_$2002_changed : Boolean = false
var var_$2002_unknown : Boolean = false
var var_$2002_error : Throwable = null
var var_$2002_value : Long = 0L
var var_$2002_init : Boolean = false
var var_$1911_changed : Boolean = false
var var_$1911_unknown : Boolean = false
var var_$1911_error : Throwable = null
var var_$1911_value : Long = 0L
var var_upperBoundX$1910_changed : Boolean = false
var var_upperBoundX$1910_init : Boolean = false
var var_upperBoundX$1910_unknown : Boolean = false
var var_upperBoundX$1910_value : Long = 0L
var var_upperBoundX$1910_error : Throwable = null
var var_$1900_changed : Boolean = false
var var_$1900_lastValue : Long = 0L
var var_$1900_lastInit : Boolean = false
var var_$1900_lastError : Throwable = null
var var_$1900_unknown : Boolean = false
var var_$1900_error : Throwable = null
var var_$1900_value : Long = 0L
var var_$1900_init : Boolean = false
var var_$1900_ts : Long = 0L
var var_$1899_changed : Boolean = false
var var_$1899_unknown : Boolean = false
var var_$1899_error : Throwable = null
var var_$1899_value : Long = 0L
var var_$1899_init : Boolean = false
var var_$1898_changed : Boolean = false
var var_$1898_unknown : Boolean = false
var var_$1898_error : Throwable = null
var var_$1898_value : Long = 0L
var var_$1898_init : Boolean = false
var var_$1896_changed : Boolean = false
var var_$1896_unknown : Boolean = false
var var_$1896_error : Throwable = null
var var_$1896_value : Boolean = false
var var_$1896_init : Boolean = false
var var_$1652_changed : Boolean = false
var var_$1652_unknown : Boolean = false
var var_$1652_error : Throwable = null
var var_$1652_value : Boolean = false
var var_$1652_init : Boolean = false
val var_$2259_value : (Boolean, Boolean) = (false, false)
val var_$2259_error : Throwable = null
val var_$2259_changed : Boolean = false
val var_$2259_unknown : Boolean = false
var var_$2125_changed : Boolean = true
var var_$2125_value : (Boolean, Boolean) = var_$2262
var var_$2125_init : Boolean = true
var var_$2125_error : Throwable = null
var var_$2125_unknown : Boolean = false
var var_$2128_changed : Boolean = true
var var_$2128_value : (Boolean, Boolean) = var_$2208
var var_$2128_init : Boolean = true
var var_$2128_error : Throwable = null
var var_$2128_unknown : Boolean = false
var var_$1651_changed : Boolean = false
var var_$1651_unknown : Boolean = false
var var_$1651_error : Throwable = null
var var_$1651_value : (Boolean, Boolean) = (false, false)
var var_$1651_init : Boolean = false
var var_defaultTime$2154_changed : Boolean = true
var var_defaultTime$2154_value : Long = -1L
var var_defaultTime$2154_init : Boolean = true
var var_defaultTime$2154_error : Throwable = null
var var_defaultTime$2154_unknown : Boolean = false
var var_latestSpanEventTimes$2145_changed : Boolean = false
var var_latestSpanEventTimes$2145_unknown : Boolean = false
var var_latestSpanEventTimes$2145_error : Throwable = null
var var_latestSpanEventTimes$2145_value : Boolean = false
var var_latestSpanEventTimes$2145_init : Boolean = false
val var_$2152_value : List[Long] = List[Long]()
val var_$2152_error : Throwable = null
val var_$2152_changed : Boolean = false
val var_$2152_unknown : Boolean = false
var var_$2151_changed : Boolean = true
var var_$2151_value : List[Long] = var_$2174
var var_$2151_init : Boolean = true
var var_$2151_error : Throwable = null
var var_$2151_unknown : Boolean = false
var var_latestSpanEventTimes$2150_changed : Boolean = false
var var_latestSpanEventTimes$2150_unknown : Boolean = false
var var_latestSpanEventTimes$2150_error : Throwable = null
var var_latestSpanEventTimes$2150_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$2150_init : Boolean = false
var var_$2161_changed : Boolean = false
var var_$2161_init : Boolean = false
var var_$2161_unknown : Boolean = false
var var_$2161_error : Throwable = null
var var_$2161_value : List[Long] = List[Long]()
var var_$2160_changed : Boolean = false
var var_$2160_unknown : Boolean = false
var var_$2160_error : Throwable = null
var var_$2160_value : Long = 0L
var var_$2160_init : Boolean = false
var var_$2159_changed : Boolean = false
var var_$2159_unknown : Boolean = false
var var_$2159_error : Throwable = null
var var_$2159_value : Boolean = false
var var_$2159_init : Boolean = false
var var_$2166_changed : Boolean = false
var var_$2166_init : Boolean = false
var var_$2166_unknown : Boolean = false
var var_$2166_error : Throwable = null
var var_$2166_value : List[Long] = List[Long]()
var var_$2165_changed : Boolean = false
var var_$2165_unknown : Boolean = false
var var_$2165_error : Throwable = null
var var_$2165_value : List[Long] = List[Long]()
var var_$2165_init : Boolean = false
var var_$2158_changed : Boolean = false
var var_$2158_unknown : Boolean = false
var var_$2158_error : Throwable = null
var var_$2158_value : List[Long] = List[Long]()
var var_$2158_init : Boolean = false
var var_$2157_changed : Boolean = false
var var_$2157_unknown : Boolean = false
var var_$2157_error : Throwable = null
var var_$2157_value : List[Long] = List[Long]()
var var_latestSpanEventTimes$2156_changed : Boolean = true
var var_latestSpanEventTimes$2156_value : List[Long] = var_$2174
var var_latestSpanEventTimes$2156_init : Boolean = true
var var_latestSpanEventTimes$2156_error : Throwable = null
var var_latestSpanEventTimes$2156_unknown : Boolean = false
var var_$2541_changed : Boolean = false
var var_$2541_lastValue : List[Long] = List[Long]()
var var_$2541_lastInit : Boolean = false
var var_$2541_lastError : Throwable = null
var var_$2541_unknown : Boolean = false
var var_$2541_error : Throwable = null
var var_$2541_value : List[Long] = List[Long]()
var var_$2541_init : Boolean = false
var var_$2541_ts : Long = 0L
var var_$2143_changed : Boolean = false
var var_$2143_unknown : Boolean = false
var var_$2143_error : Throwable = null
var var_$2143_value : Long = 0L
var var_$2143_init : Boolean = false
var var_$2142_changed : Boolean = false
var var_$2142_unknown : Boolean = false
var var_$2142_error : Throwable = null
var var_$2142_value : Boolean = false
var var_$2142_init : Boolean = false
var var_$2540_changed : Boolean = false
var var_$2540_unknown : Boolean = false
var var_$2540_error : Throwable = null
var var_$2540_value : Long = 0L
var var_$2540_init : Boolean = false
var var_$2180_changed : Boolean = false
var var_$2180_unknown : Boolean = false
var var_$2180_error : Throwable = null
var var_$2180_value : Long = 0L
var var_$2180_init : Boolean = false
var var_safeDelay$2192_changed : Boolean = false
val var_safeDelay$2192_error : Throwable = null
var var_safeDelay$2192_unknown : Boolean = false
var var_$2190_changed : Boolean = false
var var_$2190_error : Throwable = null
var var_$2190_unknown : Boolean = false
var var_mergeUnit2$2187_changed : Boolean = false
var var_mergeUnit2$2187_ts : Long = 0L
var var_mergeUnit2$2187_unknown : Boolean = false
var var_mergeUnit2$2187_error : Throwable = null
var var_$2186_changed : Boolean = false
var var_$2186_value : Long = 0L
var var_$2186_init : Boolean = false
var var_$2186_unknown : Boolean = false
var var_$2186_error : Throwable = null
var var_$2179_changed : Boolean = false
var var_$2179_unknown : Boolean = false
var var_$2179_error : Throwable = null
var var_$2179_value : Boolean = false
var var_$2179_init : Boolean = false
var var_delayPeriod$2525_changed : Boolean = true
var var_delayPeriod$2525_value : Boolean = true
var var_delayPeriod$2525_init : Boolean = true
var var_delayPeriod$2525_error : Throwable = null
var var_delayPeriod$2525_unknown : Boolean = false
var var_$2214_changed : Boolean = false
var var_$2214_unknown : Boolean = false
var var_$2214_error : Throwable = null
var var_$2214_value : Long = 0L
var var_$2214_init : Boolean = false
var var_$2213_changed : Boolean = false
var var_$2213_unknown : Boolean = false
var var_$2213_error : Throwable = null
var var_$2213_value : Boolean = false
var var_$2213_init : Boolean = false
var var_$2193_changed : Boolean = false
var var_$2193_unknown : Boolean = false
var var_$2193_error : Throwable = null
var var_$2193_value : Boolean = false
var var_$2193_init : Boolean = false
var var_$2178_changed : Boolean = false
var var_$2178_unknown : Boolean = false
var var_$2178_error : Throwable = null
var var_$2178_value : Boolean = false
var var_$2178_init : Boolean = false
var var_$2177_changed : Boolean = false
var var_$2177_unknown : Boolean = false
var var_$2177_error : Throwable = null
var var_$2177_value : (Boolean, Boolean) = (false, false)
var var_$2177_init : Boolean = false
var var_$2209_changed : Boolean = false
var var_$2209_unknown : Boolean = false
var var_$2209_error : Throwable = null
var var_$2209_value : (Boolean, Boolean) = (false, false)
var var_$2209_init : Boolean = false
var var_$2141_changed : Boolean = false
var var_$2141_unknown : Boolean = false
var var_$2141_error : Throwable = null
var var_$2141_value : (Boolean, Boolean) = (false, false)
var var_$2141_init : Boolean = false
var var_$2141_ts : Long = 0L
var var_$2140_changed : Boolean = false
var var_$2140_unknown : Boolean = false
var var_$2140_error : Throwable = null
var var_$2140_value : Boolean = false
var var_$2140_init : Boolean = false
var var_$2228_changed : Boolean = false
var var_$2228_unknown : Boolean = false
var var_$2228_error : Throwable = null
var var_$2228_value : Boolean = false
var var_$2228_init : Boolean = false
var var_$2227_changed : Boolean = false
var var_$2227_unknown : Boolean = false
var var_$2227_error : Throwable = null
var var_$2227_value : Boolean = false
var var_$2227_init : Boolean = false
var var_$2139_changed : Boolean = false
var var_$2139_unknown : Boolean = false
var var_$2139_error : Throwable = null
var var_$2139_value : Boolean = false
var var_$2139_init : Boolean = false
var var_$2234_changed : Boolean = false
var var_$2234_init : Boolean = false
var var_$2234_unknown : Boolean = false
var var_$2234_error : Throwable = null
var var_$2234_value : Boolean = false
var var_$2237_changed : Boolean = false
var var_$2237_unknown : Boolean = false
var var_$2237_error : Throwable = null
var var_$2237_value : Boolean = false
var var_$2237_init : Boolean = false
var var_$2242_changed : Boolean = false
var var_$2242_unknown : Boolean = false
var var_$2242_error : Throwable = null
var var_$2242_value : Boolean = false
var var_$2242_init : Boolean = false
var var_$2236_changed : Boolean = false
var var_$2236_unknown : Boolean = false
var var_$2236_error : Throwable = null
var var_$2236_value : Boolean = false
var var_$2236_init : Boolean = false
var var_isFinalFalse$2233_changed : Boolean = false
var var_isFinalFalse$2233_unknown : Boolean = false
var var_isFinalFalse$2233_error : Throwable = null
var var_isFinalFalse$2233_value : Boolean = false
var var_isFinalFalseReset$2257_changed : Boolean = true
var var_isFinalFalseReset$2257_lastValue : Boolean = false
var var_isFinalFalseReset$2257_lastInit : Boolean = false
var var_isFinalFalseReset$2257_lastError : Throwable = null
var var_isFinalFalseReset$2257_value : Boolean = false
var var_isFinalFalseReset$2257_init : Boolean = true
var var_isFinalFalseReset$2257_ts : Long = 0L
var var_isFinalFalseReset$2257_error : Throwable = null
var var_isFinalFalseReset$2257_unknown : Boolean = false
var var_prev$2231_changed : Boolean = false
var var_prev$2231_init : Boolean = false
var var_prev$2231_unknown : Boolean = false
var var_prev$2231_error : Throwable = null
var var_prev$2231_value : Boolean = false
var var_$2230_changed : Boolean = false
var var_$2230_unknown : Boolean = false
var var_$2230_error : Throwable = null
var var_$2230_value : Boolean = false
var var_$2230_init : Boolean = false
var var_$2138_changed : Boolean = false
var var_$2138_unknown : Boolean = false
var var_$2138_error : Throwable = null
var var_$2138_value : Boolean = false
var var_$2138_init : Boolean = false
var var_$2253_changed : Boolean = false
var var_$2253_value : Long = 0L
var var_$2253_init : Boolean = false
var var_$2253_unknown : Boolean = false
var var_$2253_error : Throwable = null
var var_$2248_changed : Boolean = false
var var_$2248_init : Boolean = false
var var_$2248_unknown : Boolean = false
var var_$2248_error : Throwable = null
var var_$2248_value : Long = 0L
var var_finalFalseSince$2137_changed : Boolean = false
var var_finalFalseSince$2137_unknown : Boolean = false
var var_finalFalseSince$2137_error : Throwable = null
var var_finalFalseSince$2137_value : Long = 0L
var var_$2249_changed : Boolean = true
var var_$2249_lastValue : Long = 0L
var var_$2249_lastInit : Boolean = false
var var_$2249_lastError : Throwable = null
var var_$2249_value : Long = 9223372036854775807L
var var_$2249_init : Boolean = true
var var_$2249_ts : Long = 0L
var var_$2249_error : Throwable = null
var var_$2249_unknown : Boolean = false
var var_$2135_changed : Boolean = false
var var_$2135_unknown : Boolean = false
var var_$2135_error : Throwable = null
var var_$2135_value : Long = 0L
var var_$2135_init : Boolean = false
var var_$2134_changed : Boolean = false
var var_$2134_unknown : Boolean = false
var var_$2134_error : Throwable = null
var var_$2134_value : Boolean = false
var var_$2134_init : Boolean = false
var var_isFinalFalseReset$2133_changed : Boolean = false
var var_isFinalFalseReset$2133_unknown : Boolean = false
var var_isFinalFalseReset$2133_error : Throwable = null
var var_isFinalFalseReset$2133_value : Boolean = false
var var_$2235_changed : Boolean = false
var var_$2235_lastValue : Boolean = false
var var_$2235_lastInit : Boolean = false
var var_$2235_lastError : Throwable = null
var var_$2235_init : Boolean = false
var var_$2235_ts : Long = 0L
var var_$2235_unknown : Boolean = false
var var_$2235_value : Boolean = false
var var_$2235_error : Throwable = null
var var_stillFulfillableReset$2131_changed : Boolean = false
var var_stillFulfillableReset$2131_unknown : Boolean = false
var var_stillFulfillableReset$2131_error : Throwable = null
var var_stillFulfillableReset$2131_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$2131_init : Boolean = false
var var_$1650_changed : Boolean = false
var var_$1650_unknown : Boolean = false
var var_$1650_error : Throwable = null
var var_$1650_value : (Boolean, Boolean) = (false, false)
var var_res$1649_changed : Boolean = true
var var_res$1649_value : (Boolean, Boolean) = var_$2262
var var_res$1649_init : Boolean = true
var var_res$1649_ts : Long = 0L
var var_res$1649_error : Throwable = null
var var_res$1649_unknown : Boolean = false
var var_$1648_changed : Boolean = false
var var_$1648_unknown : Boolean = false
var var_$1648_error : Throwable = null
var var_$1648_value : Boolean = false
var var_$1648_init : Boolean = false
var var_$2265_changed : Boolean = false
var var_$2265_unknown : Boolean = false
var var_$2265_error : Throwable = null
var var_$2265_value : Boolean = false
var var_$2265_init : Boolean = false
var var_$2264_changed : Boolean = false
var var_$2264_unknown : Boolean = false
var var_$2264_error : Throwable = null
var var_$2264_value : Boolean = false
var var_$2264_init : Boolean = false
var var_$1647_changed : Boolean = false
var var_$1647_unknown : Boolean = false
var var_$1647_error : Throwable = null
var var_$1647_value : Boolean = false
var var_$1647_init : Boolean = false
var var_$2271_changed : Boolean = false
var var_$2271_init : Boolean = false
var var_$2271_unknown : Boolean = false
var var_$2271_error : Throwable = null
var var_$2271_value : Boolean = false
var var_$2274_changed : Boolean = false
var var_$2274_unknown : Boolean = false
var var_$2274_error : Throwable = null
var var_$2274_value : Boolean = false
var var_$2274_init : Boolean = false
var var_$2279_changed : Boolean = false
var var_$2279_unknown : Boolean = false
var var_$2279_error : Throwable = null
var var_$2279_value : Boolean = false
var var_$2279_init : Boolean = false
var var_$2273_changed : Boolean = false
var var_$2273_unknown : Boolean = false
var var_$2273_error : Throwable = null
var var_$2273_value : Boolean = false
var var_$2273_init : Boolean = false
var var_isFinalFalse$2270_changed : Boolean = false
var var_isFinalFalse$2270_unknown : Boolean = false
var var_isFinalFalse$2270_error : Throwable = null
var var_isFinalFalse$2270_value : Boolean = false
var var_isFinalFalseReset$2294_changed : Boolean = true
var var_isFinalFalseReset$2294_lastValue : Boolean = false
var var_isFinalFalseReset$2294_lastInit : Boolean = false
var var_isFinalFalseReset$2294_lastError : Throwable = null
var var_isFinalFalseReset$2294_value : Boolean = false
var var_isFinalFalseReset$2294_init : Boolean = true
var var_isFinalFalseReset$2294_ts : Long = 0L
var var_isFinalFalseReset$2294_error : Throwable = null
var var_isFinalFalseReset$2294_unknown : Boolean = false
var var_prev$2268_changed : Boolean = false
var var_prev$2268_init : Boolean = false
var var_prev$2268_unknown : Boolean = false
var var_prev$2268_error : Throwable = null
var var_prev$2268_value : Boolean = false
var var_$2267_changed : Boolean = false
var var_$2267_unknown : Boolean = false
var var_$2267_error : Throwable = null
var var_$2267_value : Boolean = false
var var_$2267_init : Boolean = false
var var_$1646_changed : Boolean = false
var var_$1646_unknown : Boolean = false
var var_$1646_error : Throwable = null
var var_$1646_value : Boolean = false
var var_$1646_init : Boolean = false
var var_$2284_changed : Boolean = false
var var_$2284_value : Long = 0L
var var_$2284_init : Boolean = false
var var_$2284_unknown : Boolean = false
var var_$2284_error : Throwable = null
var var_$2285_changed : Boolean = false
var var_$2285_init : Boolean = false
var var_$2285_unknown : Boolean = false
var var_$2285_error : Throwable = null
var var_$2285_value : Long = 0L
var var_finalFalseSince$1645_changed : Boolean = false
var var_finalFalseSince$1645_unknown : Boolean = false
var var_finalFalseSince$1645_error : Throwable = null
var var_finalFalseSince$1645_value : Long = 0L
var var_$1644_changed : Boolean = true
var var_$1644_lastValue : Long = 0L
var var_$1644_lastInit : Boolean = false
var var_$1644_lastError : Throwable = null
var var_$1644_value : Long = 9223372036854775807L
var var_$1644_init : Boolean = true
var var_$1644_ts : Long = 0L
var var_$1644_error : Throwable = null
var var_$1644_unknown : Boolean = false
var var_$1643_changed : Boolean = false
var var_$1643_unknown : Boolean = false
var var_$1643_error : Throwable = null
var var_$1643_value : Long = 0L
var var_$1643_init : Boolean = false
var var_$2551_changed : Boolean = false
var var_$2551_unknown : Boolean = false
var var_$2551_error : Throwable = null
var var_$2551_value : List[Long] = List[Long]()
var var_$2551_init : Boolean = false
var var_$2550_changed : Boolean = false
var var_$2550_unknown : Boolean = false
var var_$2550_error : Throwable = null
var var_$2550_value : Long = 0L
var var_$2550_init : Boolean = false
var var_$2549_changed : Boolean = false
var var_$2549_unknown : Boolean = false
var var_$2549_error : Throwable = null
var var_$2549_value : Long = 0L
var var_$2549_init : Boolean = false
var var_$2429_changed : Boolean = false
var var_$2429_unknown : Boolean = false
var var_$2429_error : Throwable = null
var var_$2429_value : Long = 0L
var var_$2429_init : Boolean = false
var var_$2428_changed : Boolean = false
var var_$2428_unknown : Boolean = false
var var_$2428_error : Throwable = null
var var_$2428_value : Boolean = false
var var_$2428_init : Boolean = false
var var_$2427_changed : Boolean = false
var var_$2427_unknown : Boolean = false
var var_$2427_error : Throwable = null
var var_$2427_value : Long = 0L
var var_$2427_init : Boolean = false
var var_$2425_changed : Boolean = false
var var_$2425_unknown : Boolean = false
var var_$2425_error : Throwable = null
var var_$2425_value : Long = 0L
var var_$2425_init : Boolean = false
var var_$2467_changed : Boolean = false
var var_$2467_unknown : Boolean = false
var var_$2467_error : Throwable = null
var var_$2467_value : Long = 0L
var var_$2467_init : Boolean = false
var var_$2424_changed : Boolean = false
var var_$2424_unknown : Boolean = false
var var_$2424_error : Throwable = null
var var_$2424_value : Long = 0L
var var_$2424_init : Boolean = false
var var_$2423_changed : Boolean = false
var var_$2423_unknown : Boolean = false
var var_$2423_error : Throwable = null
var var_$2423_value : Long = 0L
var var_$2423_init : Boolean = false
var var_$2422_changed : Boolean = false
var var_$2422_unknown : Boolean = false
var var_$2422_error : Throwable = null
var var_$2422_value : Long = 0L
var var_$2422_init : Boolean = false
var var_$2421_changed : Boolean = false
var var_$2421_unknown : Boolean = false
var var_$2421_error : Throwable = null
var var_$2421_value : Long = 0L
var var_$2421_init : Boolean = false
var var_$2421_ts : Long = 0L
var var_firstEvent$2535_changed : Boolean = false
var var_firstEvent$2535_error : Throwable = null
var var_firstEvent$2535_ts : Long = 0L
var var_firstEvent$2535_unknown : Boolean = false
var var_$2534_changed : Boolean = false
var var_$2534_value : Long = 0L
var var_$2534_unknown : Boolean = false
var var_$2534_error : Throwable = null
var var_defaultTime$2533_changed : Boolean = true
var var_defaultTime$2533_value : Long = -1L
var var_defaultTime$2533_init : Boolean = true
var var_defaultTime$2533_error : Throwable = null
var var_defaultTime$2533_unknown : Boolean = false
var var_$2530_changed : Boolean = false
var var_$2530_unknown : Boolean = false
var var_$2530_error : Throwable = null
var var_$2530_value : Boolean = false
var var_$2530_init : Boolean = false
var var_$2538_changed : Boolean = false
var var_$2538_unknown : Boolean = false
var var_$2538_error : Throwable = null
var var_$2538_value : Long = 0L
var var_$2538_init : Boolean = false
var var_$2537_changed : Boolean = false
var var_$2537_unknown : Boolean = false
var var_$2537_error : Throwable = null
var var_$2537_value : Long = 0L
var var_$2537_init : Boolean = false
var var_$2548_changed : Boolean = false
var var_$2548_unknown : Boolean = false
var var_$2548_error : Throwable = null
var var_$2548_value : Long = 0L
var var_$2548_init : Boolean = false
var var_$2547_changed : Boolean = false
var var_$2547_unknown : Boolean = false
var var_$2547_error : Throwable = null
var var_$2547_value : Long = 0L
var var_$2547_init : Boolean = false
var var_delayPeriod$2529_changed : Boolean = false
var var_delayPeriod$2529_unknown : Boolean = false
var var_delayPeriod$2529_error : Throwable = null
var var_delayPeriod$2529_value : Long = 0L
var var_delayPeriod$2529_init : Boolean = false
var var_delayPeriod$2527_changed : Boolean = true
var var_delayPeriod$2527_value : Long = -1L
var var_delayPeriod$2527_init : Boolean = true
var var_delayPeriod$2527_error : Throwable = null
var var_delayPeriod$2527_unknown : Boolean = false
var var_$2524_changed : Boolean = false
var var_$2524_unknown : Boolean = false
var var_$2524_error : Throwable = null
var var_$2524_value : Long = 0L
var var_$2524_init : Boolean = false
var var_$2524_ts : Long = 0L
var var_$2563_changed : Boolean = false
var var_$2563_value : Long = 0L
var var_$2563_init : Boolean = false
var var_$2563_unknown : Boolean = false
var var_$2563_error : Throwable = null
var var_$2560_changed : Boolean = false
var var_$2560_unknown : Boolean = false
var var_$2560_error : Throwable = null
var var_$2560_value : Long = 0L
var var_$2560_init : Boolean = false
var var_$2420_changed : Boolean = false
var var_$2420_unknown : Boolean = false
var var_$2420_error : Throwable = null
var var_$2420_value : Boolean = false
var var_$2420_init : Boolean = false
var var_$2512_changed : Boolean = false
var var_$2512_value : Long = 0L
var var_$2512_init : Boolean = false
var var_$2512_unknown : Boolean = false
var var_$2512_error : Throwable = null
var var_$2509_changed : Boolean = false
var var_$2509_unknown : Boolean = false
var var_$2509_error : Throwable = null
var var_$2509_value : Long = 0L
var var_$2509_init : Boolean = false
var var_$2327_changed : Boolean = false
var var_$2327_unknown : Boolean = false
var var_$2327_error : Throwable = null
var var_$2327_value : Long = 0L
var var_$1642_changed : Boolean = false
var var_$1642_unknown : Boolean = false
var var_$1642_error : Throwable = null
var var_$1642_value : Boolean = false
var var_$1642_init : Boolean = false
var var_isFinalFalseReset$1641_changed : Boolean = false
var var_isFinalFalseReset$1641_unknown : Boolean = false
var var_isFinalFalseReset$1641_error : Throwable = null
var var_isFinalFalseReset$1641_value : Boolean = false
var var_$1640_changed : Boolean = false
var var_$1640_lastValue : Boolean = false
var var_$1640_lastInit : Boolean = false
var var_$1640_lastError : Throwable = null
var var_$1640_init : Boolean = false
var var_$1640_ts : Long = 0L
var var_$1640_unknown : Boolean = false
var var_$1640_value : Boolean = false
var var_$1640_error : Throwable = null
var var_stillFulfillableReset$1639_changed : Boolean = false
var var_stillFulfillableReset$1639_lastValue : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1639_lastInit : Boolean = false
var var_stillFulfillableReset$1639_lastError : Throwable = null
var var_stillFulfillableReset$1639_unknown : Boolean = false
var var_stillFulfillableReset$1639_error : Throwable = null
var var_stillFulfillableReset$1639_value : (Boolean, Boolean) = (false, false)
var var_stillFulfillableReset$1639_init : Boolean = false
var var_stillFulfillableReset$1639_ts : Long = 0L
var var_value$1638_changed : Boolean = false
var var_value$1638_unknown : Boolean = false
var var_value$1638_error : Throwable = null
var var_value$1638_value : Boolean = false
var var_value$1638_init : Boolean = false
var var_$2523_changed : Boolean = false
var var_$2523_unknown : Boolean = false
var var_$2523_error : Throwable = null
var var_$2523_value : Boolean = false
var var_$2523_init : Boolean = false
var var_$2351_changed : Boolean = false
var var_$2351_unknown : Boolean = false
var var_$2351_error : Throwable = null
var var_$2351_value : Long = 0L
var var_final$2299_changed : Boolean = false
var var_final$2299_unknown : Boolean = false
var var_final$2299_error : Throwable = null
var var_final$2299_value : Boolean = false
var var_final$2299_init : Boolean = false
var var_safeDelay$1895_nextTs : Long = -1L
var var_safeDelay$2192_nextTs : Long = -1L

def chunk1() = {
var_$2315_changed = false
if ((var_event_changed)) {
if ((var_stillFulfillableReset$1639_ts == currTs && var_stillFulfillableReset$1639_lastInit) || (!(var_stillFulfillableReset$1639_ts == currTs) && var_stillFulfillableReset$1639_init)) {
var_$2315_changed = true
var_$2315_init = true
var_$2315_unknown = var_event_unknown
if ((var_$2315_unknown)) {
var_$2315_error = var_event_error
} else {
if ((var_stillFulfillableReset$1639_ts == currTs)) {
var_$2315_value = var_stillFulfillableReset$1639_lastValue
var_$2315_error = var_stillFulfillableReset$1639_lastError
} else {
var_$2315_value = var_stillFulfillableReset$1639_value
var_$2315_error = var_stillFulfillableReset$1639_error
}
}
}
}
var_lowerBoundX$1656_changed = false
if ((var_$2315_init)) {
if ((var_$2315_changed)) {
var_lowerBoundX$1656_unknown = (var_$2315_unknown)
if ((var_lowerBoundX$1656_unknown)) {
var_lowerBoundX$1656_error = UnknownEventError(null)
} else {
var_lowerBoundX$1656_error = null
try {
var_lowerBoundX$1656_value = var_$2309.apply((if((var_$2315_error == null)) {var_$2315_value} else {throw var_$2315_error}))
} catch {
case var_err : Throwable => {
var_lowerBoundX$1656_error = var_err
}
}
}
var_lowerBoundX$1656_init = true
var_lowerBoundX$1656_changed = true
}
}
if ((!(currTs == 0L))) {
var_minusStream$1883_changed = false
}
if ((var_$2499_changed)) {
var_minusStream$1883_lastValue = var_minusStream$1883_value
var_minusStream$1883_lastInit = var_minusStream$1883_init
var_minusStream$1883_lastError = var_minusStream$1883_error
var_minusStream$1883_value = var_$2499_value
var_minusStream$1883_init = true
var_minusStream$1883_ts = currTs
var_minusStream$1883_error = var_$2499_error
var_minusStream$1883_changed = true
var_minusStream$1883_unknown = var_$2499_unknown
}
var_mergedStream$1663_changed = false
if ((var_event_changed)) {
if ((var_minusStream$1883_ts == currTs && var_minusStream$1883_lastInit) || (!(var_minusStream$1883_ts == currTs) && var_minusStream$1883_init)) {
var_mergedStream$1663_changed = true
var_mergedStream$1663_unknown = var_event_unknown
if ((var_mergedStream$1663_unknown)) {
var_mergedStream$1663_error = var_event_error
} else {
if ((var_minusStream$1883_ts == currTs)) {
var_mergedStream$1663_value = var_minusStream$1883_lastValue
var_mergedStream$1663_error = var_minusStream$1883_lastError
} else {
var_mergedStream$1663_value = var_minusStream$1883_value
var_mergedStream$1663_error = var_minusStream$1883_error
}
}
}
}
var_$1660_changed = false
if ((var_minusStream$1883_changed) || (var_mergedStream$1663_changed)) {
var_$1660_changed = true
var_$1660_unknown = (var_minusStream$1883_unknown && var_mergedStream$1663_unknown)
if ((var_minusStream$1883_changed)) {
var_$1660_value = var_minusStream$1883_value
var_$1660_error = var_minusStream$1883_error
} else {
if ((var_mergedStream$1663_changed)) {
var_$1660_value = var_mergedStream$1663_value
var_$1660_error = var_mergedStream$1663_error
}
}
}
var_on$1659_changed = false
if ((var_event_changed) || (var_$1660_changed)) {
var_on$1659_error = null
try {
var_on$1659_unknown = true
var_on$1659_fval = var_$1909.apply((if((var_event_changed)) {EOSome((if((var_event_error == null)) {var_event_value} else {throw var_event_error}))} else {EONone()}), (if((var_$1660_changed)) {EOSome((if((var_$1660_error == null)) {var_$1660_value} else {throw var_$1660_error}))} else {EONone()}))
var_on$1659_unknown = false
if ((var_on$1659_fval.isDefined)) {
var_on$1659_changed = true
var_on$1659_newValue = var_on$1659_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1659_changed = true
var_on$1659_error = var_err
}
}
if ((var_on$1659_unknown) || (var_event_unknown && var_$1660_unknown)) {
var_on$1659_changed = true
var_on$1659_unknown = true
var_on$1659_error = UnknownEventError(var_on$1659_error)
}
if ((var_on$1659_changed)) {
var_on$1659_init = true
var_on$1659_value = var_on$1659_newValue
}
}
if ((!(currTs == 0L))) {
var_$1872_changed = false
}
if ((var_event_changed)) {
var_$1872_value = (var_$1872_value + 1L)
var_$1872_unknown = var_event_unknown
if ((!(var_$1872_error == null))) {
var_$1872_error = var_event_error
}
var_$1872_changed = true
}
var_$1975_changed = false
if ((var_lowerBoundX$1656_init && var_event_changed)) {
if ((var_lowerBoundX$1656_value) || (!(var_lowerBoundX$1656_error == null)) || (var_lowerBoundX$1656_unknown)) {
if ((!(var_lowerBoundX$1656_error == null))) {
var_$1975_error = var_lowerBoundX$1656_error
} else {
var_$1975_error = var_event_error
}
var_$1975_changed = true
var_$1975_ts = var_event_ts
var_$1975_unknown = (var_event_unknown || !(var_lowerBoundX$1656_error == null))
}
}
var_$1974_changed = false
if ((var_$1975_changed)) {
var_$1974_value = var_$1975_ts
var_$1974_init = true
var_$1974_unknown = var_$1975_unknown
if ((var_$1974_unknown)) {
var_$1974_error = var_$1975_error
} else {
var_$1974_error = null
}
var_$1974_changed = true
}
var_$1977_changed = false
if ((var_event_changed)) {
var_$1977_value = var_event_ts
var_$1977_init = true
var_$1977_unknown = var_event_unknown
if ((var_$1977_unknown)) {
var_$1977_error = var_event_error
} else {
var_$1977_error = null
}
var_$1977_changed = true
}
var_$2476_changed = false
if ((var_$1974_init && var_$1977_init)) {
if ((var_$1974_changed) || (var_$1977_changed)) {
var_$2476_unknown = (var_$1974_unknown && var_$1977_unknown)
if ((var_$2476_unknown)) {
var_$2476_error = UnknownEventError(null)
} else {
var_$2476_error = null
try {
var_$2476_value = ((if((var_$1974_error == null)) {var_$1974_value} else {throw var_$1974_error}) >= (if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}))
} catch {
case var_err : Throwable => {
var_$2476_error = var_err
}
}
}
var_$2476_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1777_changed = false
}
if ((var_$2476_changed)) {
var_$1777_value = var_$2476_value
var_$1777_init = true
var_$1777_error = var_$2476_error
var_$1777_changed = true
var_$1777_unknown = var_$2476_unknown
}
var_$1927_changed = false
if ((var_$1974_init && var_$1977_init)) {
if ((var_$1974_changed) || (var_$1977_changed)) {
var_$1927_unknown = (var_$1974_unknown && var_$1977_unknown)
if ((var_$1927_unknown)) {
var_$1927_error = UnknownEventError(null)
} else {
var_$1927_error = null
try {
var_$1927_value = ((if((var_$1974_error == null)) {var_$1974_value} else {throw var_$1974_error}) == (if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}))
} catch {
case var_err : Throwable => {
var_$1927_error = var_err
}
}
}
var_$1927_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1681_changed = false
}
if ((var_$1927_changed)) {
var_$1681_value = var_$1927_value
var_$1681_init = true
var_$1681_error = var_$1927_error
var_$1681_changed = true
var_$1681_unknown = var_$1927_unknown
}
if ((!(currTs == 0L))) {
var_$2184_changed = false
}
if ((var_$2499_changed)) {
var_$2184_value = var_$2499_value
var_$2184_init = true
var_$2184_error = var_$2499_error
var_$2184_changed = true
var_$2184_unknown = var_$2499_unknown
}
var_$1983_changed = false
if ((var_$1872_init && var_$2184_init)) {
if ((var_$1872_changed) || (var_$2184_changed)) {
var_$1983_unknown = (var_$1872_unknown && var_$2184_unknown)
if ((var_$1983_unknown)) {
var_$1983_error = UnknownEventError(null)
} else {
var_$1983_error = null
try {
var_$1983_value = ((if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}) - (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$1983_error = var_err
}
}
}
var_$1983_init = true
var_$1983_changed = true
}
}
var_$1736_changed = false
if ((var_$1681_init && var_$1983_init && var_$1872_init)) {
if ((var_$1681_changed) || (var_$1983_changed) || (var_$1872_changed)) {
var_$1736_unknown = (var_$1681_unknown && var_$1983_unknown && var_$1872_unknown)
if ((var_$1736_unknown)) {
var_$1736_error = UnknownEventError(null)
} else {
var_$1736_error = null
try {
var_$1736_value = (if ((if((var_$1681_error == null)) {var_$1681_value} else {throw var_$1681_error})) (if((var_$1983_error == null)) {var_$1983_value} else {throw var_$1983_error}) else (if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}))
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
var_$2035_changed = false
if ((var_event_changed)) {
if ((var_event_unknown)) {
var_$2035_error = UnknownEventError(var_event_error)
} else {
var_$2035_error = null
}
var_$2035_changed = var_event_changed
var_$2035_unknown = var_event_unknown
}
var_$2455_changed = false
if ((var_$1975_changed)) {
if ((var_$1975_unknown)) {
var_$2455_error = UnknownEventError(var_$1975_error)
} else {
var_$2455_error = null
}
var_$2455_changed = var_$1975_changed
var_$2455_unknown = var_$1975_unknown
}
var_mergeUnit2$1878_changed = false
if ((var_$2035_changed) || (var_$2455_changed)) {
var_mergeUnit2$1878_changed = true
var_mergeUnit2$1878_unknown = (var_$2035_unknown && var_$2455_unknown)
if ((var_$2035_changed)) {
var_mergeUnit2$1878_error = var_$2035_error
} else {
if ((var_$2455_changed)) {
var_mergeUnit2$1878_error = var_$2455_error
}
}
}
var_$1935_changed = false
if ((var_mergeUnit2$1878_changed)) {
if ((var_$1936_ts == currTs && var_$1936_lastInit) || (!(var_$1936_ts == currTs) && var_$1936_init)) {
var_$1935_changed = true
var_$1935_init = true
var_$1935_unknown = var_mergeUnit2$1878_unknown
if ((var_$1935_unknown)) {
var_$1935_error = var_mergeUnit2$1878_error
} else {
if ((var_$1936_ts == currTs)) {
var_$1935_value = var_$1936_lastValue
var_$1935_error = var_$1936_lastError
} else {
var_$1935_value = var_$1936_value
var_$1935_error = var_$1936_error
}
}
}
}
var_minusStream$1971_changed = false
if ((var_$1777_init && var_$1736_init && var_$1935_init)) {
if ((var_$1777_changed) || (var_$1736_changed) || (var_$1935_changed)) {
var_minusStream$1971_unknown = (var_$1777_unknown && var_$1736_unknown && var_$1935_unknown)
if ((var_minusStream$1971_unknown)) {
var_minusStream$1971_error = UnknownEventError(null)
} else {
var_minusStream$1971_error = null
try {
var_minusStream$1971_value = (if ((if((var_$1777_error == null)) {var_$1777_value} else {throw var_$1777_error})) (if((var_$1736_error == null)) {var_$1736_value} else {throw var_$1736_error}) else (if((var_$1935_error == null)) {var_$1935_value} else {throw var_$1935_error}))
} catch {
case var_err : Throwable => {
var_minusStream$1971_error = var_err
}
}
}
var_minusStream$1971_changed = true
}
}
var_$1936_changed = false
if ((var_minusStream$1971_changed) || (var_minusStream$1883_changed)) {
var_$1936_lastValue = var_$1936_value
var_$1936_lastInit = var_$1936_init
var_$1936_lastError = var_$1936_error
var_$1936_init = true
var_$1936_ts = currTs
var_$1936_changed = true
var_$1936_unknown = (var_minusStream$1971_unknown && var_minusStream$1883_unknown)
if ((var_minusStream$1971_changed)) {
var_$1936_value = var_minusStream$1971_value
var_$1936_error = var_minusStream$1971_error
} else {
if ((var_minusStream$1883_changed)) {
var_$1936_value = var_minusStream$1883_value
var_$1936_error = var_minusStream$1883_error
}
}
}
var_resetCount2$1915_changed = false
if ((var_$1872_init && var_$1936_init)) {
if ((var_$1872_changed) || (var_$1936_changed)) {
var_resetCount2$1915_unknown = (var_$1872_unknown && var_$1936_unknown)
if ((var_resetCount2$1915_unknown)) {
var_resetCount2$1915_error = UnknownEventError(null)
} else {
var_resetCount2$1915_error = null
try {
var_resetCount2$1915_value = ((if((var_$1872_error == null)) {var_$1872_value} else {throw var_$1872_error}) - (if((var_$1936_error == null)) {var_$1936_value} else {throw var_$1936_error}))
} catch {
case var_err : Throwable => {
var_resetCount2$1915_error = var_err
}
}
}
var_resetCount2$1915_init = true
var_resetCount2$1915_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1999_changed = false
}
if ((var_$2499_changed)) {
var_$1999_value = var_$2499_value
var_$1999_init = true
var_$1999_error = var_$2499_error
var_$1999_changed = true
var_$1999_unknown = var_$2499_unknown
}
var_$1669_changed = false
if ((var_resetCount2$1915_init && var_$1999_init)) {
if ((var_resetCount2$1915_changed) || (var_$1999_changed)) {
var_$1669_unknown = (var_resetCount2$1915_unknown && var_$1999_unknown)
if ((var_$1669_unknown)) {
var_$1669_error = UnknownEventError(null)
} else {
var_$1669_error = null
try {
var_$1669_value = var_aModuloBOr1if1$1701.apply((if((var_resetCount2$1915_error == null)) {var_resetCount2$1915_value} else {throw var_resetCount2$1915_error}), (if((var_$1999_error == null)) {var_$1999_value} else {throw var_$1999_error}))
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
var_$1913_changed = false
if ((var_$1669_init && var_$2184_init)) {
if ((var_$1669_changed) || (var_$2184_changed)) {
var_$1913_unknown = (var_$1669_unknown && var_$2184_unknown)
if ((var_$1913_unknown)) {
var_$1913_error = UnknownEventError(null)
} else {
var_$1913_error = null
try {
var_$1913_value = ((if((var_$1669_error == null)) {var_$1669_value} else {throw var_$1669_error}) == (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$1913_error = var_err
}
}
}
var_$1913_init = true
var_$1913_changed = true
}
}
var_$1951_changed = false
if ((var_event_changed)) {
if ((var_event_ts == currTs && var_event_lastInit) || (!(var_event_ts == currTs) && var_event_init)) {
var_$1951_changed = true
var_$1951_unknown = var_event_unknown
if ((var_$1951_unknown)) {
var_$1951_error = var_event_error
} else {
if ((var_event_ts == currTs)) {
var_$1951_error = var_event_lastError
} else {
var_$1951_error = var_event_error
}
}
}
}
var_$2568_changed = false
if ((var_$1951_changed)) {
var_$2568_value = false
if ((var_$1951_unknown)) {
var_$2568_error = UnknownEventError(var_$1951_error)
} else {
var_$2568_error = null
}
var_$2568_changed = var_$1951_changed
var_$2568_unknown = var_$1951_unknown
}
var_$1952_changed = false
if ((var_event_changed)) {
var_$1952_value = true
if ((var_event_unknown)) {
var_$1952_error = UnknownEventError(var_event_error)
} else {
var_$1952_error = null
}
var_$1952_changed = var_event_changed
var_$1952_unknown = var_event_unknown
}
if ((!(currTs == 0L))) {
var_$2571_changed = false
}
if ((var_$2241_changed)) {
var_$2571_value = var_$2241_value
var_$2571_init = true
var_$2571_error = var_$2241_error
var_$2571_changed = true
var_$2571_unknown = var_$2241_unknown
}
var_isFirst$1949_changed = false
if ((var_$2568_changed) || (var_$1952_changed) || (var_$2571_changed)) {
var_isFirst$1949_init = true
var_isFirst$1949_changed = true
var_isFirst$1949_unknown = (var_$2568_unknown && var_$1952_unknown && var_$2571_unknown)
if ((var_$2568_changed)) {
var_isFirst$1949_value = var_$2568_value
var_isFirst$1949_error = var_$2568_error
} else {
if ((var_$1952_changed)) {
var_isFirst$1949_value = var_$1952_value
var_isFirst$1949_error = var_$1952_error
} else {
if ((var_$2571_changed)) {
var_isFirst$1949_value = var_$2571_value
var_isFirst$1949_error = var_$2571_error
}
}
}
}
var_$1704_changed = false
if ((var_isFirst$1949_init)) {
if ((var_isFirst$1949_changed)) {
var_$1704_unknown = (var_isFirst$1949_unknown)
if ((var_$1704_unknown)) {
var_$1704_error = UnknownEventError(null)
} else {
var_$1704_error = null
try {
var_$1704_value = !((if((var_isFirst$1949_error == null)) {var_isFirst$1949_value} else {throw var_isFirst$1949_error}))
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
var_$1912_changed = false
if ((var_$1913_init && var_$1704_init)) {
if ((var_$1913_changed) || (var_$1704_changed)) {
var_$1912_unknown = (var_$1913_unknown && var_$1704_unknown)
if ((var_$1912_unknown)) {
var_$1912_error = UnknownEventError(null)
} else {
var_$1912_error = null
try {
var_$1912_value = ((if((var_$1913_error == null)) {var_$1913_value} else {throw var_$1913_error}) && (if((var_$1704_error == null)) {var_$1704_value} else {throw var_$1704_error}))
} catch {
case var_err : Throwable => {
var_$1912_error = var_err
}
}
}
var_$1912_init = true
var_$1912_changed = true
}
}
var_$1763_changed = false
if ((var_event_changed)) {
if ((var_$1655_ts == currTs && var_$1655_lastInit) || (!(var_$1655_ts == currTs) && var_$1655_init)) {
var_$1763_changed = true
var_$1763_init = true
var_$1763_unknown = var_event_unknown
if ((var_$1763_unknown)) {
var_$1763_error = var_event_error
} else {
if ((var_$1655_ts == currTs)) {
var_$1763_value = var_$1655_lastValue
var_$1763_error = var_$1655_lastError
} else {
var_$1763_value = var_$1655_value
var_$1763_error = var_$1655_error
}
}
}
}
if ((!(currTs == 0L))) {
var_$2463_changed = false
}
if ((var_$2499_changed)) {
var_$2463_value = var_$2499_value
var_$2463_init = true
var_$2463_error = var_$2499_error
var_$2463_changed = true
var_$2463_unknown = var_$2499_unknown
}
var_$1712_changed = false
if ((var_$1763_init && var_$2463_init)) {
if ((var_$1763_changed) || (var_$2463_changed)) {
var_$1712_unknown = (var_$1763_unknown && var_$2463_unknown)
if ((var_$1712_unknown)) {
var_$1712_error = UnknownEventError(null)
} else {
var_$1712_error = null
try {
var_$1712_value = ((if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}) + (if((var_$2463_error == null)) {var_$2463_value} else {throw var_$2463_error}))
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
if ((!(currTs == 0L))) {
var_$2086_changed = false
}
if ((var_$1853_changed)) {
var_$2086_value = var_$1853_value
var_$2086_init = true
var_$2086_error = var_$1853_error
var_$2086_changed = true
var_$2086_unknown = var_$1853_unknown
}
var_$2051_changed = false
if ((var_resetCount2$1915_init && var_$2184_init)) {
if ((var_resetCount2$1915_changed) || (var_$2184_changed)) {
var_$2051_unknown = (var_resetCount2$1915_unknown && var_$2184_unknown)
if ((var_$2051_unknown)) {
var_$2051_error = UnknownEventError(null)
} else {
var_$2051_error = null
try {
var_$2051_value = ((if((var_resetCount2$1915_error == null)) {var_resetCount2$1915_value} else {throw var_resetCount2$1915_error}) - (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2051_error = var_err
}
}
}
var_$2051_init = true
var_$2051_changed = true
}
}
var_$1854_changed = false
if ((var_$2051_init && var_$1999_init)) {
if ((var_$2051_changed) || (var_$1999_changed)) {
var_$1854_unknown = (var_$2051_unknown && var_$1999_unknown)
if ((var_$1854_unknown)) {
var_$1854_error = UnknownEventError(null)
} else {
var_$1854_error = null
try {
var_$1854_value = ((if((var_$2051_error == null)) {var_$2051_value} else {throw var_$2051_error}) % (if((var_$1999_error == null)) {var_$1999_value} else {throw var_$1999_error}))
} catch {
case var_err : Throwable => {
var_$1854_error = var_err
}
}
}
var_$1854_init = true
var_$1854_changed = true
}
}
var_$1963_changed = false
if ((var_$2086_init && var_$1854_init)) {
if ((var_$2086_changed) || (var_$1854_changed)) {
var_$1963_unknown = (var_$2086_unknown && var_$1854_unknown)
if ((var_$1963_unknown)) {
var_$1963_error = UnknownEventError(null)
} else {
var_$1963_error = null
try {
var_$1963_value = (if((var_$2086_error == null)) {var_$2086_value} else {throw var_$2086_error})((if((var_$1854_error == null)) {var_$1854_value} else {throw var_$1854_error}))
} catch {
case var_err : Throwable => {
var_$1963_error = var_err
}
}
}
var_$1963_init = true
var_$1963_changed = true
}
}
var_$1718_changed = false
if ((var_$1977_init && var_$1963_init)) {
if ((var_$1977_changed) || (var_$1963_changed)) {
var_$1718_unknown = (var_$1977_unknown && var_$1963_unknown)
if ((var_$1718_unknown)) {
var_$1718_error = UnknownEventError(null)
} else {
var_$1718_error = null
try {
var_$1718_value = ((if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}) - (if((var_$1963_error == null)) {var_$1963_value} else {throw var_$1963_error}))
} catch {
case var_err : Throwable => {
var_$1718_error = var_err
}
}
}
var_$1718_init = true
var_$1718_changed = true
}
}
var_$1765_changed = false
if ((var_$1718_init && var_minusStream$1883_init)) {
if ((var_$1718_changed) || (var_minusStream$1883_changed)) {
var_$1765_unknown = (var_$1718_unknown && var_minusStream$1883_unknown)
if ((var_$1765_unknown)) {
var_$1765_error = UnknownEventError(null)
} else {
var_$1765_error = null
try {
var_$1765_value = ((if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}) - (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
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
var_$1711_changed = false
if ((var_$1712_init && var_$1765_init)) {
if ((var_$1712_changed) || (var_$1765_changed)) {
var_$1711_unknown = (var_$1712_unknown && var_$1765_unknown)
if ((var_$1711_unknown)) {
var_$1711_error = UnknownEventError(null)
} else {
var_$1711_error = null
try {
var_$1711_value = var_max$1761.apply((if((var_$1712_error == null)) {var_$1712_value} else {throw var_$1712_error}), (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
} catch {
case var_err : Throwable => {
var_$1711_error = var_err
}
}
}
var_$1711_init = true
var_$1711_changed = true
}
}
var_$1762_changed = false
if ((var_$1763_init && var_$1765_init)) {
if ((var_$1763_changed) || (var_$1765_changed)) {
var_$1762_unknown = (var_$1763_unknown && var_$1765_unknown)
if ((var_$1762_unknown)) {
var_$1762_error = UnknownEventError(null)
} else {
var_$1762_error = null
try {
var_$1762_value = var_max$1761.apply((if((var_$1763_error == null)) {var_$1763_value} else {throw var_$1763_error}), (if((var_$1765_error == null)) {var_$1765_value} else {throw var_$1765_error}))
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
var_$1666_changed = false
if ((var_$1912_init && var_$1711_init && var_$1762_init)) {
if ((var_$1912_changed) || (var_$1711_changed) || (var_$1762_changed)) {
var_$1666_unknown = (var_$1912_unknown && var_$1711_unknown && var_$1762_unknown)
if ((var_$1666_unknown)) {
var_$1666_error = UnknownEventError(null)
} else {
var_$1666_error = null
try {
var_$1666_value = (if ((if((var_$1912_error == null)) {var_$1912_value} else {throw var_$1912_error})) (if((var_$1711_error == null)) {var_$1711_value} else {throw var_$1711_error}) else (if((var_$1762_error == null)) {var_$1762_value} else {throw var_$1762_error}))
} catch {
case var_err : Throwable => {
var_$1666_error = var_err
}
}
}
var_$1666_changed = true
}
}
var_lowerBoundX$1665_changed = false
if ((var_$1666_changed) || (var_$1765_changed)) {
var_lowerBoundX$1665_init = true
var_lowerBoundX$1665_changed = true
var_lowerBoundX$1665_unknown = (var_$1666_unknown && var_$1765_unknown)
if ((var_$1666_changed)) {
var_lowerBoundX$1665_value = var_$1666_value
var_lowerBoundX$1665_error = var_$1666_error
} else {
if ((var_$1765_changed)) {
var_lowerBoundX$1665_value = var_$1765_value
var_lowerBoundX$1665_error = var_$1765_error
}
}
}
var_$1655_changed = false
if ((var_lowerBoundX$1656_init && var_on$1659_init && var_lowerBoundX$1665_init)) {
if ((var_lowerBoundX$1656_changed) || (var_on$1659_changed) || (var_lowerBoundX$1665_changed)) {
var_$1655_lastValue = var_$1655_value
var_$1655_lastInit = var_$1655_init
var_$1655_lastError = var_$1655_error
var_$1655_unknown = (var_lowerBoundX$1656_unknown && var_on$1659_unknown && var_lowerBoundX$1665_unknown)
if ((var_$1655_unknown)) {
var_$1655_error = UnknownEventError(null)
} else {
var_$1655_error = null
try {
var_$1655_value = (if ((if((var_lowerBoundX$1656_error == null)) {var_lowerBoundX$1656_value} else {throw var_lowerBoundX$1656_error})) (if((var_on$1659_error == null)) {var_on$1659_value} else {throw var_on$1659_error}) else (if((var_lowerBoundX$1665_error == null)) {var_lowerBoundX$1665_value} else {throw var_lowerBoundX$1665_error}))
} catch {
case var_err : Throwable => {
var_$1655_error = var_err
}
}
}
var_$1655_init = true
var_$1655_ts = currTs
var_$1655_changed = true
}
}
var_$1654_changed = false
if ((var_$1655_init && var_$1963_init)) {
if ((var_$1655_changed) || (var_$1963_changed)) {
var_$1654_unknown = (var_$1655_unknown && var_$1963_unknown)
if ((var_$1654_unknown)) {
var_$1654_error = UnknownEventError(null)
} else {
var_$1654_error = null
try {
var_$1654_value = ((if((var_$1655_error == null)) {var_$1655_value} else {throw var_$1655_error}) + (if((var_$1963_error == null)) {var_$1963_value} else {throw var_$1963_error}))
} catch {
case var_err : Throwable => {
var_$1654_error = var_err
}
}
}
var_$1654_init = true
var_$1654_changed = true
}
}
var_safeDelay$1895_changed = false
if ((var_safeDelay$1895_nextTs == currTs)) {
var_safeDelay$1895_changed = true
var_safeDelay$1895_unknown = false
}
var_$1893_changed = false
if ((var_safeDelay$1895_changed)) {
if ((var_safeDelay$1895_unknown)) {
var_$1893_error = UnknownEventError(var_safeDelay$1895_error)
} else {
var_$1893_error = null
}
var_$1893_changed = var_safeDelay$1895_changed
var_$1893_unknown = var_safeDelay$1895_unknown
}
var_mergeUnit2$1890_changed = false
if ((var_$2035_changed) || (var_$1893_changed)) {
var_mergeUnit2$1890_ts = currTs
var_mergeUnit2$1890_changed = true
var_mergeUnit2$1890_unknown = (var_$2035_unknown && var_$1893_unknown)
if ((var_$2035_changed)) {
var_mergeUnit2$1890_error = var_$2035_error
} else {
if ((var_$1893_changed)) {
var_mergeUnit2$1890_error = var_$1893_error
}
}
}
var_$1889_changed = false
if ((var_mergeUnit2$1890_changed)) {
var_$1889_value = var_mergeUnit2$1890_ts
var_$1889_init = true
var_$1889_unknown = var_mergeUnit2$1890_unknown
if ((var_$1889_unknown)) {
var_$1889_error = var_mergeUnit2$1890_error
} else {
var_$1889_error = null
}
var_$1889_changed = true
}
var_$1653_changed = false
if ((var_$1654_init && var_$1889_init)) {
if ((var_$1654_changed) || (var_$1889_changed)) {
var_$1653_unknown = (var_$1654_unknown && var_$1889_unknown)
if ((var_$1653_unknown)) {
var_$1653_error = UnknownEventError(null)
} else {
var_$1653_error = null
try {
var_$1653_value = ((if((var_$1654_error == null)) {var_$1654_value} else {throw var_$1654_error}) <= (if((var_$1889_error == null)) {var_$1889_value} else {throw var_$1889_error}))
} catch {
case var_err : Throwable => {
var_$1653_error = var_err
}
}
}
var_$1653_init = true
var_$1653_changed = true
}
}
if ((!(currTs == 0L))) {
var_$2542_changed = false
}
if ((var_$2499_changed)) {
var_$2542_lastValue = var_$2542_value
var_$2542_lastInit = var_$2542_init
var_$2542_lastError = var_$2542_error
var_$2542_value = var_$2499_value
var_$2542_init = true
var_$2542_ts = currTs
var_$2542_error = var_$2499_error
var_$2542_changed = true
var_$2542_unknown = var_$2499_unknown
}
var_mergedStream$1908_changed = false
if ((var_event_changed)) {
if ((var_$2542_ts == currTs && var_$2542_lastInit) || (!(var_$2542_ts == currTs) && var_$2542_init)) {
var_mergedStream$1908_changed = true
var_mergedStream$1908_unknown = var_event_unknown
if ((var_mergedStream$1908_unknown)) {
var_mergedStream$1908_error = var_event_error
} else {
if ((var_$2542_ts == currTs)) {
var_mergedStream$1908_value = var_$2542_lastValue
var_mergedStream$1908_error = var_$2542_lastError
} else {
var_mergedStream$1908_value = var_$2542_value
var_mergedStream$1908_error = var_$2542_error
}
}
}
}
var_$1905_changed = false
if ((var_$2542_changed) || (var_mergedStream$1908_changed)) {
var_$1905_changed = true
var_$1905_unknown = (var_$2542_unknown && var_mergedStream$1908_unknown)
if ((var_$2542_changed)) {
var_$1905_value = var_$2542_value
var_$1905_error = var_$2542_error
} else {
if ((var_mergedStream$1908_changed)) {
var_$1905_value = var_mergedStream$1908_value
var_$1905_error = var_mergedStream$1908_error
}
}
}
var_on$1904_changed = false
if ((var_event_changed) || (var_$1905_changed)) {
var_on$1904_error = null
try {
var_on$1904_unknown = true
var_on$1904_fval = var_$1909.apply((if((var_event_changed)) {EOSome((if((var_event_error == null)) {var_event_value} else {throw var_event_error}))} else {EONone()}), (if((var_$1905_changed)) {EOSome((if((var_$1905_error == null)) {var_$1905_value} else {throw var_$1905_error}))} else {EONone()}))
var_on$1904_unknown = false
if ((var_on$1904_fval.isDefined)) {
var_on$1904_changed = true
var_on$1904_newValue = var_on$1904_fval.get
}
} catch {
case var_err : Throwable => {
var_on$1904_changed = true
var_on$1904_error = var_err
}
}
if ((var_on$1904_unknown) || (var_event_unknown && var_$1905_unknown)) {
var_on$1904_changed = true
var_on$1904_unknown = true
var_on$1904_error = UnknownEventError(var_on$1904_error)
}
if ((var_on$1904_changed)) {
var_on$1904_init = true
var_on$1904_value = var_on$1904_newValue
}
}
var_$2003_changed = false
if ((var_event_changed)) {
if ((var_$1900_ts == currTs && var_$1900_lastInit) || (!(var_$1900_ts == currTs) && var_$1900_init)) {
var_$2003_changed = true
var_$2003_init = true
var_$2003_unknown = var_event_unknown
if ((var_$2003_unknown)) {
var_$2003_error = var_event_error
} else {
if ((var_$1900_ts == currTs)) {
var_$2003_value = var_$1900_lastValue
var_$2003_error = var_$1900_lastError
} else {
var_$2003_value = var_$1900_value
var_$2003_error = var_$1900_error
}
}
}
}
var_$1956_changed = false
if ((var_$2003_init && var_$2463_init)) {
if ((var_$2003_changed) || (var_$2463_changed)) {
var_$1956_unknown = (var_$2003_unknown && var_$2463_unknown)
if ((var_$1956_unknown)) {
var_$1956_error = UnknownEventError(null)
} else {
var_$1956_error = null
try {
var_$1956_value = ((if((var_$2003_error == null)) {var_$2003_value} else {throw var_$2003_error}) + (if((var_$2463_error == null)) {var_$2463_value} else {throw var_$2463_error}))
} catch {
case var_err : Throwable => {
var_$1956_error = var_err
}
}
}
var_$1956_init = true
var_$1956_changed = true
}
}
var_$1955_changed = false
if ((var_$1956_init && var_$1718_init)) {
if ((var_$1956_changed) || (var_$1718_changed)) {
var_$1955_unknown = (var_$1956_unknown && var_$1718_unknown)
if ((var_$1955_unknown)) {
var_$1955_error = UnknownEventError(null)
} else {
var_$1955_error = null
try {
var_$1955_value = var_min$2001.apply((if((var_$1956_error == null)) {var_$1956_value} else {throw var_$1956_error}), (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}))
} catch {
case var_err : Throwable => {
var_$1955_error = var_err
}
}
}
var_$1955_init = true
var_$1955_changed = true
}
}
var_$2002_changed = false
if ((var_$2003_init && var_$1718_init)) {
if ((var_$2003_changed) || (var_$1718_changed)) {
var_$2002_unknown = (var_$2003_unknown && var_$1718_unknown)
if ((var_$2002_unknown)) {
var_$2002_error = UnknownEventError(null)
} else {
var_$2002_error = null
try {
var_$2002_value = var_min$2001.apply((if((var_$2003_error == null)) {var_$2003_value} else {throw var_$2003_error}), (if((var_$1718_error == null)) {var_$1718_value} else {throw var_$1718_error}))
} catch {
case var_err : Throwable => {
var_$2002_error = var_err
}
}
}
var_$2002_init = true
var_$2002_changed = true
}
}
var_$1911_changed = false
if ((var_$1912_init && var_$1955_init && var_$2002_init)) {
if ((var_$1912_changed) || (var_$1955_changed) || (var_$2002_changed)) {
var_$1911_unknown = (var_$1912_unknown && var_$1955_unknown && var_$2002_unknown)
if ((var_$1911_unknown)) {
var_$1911_error = UnknownEventError(null)
} else {
var_$1911_error = null
try {
var_$1911_value = (if ((if((var_$1912_error == null)) {var_$1912_value} else {throw var_$1912_error})) (if((var_$1955_error == null)) {var_$1955_value} else {throw var_$1955_error}) else (if((var_$2002_error == null)) {var_$2002_value} else {throw var_$2002_error}))
} catch {
case var_err : Throwable => {
var_$1911_error = var_err
}
}
}
var_$1911_changed = true
}
}
var_upperBoundX$1910_changed = false
if ((var_$1911_changed) || (var_$1718_changed)) {
var_upperBoundX$1910_init = true
var_upperBoundX$1910_changed = true
var_upperBoundX$1910_unknown = (var_$1911_unknown && var_$1718_unknown)
if ((var_$1911_changed)) {
var_upperBoundX$1910_value = var_$1911_value
var_upperBoundX$1910_error = var_$1911_error
} else {
if ((var_$1718_changed)) {
var_upperBoundX$1910_value = var_$1718_value
var_upperBoundX$1910_error = var_$1718_error
}
}
}
var_$1900_changed = false
if ((var_lowerBoundX$1656_init && var_on$1904_init && var_upperBoundX$1910_init)) {
if ((var_lowerBoundX$1656_changed) || (var_on$1904_changed) || (var_upperBoundX$1910_changed)) {
var_$1900_lastValue = var_$1900_value
var_$1900_lastInit = var_$1900_init
var_$1900_lastError = var_$1900_error
var_$1900_unknown = (var_lowerBoundX$1656_unknown && var_on$1904_unknown && var_upperBoundX$1910_unknown)
if ((var_$1900_unknown)) {
var_$1900_error = UnknownEventError(null)
} else {
var_$1900_error = null
try {
var_$1900_value = (if ((if((var_lowerBoundX$1656_error == null)) {var_lowerBoundX$1656_value} else {throw var_lowerBoundX$1656_error})) (if((var_on$1904_error == null)) {var_on$1904_value} else {throw var_on$1904_error}) else (if((var_upperBoundX$1910_error == null)) {var_upperBoundX$1910_value} else {throw var_upperBoundX$1910_error}))
} catch {
case var_err : Throwable => {
var_$1900_error = var_err
}
}
}
var_$1900_init = true
var_$1900_ts = currTs
var_$1900_changed = true
}
}
var_$1899_changed = false
if ((var_$1900_init && var_$1963_init)) {
if ((var_$1900_changed) || (var_$1963_changed)) {
var_$1899_unknown = (var_$1900_unknown && var_$1963_unknown)
if ((var_$1899_unknown)) {
var_$1899_error = UnknownEventError(null)
} else {
var_$1899_error = null
try {
var_$1899_value = ((if((var_$1900_error == null)) {var_$1900_value} else {throw var_$1900_error}) + (if((var_$1963_error == null)) {var_$1963_value} else {throw var_$1963_error}))
} catch {
case var_err : Throwable => {
var_$1899_error = var_err
}
}
}
var_$1899_init = true
var_$1899_changed = true
}
}
var_$1898_changed = false
if ((var_$1899_init && var_minusStream$1883_init)) {
if ((var_$1899_changed) || (var_minusStream$1883_changed)) {
var_$1898_unknown = (var_$1899_unknown && var_minusStream$1883_unknown)
if ((var_$1898_unknown)) {
var_$1898_error = UnknownEventError(null)
} else {
var_$1898_error = null
try {
var_$1898_value = ((if((var_$1899_error == null)) {var_$1899_value} else {throw var_$1899_error}) + (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$1898_error = var_err
}
}
}
var_$1898_init = true
var_$1898_changed = true
}
}
var_$1896_changed = false
if ((var_$1889_init && var_$1898_init)) {
if ((var_$1889_changed) || (var_$1898_changed)) {
var_$1896_unknown = (var_$1889_unknown && var_$1898_unknown)
if ((var_$1896_unknown)) {
var_$1896_error = UnknownEventError(null)
} else {
var_$1896_error = null
try {
var_$1896_value = ((if((var_$1889_error == null)) {var_$1889_value} else {throw var_$1889_error}) <= (if((var_$1898_error == null)) {var_$1898_value} else {throw var_$1898_error}))
} catch {
case var_err : Throwable => {
var_$1896_error = var_err
}
}
}
var_$1896_init = true
var_$1896_changed = true
}
}
var_$1652_changed = false
if ((var_$1653_init && var_$1896_init)) {
if ((var_$1653_changed) || (var_$1896_changed)) {
var_$1652_unknown = (var_$1653_unknown && var_$1896_unknown)
if ((var_$1652_unknown)) {
var_$1652_error = UnknownEventError(null)
} else {
var_$1652_error = null
try {
var_$1652_value = ((if((var_$1653_error == null)) {var_$1653_value} else {throw var_$1653_error}) && (if((var_$1896_error == null)) {var_$1896_value} else {throw var_$1896_error}))
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
if ((!(currTs == 0L))) {
var_$2125_changed = false
}
if ((var_$2259_changed)) {
var_$2125_value = var_$2259_value
var_$2125_init = true
var_$2125_error = var_$2259_error
var_$2125_changed = true
var_$2125_unknown = var_$2259_unknown
}
if ((!(currTs == 0L))) {
var_$2128_changed = false
}
if ((var_$2259_changed)) {
var_$2128_value = var_$2259_value
var_$2128_init = true
var_$2128_error = var_$2259_error
var_$2128_changed = true
var_$2128_unknown = var_$2259_unknown
}
var_$1651_changed = false
if ((var_$1652_init && var_$2125_init && var_$2128_init)) {
if ((var_$1652_changed) || (var_$2125_changed) || (var_$2128_changed)) {
var_$1651_unknown = (var_$1652_unknown && var_$2125_unknown && var_$2128_unknown)
if ((var_$1651_unknown)) {
var_$1651_error = UnknownEventError(null)
} else {
var_$1651_error = null
try {
var_$1651_value = (if ((if((var_$1652_error == null)) {var_$1652_value} else {throw var_$1652_error})) (if((var_$2125_error == null)) {var_$2125_value} else {throw var_$2125_error}) else (if((var_$2128_error == null)) {var_$2128_value} else {throw var_$2128_error}))
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
if ((!(currTs == 0L))) {
var_defaultTime$2154_changed = false
}
if ((var_$1977_changed)) {
var_defaultTime$2154_value = var_$1977_value
var_defaultTime$2154_init = true
var_defaultTime$2154_error = var_$1977_error
var_defaultTime$2154_changed = true
var_defaultTime$2154_unknown = var_$1977_unknown
}
var_latestSpanEventTimes$2145_changed = false
if ((var_defaultTime$2154_init && var_minusStream$1883_init)) {
if ((var_defaultTime$2154_changed) || (var_minusStream$1883_changed)) {
var_latestSpanEventTimes$2145_unknown = (var_defaultTime$2154_unknown && var_minusStream$1883_unknown)
if ((var_latestSpanEventTimes$2145_unknown)) {
var_latestSpanEventTimes$2145_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$2145_error = null
try {
var_latestSpanEventTimes$2145_value = ((if((var_defaultTime$2154_error == null)) {var_defaultTime$2154_value} else {throw var_defaultTime$2154_error}) == (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$2145_error = var_err
}
}
}
var_latestSpanEventTimes$2145_init = true
var_latestSpanEventTimes$2145_changed = true
}
}
if ((!(currTs == 0L))) {
var_$2151_changed = false
}
if ((var_$2152_changed)) {
var_$2151_value = var_$2152_value
var_$2151_init = true
var_$2151_error = var_$2152_error
var_$2151_changed = true
var_$2151_unknown = var_$2152_unknown
}
var_latestSpanEventTimes$2150_changed = false
if ((var_$2151_init && var_defaultTime$2154_init)) {
if ((var_$2151_changed) || (var_defaultTime$2154_changed)) {
var_latestSpanEventTimes$2150_unknown = (var_$2151_unknown && var_defaultTime$2154_unknown)
if ((var_latestSpanEventTimes$2150_unknown)) {
var_latestSpanEventTimes$2150_error = UnknownEventError(null)
} else {
var_latestSpanEventTimes$2150_error = null
try {
var_latestSpanEventTimes$2150_value = ((if((var_$2151_error == null)) {var_$2151_value} else {throw var_$2151_error}) :+ (if((var_defaultTime$2154_error == null)) {var_defaultTime$2154_value} else {throw var_defaultTime$2154_error}))
} catch {
case var_err : Throwable => {
var_latestSpanEventTimes$2150_error = var_err
}
}
}
var_latestSpanEventTimes$2150_init = true
var_latestSpanEventTimes$2150_changed = true
}
}
var_$2161_changed = false
if ((var_event_changed)) {
if ((var_$2541_ts == currTs && var_$2541_lastInit) || (!(var_$2541_ts == currTs) && var_$2541_init)) {
var_$2161_changed = true
var_$2161_init = true
var_$2161_unknown = var_event_unknown
if ((var_$2161_unknown)) {
var_$2161_error = var_event_error
} else {
if ((var_$2541_ts == currTs)) {
var_$2161_value = var_$2541_lastValue
var_$2161_error = var_$2541_lastError
} else {
var_$2161_value = var_$2541_value
var_$2161_error = var_$2541_error
}
}
}
}
var_$2160_changed = false
if ((var_$2161_init)) {
if ((var_$2161_changed)) {
var_$2160_unknown = (var_$2161_unknown)
if ((var_$2160_unknown)) {
var_$2160_error = UnknownEventError(null)
} else {
var_$2160_error = null
try {
var_$2160_value = (if((var_$2161_error == null)) {var_$2161_value} else {throw var_$2161_error}).size
} catch {
case var_err : Throwable => {
var_$2160_error = var_err
}
}
}
var_$2160_init = true
var_$2160_changed = true
}
}
var_$2159_changed = false
if ((var_$2160_init && var_$2184_init)) {
if ((var_$2160_changed) || (var_$2184_changed)) {
var_$2159_unknown = (var_$2160_unknown && var_$2184_unknown)
if ((var_$2159_unknown)) {
var_$2159_error = UnknownEventError(null)
} else {
var_$2159_error = null
try {
var_$2159_value = ((if((var_$2160_error == null)) {var_$2160_value} else {throw var_$2160_error}) > (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2159_error = var_err
}
}
}
var_$2159_init = true
var_$2159_changed = true
}
}
var_$2166_changed = false
if ((var_defaultTime$2154_changed)) {
if ((var_$2541_ts == currTs && var_$2541_lastInit) || (!(var_$2541_ts == currTs) && var_$2541_init)) {
var_$2166_changed = true
var_$2166_init = true
var_$2166_unknown = var_defaultTime$2154_unknown
if ((var_$2166_unknown)) {
var_$2166_error = var_defaultTime$2154_error
} else {
if ((var_$2541_ts == currTs)) {
var_$2166_value = var_$2541_lastValue
var_$2166_error = var_$2541_lastError
} else {
var_$2166_value = var_$2541_value
var_$2166_error = var_$2541_error
}
}
}
}
var_$2165_changed = false
if ((var_$2166_init)) {
if ((var_$2166_changed)) {
var_$2165_unknown = (var_$2166_unknown)
if ((var_$2165_unknown)) {
var_$2165_error = UnknownEventError(null)
} else {
var_$2165_error = null
try {
var_$2165_value = (if((var_$2166_error == null)) {var_$2166_value} else {throw var_$2166_error}).tail
} catch {
case var_err : Throwable => {
var_$2165_error = var_err
}
}
}
var_$2165_init = true
var_$2165_changed = true
}
}
var_$2158_changed = false
if ((var_$2159_init && var_$2165_init && var_$2161_init)) {
if ((var_$2159_changed) || (var_$2165_changed) || (var_$2161_changed)) {
var_$2158_unknown = (var_$2159_unknown && var_$2165_unknown && var_$2161_unknown)
if ((var_$2158_unknown)) {
var_$2158_error = UnknownEventError(null)
} else {
var_$2158_error = null
try {
var_$2158_value = (if ((if((var_$2159_error == null)) {var_$2159_value} else {throw var_$2159_error})) (if((var_$2165_error == null)) {var_$2165_value} else {throw var_$2165_error}) else (if((var_$2161_error == null)) {var_$2161_value} else {throw var_$2161_error}))
} catch {
case var_err : Throwable => {
var_$2158_error = var_err
}
}
}
var_$2158_init = true
var_$2158_changed = true
}
}
var_$2157_changed = false
if ((var_$2158_init && var_defaultTime$2154_init)) {
if ((var_$2158_changed) || (var_defaultTime$2154_changed)) {
var_$2157_unknown = (var_$2158_unknown && var_defaultTime$2154_unknown)
if ((var_$2157_unknown)) {
var_$2157_error = UnknownEventError(null)
} else {
var_$2157_error = null
try {
var_$2157_value = ((if((var_$2158_error == null)) {var_$2158_value} else {throw var_$2158_error}) :+ (if((var_defaultTime$2154_error == null)) {var_defaultTime$2154_value} else {throw var_defaultTime$2154_error}))
} catch {
case var_err : Throwable => {
var_$2157_error = var_err
}
}
}
var_$2157_changed = true
}
}
if ((!(currTs == 0L))) {
var_latestSpanEventTimes$2156_changed = false
}
if ((var_$2157_changed)) {
var_latestSpanEventTimes$2156_value = var_$2157_value
var_latestSpanEventTimes$2156_init = true
var_latestSpanEventTimes$2156_error = var_$2157_error
var_latestSpanEventTimes$2156_changed = true
var_latestSpanEventTimes$2156_unknown = var_$2157_unknown
}
var_$2541_changed = false
if ((var_latestSpanEventTimes$2145_init && var_latestSpanEventTimes$2150_init && var_latestSpanEventTimes$2156_init)) {
if ((var_latestSpanEventTimes$2145_changed) || (var_latestSpanEventTimes$2150_changed) || (var_latestSpanEventTimes$2156_changed)) {
var_$2541_lastValue = var_$2541_value
var_$2541_lastInit = var_$2541_init
var_$2541_lastError = var_$2541_error
var_$2541_unknown = (var_latestSpanEventTimes$2145_unknown && var_latestSpanEventTimes$2150_unknown && var_latestSpanEventTimes$2156_unknown)
if ((var_$2541_unknown)) {
var_$2541_error = UnknownEventError(null)
} else {
var_$2541_error = null
try {
var_$2541_value = (if ((if((var_latestSpanEventTimes$2145_error == null)) {var_latestSpanEventTimes$2145_value} else {throw var_latestSpanEventTimes$2145_error})) (if((var_latestSpanEventTimes$2150_error == null)) {var_latestSpanEventTimes$2150_value} else {throw var_latestSpanEventTimes$2150_error}) else (if((var_latestSpanEventTimes$2156_error == null)) {var_latestSpanEventTimes$2156_value} else {throw var_latestSpanEventTimes$2156_error}))
} catch {
case var_err : Throwable => {
var_$2541_error = var_err
}
}
}
var_$2541_init = true
var_$2541_ts = currTs
var_$2541_changed = true
}
}
var_$2143_changed = false
if ((var_$2541_init)) {
if ((var_$2541_changed)) {
var_$2143_unknown = (var_$2541_unknown)
if ((var_$2143_unknown)) {
var_$2143_error = UnknownEventError(null)
} else {
var_$2143_error = null
try {
var_$2143_value = (if((var_$2541_error == null)) {var_$2541_value} else {throw var_$2541_error}).size
} catch {
case var_err : Throwable => {
var_$2143_error = var_err
}
}
}
var_$2143_init = true
var_$2143_changed = true
}
}
var_$2142_changed = false
if ((var_$2143_init && var_$2184_init)) {
if ((var_$2143_changed) || (var_$2184_changed)) {
var_$2142_unknown = (var_$2143_unknown && var_$2184_unknown)
if ((var_$2142_unknown)) {
var_$2142_error = UnknownEventError(null)
} else {
var_$2142_error = null
try {
var_$2142_value = ((if((var_$2143_error == null)) {var_$2143_value} else {throw var_$2143_error}) > (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2142_error = var_err
}
}
}
var_$2142_init = true
var_$2142_changed = true
}
}
var_$2540_changed = false
if ((var_$2541_init)) {
if ((var_$2541_changed)) {
var_$2540_unknown = (var_$2541_unknown)
if ((var_$2540_unknown)) {
var_$2540_error = UnknownEventError(null)
} else {
var_$2540_error = null
try {
var_$2540_value = (var_head$2183.apply(((if((var_$2541_error == null)) {var_$2541_value} else {throw var_$2541_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2540_error = var_err
}
}
}
var_$2540_init = true
var_$2540_changed = true
}
}
var_$2180_changed = false
if ((var_$2540_init && var_$2184_init)) {
if ((var_$2540_changed) || (var_$2184_changed)) {
var_$2180_unknown = (var_$2540_unknown && var_$2184_unknown)
if ((var_$2180_unknown)) {
var_$2180_error = UnknownEventError(null)
} else {
var_$2180_error = null
try {
var_$2180_value = ((if((var_$2540_error == null)) {var_$2540_value} else {throw var_$2540_error}) + (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2180_error = var_err
}
}
}
var_$2180_init = true
var_$2180_changed = true
}
}
var_safeDelay$2192_changed = false
if ((var_safeDelay$2192_nextTs == currTs)) {
var_safeDelay$2192_changed = true
var_safeDelay$2192_unknown = false
}
var_$2190_changed = false
if ((var_safeDelay$2192_changed)) {
if ((var_safeDelay$2192_unknown)) {
var_$2190_error = UnknownEventError(var_safeDelay$2192_error)
} else {
var_$2190_error = null
}
var_$2190_changed = var_safeDelay$2192_changed
var_$2190_unknown = var_safeDelay$2192_unknown
}
var_mergeUnit2$2187_changed = false
if ((var_$2035_changed) || (var_$2190_changed)) {
var_mergeUnit2$2187_ts = currTs
var_mergeUnit2$2187_changed = true
var_mergeUnit2$2187_unknown = (var_$2035_unknown && var_$2190_unknown)
if ((var_$2035_changed)) {
var_mergeUnit2$2187_error = var_$2035_error
} else {
if ((var_$2190_changed)) {
var_mergeUnit2$2187_error = var_$2190_error
}
}
}
var_$2186_changed = false
if ((var_mergeUnit2$2187_changed)) {
var_$2186_value = var_mergeUnit2$2187_ts
var_$2186_init = true
var_$2186_unknown = var_mergeUnit2$2187_unknown
if ((var_$2186_unknown)) {
var_$2186_error = var_mergeUnit2$2187_error
} else {
var_$2186_error = null
}
var_$2186_changed = true
}
var_$2179_changed = false
if ((var_$2180_init && var_$2186_init)) {
if ((var_$2180_changed) || (var_$2186_changed)) {
var_$2179_unknown = (var_$2180_unknown && var_$2186_unknown)
if ((var_$2179_unknown)) {
var_$2179_error = UnknownEventError(null)
} else {
var_$2179_error = null
try {
var_$2179_value = ((if((var_$2180_error == null)) {var_$2180_value} else {throw var_$2180_error}) <= (if((var_$2186_error == null)) {var_$2186_value} else {throw var_$2186_error}))
} catch {
case var_err : Throwable => {
var_$2179_error = var_err
}
}
}
var_$2179_init = true
var_$2179_changed = true
}
}
if ((!(currTs == 0L))) {
var_delayPeriod$2525_changed = false
}
if ((var_$2241_changed)) {
var_delayPeriod$2525_value = var_$2241_value
var_delayPeriod$2525_init = true
var_delayPeriod$2525_error = var_$2241_error
var_delayPeriod$2525_changed = true
var_delayPeriod$2525_unknown = var_$2241_unknown
}
var_$2214_changed = false
if ((var_$2540_init && var_$2542_init)) {
if ((var_$2540_changed) || (var_$2542_changed)) {
var_$2214_unknown = (var_$2540_unknown && var_$2542_unknown)
if ((var_$2214_unknown)) {
var_$2214_error = UnknownEventError(null)
} else {
var_$2214_error = null
try {
var_$2214_value = ((if((var_$2540_error == null)) {var_$2540_value} else {throw var_$2540_error}) + (if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}))
} catch {
case var_err : Throwable => {
var_$2214_error = var_err
}
}
}
var_$2214_init = true
var_$2214_changed = true
}
}
var_$2213_changed = false
if ((var_$2214_init && var_$2186_init)) {
if ((var_$2214_changed) || (var_$2186_changed)) {
var_$2213_unknown = (var_$2214_unknown && var_$2186_unknown)
if ((var_$2213_unknown)) {
var_$2213_error = UnknownEventError(null)
} else {
var_$2213_error = null
try {
var_$2213_value = ((if((var_$2214_error == null)) {var_$2214_value} else {throw var_$2214_error}) >= (if((var_$2186_error == null)) {var_$2186_value} else {throw var_$2186_error}))
} catch {
case var_err : Throwable => {
var_$2213_error = var_err
}
}
}
var_$2213_init = true
var_$2213_changed = true
}
}
var_$2193_changed = false
if ((var_delayPeriod$2525_init && var_$2213_init)) {
if ((var_delayPeriod$2525_changed) || (var_$2213_changed)) {
var_$2193_unknown = (var_delayPeriod$2525_unknown && var_$2213_unknown)
if ((var_$2193_unknown)) {
var_$2193_error = UnknownEventError(null)
} else {
var_$2193_error = null
try {
var_$2193_value = ((if((var_delayPeriod$2525_error == null)) {var_delayPeriod$2525_value} else {throw var_delayPeriod$2525_error}) || (if((var_$2213_error == null)) {var_$2213_value} else {throw var_$2213_error}))
} catch {
case var_err : Throwable => {
var_$2193_error = var_err
}
}
}
var_$2193_init = true
var_$2193_changed = true
}
}
var_$2178_changed = false
if ((var_$2179_init && var_$2193_init)) {
if ((var_$2179_changed) || (var_$2193_changed)) {
var_$2178_unknown = (var_$2179_unknown && var_$2193_unknown)
if ((var_$2178_unknown)) {
var_$2178_error = UnknownEventError(null)
} else {
var_$2178_error = null
try {
var_$2178_value = ((if((var_$2179_error == null)) {var_$2179_value} else {throw var_$2179_error}) && (if((var_$2193_error == null)) {var_$2193_value} else {throw var_$2193_error}))
} catch {
case var_err : Throwable => {
var_$2178_error = var_err
}
}
}
var_$2178_init = true
var_$2178_changed = true
}
}
var_$2177_changed = false
if ((var_$2178_init && var_$2125_init && var_$2128_init)) {
if ((var_$2178_changed) || (var_$2125_changed) || (var_$2128_changed)) {
var_$2177_unknown = (var_$2178_unknown && var_$2125_unknown && var_$2128_unknown)
if ((var_$2177_unknown)) {
var_$2177_error = UnknownEventError(null)
} else {
var_$2177_error = null
try {
var_$2177_value = (if ((if((var_$2178_error == null)) {var_$2178_value} else {throw var_$2178_error})) (if((var_$2125_error == null)) {var_$2125_value} else {throw var_$2125_error}) else (if((var_$2128_error == null)) {var_$2128_value} else {throw var_$2128_error}))
} catch {
case var_err : Throwable => {
var_$2177_error = var_err
}
}
}
var_$2177_init = true
var_$2177_changed = true
}
}
var_$2209_changed = false
if ((var_$2193_init && var_$2125_init && var_$2128_init)) {
if ((var_$2193_changed) || (var_$2125_changed) || (var_$2128_changed)) {
var_$2209_unknown = (var_$2193_unknown && var_$2125_unknown && var_$2128_unknown)
if ((var_$2209_unknown)) {
var_$2209_error = UnknownEventError(null)
} else {
var_$2209_error = null
try {
var_$2209_value = (if ((if((var_$2193_error == null)) {var_$2193_value} else {throw var_$2193_error})) (if((var_$2125_error == null)) {var_$2125_value} else {throw var_$2125_error}) else (if((var_$2128_error == null)) {var_$2128_value} else {throw var_$2128_error}))
} catch {
case var_err : Throwable => {
var_$2209_error = var_err
}
}
}
var_$2209_init = true
var_$2209_changed = true
}
}
var_$2141_changed = false
if ((var_$2142_init && var_$2177_init && var_$2209_init)) {
if ((var_$2142_changed) || (var_$2177_changed) || (var_$2209_changed)) {
var_$2141_unknown = (var_$2142_unknown && var_$2177_unknown && var_$2209_unknown)
if ((var_$2141_unknown)) {
var_$2141_error = UnknownEventError(null)
} else {
var_$2141_error = null
try {
var_$2141_value = (if ((if((var_$2142_error == null)) {var_$2142_value} else {throw var_$2142_error})) (if((var_$2177_error == null)) {var_$2177_value} else {throw var_$2177_error}) else (if((var_$2209_error == null)) {var_$2209_value} else {throw var_$2209_error}))
} catch {
case var_err : Throwable => {
var_$2141_error = var_err
}
}
}
var_$2141_init = true
var_$2141_ts = currTs
var_$2141_changed = true
}
}
var_$2140_changed = false
if ((var_$2141_init)) {
if ((var_$2141_changed)) {
var_$2140_unknown = (var_$2141_unknown)
if ((var_$2140_unknown)) {
var_$2140_error = UnknownEventError(null)
} else {
var_$2140_error = null
try {
var_$2140_value = var_$2309.apply((if((var_$2141_error == null)) {var_$2141_value} else {throw var_$2141_error}))
} catch {
case var_err : Throwable => {
var_$2140_error = var_err
}
}
}
var_$2140_init = true
var_$2140_changed = true
}
}
var_$2228_changed = false
if ((var_$2141_init)) {
if ((var_$2141_changed)) {
var_$2228_unknown = (var_$2141_unknown)
if ((var_$2228_unknown)) {
var_$2228_error = UnknownEventError(null)
} else {
var_$2228_error = null
try {
var_$2228_value = var_$2244.apply((if((var_$2141_error == null)) {var_$2141_value} else {throw var_$2141_error}))
} catch {
case var_err : Throwable => {
var_$2228_error = var_err
}
}
}
var_$2228_init = true
var_$2228_changed = true
}
}
var_$2227_changed = false
if ((var_$2228_init)) {
if ((var_$2228_changed)) {
var_$2227_unknown = (var_$2228_unknown)
if ((var_$2227_unknown)) {
var_$2227_error = UnknownEventError(null)
} else {
var_$2227_error = null
try {
var_$2227_value = !((if((var_$2228_error == null)) {var_$2228_value} else {throw var_$2228_error}))
} catch {
case var_err : Throwable => {
var_$2227_error = var_err
}
}
}
var_$2227_init = true
var_$2227_changed = true
}
}
var_$2139_changed = false
if ((var_$2140_init && var_$2227_init)) {
if ((var_$2140_changed) || (var_$2227_changed)) {
var_$2139_unknown = (var_$2140_unknown && var_$2227_unknown)
if ((var_$2139_unknown)) {
var_$2139_error = UnknownEventError(null)
} else {
var_$2139_error = null
try {
var_$2139_value = ((if((var_$2140_error == null)) {var_$2140_value} else {throw var_$2140_error}) && (if((var_$2227_error == null)) {var_$2227_value} else {throw var_$2227_error}))
} catch {
case var_err : Throwable => {
var_$2139_error = var_err
}
}
}
var_$2139_init = true
var_$2139_changed = true
}
}
var_$2234_changed = false
if ((var_$2141_changed)) {
if ((var_$2235_ts == currTs && var_$2235_lastInit) || (!(var_$2235_ts == currTs) && var_$2235_init)) {
var_$2234_changed = true
var_$2234_init = true
var_$2234_unknown = var_$2141_unknown
if ((var_$2234_unknown)) {
var_$2234_error = var_$2141_error
} else {
if ((var_$2235_ts == currTs)) {
var_$2234_value = var_$2235_lastValue
var_$2234_error = var_$2235_lastError
} else {
var_$2234_value = var_$2235_value
var_$2234_error = var_$2235_error
}
}
}
}
var_$2237_changed = false
if ((var_$2140_init && var_delayPeriod$2525_init)) {
if ((var_$2140_changed) || (var_delayPeriod$2525_changed)) {
var_$2237_unknown = (var_$2140_unknown && var_delayPeriod$2525_unknown)
if ((var_$2237_unknown)) {
var_$2237_error = UnknownEventError(null)
} else {
var_$2237_error = null
try {
var_$2237_value = ((if((var_$2140_error == null)) {var_$2140_value} else {throw var_$2140_error}) == (if((var_delayPeriod$2525_error == null)) {var_delayPeriod$2525_value} else {throw var_delayPeriod$2525_error}))
} catch {
case var_err : Throwable => {
var_$2237_error = var_err
}
}
}
var_$2237_init = true
var_$2237_changed = true
}
}
var_$2242_changed = false
if ((var_$2228_init && var_$2571_init)) {
if ((var_$2228_changed) || (var_$2571_changed)) {
var_$2242_unknown = (var_$2228_unknown && var_$2571_unknown)
if ((var_$2242_unknown)) {
var_$2242_error = UnknownEventError(null)
} else {
var_$2242_error = null
try {
var_$2242_value = ((if((var_$2228_error == null)) {var_$2228_value} else {throw var_$2228_error}) == (if((var_$2571_error == null)) {var_$2571_value} else {throw var_$2571_error}))
} catch {
case var_err : Throwable => {
var_$2242_error = var_err
}
}
}
var_$2242_init = true
var_$2242_changed = true
}
}
var_$2236_changed = false
if ((var_$2237_init && var_$2242_init)) {
if ((var_$2237_changed) || (var_$2242_changed)) {
var_$2236_unknown = (var_$2237_unknown && var_$2242_unknown)
if ((var_$2236_unknown)) {
var_$2236_error = UnknownEventError(null)
} else {
var_$2236_error = null
try {
var_$2236_value = ((if((var_$2237_error == null)) {var_$2237_value} else {throw var_$2237_error}) && (if((var_$2242_error == null)) {var_$2242_value} else {throw var_$2242_error}))
} catch {
case var_err : Throwable => {
var_$2236_error = var_err
}
}
}
var_$2236_init = true
var_$2236_changed = true
}
}
var_isFinalFalse$2233_changed = false
if ((var_$2234_init && var_$2236_init)) {
if ((var_$2234_changed) || (var_$2236_changed)) {
var_isFinalFalse$2233_unknown = (var_$2234_unknown && var_$2236_unknown)
if ((var_isFinalFalse$2233_unknown)) {
var_isFinalFalse$2233_error = UnknownEventError(null)
} else {
var_isFinalFalse$2233_error = null
try {
var_isFinalFalse$2233_value = ((if((var_$2234_error == null)) {var_$2234_value} else {throw var_$2234_error}) || (if((var_$2236_error == null)) {var_$2236_value} else {throw var_$2236_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$2233_error = var_err
}
}
}
var_isFinalFalse$2233_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$2257_changed = false
}
if ((var_isFinalFalse$2233_changed)) {
var_isFinalFalseReset$2257_lastValue = var_isFinalFalseReset$2257_value
var_isFinalFalseReset$2257_lastInit = var_isFinalFalseReset$2257_init
var_isFinalFalseReset$2257_lastError = var_isFinalFalseReset$2257_error
var_isFinalFalseReset$2257_value = var_isFinalFalse$2233_value
var_isFinalFalseReset$2257_init = true
var_isFinalFalseReset$2257_ts = currTs
var_isFinalFalseReset$2257_error = var_isFinalFalse$2233_error
var_isFinalFalseReset$2257_changed = true
var_isFinalFalseReset$2257_unknown = var_isFinalFalse$2233_unknown
}
var_prev$2231_changed = false
if ((var_isFinalFalseReset$2257_changed)) {
if ((var_isFinalFalseReset$2257_ts == currTs && var_isFinalFalseReset$2257_lastInit) || (!(var_isFinalFalseReset$2257_ts == currTs) && var_isFinalFalseReset$2257_init)) {
var_prev$2231_changed = true
var_prev$2231_init = true
var_prev$2231_unknown = var_isFinalFalseReset$2257_unknown
if ((var_prev$2231_unknown)) {
var_prev$2231_error = var_isFinalFalseReset$2257_error
} else {
if ((var_isFinalFalseReset$2257_ts == currTs)) {
var_prev$2231_value = var_isFinalFalseReset$2257_lastValue
var_prev$2231_error = var_isFinalFalseReset$2257_lastError
} else {
var_prev$2231_value = var_isFinalFalseReset$2257_value
var_prev$2231_error = var_isFinalFalseReset$2257_error
}
}
}
}
var_$2230_changed = false
if ((var_prev$2231_init)) {
if ((var_prev$2231_changed)) {
var_$2230_unknown = (var_prev$2231_unknown)
if ((var_$2230_unknown)) {
var_$2230_error = UnknownEventError(null)
} else {
var_$2230_error = null
try {
var_$2230_value = !((if((var_prev$2231_error == null)) {var_prev$2231_value} else {throw var_prev$2231_error}))
} catch {
case var_err : Throwable => {
var_$2230_error = var_err
}
}
}
var_$2230_init = true
var_$2230_changed = true
}
}
var_$2138_changed = false
if ((var_$2139_init && var_$2230_init)) {
if ((var_$2139_changed) || (var_$2230_changed)) {
var_$2138_unknown = (var_$2139_unknown && var_$2230_unknown)
if ((var_$2138_unknown)) {
var_$2138_error = UnknownEventError(null)
} else {
var_$2138_error = null
try {
var_$2138_value = ((if((var_$2139_error == null)) {var_$2139_value} else {throw var_$2139_error}) && (if((var_$2230_error == null)) {var_$2230_value} else {throw var_$2230_error}))
} catch {
case var_err : Throwable => {
var_$2138_error = var_err
}
}
}
var_$2138_init = true
var_$2138_changed = true
}
}
var_$2253_changed = false
if ((var_$2141_changed)) {
var_$2253_value = var_$2141_ts
var_$2253_init = true
var_$2253_unknown = var_$2141_unknown
if ((var_$2253_unknown)) {
var_$2253_error = var_$2141_error
} else {
var_$2253_error = null
}
var_$2253_changed = true
}
var_$2248_changed = false
if ((var_isFinalFalseReset$2257_changed)) {
if ((var_$2249_ts == currTs && var_$2249_lastInit) || (!(var_$2249_ts == currTs) && var_$2249_init)) {
var_$2248_changed = true
var_$2248_init = true
var_$2248_unknown = var_isFinalFalseReset$2257_unknown
if ((var_$2248_unknown)) {
var_$2248_error = var_isFinalFalseReset$2257_error
} else {
if ((var_$2249_ts == currTs)) {
var_$2248_value = var_$2249_lastValue
var_$2248_error = var_$2249_lastError
} else {
var_$2248_value = var_$2249_value
var_$2248_error = var_$2249_error
}
}
}
}
var_finalFalseSince$2137_changed = false
if ((var_$2138_init && var_$2253_init && var_$2248_init)) {
if ((var_$2138_changed) || (var_$2253_changed) || (var_$2248_changed)) {
var_finalFalseSince$2137_unknown = (var_$2138_unknown && var_$2253_unknown && var_$2248_unknown)
if ((var_finalFalseSince$2137_unknown)) {
var_finalFalseSince$2137_error = UnknownEventError(null)
} else {
var_finalFalseSince$2137_error = null
try {
var_finalFalseSince$2137_value = (if ((if((var_$2138_error == null)) {var_$2138_value} else {throw var_$2138_error})) (if((var_$2253_error == null)) {var_$2253_value} else {throw var_$2253_error}) else (if((var_$2248_error == null)) {var_$2248_value} else {throw var_$2248_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$2137_error = var_err
}
}
}
var_finalFalseSince$2137_changed = true
}
}
if ((!(currTs == 0L))) {
var_$2249_changed = false
}
if ((var_finalFalseSince$2137_changed)) {
var_$2249_lastValue = var_$2249_value
var_$2249_lastInit = var_$2249_init
var_$2249_lastError = var_$2249_error
var_$2249_value = var_finalFalseSince$2137_value
var_$2249_init = true
var_$2249_ts = currTs
var_$2249_error = var_finalFalseSince$2137_error
var_$2249_changed = true
var_$2249_unknown = var_finalFalseSince$2137_unknown
}
var_$2135_changed = false
if ((var_$2249_init && var_$2542_init)) {
if ((var_$2249_changed) || (var_$2542_changed)) {
var_$2135_unknown = (var_$2249_unknown && var_$2542_unknown)
if ((var_$2135_unknown)) {
var_$2135_error = UnknownEventError(null)
} else {
var_$2135_error = null
try {
var_$2135_value = ((if((var_$2249_error == null)) {var_$2249_value} else {throw var_$2249_error}) + (if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}))
} catch {
case var_err : Throwable => {
var_$2135_error = var_err
}
}
}
var_$2135_init = true
var_$2135_changed = true
}
}
var_$2134_changed = false
if ((var_$2135_init && var_$2253_init)) {
if ((var_$2135_changed) || (var_$2253_changed)) {
var_$2134_unknown = (var_$2135_unknown && var_$2253_unknown)
if ((var_$2134_unknown)) {
var_$2134_error = UnknownEventError(null)
} else {
var_$2134_error = null
try {
var_$2134_value = ((if((var_$2135_error == null)) {var_$2135_value} else {throw var_$2135_error}) < (if((var_$2253_error == null)) {var_$2253_value} else {throw var_$2253_error}))
} catch {
case var_err : Throwable => {
var_$2134_error = var_err
}
}
}
var_$2134_init = true
var_$2134_changed = true
}
}
var_isFinalFalseReset$2133_changed = false
if ((var_$2134_init && var_$2571_init && var_isFinalFalseReset$2257_init)) {
if ((var_$2134_changed) || (var_$2571_changed) || (var_isFinalFalseReset$2257_changed)) {
var_isFinalFalseReset$2133_unknown = (var_$2134_unknown && var_$2571_unknown && var_isFinalFalseReset$2257_unknown)
if ((var_isFinalFalseReset$2133_unknown)) {
var_isFinalFalseReset$2133_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$2133_error = null
try {
var_isFinalFalseReset$2133_value = (if ((if((var_$2134_error == null)) {var_$2134_value} else {throw var_$2134_error})) (if((var_$2571_error == null)) {var_$2571_value} else {throw var_$2571_error}) else (if((var_isFinalFalseReset$2257_error == null)) {var_isFinalFalseReset$2257_value} else {throw var_isFinalFalseReset$2257_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$2133_error = var_err
}
}
}
var_isFinalFalseReset$2133_changed = true
}
}
var_$2235_changed = false
if ((var_isFinalFalseReset$2133_changed) || (var_isFinalFalseReset$2257_changed)) {
var_$2235_lastValue = var_$2235_value
var_$2235_lastInit = var_$2235_init
var_$2235_lastError = var_$2235_error
var_$2235_init = true
var_$2235_ts = currTs
var_$2235_changed = true
var_$2235_unknown = (var_isFinalFalseReset$2133_unknown && var_isFinalFalseReset$2257_unknown)
if ((var_isFinalFalseReset$2133_changed)) {
var_$2235_value = var_isFinalFalseReset$2133_value
var_$2235_error = var_isFinalFalseReset$2133_error
} else {
if ((var_isFinalFalseReset$2257_changed)) {
var_$2235_value = var_isFinalFalseReset$2257_value
var_$2235_error = var_isFinalFalseReset$2257_error
}
}
}
var_stillFulfillableReset$2131_changed = false
if ((var_$2235_init && var_$2128_init && var_$2141_init)) {
if ((var_$2235_changed) || (var_$2128_changed) || (var_$2141_changed)) {
var_stillFulfillableReset$2131_unknown = (var_$2235_unknown && var_$2128_unknown && var_$2141_unknown)
if ((var_stillFulfillableReset$2131_unknown)) {
var_stillFulfillableReset$2131_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$2131_error = null
try {
var_stillFulfillableReset$2131_value = (if ((if((var_$2235_error == null)) {var_$2235_value} else {throw var_$2235_error})) (if((var_$2128_error == null)) {var_$2128_value} else {throw var_$2128_error}) else (if((var_$2141_error == null)) {var_$2141_value} else {throw var_$2141_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$2131_error = var_err
}
}
}
var_stillFulfillableReset$2131_init = true
var_stillFulfillableReset$2131_changed = true
}
}
var_$1650_changed = false
if ((var_$1651_init && var_stillFulfillableReset$2131_init)) {
if ((var_$1651_changed) || (var_stillFulfillableReset$2131_changed)) {
var_$1650_unknown = (var_$1651_unknown && var_stillFulfillableReset$2131_unknown)
if ((var_$1650_unknown)) {
var_$1650_error = UnknownEventError(null)
} else {
var_$1650_error = null
try {
var_$1650_value = var_fourValuedConjunction$2261.apply((if((var_$1651_error == null)) {var_$1651_value} else {throw var_$1651_error}), (if((var_stillFulfillableReset$2131_error == null)) {var_stillFulfillableReset$2131_value} else {throw var_stillFulfillableReset$2131_error}))
} catch {
case var_err : Throwable => {
var_$1650_error = var_err
}
}
}
var_$1650_changed = true
}
}
if ((!(currTs == 0L))) {
var_res$1649_changed = false
}
if ((var_$1650_changed)) {
var_res$1649_value = var_$1650_value
var_res$1649_init = true
var_res$1649_ts = currTs
var_res$1649_error = var_$1650_error
var_res$1649_changed = true
var_res$1649_unknown = var_$1650_unknown
}
var_$1648_changed = false
if ((var_res$1649_init)) {
if ((var_res$1649_changed)) {
var_$1648_unknown = (var_res$1649_unknown)
if ((var_$1648_unknown)) {
var_$1648_error = UnknownEventError(null)
} else {
var_$1648_error = null
try {
var_$1648_value = var_$2309.apply((if((var_res$1649_error == null)) {var_res$1649_value} else {throw var_res$1649_error}))
} catch {
case var_err : Throwable => {
var_$1648_error = var_err
}
}
}
var_$1648_init = true
var_$1648_changed = true
}
}
var_$2265_changed = false
if ((var_res$1649_init)) {
if ((var_res$1649_changed)) {
var_$2265_unknown = (var_res$1649_unknown)
if ((var_$2265_unknown)) {
var_$2265_error = UnknownEventError(null)
} else {
var_$2265_error = null
try {
var_$2265_value = var_$2244.apply((if((var_res$1649_error == null)) {var_res$1649_value} else {throw var_res$1649_error}))
} catch {
case var_err : Throwable => {
var_$2265_error = var_err
}
}
}
var_$2265_init = true
var_$2265_changed = true
}
}
var_$2264_changed = false
if ((var_$2265_init)) {
if ((var_$2265_changed)) {
var_$2264_unknown = (var_$2265_unknown)
if ((var_$2264_unknown)) {
var_$2264_error = UnknownEventError(null)
} else {
var_$2264_error = null
try {
var_$2264_value = !((if((var_$2265_error == null)) {var_$2265_value} else {throw var_$2265_error}))
} catch {
case var_err : Throwable => {
var_$2264_error = var_err
}
}
}
var_$2264_init = true
var_$2264_changed = true
}
}
var_$1647_changed = false
if ((var_$1648_init && var_$2264_init)) {
if ((var_$1648_changed) || (var_$2264_changed)) {
var_$1647_unknown = (var_$1648_unknown && var_$2264_unknown)
if ((var_$1647_unknown)) {
var_$1647_error = UnknownEventError(null)
} else {
var_$1647_error = null
try {
var_$1647_value = ((if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}) && (if((var_$2264_error == null)) {var_$2264_value} else {throw var_$2264_error}))
} catch {
case var_err : Throwable => {
var_$1647_error = var_err
}
}
}
var_$1647_init = true
var_$1647_changed = true
}
}
var_$2271_changed = false
if ((var_res$1649_changed)) {
if ((var_$1640_ts == currTs && var_$1640_lastInit) || (!(var_$1640_ts == currTs) && var_$1640_init)) {
var_$2271_changed = true
var_$2271_init = true
var_$2271_unknown = var_res$1649_unknown
if ((var_$2271_unknown)) {
var_$2271_error = var_res$1649_error
} else {
if ((var_$1640_ts == currTs)) {
var_$2271_value = var_$1640_lastValue
var_$2271_error = var_$1640_lastError
} else {
var_$2271_value = var_$1640_value
var_$2271_error = var_$1640_error
}
}
}
}
var_$2274_changed = false
if ((var_$1648_init && var_delayPeriod$2525_init)) {
if ((var_$1648_changed) || (var_delayPeriod$2525_changed)) {
var_$2274_unknown = (var_$1648_unknown && var_delayPeriod$2525_unknown)
if ((var_$2274_unknown)) {
var_$2274_error = UnknownEventError(null)
} else {
var_$2274_error = null
try {
var_$2274_value = ((if((var_$1648_error == null)) {var_$1648_value} else {throw var_$1648_error}) == (if((var_delayPeriod$2525_error == null)) {var_delayPeriod$2525_value} else {throw var_delayPeriod$2525_error}))
} catch {
case var_err : Throwable => {
var_$2274_error = var_err
}
}
}
var_$2274_init = true
var_$2274_changed = true
}
}
var_$2279_changed = false
if ((var_$2265_init && var_$2571_init)) {
if ((var_$2265_changed) || (var_$2571_changed)) {
var_$2279_unknown = (var_$2265_unknown && var_$2571_unknown)
if ((var_$2279_unknown)) {
var_$2279_error = UnknownEventError(null)
} else {
var_$2279_error = null
try {
var_$2279_value = ((if((var_$2265_error == null)) {var_$2265_value} else {throw var_$2265_error}) == (if((var_$2571_error == null)) {var_$2571_value} else {throw var_$2571_error}))
} catch {
case var_err : Throwable => {
var_$2279_error = var_err
}
}
}
var_$2279_init = true
var_$2279_changed = true
}
}
var_$2273_changed = false
if ((var_$2274_init && var_$2279_init)) {
if ((var_$2274_changed) || (var_$2279_changed)) {
var_$2273_unknown = (var_$2274_unknown && var_$2279_unknown)
if ((var_$2273_unknown)) {
var_$2273_error = UnknownEventError(null)
} else {
var_$2273_error = null
try {
var_$2273_value = ((if((var_$2274_error == null)) {var_$2274_value} else {throw var_$2274_error}) && (if((var_$2279_error == null)) {var_$2279_value} else {throw var_$2279_error}))
} catch {
case var_err : Throwable => {
var_$2273_error = var_err
}
}
}
var_$2273_init = true
var_$2273_changed = true
}
}
var_isFinalFalse$2270_changed = false
if ((var_$2271_init && var_$2273_init)) {
if ((var_$2271_changed) || (var_$2273_changed)) {
var_isFinalFalse$2270_unknown = (var_$2271_unknown && var_$2273_unknown)
if ((var_isFinalFalse$2270_unknown)) {
var_isFinalFalse$2270_error = UnknownEventError(null)
} else {
var_isFinalFalse$2270_error = null
try {
var_isFinalFalse$2270_value = ((if((var_$2271_error == null)) {var_$2271_value} else {throw var_$2271_error}) || (if((var_$2273_error == null)) {var_$2273_value} else {throw var_$2273_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalse$2270_error = var_err
}
}
}
var_isFinalFalse$2270_changed = true
}
}
if ((!(currTs == 0L))) {
var_isFinalFalseReset$2294_changed = false
}
if ((var_isFinalFalse$2270_changed)) {
var_isFinalFalseReset$2294_lastValue = var_isFinalFalseReset$2294_value
var_isFinalFalseReset$2294_lastInit = var_isFinalFalseReset$2294_init
var_isFinalFalseReset$2294_lastError = var_isFinalFalseReset$2294_error
var_isFinalFalseReset$2294_value = var_isFinalFalse$2270_value
var_isFinalFalseReset$2294_init = true
var_isFinalFalseReset$2294_ts = currTs
var_isFinalFalseReset$2294_error = var_isFinalFalse$2270_error
var_isFinalFalseReset$2294_changed = true
var_isFinalFalseReset$2294_unknown = var_isFinalFalse$2270_unknown
}
var_prev$2268_changed = false
if ((var_isFinalFalseReset$2294_changed)) {
if ((var_isFinalFalseReset$2294_ts == currTs && var_isFinalFalseReset$2294_lastInit) || (!(var_isFinalFalseReset$2294_ts == currTs) && var_isFinalFalseReset$2294_init)) {
var_prev$2268_changed = true
var_prev$2268_init = true
var_prev$2268_unknown = var_isFinalFalseReset$2294_unknown
if ((var_prev$2268_unknown)) {
var_prev$2268_error = var_isFinalFalseReset$2294_error
} else {
if ((var_isFinalFalseReset$2294_ts == currTs)) {
var_prev$2268_value = var_isFinalFalseReset$2294_lastValue
var_prev$2268_error = var_isFinalFalseReset$2294_lastError
} else {
var_prev$2268_value = var_isFinalFalseReset$2294_value
var_prev$2268_error = var_isFinalFalseReset$2294_error
}
}
}
}
var_$2267_changed = false
if ((var_prev$2268_init)) {
if ((var_prev$2268_changed)) {
var_$2267_unknown = (var_prev$2268_unknown)
if ((var_$2267_unknown)) {
var_$2267_error = UnknownEventError(null)
} else {
var_$2267_error = null
try {
var_$2267_value = !((if((var_prev$2268_error == null)) {var_prev$2268_value} else {throw var_prev$2268_error}))
} catch {
case var_err : Throwable => {
var_$2267_error = var_err
}
}
}
var_$2267_init = true
var_$2267_changed = true
}
}
var_$1646_changed = false
if ((var_$1647_init && var_$2267_init)) {
if ((var_$1647_changed) || (var_$2267_changed)) {
var_$1646_unknown = (var_$1647_unknown && var_$2267_unknown)
if ((var_$1646_unknown)) {
var_$1646_error = UnknownEventError(null)
} else {
var_$1646_error = null
try {
var_$1646_value = ((if((var_$1647_error == null)) {var_$1647_value} else {throw var_$1647_error}) && (if((var_$2267_error == null)) {var_$2267_value} else {throw var_$2267_error}))
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
var_$2284_changed = false
if ((var_res$1649_changed)) {
var_$2284_value = var_res$1649_ts
var_$2284_init = true
var_$2284_unknown = var_res$1649_unknown
if ((var_$2284_unknown)) {
var_$2284_error = var_res$1649_error
} else {
var_$2284_error = null
}
var_$2284_changed = true
}
}
def chunk2() = {
var_$2285_changed = false
if ((var_isFinalFalseReset$2294_changed)) {
if ((var_$1644_ts == currTs && var_$1644_lastInit) || (!(var_$1644_ts == currTs) && var_$1644_init)) {
var_$2285_changed = true
var_$2285_init = true
var_$2285_unknown = var_isFinalFalseReset$2294_unknown
if ((var_$2285_unknown)) {
var_$2285_error = var_isFinalFalseReset$2294_error
} else {
if ((var_$1644_ts == currTs)) {
var_$2285_value = var_$1644_lastValue
var_$2285_error = var_$1644_lastError
} else {
var_$2285_value = var_$1644_value
var_$2285_error = var_$1644_error
}
}
}
}
var_finalFalseSince$1645_changed = false
if ((var_$1646_init && var_$2284_init && var_$2285_init)) {
if ((var_$1646_changed) || (var_$2284_changed) || (var_$2285_changed)) {
var_finalFalseSince$1645_unknown = (var_$1646_unknown && var_$2284_unknown && var_$2285_unknown)
if ((var_finalFalseSince$1645_unknown)) {
var_finalFalseSince$1645_error = UnknownEventError(null)
} else {
var_finalFalseSince$1645_error = null
try {
var_finalFalseSince$1645_value = (if ((if((var_$1646_error == null)) {var_$1646_value} else {throw var_$1646_error})) (if((var_$2284_error == null)) {var_$2284_value} else {throw var_$2284_error}) else (if((var_$2285_error == null)) {var_$2285_value} else {throw var_$2285_error}))
} catch {
case var_err : Throwable => {
var_finalFalseSince$1645_error = var_err
}
}
}
var_finalFalseSince$1645_changed = true
}
}
if ((!(currTs == 0L))) {
var_$1644_changed = false
}
if ((var_finalFalseSince$1645_changed)) {
var_$1644_lastValue = var_$1644_value
var_$1644_lastInit = var_$1644_init
var_$1644_lastError = var_$1644_error
var_$1644_value = var_finalFalseSince$1645_value
var_$1644_init = true
var_$1644_ts = currTs
var_$1644_error = var_finalFalseSince$1645_error
var_$1644_changed = true
var_$1644_unknown = var_finalFalseSince$1645_unknown
}
var_$1643_changed = false
if ((var_$1644_init && var_$2542_init)) {
if ((var_$1644_changed) || (var_$2542_changed)) {
var_$1643_unknown = (var_$1644_unknown && var_$2542_unknown)
if ((var_$1643_unknown)) {
var_$1643_error = UnknownEventError(null)
} else {
var_$1643_error = null
try {
var_$1643_value = ((if((var_$1644_error == null)) {var_$1644_value} else {throw var_$1644_error}) + (if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}))
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
var_$2551_changed = false
if ((var_$2541_init)) {
if ((var_$2541_changed)) {
var_$2551_unknown = (var_$2541_unknown)
if ((var_$2551_unknown)) {
var_$2551_error = UnknownEventError(null)
} else {
var_$2551_error = null
try {
var_$2551_value = (if((var_$2541_error == null)) {var_$2541_value} else {throw var_$2541_error}).tail
} catch {
case var_err : Throwable => {
var_$2551_error = var_err
}
}
}
var_$2551_init = true
var_$2551_changed = true
}
}
var_$2550_changed = false
if ((var_$2551_init)) {
if ((var_$2551_changed)) {
var_$2550_unknown = (var_$2551_unknown)
if ((var_$2550_unknown)) {
var_$2550_error = UnknownEventError(null)
} else {
var_$2550_error = null
try {
var_$2550_value = (var_head$2183.apply(((if((var_$2551_error == null)) {var_$2551_value} else {throw var_$2551_error})).asInstanceOf[List[Any]])).asInstanceOf[Long]
} catch {
case var_err : Throwable => {
var_$2550_error = var_err
}
}
}
var_$2550_init = true
var_$2550_changed = true
}
}
var_$2549_changed = false
if ((var_$2550_init && var_$2542_init)) {
if ((var_$2550_changed) || (var_$2542_changed)) {
var_$2549_unknown = (var_$2550_unknown && var_$2542_unknown)
if ((var_$2549_unknown)) {
var_$2549_error = UnknownEventError(null)
} else {
var_$2549_error = null
try {
var_$2549_value = ((if((var_$2550_error == null)) {var_$2550_value} else {throw var_$2550_error}) + (if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}))
} catch {
case var_err : Throwable => {
var_$2549_error = var_err
}
}
}
var_$2549_init = true
var_$2549_changed = true
}
}
var_$2429_changed = false
if ((var_resetCount2$1915_init && var_$1999_init)) {
if ((var_resetCount2$1915_changed) || (var_$1999_changed)) {
var_$2429_unknown = (var_resetCount2$1915_unknown && var_$1999_unknown)
if ((var_$2429_unknown)) {
var_$2429_error = UnknownEventError(null)
} else {
var_$2429_error = null
try {
var_$2429_value = ((if((var_resetCount2$1915_error == null)) {var_resetCount2$1915_value} else {throw var_resetCount2$1915_error}) % (if((var_$1999_error == null)) {var_$1999_value} else {throw var_$1999_error}))
} catch {
case var_err : Throwable => {
var_$2429_error = var_err
}
}
}
var_$2429_init = true
var_$2429_changed = true
}
}
var_$2428_changed = false
if ((var_$2429_init && var_minusStream$1883_init)) {
if ((var_$2429_changed) || (var_minusStream$1883_changed)) {
var_$2428_unknown = (var_$2429_unknown && var_minusStream$1883_unknown)
if ((var_$2428_unknown)) {
var_$2428_error = UnknownEventError(null)
} else {
var_$2428_error = null
try {
var_$2428_value = ((if((var_$2429_error == null)) {var_$2429_value} else {throw var_$2429_error}) == (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$2428_error = var_err
}
}
}
var_$2428_init = true
var_$2428_changed = true
}
}
var_$2427_changed = false
if ((var_$2428_init && var_$2463_init && var_minusStream$1883_init)) {
if ((var_$2428_changed) || (var_$2463_changed) || (var_minusStream$1883_changed)) {
var_$2427_unknown = (var_$2428_unknown && var_$2463_unknown && var_minusStream$1883_unknown)
if ((var_$2427_unknown)) {
var_$2427_error = UnknownEventError(null)
} else {
var_$2427_error = null
try {
var_$2427_value = (if ((if((var_$2428_error == null)) {var_$2428_value} else {throw var_$2428_error})) (if((var_$2463_error == null)) {var_$2463_value} else {throw var_$2463_error}) else (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$2427_error = var_err
}
}
}
var_$2427_init = true
var_$2427_changed = true
}
}
var_$2425_changed = false
if ((var_$1900_init && var_$2427_init)) {
if ((var_$1900_changed) || (var_$2427_changed)) {
var_$2425_unknown = (var_$1900_unknown && var_$2427_unknown)
if ((var_$2425_unknown)) {
var_$2425_error = UnknownEventError(null)
} else {
var_$2425_error = null
try {
var_$2425_value = ((if((var_$1900_error == null)) {var_$1900_value} else {throw var_$1900_error}) + (if((var_$2427_error == null)) {var_$2427_value} else {throw var_$2427_error}))
} catch {
case var_err : Throwable => {
var_$2425_error = var_err
}
}
}
var_$2425_init = true
var_$2425_changed = true
}
}
var_$2467_changed = false
if ((var_$2086_init && var_$2429_init)) {
if ((var_$2086_changed) || (var_$2429_changed)) {
var_$2467_unknown = (var_$2086_unknown && var_$2429_unknown)
if ((var_$2467_unknown)) {
var_$2467_error = UnknownEventError(null)
} else {
var_$2467_error = null
try {
var_$2467_value = (if((var_$2086_error == null)) {var_$2086_value} else {throw var_$2086_error})((if((var_$2429_error == null)) {var_$2429_value} else {throw var_$2429_error}))
} catch {
case var_err : Throwable => {
var_$2467_error = var_err
}
}
}
var_$2467_init = true
var_$2467_changed = true
}
}
var_$2424_changed = false
if ((var_$2425_init && var_$2467_init)) {
if ((var_$2425_changed) || (var_$2467_changed)) {
var_$2424_unknown = (var_$2425_unknown && var_$2467_unknown)
if ((var_$2424_unknown)) {
var_$2424_error = UnknownEventError(null)
} else {
var_$2424_error = null
try {
var_$2424_value = ((if((var_$2425_error == null)) {var_$2425_value} else {throw var_$2425_error}) + (if((var_$2467_error == null)) {var_$2467_value} else {throw var_$2467_error}))
} catch {
case var_err : Throwable => {
var_$2424_error = var_err
}
}
}
var_$2424_init = true
var_$2424_changed = true
}
}
var_$2423_changed = false
if ((var_$2424_init && var_minusStream$1883_init)) {
if ((var_$2424_changed) || (var_minusStream$1883_changed)) {
var_$2423_unknown = (var_$2424_unknown && var_minusStream$1883_unknown)
if ((var_$2423_unknown)) {
var_$2423_error = UnknownEventError(null)
} else {
var_$2423_error = null
try {
var_$2423_value = ((if((var_$2424_error == null)) {var_$2424_value} else {throw var_$2424_error}) + (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$2423_error = var_err
}
}
}
var_$2423_init = true
var_$2423_changed = true
}
}
var_$2422_changed = false
if ((var_$2423_init && var_$1977_init)) {
if ((var_$2423_changed) || (var_$1977_changed)) {
var_$2422_unknown = (var_$2423_unknown && var_$1977_unknown)
if ((var_$2422_unknown)) {
var_$2422_error = UnknownEventError(null)
} else {
var_$2422_error = null
try {
var_$2422_value = ((if((var_$2423_error == null)) {var_$2423_value} else {throw var_$2423_error}) - (if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}))
} catch {
case var_err : Throwable => {
var_$2422_error = var_err
}
}
}
var_$2422_init = true
var_$2422_changed = true
}
}
var_$2421_changed = false
if ((var_$2422_init && var_$2184_init)) {
if ((var_$2422_changed) || (var_$2184_changed)) {
var_$2421_unknown = (var_$2422_unknown && var_$2184_unknown)
if ((var_$2421_unknown)) {
var_$2421_error = UnknownEventError(null)
} else {
var_$2421_error = null
try {
var_$2421_value = ((if((var_$2422_error == null)) {var_$2422_value} else {throw var_$2422_error}) + (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2421_error = var_err
}
}
}
var_$2421_init = true
var_$2421_ts = currTs
var_$2421_changed = true
}
}
var_firstEvent$2535_changed = false
if ((var_isFirst$1949_init && var_event_changed)) {
if ((var_isFirst$1949_value) || (!(var_isFirst$1949_error == null)) || (var_isFirst$1949_unknown)) {
if ((!(var_isFirst$1949_error == null))) {
var_firstEvent$2535_error = var_isFirst$1949_error
} else {
var_firstEvent$2535_error = var_event_error
}
var_firstEvent$2535_changed = true
var_firstEvent$2535_ts = var_event_ts
var_firstEvent$2535_unknown = (var_event_unknown || !(var_isFirst$1949_error == null))
}
}
var_$2534_changed = false
if ((var_firstEvent$2535_changed)) {
var_$2534_value = var_firstEvent$2535_ts
var_$2534_unknown = var_firstEvent$2535_unknown
if ((var_$2534_unknown)) {
var_$2534_error = var_firstEvent$2535_error
} else {
var_$2534_error = null
}
var_$2534_changed = true
}
if ((!(currTs == 0L))) {
var_defaultTime$2533_changed = false
}
if ((var_$2534_changed)) {
var_defaultTime$2533_value = var_$2534_value
var_defaultTime$2533_init = true
var_defaultTime$2533_error = var_$2534_error
var_defaultTime$2533_changed = true
var_defaultTime$2533_unknown = var_$2534_unknown
}
var_$2530_changed = false
if ((var_defaultTime$2154_init && var_defaultTime$2533_init)) {
if ((var_defaultTime$2154_changed) || (var_defaultTime$2533_changed)) {
var_$2530_unknown = (var_defaultTime$2154_unknown && var_defaultTime$2533_unknown)
if ((var_$2530_unknown)) {
var_$2530_error = UnknownEventError(null)
} else {
var_$2530_error = null
try {
var_$2530_value = ((if((var_defaultTime$2154_error == null)) {var_defaultTime$2154_value} else {throw var_defaultTime$2154_error}) == (if((var_defaultTime$2533_error == null)) {var_defaultTime$2533_value} else {throw var_defaultTime$2533_error}))
} catch {
case var_err : Throwable => {
var_$2530_error = var_err
}
}
}
var_$2530_init = true
var_$2530_changed = true
}
}
var_$2538_changed = false
if ((var_$2214_init && var_$1977_init)) {
if ((var_$2214_changed) || (var_$1977_changed)) {
var_$2538_unknown = (var_$2214_unknown && var_$1977_unknown)
if ((var_$2538_unknown)) {
var_$2538_error = UnknownEventError(null)
} else {
var_$2538_error = null
try {
var_$2538_value = ((if((var_$2214_error == null)) {var_$2214_value} else {throw var_$2214_error}) - (if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}))
} catch {
case var_err : Throwable => {
var_$2538_error = var_err
}
}
}
var_$2538_init = true
var_$2538_changed = true
}
}
var_$2537_changed = false
if ((var_$2538_init && var_$2184_init)) {
if ((var_$2538_changed) || (var_$2184_changed)) {
var_$2537_unknown = (var_$2538_unknown && var_$2184_unknown)
if ((var_$2537_unknown)) {
var_$2537_error = UnknownEventError(null)
} else {
var_$2537_error = null
try {
var_$2537_value = ((if((var_$2538_error == null)) {var_$2538_value} else {throw var_$2538_error}) + (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2537_error = var_err
}
}
}
var_$2537_init = true
var_$2537_changed = true
}
}
var_$2548_changed = false
if ((var_$2549_init && var_$1977_init)) {
if ((var_$2549_changed) || (var_$1977_changed)) {
var_$2548_unknown = (var_$2549_unknown && var_$1977_unknown)
if ((var_$2548_unknown)) {
var_$2548_error = UnknownEventError(null)
} else {
var_$2548_error = null
try {
var_$2548_value = ((if((var_$2549_error == null)) {var_$2549_value} else {throw var_$2549_error}) - (if((var_$1977_error == null)) {var_$1977_value} else {throw var_$1977_error}))
} catch {
case var_err : Throwable => {
var_$2548_error = var_err
}
}
}
var_$2548_init = true
var_$2548_changed = true
}
}
var_$2547_changed = false
if ((var_$2548_init && var_$2184_init)) {
if ((var_$2548_changed) || (var_$2184_changed)) {
var_$2547_unknown = (var_$2548_unknown && var_$2184_unknown)
if ((var_$2547_unknown)) {
var_$2547_error = UnknownEventError(null)
} else {
var_$2547_error = null
try {
var_$2547_value = ((if((var_$2548_error == null)) {var_$2548_value} else {throw var_$2548_error}) + (if((var_$2184_error == null)) {var_$2184_value} else {throw var_$2184_error}))
} catch {
case var_err : Throwable => {
var_$2547_error = var_err
}
}
}
var_$2547_init = true
var_$2547_changed = true
}
}
var_delayPeriod$2529_changed = false
if ((var_$2530_init && var_$2537_init && var_$2547_init)) {
if ((var_$2530_changed) || (var_$2537_changed) || (var_$2547_changed)) {
var_delayPeriod$2529_unknown = (var_$2530_unknown && var_$2537_unknown && var_$2547_unknown)
if ((var_delayPeriod$2529_unknown)) {
var_delayPeriod$2529_error = UnknownEventError(null)
} else {
var_delayPeriod$2529_error = null
try {
var_delayPeriod$2529_value = (if ((if((var_$2530_error == null)) {var_$2530_value} else {throw var_$2530_error})) (if((var_$2537_error == null)) {var_$2537_value} else {throw var_$2537_error}) else (if((var_$2547_error == null)) {var_$2547_value} else {throw var_$2547_error}))
} catch {
case var_err : Throwable => {
var_delayPeriod$2529_error = var_err
}
}
}
var_delayPeriod$2529_init = true
var_delayPeriod$2529_changed = true
}
}
if ((!(currTs == 0L))) {
var_delayPeriod$2527_changed = false
}
if ((var_$2499_changed)) {
var_delayPeriod$2527_value = var_$2499_value
var_delayPeriod$2527_init = true
var_delayPeriod$2527_error = var_$2499_error
var_delayPeriod$2527_changed = true
var_delayPeriod$2527_unknown = var_$2499_unknown
}
var_$2524_changed = false
if ((var_delayPeriod$2525_init && var_delayPeriod$2527_init && var_delayPeriod$2529_init)) {
if ((var_delayPeriod$2525_changed) || (var_delayPeriod$2527_changed) || (var_delayPeriod$2529_changed)) {
var_$2524_unknown = (var_delayPeriod$2525_unknown && var_delayPeriod$2527_unknown && var_delayPeriod$2529_unknown)
if ((var_$2524_unknown)) {
var_$2524_error = UnknownEventError(null)
} else {
var_$2524_error = null
try {
var_$2524_value = (if ((if((var_delayPeriod$2525_error == null)) {var_delayPeriod$2525_value} else {throw var_delayPeriod$2525_error})) (if((var_delayPeriod$2527_error == null)) {var_delayPeriod$2527_value} else {throw var_delayPeriod$2527_error}) else (if((var_delayPeriod$2529_error == null)) {var_delayPeriod$2529_value} else {throw var_delayPeriod$2529_error}))
} catch {
case var_err : Throwable => {
var_$2524_error = var_err
}
}
}
var_$2524_init = true
var_$2524_ts = currTs
var_$2524_changed = true
}
}
var_$2563_changed = false
if ((var_$2524_changed)) {
var_$2563_value = var_$2524_ts
var_$2563_init = true
var_$2563_unknown = var_$2524_unknown
if ((var_$2563_unknown)) {
var_$2563_error = var_$2524_error
} else {
var_$2563_error = null
}
var_$2563_changed = true
}
var_$2560_changed = false
if ((var_$2542_init && var_$2563_init)) {
if ((var_$2542_changed) || (var_$2563_changed)) {
var_$2560_unknown = (var_$2542_unknown && var_$2563_unknown)
if ((var_$2560_unknown)) {
var_$2560_error = UnknownEventError(null)
} else {
var_$2560_error = null
try {
var_$2560_value = ((if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}) - (if((var_$2563_error == null)) {var_$2563_value} else {throw var_$2563_error}))
} catch {
case var_err : Throwable => {
var_$2560_error = var_err
}
}
}
var_$2560_init = true
var_$2560_changed = true
}
}
var_$2420_changed = false
if ((var_$2421_init && var_minusStream$1883_init)) {
if ((var_$2421_changed) || (var_minusStream$1883_changed)) {
var_$2420_unknown = (var_$2421_unknown && var_minusStream$1883_unknown)
if ((var_$2420_unknown)) {
var_$2420_error = UnknownEventError(null)
} else {
var_$2420_error = null
try {
var_$2420_value = ((if((var_$2421_error == null)) {var_$2421_value} else {throw var_$2421_error}) > (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$2420_error = var_err
}
}
}
var_$2420_init = true
var_$2420_changed = true
}
}
var_$2512_changed = false
if ((var_$2421_changed)) {
var_$2512_value = var_$2421_ts
var_$2512_init = true
var_$2512_unknown = var_$2421_unknown
if ((var_$2512_unknown)) {
var_$2512_error = var_$2421_error
} else {
var_$2512_error = null
}
var_$2512_changed = true
}
var_$2509_changed = false
if ((var_$2542_init && var_$2512_init)) {
if ((var_$2542_changed) || (var_$2512_changed)) {
var_$2509_unknown = (var_$2542_unknown && var_$2512_unknown)
if ((var_$2509_unknown)) {
var_$2509_error = UnknownEventError(null)
} else {
var_$2509_error = null
try {
var_$2509_value = ((if((var_$2542_error == null)) {var_$2542_value} else {throw var_$2542_error}) - (if((var_$2512_error == null)) {var_$2512_value} else {throw var_$2512_error}))
} catch {
case var_err : Throwable => {
var_$2509_error = var_err
}
}
}
var_$2509_init = true
var_$2509_changed = true
}
}
var_$2327_changed = false
if ((var_$2420_init && var_$2421_init && var_$2509_init)) {
if ((var_$2420_changed) || (var_$2421_changed) || (var_$2509_changed)) {
var_$2327_unknown = (var_$2420_unknown && var_$2421_unknown && var_$2509_unknown)
if ((var_$2327_unknown)) {
var_$2327_error = UnknownEventError(null)
} else {
var_$2327_error = null
try {
var_$2327_value = (if ((if((var_$2420_error == null)) {var_$2420_value} else {throw var_$2420_error})) (if((var_$2421_error == null)) {var_$2421_value} else {throw var_$2421_error}) else (if((var_$2509_error == null)) {var_$2509_value} else {throw var_$2509_error}))
} catch {
case var_err : Throwable => {
var_$2327_error = var_err
}
}
}
var_$2327_changed = true
}
}
var_$1642_changed = false
if ((var_$1643_init && var_$2284_init)) {
if ((var_$1643_changed) || (var_$2284_changed)) {
var_$1642_unknown = (var_$1643_unknown && var_$2284_unknown)
if ((var_$1642_unknown)) {
var_$1642_error = UnknownEventError(null)
} else {
var_$1642_error = null
try {
var_$1642_value = ((if((var_$1643_error == null)) {var_$1643_value} else {throw var_$1643_error}) < (if((var_$2284_error == null)) {var_$2284_value} else {throw var_$2284_error}))
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
var_isFinalFalseReset$1641_changed = false
if ((var_$1642_init && var_$2571_init && var_isFinalFalseReset$2294_init)) {
if ((var_$1642_changed) || (var_$2571_changed) || (var_isFinalFalseReset$2294_changed)) {
var_isFinalFalseReset$1641_unknown = (var_$1642_unknown && var_$2571_unknown && var_isFinalFalseReset$2294_unknown)
if ((var_isFinalFalseReset$1641_unknown)) {
var_isFinalFalseReset$1641_error = UnknownEventError(null)
} else {
var_isFinalFalseReset$1641_error = null
try {
var_isFinalFalseReset$1641_value = (if ((if((var_$1642_error == null)) {var_$1642_value} else {throw var_$1642_error})) (if((var_$2571_error == null)) {var_$2571_value} else {throw var_$2571_error}) else (if((var_isFinalFalseReset$2294_error == null)) {var_isFinalFalseReset$2294_value} else {throw var_isFinalFalseReset$2294_error}))
} catch {
case var_err : Throwable => {
var_isFinalFalseReset$1641_error = var_err
}
}
}
var_isFinalFalseReset$1641_changed = true
}
}
var_$1640_changed = false
if ((var_isFinalFalseReset$1641_changed) || (var_isFinalFalseReset$2294_changed)) {
var_$1640_lastValue = var_$1640_value
var_$1640_lastInit = var_$1640_init
var_$1640_lastError = var_$1640_error
var_$1640_init = true
var_$1640_ts = currTs
var_$1640_changed = true
var_$1640_unknown = (var_isFinalFalseReset$1641_unknown && var_isFinalFalseReset$2294_unknown)
if ((var_isFinalFalseReset$1641_changed)) {
var_$1640_value = var_isFinalFalseReset$1641_value
var_$1640_error = var_isFinalFalseReset$1641_error
} else {
if ((var_isFinalFalseReset$2294_changed)) {
var_$1640_value = var_isFinalFalseReset$2294_value
var_$1640_error = var_isFinalFalseReset$2294_error
}
}
}
var_stillFulfillableReset$1639_changed = false
if ((var_$1640_init && var_$2128_init && var_res$1649_init)) {
if ((var_$1640_changed) || (var_$2128_changed) || (var_res$1649_changed)) {
var_stillFulfillableReset$1639_lastValue = var_stillFulfillableReset$1639_value
var_stillFulfillableReset$1639_lastInit = var_stillFulfillableReset$1639_init
var_stillFulfillableReset$1639_lastError = var_stillFulfillableReset$1639_error
var_stillFulfillableReset$1639_unknown = (var_$1640_unknown && var_$2128_unknown && var_res$1649_unknown)
if ((var_stillFulfillableReset$1639_unknown)) {
var_stillFulfillableReset$1639_error = UnknownEventError(null)
} else {
var_stillFulfillableReset$1639_error = null
try {
var_stillFulfillableReset$1639_value = (if ((if((var_$1640_error == null)) {var_$1640_value} else {throw var_$1640_error})) (if((var_$2128_error == null)) {var_$2128_value} else {throw var_$2128_error}) else (if((var_res$1649_error == null)) {var_res$1649_value} else {throw var_res$1649_error}))
} catch {
case var_err : Throwable => {
var_stillFulfillableReset$1639_error = var_err
}
}
}
var_stillFulfillableReset$1639_init = true
var_stillFulfillableReset$1639_ts = currTs
var_stillFulfillableReset$1639_changed = true
}
}
var_value$1638_changed = false
if ((var_stillFulfillableReset$1639_init)) {
if ((var_stillFulfillableReset$1639_changed)) {
var_value$1638_unknown = (var_stillFulfillableReset$1639_unknown)
if ((var_value$1638_unknown)) {
var_value$1638_error = UnknownEventError(null)
} else {
var_value$1638_error = null
try {
var_value$1638_value = var_$2244.apply((if((var_stillFulfillableReset$1639_error == null)) {var_stillFulfillableReset$1639_value} else {throw var_stillFulfillableReset$1639_error}))
} catch {
case var_err : Throwable => {
var_value$1638_error = var_err
}
}
}
var_value$1638_init = true
var_value$1638_changed = true
}
}
var_$2523_changed = false
if ((var_$2524_init && var_minusStream$1883_init)) {
if ((var_$2524_changed) || (var_minusStream$1883_changed)) {
var_$2523_unknown = (var_$2524_unknown && var_minusStream$1883_unknown)
if ((var_$2523_unknown)) {
var_$2523_error = UnknownEventError(null)
} else {
var_$2523_error = null
try {
var_$2523_value = ((if((var_$2524_error == null)) {var_$2524_value} else {throw var_$2524_error}) > (if((var_minusStream$1883_error == null)) {var_minusStream$1883_value} else {throw var_minusStream$1883_error}))
} catch {
case var_err : Throwable => {
var_$2523_error = var_err
}
}
}
var_$2523_init = true
var_$2523_changed = true
}
}
var_$2351_changed = false
if ((var_$2523_init && var_$2524_init && var_$2560_init)) {
if ((var_$2523_changed) || (var_$2524_changed) || (var_$2560_changed)) {
var_$2351_unknown = (var_$2523_unknown && var_$2524_unknown && var_$2560_unknown)
if ((var_$2351_unknown)) {
var_$2351_error = UnknownEventError(null)
} else {
var_$2351_error = null
try {
var_$2351_value = (if ((if((var_$2523_error == null)) {var_$2523_value} else {throw var_$2523_error})) (if((var_$2524_error == null)) {var_$2524_value} else {throw var_$2524_error}) else (if((var_$2560_error == null)) {var_$2560_value} else {throw var_$2560_error}))
} catch {
case var_err : Throwable => {
var_$2351_error = var_err
}
}
}
var_$2351_changed = true
}
}
var_final$2299_changed = false
if ((var_stillFulfillableReset$1639_init)) {
if ((var_stillFulfillableReset$1639_changed)) {
var_final$2299_unknown = (var_stillFulfillableReset$1639_unknown)
if ((var_final$2299_unknown)) {
var_final$2299_error = UnknownEventError(null)
} else {
var_final$2299_error = null
try {
var_final$2299_value = var_$2309.apply((if((var_stillFulfillableReset$1639_error == null)) {var_stillFulfillableReset$1639_value} else {throw var_stillFulfillableReset$1639_error}))
} catch {
case var_err : Throwable => {
var_final$2299_error = var_err
}
}
}
var_final$2299_init = true
var_final$2299_changed = true
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

if (((var_safeDelay$1895_nextTs > lastProcessedTs) && (currTs > var_safeDelay$1895_nextTs))) {
currTs = var_safeDelay$1895_nextTs
}
if (((var_safeDelay$2192_nextTs > lastProcessedTs) && (currTs > var_safeDelay$2192_nextTs))) {
currTs = var_safeDelay$2192_nextTs
}

        if (currTs == newInputTs) {
          doProcessing = false
        } else {

chunk1()
chunk2()


if ((var_event_unknown) || (!(var_$2327_error == null)) || (var_$2327_changed && (0L >= var_$2327_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$2327_changed)) {
if ((var_safeDelay$1895_changed) || (var_event_changed)) {
var_safeDelay$1895_nextTs = (currTs + var_$2327_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$1895_nextTs = -1L
}
}
}
if ((var_event_unknown) || (!(var_$2351_error == null)) || (var_$2351_changed && (0L >= var_$2351_value))) {
{System.err.println(s"FATAL: Due to previous errors a delay could not be evaluated."); System.exit(1);}
} else {
if ((var_$2351_changed)) {
if ((var_safeDelay$2192_changed) || (var_event_changed)) {
var_safeDelay$2192_nextTs = (currTs + var_$2351_value)
}
} else {
if ((var_event_changed)) {
var_safeDelay$2192_nextTs = -1L
}
}
}
if ((var_value$1638_changed && var_value$1638_init)) {
out_value.apply(var_value$1638_value, currTs, "value", var_value$1638_error)
}
if ((var_final$2299_changed && var_final$2299_init)) {
out_final.apply(var_final$2299_value, currTs, "final", var_final$2299_error)
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
