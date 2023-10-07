package com.tcs.simplemvvmdagger.lsp

interface CommonAccess {
    // common access
    fun readAccess()
}

interface WriteAccess : CommonAccess {
    fun writeAccess()
}

class NormalUser : CommonAccess {
    override fun readAccess() {
        TODO("Not yet implemented")
        println("Read the access")
    }
}

class AdminUser : WriteAccess {
    override fun writeAccess() {
        TODO("Not yet implemented")
        println("Wirte the access")
    }

    override fun readAccess() {
        TODO("Not yet implemented")
        println("Read the access")
    }
}

class UserAccessManagement {

    fun accessManagement() {
        // enable the normal user access
        val normalUser = NormalUser()
        normalUser.readAccess()

        // enable the admin user access
        val adminUser = AdminUser()
        adminUser.writeAccess()
        adminUser.readAccess()
    }
}