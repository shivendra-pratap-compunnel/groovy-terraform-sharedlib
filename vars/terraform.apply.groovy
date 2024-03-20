void terraform.plan() {
    sh '''
        echo "----- Apply validated plan on the infrastructure -----"
        terraform apply -no-color tfplan
    '''
}