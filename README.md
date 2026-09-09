# maven-pm-bearer-probe

Ephemeral probe for Endor Labs PackageManager Maven `token_auth` (Bearer) wiring.

- Tenant namespace path: `endor-solutions-tgowan.gh_personal`
- Upstream via Artifactory remote `tgowan-test` → Package Firewall for `endor-solutions-tgowan`
- No secrets in this repo; registry auth is tenant PackageManager config

Do not treat scan success/failure here as product SLA — this validates scan-time credential emission.
