class Dm844PluginGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.4 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Dm844 Plugin Plugin" // Headline display name of the plugin
    def author = "Jacob Aae Mikkelsen"
    def authorEmail = "jamik@imada.sdu.dk"
    def description = '''\
Mostly a demo of creating your own Grails plugin for use in a course.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/JacobAae/dm844-plugin"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
//    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "IMADA, SDU", url: "http://sdu.dk/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "github", url: "https://github.com/JacobAae/dm844-plugin/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/JacobAae/dm844-plugin" ]

}
