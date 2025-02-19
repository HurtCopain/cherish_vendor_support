/*
 * Copyright (C) 2021 AOSP-Krypton Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cherish.support.preferences

import android.content.Context
import android.util.AttributeSet

import androidx.core.content.res.TypedArrayUtils
import androidx.preference.R

import com.android.settingslib.widget.MainSwitchPreference

class GlobalSettingMainSwitchPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = TypedArrayUtils.getAttr(context,
        R.attr.switchPreferenceStyle,
        android.R.attr.switchPreferenceStyle),
    defStyleRes: Int = 0,
): MainSwitchPreference(context, attrs, defStyleAttr, defStyleRes) {
    init {
        setPreferenceDataStore(GlobalSettingsStore(context.contentResolver))
    }
}
