@file:Suppress("unused")

package net.axay.kspigot.data

import net.axay.kspigot.annotations.NMS_General
import net.minecraft.nbt.CompoundTag
import org.bukkit.entity.Entity
import org.bukkit.inventory.ItemStack

@NMS_General
@Deprecated("Does not work.")
var Entity.nbtData: CompoundTag
    get() {
        val nbtTagCompound = CompoundTag()
        return nbtTagCompound
    }
    set(value) {

    }

@NMS_General
@Deprecated("Does not work.")
val ItemStack.nbtData: CompoundTag
    get() {
        return CompoundTag()
    }
