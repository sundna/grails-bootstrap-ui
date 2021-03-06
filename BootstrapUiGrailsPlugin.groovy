class BootstrapUiGrailsPlugin {
    // the plugin version
    def version = "1.0.RC4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Marc Palmer"
    def authorEmail = "marc@grailsrocks.com"
    def title = "Bootstrap UI"
    def description = '''\
Twitter Bootstrap based UI Set for plugin platform
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/bootstrap-ui"

    def license = "APACHE"

    def organization = [name: "Grailsrocks", url: "http://grailsrocks.com/"]

    def developers = [
            [name: "Marc Palmer", email: "marc@grailsrocks.com"]
    ]

    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPBOOTSTRAPUI" ]

    def scm = [url: "https://github.com/Grailsrocks/grails-bootstrap-ui"]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithConfig = { config ->
        platformUi {
            ui.Bootstrap.actions.cssClass = 'form-actions'
            ui.Bootstrap.button.cssClass = 'btn'
            ui.Bootstrap.tab.cssClass = 'tab-pane'
            ui.Bootstrap.tabs.cssClass = 'nav nav-tabs'
            ui.Bootstrap.field.cssClass = 'input'
            ui.Bootstrap.input.cssClass = 'input-xlarge'
            ui.Bootstrap.invalid.cssClass = 'invalid'
            ui.Bootstrap.table.cssClass = 'table table-striped'
            ui.Bootstrap.tr.cssClass = ''
            ui.Bootstrap.trOdd.cssClass = ''
            ui.Bootstrap.trEven.cssClass = ''
            ui.Bootstrap.carousel.cssClass = 'carousel slide'
            ui.Bootstrap.slide.cssClass = 'item'
            ui.Bootstrap.form.cssClass = 'form-horizontal'
            ui.Bootstrap.primaryNavigation.cssClass = 'nav'
            ui.Bootstrap.secondaryNavigation.cssClass = 'nav nav-pills'
            ui.Bootstrap.navigation.cssClass = 'nav'
        }
    }
    
    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
