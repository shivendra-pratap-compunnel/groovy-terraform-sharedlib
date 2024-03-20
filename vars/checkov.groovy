

void call() {
        echo 'Starting checkov scan...'
        sh '''
        /var/lib/jenkins/.local/bin/checkov -f tfplan.json --deep-analysis --repo-root-for-plan-enrichment .
        '''
        echo 'Finished checkov scan.'
}

