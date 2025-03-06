package me.CheesecakeSlice.naturaldelights;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Naturaldelights implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("natural-delights");

    @Override
    public void onInitialize() {
        LOGGER.info("Natural Delight's has initialized...");
    }
}
