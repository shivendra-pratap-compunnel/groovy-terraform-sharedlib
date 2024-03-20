

void checkov() {
        echo 'Starting checkov scan...'
        sh '''
        checkov -f tfplan.json --deep-analysis --repo-root-for-plan-enrichment .
        '''
        echo 'Finished checkov scan.'
}