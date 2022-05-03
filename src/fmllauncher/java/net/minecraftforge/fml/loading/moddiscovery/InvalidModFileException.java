/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.minecraftforge.fml.loading.moddiscovery;

import net.minecraftforge.forgespi.language.IModFileInfo;

public class InvalidModFileException extends RuntimeException
{
    private final IModFileInfo modFileInfo;

    public InvalidModFileException(String message, IModFileInfo modFileInfo)
    {
        super(String.format("%s (%s)", message, ((ModFileInfo)modFileInfo).getFile().getFileName()));
        this.modFileInfo = modFileInfo;
    }
}
