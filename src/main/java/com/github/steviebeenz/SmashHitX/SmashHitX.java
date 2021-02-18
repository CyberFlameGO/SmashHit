package com.github.steviebeenz.SmashHitX;

import dev.simplix.core.common.aop.ScanComponents;
import dev.simplix.core.common.aop.SimplixApplication;
@SimplixApplication(name = "SmashHitX",
        authors = "Steviebeenz",
        //dependencies = "simplixstorage",
        workingDirectory = "plugins/SmashHitX")

@ScanComponents("com.github.steviebeenz.SmashHitX") // Scan common base package
public class SmashHitX {
}
