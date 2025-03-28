plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.1"

fleetPlugin {
    id = "ignaigna.tokyo.night.fleet"

    metadata {
        readableName = "Tokyo Night (Fleet)"
        description = "A clean, dark Fleet theme that celebrates the lights of Downtown Tokyo at night."
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
