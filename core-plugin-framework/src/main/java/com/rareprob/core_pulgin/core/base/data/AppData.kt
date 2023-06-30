package com.rareprob.core_pulgin.core.base.data

open class AppData(open var viewType: Int = 0) {
    var sortOrder = 0
    var data: Any = Any()
}