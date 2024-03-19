// vars/scm_code.groovy
void call(Map scm = [:]) {
    // TODO simplify with elvis operator
    if (scm.credentials == null) {
        scm.credentials = 'terrafrom-config'
        echo scm.credentials
    } else {
        echo scm.credentials
    }

    git branch: "${scm.branch}",
    changelog: false,
    credentialsId: "${scm.credentials}",
    url: "${scm.repoURL}"
}
